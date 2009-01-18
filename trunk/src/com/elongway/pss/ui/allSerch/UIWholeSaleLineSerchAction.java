package com.elongway.pss.ui.allSerch;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;

public class UIWholeSaleLineSerchAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String comcode=httpServletRequest.getParameter("company");
		String conditions=" flag='"+comcode+"'";
		BLLwWholeSaleIndicatorFacade  blLwWholeSaleIndicatorFacade=new BLLwWholeSaleIndicatorFacade();
		Collection col=blLwWholeSaleIndicatorFacade.findByConditions(conditions);
		httpServletRequest.setAttribute("wholesaleUser", col);
		return actionMapping.findForward("showallLine");
		
	}

}
