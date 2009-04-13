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

import com.elongway.pss.bl.facade.BLLwAllWholeFeeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleDetailFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorBakFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSalePurePriceFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.PowerFeeCal;

public class UIwholeSaleprintAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String LineCode=httpServletRequest.getParameter("LineCode");
		String wholesaleStyle=httpServletRequest.getParameter("wholesaleStyle"); 
		String company=httpServletRequest.getParameter("company");
		String now=PowerFeeCal.getCurrentBillMonth();
		String arry=httpServletRequest.getParameter("arr");
		String arr[]=arry.split(",");
		String serchDate=inputDate.substring(0, 7);
		
		DecimalFormat df = new DecimalFormat("###0.00");
		
		String exends1=arr[0];
	 	String exends2=arr[1];
	 	String exends3=arr[2];
	 	String exends4=arr[3];
	 	String exends5=arr[4];
	 	String exends6=arr[5];
	 	String exends7=arr[6];
	 	String exends8=arr[7];
	 	if(arr.length>8){
	 	String exends9=arr[8];
	 	String exends10=arr[9];
	 	httpServletRequest.setAttribute("exends9", exends9);
	 	httpServletRequest.setAttribute("exends10", exends10);
	 	}
	 
	
		
		String zongdianliang = httpServletRequest.getParameter("zongdianliang");
		String sum10fee = httpServletRequest.getParameter("sum10fee");
		String sum35fee = httpServletRequest.getParameter("sum35fee");
		String sanxia = httpServletRequest.getParameter("sanxia");
		// 农网还贷
		String dianjin = httpServletRequest.getParameter("dianjin");
		// 库区移民
		String jijin1 = httpServletRequest.getParameter("jijin1");
		// 可再生能源
		String jijin2 = httpServletRequest.getParameter("jijin2");
		// 可再生能源
		String jijin3 = httpServletRequest.getParameter("jijin3");
		// 差别电费
		String chabiedianfei = httpServletRequest.getParameter("chabiedianfei");
		
		
		String Power35 = httpServletRequest.getParameter("Power35");
		String Power10 = httpServletRequest.getParameter("Power10");
		
		
		String UnDenizenQuantity10kv = httpServletRequest.getParameter("UnDenizenQuantity10kv");
		String UnDenizenMoney10kv = httpServletRequest.getParameter("UnDenizenMoney10kv");
		String DenizenQuantity10kv = httpServletRequest.getParameter("DenizenQuantity10kv");
		String DenizenMoney10kv = httpServletRequest.getParameter("DenizenMoney10kv");
		String ProductQuantity10kv = httpServletRequest.getParameter("ProductQuantity10kv");
		String ProductMoney10kv = httpServletRequest.getParameter("ProductMoney10kv");
		String UnIndustryQuantity10kv = httpServletRequest.getParameter("UnIndustryQuantity10kv");
		String UnIndustryMoney10kv = httpServletRequest.getParameter("UnIndustryMoney10kv");
		String FarmUseQuantity10kv = httpServletRequest.getParameter("FarmUseQuantity10kv");
		String FarmUseMoney10kv = httpServletRequest.getParameter("FarmUseMoney10kv");
		String BizQuantity10kv = httpServletRequest.getParameter("BizQuantity10kv");
		String BizMoney10kv = httpServletRequest.getParameter("BizMoney10kv");
		String UnDenizenQuantity35kv = httpServletRequest.getParameter("UnDenizenQuantity35kv");
		String UnDenizenMoney35kv = httpServletRequest.getParameter("UnDenizenMoney35kv");
		String DenizenQuantity35kv = httpServletRequest.getParameter("DenizenQuantity35kv");
		String DenizenMoney35kv = httpServletRequest.getParameter("DenizenMoney35kv");
		String ProductQuantity35kv = httpServletRequest.getParameter("ProductQuantity35kv");
		String ProductMoney35kv = httpServletRequest.getParameter("ProductMoney35kv");
		String UnIndustryQuantity35kv = httpServletRequest.getParameter("UnIndustryQuantity35kv");
		String UnIndustryMoney35kv = httpServletRequest.getParameter("UnIndustryMoney35kv");
		String FarmUseQuantity35kv = httpServletRequest.getParameter("FarmUseQuantity35kv");
		String FarmUseMoney35kv = httpServletRequest.getParameter("FarmUseMoney35kv");
		String BizQuantity35kv = httpServletRequest.getParameter("BizQuantity35kv");
		String BizMoney35kv = httpServletRequest.getParameter("BizMoney35kv");
		String liLvDianFei = httpServletRequest.getParameter("liLvDianFei");
		LwWholeSaleDetailDto lwWholeSaleDetailDto = new LwWholeSaleDetailDto();
		lwWholeSaleDetailDto.setCompanyName(company);
		lwWholeSaleDetailDto.setInputDate(inputDate);
		lwWholeSaleDetailDto.setUnDenizenQuantity10kv(Double.parseDouble(UnDenizenQuantity10kv));
		lwWholeSaleDetailDto.setUnDenizenMoney10kv(Double.parseDouble(UnDenizenMoney10kv));
		lwWholeSaleDetailDto.setDenizenQuantity10kv(Double.parseDouble(DenizenQuantity10kv));
		lwWholeSaleDetailDto.setDenizenMoney10kv(Double.parseDouble(DenizenMoney10kv));
		lwWholeSaleDetailDto.setProductQuantity10kv(Double.parseDouble(ProductQuantity10kv));
		lwWholeSaleDetailDto.setProductMoney10kv(Double.parseDouble(ProductMoney10kv));
		lwWholeSaleDetailDto.setUnIndustryQuantity10kv(Double.parseDouble(UnIndustryQuantity10kv));
		lwWholeSaleDetailDto.setUnIndustryMoney10kv(Double.parseDouble(UnIndustryMoney10kv));
		lwWholeSaleDetailDto.setFarmUseQuantity10kv(Double.parseDouble(FarmUseQuantity10kv));
		lwWholeSaleDetailDto.setFarmUseMoney10kv(Double.parseDouble(FarmUseMoney10kv));
		lwWholeSaleDetailDto.setBizQuantity10kv(Double.parseDouble(BizQuantity10kv));
		lwWholeSaleDetailDto.setBizMoney10kv(Double.parseDouble(BizMoney10kv));
		lwWholeSaleDetailDto.setUnDenizenQuantity35kv(Double.parseDouble(UnDenizenQuantity35kv));
		lwWholeSaleDetailDto.setUnDenizenMoney35kv(Double.parseDouble(UnDenizenMoney35kv));
		lwWholeSaleDetailDto.setDenizenQuantity35kv(Double.parseDouble(DenizenQuantity35kv));
		lwWholeSaleDetailDto.setDenizenMoney35kv(Double.parseDouble(DenizenMoney35kv));
		lwWholeSaleDetailDto.setProductQuantity35kv(Double.parseDouble(ProductQuantity35kv));
		lwWholeSaleDetailDto.setProductMoney35kv(Double.parseDouble(ProductMoney35kv));
		lwWholeSaleDetailDto.setUnIndustryQuantity35kv(Double.parseDouble(UnIndustryQuantity35kv));
		lwWholeSaleDetailDto.setUnIndustryMoney35kv(Double.parseDouble(UnIndustryMoney35kv));
		lwWholeSaleDetailDto.setFarmUseQuantity35kv(Double.parseDouble(FarmUseQuantity35kv));
		lwWholeSaleDetailDto.setFarmUseMoney35kv(Double.parseDouble(FarmUseMoney35kv));
		lwWholeSaleDetailDto.setBizQuantity35kv(Double.parseDouble(BizQuantity35kv));
		lwWholeSaleDetailDto.setBizMoney35kv(Double.parseDouble(BizMoney35kv));
		
		BLLwWholeSaleDetailFacade bLLwWholeSaleDetailFacade = new BLLwWholeSaleDetailFacade();
		bLLwWholeSaleDetailFacade.delete(company,inputDate);
		bLLwWholeSaleDetailFacade.insert(lwWholeSaleDetailDto);
		
		LwAllWholeFeeDto lwAllWholeFeeDto=new LwAllWholeFeeDto();
		lwAllWholeFeeDto.setFujia3(liLvDianFei);
		lwAllWholeFeeDto.setCompany(company);
		lwAllWholeFeeDto.setDianfei(df.format((Double.parseDouble(sum10fee)+Double.parseDouble(sum35fee))/1.17));
		lwAllWholeFeeDto.setDianfeitax(df.format((Double.parseDouble(sum10fee)+Double.parseDouble(sum35fee))/1.17*0.17));
		lwAllWholeFeeDto.setJijin(df.format((Double.parseDouble(jijin1)+Double.parseDouble(jijin2)+Double.parseDouble(jijin3))/1.17));
		lwAllWholeFeeDto.setFujia1(df.format((Double.parseDouble(jijin1)+Double.parseDouble(jijin2)+Double.parseDouble(jijin3))-(Double.parseDouble(jijin1)+Double.parseDouble(jijin2)+Double.parseDouble(jijin3))/1.17));
		lwAllWholeFeeDto.setDianjin(df.format(Double.parseDouble(dianjin)/1.17));
		lwAllWholeFeeDto.setDianjintax(df.format(Double.parseDouble(dianjin)-Double.parseDouble(dianjin)/1.17));
		lwAllWholeFeeDto.setPower1(zongdianliang);
		//名称
		if(arr.length>8){
		lwAllWholeFeeDto.setFujia4(arr[8]);
		//附加费用
		lwAllWholeFeeDto.setFujia5(arr[9]);
		}
		lwAllWholeFeeDto.setFujia11(Power10);
		//差别电费
		lwAllWholeFeeDto.setFujia9(chabiedianfei);
		//35KV电量
		lwAllWholeFeeDto.setFujia12(Power35);
		//总电费
		lwAllWholeFeeDto.setSumfee(arr[7]);
		lwAllWholeFeeDto.setSanxia(df.format(Double.parseDouble(sanxia)/1.17));	
		lwAllWholeFeeDto.setSanxiatax(df.format(Double.parseDouble(sanxia)-Double.parseDouble(sanxia)/1.17));
		lwAllWholeFeeDto.setHaiminglu(arr[1]);
		lwAllWholeFeeDto.setDuobian(arr[3]);
		lwAllWholeFeeDto.setFujia2(arr[5]);
		lwAllWholeFeeDto.setInputdate(serchDate);
		BLLwAllWholeFeeFacade  blLwAllWholeFeeFacade=new BLLwAllWholeFeeFacade();
		blLwAllWholeFeeFacade.delete(company, serchDate);
		blLwAllWholeFeeFacade.insert(lwAllWholeFeeDto);
		LwAllWholeFeeDto tem= blLwAllWholeFeeFacade.findByPrimaryKey(company, serchDate);
		
		
		httpServletRequest.setAttribute("arr", arr);
		
		
		String condition=" 1=1";
			condition+=" and StatMonth like '"+serchDate+"%'";
		
			String conditions10=" upcompany='"+company+"'"+" and KV=10 and StatMonth='"+serchDate+"'";
			String conditions35=" upcompany='"+company+"'"+" and KV=35 and StatMonth='"+serchDate+"'" ;
			String conditionsAll="";
			if(now.equals(serchDate)){
			 conditionsAll=" flag='"+company+"'"+"  and StatMonth='"+serchDate+"'" +" order by userNo";
			}else{
				conditionsAll=" flag='"+company+"'"+"  and StatMonth='"+serchDate+"'" +" order by userNo";
			}
			BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
			Collection kv10=blLwWholeSaleSummaryFacade.findByConditions(conditions10);
			Collection kv35=blLwWholeSaleSummaryFacade.findByConditions(conditions35);
			double count10Fee=0;
			double count35Fee=0;
			double sum10Fee=0;
			double sum35Fee=0;
			
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
				
				differenceQuantity+=Double.parseDouble(lwWholeSaleSummaryDto.getDifferenceQuantity());
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("0")){
					industryPower10+=lwWholeSaleSummaryDto.getIndustryQuantity();
				}
				if(lwWholeSaleSummaryDto.getWholesaletype().equals("1")){
					industryPower10+=lwWholeSaleSummaryDto.getElectricQuantity();
					 
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
				sum10Fee+=lwWholeSaleSummaryDto.getSumFee()-lwWholeSaleSummaryDto.getPowerRateFee();
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
				Rate35Fee+=lwWholeSaleSummaryDto.getPowerRateFee();
				sum35Fee+=lwWholeSaleSummaryDto.getSumFee()-lwWholeSaleSummaryDto.getPowerRateFee();
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
			BLLwWholeSaleIndicatorBakFacade  blLwWholeSaleIndicatorBakFacade=new BLLwWholeSaleIndicatorBakFacade();
			Collection all=blLwWholeSaleIndicatorFacade.findByConditions(conditionsAll);
			Collection allbak=blLwWholeSaleIndicatorBakFacade.findByConditions(conditionsAll);
			httpServletRequest.setAttribute("all", all);
			httpServletRequest.setAttribute("allbak", allbak);
			httpServletRequest.setAttribute("company", company);
			httpServletRequest.setAttribute("statMonth", serchDate);
			httpServletRequest.setAttribute("sumAllFee", df.format(sumAllFee));
			httpServletRequest.setAttribute("tax", df.format(tax));
			httpServletRequest.setAttribute("agriculturalPower10", df.format(Math.round(agriculturalPower10)));
			httpServletRequest.setAttribute("producePower10", df.format(Math.round(producePower10)));
			httpServletRequest.setAttribute("residentPower10", df.format(Math.round(residentPower10)));
			httpServletRequest.setAttribute("indecisivePower10", df.format(Math.round(indecisivePower10)));
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
			httpServletRequest.setAttribute("sanxiaPower", df.format(sanxiaPower));
			
			httpServletRequest.setAttribute("sanxiaPower", df.format(sanxiaPower));
			
			httpServletRequest.setAttribute("Rate10Fee", df.format(Rate10Fee));
			httpServletRequest.setAttribute("Rate35Fee", df.format(Rate35Fee));
			
			
			httpServletRequest.setAttribute("sum10Power", df.format(Math.round(sum10Power)));
			httpServletRequest.setAttribute("sum35power", df.format(Math.round(sum35power)));
			httpServletRequest.setAttribute("sum10Fee", df.format(sum10Fee));
			httpServletRequest.setAttribute("sum35Fee", df.format(sum35Fee));
			
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
			
			httpServletRequest.setAttribute("exends1", exends1);
			httpServletRequest.setAttribute("exends2", exends2);
			httpServletRequest.setAttribute("exends3", exends3);
			httpServletRequest.setAttribute("exends4", exends4);
			httpServletRequest.setAttribute("exends5", exends5);
			httpServletRequest.setAttribute("exends6", exends6);
			httpServletRequest.setAttribute("exends7", exends7);
			httpServletRequest.setAttribute("exends8", exends8);
			
			
			return actionMapping.findForward("WholeSaleprint");
			
			
			
		
		
		
}

}
