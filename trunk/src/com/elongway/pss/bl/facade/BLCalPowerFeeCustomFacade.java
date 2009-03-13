package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.elongway.pss.bl.action.domain.BLLwTownPriceSummaryProratAppendAction;
import com.elongway.pss.dto.custom.SalePriceDto;
import com.elongway.pss.dto.custom.TownSataDto;
import com.elongway.pss.dto.domain.LineLossDto;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryAppendDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;
import com.elongway.pss.dto.domain.TransforDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.common.util.DataUtils;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * 计算电费 Action <br>
 * 
 * @author 乔有良
 * @version 1.0 2008-10-15
 */
public class BLCalPowerFeeCustomFacade {

	/**
	 * 直供乡电费计算公式
	 * 
	 * @param lwTownIndicatorDto
	 * @return
	 * @throws Exception
	 */
	public LwTownPriceSummaryDto calTownFee(
			LwTownIndicatorDto lwTownIndicatorDto) throws Exception {
		// 电费合计 = 总电费 + 力率电费 = 总电费×（1+调整值）

		StringBuffer buffer = new StringBuffer();
		BLLwPowerUserFacade bLwPowerUserFacade = new BLLwPowerUserFacade();
		String voltCode = null;
		String lineCode = null;
		LwPowerUserDto lwPowerUserDto = null;
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		// 抄见电量
		double readQuantity = 0;
		// 换表电量
		double chgQuantity = 0;
		// 异常电量
		double exceptionQuantity = 0;
		// 退补电量
		double compensateQuantity = 0;
		// 无功电量
		double idleQuantity = 0;
		// 总电量
		double sumQuantity = 0;
		// 电价
		SalePriceDto price = new SalePriceDto();

		String userCode = lwTownIndicatorDto.getUserNo();
		lwPowerUserDto = blLwPowerUserFacade.findByPrimaryKey(userCode);
		String userName = lwPowerUserDto.getUserName();
		String statMonth = lwTownIndicatorDto.getStatMonth();
		double rate = lwTownIndicatorDto.getRate();
		// 得到按户分摊比例
		LwProrateDto lwProrateDto = getProrate(userCode);
		if (lwProrateDto == null) {
			buffer.append(" 户号为：").append(userCode).append(",户名为：").append(
					userName).append(" 的用户没有配置比例分摊");
			throw new UserException(-6, -701, this.getClass().getName(), buffer
					.toString());
		}
		// 得到该用户的电压等级

		voltCode = lwPowerUserDto.getSaleVoltLevel();
		// 分摊电价
		price = getIndicatorPrice(voltCode);

		readQuantity = lwTownIndicatorDto.getReadQuantity();
		chgQuantity = lwTownIndicatorDto.getChgAmmeterQuantity();
		exceptionQuantity = lwTownIndicatorDto.getExcepQuantity();
		compensateQuantity = lwTownIndicatorDto.getCompensateQuantity();
		sumQuantity = readQuantity + chgQuantity 
				+ compensateQuantity;
		/**
		 * 
		 */

		// 得到调整值
		double adjustValue = 0;
		// 调用电费计算公式
		LwTownPriceSummaryDto lwTownPriceSummaryDto = PowerFeeCal
				.townSumPowerFeeFormular(sumQuantity, exceptionQuantity, lwProrateDto,
						price, 0, adjustValue, lineCode, userCode, statMonth);

		return lwTownPriceSummaryDto;
	}

	/**
	 * 直供乡追加电费计算
	 * @param lwTownIndicatorAppendDto
	 * @return
	 * @throws Exception
	 */
	public LwTownPriceSummaryAppendDto calAppendTownFee(
			LwTownIndicatorAppendDto lwTownIndicatorAppendDto) throws Exception {
		
		StringBuffer buffer = new StringBuffer();
		String voltCode = null;
		String userName = null;
		String statMonth = null;
		LwPowerUserDto lwPowerUserDto = null;
		String userNo = null;
		LwTownIndicatorDto lwTownIndicatorDto = null;
		LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto = null;
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		// 追加计算电量
		double appendQuantity = 0;
		String appendMonth = null;

		// 电价
		SalePriceDto newPriceDto = new SalePriceDto();
		SalePriceDto oldPriceDto = new SalePriceDto();

		userNo = lwTownIndicatorAppendDto.getUserNo();
		lwPowerUserDto = blLwPowerUserFacade.findByPrimaryKey(userNo);
		userName = lwPowerUserDto.getUserName();
		statMonth = lwTownIndicatorAppendDto.getStatMonth();
		
		// 得到按户分摊比例
		LwProrateDto lwProrateDto = getProrate(userNo);
		if (lwProrateDto == null) {
			buffer.append(" 户号为：").append(userNo).append(",户名为：").append(
					userName).append(" 的用户没有配置比例分摊");
			throw new UserException(-6, -701, this.getClass().getName(), buffer
					.toString());
		}
		// 得到该用户的电压等级

		voltCode = lwPowerUserDto.getSaleVoltLevel();
		// 历史电价
		newPriceDto = getIndicatorPrice(voltCode);
		lwTownIndicatorDto = new BLLwTownIndicatorFacade().findByPrimaryKey(
				userNo, statMonth);
		// 新电价
		newPriceDto = PowerFeeCal.getHistoryPrice(lwTownIndicatorDto);

		appendMonth = lwTownIndicatorAppendDto.getAppendDate();
		appendQuantity = lwTownIndicatorAppendDto.getReadQuantity();

		// 调用电费计算公式
		lwTownPriceSummaryAppendDto = PowerFeeCal.townFeeAppendFormular(
				appendQuantity, lwProrateDto, oldPriceDto, newPriceDto, userNo,
				statMonth, appendMonth);

		return lwTownPriceSummaryAppendDto;
	}

	/**
	 * 得到分摊金额
	 * 
	 * @return
	 * @throws Exception
	 */
	public LwProrateDto getProrate(String userNo) throws Exception {
		BLLwProrateFacade bLwProrateFacade = new BLLwProrateFacade();
		// 一户对应一个比例分摊
		LwProrateDto lwProrateDto = bLwProrateFacade.findByPrimaryKey(userNo);
		return lwProrateDto;
	}

	public Collection<LwSalePriceDto> getTownPrice(String saleLevelType)
			throws Exception {

		// -- 声明变量
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		BLLwSalePriceFacade bLwSalePriceFacade = new BLLwSalePriceFacade();
		StringBuffer buffer = new StringBuffer();

		// -- 在基础代码表中查找比例分摊
		Collection<LwDcodeDto> codeList = bLwDcodeFacade
				.findByConditions(" codetype = 'PowerClass' And (codecode <>'7' And codecode<>'8' And codecode <>'9' And codecode <>'10') ");

		// -- 组织比例分摊的电价条件
		String prorateCondition = this.getProrateCondition(codeList);

		// -- 组织该线路的电压值的条件
		String volitageCondition = PowerFeeCal
				.getSalePowerCondition(saleLevelType);

		// -- 汇总条件，组织成获得销售电价的查询条件
		buffer.append(" 1=1 ").append(volitageCondition).append(
				prorateCondition).append(" and pricecategory = '3'");

		// -- 查询电价
		Collection<LwSalePriceDto> collection = bLwSalePriceFacade
				.findByConditions(buffer.toString());

		return collection;
	}

	/**
	 * 得到指针表中的电价
	 * 
	 * @param saleLevelType
	 * @return
	 * @throws Exception
	 */
	public SalePriceDto getIndicatorPrice(String saleLevelType)
			throws Exception {

		SalePriceDto priceDto = new SalePriceDto();
		Collection salePriceList = this.getTownPrice(saleLevelType);
		double price = 0D;
		for (Iterator iterator = salePriceList.iterator(); iterator.hasNext();) {
			LwSalePriceDto o = (LwSalePriceDto) iterator.next();
			price = o.getPrice();
			if ("1".equals(o.getPowerClass())) {
				priceDto.setPeoplePrice(price);
			} else if ("2".equals(o.getPowerClass())) {
				priceDto.setNotPeople(price);
			} else if ("3".equals(o.getPowerClass())) {
				priceDto.setBusinessPrice(price);
			} else if ("4".equals(o.getPowerClass())) {
				priceDto.setIndustryPrice(o.getPrice());
			} else if ("5".equals(o.getPowerClass())) {
				priceDto.setProducePrice(o.getPrice());
			} else {
				priceDto.setFarmPrice(price);
			}
		}

		return priceDto;
	}

	/**
	 * 得到指针表中的电价
	 * 
	 * @param saleLevelType
	 * @return
	 * @throws Exception
	 */
	public void getIndicatorPrice(SalePriceDto salePrice,
			LwTownIndicatorDto lwTownIndicatorDto) throws Exception {
		lwTownIndicatorDto.setPeoplePrice(salePrice.getPeoplePrice());
		lwTownIndicatorDto.setNotPeoplePrice(salePrice.getNotPeople());
		lwTownIndicatorDto.setBusinessPrice(salePrice.getBusinessPrice());
		lwTownIndicatorDto.setIndustryPrice(salePrice.getIndustryPrice());
		lwTownIndicatorDto.setFarmPrice(salePrice.getFarmPrice());
		lwTownIndicatorDto.setProducePrice(salePrice.getProducePrice());
	}

	/**
	 * 组织取得电价分类的条件。
	 * 
	 * @param collection
	 * @return
	 */
	public String getProrateCondition(Collection<LwDcodeDto> collection) {
		StringBuffer buffer = new StringBuffer();
		// 将电费的值按照用电分类从表中取得。
		buffer.append(" and (");
		buffer.append(" 1=0 ");
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwDcodeDto lwDcodeDto = (LwDcodeDto) iterator.next();
			buffer.append(" or PowerClass = '")
					.append(lwDcodeDto.getCodeCode()).append("'");
		}
		buffer.append(")");
		return buffer.toString();
	}



	public LwTownPriceSummaryDto statTownFee(Collection collection,
			String statMonth, String townCode) {

		LwTownPriceSummaryDto lwTownPriceSummaryDto = new LwTownPriceSummaryDto();
		/** 农灌电量 */
		double farmUseQuantity = 0.0;
		// 农灌电费
		double farmUseFee = 0.0;

		// 生产电量
		double productQuantity = 0.0;
		// 生产电费
		double productFee = 0.0;

		// 居民电量
		double peopleUseQuantity = 0.0;
		// 居民电费
		double peopleUseFee = 0.0;

		// 非居民电量
		double notPeopleUseQuantity = 0.0;
		// 非居民电费
		double notPeopleUseFee = 0.0;

		// 非工业电量
		double industryQuantity = 0.0;
		// 非工业电费
		double industryFee = 0.0;

		// 商业电量
		double bizQuantity = 0.0;
		// 商业电费
		double bizFee = 0.0;

		double farmDianJin = 0.0;
		double farmSanXia = 0.0;
		double farmJiJin = 0.0;
		double farmKuQu = 0.0;

		double industryDianJin = 0.0;
		double industrySanXia = 0.0;
		double industryJiJin = 0.0;
		double industryKuQu = 0.0;

		double produceDianJin = 0.0;
		double produceSanXia = 0.0;
		double produceJiJin = 0.0;
		double produceKuQu = 0.0;

		double peopleDianJin = 0.0;
		double peopleSanXia = 0.0;
		double peopleJiJin = 0.0;
		double peopleKuQu = 0.0;

		double notPeopleDianJin = 0.0;
		double notPeopleSanXia = 0.0;
		double notPeopleJiJin = 0.0;
		double notPeopleKuQu = 0.0;

		double bizDianJin = 0.0;
		double bizSanXia = 0.0;
		double bizJiJin = 0.0;
		double bizKuQu = 0.0;

		// 总电量
		double sumPower = 0.0;
		// 总电费
		double sumPowerFee = 0.0;
		// 总电金
		double sumDianJin = 0.0;
		// 总三峡
		double sumSanXia = 0.0;
		// 总基金
		double sumJiJin = 0.0;
		// 总库区
		double sumKuQu = 0.0;

		// 总农灌
		double sumFarmFee = 0.0;
		// 总居民
		double sumPeopleFee = 0.0;
		// 总非居民
		double sumNotPeopleFee = 0.0;
		// 总农业生产
		double sumProduceFee = 0.0;
		// 总非普工业
		double sumIndustryFee = 0.0;
		// 总商业
		double sumBizFee = 0.0;
		// 总电费合计
		double sumFee = 0.0;

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwTownPriceSummaryDto dto = (LwTownPriceSummaryDto) iterator.next();
			// 农灌：将所用用户的电量、电费、四金求和。
			farmUseQuantity = farmUseQuantity + dto.getFarmQuantity();
			farmUseFee = farmUseFee + dto.getFarmFee();
			farmDianJin = farmDianJin + dto.getFarmDianJin();
			farmJiJin = farmJiJin + dto.getFarmJiJin();
			farmSanXia = farmSanXia + dto.getFarmSanXia();
			farmKuQu = farmKuQu + dto.getFarmKuQu();

			// 非普工业：将所用用户的电量、电费、四金求和。
			industryQuantity = industryQuantity + dto.getIndustryQuantity();
			industryFee = industryFee + dto.getIndustryFee();
			industryDianJin = industryDianJin + dto.getIndustryDianJin();
			industryJiJin = industryJiJin + dto.getIndustryJiJin();
			industrySanXia = industrySanXia + dto.getIndustrySanXia();
			industryKuQu = industryKuQu + dto.getIndustryKuQu();

			// 农业生产：将所用用户的电量、电费、四金求和。
			productQuantity = productQuantity + dto.getProduceQuantity();
			productFee = productFee + dto.getProduceFee();
			produceDianJin = produceDianJin + dto.getProduceDianJin();
			produceJiJin = produceJiJin + dto.getProduceJiJin();
			produceSanXia = produceSanXia + dto.getProduceSanXia();
			produceKuQu = produceKuQu + dto.getPeopleKuQu();

			// 商业：将所用用户的电量、电费、四金求和。
			bizQuantity = bizQuantity + dto.getBizQuantity();
			bizFee = bizFee + dto.getBizFee();
			bizDianJin = bizDianJin + dto.getBizDianJin();
			bizJiJin = bizJiJin + dto.getBizJiJin();
			bizSanXia = bizSanXia + dto.getBizSanXia();
			bizKuQu = bizKuQu + dto.getPeopleKuQu();

			// 居民：将所用用户的电量、电费、四金求和。
			peopleUseQuantity = peopleUseQuantity + dto.getPeopleQuantity();
			peopleUseFee = peopleUseFee + dto.getPeopleFee();
			peopleDianJin = peopleDianJin + dto.getPeopleDianJin();
			peopleJiJin = peopleJiJin + dto.getPeopleJiJin();
			peopleSanXia = peopleSanXia + dto.getPeopleFeeSanXia();
			peopleKuQu = peopleKuQu + dto.getPeopleKuQu();

			// 非居民：将所用用户的电量、电费、四金求和。
			notPeopleUseQuantity = notPeopleUseQuantity
					+ dto.getNotPeopleQuantity();
			notPeopleUseFee = notPeopleUseFee + dto.getNotPeopleFee();
			notPeopleDianJin = notPeopleDianJin + dto.getNotPeopleDianJin();
			notPeopleJiJin = notPeopleJiJin + dto.getNotPeopleJiJin();
			notPeopleSanXia = notPeopleSanXia + dto.getNotPeopleFeeSanXia();
			notPeopleKuQu = notPeopleKuQu + dto.getNotPeopleKuQu();

			// 电费维度的求和
			sumPower = sumPower + dto.getSumQuantity();
			sumPowerFee = sumPowerFee + dto.getElectricFee();
			sumDianJin = sumDianJin + dto.getSumDianJin();
			sumSanXia = sumSanXia = dto.getSumSanXia();
			sumJiJin = sumJiJin + dto.getSumJiJin();
			sumKuQu = sumKuQu + dto.getSumKuQu();

			// 比例分摊维度的求和
			sumFarmFee = sumFarmFee + dto.getSumFarmFee();
			sumIndustryFee = sumIndustryFee + dto.getSumIndustryFee();
			sumProduceFee = sumProduceFee + dto.getSumProduceFee();
			sumBizFee = sumBizFee + dto.getSumBizFee();
			sumPeopleFee = sumPeopleFee + dto.getSumPeopleFee();
			sumNotPeopleFee = sumNotPeopleFee + dto.getSumNotPeopleFee();

			// 总电费合计
			sumFee = sumFee + dto.getSumFee();
		}
		// 电费维度的赋值
		lwTownPriceSummaryDto.setElectricFee(sumPowerFee);
		lwTownPriceSummaryDto.setSumDianJin(sumDianJin);
		lwTownPriceSummaryDto.setSanXiaFee(sumSanXia);
		lwTownPriceSummaryDto.setSumJiJin(sumJiJin);
		lwTownPriceSummaryDto.setSumKuQu(sumKuQu);
		lwTownPriceSummaryDto.setSumQuantity(sumPower);
		// 比例分摊的赋值
		// -- 农灌
		lwTownPriceSummaryDto.setFarmDianJin(farmDianJin);
		lwTownPriceSummaryDto.setFarmFee(farmUseFee);
		lwTownPriceSummaryDto.setFarmJiJin(farmJiJin);
		lwTownPriceSummaryDto.setFarmKuQu(farmKuQu);
		lwTownPriceSummaryDto.setFarmQuantity(farmUseQuantity);
		lwTownPriceSummaryDto.setFarmSanXia(farmSanXia);
		lwTownPriceSummaryDto.setSumFarmFee(sumFarmFee);
		// -- 生产
		lwTownPriceSummaryDto.setProduceDianJin(produceDianJin);
		lwTownPriceSummaryDto.setProduceFee(productFee);
		lwTownPriceSummaryDto.setProduceJiJin(produceJiJin);
		lwTownPriceSummaryDto.setProduceKuQu(produceKuQu);
		lwTownPriceSummaryDto.setProduceQuantity(productQuantity);
		lwTownPriceSummaryDto.setProduceSanXia(produceSanXia);
		lwTownPriceSummaryDto.setSumProduceFee(sumProduceFee);
		// -- 居民
		lwTownPriceSummaryDto.setPeopleDianJin(peopleDianJin);
		lwTownPriceSummaryDto.setPeopleFee(peopleUseFee);
		lwTownPriceSummaryDto.setPeopleJiJin(peopleJiJin);
		lwTownPriceSummaryDto.setPeopleKuQu(peopleKuQu);
		lwTownPriceSummaryDto.setPeopleQuantity(peopleUseQuantity);
		lwTownPriceSummaryDto.setPeopleFeeSanXia(peopleSanXia);
		lwTownPriceSummaryDto.setSumPeopleFee(sumPeopleFee);
		// -- 非居民
		lwTownPriceSummaryDto.setNotPeopleDianJin(notPeopleDianJin);
		lwTownPriceSummaryDto.setNotPeopleFee(notPeopleUseFee);
		lwTownPriceSummaryDto.setNotPeopleJiJin(notPeopleJiJin);
		lwTownPriceSummaryDto.setNotPeopleKuQu(notPeopleKuQu);
		lwTownPriceSummaryDto.setNotPeopleQuantity(notPeopleUseQuantity);
		lwTownPriceSummaryDto.setNotPeopleFeeSanXia(notPeopleSanXia);
		lwTownPriceSummaryDto.setSumNotPeopleFee(sumNotPeopleFee);
		// -- 商业
		lwTownPriceSummaryDto.setBizDianJin(bizDianJin);
		lwTownPriceSummaryDto.setBizFee(bizFee);
		lwTownPriceSummaryDto.setBizJiJin(bizJiJin);
		lwTownPriceSummaryDto.setBizKuQu(bizKuQu);
		lwTownPriceSummaryDto.setBizQuantity(bizQuantity);
		lwTownPriceSummaryDto.setBizSanXia(bizSanXia);
		lwTownPriceSummaryDto.setSumBizFee(sumBizFee);
		// -- 非普工业
		lwTownPriceSummaryDto.setIndustryDianJin(industryDianJin);
		lwTownPriceSummaryDto.setIndustryFee(industryFee);
		lwTownPriceSummaryDto.setIndustryJiJin(industryJiJin);
		lwTownPriceSummaryDto.setIndustryKuQu(industryKuQu);
		lwTownPriceSummaryDto.setIndustryQuantity(industryQuantity);
		lwTownPriceSummaryDto.setIndustrySanXia(industrySanXia);
		lwTownPriceSummaryDto.setSumIndustryFee(sumIndustryFee);

		// -- 总合计
		lwTownPriceSummaryDto.setSumFee(sumFee);

		lwTownPriceSummaryDto.setStatMonth(statMonth);
		lwTownPriceSummaryDto.setUserNo(townCode);

		return lwTownPriceSummaryDto;
	}

	/**
	 * 直供乡按局统计
	 * 
	 * @param collection
	 * @param statMonth
	 * @param townCode
	 * @return
	 */
	public TownSataDto townStatByCompany(Collection collection, String statMonth) {

		LwTownPriceSummaryDto lwTownPriceSummaryDto = new LwTownPriceSummaryDto();

		// 总电量
		double sumPower = 0.0;
		// 总电费
		double sumPowerFee = 0.0;
		// 电费
		double powerFee = 0.0;
		// 总电金
		double sumDianJin = 0.0;
		// 总三峡
		double sumSanXia = 0.0;
		// 总基金
		double sumJiJin = 0.0;
		// 总库区
		double sumKuQu = 0.0;

		// 纯电金
		double pureDianJin = 0.0;
		// 电金税
		double dianJinTax = 0.0;
		// 纯三峡
		double pureSanXia = 0.0;
		// 三峡税
		double sanXiaTax = 0.0;
		// 纯基金
		double pureJiJin = 0.0;
		// 基金税
		double jiJinTax = 0.0;
		// 纯电费
		double purePowerFee = 0D;
		// 电费税
		double powerFeeTax = 0.0;

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwTownPriceSummaryDto dto = (LwTownPriceSummaryDto) iterator.next();
			// 电费维度的求和
			sumPower = sumPower + dto.getSumQuantity();
			sumPowerFee = sumPowerFee + dto.getElectricFee();
			powerFee = powerFee + dto.getSumFee();
			sumDianJin = sumDianJin + dto.getSumDianJin();
			sumSanXia = sumSanXia + dto.getSumSanXia();
			sumJiJin = sumJiJin + dto.getSumJiJin();

		}
		TownSataDto townSataDto = new TownSataDto();
		// 纯电金
		purePowerFee = powerFee / 1.17;
		// 电费税
		powerFeeTax = purePowerFee * 0.17;

		// 纯电金
		pureDianJin = sumDianJin / 1.17;
		// 电金税
		dianJinTax = pureDianJin * 0.17;

		// 纯三峡
		pureSanXia = sumSanXia / 1.17;
		// 三峡税
		sanXiaTax = pureSanXia * 0.17;

		// 纯基金
		pureJiJin = sumJiJin / 1.17;
		// 基金税
		jiJinTax = pureJiJin * 0.17;

		townSataDto.setPurePowerFee(PowerFeeCal.getValue(purePowerFee,
				AppConst.TWO_DOT_FLAG));
		townSataDto.setPowerFeeTax(PowerFeeCal.getValue(powerFeeTax,
				AppConst.TWO_DOT_FLAG));
		townSataDto.setPureDianJin(PowerFeeCal.getValue(pureDianJin,
				AppConst.TWO_DOT_FLAG));
		townSataDto.setDianJinTax(PowerFeeCal.getValue(dianJinTax,
				AppConst.TWO_DOT_FLAG));
		townSataDto.setPureSanXia(PowerFeeCal.getValue(pureSanXia,
				AppConst.TWO_DOT_FLAG));
		townSataDto.setSanXiaTax(PowerFeeCal.getValue(sanXiaTax,
				AppConst.TWO_DOT_FLAG));
		townSataDto.setPureJiJin(PowerFeeCal.getValue(pureJiJin,
				AppConst.TWO_DOT_FLAG));
		townSataDto.setJiJinTax(PowerFeeCal.getValue(jiJinTax,
				AppConst.TWO_DOT_FLAG));

		townSataDto.setSumPower(PowerFeeCal.getValue(sumPower,
				AppConst.TWO_DOT_FLAG));
		townSataDto.setSumPowerFee(PowerFeeCal.getValue(sumPowerFee,
				AppConst.TWO_DOT_FLAG));

		townSataDto.setStatMonth(statMonth);

		return townSataDto;
	}
	/**
	 * 直供乡追收电费统计
	 * @param collection 追收电费列表
	 * @param statMonth 统计年月
	 * @return 统计结果
	 */
	public TownSataDto townAppendStatByCompany(Collection <LwTownPriceSummaryProratAppendDto>collection, String statMonth) {
		
		// 声明变量
		LwTownPriceSummaryDto lwTownPriceSummaryDto = null;
		Collection<LwTownPriceSummaryDto> appendList = new ArrayList<LwTownPriceSummaryDto>();
		
		// 组织DTO
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto = (LwTownPriceSummaryProratAppendDto) iterator
					.next();
			lwTownPriceSummaryDto = new LwTownPriceSummaryDto();
			DataUtils.copySimpleObject(lwTownPriceSummaryDto, lwTownPriceSummaryProratAppendDto);
			appendList.add(lwTownPriceSummaryDto);
		}
		// 计算统计结果
		return this.townStatByCompany(appendList, statMonth);
	}
	
	/**
	 * 直供乡发行电量统计
	 * 
	 * @param collection
	 * @param statMonth
	 * @param townCode
	 * @return
	 */
	public TownSataDto townFaxingStatByCompany(Collection<LwTownIndicatorDto> collection, String statMonth) {

		LwTownIndicatorDto lwTownIndicatorDto = new LwTownIndicatorDto();

		// 总电量
		double sumPower = 0.0;
		

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwTownIndicatorDto dto = (LwTownIndicatorDto) iterator.next();
			// 发行电量 = 抄见电量+变损电量
			sumPower = sumPower + dto.getExcepQuantity();
			

		}
		TownSataDto townSataDto = new TownSataDto();
		

		townSataDto.setSumPower(PowerFeeCal.getValue(sumPower,
				AppConst.ZERO_DOT_FLAG));
		

		townSataDto.setStatMonth(statMonth);

		return townSataDto;
	}

	/**
	 * 为直供乡电价表组织电价
	 * 
	 * @param priceList
	 * @param lwindicatorList
	 */
	public void orgTownIndicatorPrice(Collection<LwSalePriceDto> priceList,
			LwTownIndicatorDto lwTownIndicatorDto) {
		for (Iterator iterator3 = priceList.iterator(); iterator3.hasNext();) {
			LwSalePriceDto o = (LwSalePriceDto) iterator3.next();
			String powerClass = o.getPowerClass();
			if ("1".equals(powerClass)) {
				lwTownIndicatorDto.setPeoplePrice(o.getPrice());
			} else if ("2".equals(powerClass)) {
				lwTownIndicatorDto.setNotPeoplePrice(o.getPrice());
			} else if ("3".equals(powerClass)) {
				lwTownIndicatorDto.setBusinessPrice(o.getPrice());
			} else if ("4".equals(powerClass)) {
				lwTownIndicatorDto.setIndustryPrice(o.getPrice());
			} else if ("5".equals(powerClass)) {
				lwTownIndicatorDto.setProducePrice(o.getPrice());
			} else if ("6".equals(powerClass)) {
				lwTownIndicatorDto.setFarmPrice(o.getPrice());
			}

		}
	}

	/**
	 * 为直供乡追收电价表组织电价
	 * 
	 * @param priceList
	 * @param lwindicatorList
	 */
	public void orgTownIndicatorAppendPrice(
			Collection<LwSalePriceDto> priceList,
			LwTownIndicatorAppendDto lwTownIndicatorAppendDto) {
		for (Iterator iterator3 = priceList.iterator(); iterator3.hasNext();) {
			LwSalePriceDto o = (LwSalePriceDto) iterator3.next();
			String powerClass = o.getPowerClass();
			if ("1".equals(powerClass)) {
				lwTownIndicatorAppendDto.setPeoplePrice(o.getPrice());
			} else if ("2".equals(powerClass)) {
				lwTownIndicatorAppendDto.setNotPeoplePrice(o.getPrice());
			} else if ("3".equals(powerClass)) {
				lwTownIndicatorAppendDto.setBusinessPrice(o.getPrice());
			} else if ("4".equals(powerClass)) {
				lwTownIndicatorAppendDto.setIndustryPrice(o.getPrice());
			} else if ("5".equals(powerClass)) {
				lwTownIndicatorAppendDto.setProducePrice(o.getPrice());
			} else if ("6".equals(powerClass)) {
				lwTownIndicatorAppendDto.setFarmPrice(o.getPrice());
			}

		}
	}

	/**
	 * 计算变压器损耗
	 * 
	 * @param workQuantity
	 *            抄见有功电量
	 * @param notWorkQuantity
	 *            抄见无功电量
	 * @param T
	 *            连续供电时间
	 * @param t
	 *            用电时间
	 * @param tranferName
	 *            变压器名称
	 * @return
	 * @throws Exception
	 */

	public double calTransferLoss(double workQuantity, double notWorkQuantity,
			String tranferName) throws Exception {

		/** 1-声明变量 */
		BLTransforFacade blTransforFacade = new BLTransforFacade();
		double P0 = 0D;
		double Pk = 0D;
		double Se = 0D;
		double T = 0D;
		// -- 变损
		double P = 0D;
		double t = 0D;
		// 变压器DTO

		TransforDto transfor = blTransforFacade.findByPrimaryKey(tranferName);
		/** 2-得到变压器相关参数 */
		// --变压器空载损耗
		P0 = transfor.getKongzaiLoss();
		// --短路电流
		Pk = transfor.getDuanluLoss();
		T=transfor.getSuplyHour();
		// --额定容量
		P = transfor.getSuplyHour();
		t = transfor.getUseHour();
		Se = transfor.getContentPower();
		/** 3-计算变损 */
		P = PowerFeeCal.calTransferLoss(P0, T, t, Pk, Se, workQuantity,
				notWorkQuantity);
		return P;
	}
	public static void main(String[] args) throws Exception{
		BLCalPowerFeeCustomFacade a=new BLCalPowerFeeCustomFacade();
		
		Double s=a.calTransferLoss(700560, 142920, "哈业变951");
		System.out.println("biansun====="+s);
	}
	public double calLineLoss(double workQuantity, double notWorkQuantity,String lineCode) throws Exception{

		/** 1-声明变量 */

		BLLineLossFacade blLineLossFacade = new BLLineLossFacade();
		LineLossDto dto  = blLineLossFacade.findByPrimaryKey(lineCode);

		double R = 0D;
		double L = 0D;
		double Ve = 0D;
		double P = 0D;

		double t = 0D;

		/** 2-得到线路相关参数 */
		R = dto.getR();
		L = dto.getLineLong();

		Ve= dto.getVolt();
		t=dto.getT();

		/** 3-计算线损 */
		P = PowerFeeCal.calLineLoss(R, L, Ve, t, workQuantity, notWorkQuantity);
		return P;
	}
	/**
	 * 直供乡电费追加保存
	 * @param collection
	 * @param statMonth
	 * @throws Exception
	 */
	public void deleteInsertAppend(Collection<LwTownPriceSummaryProratAppendDto>collection,String conditions) throws Exception{
		DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryProratAppendAction blLwTownPriceSummaryProratAppendAction = new BLLwTownPriceSummaryProratAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwTownPriceSummaryProratAppendAction.deleteByConditions(dbManager, conditions);
            for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
				LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto = (LwTownPriceSummaryProratAppendDto) iterator
						.next();
				blLwTownPriceSummaryProratAppendAction.insert(dbManager, lwTownPriceSummaryProratAppendDto);		
			}
            
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
	}

}
