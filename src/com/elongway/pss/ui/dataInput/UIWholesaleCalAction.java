package com.elongway.pss.ui.dataInput;

import java.text.DecimalFormat;
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
import com.elongway.pss.bl.facade.BLLwLineAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.dto.domain.LwindicatorDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;

public class UIWholesaleCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
	/*	String UserName= httpServletRequest.getParameter("UserName");
		String ThisWorkNum= httpServletRequest.getParameter("ThisWorkNum");
		String ThisIdleNum= httpServletRequest.getParameter("ThisIdleNum");
		String LastWorkNum= httpServletRequest.getParameter("LastWorkNum");
		String LastIdleNum= httpServletRequest.getParameter("LastIdleNum");
		String Rate= httpServletRequest.getParameter("Rate");
		String workQuantity= httpServletRequest.getParameter("workQuantity");
		String unworkQuantity= httpServletRequest.getParameter("unworkQuantity");
		String LineLossQuantity= httpServletRequest.getParameter("LineLossQuantity");
		String TransLossQuantity= httpServletRequest.getParameter("TransLossQuantity");
		String ChgAmmeterQuantity= httpServletRequest.getParameter("ChgAmmeterQuantity");
		String UnChgAmmeterQuantity= httpServletRequest.getParameter("UnChgAmmeterQuantity");
		String ExcepQuantity= httpServletRequest.getParameter("ExcepQuantity");
		String CompensateQuantity= httpServletRequest.getParameter("CompensateQuantity");
		String UnCompensateQuantity= httpServletRequest.getParameter("UnCompensateQuantity");
		
		String flag= httpServletRequest.getParameter("flag");
		String inputdate=httpServletRequest.getParameter("inputdate");
	
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		DecimalFormat df = new DecimalFormat("###0.000");
		PowerFeeCal powerFeeCal=new PowerFeeCal();
		
			LwWholeSaleUserInfoDto  lwWholeSaleUserInfoDto=blLwWholeSaleUserInfoFacade.findByPrimaryKey(UserName);
			String KV=lwWholeSaleUserInfoDto.getVoltage();
			String wholeSaleStyle=lwWholeSaleUserInfoDto.getWholesaletype();
			String conditions="1=1 and inputdate='"+inputdate+"'"+"and linecode='"+UserName+"'";
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
			BLLwWholeSaleSummaryFacade  blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
			if(wholeSaleStyle.equals("0")){
				if(UnChgAmmeterQuantity.equals("")||UnChgAmmeterQuantity==null){
					UnChgAmmeterQuantity="0";
				}
				if(ChgAmmeterQuantity.equals("")||ChgAmmeterQuantity==null){
					ChgAmmeterQuantity="0";
				}
				if(TransLossQuantity.equals("")||TransLossQuantity==null){
					TransLossQuantity="0";
				}
				double rworkQuantity=Double.parseDouble(workQuantity)+Double.parseDouble(ChgAmmeterQuantity);
				double runworkQuantity=Double.parseDouble(unworkQuantity)+Double.parseDouble(UnChgAmmeterQuantity);
				double sumPower=rworkQuantity-Double.parseDouble(TransLossQuantity);
				//double AdjustRate=powerFeeCal.poweradjustmentValue(String.valueOf(rworkQuantity) , String.valueOf(runworkQuantity), "2");
				double RateCode=powerFeeCal.poweradjustrate(String.valueOf(rworkQuantity), String.valueOf(runworkQuantity));
				
				//LwProrateDto  lwProrateDto=powerFeeCal.getWholeProrate(UserName);
				double agricultural=lwProrateDto.getAgricultural();//农灌比例
				double produce=lwProrateDto.getProduce();//生产
				double resident=lwProrateDto.getResident();//居民
				double indecisive=lwProrateDto.getIndecisive();//非居民
				double industry=lwProrateDto.getIndustry();//工业
				double business=lwProrateDto.getBusiness();//商业
				double agriculturalPower=sumPower*agricultural;
				double producePower=sumPower*produce;
				double residentPower=sumPower*resident;
				double indecisivePower=sumPower*indecisive;
				double industryPower=sumPower*industry;
				double businessPower=sumPower*business;
				double agriculturalPrice=powerFeeCal.wholeSalePrice(UserName, "6");
				double producePrice=powerFeeCal.wholeSalePrice(UserName, "5");
				double residentPrice=powerFeeCal.wholeSalePrice(UserName, "1");
				double indecisivePrice=powerFeeCal.wholeSalePrice(UserName, "2");
				double industryPrice=powerFeeCal.wholeSalePrice(UserName, "4");
				double businessPrice=powerFeeCal.wholeSalePrice(UserName, "3");
				//double businessPrice=(double)Math.round((double)powerFeeCal.wholeSalePrice(UserName, "3")*10000)/10000;
				double agriculturalFee=(double)Math.round((double)agriculturalPower*agriculturalPrice*10000)/10000;
				double produceFee=(double)Math.round((double)producePower*producePrice*10000)/10000;
				double residentFee=(double)Math.round((double)residentPower*residentPrice*10000)/10000;
				double indecisiveFee=(double)Math.round((double)indecisivePower*industryPrice*10000)/10000;
				double industryFee=(double)Math.round((double)industryPower*industryPrice*10000)/10000;
				double businessFee=(double)Math.round((double)businessPower*businessPrice*10000)/10000;
				double powerRateFee=(agriculturalFee+produceFee+residentFee+indecisiveFee+industryFee+businessFee)*AdjustRate;
				double sumFee=(agriculturalFee+produceFee+residentFee+indecisiveFee+industryFee+businessFee )+powerRateFee;
				double sanXiaJin=0;
				if(lwWholeSaleUserInfoDto.getCompany().equals("gy")||lwWholeSaleUserInfoDto.getCompany().equals("dm")){
					sanXiaJin=(sumPower-agriculturalPower)*0.004*0.88;
				}else{
				 sanXiaJin=sumPower*0.004*0.88;
				}
				
				double dianJin=(sumPower-agriculturalPower)*0.02*0.88;
					
				double jiJin=(sumPower-agriculturalPower-producePower)*0.002*0.88;
			
				blLwWholeSaleSummaryFacade.deleteByConditions(powerFeeCal.deleteLineSql(UserName, inputdate));
				lwWholeSaleSummaryDto.setLineCode(UserName);
				lwWholeSaleSummaryDto.setStatMonth(inputdate);
				lwWholeSaleSummaryDto.setPowerClass(wholeSaleStyle);
				lwWholeSaleSummaryDto.setElectricQuantity(sumPower);
				lwWholeSaleSummaryDto.setPointerQuantity(PowerFeeCal.getValue(rworkQuantity, AppConst.TWO_DOT_FLAG));
				lwWholeSaleSummaryDto.setUnPointerQuantity(runworkQuantity);
				lwWholeSaleSummaryDto.setSanXiaFee(sanXiaJin);
				lwWholeSaleSummaryDto.setSurcharge(jiJin);
				lwWholeSaleSummaryDto.setSumFee(sumFee);
				lwWholeSaleSummaryDto.setTransLoss(Double.parseDouble(TransLossQuantity));
				
				lwWholeSaleSummaryDto.setRateCode(RateCode);
				lwWholeSaleSummaryDto.setAdjustRate(AdjustRate);
				lwWholeSaleSummaryDto.setFarmUseQuantity(agriculturalPower);
				lwWholeSaleSummaryDto.setFarmUseScale(agricultural);
				lwWholeSaleSummaryDto.setFarmUseFee(PowerFeeCal.getValue(agriculturalFee, AppConst.TWO_DOT_FLAG));
				lwWholeSaleSummaryDto.setFarmUsePrice(agriculturalPrice);
				lwWholeSaleSummaryDto.setProductScale(produce);
				lwWholeSaleSummaryDto.setProductPrice(producePrice);
				lwWholeSaleSummaryDto.setProductFee(PowerFeeCal.getValue(produceFee, AppConst.TWO_DOT_FLAG));
				lwWholeSaleSummaryDto.setProductQuantity(producePower);
				lwWholeSaleSummaryDto.setDenizenScale(resident);
				lwWholeSaleSummaryDto.setDenizenPrice(residentPrice);
				lwWholeSaleSummaryDto.setDenizenQuantity(residentPower);
				lwWholeSaleSummaryDto.setDenizenFee(PowerFeeCal.getValue(residentFee, AppConst.TWO_DOT_FLAG));
				lwWholeSaleSummaryDto.setUnDenizenScale(indecisive);
				lwWholeSaleSummaryDto.setUnDenizenQuantity(indecisivePower);
				lwWholeSaleSummaryDto.setUnDenizenPrice(indecisivePrice);
				lwWholeSaleSummaryDto.setUnDenizenFee(PowerFeeCal.getValue(indecisiveFee, AppConst.TWO_DOT_FLAG));
				lwWholeSaleSummaryDto.setIndustryScale(industry);
				lwWholeSaleSummaryDto.setIndustryPrice(industryPrice);
				lwWholeSaleSummaryDto.setIndustryQuantity(industryPower);
				lwWholeSaleSummaryDto.setIndustryFee(PowerFeeCal.getValue(industryFee, AppConst.TWO_DOT_FLAG));
				lwWholeSaleSummaryDto.setBizScale(business);
				lwWholeSaleSummaryDto.setBizQuantity(businessPower);
				lwWholeSaleSummaryDto.setBizPrice(businessPrice);
				lwWholeSaleSummaryDto.setBizFee(PowerFeeCal.getValue(businessFee, AppConst.TWO_DOT_FLAG));
				lwWholeSaleSummaryDto.setPowerRateFee(PowerFeeCal.getValue(powerRateFee, AppConst.TWO_DOT_FLAG));
				lwWholeSaleSummaryDto.setUpCompany(flag);
				lwWholeSaleSummaryDto.setKv(KV);
				lwWholeSaleSummaryDto.setPowerFee(dianJin);
				lwWholeSaleSummaryDto.setWholesaletype("0");
				blLwWholeSaleSummaryFacade.insert(lwWholeSaleSummaryDto);
				BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
				String conditiona="flag=1 and  userNo='"+UserName+"'";
				Collection faca=blLwAmmeterChangeFacade.findByConditions(conditiona);
				Iterator fa=faca.iterator();
				while(fa.hasNext()){
					LwAmmeterChangeDto lwAmmeterChangeDto=(LwAmmeterChangeDto)fa.next();
					lwAmmeterChangeDto.setRate(Rate);
					blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
				}
				
			}
			if(wholeSaleStyle.equals("1")){
				if(UnChgAmmeterQuantity.equals("")||UnChgAmmeterQuantity==null){
					UnChgAmmeterQuantity="0";
				}
				if(ChgAmmeterQuantity.equals("")||ChgAmmeterQuantity==null){
					ChgAmmeterQuantity="0";
				}
				if(TransLossQuantity.equals("")||TransLossQuantity==null){
					TransLossQuantity="0";
				}
				double rworkQuantity=Double.parseDouble(workQuantity)+Double.parseDouble(ChgAmmeterQuantity);
				double runworkQuantity=Double.parseDouble(unworkQuantity)+Double.parseDouble(UnChgAmmeterQuantity);
				double sumPower=rworkQuantity;
				double AdjustRate=powerFeeCal.poweradjustmentValue(String.valueOf(rworkQuantity) , String.valueOf(runworkQuantity), "2");
				double RateCode=powerFeeCal.poweradjustrate(String.valueOf(rworkQuantity), String.valueOf(runworkQuantity));
				double industryPrice=powerFeeCal.wholefactorySalePrice(UserName);
				double workFee=(double)Math.round((double)sumPower*industryPrice*10000)/10000;
				
				double powerRateFee=workFee*AdjustRate;
				double sumFee=workFee+powerRateFee;
				
				
				double sanXiaJin =sumPower*0.004*0.88;
				double dianJin=sumPower*0.02*0.88;
				
					
				double jiJin=sumPower*0.002*0.88;
				
				blLwWholeSaleSummaryFacade.deleteByConditions(powerFeeCal.deleteLineSql(UserName, inputdate));
				lwWholeSaleSummaryDto.setLineCode(UserName);
				lwWholeSaleSummaryDto.setStatMonth(inputdate);
				lwWholeSaleSummaryDto.setPowerClass(wholeSaleStyle);
				lwWholeSaleSummaryDto.setElectricQuantity(sumPower);
				lwWholeSaleSummaryDto.setPointerQuantity(rworkQuantity);
				lwWholeSaleSummaryDto.setUnPointerQuantity(runworkQuantity);
				lwWholeSaleSummaryDto.setSanXiaFee(sanXiaJin);
				lwWholeSaleSummaryDto.setSurcharge(jiJin);
				lwWholeSaleSummaryDto.setSumFee(sumFee);
				lwWholeSaleSummaryDto.setKv(KV);
				lwWholeSaleSummaryDto.setWholesaletype("1");
				
				//lwWholeSaleSummaryDto.setTransLoss(Double.parseDouble(TransLossQuantity[i]));
				
				lwWholeSaleSummaryDto.setRateCode(RateCode);
				lwWholeSaleSummaryDto.setAdjustRate(AdjustRate);
				
				lwWholeSaleSummaryDto.setPowerRateFee(powerRateFee);
				lwWholeSaleSummaryDto.setUpCompany(flag);
				lwWholeSaleSummaryDto.setPowerFee(dianJin);
				lwWholeSaleSummaryDto.setIndustryPrice(industryPrice);
				lwWholeSaleSummaryDto.setIndustryFee(workFee);
				blLwWholeSaleSummaryFacade.insert(lwWholeSaleSummaryDto);
				BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
				String conditiona="flag=1 and  userNo='"+UserName+"'";
				Collection faca=blLwAmmeterChangeFacade.findByConditions(conditiona);
				Iterator fa=faca.iterator();
				while(fa.hasNext()){
					LwAmmeterChangeDto lwAmmeterChangeDto=(LwAmmeterChangeDto)fa.next();
					lwAmmeterChangeDto.setRate(Rate);
					blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
				}
			}
			
			httpServletRequest.setAttribute("lwWholeSaleSummaryDto", lwWholeSaleSummaryDto);
		return actionMapping.findForward("wholeSale");
		
		
		*/
		return null;
	}

}
