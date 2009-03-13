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
 * ������ Action <br>
 * 
 * @author ������
 * @version 1.0 2008-10-15
 */
public class BLCalPowerFeeCustomFacade {

	/**
	 * ֱ�����Ѽ��㹫ʽ
	 * 
	 * @param lwTownIndicatorDto
	 * @return
	 * @throws Exception
	 */
	public LwTownPriceSummaryDto calTownFee(
			LwTownIndicatorDto lwTownIndicatorDto) throws Exception {
		// ��Ѻϼ� = �ܵ�� + ���ʵ�� = �ܵ�ѡ���1+����ֵ��

		StringBuffer buffer = new StringBuffer();
		BLLwPowerUserFacade bLwPowerUserFacade = new BLLwPowerUserFacade();
		String voltCode = null;
		String lineCode = null;
		LwPowerUserDto lwPowerUserDto = null;
		BLLwPowerUserFacade blLwPowerUserFacade = new BLLwPowerUserFacade();
		// ��������
		double readQuantity = 0;
		// �������
		double chgQuantity = 0;
		// �쳣����
		double exceptionQuantity = 0;
		// �˲�����
		double compensateQuantity = 0;
		// �޹�����
		double idleQuantity = 0;
		// �ܵ���
		double sumQuantity = 0;
		// ���
		SalePriceDto price = new SalePriceDto();

		String userCode = lwTownIndicatorDto.getUserNo();
		lwPowerUserDto = blLwPowerUserFacade.findByPrimaryKey(userCode);
		String userName = lwPowerUserDto.getUserName();
		String statMonth = lwTownIndicatorDto.getStatMonth();
		double rate = lwTownIndicatorDto.getRate();
		// �õ�������̯����
		LwProrateDto lwProrateDto = getProrate(userCode);
		if (lwProrateDto == null) {
			buffer.append(" ����Ϊ��").append(userCode).append(",����Ϊ��").append(
					userName).append(" ���û�û�����ñ�����̯");
			throw new UserException(-6, -701, this.getClass().getName(), buffer
					.toString());
		}
		// �õ����û��ĵ�ѹ�ȼ�

		voltCode = lwPowerUserDto.getSaleVoltLevel();
		// ��̯���
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

		// �õ�����ֵ
		double adjustValue = 0;
		// ���õ�Ѽ��㹫ʽ
		LwTownPriceSummaryDto lwTownPriceSummaryDto = PowerFeeCal
				.townSumPowerFeeFormular(sumQuantity, exceptionQuantity, lwProrateDto,
						price, 0, adjustValue, lineCode, userCode, statMonth);

		return lwTownPriceSummaryDto;
	}

	/**
	 * ֱ����׷�ӵ�Ѽ���
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
		// ׷�Ӽ������
		double appendQuantity = 0;
		String appendMonth = null;

		// ���
		SalePriceDto newPriceDto = new SalePriceDto();
		SalePriceDto oldPriceDto = new SalePriceDto();

		userNo = lwTownIndicatorAppendDto.getUserNo();
		lwPowerUserDto = blLwPowerUserFacade.findByPrimaryKey(userNo);
		userName = lwPowerUserDto.getUserName();
		statMonth = lwTownIndicatorAppendDto.getStatMonth();
		
		// �õ�������̯����
		LwProrateDto lwProrateDto = getProrate(userNo);
		if (lwProrateDto == null) {
			buffer.append(" ����Ϊ��").append(userNo).append(",����Ϊ��").append(
					userName).append(" ���û�û�����ñ�����̯");
			throw new UserException(-6, -701, this.getClass().getName(), buffer
					.toString());
		}
		// �õ����û��ĵ�ѹ�ȼ�

		voltCode = lwPowerUserDto.getSaleVoltLevel();
		// ��ʷ���
		newPriceDto = getIndicatorPrice(voltCode);
		lwTownIndicatorDto = new BLLwTownIndicatorFacade().findByPrimaryKey(
				userNo, statMonth);
		// �µ��
		newPriceDto = PowerFeeCal.getHistoryPrice(lwTownIndicatorDto);

		appendMonth = lwTownIndicatorAppendDto.getAppendDate();
		appendQuantity = lwTownIndicatorAppendDto.getReadQuantity();

		// ���õ�Ѽ��㹫ʽ
		lwTownPriceSummaryAppendDto = PowerFeeCal.townFeeAppendFormular(
				appendQuantity, lwProrateDto, oldPriceDto, newPriceDto, userNo,
				statMonth, appendMonth);

		return lwTownPriceSummaryAppendDto;
	}

	/**
	 * �õ���̯���
	 * 
	 * @return
	 * @throws Exception
	 */
	public LwProrateDto getProrate(String userNo) throws Exception {
		BLLwProrateFacade bLwProrateFacade = new BLLwProrateFacade();
		// һ����Ӧһ��������̯
		LwProrateDto lwProrateDto = bLwProrateFacade.findByPrimaryKey(userNo);
		return lwProrateDto;
	}

	public Collection<LwSalePriceDto> getTownPrice(String saleLevelType)
			throws Exception {

		// -- ��������
		BLLwDcodeFacade bLwDcodeFacade = new BLLwDcodeFacade();
		BLLwSalePriceFacade bLwSalePriceFacade = new BLLwSalePriceFacade();
		StringBuffer buffer = new StringBuffer();

		// -- �ڻ���������в��ұ�����̯
		Collection<LwDcodeDto> codeList = bLwDcodeFacade
				.findByConditions(" codetype = 'PowerClass' And (codecode <>'7' And codecode<>'8' And codecode <>'9' And codecode <>'10') ");

		// -- ��֯������̯�ĵ������
		String prorateCondition = this.getProrateCondition(codeList);

		// -- ��֯����·�ĵ�ѹֵ������
		String volitageCondition = PowerFeeCal
				.getSalePowerCondition(saleLevelType);

		// -- ������������֯�ɻ�����۵�۵Ĳ�ѯ����
		buffer.append(" 1=1 ").append(volitageCondition).append(
				prorateCondition).append(" and pricecategory = '3'");

		// -- ��ѯ���
		Collection<LwSalePriceDto> collection = bLwSalePriceFacade
				.findByConditions(buffer.toString());

		return collection;
	}

	/**
	 * �õ�ָ����еĵ��
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
	 * �õ�ָ����еĵ��
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
	 * ��֯ȡ�õ�۷����������
	 * 
	 * @param collection
	 * @return
	 */
	public String getProrateCondition(Collection<LwDcodeDto> collection) {
		StringBuffer buffer = new StringBuffer();
		// ����ѵ�ֵ�����õ����ӱ���ȡ�á�
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
		/** ũ����� */
		double farmUseQuantity = 0.0;
		// ũ����
		double farmUseFee = 0.0;

		// ��������
		double productQuantity = 0.0;
		// �������
		double productFee = 0.0;

		// �������
		double peopleUseQuantity = 0.0;
		// ������
		double peopleUseFee = 0.0;

		// �Ǿ������
		double notPeopleUseQuantity = 0.0;
		// �Ǿ�����
		double notPeopleUseFee = 0.0;

		// �ǹ�ҵ����
		double industryQuantity = 0.0;
		// �ǹ�ҵ���
		double industryFee = 0.0;

		// ��ҵ����
		double bizQuantity = 0.0;
		// ��ҵ���
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

		// �ܵ���
		double sumPower = 0.0;
		// �ܵ��
		double sumPowerFee = 0.0;
		// �ܵ��
		double sumDianJin = 0.0;
		// ����Ͽ
		double sumSanXia = 0.0;
		// �ܻ���
		double sumJiJin = 0.0;
		// �ܿ���
		double sumKuQu = 0.0;

		// ��ũ��
		double sumFarmFee = 0.0;
		// �ܾ���
		double sumPeopleFee = 0.0;
		// �ܷǾ���
		double sumNotPeopleFee = 0.0;
		// ��ũҵ����
		double sumProduceFee = 0.0;
		// �ܷ��չ�ҵ
		double sumIndustryFee = 0.0;
		// ����ҵ
		double sumBizFee = 0.0;
		// �ܵ�Ѻϼ�
		double sumFee = 0.0;

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwTownPriceSummaryDto dto = (LwTownPriceSummaryDto) iterator.next();
			// ũ�ࣺ�������û��ĵ�������ѡ��Ľ���͡�
			farmUseQuantity = farmUseQuantity + dto.getFarmQuantity();
			farmUseFee = farmUseFee + dto.getFarmFee();
			farmDianJin = farmDianJin + dto.getFarmDianJin();
			farmJiJin = farmJiJin + dto.getFarmJiJin();
			farmSanXia = farmSanXia + dto.getFarmSanXia();
			farmKuQu = farmKuQu + dto.getFarmKuQu();

			// ���չ�ҵ���������û��ĵ�������ѡ��Ľ���͡�
			industryQuantity = industryQuantity + dto.getIndustryQuantity();
			industryFee = industryFee + dto.getIndustryFee();
			industryDianJin = industryDianJin + dto.getIndustryDianJin();
			industryJiJin = industryJiJin + dto.getIndustryJiJin();
			industrySanXia = industrySanXia + dto.getIndustrySanXia();
			industryKuQu = industryKuQu + dto.getIndustryKuQu();

			// ũҵ�������������û��ĵ�������ѡ��Ľ���͡�
			productQuantity = productQuantity + dto.getProduceQuantity();
			productFee = productFee + dto.getProduceFee();
			produceDianJin = produceDianJin + dto.getProduceDianJin();
			produceJiJin = produceJiJin + dto.getProduceJiJin();
			produceSanXia = produceSanXia + dto.getProduceSanXia();
			produceKuQu = produceKuQu + dto.getPeopleKuQu();

			// ��ҵ���������û��ĵ�������ѡ��Ľ���͡�
			bizQuantity = bizQuantity + dto.getBizQuantity();
			bizFee = bizFee + dto.getBizFee();
			bizDianJin = bizDianJin + dto.getBizDianJin();
			bizJiJin = bizJiJin + dto.getBizJiJin();
			bizSanXia = bizSanXia + dto.getBizSanXia();
			bizKuQu = bizKuQu + dto.getPeopleKuQu();

			// ���񣺽������û��ĵ�������ѡ��Ľ���͡�
			peopleUseQuantity = peopleUseQuantity + dto.getPeopleQuantity();
			peopleUseFee = peopleUseFee + dto.getPeopleFee();
			peopleDianJin = peopleDianJin + dto.getPeopleDianJin();
			peopleJiJin = peopleJiJin + dto.getPeopleJiJin();
			peopleSanXia = peopleSanXia + dto.getPeopleFeeSanXia();
			peopleKuQu = peopleKuQu + dto.getPeopleKuQu();

			// �Ǿ��񣺽������û��ĵ�������ѡ��Ľ���͡�
			notPeopleUseQuantity = notPeopleUseQuantity
					+ dto.getNotPeopleQuantity();
			notPeopleUseFee = notPeopleUseFee + dto.getNotPeopleFee();
			notPeopleDianJin = notPeopleDianJin + dto.getNotPeopleDianJin();
			notPeopleJiJin = notPeopleJiJin + dto.getNotPeopleJiJin();
			notPeopleSanXia = notPeopleSanXia + dto.getNotPeopleFeeSanXia();
			notPeopleKuQu = notPeopleKuQu + dto.getNotPeopleKuQu();

			// ���ά�ȵ����
			sumPower = sumPower + dto.getSumQuantity();
			sumPowerFee = sumPowerFee + dto.getElectricFee();
			sumDianJin = sumDianJin + dto.getSumDianJin();
			sumSanXia = sumSanXia = dto.getSumSanXia();
			sumJiJin = sumJiJin + dto.getSumJiJin();
			sumKuQu = sumKuQu + dto.getSumKuQu();

			// ������̯ά�ȵ����
			sumFarmFee = sumFarmFee + dto.getSumFarmFee();
			sumIndustryFee = sumIndustryFee + dto.getSumIndustryFee();
			sumProduceFee = sumProduceFee + dto.getSumProduceFee();
			sumBizFee = sumBizFee + dto.getSumBizFee();
			sumPeopleFee = sumPeopleFee + dto.getSumPeopleFee();
			sumNotPeopleFee = sumNotPeopleFee + dto.getSumNotPeopleFee();

			// �ܵ�Ѻϼ�
			sumFee = sumFee + dto.getSumFee();
		}
		// ���ά�ȵĸ�ֵ
		lwTownPriceSummaryDto.setElectricFee(sumPowerFee);
		lwTownPriceSummaryDto.setSumDianJin(sumDianJin);
		lwTownPriceSummaryDto.setSanXiaFee(sumSanXia);
		lwTownPriceSummaryDto.setSumJiJin(sumJiJin);
		lwTownPriceSummaryDto.setSumKuQu(sumKuQu);
		lwTownPriceSummaryDto.setSumQuantity(sumPower);
		// ������̯�ĸ�ֵ
		// -- ũ��
		lwTownPriceSummaryDto.setFarmDianJin(farmDianJin);
		lwTownPriceSummaryDto.setFarmFee(farmUseFee);
		lwTownPriceSummaryDto.setFarmJiJin(farmJiJin);
		lwTownPriceSummaryDto.setFarmKuQu(farmKuQu);
		lwTownPriceSummaryDto.setFarmQuantity(farmUseQuantity);
		lwTownPriceSummaryDto.setFarmSanXia(farmSanXia);
		lwTownPriceSummaryDto.setSumFarmFee(sumFarmFee);
		// -- ����
		lwTownPriceSummaryDto.setProduceDianJin(produceDianJin);
		lwTownPriceSummaryDto.setProduceFee(productFee);
		lwTownPriceSummaryDto.setProduceJiJin(produceJiJin);
		lwTownPriceSummaryDto.setProduceKuQu(produceKuQu);
		lwTownPriceSummaryDto.setProduceQuantity(productQuantity);
		lwTownPriceSummaryDto.setProduceSanXia(produceSanXia);
		lwTownPriceSummaryDto.setSumProduceFee(sumProduceFee);
		// -- ����
		lwTownPriceSummaryDto.setPeopleDianJin(peopleDianJin);
		lwTownPriceSummaryDto.setPeopleFee(peopleUseFee);
		lwTownPriceSummaryDto.setPeopleJiJin(peopleJiJin);
		lwTownPriceSummaryDto.setPeopleKuQu(peopleKuQu);
		lwTownPriceSummaryDto.setPeopleQuantity(peopleUseQuantity);
		lwTownPriceSummaryDto.setPeopleFeeSanXia(peopleSanXia);
		lwTownPriceSummaryDto.setSumPeopleFee(sumPeopleFee);
		// -- �Ǿ���
		lwTownPriceSummaryDto.setNotPeopleDianJin(notPeopleDianJin);
		lwTownPriceSummaryDto.setNotPeopleFee(notPeopleUseFee);
		lwTownPriceSummaryDto.setNotPeopleJiJin(notPeopleJiJin);
		lwTownPriceSummaryDto.setNotPeopleKuQu(notPeopleKuQu);
		lwTownPriceSummaryDto.setNotPeopleQuantity(notPeopleUseQuantity);
		lwTownPriceSummaryDto.setNotPeopleFeeSanXia(notPeopleSanXia);
		lwTownPriceSummaryDto.setSumNotPeopleFee(sumNotPeopleFee);
		// -- ��ҵ
		lwTownPriceSummaryDto.setBizDianJin(bizDianJin);
		lwTownPriceSummaryDto.setBizFee(bizFee);
		lwTownPriceSummaryDto.setBizJiJin(bizJiJin);
		lwTownPriceSummaryDto.setBizKuQu(bizKuQu);
		lwTownPriceSummaryDto.setBizQuantity(bizQuantity);
		lwTownPriceSummaryDto.setBizSanXia(bizSanXia);
		lwTownPriceSummaryDto.setSumBizFee(sumBizFee);
		// -- ���չ�ҵ
		lwTownPriceSummaryDto.setIndustryDianJin(industryDianJin);
		lwTownPriceSummaryDto.setIndustryFee(industryFee);
		lwTownPriceSummaryDto.setIndustryJiJin(industryJiJin);
		lwTownPriceSummaryDto.setIndustryKuQu(industryKuQu);
		lwTownPriceSummaryDto.setIndustryQuantity(industryQuantity);
		lwTownPriceSummaryDto.setIndustrySanXia(industrySanXia);
		lwTownPriceSummaryDto.setSumIndustryFee(sumIndustryFee);

		// -- �ܺϼ�
		lwTownPriceSummaryDto.setSumFee(sumFee);

		lwTownPriceSummaryDto.setStatMonth(statMonth);
		lwTownPriceSummaryDto.setUserNo(townCode);

		return lwTownPriceSummaryDto;
	}

	/**
	 * ֱ���簴��ͳ��
	 * 
	 * @param collection
	 * @param statMonth
	 * @param townCode
	 * @return
	 */
	public TownSataDto townStatByCompany(Collection collection, String statMonth) {

		LwTownPriceSummaryDto lwTownPriceSummaryDto = new LwTownPriceSummaryDto();

		// �ܵ���
		double sumPower = 0.0;
		// �ܵ��
		double sumPowerFee = 0.0;
		// ���
		double powerFee = 0.0;
		// �ܵ��
		double sumDianJin = 0.0;
		// ����Ͽ
		double sumSanXia = 0.0;
		// �ܻ���
		double sumJiJin = 0.0;
		// �ܿ���
		double sumKuQu = 0.0;

		// �����
		double pureDianJin = 0.0;
		// ���˰
		double dianJinTax = 0.0;
		// ����Ͽ
		double pureSanXia = 0.0;
		// ��Ͽ˰
		double sanXiaTax = 0.0;
		// ������
		double pureJiJin = 0.0;
		// ����˰
		double jiJinTax = 0.0;
		// �����
		double purePowerFee = 0D;
		// ���˰
		double powerFeeTax = 0.0;

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwTownPriceSummaryDto dto = (LwTownPriceSummaryDto) iterator.next();
			// ���ά�ȵ����
			sumPower = sumPower + dto.getSumQuantity();
			sumPowerFee = sumPowerFee + dto.getElectricFee();
			powerFee = powerFee + dto.getSumFee();
			sumDianJin = sumDianJin + dto.getSumDianJin();
			sumSanXia = sumSanXia + dto.getSumSanXia();
			sumJiJin = sumJiJin + dto.getSumJiJin();

		}
		TownSataDto townSataDto = new TownSataDto();
		// �����
		purePowerFee = powerFee / 1.17;
		// ���˰
		powerFeeTax = purePowerFee * 0.17;

		// �����
		pureDianJin = sumDianJin / 1.17;
		// ���˰
		dianJinTax = pureDianJin * 0.17;

		// ����Ͽ
		pureSanXia = sumSanXia / 1.17;
		// ��Ͽ˰
		sanXiaTax = pureSanXia * 0.17;

		// ������
		pureJiJin = sumJiJin / 1.17;
		// ����˰
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
	 * ֱ����׷�յ��ͳ��
	 * @param collection ׷�յ���б�
	 * @param statMonth ͳ������
	 * @return ͳ�ƽ��
	 */
	public TownSataDto townAppendStatByCompany(Collection <LwTownPriceSummaryProratAppendDto>collection, String statMonth) {
		
		// ��������
		LwTownPriceSummaryDto lwTownPriceSummaryDto = null;
		Collection<LwTownPriceSummaryDto> appendList = new ArrayList<LwTownPriceSummaryDto>();
		
		// ��֯DTO
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto = (LwTownPriceSummaryProratAppendDto) iterator
					.next();
			lwTownPriceSummaryDto = new LwTownPriceSummaryDto();
			DataUtils.copySimpleObject(lwTownPriceSummaryDto, lwTownPriceSummaryProratAppendDto);
			appendList.add(lwTownPriceSummaryDto);
		}
		// ����ͳ�ƽ��
		return this.townStatByCompany(appendList, statMonth);
	}
	
	/**
	 * ֱ���緢�е���ͳ��
	 * 
	 * @param collection
	 * @param statMonth
	 * @param townCode
	 * @return
	 */
	public TownSataDto townFaxingStatByCompany(Collection<LwTownIndicatorDto> collection, String statMonth) {

		LwTownIndicatorDto lwTownIndicatorDto = new LwTownIndicatorDto();

		// �ܵ���
		double sumPower = 0.0;
		

		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			LwTownIndicatorDto dto = (LwTownIndicatorDto) iterator.next();
			// ���е��� = ��������+�������
			sumPower = sumPower + dto.getExcepQuantity();
			

		}
		TownSataDto townSataDto = new TownSataDto();
		

		townSataDto.setSumPower(PowerFeeCal.getValue(sumPower,
				AppConst.ZERO_DOT_FLAG));
		

		townSataDto.setStatMonth(statMonth);

		return townSataDto;
	}

	/**
	 * Ϊֱ�����۱���֯���
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
	 * Ϊֱ����׷�յ�۱���֯���
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
	 * �����ѹ�����
	 * 
	 * @param workQuantity
	 *            �����й�����
	 * @param notWorkQuantity
	 *            �����޹�����
	 * @param T
	 *            ��������ʱ��
	 * @param t
	 *            �õ�ʱ��
	 * @param tranferName
	 *            ��ѹ������
	 * @return
	 * @throws Exception
	 */

	public double calTransferLoss(double workQuantity, double notWorkQuantity,
			String tranferName) throws Exception {

		/** 1-�������� */
		BLTransforFacade blTransforFacade = new BLTransforFacade();
		double P0 = 0D;
		double Pk = 0D;
		double Se = 0D;
		double T = 0D;
		// -- ����
		double P = 0D;
		double t = 0D;
		// ��ѹ��DTO

		TransforDto transfor = blTransforFacade.findByPrimaryKey(tranferName);
		/** 2-�õ���ѹ����ز��� */
		// --��ѹ���������
		P0 = transfor.getKongzaiLoss();
		// --��·����
		Pk = transfor.getDuanluLoss();
		T=transfor.getSuplyHour();
		// --�����
		P = transfor.getSuplyHour();
		t = transfor.getUseHour();
		Se = transfor.getContentPower();
		/** 3-������� */
		P = PowerFeeCal.calTransferLoss(P0, T, t, Pk, Se, workQuantity,
				notWorkQuantity);
		return P;
	}
	public static void main(String[] args) throws Exception{
		BLCalPowerFeeCustomFacade a=new BLCalPowerFeeCustomFacade();
		
		Double s=a.calTransferLoss(700560, 142920, "��ҵ��951");
		System.out.println("biansun====="+s);
	}
	public double calLineLoss(double workQuantity, double notWorkQuantity,String lineCode) throws Exception{

		/** 1-�������� */

		BLLineLossFacade blLineLossFacade = new BLLineLossFacade();
		LineLossDto dto  = blLineLossFacade.findByPrimaryKey(lineCode);

		double R = 0D;
		double L = 0D;
		double Ve = 0D;
		double P = 0D;

		double t = 0D;

		/** 2-�õ���·��ز��� */
		R = dto.getR();
		L = dto.getLineLong();

		Ve= dto.getVolt();
		t=dto.getT();

		/** 3-�������� */
		P = PowerFeeCal.calLineLoss(R, L, Ve, t, workQuantity, notWorkQuantity);
		return P;
	}
	/**
	 * ֱ������׷�ӱ���
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
            //�����¼
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
