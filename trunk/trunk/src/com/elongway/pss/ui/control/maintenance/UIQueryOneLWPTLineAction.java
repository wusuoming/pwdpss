package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwptFacade;
import com.elongway.pss.dto.domain.LwptDto;

public class UIQueryOneLWPTLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String PTId=httpServletRequest.getParameter("PTId");
		String[] PTId1=PTId.split(",");
		BLLwptFacade blLwptFacade=new BLLwptFacade();
		LwptDto  lwptDto=new LwptDto();
		lwptDto=blLwptFacade.findByPrimaryKey(PTId1[0]);
		httpServletRequest.setAttribute("PT", lwptDto);
		return actionMapping.findForward("queryoneLWPT");
		

}
}