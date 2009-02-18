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

import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorBakFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.PowerFeeCal;

public class UIWholeSaleFinalCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String LineCode=httpServletRequest.getParameter("LineCode");
		String wholesaleStyle=httpServletRequest.getParameter("wholesaleStyle"); 
		String company=httpServletRequest.getParameter("company");
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
			double sumwholesalefa=0;
			double Rate10Fee=0;
			double Rate35Fee=0;
			double sum10Power=0;
			double sum35power=0;
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
			double differencePrice=0.2;
			double differenceQuantityFee=0;
			Iterator it10=kv10.iterator();
			while(it10.hasNext()){
				LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it10.next();
				sum10Power+=lwWholeSaleSummaryDto.getElectricQuantity() ;
				usum10power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
				agriculturalPower10+=Math.round(lwWholeSaleSummaryDto.getFarmUseQuantity());
				producePower10+=lwWholeSaleSummaryDto.getProductQuantity();
				businessPower10+=lwWholeSaleSummaryDto.getBizQuantity();
				residentPower10+=lwWholeSaleSummaryDto.getDenizenQuantity();
				indecisivePower10+=lwWholeSaleSummaryDto.getUnDenizenQuantity();
				usum10power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
				differenceQuantity+=Double.parseDouble(lwWholeSaleSummaryDto.getDifferenceQuantity());
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("0")){
					industryPower10+=lwWholeSaleSummaryDto.getIndustryQuantity();
				}
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("1")){
					industryPower10+=lwWholeSaleSummaryDto.getElectricQuantity();
					 sumwholesalefa+=lwWholeSaleSummaryDto.getElectricQuantity();
				}	
				agriculturalFee10+=lwWholeSaleSummaryDto.getFarmUseFee();
				produceFee10+=lwWholeSaleSummaryDto.getProductFee();
				residentFee10+=lwWholeSaleSummaryDto.getDenizenFee();
				indecisiveFee10+=lwWholeSaleSummaryDto.getUnDenizenFee();
				industryFee10+=lwWholeSaleSummaryDto.getIndustryFee();
				businessFee10+=lwWholeSaleSummaryDto.getBizFee();
				lineLoss+=lwWholeSaleSummaryDto.getLineLoss();
				trassLoss+=lwWholeSaleSummaryDto.getTransLoss();
				powerRateFee+=lwWholeSaleSummaryDto.getPowerRateFee();
				Rate10Fee+=lwWholeSaleSummaryDto.getPowerRateFee();
				sum10Fee+=lwWholeSaleSummaryDto.getSumFee();
				sumAllFee+=lwWholeSaleSummaryDto.getSumFee();
			}
			
			count10Fee=Math.round(count10Fee*100)/100;
			sum10Power=Math.round(sum10Power);
			Iterator it35=kv35.iterator();
			while(it35.hasNext()){
				LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it35.next();
				
				sum35power+=lwWholeSaleSummaryDto.getElectricQuantity()	;
				usum35power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
				agriculturalPower35+=Math.round(lwWholeSaleSummaryDto.getFarmUseQuantity());
				producePower35+=lwWholeSaleSummaryDto.getProductQuantity();
				residentPower35+=lwWholeSaleSummaryDto.getDenizenQuantity();
				indecisivePower35+=lwWholeSaleSummaryDto.getUnDenizenQuantity();
				businessPower35+=lwWholeSaleSummaryDto.getBizQuantity();
				differenceQuantity+=Double.parseDouble(lwWholeSaleSummaryDto.getDifferenceQuantity());
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("0")){
					industryPower35+=lwWholeSaleSummaryDto.getIndustryQuantity();
				}
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("1")){
					industryPower35+=lwWholeSaleSummaryDto.getPointerQuantity();
					sumwholesalefa+=lwWholeSaleSummaryDto.getElectricQuantity();
				}	
				agriculturalFee35+=lwWholeSaleSummaryDto.getFarmUseFee();
				produceFee35+=lwWholeSaleSummaryDto.getProductFee();
				residentFee35+=lwWholeSaleSummaryDto.getDenizenFee();
				indecisiveFee35+=lwWholeSaleSummaryDto.getUnDenizenFee();
				industryFee35+=lwWholeSaleSummaryDto.getIndustryFee();
				businessFee35+=lwWholeSaleSummaryDto.getBizFee();
				lineLoss+=lwWholeSaleSummaryDto.getLineLoss();
				trassLoss+=lwWholeSaleSummaryDto.getTransLoss();
				powerRateFee+=lwWholeSaleSummaryDto.getPowerRateFee();
				sum35Fee+=lwWholeSaleSummaryDto.getSumFee();
				Rate35Fee+=lwWholeSaleSummaryDto.getPowerRateFee();
				sumAllFee+=lwWholeSaleSummaryDto.getSumFee();
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
			double industryPrice10=lwWholeSalePurePriceDto10.getIndustryPrice();
			double businessPrice10=lwWholeSalePurePriceDto10.getBusinessPrice();
		
			
			
			
			
			sumPower=sum10Power+sum35power;
			double agriculturalPrice35=lwWholeSalePurePriceDto35.getFarmPrice();
			double producePrice35=lwWholeSalePurePriceDto35.getProducePrice();
			double residentPrice35=lwWholeSalePurePriceDto35.getPeoplePrice();
			double indecisivePrice35=lwWholeSalePurePriceDto35.getNotPeoplePrice();
			double industryPrice35=lwWholeSalePurePriceDto35.getIndustryPrice();
			double businessPrice35=lwWholeSalePurePriceDto35.getBusinessPrice();
			if(company.equals("gy")||company.equals("dm")){
				sanxiaPower=sumPower-agriculturalPower35-agriculturalPower10;
				sanxiaFee=sanxiaPower*0.004*0.88;
				
			}else{
				sanxiaPower=sumPower;
				sanxiaFee=sanxiaPower*0.004*0.88;
			}
			if(company.equals("gy")||company.equals("dm")){
				nongwanghaidaiPower=sumPower-agriculturalPower35-agriculturalPower10;
				nongwanghaidaiFee=nongwanghaidaiPower*0.02*0.88;
				
			}else{
				nongwanghaidaiPower=sumPower-agriculturalPower35-agriculturalPower10;
				nongwanghaidaiFee=nongwanghaidaiPower*0.02*0.88;
			}
			kezaishengpepolePower=residentPower10+residentPower35;
			kezaishengpepoleFee=kezaishengpepolePower*0.001*0.88;
			//kezaishengnotpepolePower=indecisivePower10+businessPower10+industryPower10+indecisivePower35+businessPower35+industryPower35;
			
			kezaishengnotpepolePower=sumPower-agriculturalPower35-residentPower35-producePower35-agriculturalPower10-residentPower10-producePower10;
			kezaishengnotpepoleFee=kezaishengnotpepolePower*0.002*0.88;
			//kuquPower=residentPower10+indecisivePower10+industryPower10+businessPower10+residentPower35+indecisivePower35+industryPower35+businessPower35;
			kuquPower=sumPower-agriculturalPower35-producePower35-agriculturalPower10-producePower10;
			
			kuquFee=kuquPower*0.0031*0.88;
			count35Fee=agriculturalFee35+produceFee35+residentFee35+indecisiveFee35+industryFee35+businessFee35;
			//Rate35Fee=count35Fee*allPowerRateFee35;
			differenceQuantityFee=differenceQuantity*differencePrice;
			sumAllFee+=sanxiaFee+nongwanghaidaiFee+kezaishengpepoleFee+kezaishengnotpepoleFee+kuquFee+differenceQuantityFee;
			tax=sumAllFee/1.17*0.17;
			
			unsumPower=usum10power+usum35power;
			BLLwWholeSaleIndicatorFacade  blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
			Collection all=blLwWholeSaleIndicatorFacade.findByConditions(conditionsAll);
			
			httpServletRequest.setAttribute("all", all);
			httpServletRequest.setAttribute("company", company);
			httpServletRequest.setAttribute("statMonth", serchDate);
			httpServletRequest.setAttribute("sumAllFee", df.format(sumAllFee));
			httpServletRequest.setAttribute("tax", df.format(tax));
			httpServletRequest.setAttribute("agriculturalPower10", df.format(Math.round(agriculturalPower10)));
			httpServletRequest.setAttribute("producePower10", df.format(Math.round(producePower10)));
			httpServletRequest.setAttribute("residentPower10", df.format(Math.round(residentPower10)));
			httpServletRequest.setAttribute("indecisivePower10", df.format(Math.round(indecisivePower10)));
			
			
			httpServletRequest.setAttribute("sumwholesalefa", df.format(sumwholesalefa));
			httpServletRequest.setAttribute("industryPower10", df.format(Math.round(industryPower10)));
			httpServletRequest.setAttribute("agriculturalFee10", df.format(agriculturalFee10));
			httpServletRequest.setAttribute("produceFee10", df.format(produceFee10));
			httpServletRequest.setAttribute("residentFee10", df.format(residentFee10));
			httpServletRequest.setAttribute("indecisiveFee10", df.format(indecisiveFee10));
			httpServletRequest.setAttribute("industryFee10", df.format(industryFee10));
			httpServletRequest.setAttribute("businessFee10", df.format(businessFee10));
			httpServletRequest.setAttribute("businessPower10", df.format(Math.round(businessPower10)));
			httpServletRequest.setAttribute("agriculturalPower35", df.format(Math.round(agriculturalPower35)));
			httpServletRequest.setAttribute("producePower35", df.format(Math.round(producePower35)));
			httpServletRequest.setAttribute("residentPower35", df.format(Math.round(residentPower35)));
			httpServletRequest.setAttribute("indecisivePower35", df.format(Math.round(indecisivePower35)));
			httpServletRequest.setAttribute("industryPower35", df.format(Math.round(industryPower35)));
			httpServletRequest.setAttribute("agriculturalFee35", df.format(agriculturalFee35));
			httpServletRequest.setAttribute("produceFee35", df.format(produceFee35));
			httpServletRequest.setAttribute("residentFee35", df.format(residentFee35));
			httpServletRequest.setAttribute("indecisiveFee35", df.format(indecisiveFee35));
			httpServletRequest.setAttribute("industryFee35", df.format(industryFee35));
			httpServletRequest.setAttribute("businessFee35", df.format(businessFee35));
			httpServletRequest.setAttribute("businessPower35", df.format(Math.round(businessPower35)));
			httpServletRequest.setAttribute("lineLoss", df.format(lineLoss));
			httpServletRequest.setAttribute("trassLoss", df.format(trassLoss));
			httpServletRequest.setAttribute("sumFee", df.format(sumFee));
			httpServletRequest.setAttribute("sumRateFee", df.format(sumRateFee));
			httpServletRequest.setAttribute("powerRateFee", df.format(powerRateFee));
			
			httpServletRequest.setAttribute("Rate10Fee", df.format(Rate10Fee));
			httpServletRequest.setAttribute("Rate35Fee", df.format(Rate35Fee));
			
			
			
			httpServletRequest.setAttribute("sanxiaPower", df.format(sanxiaPower));
			
			httpServletRequest.setAttribute("nongwanghaidaiPower", df.format(Math.round(nongwanghaidaiPower)));
			httpServletRequest.setAttribute("kezaishengpepolePower", df.format(Math.round(kezaishengpepolePower)));
			httpServletRequest.setAttribute("kezaishengnotpepolePower", df.format(Math.round(kezaishengnotpepolePower)));
			httpServletRequest.setAttribute("kuquPower", df.format(Math.round(kuquPower)));
			httpServletRequest.setAttribute("sanxiaFee", df.format(sanxiaFee));
			httpServletRequest.setAttribute("nongwanghaidaiFee", df.format(nongwanghaidaiFee));
			httpServletRequest.setAttribute("kezaishengpepoleFee", df.format(kezaishengpepoleFee));
			httpServletRequest.setAttribute("kezaishengnotpepoleFee", df.format(kezaishengnotpepoleFee));
			httpServletRequest.setAttribute("kuquFee", df.format(kuquFee));
			httpServletRequest.setAttribute("sumPower", df.format(Math.round(sumPower)));
			httpServletRequest.setAttribute("unsumPower", df.format(Math.round(unsumPower)));
			
			
			httpServletRequest.setAttribute("sum10Power", df.format(Math.round(sum10Power)));
			httpServletRequest.setAttribute("sum35power", df.format(Math.round(sum35power)));
			httpServletRequest.setAttribute("sum10Fee", df.format(sum10Fee));
			httpServletRequest.setAttribute("sum35Fee", df.format(sum35Fee));
			
			
			
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
			return actionMapping.findForward("viewWholeSaleCount");
			
			
			
		
		
		
}

}
