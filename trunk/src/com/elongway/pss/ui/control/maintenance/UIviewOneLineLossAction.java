package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLineLossFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;
import com.elongway.pss.dto.domain.LineLossDto;
import com.elongway.pss.dto.domain.TransforDto;

public class UIviewOneLineLossAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		
		String UserId=httpServletRequest.getParameter("UserId");
		String[] UserIdtmp=UserId.split(",");
		BLLineLossFacade  blLineLossFacade=new BLLineLossFacade();
		LineLossDto lineLossDto=new LineLossDto();
		lineLossDto=blLineLossFacade.findByPrimaryKey(UserIdtmp[0]);
		
		httpServletRequest.setAttribute("lineLossDto", lineLossDto);
		return actionMapping.findForward("showOneLineLoss");
	}
}
