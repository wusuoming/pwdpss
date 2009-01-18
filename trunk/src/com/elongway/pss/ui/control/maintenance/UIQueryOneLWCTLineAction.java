package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.bl.facade.BLLwptFacade;
import com.elongway.pss.dto.domain.LwctDto;
import com.elongway.pss.dto.domain.LwptDto;

public class UIQueryOneLWCTLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String CTId=httpServletRequest.getParameter("CTId");
		String[] CTId1=CTId.split(",");
		BLLwctFacade blLwctFacade=new BLLwctFacade();
		LwctDto  lwctDto=new LwctDto();
		lwctDto=blLwctFacade.findByPrimaryKey(CTId1[0]);
		httpServletRequest.setAttribute("CT", lwctDto);
		return actionMapping.findForward("queryoneLWCT");
		

}

}
