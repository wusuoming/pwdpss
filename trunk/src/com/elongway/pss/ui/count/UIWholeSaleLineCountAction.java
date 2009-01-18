package com.elongway.pss.ui.count;

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
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIWholeSaleLineCountAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate"); 
		String company=httpServletRequest.getParameter("company");
		String StatMonth=inputDate.substring(0, 7);
		String conditions="1=1 and UpCompany='"+company+"'"+" and StatMonth = '"+StatMonth+"'";
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		LwWholeSaleSummaryDto lwWholeSaleSummaryDto=new LwWholeSaleSummaryDto();
		Collection col=blLwWholeSaleSummaryFacade.findByConditions(conditions);
		
		if(col.size()==0){
			
			throw new UserException(-6, -706, this.getClass().getName(),
			"该月还没有算费！");
		}
		String conditions10="1=1 and UpCompany='"+company+"'"+" and StatMonth = '"+StatMonth+"'"+" and KV=10";
		String conditions35="1=1 and UpCompany='"+company+"'"+" and StatMonth = '"+StatMonth+"'"+" and KV=35";
	
		Collection kv10=blLwWholeSaleSummaryFacade.findByConditions(conditions10);
		Collection kv35=blLwWholeSaleSummaryFacade.findByConditions(conditions35);
		double count10Fee=0;
		double count35Fee=0;
		double power10Fee=0;
		long sum10Power=0;
		long sum35power=0;
		Iterator it10=kv10.iterator();
		while(it10.hasNext()){
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto1=(LwWholeSaleSummaryDto)it10.next();
			count10Fee+=lwWholeSaleSummaryDto1.getSumFee();
			sum10Power+=lwWholeSaleSummaryDto1.getElectricQuantity();
			power10Fee+=lwWholeSaleSummaryDto1.getPowerRateFee();
		}
		sum10Power=Math.round(sum10Power);
		Iterator it35=kv35.iterator();
		while(it35.hasNext()){
			LwWholeSaleSummaryDto lwWholeSaleSummaryDto1=(LwWholeSaleSummaryDto)it35.next();
			count35Fee+=lwWholeSaleSummaryDto1.getSumFee();
			sum35power+=lwWholeSaleSummaryDto1.getElectricQuantity();
		}
		httpServletRequest.setAttribute("kv10", kv10);
		httpServletRequest.setAttribute("kv35", kv35);
		httpServletRequest.setAttribute("company", company);
		httpServletRequest.setAttribute("count10Fee", count10Fee);
		httpServletRequest.setAttribute("count35Fee", count35Fee);
		httpServletRequest.setAttribute("sum10Power", sum10Power);
		httpServletRequest.setAttribute("sum35power", sum35power);
		return actionMapping.findForward("viewCountResult");
	}

}
