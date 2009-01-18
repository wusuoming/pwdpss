package com.elongway.pss.ui.allSerch;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwCorporationSummaryFacade;

public class UICorporationOtherFeeSerchAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String inputDate=httpServletRequest.getParameter("inputDate");
		String LineCode=httpServletRequest.getParameter("LineCode");
		
		String condition=" 1=1";
	
			String serchDate=inputDate.substring(0, 6);
			condition+=" and StatMonth like '"+serchDate+"%'";
		
		condition+=" and linecode='"+LineCode+"'";
		BLLwCorporationSummaryFacade blLwCorporationSummaryFacade=new BLLwCorporationSummaryFacade();
		Collection collectioncorporation=blLwCorporationSummaryFacade.findByConditions(condition);
		httpServletRequest.setAttribute("collectioncorporation", collectioncorporation);
		return actionMapping.findForward("corporationOtherFeeResult");
		
		
		
}


}
