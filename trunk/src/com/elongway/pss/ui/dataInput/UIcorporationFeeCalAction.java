package com.elongway.pss.ui.dataInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwNewFactoryIndicatorFacade;
import com.elongway.pss.dto.custom.CommonDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;

/**
 * 大工业算费Action
 * 
 * @author wangrongjia 2009-01 v1.0 修改 qiaoyouliang 2009-03-31 v1.1
 *         土右化肥厂新增套表，这部分电量执行大工业电价， 总有功电量=
 *         抄见电量-非居民电量-套表电量。相应的功率因数的值也进行改变。暂时没有考虑停产情况。
 * 
 */
public class UIcorporationFeeCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		// String lineCode=httpServletRequest.getParameter("LineCode");

		String changeRate = httpServletRequest.getParameter("changeRate");
		String pdanjin = httpServletRequest.getParameter("pdanjin");

		String UserNo = httpServletRequest.getParameter("UserNo");
		String otherPeopleQuantity = httpServletRequest
				.getParameter("otherPeopleQuantity");
		String UserName = httpServletRequest.getParameter("UserName");
		String voltage = httpServletRequest.getParameter("voltage");
		String industryType = httpServletRequest.getParameter("industryType");
		// String AmmeterStyle=httpServletRequest.getParameter("AmmeterStyle");
		String AmmeterNo[] = httpServletRequest.getParameterValues("AmmeterNo");
		String state = httpServletRequest.getParameter("state");
		String changestate = httpServletRequest.getParameter("changestate");

		String useStyle[] = httpServletRequest.getParameterValues("useStyle");
		String workQuantity[] = httpServletRequest
				.getParameterValues("workQuantity");
		String unworkQuantity[] = httpServletRequest
				.getParameterValues("unworkQuantity");
		String Rate[] = httpServletRequest.getParameterValues("Rate");
		String LastWorkNum[] = httpServletRequest
				.getParameterValues("LastWorkNum");
		String ThisWorkNum[] = httpServletRequest
				.getParameterValues("ThisWorkNum");
		String LastIdleNum[] = httpServletRequest
				.getParameterValues("LastIdleNum");
		String ThisIdleNum[] = httpServletRequest
				.getParameterValues("ThisIdleNum");
		String pepolepowerStyle = httpServletRequest
				.getParameter("pepolepowerStyle");

		String appStyle = httpServletRequest.getParameter("appStyle");
		String RongliangQuantity = httpServletRequest
				.getParameter("RongliangQuantity");
		String NeedPointer = httpServletRequest.getParameter("NeedPointer");
		String lastMeritoriousPointer = httpServletRequest
				.getParameter("lastMeritoriousPointer");

		String ChgAmmeterQuantity[] = httpServletRequest
				.getParameterValues("ChgAmmeterQuantity");
		String UnChgAmmeterQuantity[] = httpServletRequest
				.getParameterValues("UnChgAmmeterQuantity");

		String CompensateQuantity[] = httpServletRequest
				.getParameterValues("CompensateQuantity");
		String unCompensateQuantity[] = httpServletRequest
				.getParameterValues("UnCompensateQuantity");
		String inputDate = httpServletRequest.getParameter("inputDate");
		String NeedRate = httpServletRequest.getParameter("NeedRate");// 需量表倍率
		String stopProduce = httpServletRequest.getParameter("stopProduce");// 是否出现月中停产
		// 0 否
		// 1 是
		String dianjinPower = httpServletRequest.getParameter("dianjinPower");// 电金电量类型
		// 0
		// 总电量
		// 1
		// 居民电量
		String changeThisWorkNum = httpServletRequest
				.getParameter("changeThisWorkNum");// 改变上有功
		String changeLastWorkNum = httpServletRequest
				.getParameter("changeLastWorkNum");// 改变下有功
		String changeLastIdleNum = httpServletRequest
				.getParameter("changeLastIdleNum");// 改变上无功
		String changeThisIdleNum = httpServletRequest
				.getParameter("changeThisIdleNum");// 改变下无功
		String changepriceStyle = httpServletRequest
				.getParameter("changepriceStyle");// 改变电价电价
		String changerongLiangPrice = httpServletRequest
				.getParameter("changerongLiangPrice");// 改变容量电价
		String rongLiangPrice = httpServletRequest
				.getParameter("rongLiangPrice");// 容量电价
		String day = httpServletRequest.getParameter("day");// 天数
		String changeday = httpServletRequest.getParameter("changeday");// 天数

		String changevoltage = httpServletRequest.getParameter("changevoltage");
		String changeChgAmmeterQuantity = httpServletRequest
				.getParameter("changeChgAmmeterQuantity");
		String changeUnChgAmmeterQuantity = httpServletRequest
				.getParameter("changeUnChgAmmeterQuantity");
		String changeCompensateQuantity = httpServletRequest
				.getParameter("changeCompensateQuantity");
		String changeUnCompensateQuantity = httpServletRequest
				.getParameter("changeUnCompensateQuantity");
		BLLwNewFactoryIndicatorFacade blLwNewFactoryIndicatorFacade = new BLLwNewFactoryIndicatorFacade();
		PowerFeeCal powerFeeCal = new PowerFeeCal();
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade = new BLLwCoporationUserInfoFacade();
		LwCoporationUserInfoDto lwCoporationUserInfoDto = blLwCoporationUserInfoFacade
				.findByPrimaryKey(UserNo);
		double TransLoss = lwCoporationUserInfoDto.getLineLossScale();
		String AmmeterStyle = "";
		LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = null;
		if (lwCoporationUserInfoDto.getLineLossScale() > 0) {
			AmmeterStyle = "1";
		}
		if (lwCoporationUserInfoDto.getLineLossScale() == 0) {
			AmmeterStyle = "0";
		}
		
		// 没有生产停产的改变
		if (stopProduce.equals("0")) {
			/**
			 * modify by qiaoyouliang 2009-03-31 beijing begin 大工业计算增加套表-定义
			 */
			double taobiaoQuantity = 0D;// 套表电量
			double taobiaoFee = 0D;// 套表电费
			double taobiaoPrice = 0D; // 大工业电价
			/**
			 * modify by qiaoyouliang 2009-03-31 beijing end 大工业计算增加套表-定义
			 */
			double PointerQuantity = 0; // 抄见电量
			double unDenizenFeePower = 0;// 居民电量
			double rongliangQuantity = 0;
			double contentPrice = 0;
			double ammeterDuzenPower = 0;
			double dianjinPrice = 0;
			if (state.equals("1")) {
				dianjinPrice = lwCoporationUserInfoDto
						.getShengChandianJinPrice();
			}
			if (state.equals("2")) {
				dianjinPrice = lwCoporationUserInfoDto
						.getTingChandianJinPrice();
			}

			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {
				contentPrice = powerFeeCal.rongLiangPrice(state, UserNo);
				rongliangQuantity = lwCoporationUserInfoDto.getRongliangPower();
			}

	
			double PeakQuantity = 0; // 峰段电量
			double ValleyQuantity = 0;// 谷段电量

			String PeopleQuantity = "0";
			if (lwCoporationUserInfoDto.getPepoleFlag().equals("1")) {
				PeopleQuantity = "0";
			}
			if (lwCoporationUserInfoDto.getPepoleFlag().equals("2")) {
				PeopleQuantity = lwCoporationUserInfoDto.getPepolePower();
			}

			double UnPointerQuantity = 0;
			for (int i = 0; i < AmmeterNo.length; i++) {
				if (ChgAmmeterQuantity[i].equals("")
						|| ChgAmmeterQuantity[i] == null) {
					ChgAmmeterQuantity[i] = "0";
				}
				if (UnChgAmmeterQuantity[i].equals("")
						|| UnChgAmmeterQuantity[i] == null) {
					UnChgAmmeterQuantity[i] = "0";
				}
				if (CompensateQuantity[i].equals("")
						|| CompensateQuantity[i] == null) {
					ChgAmmeterQuantity[i] = "0";
				}
				if (unCompensateQuantity[i].equals("")
						|| unCompensateQuantity[i] == null) {
					unCompensateQuantity[i] = "0";
				}

				if (useStyle[i].equals("0")) {
					PointerQuantity += Math.round((Double
							.parseDouble(ThisWorkNum[i]) - Double
							.parseDouble(LastWorkNum[i]))
							* Double.parseDouble(Rate[i])
							+ Double.parseDouble(ChgAmmeterQuantity[i])
							+ Double.parseDouble(CompensateQuantity[i]));
					UnPointerQuantity += Math.round((Double
							.parseDouble(ThisIdleNum[i]) - Double
							.parseDouble(LastIdleNum[i]))
							* Double.parseDouble(Rate[i])
							+ Double.parseDouble(UnChgAmmeterQuantity[i])
							+ Double.parseDouble(unCompensateQuantity[i]));
				}
				if (useStyle[i].equals("1")) {

					ammeterDuzenPower += Math.round((Double
							.parseDouble(ThisWorkNum[i]) - Double
							.parseDouble(LastWorkNum[i]))
							* Double.parseDouble(Rate[i])
							+ Double.parseDouble(ChgAmmeterQuantity[i])
							+ Double.parseDouble(CompensateQuantity[i])
							+ Double.parseDouble(PeopleQuantity));
				}
			}

			// PointerQuantity=PointerQuantity+ammeterDuzenPower+Double.parseDouble(PeopleQuantity);
			unDenizenFeePower = Math.round(ammeterDuzenPower
					+ Double.parseDouble(PeopleQuantity));

			/**
			 * modify by qiaoyouliang 2009-03-31 beijing begin 大工业计算增加套表-套表电量
			 */
			double isPointerQuantity = 0D;
			String taoBiaoFlag = AppConst.NOT_TAOBIAO_FLAG;
			// 声明通用Dto
			CommonDto commonDto = new CommonDto();
			taobiaoQuantity = this.getTaoBiaoQuantity(AmmeterNo, ThisWorkNum,
					LastWorkNum, Rate, useStyle, ChgAmmeterQuantity,
					CompensateQuantity,taoBiaoFlag,commonDto);
			isPointerQuantity = Math.round(PointerQuantity - unDenizenFeePower
					- taobiaoQuantity);
			String taoPriceType = AppConst.METERIALS_TYPE_0;
			taobiaoPrice = powerFeeCal.factorySalePrice(lwCoporationUserInfoDto.getVoltage(), taoPriceType);
			taobiaoFee = taobiaoQuantity * taobiaoPrice;
			
			
			/**
			 * modify by qiaoyouliang 2009-03-31 beijing end 大工业计算增加套表-套表电量
			 */
			double TransLosspower = Math.round(PointerQuantity * TransLoss
					/ 100);
			double unTransLosspower = Math.round(UnPointerQuantity * TransLoss
					/ 100);

			if (AmmeterStyle.equals("1")) {
				if (PointerQuantity == 0) {
					PeakQuantity = 0;
				} else {
					PeakQuantity = Math.round(PointerQuantity
							- unDenizenFeePower - TransLosspower);
				}
			}
			double AdjustRate = 0;
			double RateCode = 0;

			AdjustRate = powerFeeCal.poweradjustmentCorporationValue(String
					.valueOf(PointerQuantity), String
					.valueOf(UnPointerQuantity), "3");
			RateCode = powerFeeCal.poweradjustrate(String
					.valueOf(PointerQuantity), String
					.valueOf(UnPointerQuantity));

			double contentPower = 0;
			double needPower = 0;
			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {
				if (RongliangQuantity == null || RongliangQuantity.equals("")) {
					RongliangQuantity = "0";
				} else {
					contentPower = Math.round(Double
							.parseDouble(RongliangQuantity));
				}
			}
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				if (NeedPointer == null || NeedPointer.equals("")) {
					NeedPointer = "0";
				} else {
					needPower = Math.round(Double.parseDouble(NeedPointer)
							* Double.parseDouble(NeedRate));
				}
			}

			double sumpower = 0;
			if (AmmeterStyle.equals("1")) {
				sumpower = Math.round(PeakQuantity) + ammeterDuzenPower;
			}

			if (AmmeterStyle.equals("0")) {
				sumpower = Math.round(PointerQuantity - TransLosspower);
			}

			double factoryprice = powerFeeCal.corporationPrice(state, UserNo);
			double pepolePrice = powerFeeCal.factoryPeoplePrice(UserNo);
			double needPrice = 0;
			double needFee = 0;
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				needPrice = powerFeeCal.xuliangFee(UserNo);
			}
			double unDenizenFee = powerFeeCal.getValue(unDenizenFeePower
					* pepolePrice, AppConst.TWO_DOT_FLAG);
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				needFee = powerFeeCal.getValue(needPower * needPrice,
						AppConst.TWO_DOT_FLAG);
			}
			double contentFee = 0;
			double PointerFee = powerFeeCal.getValue(
					(isPointerQuantity - TransLosspower) * factoryprice,
					AppConst.TWO_DOT_FLAG);
			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {
				contentFee = powerFeeCal.getValue(contentPower * contentPrice,
						AppConst.TWO_DOT_FLAG);
			}
			/*
			 * if(pdanjin.equals("")||pdanjin==null){ pdanjin="0"; }
			 */
			double fengFee = PeakQuantity * factoryprice;
			double guFee = ValleyQuantity * factoryprice;
			double dianJinFee = 0;
			if (lwCoporationUserInfoDto.getDianJinPower().equals("1")) {
				dianJinFee = powerFeeCal.getValue(sumpower * dianjinPrice,
						AppConst.TWO_DOT_FLAG);// 电金
			}
		
			
			if (lwCoporationUserInfoDto.getDianJinPower().equals("2")) {
				dianJinFee = powerFeeCal.getValue(unDenizenFeePower
						* dianjinPrice, AppConst.TWO_DOT_FLAG);// 电金
			}
			
			/**
			 * 土右化肥厂优惠begin 2009-06-26
			 */
			if(state.equals("2")){
				if(lwCoporationUserInfoDto.getUserNo().equals("20699999069")){
					dianJinFee = powerFeeCal.getValue(sumpower * dianjinPrice,
							AppConst.TWO_DOT_FLAG);// 电金
				}
			}
			
			/**
			 * 土右化肥厂优惠end 2009-06-26
			 */
			
			double sanXiaFee = powerFeeCal.getValue(sumpower * 0.004,
					AppConst.TWO_DOT_FLAG);// 三峡金
			double jiJinFee = powerFeeCal.getValue(sumpower * 0.0051,
					AppConst.TWO_DOT_FLAG);// 基金
			double sumFee = 0;
			double sumotherFee = 0;

			double PowerRateFee = 0;
			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {
				if (AmmeterStyle.equals("0")) {
					sumotherFee = contentFee + unDenizenFee + PointerFee + taobiaoFee;
					PowerRateFee = sumotherFee * AdjustRate;
					sumFee = contentFee + unDenizenFee + PointerFee
							+ PowerRateFee + dianJinFee + sanXiaFee + jiJinFee + taobiaoFee;
				}
				if (AmmeterStyle.equals("1")) {
					sumotherFee = contentFee + unDenizenFee + fengFee+taobiaoFee;
					PowerRateFee = sumotherFee * AdjustRate;
					sumFee = contentFee + unDenizenFee + fengFee + PowerRateFee
							+ dianJinFee + sanXiaFee + jiJinFee + taobiaoFee;
				}
				if (AmmeterStyle.equals("2")) {
					sumotherFee = contentFee + unDenizenFee + guFee+taobiaoFee;
					PowerRateFee = sumotherFee * AdjustRate;
					sumFee = contentFee + unDenizenFee + guFee + PowerRateFee
							+ dianJinFee + sanXiaFee + jiJinFee + taobiaoFee;
				}

			}
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				if (AmmeterStyle.equals("0")) {
					sumotherFee = needFee + unDenizenFee + PointerFee + taobiaoFee;
					PowerRateFee = powerFeeCal.getValue(sumotherFee
							* AdjustRate, AppConst.TWO_DOT_FLAG);
					sumFee = needFee + unDenizenFee + PointerFee + PowerRateFee
							+ dianJinFee + sanXiaFee + jiJinFee + taobiaoFee;
				}
				if (AmmeterStyle.equals("1")) {
					sumotherFee = needFee + unDenizenFee + fengFee + taobiaoFee;
					PowerRateFee = powerFeeCal.getValue(sumotherFee
							* AdjustRate, AppConst.TWO_DOT_FLAG);
					sumFee = needFee + unDenizenFee + fengFee + PowerRateFee
							+ dianJinFee + sanXiaFee + jiJinFee + taobiaoFee;
				}
				/*
				 * if(AmmeterStyle.equals("2")){
				 * sumotherFee=needFee+unDenizenFee+guFee;
				 * PowerRateFee=sumotherFee*AdjustRate;
				 * sumFee=needFee+unDenizenFee+guFee+PowerRateFee+dianJinFee+sanXiaFee+jiJinFee; }
				 */
			}

			LwCorporationSummaryDto lwCorporationSummaryDto = new LwCorporationSummaryDto();
			BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
			blLwCorporationSummaryFacade
					.deleteByConditions("1=1 and LineCode='" + UserNo + "'"
							+ "and StatMonth='" + inputDate + "'");
			lwCorporationSummaryDto.setLineCode(UserNo);
			lwCorporationSummaryDto.setStatMonth(inputDate);
			lwCorporationSummaryDto.setPowerClass("3");

			lwCorporationSummaryDto.setLossQuantity(TransLosspower);
			
			/**
			 * modify by qiaoyouliang 2009-03-31 beijing begin
			 * 大工业计算增加套表保存 
			 */
			lwCorporationSummaryDto.setTaobiaoFee(PowerFeeCal.getValue(taobiaoFee, AppConst.TWO_DOT_FLAG));
			lwCorporationSummaryDto.setTaobiaoPrice(taobiaoPrice);
			lwCorporationSummaryDto.setTaobiaoQuantity(PowerFeeCal.getValue(taobiaoQuantity, AppConst.ZERO_DOT_FLAG));
			lwCorporationSummaryDto.setTaobiaoflag(taoBiaoFlag);
			
			BLLwAmmeterChangeFacade blLwAmmeterChangeFacade1 = new BLLwAmmeterChangeFacade();
			Integer index =  commonDto.getInteger();
			if(index!=null){
			String ammeterNo = AmmeterNo[index];
			Collection taoBiaoList = blLwAmmeterChangeFacade1.findByConditions("ammeterNo = '"+ammeterNo+"'");
			Iterator<LwAmmeterChangeDto> it = taoBiaoList.iterator();
			if(it.hasNext()){
			lwCorporationSummaryDto.setTaobiaoName(((LwAmmeterChangeDto)it.next()).getFactoryName());
			}
			}
			/**
			 * modify by qiaoyouliang 2009-03-31 beijing end
			 *  大工业计算增加套表保存
			 */
			lwCorporationSummaryDto.setElectricQuantity(sumpower);
			lwCorporationSummaryDto.setSanXiaFee(sanXiaFee);
			lwCorporationSummaryDto.setSurcharge(jiJinFee);
			
			lwCorporationSummaryDto.setPowerFee(dianJinFee);
			lwCorporationSummaryDto.setUnDenizenFee(unDenizenFee);
			lwCorporationSummaryDto.setUnDenizenPrice(pepolePrice);
			lwCorporationSummaryDto.setUnDenizenQuantity(unDenizenFeePower);
			lwCorporationSummaryDto.setUserNo(UserName);
			lwCorporationSummaryDto.setUnLossQuantity(unTransLosspower);
			if (AmmeterStyle.equals("0")) {
				lwCorporationSummaryDto.setPointerQuantity(isPointerQuantity);
				lwCorporationSummaryDto.setPointerFee(PointerFee);
			}
			lwCorporationSummaryDto.setPointerPrice(factoryprice);

			lwCorporationSummaryDto.setAjustRate(RateCode);
			lwCorporationSummaryDto.setPowerRateFee(PowerRateFee);
			lwCorporationSummaryDto.setRateCode(AdjustRate);
			lwCorporationSummaryDto.setSurchargePrice(0.0051);
			lwCorporationSummaryDto.setSanXiaPrice(0.004);
			lwCorporationSummaryDto.setPowerPrice(0.02);
			lwCorporationSummaryDto.setUnPointerQuantity(UnPointerQuantity);
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				lwCorporationSummaryDto.setNeedPointer(Double
						.parseDouble(NeedPointer));
			}
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				lwCorporationSummaryDto.setNeedFee(needFee);
				lwCorporationSummaryDto.setNeedPrice(needPrice);
				lwCorporationSummaryDto.setNeedQuantity(needPower);
				lwCorporationSummaryDto.setFlag("1");

			}
			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {
				lwCorporationSummaryDto.setContentFee(contentFee);
				lwCorporationSummaryDto.setContentPrice(contentPrice);
				lwCorporationSummaryDto.setContentQuantity(contentPower);
				lwCorporationSummaryDto.setFlag("2");
			}
			lwCorporationSummaryDto.setSumPointerQuantity(PointerQuantity);
			lwCorporationSummaryDto.setUserNo(UserName);
			lwCorporationSummaryDto.setSumFee(sumFee);
			lwCorporationSummaryDto.setIfchange("0");
			
			
			if (AmmeterStyle.equals("1")) {
				lwCorporationSummaryDto.setPeakQuantity(PeakQuantity);
				lwCorporationSummaryDto.setPeakPrice(factoryprice);
				lwCorporationSummaryDto.setPeakFee(fengFee);
				lwCorporationSummaryDto.setQuantityStyle("1");
			}
	
			blLwCorporationSummaryFacade.insert(lwCorporationSummaryDto);
			BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();
			for (int i = 0; i < AmmeterNo.length; i++) {
				String conditiona = "flag=1 and  AmmeterNo='" + AmmeterNo[i]
						+ "'" + " and userNo='" + UserNo + "'";
				Collection faca = blLwAmmeterChangeFacade
						.findByConditions(conditiona);
				Iterator fa = faca.iterator();
				while (fa.hasNext()) {
					LwAmmeterChangeDto lwAmmeterChangeDto = (LwAmmeterChangeDto) fa
							.next();
					lwAmmeterChangeDto.setRate(Rate[i]);
					blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
				}
				/*
				 * if(pepolepowerStyle.equals("1")){
				 * 
				 * String conditionb="flag=1 and USESTYLE=1 and
				 * userNo='"+UserNo+"'"; Collection
				 * facb=blLwAmmeterChangeFacade.findByConditions(conditionb);
				 * Iterator fb=facb.iterator(); while(fb.hasNext()){
				 * LwAmmeterChangeDto
				 * lwAmmeterChangeDto=(LwAmmeterChangeDto)fb.next();
				 * lwAmmeterChangeDto.setRate(PeopleRate);
				 * blLwAmmeterChangeFacade.update(lwAmmeterChangeDto); }
				 */
			}
			for (int i = 0; i < AmmeterNo.length; i++) {
				String conditionx = " 1=1 and userNo='" + UserNo + "'"
						+ " and  AmmeterNo='" + AmmeterNo[i] + "'";
				if (workQuantity[i].equals("") || workQuantity[i] == null) {
					workQuantity[i] = "0";
				}
				if (unworkQuantity[i].equals("") || unworkQuantity[i] == null) {
					unworkQuantity[i] = "0";
				}
				if (LastWorkNum[i].equals("") || LastWorkNum[i] == null) {
					LastWorkNum[i] = "0";
				}
				if (ThisWorkNum[i].equals("") || ThisWorkNum[i] == null) {
					ThisWorkNum[i] = "0";
				}
				if (LastIdleNum[i].equals("") || LastIdleNum[i] == null) {
					LastIdleNum[i] = "0";
				}
				if (ThisIdleNum[i].equals("") || ThisIdleNum[i] == null) {
					ThisIdleNum[i] = "0";
				}
				if (Rate[i].equals("") || Rate[i] == null) {
					Rate[i] = "0";
				}

				
				Collection factory = new ArrayList();
				
				factory = blLwNewFactoryIndicatorFacade
						.findByConditions(conditionx);
				Iterator fc = factory.iterator();
				while (fc.hasNext()) {
					lwNewFactoryIndicatorDto = (LwNewFactoryIndicatorDto) fc
							.next();
					lwNewFactoryIndicatorDto.setThisWorkNum(Double
							.parseDouble(ThisWorkNum[i]));
					lwNewFactoryIndicatorDto.setThisIdleNum(Double
							.parseDouble(ThisIdleNum[i]));
					lwNewFactoryIndicatorDto.setRate(Double
							.parseDouble(Rate[i]));
					lwNewFactoryIndicatorDto.setLastWorkNum(Double
							.parseDouble(LastWorkNum[i]));
					lwNewFactoryIndicatorDto.setLastIdleNum(Double
							.parseDouble(LastIdleNum[i]));
					lwNewFactoryIndicatorDto.setWorkQuantity(workQuantity[i]);
					lwNewFactoryIndicatorDto
							.setUnworkQuantity(unworkQuantity[i]);
					blLwNewFactoryIndicatorFacade
							.update(lwNewFactoryIndicatorDto);
				}
			}
		}
		if (stopProduce.equals("1")) {
			/**
			 * modify by qiaoyouliang 2009-03-31 beijing begin 大工业计算增加套表-定义
			 */
			double taobiaoQuantity = 0D;// 套表电量
			double taobiaoFee = 0D;// 套表电费
			double taobiaoPrice = 0D; // 大工业电价
			/**
			 * modify by qiaoyouliang 2009-03-31 beijing end 大工业计算增加套表-定义
			 */
			double PointerQuantity = 0; // 抄见电量
			double unDenizenFeePower = 0;// 居民电量
			double rongliangQuantity = 0;
			double ammeterDuzenPower = 0;
			double unchangePointerQuantity = 0;// 生产状态变化前指针电量
			double unchangeunPointerQuantity = 0;// 生产状态变化前无功电量
			double changePointerQuantity = 0;// 生产状态变化后指针电量
			double changeunPointerQuantity = 0;// 生产状态变化后指针电量
			double contentPrice = 0;
			double changecontentPrice = 0;
			double calday = 0;
			double uncalday = 0;
			double dianjinPrice = 0;
			double changedianjinPrice = 0;
			if (state.equals("1")) {
				dianjinPrice = lwCoporationUserInfoDto
						.getShengChandianJinPrice();
			}
			if (state.equals("2")) {
				dianjinPrice = lwCoporationUserInfoDto
						.getTingChandianJinPrice();
			}
			if (changestate.equals("1")) {
				changedianjinPrice = lwCoporationUserInfoDto
						.getShengChandianJinPrice();
			}
			if (changestate.equals("2")) {
				changedianjinPrice = lwCoporationUserInfoDto
						.getTingChandianJinPrice();
			}
			String PeopleQuantity = "0";
			if (lwCoporationUserInfoDto.getPepoleFlag().equals("1")) {
				PeopleQuantity = "0";
			}
			if (lwCoporationUserInfoDto.getPepoleFlag().equals("2")) {
				PeopleQuantity = lwCoporationUserInfoDto.getPepolePower();
			}

			if (changeChgAmmeterQuantity.equals("")
					|| changeChgAmmeterQuantity == null) {
				changeChgAmmeterQuantity = "0";
			}
			if (changeUnChgAmmeterQuantity.equals("")
					|| changeUnChgAmmeterQuantity == null) {
				changeUnChgAmmeterQuantity = "0";
			}
			if (changeCompensateQuantity.equals("")
					|| changeCompensateQuantity == null) {
				changeCompensateQuantity = "0";
			}
			if (changeUnCompensateQuantity.equals("")
					|| changeUnCompensateQuantity == null) {
				changeUnCompensateQuantity = "0";
			}
			changePointerQuantity = Math.round((Double
					.parseDouble(changeThisWorkNum) - Double
					.parseDouble(changeLastWorkNum))
					* Double.parseDouble(changeRate)
					+ Double.parseDouble(changeChgAmmeterQuantity)
					+ Double.parseDouble(changeCompensateQuantity));
			changeunPointerQuantity = Math.round((Double
					.parseDouble(changeThisIdleNum) - Double
					.parseDouble(changeLastIdleNum))
					* Double.parseDouble(changeRate)
					+ Double.parseDouble(changeUnChgAmmeterQuantity)
					+ Double.parseDouble(changeUnCompensateQuantity));
			
			
			for (int i = 0; i < AmmeterNo.length; i++) {
				if (ChgAmmeterQuantity[i].equals("")
						|| ChgAmmeterQuantity[i] == null) {
					ChgAmmeterQuantity[i] = "0";
				}
				if (UnChgAmmeterQuantity[i].equals("")
						|| UnChgAmmeterQuantity[i] == null) {
					UnChgAmmeterQuantity[i] = "0";
				}
				if (CompensateQuantity[i].equals("")
						|| CompensateQuantity[i] == null) {
					ChgAmmeterQuantity[i] = "0";
				}
				if (unCompensateQuantity[i].equals("")
						|| unCompensateQuantity[i] == null) {
					unCompensateQuantity[i] = "0";
				}
				if (useStyle[i].equals("0")) {
					unchangePointerQuantity = Math.round((Double
							.parseDouble(ThisWorkNum[i]) - Double
							.parseDouble(LastWorkNum[i]))
							* Double.parseDouble(Rate[i])
							+ Double.parseDouble(ChgAmmeterQuantity[i])
							+ Double.parseDouble(CompensateQuantity[i]));
					unchangeunPointerQuantity = Math.round((Double
							.parseDouble(ThisIdleNum[i]) - Double
							.parseDouble(LastIdleNum[i]))
							* Double.parseDouble(Rate[i])
							+ Double.parseDouble(UnChgAmmeterQuantity[i])
							+ Double.parseDouble(unCompensateQuantity[i]));
				}
				if (useStyle[i].equals("1")) {

					ammeterDuzenPower += Math.round((Double
							.parseDouble(ThisWorkNum[i]) - Double
							.parseDouble(LastWorkNum[i]))
							* Double.parseDouble(Rate[i])
							+ Double.parseDouble(ChgAmmeterQuantity[i])
							+ Double.parseDouble(CompensateQuantity[i])
							+ Double.parseDouble(PeopleQuantity));
				}
			}
			unDenizenFeePower = Math.round(ammeterDuzenPower
					+ Double.parseDouble(PeopleQuantity));
			/*
			 * BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade=new
			 * BLLwCoporationUserInfoFacade(); LwCoporationUserInfoDto
			 * lwCoporationUserInfoDto=blLwCoporationUserInfoFacade.findByPrimaryKey(UserNo);
			 */

			/*
			 * if(TransLoss.equals("")||TransLoss==null){ TransLoss="0"; }
			 */

			/*
			 * if(PepoleUnChgAmmeterQuantity.equals("")||PepoleUnChgAmmeterQuantity==null){
			 * PepoleUnChgAmmeterQuantity="0"; }
			 */
	   		/*
			 * if(RongliangQuantity.equals("")||RongliangQuantity==null){
			 * rongliangQuantity=0; }else{
			 * rongliangQuantity=Double.parseDouble(RongliangQuantity); }
			 */
			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {

				contentPrice = powerFeeCal.rongLiangPrice(state, UserNo);

				changecontentPrice = powerFeeCal.rongLiangPrice(changestate,
						UserNo);
				rongliangQuantity = lwCoporationUserInfoDto.getRongliangPower();
			}

			if (day.equals("") || day == null) {
				calday = 0;
			} else {
				calday = Double.parseDouble(day);
			}
			if (changeday.equals("") || changeday == null) {
				uncalday = 0;
			} else {
				uncalday = Double.parseDouble(day);
			}
			/*
			 * if(pepolepowerStyle.equals("0")){
			 * unDenizenFeePower=Math.round(Double.parseDouble(PeopleQuantity)+Double.parseDouble(PepoleUnChgAmmeterQuantity)+Double.parseDouble(otherPeopleQuantity));
			 * if(AmmeterStyle.equals("0")){
			 * unchangePointerQuantity=Math.round((Double.parseDouble(ThisWorkNum)-Double.parseDouble(LastWorkNum))*Double.parseDouble(Rate));
			 * unchangePointerQuantity=Math.round((Double.parseDouble(changeThisWorkNum)-Double.parseDouble(changeLastWorkNum))*Double.parseDouble(Rate));
			 * }else{
			 * unchangePointerQuantity=Math.round((Double.parseDouble(ThisWorkNum)-Double.parseDouble(LastWorkNum))*Double.parseDouble(Rate));
			 * unchangePointerQuantity=Math.round((Double.parseDouble(changeThisWorkNum)-Double.parseDouble(changeLastWorkNum))*Double.parseDouble(Rate)); } }
			 * if(pepolepowerStyle.equals("1")){
			 * 
			 * unDenizenFeePower=Math.round((Double.parseDouble(PeopleThisWorkNum)-Double.parseDouble(PeopleLastWorkNum))*Double.parseDouble(PeopleRate)+Double.parseDouble(PepoleUnChgAmmeterQuantity)+Double.parseDouble(otherPeopleQuantity));
			 * if(AmmeterStyle.equals("0")){
			 * unchangePointerQuantity=(Double.parseDouble(ThisWorkNum)-Double.parseDouble(LastWorkNum))*Double.parseDouble(Rate);
			 * changePointerQuantity=(Double.parseDouble(changeThisWorkNum)-Double.parseDouble(changeLastWorkNum))*Double.parseDouble(Rate);
			 * }else{
			 * unchangePointerQuantity=(Double.parseDouble(ThisWorkNum)-Double.parseDouble(LastWorkNum))*Double.parseDouble(Rate);
			 * changePointerQuantity=(Double.parseDouble(changeThisWorkNum)-Double.parseDouble(changeLastWorkNum))*Double.parseDouble(Rate); } }
			 */
			/*
			 * else{
			 * unDenizenFeePower=(Double.parseDouble(PeopleThisWorkNum)-Double.parseDouble(PeopleLastWorkNum))*Double.parseDouble(PeopleRate);
			 * PointerQuantity=(Double.parseDouble(ThisWorkNum)-Double.parseDouble(LastWorkNum))*Double.parseDouble(Rate)-(Double.parseDouble(PeopleThisWorkNum)-Double.parseDouble(PeopleLastWorkNum))*Double.parseDouble(PeopleRate); }
			 */
			double PeakQuantity = 0; // 峰段电量
			double ValleyQuantity = 0;// 谷段电量
			/*
			 * if(TransLoss==null||TransLoss.equals("")){ TransLoss="0"; }
			 */
			double TransLosspower = (unchangePointerQuantity + changePointerQuantity)
					* TransLoss / 100;
			double unTransLosspower = (unchangeunPointerQuantity + changeunPointerQuantity)
					* TransLoss / 100;
			if (AmmeterStyle.equals("1")) {

				PeakQuantity = (unchangePointerQuantity + changePointerQuantity)
						- unDenizenFeePower - TransLosspower;

			}
			
			PointerQuantity = unchangePointerQuantity + changePointerQuantity;
			double isPointerQuantity = (unchangePointerQuantity + changePointerQuantity)
					- unDenizenFeePower;
			double UnPointerQuantity = unchangeunPointerQuantity;
			double AdjustRate = powerFeeCal.poweradjustmentCorporationValue(
					String.valueOf(PointerQuantity), String
							.valueOf(UnPointerQuantity), "3");
			double RateCode = powerFeeCal.poweradjustrate(String
					.valueOf(PointerQuantity), String
					.valueOf(UnPointerQuantity));
			double contentPower = 0;
			double needPower = 0;
			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {
				if (RongliangQuantity == null || RongliangQuantity.equals("")) {
					RongliangQuantity = "0";
				} else {
					contentPower = Double.parseDouble(RongliangQuantity);
				}
			}
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				if (NeedPointer == null || NeedPointer.equals("")) {
					NeedPointer = "0";
				} else {
					needPower = Double.parseDouble(NeedPointer)
							* Double.parseDouble(NeedRate);
				}
			}

			double sumpower = 0;
			if (AmmeterStyle.equals("1")) {
				sumpower = (unchangePointerQuantity + changePointerQuantity)
						- TransLosspower;

			}
			if (AmmeterStyle.equals("0")) {
				sumpower = PointerQuantity - TransLosspower;
			}

			double factoryprice = powerFeeCal.corporationPrice(state, UserNo);
			double changefactoryprice = powerFeeCal.corporationPrice(
					changestate, UserNo);
			double pepolePrice = powerFeeCal.factoryPeoplePrice(UserNo);
			double needPrice = 0;
			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {
				needPrice = powerFeeCal.xuliangFee(UserNo);
			}
			double unDenizenFee = unDenizenFeePower * pepolePrice;
			double needFee = 0;
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				needFee = needPower * needPrice;
			}
			double contentFee = 0;
			/**
			 * 计算大工业停产时改变容量 begin
			 */
			// 查找指针用户
			Collection <LwNewFactoryIndicatorDto>indicatorList = null;
			
			indicatorList = blLwNewFactoryIndicatorFacade.findByConditions("userNo = '"+UserNo+"'");
			Iterator<LwNewFactoryIndicatorDto> it = indicatorList.iterator();
			LwNewFactoryIndicatorDto o	 = null;
			if(it.hasNext()){
				 o	 = 	(LwNewFactoryIndicatorDto)it.next();
			}
			// 容量改变电量
			double rlquantityaf = o.getRlquantityaf();
			// 大工业生产时的容量电费
			double beginContentFee = 0D;
			double endContentFee = 0D;
			
			contentPrice = powerFeeCal.rongLiangPrice(state, UserNo);
			changecontentPrice = powerFeeCal.rongLiangPrice(changestate,
					UserNo);
			// 容量电量发生改变时，进行更新。
			lwCoporationUserInfoDto.setRongliangPower(new Double(rlquantityaf).intValue());
			blLwCoporationUserInfoFacade.update(lwCoporationUserInfoDto);
			// 大工业停产时的容量电费
			
			if (lwCoporationUserInfoDto.getIndustryType().endsWith("1")) {
				beginContentFee = contentPower * contentPrice * calday / 30;
				endContentFee = rlquantityaf * changecontentPrice * uncalday / 30;
				contentFee = beginContentFee + endContentFee;
				contentPower = (contentPower + rlquantityaf)/2;
			}
			
			
			/**
			 * 计算大工业停产时改变容量 end
			 */
			/**
			 * modify by qiaoyouliang 2009-03-31 beijing begin 大工业计算增加套表-套表电量
			 */
			isPointerQuantity = 0D;
			String taoBiaoFlag = AppConst.NOT_TAOBIAO_FLAG;
			// 声明通用Dto
			CommonDto commonDto = new CommonDto();
			taobiaoQuantity = this.getTaoBiaoQuantity(AmmeterNo, ThisWorkNum,
					LastWorkNum, Rate, useStyle, ChgAmmeterQuantity,
					CompensateQuantity,taoBiaoFlag,commonDto);
			// 生产 - > 停产
			double factoryPriceFee = 0D;
			double factoryPriceQuantity = 0D;
			if(AppConst.START_PRODUCE_VALUE.equals(state)){
				// 生产转停产
				isPointerQuantity = unchangePointerQuantity;
				factoryPriceQuantity = changePointerQuantity;
				factoryPriceFee =  factoryPriceQuantity * powerFeeCal.factorySalePrice(lwCoporationUserInfoDto.getVoltage(), AppConst.METERIALS_TYPE_0);
			}else{
				isPointerQuantity = changePointerQuantity;
				factoryPriceQuantity = unchangePointerQuantity - unDenizenFeePower;
			}
//			isPointerQuantity = Math.round(PointerQuantity - unDenizenFeePower
//					- taobiaoQuantity);
			String taoPriceType = AppConst.METERIALS_TYPE_0;
			taobiaoPrice = powerFeeCal.factorySalePrice(lwCoporationUserInfoDto.getVoltage(), taoPriceType);
			taobiaoFee = taobiaoQuantity * taobiaoPrice;
			
			
			/**
			 * modify by qiaoyouliang 2009-03-31 beijing end 大工业计算增加套表-套表电量
			 */
			// 生产时有功电量 = 停产前有功电量 + 停产后有功电量 - 非居民电量 - （停产后电量 + 套表电量）；
			double tempIsPointerQuantity = isPointerQuantity + changePointerQuantity - unDenizenFeePower - (changePointerQuantity + taobiaoQuantity);
			double PointerFee = (isPointerQuantity + changePointerQuantity - unDenizenFeePower - (changePointerQuantity + taobiaoQuantity)) * factoryprice ;
			
			double fengFee = (unchangePointerQuantity - unchangePointerQuantity
					* TransLoss / 100)
					* factoryprice;
			double changefengFee = (changePointerQuantity - changePointerQuantity
					* TransLoss / 100)
					* changefactoryprice;
			double guFee = ValleyQuantity * factoryprice;
			double dianJinFee = 0;
			double changePointerFee = changePointerQuantity
					* changefactoryprice;
			dianJinFee = (unchangePointerQuantity - unchangePointerQuantity
					* TransLoss / 100)
					* dianjinPrice
					+ (changePointerQuantity - changePointerQuantity
							* TransLoss / 100)
					* changedianjinPrice
					+ unDenizenFeePower * dianjinPrice;// 电金
			// 电金电量
			dianJinFee = (unDenizenFeePower + taobiaoQuantity + changePointerQuantity) * dianjinPrice;
			double sanXiaFee = sumpower * 0.004;// 三峡金
			double jiJinFee = sumpower * 0.0051;// 基金
			double sumFee = 0;
			double sumotherFee = 0;// 利率电费

			double PowerRateFee = 0;
			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {
				if (AmmeterStyle.equals("0")) {
					sumotherFee = contentFee + unDenizenFee + PointerFee+ taobiaoFee;
					PowerRateFee = sumotherFee * AdjustRate;
//					sumFee = contentFee + unDenizenFee + PointerFee
//							+ PowerRateFee + dianJinFee + sanXiaFee + jiJinFee+ taobiaoFee;
					
					sumFee = contentFee + unDenizenFee+dianJinFee + sanXiaFee + jiJinFee+PowerRateFee+PointerFee+factoryPriceFee+taobiaoFee;
				}
				if (AmmeterStyle.equals("1")) {
					sumotherFee = contentFee + unDenizenFee + fengFee
							+ changefengFee+ taobiaoFee;
					PowerRateFee = sumotherFee * AdjustRate;
					sumFee = contentFee + unDenizenFee + fengFee
							+ changefengFee + PowerRateFee + dianJinFee
							+ sanXiaFee + jiJinFee+ taobiaoFee;
				}
			}
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				if (AmmeterStyle.equals("0")) {
					sumotherFee = needFee + unDenizenFee + PointerFee;
					PowerRateFee = sumotherFee * AdjustRate;
					sumFee = needFee + unDenizenFee + PointerFee + PowerRateFee
							+ dianJinFee + sanXiaFee + jiJinFee+ taobiaoFee;
				}
				if (AmmeterStyle.equals("1")) {
					sumotherFee = needFee + unDenizenFee + fengFee
							+ changefengFee;
					PowerRateFee = sumotherFee * AdjustRate;
					sumFee = needFee + unDenizenFee + fengFee + changefengFee
							+ PowerRateFee + dianJinFee + sanXiaFee + jiJinFee+ taobiaoFee;
				}
			}

			LwCorporationSummaryDto lwCorporationSummaryDto = new LwCorporationSummaryDto();
			BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();

			blLwCorporationSummaryFacade
					.deleteByConditions("1=1 and LineCode='" + UserNo + "'"
							+ "and StatMonth='" + inputDate + "'");
			lwCorporationSummaryDto.setLineCode(UserNo);
			lwCorporationSummaryDto.setStatMonth(inputDate);
			lwCorporationSummaryDto.setUnLossQuantity(unTransLosspower);
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				lwCorporationSummaryDto.setNeedPointer(Double
						.parseDouble(NeedPointer));
			}
			lwCorporationSummaryDto.setPowerClass("3");

			/*
			 * if(!TransLoss.equals("")||TransLoss!=null||!TransLoss.equals("0")){
			 * 
			 * lwCorporationSummaryDto.setLossQuantity(TransLosspower); }
			 */
			
			/**
			 * modify by qiaoyouliang 2009-05-26 beijing begin
			 * 大工业计算增加套表保存 
			 */
			lwCorporationSummaryDto.setTaobiaoFee(PowerFeeCal.getValue(taobiaoFee, AppConst.TWO_DOT_FLAG));
			lwCorporationSummaryDto.setTaobiaoPrice(taobiaoPrice);
			lwCorporationSummaryDto.setTaobiaoQuantity(PowerFeeCal.getValue(taobiaoQuantity, AppConst.ZERO_DOT_FLAG));
			lwCorporationSummaryDto.setTaobiaoflag(taoBiaoFlag);
			
			BLLwAmmeterChangeFacade blLwAmmeterChangeFacade1 = new BLLwAmmeterChangeFacade();
			Integer index =  commonDto.getInteger();
			if(index!=null){
			String ammeterNo = AmmeterNo[index];
			Collection taoBiaoList = blLwAmmeterChangeFacade1.findByConditions("ammeterNo = '"+ammeterNo+"'");
			Iterator<LwAmmeterChangeDto> ittaobiao = taoBiaoList.iterator();
			if(ittaobiao.hasNext()){
			lwCorporationSummaryDto.setTaobiaoName(((LwAmmeterChangeDto)ittaobiao.next()).getFactoryName());
			}
			}
			/**
			 * modify by qiaoyouliang 2009-05-26 beijing end
			 *  大工业计算增加套表保存
			 */
			lwCorporationSummaryDto.setElectricQuantity(sumpower);
			lwCorporationSummaryDto.setSanXiaFee(sanXiaFee);
			lwCorporationSummaryDto.setSurcharge(jiJinFee);
			lwCorporationSummaryDto.setPowerFee(dianJinFee);
			lwCorporationSummaryDto.setUnDenizenFee(unDenizenFee);
			lwCorporationSummaryDto.setUnDenizenPrice(pepolePrice);
			lwCorporationSummaryDto.setUnDenizenQuantity(unDenizenFeePower);
			lwCorporationSummaryDto.setUserNo(UserName);
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				lwCorporationSummaryDto.setNeedPointer(Double
						.parseDouble(NeedPointer));
			}
			if (AmmeterStyle.equals("0")) {
				lwCorporationSummaryDto.setPointerQuantity(isPointerQuantity);
				lwCorporationSummaryDto.setPointerFee(PointerFee);
			}
			lwCorporationSummaryDto.setPointerPrice(factoryprice);

			lwCorporationSummaryDto.setAjustRate(RateCode);
			lwCorporationSummaryDto.setPowerRateFee(PowerRateFee);
			lwCorporationSummaryDto.setRateCode(AdjustRate);
			lwCorporationSummaryDto.setSurchargePrice(0.0051);
			lwCorporationSummaryDto.setSanXiaPrice(0.004);
			lwCorporationSummaryDto.setPowerPrice(0.02);
			lwCorporationSummaryDto.setUnPointerQuantity(UnPointerQuantity);
			if (lwCoporationUserInfoDto.getIndustryType().equals("2")) {
				lwCorporationSummaryDto.setNeedFee(needFee);
				lwCorporationSummaryDto.setNeedPrice(needPrice);
				lwCorporationSummaryDto.setNeedQuantity(needPower);
				lwCorporationSummaryDto.setFlag("1");

			}
			if (lwCoporationUserInfoDto.getIndustryType().equals("1")) {
				lwCorporationSummaryDto.setContentFee(contentFee);
				lwCorporationSummaryDto.setContentPrice(contentPrice);
				lwCorporationSummaryDto.setContentQuantity(contentPower);
				lwCorporationSummaryDto.setFlag("2");
			}

			lwCorporationSummaryDto.setSumPointerQuantity(PointerQuantity);
			// lwCorporationSummaryDto.setUserNo(UserName);
			lwCorporationSummaryDto.setSumFee(sumFee);
			lwCorporationSummaryDto.setIfchange("1");
			if (AmmeterStyle.equals("0")) {
				lwCorporationSummaryDto.setBeforPower(tempIsPointerQuantity);
				lwCorporationSummaryDto.setBeforPrice(factoryprice);
				lwCorporationSummaryDto.setBeforFee(PointerFee);
				lwCorporationSummaryDto.setLastFee(factoryPriceFee);
				lwCorporationSummaryDto.setLastPrice(changefactoryprice);
				lwCorporationSummaryDto.setLastPower(factoryPriceQuantity);
				lwCorporationSummaryDto.setQuantityStyle("1");
			}
			if (AmmeterStyle.equals("1")) {
				lwCorporationSummaryDto.setBeforPower(unchangePointerQuantity
						- unchangePointerQuantity * TransLoss / 100);
				lwCorporationSummaryDto.setBeforPrice(factoryprice);
				lwCorporationSummaryDto.setBeforFee(fengFee);
				lwCorporationSummaryDto.setLastFee(changefengFee);
				lwCorporationSummaryDto.setLastPrice(changefactoryprice);
				lwCorporationSummaryDto.setLastPower(changePointerQuantity
						- changePointerQuantity * TransLoss / 100);
				lwCorporationSummaryDto.setQuantityStyle("1");
			}

			blLwCorporationSummaryFacade.insert(lwCorporationSummaryDto);
			BLLwAmmeterChangeFacade blLwAmmeterChangeFacade = new BLLwAmmeterChangeFacade();

			for (int i = 0; i < AmmeterNo.length; i++) {
				String conditiona = "flag=1 and  AmmeterNo='" + AmmeterNo[i]
						+ "'" + " and userNo='" + UserNo + "'";
				Collection faca = blLwAmmeterChangeFacade
						.findByConditions(conditiona);
				Iterator fa = faca.iterator();
				while (fa.hasNext()) {
					LwAmmeterChangeDto lwAmmeterChangeDto = (LwAmmeterChangeDto) fa
							.next();
					lwAmmeterChangeDto.setRate(Rate[i]);
					blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
				}
				/*
				 * if(pepolepowerStyle.equals("1")){
				 * 
				 * String conditionb="flag=1 and USESTYLE=1 and
				 * userNo='"+UserNo+"'"; Collection
				 * facb=blLwAmmeterChangeFacade.findByConditions(conditionb);
				 * Iterator fb=facb.iterator(); while(fb.hasNext()){
				 * LwAmmeterChangeDto
				 * lwAmmeterChangeDto=(LwAmmeterChangeDto)fb.next();
				 * lwAmmeterChangeDto.setRate(PeopleRate);
				 * blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
				 * changeThisWorkNum changeThisIdleNum }
				 */
			}
			for (int i = 0; i < AmmeterNo.length; i++) {
				String conditionx = " 1=1 and userNo='" + UserNo + "'"
						+ " and  AmmeterNo='" + AmmeterNo[i] + "'";
				if (workQuantity[i].equals("") || workQuantity[i] == null) {
					workQuantity[i] = "0";
				}
				if (unworkQuantity[i].equals("") || unworkQuantity[i] == null) {
					unworkQuantity[i] = "0";
				}
				if (LastWorkNum[i].equals("") || LastWorkNum[i] == null) {
					LastWorkNum[i] = "0";
				}
				if (ThisWorkNum[i].equals("") || ThisWorkNum[i] == null) {
					ThisWorkNum[i] = "0";
				}
				if (LastIdleNum[i].equals("") || LastIdleNum[i] == null) {
					LastIdleNum[i] = "0";
				}
				if (ThisIdleNum[i].equals("") || ThisIdleNum[i] == null) {
					ThisIdleNum[i] = "0";
				}

				Collection factory = new ArrayList();
				
				factory = blLwNewFactoryIndicatorFacade
						.findByConditions(conditionx);
				Iterator fc = factory.iterator();
				while (fc.hasNext()) {
					lwNewFactoryIndicatorDto = (LwNewFactoryIndicatorDto) fc
							.next();
					if (lwNewFactoryIndicatorDto.getAmmeterStyle().equals("0")) {
						lwNewFactoryIndicatorDto.setThisWorkNum(Double
								.parseDouble(changeThisWorkNum));
						lwNewFactoryIndicatorDto.setThisIdleNum(Double
								.parseDouble(changeThisIdleNum));
						lwNewFactoryIndicatorDto.setRate(Double
								.parseDouble(Rate[i]));
						lwNewFactoryIndicatorDto.setLastWorkNum(Double
								.parseDouble(LastWorkNum[i]));
						lwNewFactoryIndicatorDto.setLastIdleNum(Double
								.parseDouble(LastIdleNum[i]));
						lwNewFactoryIndicatorDto.setWorkQuantity(String
								.valueOf(PointerQuantity));
						lwNewFactoryIndicatorDto.setUnworkQuantity(String
								.valueOf(UnPointerQuantity));
						blLwNewFactoryIndicatorFacade
								.update(lwNewFactoryIndicatorDto);
					}
					if (lwNewFactoryIndicatorDto.getAmmeterStyle().equals("1")) {
						lwNewFactoryIndicatorDto.setThisWorkNum(Double
								.parseDouble(ThisWorkNum[i]));
						lwNewFactoryIndicatorDto.setThisIdleNum(Double
								.parseDouble(ThisIdleNum[i]));
						lwNewFactoryIndicatorDto.setRate(Double
								.parseDouble(Rate[i]));
						lwNewFactoryIndicatorDto.setLastWorkNum(Double
								.parseDouble(LastWorkNum[i]));
						lwNewFactoryIndicatorDto.setLastIdleNum(Double
								.parseDouble(LastIdleNum[i]));
						lwNewFactoryIndicatorDto
								.setWorkQuantity(workQuantity[i]);
						lwNewFactoryIndicatorDto
								.setUnworkQuantity(unworkQuantity[i]);
						blLwNewFactoryIndicatorFacade
								.update(lwNewFactoryIndicatorDto);
					}
				}
			}

		}
		String condition = " 1=1";

		condition += " and StatMonth = '" + inputDate + "'";

		condition += " and linecode='" + UserNo + "'";
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade = new BLLwCorporationSummaryFacade();
		LwCorporationSummaryDto LwCorporationSummaryDto2 = blLwCorporationSummaryFacade
				.findByPrimaryKey(UserNo, inputDate);
		httpServletRequest.setAttribute("LwCorporationSummaryDto2",
				LwCorporationSummaryDto2);
		return actionMapping.findForward("showCorporation");

	}

	/**
	 * 得到套表电量
	 * 
	 * @param AmmeterNo
	 *            表号
	 * @param ThisWorkNum
	 *            本月有功
	 * @param LastWorkNum
	 *            上月有功
	 * @param Rate
	 *            倍率
	 * @param useStyle
	 *            电表类型 0-大工业；1-居民；2-套表
	 * @param ChgAmmeterQuantity
	 *            换表电量
	 * @param CompensateQuantity
	 *            退补电量
	 * @return 套表电量
	 */
	public double getTaoBiaoQuantity(String[] AmmeterNo, String ThisWorkNum[],
			String LastWorkNum[], String Rate[], String useStyle[],
			String ChgAmmeterQuantity[], String CompensateQuantity[],String taoBiaoFlag,CommonDto commonDto) {
		double taoQuantity = 0D;
		for (int i = 0; i < AmmeterNo.length; i++) {

			if (AppConst.USERSTYLE_TAOBIAO_2.equals(useStyle[i])) {
				taoQuantity += Math
						.round((Double.parseDouble(ThisWorkNum[i]) - Double
								.parseDouble(LastWorkNum[i]))
								* Double.parseDouble(Rate[i])
								+ Double.parseDouble(ChgAmmeterQuantity[i])
								+ Double.parseDouble(CompensateQuantity[i]));
				
				taoBiaoFlag = "1";
				commonDto.setInteger(i);
			}

		}
		
		return taoQuantity;
	}


	/**
	 * 得到容量电费
	 * @return
	 */
	public double getContentFee(double contentPower){
		return 0;
	}
}
