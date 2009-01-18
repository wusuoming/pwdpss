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

import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;

public class UIAllCountAction extends Action {
	
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		httpServletRequest.setAttribute("inputDate", inputDate);
		String statmonth=inputDate.substring(0, 7);
		double sumffee=0;
		double sumfpower=0;
		double sumfdianfee=0;
		double sumftax=0;
		double sumfc=0;
		double summfdianjinall=0;
		double summfdianjin=0;
		double sumfdianjintax=0;
		double sumfsanxiaall=0;
		double sumfsanxia=0;
		double sumfsanxiatax=0;
		double sumfjijinall=0;
		double sumfjijin=0;
		double sumfjijintax=0;
		double sumallffee=0;
		
		double sumwfee=0;
		double sumwpower=0;
		double sumwdianfee=0;
		double sumwtax=0;
		double sumwc=0;
		double summwdianjinall=0;
		double summwdianjin=0;
		double sumwdianjintax=0;
		double sumwsanxiaall=0;
		double sumwsanxia=0;
		double sumwsanxiatax=0;
		double sumwjijinall=0;
		double sumwjijin=0;
		double sumwjijintax=0;
		double pepolepowergd=0;
		double notpepolepowergd=0;
		double bizpowergd=0;
		double productpowergd=0;
		double industrypowergd=0;
		double farmpowergd=0;
		double pepolepowerjt=0;
		double notpepolepowerjt=0;
		double bizpowerjt=0;
		double productpowerjt=0;
		double industrypowerjt=0;
		double farmpowerjt=0;
		double sumallwfee=0;
		
		
		double sumallfee=0;
		double sumallpower=0;
		double sumallc=0;
		double sumalltax=0;
		double sumallall=0;
		double sumalldianjin=0;
		double sumalldianjintax=0;
		double sumallsanxia=0;
		double sumallsanxiatax=0;
		double sumalljijin=0;
		double sumalljijintax=0;
		
		
		
		
		
		DecimalFormat df = new DecimalFormat("###0.00");
		String conditions=" 1=1 and statmonth ='"+statmonth+"'";
		String conditionwgd=" 1=1 and statmonth ='"+statmonth+"' and upcompany='gy' or upcompany='dm'";
		String conditionwtj=" 1=1 and statmonth ='"+statmonth+"' and upcompany='ty' or upcompany='jy'";
		BLLwCorporationSummaryFacade  blLwCorporationSummaryFacade=new BLLwCorporationSummaryFacade();
		Collection colf=blLwCorporationSummaryFacade.findByConditions(conditions);
		LwCorporationSummaryDto  lwCorporationSummaryDto=new LwCorporationSummaryDto();
		Iterator itf=colf.iterator();
		while(itf.hasNext()){
			lwCorporationSummaryDto =(LwCorporationSummaryDto)itf.next();
			sumfpower+=lwCorporationSummaryDto.getSumPointerQuantity()+lwCorporationSummaryDto.getBeforPower()+lwCorporationSummaryDto.getLastPower();
			sumfdianfee+=lwCorporationSummaryDto.getPointerFee()+lwCorporationSummaryDto.getPowerRateFee();
			summfdianjinall+=lwCorporationSummaryDto.getSurcharge();
			sumfsanxiaall+=lwCorporationSummaryDto.getPowerFee();
			sumfjijinall+=lwCorporationSummaryDto.getSurcharge();
			
			
			
			
		}
		BLLwWholeSaleSummaryFacade  blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		Collection colwgd=blLwWholeSaleSummaryFacade.findByConditions(conditionwgd);
		LwWholeSaleSummaryDto  lwWholeSaleSummaryDtogd=new LwWholeSaleSummaryDto();
		Iterator itwgd=colwgd.iterator();
		while(itwgd.hasNext()){
			lwWholeSaleSummaryDtogd=(LwWholeSaleSummaryDto)itwgd.next();
			
			 pepolepowergd+=lwWholeSaleSummaryDtogd.getDenizenQuantity();
			 notpepolepowergd+=lwWholeSaleSummaryDtogd.getUnDenizenQuantity();
			 bizpowergd+=lwWholeSaleSummaryDtogd.getBizQuantity();
			 productpowergd+=lwWholeSaleSummaryDtogd.getProductQuantity();
			 if(lwWholeSaleSummaryDtogd.getWholesaletype().equals("0")){
			 industrypowergd+=lwWholeSaleSummaryDtogd.getIndustryQuantity();
			 }
			 if(lwWholeSaleSummaryDtogd.getWholesaletype().equals("1")){
				 industrypowergd+=lwWholeSaleSummaryDtogd.getElectricQuantity();
			 }
			 farmpowergd+=lwWholeSaleSummaryDtogd.getFarmUseQuantity();
			 sumwpower+=lwWholeSaleSummaryDtogd.getElectricQuantity();
			 sumwdianfee+=lwWholeSaleSummaryDtogd.getSumFee();			 
			
		}
		
		
		Collection colwtj=blLwWholeSaleSummaryFacade.findByConditions(conditionwtj);
		LwWholeSaleSummaryDto  lwWholeSaleSummaryDtotj=new LwWholeSaleSummaryDto();
		Iterator itwtj=colwtj.iterator();
		while(itwtj.hasNext()){
			lwWholeSaleSummaryDtotj=(LwWholeSaleSummaryDto)itwtj.next();
			
			 pepolepowerjt+=lwWholeSaleSummaryDtotj.getDenizenQuantity();
			 notpepolepowerjt+=lwWholeSaleSummaryDtotj.getUnDenizenQuantity();
			 bizpowerjt+=lwWholeSaleSummaryDtotj.getBizQuantity();
			 productpowerjt+=lwWholeSaleSummaryDtotj.getProductQuantity();
			 if(lwWholeSaleSummaryDtotj.getWholesaletype().equals("0")){
			 industrypowerjt+=lwWholeSaleSummaryDtotj.getIndustryQuantity();
			 }
			 if(lwWholeSaleSummaryDtotj.getWholesaletype().equals("1")){
				 industrypowerjt+=lwWholeSaleSummaryDtotj.getElectricQuantity();
			 }
			 farmpowerjt+=lwWholeSaleSummaryDtotj.getFarmUseQuantity();
			 sumwpower+=lwWholeSaleSummaryDtotj.getElectricQuantity();
			 sumwdianfee+=lwWholeSaleSummaryDtotj.getSumFee();
			
		}
		sumwsanxiaall=(pepolepowergd+notpepolepowergd+bizpowergd+productpowergd+industrypowergd+pepolepowerjt+notpepolepowerjt+bizpowerjt+productpowerjt+industrypowerjt+farmpowerjt)*0.004*0.88;
		summwdianjinall=(pepolepowerjt+notpepolepowerjt+bizpowerjt+productpowerjt+industrypowerjt+pepolepowergd+notpepolepowergd+bizpowergd+productpowergd+industrypowergd)*0.02*0.88;
		sumwjijinall=(pepolepowerjt+pepolepowergd)*0.001*0.88+(notpepolepowerjt+bizpowerjt+industrypowerjt+notpepolepowergd+bizpowergd+industrypowergd)*0.002*0.88+(pepolepowerjt+notpepolepowerjt+bizpowerjt+industrypowerjt+pepolepowergd+notpepolepowergd+bizpowergd+industrypowergd)*0.0031*0.88;
		sumwc=sumwdianfee/1.17;
		sumwtax=sumwdianfee/1.17*0.17;
		sumwdianjintax=summwdianjinall/1.17*0.17;
		sumwsanxiatax=sumwsanxiaall/1.17*0.17;
		sumwjijintax=sumwjijinall/1.17*0.17;
		
		summwdianjin=summwdianjinall/1.17;
		sumwsanxia=sumwsanxiaall/1.17;
		sumwjijin=sumwjijinall/1.17;
		sumfc=sumfdianfee/1.17;
		sumftax=sumfdianfee/1.17*0.17;
		sumfdianjintax=summfdianjinall/1.17*0.17;
		sumfsanxiatax=sumfsanxiaall/1.17*0.17;
		sumfjijintax=sumfjijinall/1.17*0.17;
		
		summfdianjin=summfdianjinall/1.17;
		sumfsanxia=sumfsanxiaall/1.17;
		sumfjijin=sumfjijinall/1.17;
		sumffee=sumfdianfee+summfdianjinall+sumfsanxiaall+sumfjijinall;
		sumwfee=sumwdianfee+summwdianjinall+sumwsanxiaall+sumwjijinall;
		sumallfee=sumfdianfee+sumwdianfee;
		sumallpower=sumfpower+sumwpower;
		sumallc=sumwc+sumfc;
		sumalltax=sumwtax+sumftax;
		sumallall=sumwfee+sumffee;
		sumalldianjin=summwdianjin+summfdianjin;
		sumalldianjintax=sumwdianjintax+sumfdianjintax;
		sumallsanxia=sumwsanxia+sumfsanxia;
		sumallsanxiatax=sumwsanxiatax+sumfsanxiatax;
		sumalljijin=sumwjijin+sumfjijin;
		sumalljijintax=sumwjijintax+sumfjijintax;
		
		
		
		httpServletRequest.setAttribute("sumffee", df.format(sumffee));
		httpServletRequest.setAttribute("sumfpower", Math.round(sumfpower));
		httpServletRequest.setAttribute("sumfdianfee", df.format(sumfdianfee));
		httpServletRequest.setAttribute("sumftax", df.format(sumftax));
		httpServletRequest.setAttribute("sumfc", df.format(sumfc));
		httpServletRequest.setAttribute("summfdianjin", df.format(summfdianjin));
		httpServletRequest.setAttribute("sumfdianjintax", df.format(sumfdianjintax));
		httpServletRequest.setAttribute("sumfsanxia", df.format(sumfsanxia));
		httpServletRequest.setAttribute("sumfsanxiatax", df.format(sumfsanxiatax));
		httpServletRequest.setAttribute("sumfjijin", df.format(sumfjijin));
		httpServletRequest.setAttribute("sumfjijintax", df.format(sumfjijintax));
		httpServletRequest.setAttribute("sumwfee", df.format(sumwfee));
		httpServletRequest.setAttribute("sumwpower", Math.round(sumwpower));
		httpServletRequest.setAttribute("sumwdianfee", df.format(sumwdianfee));
		httpServletRequest.setAttribute("sumwtax", df.format(sumwtax));
		httpServletRequest.setAttribute("sumwc", df.format(sumwc));
		httpServletRequest.setAttribute("summwdianjin", df.format(summwdianjin));
		httpServletRequest.setAttribute("sumwdianjintax", df.format(sumwdianjintax));
		
		
		httpServletRequest.setAttribute("sumwsanxia", df.format(sumwsanxia));
		httpServletRequest.setAttribute("sumwsanxiatax", df.format(sumwsanxiatax));
		httpServletRequest.setAttribute("sumwjijin", df.format(sumwjijin));
		httpServletRequest.setAttribute("sumwjijintax", df.format(sumwjijintax));
		httpServletRequest.setAttribute("sumallfee", df.format(sumallfee));
		httpServletRequest.setAttribute("sumallpower", Math.round(sumallpower));
		httpServletRequest.setAttribute("sumallc", df.format(sumallc));
		httpServletRequest.setAttribute("sumalltax", df.format(sumalltax));
		httpServletRequest.setAttribute("sumallall", df.format(sumallall));
		httpServletRequest.setAttribute("sumalldianjin", df.format(sumalldianjin));
		httpServletRequest.setAttribute("sumalldianjintax", df.format(sumalldianjintax));
		httpServletRequest.setAttribute("sumallsanxia", df.format(sumallsanxia));
		httpServletRequest.setAttribute("sumallsanxiatax",df.format(sumallsanxiatax));
		httpServletRequest.setAttribute("sumalljijin", df.format(sumalljijin));
		httpServletRequest.setAttribute("sumalljijintax", df.format(sumalljijintax));
		return actionMapping.findForward("viewallcount");
	}
}
