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

import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.util.PowerFeeCal;

public class UIAlllinePrintAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		
		String inputDate=httpServletRequest.getParameter("inputDate");
		String comcode=httpServletRequest.getParameter("company");
		String inputdate=inputDate.substring(0, 7);
		
		
		PowerFeeCal  powerFeeCal=new PowerFeeCal();
		DecimalFormat df = new DecimalFormat("###0.00");
		String conditions10=" upcompany='"+comcode+"'"+" and KV=10 and StatMonth='"+inputdate+"'"+"  and wholesaletype='0' order by linecode";
		String conditions35=" upcompany='"+comcode+"'"+" and KV=35 and StatMonth='"+inputdate+"'"+"  and wholesaletype='0' order by linecode" ;
		
		String conditionscorporation=" upcompany='"+comcode+"'"+"  and StatMonth='"+inputdate+"'"+"  and wholesaletype='1' order by linecode";
		
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		Collection kv10=blLwWholeSaleSummaryFacade.findByConditions(conditions10);
		Collection kv35=blLwWholeSaleSummaryFacade.findByConditions(conditions35);
		
		Collection kvf=blLwWholeSaleSummaryFacade.findByConditions(conditionscorporation);
		double count10Fee=0;
		double count35Fee=0;
		double sum10Fee=0;
		double sum35Fee=0;
		double Rate10Fee=0;
		double Rate35Fee=0;
		
		double countfFee=0;
		
		double sumfFee=0;
		
		double RatefFee=0;
		
		long sumfpower=0;
		long usumfpower=0;
		long sum10Power=0;
		long sum35power=0;
		long usum10power=0;
		long usum35power=0;
		
		Iterator it10=kv10.iterator();
		while(it10.hasNext()){
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it10.next();
			sum10Power+=lwWholeSaleSummaryDto.getElectricQuantity();
			
			usum10power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
			Rate10Fee+=lwWholeSaleSummaryDto.getPowerRateFee();
			sum10Fee+=lwWholeSaleSummaryDto.getSumFee();
			
		}
		
		count10Fee=Math.round(count10Fee*100)/100;
		sum10Power=Math.round(sum10Power);
		Iterator it35=kv35.iterator();
		while(it35.hasNext()){
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)it35.next();
			
			sum35power+=lwWholeSaleSummaryDto.getElectricQuantity();
			usum35power+=lwWholeSaleSummaryDto.getUnPointerQuantity();
			
			Rate35Fee+=lwWholeSaleSummaryDto.getPowerRateFee();
			sum35Fee+=lwWholeSaleSummaryDto.getSumFee();
		}
		
		
		Iterator itf=kvf.iterator();
		while(itf.hasNext()){
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto=(LwWholeSaleSummaryDto)itf.next();
			
			sumfpower+=lwWholeSaleSummaryDto.getElectricQuantity();
			usumfpower+=lwWholeSaleSummaryDto.getUnPointerQuantity();
			
			RatefFee+=lwWholeSaleSummaryDto.getPowerRateFee();
			sumfFee+=lwWholeSaleSummaryDto.getSumFee();
		}
		
		
		
		httpServletRequest.setAttribute("kv10", kv10);
		httpServletRequest.setAttribute("kv35", kv35);
		httpServletRequest.setAttribute("kvf", kvf);
		httpServletRequest.setAttribute("sum35Fee", df.format(sum35Fee));
		httpServletRequest.setAttribute("sumfFee", df.format(sumfFee));
		httpServletRequest.setAttribute("sum10Fee", df.format(sum10Fee));
		httpServletRequest.setAttribute("Rate35Fee", df.format(Rate35Fee));
		httpServletRequest.setAttribute("Rate10Fee", df.format(Rate10Fee));
		httpServletRequest.setAttribute("RatefFee", df.format(RatefFee));
	
		httpServletRequest.setAttribute("count10Fee", df.format(count10Fee));
		httpServletRequest.setAttribute("count35Fee", df.format(count35Fee));
		httpServletRequest.setAttribute("sum10Power", df.format(sum10Power));
		httpServletRequest.setAttribute("sumfPower", df.format(sum10Power));
		httpServletRequest.setAttribute("sum35power", df.format(sum35power));
		httpServletRequest.setAttribute("usum10power", df.format(usum10power));
		httpServletRequest.setAttribute("usumfpower", df.format(usum10power));
		httpServletRequest.setAttribute("usum35power", df.format(usum35power));
		
		
		httpServletRequest.setAttribute("inputDate", inputDate);
		httpServletRequest.setAttribute("comcode", comcode);
	
		return actionMapping.findForward("viewWholeOtherSaleResult");
	}

}
