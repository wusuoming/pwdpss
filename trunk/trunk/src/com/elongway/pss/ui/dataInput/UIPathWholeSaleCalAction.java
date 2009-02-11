package com.elongway.pss.ui.dataInput;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import sun.awt.AppContext;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;
import com.elongway.pss.bl.facade.BLLineLossFacade;
import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;
import com.elongway.pss.dto.domain.LineLossDto;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.dto.domain.TransforDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIPathWholeSaleCalAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String[] UserName= httpServletRequest.getParameterValues("UserName");
		String[] ThisWorkNum= httpServletRequest.getParameterValues("ThisWorkNum");
		String[] ThisIdleNum= httpServletRequest.getParameterValues("ThisIdleNum");
		String[] LastWorkNum= httpServletRequest.getParameterValues("LastWorkNum");
		String[] LastIdleNum= httpServletRequest.getParameterValues("LastIdleNum");
		String[] Rate= httpServletRequest.getParameterValues("Rate");
		String[] workQuantity= httpServletRequest.getParameterValues("workQuantity");
		String[] unworkQuantity= httpServletRequest.getParameterValues("unworkQuantity");
		String[] LineLossQuantity= httpServletRequest.getParameterValues("LineLossQuantity");
		String[] TransLossQuantity= httpServletRequest.getParameterValues("TransLossQuantity");
		String[] unTransLossQuantity= httpServletRequest.getParameterValues("unTransLossQuantity");
		String[] ChgAmmeterQuantity= httpServletRequest.getParameterValues("ChgAmmeterQuantity");
		String[] UnChgAmmeterQuantity= httpServletRequest.getParameterValues("UnChgAmmeterQuantity");
		String[] CompensateQuantity= httpServletRequest.getParameterValues("CompensateQuantity");
		String[] UnCompensateQuantity= httpServletRequest.getParameterValues("UnCompensateQuantity");
		String comcode=httpServletRequest.getParameter("comcode");
		String[] flag= httpServletRequest.getParameterValues("flag");
		String[] rateCode= httpServletRequest.getParameterValues("rateCode");
		String[] differenceQuantity= httpServletRequest.getParameterValues("differenceQuantity");
		String inputdate=httpServletRequest.getParameter("inputdate");
		
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		DecimalFormat df = new DecimalFormat("###0.00");
		PowerFeeCal powerFeeCal=new PowerFeeCal();
		for(int i=0;i<UserName.length;i++){
			LwWholeSaleUserInfoDto  lwWholeSaleUserInfoDto=blLwWholeSaleUserInfoFacade.findByPrimaryKey(UserName[i]);
			String KV=lwWholeSaleUserInfoDto.getVoltage();
			String wholeSaleStyle=lwWholeSaleUserInfoDto.getWholesaletype();
			String conditions="1=1 and inputdate='"+inputdate+"'"+"and linecode='"+UserName[i]+"'";
			
			if(wholeSaleStyle.equals("0")){
				if(UnChgAmmeterQuantity[i].equals("")||UnChgAmmeterQuantity[i]==null){
					UnChgAmmeterQuantity[i]="0";
				}
				if(differenceQuantity[i].equals("")||differenceQuantity[i]==null){
					differenceQuantity[i]="0";
				}
				if(ChgAmmeterQuantity[i].equals("")||ChgAmmeterQuantity[i]==null){
					ChgAmmeterQuantity[i]="0";
				}
				if(CompensateQuantity[i].equals("")||CompensateQuantity[i]==null){
					CompensateQuantity[i]="0";
				}
				if(UnCompensateQuantity[i].equals("")||UnCompensateQuantity[i]==null){
					UnCompensateQuantity[i]="0";
				}
				if(TransLossQuantity[i].equals("")||TransLossQuantity[i]==null){
					TransLossQuantity[i]="0";
				}
				if(unTransLossQuantity[i].equals("")||unTransLossQuantity[i]==null){
					unTransLossQuantity[i]="0";
				}
				
				if(LineLossQuantity[i].equals("")||LineLossQuantity[i]==null){
					LineLossQuantity[i]="0";
				}
			
				
				double rworkQuantity=Double.parseDouble(workQuantity[i])+Double.parseDouble(ChgAmmeterQuantity[i])+Double.parseDouble(CompensateQuantity[i]);
				double runworkQuantity=Double.parseDouble(unworkQuantity[i])+Double.parseDouble(UnChgAmmeterQuantity[i])+Double.parseDouble(UnCompensateQuantity[i]);
				
				BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade=new BLCalPowerFeeCustomFacade();
				BLLineLossFacade  blLineLossFacade=new BLLineLossFacade();
				LineLossDto  lineLossDto=new LineLossDto();
				lineLossDto=blLineLossFacade.findByPrimaryKey(UserName[i]);
				BLTransforFacade  blTransforFacade=new BLTransforFacade();
				TransforDto  transforDto=new TransforDto();
				transforDto=blTransforFacade.findByPrimaryKey(UserName[i]);
				if(transforDto!=null){
					
					TransLossQuantity[i]=String.valueOf(blCalPowerFeeCustomFacade.calTransferLoss(rworkQuantity, runworkQuantity, UserName[i]));
				}else{
					TransLossQuantity[i]=TransLossQuantity[i];
					
				}
				if(lineLossDto!=null){
					LineLossQuantity[i]=String.valueOf(blCalPowerFeeCustomFacade.calLineLoss(rworkQuantity, runworkQuantity, UserName[i]));
				}
			else{
					LineLossQuantity[i]=LineLossQuantity[i];
				}
				double sumPower=rworkQuantity-Double.parseDouble(TransLossQuantity[i])-Double.parseDouble(LineLossQuantity[i]);
				double AdjustRate=powerFeeCal.poweradjustmentValue(String.valueOf(rworkQuantity) , String.valueOf(runworkQuantity), "1",rateCode[i]);
				runworkQuantity=runworkQuantity-Double.parseDouble(unTransLossQuantity[i]);
				//double RateCode=powerFeeCal.poweradjustrate(String.valueOf(rworkQuantity), String.valueOf(runworkQuantity));
				
				LwWholeSaleProrateDto  lwWholeSaleProrateDto=powerFeeCal.getWholeProrate(UserName[i],flag[i]);
				double agricultural=lwWholeSaleProrateDto.getFarm();//农灌比例
				double produce=lwWholeSaleProrateDto.getProduce();//生产
				double resident=lwWholeSaleProrateDto.getPeople();//居民
				double indecisive=lwWholeSaleProrateDto.getNotPeople();//非居民
				double industry=lwWholeSaleProrateDto.getIndustry();//工业
				double business=lwWholeSaleProrateDto.getBusiness();//商业
				double agriculturalPower=sumPower*agricultural;
				double producePower=sumPower*produce;
				double residentPower=sumPower*resident;
				double indecisivePower=sumPower*indecisive;
				double industryPower=sumPower*industry;
				double businessPower=sumPower*business;
				LwWholeSalePurePriceDto lwWholeSalePurePriceDto=powerFeeCal.getPurWholeSalePrice(comcode, KV);
				double agriculturalPrice=lwWholeSalePurePriceDto.getFarmPrice();
				double producePrice=lwWholeSalePurePriceDto.getProducePrice();
				double residentPrice=lwWholeSalePurePriceDto.getPeoplePrice();
				double indecisivePrice=lwWholeSalePurePriceDto.getNotPeoplePrice();
				double industryPrice=lwWholeSalePurePriceDto.getIndustryPrice();
				double businessPrice=lwWholeSalePurePriceDto.getBusinessPrice();
				double agriculturalFee=agriculturalPower*agriculturalPrice;
				double produceFee=producePower*producePrice;
				double residentFee=residentPower*residentPrice;
				double indecisiveFee=indecisivePower*indecisivePrice;
				double industryFee=industryPower*industryPrice;
				double businessFee=businessPower*businessPrice;
				double powerRateFee=(agriculturalFee+produceFee+residentFee+indecisiveFee+industryFee+businessFee)*AdjustRate;
				double sumFee=(agriculturalFee+produceFee+residentFee+indecisiveFee+industryFee+businessFee )+powerRateFee;
				double sanXiaJin=0;
				if(flag[i].equals("gy")||flag[i].equals("dm")){
					sanXiaJin=(sumPower-agriculturalPower)*0.004*0.88;
				}else{
				 sanXiaJin=sumPower*0.004*0.88;
				}
				double dianJin=(sumPower-agriculturalPower)*0.02*0.88;
					
				double jiJin=(sumPower-agriculturalPower-producePower)*0.002*0.88;
				LwWholeSaleSummaryDto lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
				BLLwWholeSaleSummaryFacade  blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
				
				blLwWholeSaleSummaryFacade.deleteByConditions(powerFeeCal.deleteLineSql(UserName[i], inputdate));
				lwWholeSaleSummaryDto.setLineCode(UserName[i]);
				lwWholeSaleSummaryDto.setStatMonth(inputdate);
				lwWholeSaleSummaryDto.setPowerClass(wholeSaleStyle);
				lwWholeSaleSummaryDto.setElectricQuantity(sumPower);
				lwWholeSaleSummaryDto.setPointerQuantity(rworkQuantity);
				lwWholeSaleSummaryDto.setUnPointerQuantity(runworkQuantity);
				lwWholeSaleSummaryDto.setSanXiaFee(sanXiaJin);
				lwWholeSaleSummaryDto.setSurcharge(jiJin);
				lwWholeSaleSummaryDto.setSumFee(sumFee);
				lwWholeSaleSummaryDto.setTransLoss(Math.round(Double.parseDouble(TransLossQuantity[i])));
				lwWholeSaleSummaryDto.setLineLoss(Math.round(Double.parseDouble(LineLossQuantity[i])));
				lwWholeSaleSummaryDto.setRateCode(Double.parseDouble(rateCode[i]));
				lwWholeSaleSummaryDto.setAdjustRate(AdjustRate);
				lwWholeSaleSummaryDto.setFarmUseQuantity(agriculturalPower);
				lwWholeSaleSummaryDto.setFarmUseScale(agricultural);
				lwWholeSaleSummaryDto.setFarmUseFee(agriculturalFee);
				lwWholeSaleSummaryDto.setFarmUsePrice(agriculturalPrice);
				lwWholeSaleSummaryDto.setProductScale(produce);
				lwWholeSaleSummaryDto.setProductPrice(producePrice);
				lwWholeSaleSummaryDto.setProductFee(produceFee);
				lwWholeSaleSummaryDto.setProductQuantity(producePower);
				lwWholeSaleSummaryDto.setDenizenScale(resident);
				lwWholeSaleSummaryDto.setDenizenPrice(residentPrice);
				lwWholeSaleSummaryDto.setDenizenQuantity(residentPower);
				lwWholeSaleSummaryDto.setDenizenFee(residentFee);
				lwWholeSaleSummaryDto.setUnDenizenScale(indecisive);
				lwWholeSaleSummaryDto.setUnDenizenQuantity(indecisivePower);
				lwWholeSaleSummaryDto.setUnTransLoss(Math.round(Double.parseDouble(unTransLossQuantity[i])));
				lwWholeSaleSummaryDto.setUnDenizenPrice(indecisivePrice);
				lwWholeSaleSummaryDto.setUnDenizenFee(indecisiveFee);
				lwWholeSaleSummaryDto.setIndustryScale(industry);
				lwWholeSaleSummaryDto.setIndustryPrice(industryPrice);
				lwWholeSaleSummaryDto.setIndustryQuantity(industryPower);
				lwWholeSaleSummaryDto.setIndustryFee(industryFee);
				lwWholeSaleSummaryDto.setBizScale(business);
				lwWholeSaleSummaryDto.setBizQuantity(businessPower);
				lwWholeSaleSummaryDto.setBizPrice(businessPrice);
				lwWholeSaleSummaryDto.setBizFee(businessFee);
				lwWholeSaleSummaryDto.setPowerRateFee(powerRateFee);
				lwWholeSaleSummaryDto.setUpCompany(flag[i]);
				lwWholeSaleSummaryDto.setWorkNum(Double.parseDouble(ThisWorkNum[i]));
				lwWholeSaleSummaryDto.setUnWorkNum(Double.parseDouble(LastWorkNum[i]));
				lwWholeSaleSummaryDto.setKv(KV);
				lwWholeSaleSummaryDto.setPowerFee(dianJin);
				lwWholeSaleSummaryDto.setWholesaletype("0");
				
				lwWholeSaleSummaryDto.setWholesaletype(wholeSaleStyle);
				lwWholeSaleSummaryDto.setDifferenceQuantity(differenceQuantity[i]);
				blLwWholeSaleSummaryFacade.insert(lwWholeSaleSummaryDto);
				BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
				String conditiona="flag=1 and  userNo='"+UserName+"'";
				Collection faca=blLwAmmeterChangeFacade.findByConditions(conditiona);
				Iterator fa=faca.iterator();
				while(fa.hasNext()){
					LwAmmeterChangeDto lwAmmeterChangeDto=(LwAmmeterChangeDto)fa.next();
					lwAmmeterChangeDto.setRate(Rate[i]);
					blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
				}
				
				
				
			}
			if(wholeSaleStyle.equals("1")){
				if(differenceQuantity[i].equals("")||differenceQuantity[i]==null){
					differenceQuantity[i]="0";
				}
				if(UnChgAmmeterQuantity[i].equals("")||UnChgAmmeterQuantity[i]==null){
					UnChgAmmeterQuantity[i]="0";
				}
				if(ChgAmmeterQuantity[i].equals("")||ChgAmmeterQuantity[i]==null){
					ChgAmmeterQuantity[i]="0";
				}
				if(CompensateQuantity[i].equals("")||CompensateQuantity[i]==null){
					CompensateQuantity[i]="0";
				}
				if(UnCompensateQuantity[i].equals("")||UnCompensateQuantity[i]==null){
					UnCompensateQuantity[i]="0";
				}
				if(TransLossQuantity[i].equals("")||TransLossQuantity[i]==null){
					TransLossQuantity[i]="0";
				}
				if(unTransLossQuantity[i].equals("")||unTransLossQuantity[i]==null){
					unTransLossQuantity[i]="0";
				}
				if(LineLossQuantity[i].equals("")||LineLossQuantity[i]==null){
					LineLossQuantity[i]="0";
				}
			
				
				LwWholeSalePurePriceDto lwWholeSalePurePriceDto=powerFeeCal.getPurWholeSalePrice(comcode, KV);
				double rworkQuantity=Double.parseDouble(workQuantity[i])+Double.parseDouble(ChgAmmeterQuantity[i]+Double.parseDouble(CompensateQuantity[i]));
				double runworkQuantity=Double.parseDouble(unworkQuantity[i])+Double.parseDouble(UnChgAmmeterQuantity[i])+Double.parseDouble(UnCompensateQuantity[i]);
				BLCalPowerFeeCustomFacade blCalPowerFeeCustomFacade=new BLCalPowerFeeCustomFacade();
				BLLineLossFacade  blLineLossFacade=new BLLineLossFacade();
				LineLossDto  lineLossDto=new LineLossDto();
				lineLossDto=blLineLossFacade.findByPrimaryKey(UserName[i]);
				BLTransforFacade  blTransforFacade=new BLTransforFacade();
				TransforDto  transforDto=new TransforDto();
				transforDto=blTransforFacade.findByPrimaryKey(UserName[i]);
				if(transforDto!=null){
					
					TransLossQuantity[i]=String.valueOf(blCalPowerFeeCustomFacade.calTransferLoss(rworkQuantity, runworkQuantity, UserName[i]));
				}else{
					TransLossQuantity[i]=TransLossQuantity[i];
					
				}
				if(lineLossDto!=null){
					LineLossQuantity[i]=String.valueOf(blCalPowerFeeCustomFacade.calLineLoss(rworkQuantity, runworkQuantity, UserName[i]));
				}
			else{
					LineLossQuantity[i]=LineLossQuantity[i];
				}
				double sumPower=rworkQuantity-Double.parseDouble(TransLossQuantity[i])-Double.parseDouble(LineLossQuantity[i]);
				double AdjustRate=powerFeeCal.poweradjustmentValue(String.valueOf(rworkQuantity) , String.valueOf(runworkQuantity), "4",rateCode[i]);
				double RateCode=powerFeeCal.poweradjustrate(String.valueOf(rworkQuantity), String.valueOf(runworkQuantity));
				double industryPrice=lwWholeSalePurePriceDto.getIndustryPrice();
				double workFee=sumPower*industryPrice;
				runworkQuantity=runworkQuantity-Double.parseDouble(unTransLossQuantity[i]);
				double powerRateFee=workFee*AdjustRate;
				double sumFee=workFee+powerRateFee;
				
				
				double sanXiaJin =sumPower*0.004*0.88;
				double dianJin=sumPower*0.02*0.88;
				
					
				double jiJin=sumPower*0.002*0.88;
				LwWholeSaleSummaryDto lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
				BLLwWholeSaleSummaryFacade  blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
				blLwWholeSaleSummaryFacade.deleteByConditions(powerFeeCal.deleteLineSql(UserName[i], inputdate));
				lwWholeSaleSummaryDto.setLineCode(UserName[i]);
				lwWholeSaleSummaryDto.setStatMonth(inputdate);
				lwWholeSaleSummaryDto.setPowerClass(wholeSaleStyle);
				lwWholeSaleSummaryDto.setElectricQuantity(sumPower);
				lwWholeSaleSummaryDto.setPointerQuantity(rworkQuantity);
				lwWholeSaleSummaryDto.setUnTransLoss(Double.parseDouble(unTransLossQuantity[i]));
				lwWholeSaleSummaryDto.setUnPointerQuantity(runworkQuantity);
				lwWholeSaleSummaryDto.setSanXiaFee(sanXiaJin);
				lwWholeSaleSummaryDto.setSurcharge(jiJin);
				lwWholeSaleSummaryDto.setSumFee(sumFee);
				lwWholeSaleSummaryDto.setKv(KV);
				lwWholeSaleSummaryDto.setIndustryPrice(industryPrice);
				lwWholeSaleSummaryDto.setIndustryFee(workFee);
				lwWholeSaleSummaryDto.setWorkNum(Double.parseDouble(ThisWorkNum[i]));
				lwWholeSaleSummaryDto.setUnWorkNum(Double.parseDouble(LastWorkNum[i]));
				lwWholeSaleSummaryDto.setTransLoss(Math.round(Double.parseDouble(TransLossQuantity[i])));
				lwWholeSaleSummaryDto.setDifferenceQuantity(differenceQuantity[i]);
				lwWholeSaleSummaryDto.setRateCode(RateCode);
				lwWholeSaleSummaryDto.setAdjustRate(AdjustRate);
				lwWholeSaleSummaryDto.setWholesaletype("1");
				lwWholeSaleSummaryDto.setPowerRateFee(powerRateFee);
				lwWholeSaleSummaryDto.setUpCompany(flag[i]);
				lwWholeSaleSummaryDto.setPowerFee(dianJin);
				lwWholeSaleSummaryDto.setWholesaletype(wholeSaleStyle);
				
				blLwWholeSaleSummaryFacade.insert(lwWholeSaleSummaryDto);
				
				BLLwAmmeterChangeFacade  blLwAmmeterChangeFacade=new BLLwAmmeterChangeFacade();
				String conditiona="flag=1 and  userNo='"+UserName+"'";
				Collection faca=blLwAmmeterChangeFacade.findByConditions(conditiona);
				Iterator fa=faca.iterator();
				while(fa.hasNext()){
					LwAmmeterChangeDto lwAmmeterChangeDto=(LwAmmeterChangeDto)fa.next();
					lwAmmeterChangeDto.setRate(Rate[i]);
					blLwAmmeterChangeFacade.update(lwAmmeterChangeDto);
				}
				
				
				
			}
			
			
		}
	
		String conditions10=" upcompany='"+comcode+"'"+" and KV=10 and StatMonth='"+inputdate+"'"+" and WHOLESALETYPE=0 order by linecode";
		String conditions35=" upcompany='"+comcode+"'"+" and KV=35 and StatMonth='"+inputdate+"'"+" and WHOLESALETYPE=0 order by linecode" ;
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		Collection kv10=blLwWholeSaleSummaryFacade.findByConditions(conditions10);
		Collection kv35=blLwWholeSaleSummaryFacade.findByConditions(conditions35);
		double count10Fee=0;
		double count35Fee=0;
		double sum10Fee=0;
		double sum35Fee=0;
		double Rate10Fee=0;
		double Rate35Fee=0;
		
		long sum10Power=0;
		long sum35power=0;
		long usum10power=0;
		long usum35power=0;
		LwWholeSaleUserInfoDto dtotemp=new LwWholeSaleUserInfoDto();
		Iterator it10=kv10.iterator();
		while(it10.hasNext()){
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it10.next();
			String userno=lwWholeSaleSummaryDto.getLineCode();
			dtotemp=blLwWholeSaleUserInfoFacade.findByPrimaryKey(userno);
			if(dtotemp.getWholesaletype().equals("0")){
				sum10Power+=lwWholeSaleSummaryDto.getElectricQuantity();
				
				usum10power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
			}
			
			
			
		}
	/*	if(flag[0].equals("dm")){
			String conditondm=" readdate=1 and flag='dm'";
			BLLwWholeSaleIndicatorFacade  blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
			
		}*/
		count10Fee=Math.round(count10Fee*100)/100;
		sum10Power=Math.round(sum10Power);
		Iterator it35=kv35.iterator();
		LwWholeSaleUserInfoDto  dtotmp=new LwWholeSaleUserInfoDto();
		while(it35.hasNext()){
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it35.next();
			String userno=lwWholeSaleSummaryDto.getLineCode();
			dtotmp=blLwWholeSaleUserInfoFacade.findByPrimaryKey(userno);
			if(dtotmp.getWholesaletype().equals("0")){
			sum35power+=lwWholeSaleSummaryDto.getElectricQuantity();
			usum35power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
			}
		}
		
		PowerFeeCal powerFeeCal1=new PowerFeeCal();
		double allRateCode10=powerFeeCal1.poweradjustrate(String.valueOf(sum10Power), String.valueOf(usum10power))/100;
		double allPowerRateFee10=powerFeeCal1.poweradjustmentValue(String.valueOf(sum10Power), String.valueOf(usum10power), "2", String.valueOf(allRateCode10));
		double allRateCode35=powerFeeCal1.poweradjustrate(String.valueOf(sum35power), String.valueOf(usum35power))/100;
		double allPowerRateFee35=powerFeeCal1.poweradjustmentValue(String.valueOf(sum35power), String.valueOf(usum35power), "2", String.valueOf(allRateCode35));
		
		LwWholeSaleProrateDto  lwWholeSaleProrateDto10=new LwWholeSaleProrateDto();
		LwWholeSaleProrateDto  lwWholeSaleProrateDto35=new LwWholeSaleProrateDto();
		BLLwWholeSaleProrateFacade  blLwWholeSaleProrateFacade=new BLLwWholeSaleProrateFacade();
		lwWholeSaleProrateDto10=blLwWholeSaleProrateFacade.findByPrimaryKey(comcode,"10");
		lwWholeSaleProrateDto35=blLwWholeSaleProrateFacade.findByPrimaryKey(comcode,"35");
		LwWholeSalePurePriceDto LwWholeSalePurePriceDto10=new LwWholeSalePurePriceDto();
		LwWholeSalePurePriceDto LwWholeSalePurePriceDto35=new LwWholeSalePurePriceDto();
		BLLwWholeSalePurePriceFacade blLwWholeSalePurePriceFacade=new BLLwWholeSalePurePriceFacade();
		LwWholeSalePurePriceDto lwWholeSalePurePriceDto10=powerFeeCal.getPurWholeSalePrice(comcode, "10");
		LwWholeSalePurePriceDto lwWholeSalePurePriceDto35=powerFeeCal.getPurWholeSalePrice(comcode, "35");
		double agricultural10=lwWholeSaleProrateDto10.getFarm() ;//农灌比例
		double produce10=lwWholeSaleProrateDto10.getProduce();//生产
		double resident10=lwWholeSaleProrateDto10.getPeople();//居民
		double indecisive10=lwWholeSaleProrateDto10.getNotPeople();//非居民
		double industry10=lwWholeSaleProrateDto10.getIndustry();//工业
		double business10=lwWholeSaleProrateDto10.getBusiness();//商业
		double agriculturalPower10=Math.round(sum10Power*agricultural10);
		double producePower10=Math.round(sum10Power*produce10);
		double residentPower10=Math.round(sum10Power*resident10);
		double indecisivePower10=Math.round(sum10Power*indecisive10);
		double industryPower10=Math.round(sum10Power*industry10);
		
		double businessPower10=Math.round(sum10Power*business10);
		
		double agriculturalPrice10=lwWholeSalePurePriceDto10.getFarmPrice();
		double producePrice10=lwWholeSalePurePriceDto10.getProducePrice();
		double residentPrice10=lwWholeSalePurePriceDto10.getPeoplePrice();
		double indecisivePrice10=lwWholeSalePurePriceDto10.getNotPeoplePrice();
		double industryPrice10=lwWholeSalePurePriceDto10.getIndustryPrice();
		double businessPrice10=lwWholeSalePurePriceDto10.getBusinessPrice();
		double agriculturalFee10=(agriculturalPower10*agriculturalPrice10);
		double produceFee10=(producePower10*producePrice10);
		double residentFee10=(residentPower10*residentPrice10);
		double indecisiveFee10=(indecisivePower10*indecisivePrice10);
		double industryFee10=(industryPower10*industryPrice10);
		double businessFee10=(businessPower10*businessPrice10);
		count10Fee=(agriculturalFee10+produceFee10+residentFee10+indecisiveFee10+industryFee10+businessFee10) ;
		Rate10Fee=count10Fee*allPowerRateFee10;
		sum10Fee=count10Fee+Rate10Fee;
		double agricultural35=lwWholeSaleProrateDto35.getFarm() ;//农灌比例
		double produce35=lwWholeSaleProrateDto35.getProduce();//生产
		double resident35=lwWholeSaleProrateDto35.getPeople();//居民
		double indecisive35=lwWholeSaleProrateDto35.getNotPeople();//非居民
		double industry35=lwWholeSaleProrateDto35.getIndustry();//工业
		double business35=lwWholeSaleProrateDto35.getBusiness();//商业
		double agriculturalPower35=Math.round(sum35power*agricultural35);
		double producePower35=Math.round(sum35power*produce35);
		double residentPower35=Math.round(sum35power*resident35);
		double indecisivePower35=Math.round(sum35power*indecisive35);
		double industryPower35=Math.round(sum35power*industry35);
		double businessPower35=Math.round(sum35power*business35);
		
		
		double agriculturalPrice35=lwWholeSalePurePriceDto35.getFarmPrice();
		double producePrice35=lwWholeSalePurePriceDto35.getProducePrice();
		double residentPrice35=lwWholeSalePurePriceDto35.getPeoplePrice();
		double indecisivePrice35=lwWholeSalePurePriceDto35.getNotPeoplePrice();
		double industryPrice35=lwWholeSalePurePriceDto35.getIndustryPrice();
		double businessPrice35=lwWholeSalePurePriceDto35.getBusinessPrice();
		double agriculturalFee35=agriculturalPower35*agriculturalPrice35;
		double produceFee35=producePower35*producePrice35;
		double residentFee35=residentPower35*residentPrice35;
		double indecisiveFee35=indecisivePower35*indecisivePrice35;
		double industryFee35=industryPower35*industryPrice35;
		double businessFee35=businessPower35*businessPrice35;
		count35Fee=agriculturalFee35+produceFee35+residentFee35+indecisiveFee35+industryFee35+businessFee35;
		Rate35Fee=count35Fee*allPowerRateFee35;
		sum35Fee=count35Fee+Rate35Fee;
		httpServletRequest.setAttribute("kv10", kv10);
		httpServletRequest.setAttribute("kv35", kv35);
		httpServletRequest.setAttribute("sum35Fee", df.format(sum35Fee));
		httpServletRequest.setAttribute("sum10Fee", df.format(sum10Fee));
		httpServletRequest.setAttribute("Rate35Fee", df.format(Rate35Fee));
		httpServletRequest.setAttribute("Rate10Fee", df.format(Rate10Fee));
		httpServletRequest.setAttribute("allRateCode35", allRateCode35);
		httpServletRequest.setAttribute("allRateCode10", allRateCode10);
		httpServletRequest.setAttribute("count10Fee", df.format(count10Fee));
		httpServletRequest.setAttribute("count35Fee", df.format(count35Fee));
		httpServletRequest.setAttribute("sum10Power", df.format(sum10Power));
		httpServletRequest.setAttribute("sum35power", df.format(sum35power));
		httpServletRequest.setAttribute("usum10power", df.format(usum10power));
		httpServletRequest.setAttribute("usum35power", df.format(usum35power));
		httpServletRequest.setAttribute("allPowerRateFee10", allPowerRateFee10);
		httpServletRequest.setAttribute("allPowerRateFee35", allPowerRateFee35);
		return actionMapping.findForward("newResult");
		
		
		
	}
	public static void main(String[] args) {
		System.out.println(Double.parseDouble("15928155.875"));
	

	
	}
}
