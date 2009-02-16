package com.elongway.pss.ui.allSerch;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.PowerFeeCal;

public class UIAllLineSerchAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		
		String inputDate=httpServletRequest.getParameter("inputDate");
		String comcode=httpServletRequest.getParameter("company");
		String inputdate=inputDate.substring(0, 7);
		
		PowerFeeCal  powerFeeCal=new PowerFeeCal();
		DecimalFormat df = new DecimalFormat("###0.00");
		String conditions10=" upcompany='"+comcode+"'"+" and KV=10 and StatMonth='"+inputdate+"'"+"  order by linecode";
		String conditions35=" upcompany='"+comcode+"'"+" and KV=35 and StatMonth='"+inputdate+"'"+"   order by linecode" ;
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
		
		Iterator it10=kv10.iterator();
		while(it10.hasNext()){
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it10.next();
			sum10Power+=lwWholeSaleSummaryDto.getElectricQuantity();
			
			usum10power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
			
		}
		
		count10Fee=Math.round(count10Fee*100)/100;
		sum10Power=Math.round(sum10Power);
		Iterator it35=kv35.iterator();
		while(it35.hasNext()){
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it35.next();
			
			sum35power+=lwWholeSaleSummaryDto.getElectricQuantity();
			usum35power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
		}
		
		PowerFeeCal powerFeeCal1=new PowerFeeCal();
		double allRateCode10=powerFeeCal1.poweradjustrate(String.valueOf(sum10Power), String.valueOf(usum10power))/100;
		double allPowerRateFee10=powerFeeCal1.poweradjustmentValue(String.valueOf(sum10Power), String.valueOf(usum10power), "1", String.valueOf(allRateCode10));
		double allRateCode35=powerFeeCal1.poweradjustrate(String.valueOf(sum35power), String.valueOf(usum35power))/100;
		double allPowerRateFee35=powerFeeCal1.poweradjustmentValue(String.valueOf(sum35power), String.valueOf(usum35power), "1", String.valueOf(allRateCode35));
		
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
		double agriculturalPower35=sum35power*agricultural35;
		double producePower35=sum35power*produce35;
		double residentPower35=sum35power*resident35;
		double indecisivePower35=sum35power*indecisive10;
		double industryPower35=sum35power*industry35;
		double businessPower35=sum35power*business35;
		
		
		double agriculturalPrice35=lwWholeSalePurePriceDto35.getFarmPrice();
		double producePrice35=lwWholeSalePurePriceDto35.getProducePrice();
		double residentPrice35=lwWholeSalePurePriceDto35.getPeoplePrice();
		double indecisivePrice35=lwWholeSalePurePriceDto35.getNotPeoplePrice();
		double industryPrice35=lwWholeSalePurePriceDto35.getBusinessPrice();
		double businessPrice35=lwWholeSalePurePriceDto35.getBusinessPrice();
		double agriculturalFee35=agriculturalPower35*agriculturalPrice35;
		double produceFee35=producePower35*producePrice35;
		double residentFee35=residentPower35*residentPrice35;
		double indecisiveFee35=indecisivePower35*industryPrice35;
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
		return actionMapping.findForward("viewWholeOtherSaleResult");
	}

}
