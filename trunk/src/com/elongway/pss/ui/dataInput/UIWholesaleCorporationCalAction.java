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

import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.dto.domain.LwindicatorDto;
import com.elongway.pss.util.PowerFeeCal;


public class UIWholesaleCorporationCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String industryId=httpServletRequest.getParameter("industryId");
		String inputDate=httpServletRequest.getParameter("inputDate");
		String wholesaleStyle=httpServletRequest.getParameter("wholesaleStyle");
		String LineCode=httpServletRequest.getParameter("LineCode");
		String MeritoriousPointer=httpServletRequest.getParameter("MeritoriousPointer");
		String  UnMeritoriousPointer=httpServletRequest.getParameter("UnMeritoriousPointer");
		String lossPower=httpServletRequest.getParameter("lossPower");
		String Dianliang =httpServletRequest.getParameter("Dianliang");
		//String powerClass =httpServletRequest.getParameter("powerClass");
		String CT =httpServletRequest.getParameter("CT");
		String PT =httpServletRequest.getParameter("PT");
		String powerClass="4";
		PowerFeeCal  powerFeeCal=new PowerFeeCal();
		double LossDianliang=0;
		//if(Dianliang.equals("")){
			//LossDianliang=0;
		//}else{
			//LossDianliang=Double.parseDouble(Dianliang);
		//}
		
		
		double meritoriousPointerPower=powerFeeCal.electrotherapy(MeritoriousPointer, UnMeritoriousPointer, powerClass, LineCode, inputDate)*Double.parseDouble(CT)*Double.parseDouble(PT);//有功电量
		//double sumPower=(meritoriousPointerPower)*powerFeeCal.getRateCode(LineCode)-LossDianliang;
		double unmeritoriousPointerPower=powerFeeCal.unelectrotherapy(MeritoriousPointer,UnMeritoriousPointer,powerClass,LineCode,inputDate)*Double.parseDouble(CT)*Double.parseDouble(PT);
		double RateCode=powerFeeCal.adjustmentValue(MeritoriousPointer, UnMeritoriousPointer, "4", LineCode, inputDate);//调整值
		double adjustrate=powerFeeCal.adjustrate(MeritoriousPointer, UnMeritoriousPointer, "4", LineCode, inputDate);//功率因素
		double meritoriousPointerFee=meritoriousPointerPower*0.3515;
		double PowerRateFee=meritoriousPointerFee*RateCode;
		double sumFee=meritoriousPointerFee+PowerRateFee;
		//String procondition="1=1 and userNo='"+LineCode+"'";
		//BLLwProrateFacade blLwProrateFacade=new BLLwProrateFacade();
		//LwProrateDto  lwProrateDto=new LwProrateDto();
		//Collection prorateCol=new ArrayList();
		//prorateCol=blLwProrateFacade.findByConditions(procondition);
		//Iterator prorate =prorateCol.iterator();
		//while(prorate.hasNext()){
		//	lwProrateDto=(LwProrateDto)prorate.next();
		//}
		//double agricultural=lwProrateDto.getAgricultural();//农灌比例
		//double produce=lwProrateDto.getProduce();//生产
		//double resident=lwProrateDto.getResident();//居民
		//double indecisive=lwProrateDto.getIndecisive();//非居民
		//double industry=lwProrateDto.getIndustry();//工业
		//double business=lwProrateDto.getBusiness();//商业
		//double agriculturalPower=sumPower*agricultural/100*powerFeeCal.getRateCode(LineCode);
		//double producePower=sumPower*produce/100*powerFeeCal.getRateCode(LineCode);
		//double residentPower=sumPower*resident/100*powerFeeCal.getRateCode(LineCode);
		//double indecisivePower=sumPower*indecisive/100*powerFeeCal.getRateCode(LineCode);
		//double industryPower=sumPower*industry/100*powerFeeCal.getRateCode(LineCode);
		//double businessPower=sumPower*business/100*powerFeeCal.getRateCode(LineCode);
		
		//double agriculturalPrice=powerFeeCal.getWholePrice("6", "1", LineCode);
		//double producePrice=powerFeeCal.getWholePrice("5", "1", LineCode);
		//double residentPrice=powerFeeCal.getWholePrice("1", "1", LineCode);
		//double indecisivePrice=powerFeeCal.getWholePrice("2", "1", LineCode);
		//double industryPrice=powerFeeCal.getWholePrice("4", "1", LineCode);
	//	double businessPrice=powerFeeCal.getWholePrice("3", "1", LineCode);
		
		//double agriculturalFee=agriculturalPower*agriculturalPrice;
		//double produceFee=producePower*producePrice;
		//double residentFee=residentPower*residentPrice;
		//double indecisiveFee=indecisivePower*industryPrice;
		//double industryFee=industryPower*industryPrice;
		//double businessFee=businessPower*businessPrice;
		
		//double ajustcode=powerFeeCal.adjustrate(MeritoriousPointer, UnMeritoriousPointer, powerClass, LineCode, inputDate);
		//double ajustvalue=powerFeeCal.adjustmentValue(MeritoriousPointer, UnMeritoriousPointer, powerClass, LineCode, inputDate);
		//double PowerRateFee=(agriculturalFee+produceFee+residentFee+indecisiveFee+industryFee+businessFee)*ajustvalue;
		//double sumFee=(agriculturalFee+produceFee+residentFee+indecisiveFee+industryFee+businessFee )+PowerRateFee;
		
		double sanXiaJin=0;
		//if(industryId.equals("gy")||industryId.equals("dm")){
			//sanXiaJin=(sumPower-agriculturalPower)*0.004*0.88;
		//}else{
	//	 sanXiaJin=sumPower*0.004*0.88;
		//}
		double jiJinKezaisheng=meritoriousPointerPower*0.002*0.88;
	// jiJinKuqu=(sumPower-agriculturalPower-producePower)*0.0031*0.88;
		//double jiJin=jiJinKezaisheng+jiJinKuqu;
		double dianJin=meritoriousPointerPower*0.02*0.88;
		sanXiaJin=meritoriousPointerPower*0.004*0.88;
		LwWholeSaleSummaryDto lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
		BLLwWholeSaleSummaryFacade  blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		blLwWholeSaleSummaryFacade.deleteByConditions(powerFeeCal.deleteLineSql(LineCode, inputDate));
		lwWholeSaleSummaryDto.setLineCode(LineCode);
		lwWholeSaleSummaryDto.setStatMonth(inputDate);
		lwWholeSaleSummaryDto.setPowerClass(powerClass);
		//lwWholeSaleSummaryDto.setElectricQuantity(sumPower);
		lwWholeSaleSummaryDto.setPointerQuantity(meritoriousPointerPower);
		lwWholeSaleSummaryDto.setUnPointerQuantity(unmeritoriousPointerPower);
		lwWholeSaleSummaryDto.setSanXiaFee(sanXiaJin);
		lwWholeSaleSummaryDto.setSurcharge(jiJinKezaisheng);
		//lwWholeSaleSummaryDto.setSumFee(sumFee);
		lwWholeSaleSummaryDto.setValidStatus("1");
		//if(lossPower.equals("lineLose")){
			//lwWholeSaleSummaryDto.setLineLoss(LossDianliang);
		//}
		//if(lossPower.equals("transLose")){
			//lwWholeSaleSummaryDto.setTransLoss(LossDianliang);
		//}
		//lwWholeSaleSummaryDto.setUnPointerQuantity(unmeritoriousPointerPower);
		lwWholeSaleSummaryDto.setRateCode(adjustrate);
		lwWholeSaleSummaryDto.setAdjustRate(RateCode);
		//lwWholeSaleSummaryDto.setFarmUseQuantity(agriculturalPower);
		//lwWholeSaleSummaryDto.setFarmUseScale(agricultural);
		//lwWholeSaleSummaryDto.setFarmUseFee(agriculturalFee);
		//lwWholeSaleSummaryDto.setFarmUsePrice(agriculturalPrice);
		//lwWholeSaleSummaryDto.setProductScale(produce);
		//lwWholeSaleSummaryDto.setProductPrice(producePrice);
		//lwWholeSaleSummaryDto.setProductFee(produceFee);
		//lwWholeSaleSummaryDto.setProductQuantity(producePower);
		//lwWholeSaleSummaryDto.setDenizenScale(resident);
		//lwWholeSaleSummaryDto.setDenizenPrice(residentPrice);
		//lwWholeSaleSummaryDto.setDenizenQuantity(residentPower);
		//lwWholeSaleSummaryDto.setDenizenFee(residentFee);
		//lwWholeSaleSummaryDto.setUnDenizenScale(indecisive);
		//lwWholeSaleSummaryDto.setUnDenizenQuantity(indecisivePower);
		//lwWholeSaleSummaryDto.setUnDenizenPrice(indecisivePrice);
		//lwWholeSaleSummaryDto.setUnDenizenFee(indecisiveFee);
		//lwWholeSaleSummaryDto.setIndustryScale(industry);
		//lwWholeSaleSummaryDto.setIndustryPrice(industryPrice);
		//lwWholeSaleSummaryDto.setIndustryQuantity(industryPower);
		//lwWholeSaleSummaryDto.setIndustryFee(industryFee);
	//	lwWholeSaleSummaryDto.setBizScale(business);
	//	lwWholeSaleSummaryDto.setBizQuantity(businessPower);
	//	lwWholeSaleSummaryDto.setBizPrice(businessPrice);
		//lwWholeSaleSummaryDto.setBizFee(businessFee);
		lwWholeSaleSummaryDto.setPowerRateFee(PowerRateFee);
		lwWholeSaleSummaryDto.setIndustryFee(meritoriousPointerFee);
		//lwWholeSaleSummaryDto.setUpCompany(industryId);
		lwWholeSaleSummaryDto.setPowerFee(dianJin);
		lwWholeSaleSummaryDto.setSumFee(sumFee);
		lwWholeSaleSummaryDto.setIndustryPrice(0.3515);
		blLwWholeSaleSummaryFacade.insert(lwWholeSaleSummaryDto);
		BLLwWholeSaleIndicatorFacade  blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
		LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto=new LwWholeSaleIndicatorDto();
		blLwWholeSaleIndicatorFacade.deleteByConditions(powerFeeCal.deleteSql(LineCode, inputDate));
		lwWholeSaleIndicatorDto.setUserNo(LineCode);
	
		lwWholeSaleIndicatorDto.setStatMonth(inputDate);
		//lwindicatorDto.setLastWorkNum(lastLwindicatorDto.getThisWorkNum());
		lwWholeSaleIndicatorDto.setThisWorkNum(Integer.parseInt(MeritoriousPointer) );
		//lwindicatorDto.setThisWorkPower(unmeritoriousPointerPower);
		//lwindicatorDto.setThisIdleNum(Integer.parseInt(UnMeritoriousPointer));
		//lwindicatorDto.setLastIdleNum(lastLwindicatorDto.getThisIdleNum());
		//lwindicatorDto.setThisIdlePower(unmeritoriousPointerPower);
		//lwindicatorDto.setRate(powerFeeCal.getRateCode(LineCode));
		//lwindicatorDto.setInputDate(inputDate);
		//lwindicatorDto.setValidStatus("1");
		blLwWholeSaleIndicatorFacade.insert(lwWholeSaleIndicatorDto);
		
        String condition=" 1=1";
		
		String serchDate=inputDate.substring(0, 6);
		condition+=" and StatMonth like '"+serchDate+"%'";
		
	condition+=" and linecode='"+LineCode+"'";
	
	Collection collectionwholesale=blLwWholeSaleSummaryFacade.findByConditions(condition);
	httpServletRequest.setAttribute("collectionwholesale", collectionwholesale);
		
		
		
		
		
		
		
		
		return actionMapping.findForward("wholesaleCorporation");
}

}
