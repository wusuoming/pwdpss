package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.dto.domain.TransforDto;

public class UIviewOneTransforAction extends Action {

	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
	
	String UserId=httpServletRequest.getParameter("UserId");
	String[] UserIdtmp=UserId.split(",");
	BLTransforFacade  blTransforFacade=new BLTransforFacade();
	TransforDto transforDto=new TransforDto();
	transforDto=blTransforFacade.findByPrimaryKey(UserIdtmp[0]);
	
	httpServletRequest.setAttribute("transforDto", transforDto);
	return actionMapping.findForward("showOneTransfor");
}
}