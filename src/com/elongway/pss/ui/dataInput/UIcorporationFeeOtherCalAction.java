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

import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwFactoryIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwSalePriceFacade;
import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.dto.domain.LwindicatorDto;
import com.elongway.pss.util.PowerFeeCal;

public class UIcorporationFeeOtherCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String powerClass=httpServletRequest.getParameter("powerClass");
		String lastMeritoriousPointer=httpServletRequest.getParameter("lastMeritoriousPointer");
		String lastUnMeritoriousPointer=httpServletRequest.getParameter("lastUnMeritoriousPointer");
		String meritoriousPointer=httpServletRequest.getParameter("MeritoriousPointer");
		String unMeritoriousPointer=httpServletRequest.getParameter("UnMeritoriousPointer");
		String inputDate=httpServletRequest.getParameter("inputDate");
		String  inputPower=httpServletRequest.getParameter("inputPower");
		String appendPower=httpServletRequest.getParameter("appendPower");
		String contentPower =httpServletRequest.getParameter("contentPower");
		String industryId=httpServletRequest.getParameter("industryId");
		String lastinputPowerPointer=httpServletRequest.getParameter("lastinputPowerPointer");
		String inputPowerPointer=httpServletRequest.getParameter("inputPowerPointer");
		String pepoleRate=httpServletRequest.getParameter("pepoleRate");
		String pepolePower=httpServletRequest.getParameter("pepolePower");
		String CT=httpServletRequest.getParameter("CT");
		String PT=httpServletRequest.getParameter("PT");
		String needPowerPointer=httpServletRequest.getParameter("needPowerPointer");
		String needRate=httpServletRequest.getParameter("needRate");
		double dianJinPower=0;//电金电量
		double sanXiaPower=0;//三峡电量
		double jiJinPower=0;//基金电量
		
		BLLwUserLineFacade  blLwUserLineFacade=new BLLwUserLineFacade();
		String conditionF="1=1 and ValidStatus=1 and userNo='"+industryId+"'";
		Collection  cf=new ArrayList();
		cf=blLwUserLineFacade.findByConditions(conditionF);
		System.out.println("size"+cf.size());
		String lineCode="";
		
		LwUserLineDto lwUserLineDto=new LwUserLineDto();
		Iterator icf=cf.iterator();
		if(icf.hasNext()){
			lwUserLineDto=(LwUserLineDto)icf.next();
			lineCode=lwUserLineDto.getLineCode();
		}
		
		PowerFeeCal  powerFeeCal=new PowerFeeCal();
		double meritoriousPointerPower=powerFeeCal.electrotherapy(meritoriousPointer, unMeritoriousPointer, powerClass, industryId, inputDate)*(Double.parseDouble(CT)*Double.parseDouble(PT));//有功电量
		double unmeritoriousPointerPower=(powerFeeCal.unelectrotherapy(meritoriousPointer,unMeritoriousPointer,powerClass,industryId,inputDate))*(Double.parseDouble(CT)*Double.parseDouble(PT));//无功电量
		double unDenizen=Double.parseDouble(inputPower);
		double lossPower=meritoriousPointerPower*0.01;
		double sumPower=meritoriousPointerPower-lossPower;//总电量
		
		
		     
		//meritoriousPointerPower=sumPower-unDenizen;
		double meritoriousPointerPowertemp=meritoriousPointerPower;
		double peakQuantity=sumPower-unDenizen;
		
		//String conditiontempPoint=powerFeeCal.basePowerPrice(lineCode, "7");
		//String conditionsPoint="1=1 and MaterialsType=0 and PRICECATEGORY=3 "+  conditiontempPoint ;
		BLLwSalePriceFacade blLwSalePriceFacade=new BLLwSalePriceFacade();
		//LwSalePriceDto lwSalePriceDtoPoint=new LwSalePriceDto();
		//Collection salePricecol=new ArrayList();
		//salePricecol=blLwSalePriceFacade.findByConditions(conditionsPoint);
		//Iterator salePricePoint=salePricecol.iterator();
		//if(salePricePoint.hasNext()){
		//	lwSalePriceDtoPoint=(LwSalePriceDto)salePricePoint.next();
		//}
		//double meritoriousPointerPowerPrice=lwSalePriceDtoPoint.getPrice(); //大工业电价
		//double meritoriousPointerPowerFee=meritoriousPointerPower*meritoriousPointerPowerPrice;
		double peakPrice=0.3539;
		double peakFee=peakQuantity*peakPrice;
		String strAppender=" 1=1 and PowerClass=7 and PriceCategory=4  and MATERIALSTYPE=0 and VoltageBegin='"+appendPower+"'";
		LwSalePriceDto lwSalePriceDtoAppend=new LwSalePriceDto();
		
		Collection appendcol=new ArrayList();
		appendcol=blLwSalePriceFacade.findByConditions(strAppender);
		
		Iterator salePriceappen=appendcol.iterator();
		if(salePriceappen.hasNext()){
			lwSalePriceDtoAppend=(LwSalePriceDto)salePriceappen.next();
		}
		double NeedFeePrice=0;//需量价
		double ContentFeePrice=0;//容量电价
		double NeedPower=0;
		double NeedFee=0;
		double ContentFee=0;
		if(appendPower.equals("1")){
			NeedFeePrice=lwSalePriceDtoAppend.getPrice();
			NeedFee=NeedFeePrice*Double.parseDouble(needPowerPointer)*Double.parseDouble(needRate);
			NeedPower=Integer.parseInt(needPowerPointer)*Double.parseDouble(needRate);
		}
		if(appendPower.equals("2")){
			ContentFeePrice=lwSalePriceDtoAppend.getPrice();
			ContentFee=ContentFeePrice*Double.parseDouble(contentPower);
		}
		String conditiontempDenizen=powerFeeCal.basePowerPrice(lineCode, "2");
		
		LwSalePriceDto lwSalePriceDtoDenizen=new LwSalePriceDto();
		Collection collectionDenizen=new ArrayList();
		collectionDenizen=blLwSalePriceFacade.findByConditions("1=1"+conditiontempDenizen);
		Iterator salePriceunDenizen=collectionDenizen.iterator();
		if(salePriceunDenizen.hasNext()){
			lwSalePriceDtoDenizen=(LwSalePriceDto)salePriceunDenizen.next();
		}
		
		
		double unDenizenPrice=lwSalePriceDtoDenizen.getPrice();//非居民电价
		double  unDenizenFee=unDenizen*unDenizenPrice;//非居民电费
		double RateCode=powerFeeCal.adjustmentValue(meritoriousPointer, unMeritoriousPointer, powerClass, lineCode, inputDate)*(Double.parseDouble(CT)*Double.parseDouble(PT));//调整值
		double adjustrate=powerFeeCal.adjustrate(meritoriousPointer, unMeritoriousPointer, powerClass, lineCode, inputDate)*(Double.parseDouble(CT)*Double.parseDouble(PT));//功率因素
		double PowerRateFee=0;//力率电费
		if(appendPower.endsWith("1")){
			
			PowerRateFee=(NeedFee+unDenizenFee+peakFee)*RateCode;
		}
		if(appendPower.endsWith("2")){
			PowerRateFee=(ContentFee+unDenizenFee+peakFee)*RateCode;
		}
		
		dianJinPower=sumPower;
		sanXiaPower=sumPower;
		jiJinPower=sumPower;
		double dianJinFee=dianJinPower*0.01;//电金
		double sanXiaFee=sanXiaPower*0.004;//三峡金
		double jiJinFee=jiJinPower*0.0051;//基金
		double sumFee=0;
		if(appendPower.endsWith("1")){
			
			 sumFee=NeedFee+unDenizenFee+peakFee+PowerRateFee+dianJinFee+sanXiaFee+jiJinFee;
		}
		if(appendPower.endsWith("2")){
			 sumFee=ContentFee+unDenizenFee+peakFee+PowerRateFee+dianJinFee+sanXiaFee+jiJinFee;
		}
		
		LwCorporationSummaryDto  lwCorporationSummaryDto=new LwCorporationSummaryDto();
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade=new BLLwCorporationSummaryFacade();
		blLwCorporationSummaryFacade.deleteByConditions(powerFeeCal.deleteSql(industryId, inputDate));
		lwCorporationSummaryDto.setLineCode(lineCode);
		lwCorporationSummaryDto.setStatMonth(inputDate);
		lwCorporationSummaryDto.setPowerClass(powerClass);
		lwCorporationSummaryDto.setElectricQuantity(sumPower);
		lwCorporationSummaryDto.setSanXiaFee(sanXiaFee);
		lwCorporationSummaryDto.setSurcharge(jiJinFee);
		lwCorporationSummaryDto.setPowerFee(dianJinFee);
		lwCorporationSummaryDto.setUnDenizenFee(unDenizenFee);
		lwCorporationSummaryDto.setUnDenizenPrice(unDenizenPrice);
		lwCorporationSummaryDto.setUnDenizenQuantity(unDenizen);
		lwCorporationSummaryDto.setPointerQuantity(meritoriousPointerPower);
		
		
		
		lwCorporationSummaryDto.setAjustRate(RateCode);
		lwCorporationSummaryDto.setPowerRateFee(PowerRateFee);
		lwCorporationSummaryDto.setRateCode(adjustrate);
		lwCorporationSummaryDto.setSurchargePrice(0.0051);
		lwCorporationSummaryDto.setSanXiaPrice(0.004);
		lwCorporationSummaryDto.setPowerPrice(0.01);
		lwCorporationSummaryDto.setUnPointerQuantity(unmeritoriousPointerPower);
		if(appendPower.equals("1")){
			lwCorporationSummaryDto.setNeedFee(NeedFee);
			lwCorporationSummaryDto.setNeedPrice(NeedFeePrice);
			lwCorporationSummaryDto.setNeedQuantity(NeedPower);
			lwCorporationSummaryDto.setFlag("1");
		}
		if(appendPower.equals("2")){
			lwCorporationSummaryDto.setContentFee(ContentFee);
			lwCorporationSummaryDto.setContentPrice(ContentFeePrice);
			lwCorporationSummaryDto.setContentQuantity(Double.parseDouble(contentPower));
			lwCorporationSummaryDto.setFlag("2");
		}
		lwCorporationSummaryDto.setUserNo("1");
		lwCorporationSummaryDto.setPeakQuantity(peakQuantity);
		lwCorporationSummaryDto.setPeakFee(peakFee);
		lwCorporationSummaryDto.setPeakPrice(peakPrice);
		lwCorporationSummaryDto.setLossQuantity(lossPower);
		lwCorporationSummaryDto.setSumFee(sumFee);
		lwCorporationSummaryDto.setUserNo(industryId);
		blLwCorporationSummaryFacade.insert(lwCorporationSummaryDto);
		
LwFactoryIndicatorDto lastLwFactoryIndicatorDto=new LwFactoryIndicatorDto();
		
		BLLwFactoryIndicatorFacade blLwFactoryIndicatorFacade=new BLLwFactoryIndicatorFacade();
		blLwFactoryIndicatorFacade.deleteByConditions(powerFeeCal.deleteSql(industryId, inputDate));
		LwFactoryIndicatorDto lwFactoryIndicatorDto=new LwFactoryIndicatorDto();
		lwFactoryIndicatorDto.setUserNo(industryId);
		//lwindicatorDto.setAmmeterNo(industryId);
		lwFactoryIndicatorDto.setStatMonth(inputDate);
		//lwindicatorDto.setLastWorkNum(lastLwindicatorDto.getThisWorkNum());
		lwFactoryIndicatorDto.setThisWorkNum(Integer.parseInt(meritoriousPointer));
		//lwindicatorDto.setThisWorkPower(meritoriousPointerPower);
		lwFactoryIndicatorDto.setThisIdleNum(Integer.parseInt(unMeritoriousPointer));
		if(pepolePower.equals("2")){
			lwFactoryIndicatorDto.setPeopleThisIdleNum(Integer.parseInt(inputPowerPointer));
		}
		//lwindicatorDto.setLastIdleNum(lastLwindicatorDto.getThisIdleNum());
		//lwindicatorDto.setThisIdlePower(unmeritoriousPointerPower);
		//lwindicatorDto.setRate(powerFeeCal.getRateCode(lineCode));
		//lwindicatorDto.setInputDate(inputDate);
		//lwindicatorDto.setValidStatus("1");
		
		blLwFactoryIndicatorFacade.insert(lwFactoryIndicatorDto);
		String condition=" 1=1";
		
		String serchDate=inputDate.substring(0, 6);
		condition+=" and StatMonth like '"+serchDate+"%'";
	
	condition+=" and linecode='"+lineCode+"'";
	
	Collection collectioncorporation=blLwCorporationSummaryFacade.findByConditions(condition);
	httpServletRequest.setAttribute("collectioncorporation", collectioncorporation);
		

		
		
		return actionMapping.findForward("showCorporationOther");
}

}
