package com.elongway.pss.ui.allSerch;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;

public class UIWholeSaleBookAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		  
		String inputDate=httpServletRequest.getParameter("inputDate");
		BLLwWholeSaleSummaryFacade  blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		String conditions=" 1=1 and statmonth like '"+inputDate+"%'";
		Collection col=blLwWholeSaleSummaryFacade.findByConditions(conditions);
		
		
		
		return null;
	}
}