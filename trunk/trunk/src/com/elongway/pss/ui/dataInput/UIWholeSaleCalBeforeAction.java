package com.elongway.pss.ui.dataInput;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;

public class UIWholeSaleCalBeforeAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String comcode=httpServletRequest.getParameter("comcode");
		String conditions="1=1 and company='"+comcode+"'";
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		Collection wholesaleUser=new ArrayList();
		wholesaleUser=blLwWholeSaleUserInfoFacade.findByConditions(conditions);
		httpServletRequest.setAttribute("wholesaleUser", wholesaleUser);
		return actionMapping.findForward("wholeSaleUser");
	}

}
