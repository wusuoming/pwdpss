package com.elongway.pss.ui.allSerch;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;

public class UIWholeSaleBookSerchBefore extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		
		String inputDate=httpServletRequest.getParameter("inputDate");
		String company=httpServletRequest.getParameter("company");
		httpServletRequest.setAttribute("inputDate", inputDate);
		httpServletRequest.setAttribute("company", company);
		BLLwWholeSaleUserInfoFacade   blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		String conditions=" 1=1 and company='"+company+"'";
		Collection col=blLwWholeSaleUserInfoFacade.findByConditions(conditions);
		httpServletRequest.setAttribute("wholesalecol", col);
		httpServletRequest.setAttribute("inputDate", inputDate);
		return actionMapping.findForward("viewWholealluser");
	}

}
