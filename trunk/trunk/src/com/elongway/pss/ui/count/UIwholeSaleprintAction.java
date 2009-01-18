package com.elongway.pss.ui.count;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.PowerFeeCal;

public class UIwholeSaleprintAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String LineCode=httpServletRequest.getParameter("LineCode");
		String wholesaleStyle=httpServletRequest.getParameter("wholesaleStyle"); 
		String company=httpServletRequest.getParameter("company");
		String exends1 = httpServletRequest.getParameter("exends1");
		String exends2 = httpServletRequest.getParameter("exends2");
		String exends3 = httpServletRequest.getParameter("exends3");
		String exends4 = httpServletRequest.getParameter("exends4");
		String exends5 = httpServletRequest.getParameter("exends5");
		String exends6 = httpServletRequest.getParameter("exends6");
		String exends7 = httpServletRequest.getParameter("exends7");
		String exends8 = httpServletRequest.getParameter("exends8");
		String exends9 = httpServletRequest.getParameter("exends9");
		String exends10 = httpServletRequest.getParameter("exends10");
		String exends11 = httpServletRequest.getParameter("exends11");
		String exends12 = httpServletRequest.getParameter("exends12");
		String exends13 = httpServletRequest.getParameter("exends13");
		String exends14 = httpServletRequest.getParameter("exends14");
		String exends15 = httpServletRequest.getParameter("exends15");
		String exends16 = httpServletRequest.getParameter("exends16");
		String exends17 = httpServletRequest.getParameter("exends17");
		String exends18 = httpServletRequest.getParameter("exends18");
		httpServletRequest.setAttribute("exends1", exends1);
		httpServletRequest.setAttribute("exends2", exends2);
		httpServletRequest.setAttribute("exends3", exends3);
		httpServletRequest.setAttribute("exends4", exends4);
		httpServletRequest.setAttribute("exends5", exends5);
		httpServletRequest.setAttribute("exends6", exends6);
		httpServletRequest.setAttribute("exends7", exends7);
		httpServletRequest.setAttribute("exends8", exends8);
		httpServletRequest.setAttribute("exends9", exends9);
		httpServletRequest.setAttribute("exends10", exends10);
		httpServletRequest.setAttribute("exends11", exends11);
		httpServletRequest.setAttribute("exends12", exends12);
		httpServletRequest.setAttribute("exends13", exends13);
		httpServletRequest.setAttribute("exends14", exends14);
		httpServletRequest.setAttribute("exends15", exends15);
		httpServletRequest.setAttribute("exends16", exends16);
		httpServletRequest.setAttribute("exends17", exends17);
		httpServletRequest.setAttribute("exends18", exends18);
		
		String condition=" 1=1";
		DecimalFormat df = new DecimalFormat("###0.00");
			String serchDate=inputDate.substring(0, 7);
			condition+=" and StatMonth like '"+serchDate+"%'";
		
			String conditions10=" upcompany='"+company+"'"+" and KV=10 and StatMonth='"+serchDate+"'";
			String conditions35=" upcompany='"+company+"'"+" and KV=35 and StatMonth='"+serchDate+"'" ;
			String conditionsAll=" flag='"+company+"'"+"  and StatMonth='"+serchDate+"'" +" order by userNo";
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
			double sumAllFee=0;
			double agriculturalPower10=0;
			double producePower10=0;
			double residentPower10=0;
			double indecisivePower10=0;
			double industryPower10=0;
			double agriculturalFee10=0;
			double produceFee10=0;
			double residentFee10=0;
			double indecisiveFee10=0;
			double industryFee10=0;
			double businessFee10=0;
			double businessPower10=0;
			double agriculturalPower35=0;
			double producePower35=0;
			double residentPower35=0;
			double indecisivePower35=0;
			double industryPower35=0;
			double agriculturalFee35=0;
			double produceFee35=0;
			double residentFee35=0;
			double indecisiveFee35=0;
			double industryFee35=0;
			double businessFee35=0;
			double businessPower35=0;
			double lineLoss=0;
			double trassLoss=0;
			double sumFee=0;
			double sumRateFee=0;
			double powerRateFee=0;
			double sanxiaPower=0;
			double nongwanghaidaiPower=0;
			double kezaishengpepolePower=0;
			double kezaishengnotpepolePower=0;
			double kuquPower=0;
			double sanxiaFee=0;
			double nongwanghaidaiFee=0;
			double kezaishengpepoleFee=0;
			double kezaishengnotpepoleFee=0;
			double kuquFee=0;
			double sumPower=0;
			double unsumPower=0	;
			double tax=0;
			double differenceQuantity=0;
			double differencePrice=0;
			double differenceQuantityFee=0;
			Iterator it10=kv10.iterator();
			while(it10.hasNext()){
				LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it10.next();
				sum10Power+=lwWholeSaleSummaryDto.getPointerQuantity() ;
				usum10power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
				agriculturalPower10+=lwWholeSaleSummaryDto.getFarmUseQuantity();
				producePower10+=lwWholeSaleSummaryDto.getProductQuantity();
				residentPower10+=lwWholeSaleSummaryDto.getDenizenQuantity();
				indecisivePower10+=lwWholeSaleSummaryDto.getUnDenizenQuantity();
				usum10power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
				differenceQuantity+=Double.parseDouble(lwWholeSaleSummaryDto.getDifferenceQuantity());
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("0")){
					industryPower10+=lwWholeSaleSummaryDto.getIndustryQuantity();
				}
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("1")){
					industryPower10+=lwWholeSaleSummaryDto.getPointerQuantity();
				}	
				agriculturalFee10+=lwWholeSaleSummaryDto.getFarmUseFee();
				produceFee10+=lwWholeSaleSummaryDto.getPowerFee();
				residentFee10+=lwWholeSaleSummaryDto.getDenizenFee();
				indecisiveFee10+=lwWholeSaleSummaryDto.getUnDenizenFee();
				industryFee10+=lwWholeSaleSummaryDto.getIndustryFee();
				businessFee10+=lwWholeSaleSummaryDto.getBizFee();
				lineLoss+=lwWholeSaleSummaryDto.getLineLoss();
				trassLoss+=lwWholeSaleSummaryDto.getTransLoss();
				powerRateFee+=lwWholeSaleSummaryDto.getPowerRateFee();
			}
			
			count10Fee=Math.round(count10Fee*100)/100;
			sum10Power=Math.round(sum10Power);
			Iterator it35=kv35.iterator();
			while(it35.hasNext()){
				LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it35.next();
				
				sum35power+=lwWholeSaleSummaryDto.getPointerQuantity();
				usum35power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
				agriculturalPower35+=lwWholeSaleSummaryDto.getFarmUseQuantity();
				producePower35+=lwWholeSaleSummaryDto.getProductQuantity();
				residentPower35+=lwWholeSaleSummaryDto.getDenizenQuantity();
				indecisivePower35+=lwWholeSaleSummaryDto.getUnDenizenQuantity();
				differenceQuantity+=Double.parseDouble(lwWholeSaleSummaryDto.getDifferenceQuantity());
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("0")){
					industryPower35+=lwWholeSaleSummaryDto.getIndustryQuantity();
				}
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("1")){
					industryPower35+=lwWholeSaleSummaryDto.getPointerQuantity();
				}	
				agriculturalFee35+=lwWholeSaleSummaryDto.getFarmUseFee();
				produceFee35+=lwWholeSaleSummaryDto.getPowerFee();
				residentFee35+=lwWholeSaleSummaryDto.getDenizenFee();
				indecisiveFee35+=lwWholeSaleSummaryDto.getUnDenizenFee();
				industryFee35+=lwWholeSaleSummaryDto.getIndustryFee();
				businessFee35+=lwWholeSaleSummaryDto.getBizFee();
				lineLoss+=lwWholeSaleSummaryDto.getLineLoss();
				trassLoss+=lwWholeSaleSummaryDto.getTransLoss();
				powerRateFee+=lwWholeSaleSummaryDto.getPowerRateFee();	
			}
			
			PowerFeeCal powerFeeCal1=new PowerFeeCal();
		
			PowerFeeCal powerFeeCal=new PowerFeeCal();
	
		
			LwWholeSalePurePriceDto LwWholeSalePurePriceDto10=new LwWholeSalePurePriceDto();
			LwWholeSalePurePriceDto LwWholeSalePurePriceDto35=new LwWholeSalePurePriceDto();
			BLLwWholeSalePurePriceFacade blLwWholeSalePurePriceFacade=new BLLwWholeSalePurePriceFacade();
			LwWholeSalePurePriceDto lwWholeSalePurePriceDto10=powerFeeCal.getPurWholeSalePrice(company, "10");
			LwWholeSalePurePriceDto lwWholeSalePurePriceDto35=powerFeeCal.getPurWholeSalePrice(company, "35");
			
			
			double agriculturalPrice10=lwWholeSalePurePriceDto10.getFarmPrice();
			double producePrice10=lwWholeSalePurePriceDto10.getProducePrice();
			double residentPrice10=lwWholeSalePurePriceDto10.getPeoplePrice();
			double indecisivePrice10=lwWholeSalePurePriceDto10.getNotPeoplePrice();
			double industryPrice10=lwWholeSalePurePriceDto10.getBusinessPrice();
			double businessPrice10=lwWholeSalePurePriceDto10.getBusinessPrice();
		
			sum10Fee=count10Fee+Rate10Fee;
			
			
			
			
			double agriculturalPrice35=lwWholeSalePurePriceDto35.getFarmPrice();
			double producePrice35=lwWholeSalePurePriceDto35.getProducePrice();
			double residentPrice35=lwWholeSalePurePriceDto35.getPeoplePrice();
			double indecisivePrice35=lwWholeSalePurePriceDto35.getNotPeoplePrice();
			double industryPrice35=lwWholeSalePurePriceDto35.getBusinessPrice();
			double businessPrice35=lwWholeSalePurePriceDto35.getBusinessPrice();
			if(company.equals("gy")||company.equals("dm")){
				sanxiaPower=producePower10+residentPower10+indecisivePower10+industryPower10+businessPower10+producePower35+residentPower35+indecisivePower35+industryPower35+businessPower35;
				sanxiaFee=sanxiaPower*0.004*0.88;
				
			}else{
				sanxiaPower=producePower10+residentPower10+indecisivePower10+industryPower10+businessPower10+producePower35+residentPower35+indecisivePower35+industryPower35+businessPower35+agriculturalPower35+agriculturalPower10;
				sanxiaFee=sanxiaPower*0.004*0.88;
			}
			if(company.equals("gy")||company.equals("dm")){
				nongwanghaidaiPower=producePower10+residentPower10+indecisivePower10+industryPower10+businessPower10+producePower35+residentPower35+indecisivePower35+industryPower35+businessPower35;
				nongwanghaidaiFee=sanxiaPower*0.02*0.88;
				
			}else{
				nongwanghaidaiPower=producePower10+residentPower10+indecisivePower10+industryPower10+businessPower10+producePower35+residentPower35+indecisivePower35+industryPower35+businessPower35+agriculturalPower35+agriculturalPower10;
				nongwanghaidaiFee=sanxiaPower*0.02*0.88;
			}
			kezaishengpepolePower=residentPower10+indecisivePower35;
			kezaishengpepoleFee=kezaishengpepolePower*0.001*0.88;
			kezaishengnotpepolePower=indecisivePower10+businessPower10+industryPower10+indecisivePower35+businessPower35+industryPower35;
			kezaishengnotpepoleFee=kezaishengnotpepolePower*0.002*0.88;
			kuquPower=residentPower10+indecisivePower10+industryPower10+businessPower10+residentPower35+indecisivePower35+industryPower35+businessPower35;
			kuquFee=kuquPower*0.0031*0.88;
			count35Fee=agriculturalFee35+produceFee35+residentFee35+indecisiveFee35+industryFee35+businessFee35;
			//Rate35Fee=count35Fee*allPowerRateFee35;
			differenceQuantityFee=differenceQuantity*differencePrice;
			sumAllFee=agriculturalFee35+produceFee35+residentFee35+indecisiveFee35+industryFee35+businessFee35+agriculturalFee10+produceFee10+residentFee10+indecisiveFee10+industryFee10+businessFee10+powerRateFee+sanxiaFee+nongwanghaidaiFee+kezaishengpepoleFee+kezaishengnotpepoleFee+kuquFee;
			tax=sumAllFee/1.17*0.17;
			sumPower=sum10Power+sum35power;
			unsumPower=usum10power+usum35power;
			BLLwWholeSaleIndicatorFacade  blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
			Collection all=blLwWholeSaleIndicatorFacade.findByConditions(conditionsAll);
			sum35Fee=count35Fee+Rate35Fee;
			httpServletRequest.setAttribute("all", all);
			httpServletRequest.setAttribute("company", company);
			httpServletRequest.setAttribute("statMonth", serchDate);
			httpServletRequest.setAttribute("sumAllFee", df.format(sumAllFee));
			httpServletRequest.setAttribute("tax", df.format(tax));
			httpServletRequest.setAttribute("agriculturalPower10", df.format(agriculturalPower10));
			httpServletRequest.setAttribute("producePower10", df.format(producePower10));
			httpServletRequest.setAttribute("residentPower10", df.format(residentPower10));
			httpServletRequest.setAttribute("indecisivePower10", df.format(indecisivePower10));
			httpServletRequest.setAttribute("industryPower10", df.format(industryPower10));
			httpServletRequest.setAttribute("agriculturalFee10", df.format(agriculturalFee10));
			httpServletRequest.setAttribute("produceFee10", df.format(produceFee10));
			httpServletRequest.setAttribute("residentFee10", df.format(residentFee10));
			httpServletRequest.setAttribute("indecisiveFee10", df.format(indecisiveFee10));
			httpServletRequest.setAttribute("industryFee10", df.format(industryFee10));
			httpServletRequest.setAttribute("businessFee10", df.format(businessFee10));
			httpServletRequest.setAttribute("businessPower10", df.format(businessPower10));
			httpServletRequest.setAttribute("agriculturalPower35", df.format(agriculturalPower35));
			httpServletRequest.setAttribute("producePower35", df.format(producePower35));
			httpServletRequest.setAttribute("residentPower35", df.format(residentPower35));
			httpServletRequest.setAttribute("indecisivePower35", df.format(indecisivePower35));
			httpServletRequest.setAttribute("industryPower35", df.format(industryPower35));
			httpServletRequest.setAttribute("agriculturalFee35", df.format(agriculturalFee35));
			httpServletRequest.setAttribute("produceFee35", df.format(produceFee35));
			httpServletRequest.setAttribute("residentFee35", df.format(residentFee35));
			httpServletRequest.setAttribute("indecisiveFee35", df.format(indecisiveFee35));
			httpServletRequest.setAttribute("industryFee35", df.format(industryFee35));
			httpServletRequest.setAttribute("businessFee35", df.format(businessFee35));
			httpServletRequest.setAttribute("businessPower35", df.format(businessPower35));
			httpServletRequest.setAttribute("lineLoss", df.format(lineLoss));
			httpServletRequest.setAttribute("trassLoss", df.format(trassLoss));
			httpServletRequest.setAttribute("sumFee", df.format(sumFee));
			httpServletRequest.setAttribute("sumRateFee", df.format(sumRateFee));
			httpServletRequest.setAttribute("powerRateFee", df.format(powerRateFee));
			httpServletRequest.setAttribute("sanxiaPower", df.format(sanxiaPower));
			
			httpServletRequest.setAttribute("nongwanghaidaiPower", df.format(nongwanghaidaiPower));
			httpServletRequest.setAttribute("kezaishengpepolePower", df.format(kezaishengpepolePower));
			httpServletRequest.setAttribute("kezaishengnotpepolePower", df.format(kezaishengnotpepolePower));
			httpServletRequest.setAttribute("kuquPower", df.format(kuquPower));
			httpServletRequest.setAttribute("sanxiaFee", df.format(sanxiaFee));
			httpServletRequest.setAttribute("nongwanghaidaiFee", df.format(nongwanghaidaiFee));
			httpServletRequest.setAttribute("kezaishengpepoleFee", df.format(kezaishengpepoleFee));
			httpServletRequest.setAttribute("kezaishengnotpepoleFee", df.format(kezaishengnotpepoleFee));
			httpServletRequest.setAttribute("kuquFee", df.format(kuquFee));
			httpServletRequest.setAttribute("sumPower", df.format(sumPower));
			httpServletRequest.setAttribute("unsumPower", df.format(unsumPower));
			
			httpServletRequest.setAttribute("agriculturalPrice10", String.valueOf(agriculturalPrice10));
			httpServletRequest.setAttribute("producePrice10", String.valueOf(producePrice10));
			httpServletRequest.setAttribute("residentPrice10", String.valueOf(residentPrice10));
			httpServletRequest.setAttribute("indecisivePrice10", String.valueOf(indecisivePrice10));
			httpServletRequest.setAttribute("industryPrice10", String.valueOf(industryPrice10));
			httpServletRequest.setAttribute("businessPrice10", String.valueOf(businessPrice10));
	
			httpServletRequest.setAttribute("agriculturalPrice35", String.valueOf(agriculturalPrice35));
			httpServletRequest.setAttribute("producePrice35", String.valueOf(producePrice35));
			httpServletRequest.setAttribute("residentPrice35", String.valueOf(residentPrice35));
			httpServletRequest.setAttribute("indecisivePrice35", String.valueOf(indecisivePrice35));
			httpServletRequest.setAttribute("industryPrice35", String.valueOf(industryPrice35));
			httpServletRequest.setAttribute("businessPrice35", String.valueOf(businessPrice35));
			
			httpServletRequest.setAttribute("differenceQuantity", String.valueOf(differenceQuantity));
			httpServletRequest.setAttribute("differencePrice", String.valueOf(differencePrice));
			httpServletRequest.setAttribute("differenceQuantityFee", df.format(differenceQuantityFee));
			return actionMapping.findForward("WholeSaleprint");
			
			
			
		
		
		
}

}
