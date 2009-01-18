package com.elongway.pss.ui.allSerch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleSummaryFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;

public class UIWholeSaleSerchDelAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String LineCode=httpServletRequest.getParameter("LineCode");
		String StartMonth=httpServletRequest.getParameter("StartMonth");
		String condition=" 1=1";
		
		String serchDate=StartMonth.substring(0, 6);
		condition+=" and StatMonth like '"+serchDate+"%'";
	
		condition+=" and linecode='"+LineCode+"'";
		BLLwWholeSaleSummaryFacade blLwWholeSaleSummaryFacade=new BLLwWholeSaleSummaryFacade();
		BLLwindicatorFacade blLwindicatorFacade=new BLLwindicatorFacade();
		blLwWholeSaleSummaryFacade.deleteByConditions(condition);
		blLwindicatorFacade.deleteByConditions(condition);
		
		return actionMapping.findForward("Success");
		

}
}