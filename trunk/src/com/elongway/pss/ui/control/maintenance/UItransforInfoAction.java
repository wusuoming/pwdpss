package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLTransforFacade;
import com.elongway.pss.dto.domain.TransforDto;

public class UItransforInfoAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)throws Exception{
		String UserId=httpServletRequest.getParameter("UserId");
		BLTransforFacade  blTransforFacade=new BLTransforFacade();
		TransforDto transforDto=new TransforDto();
		transforDto=blTransforFacade.findByPrimaryKey(UserId);
		httpServletRequest.setAttribute("transforDto", transforDto);
		return actionMapping.findForward("showTransfor");
	}

}
