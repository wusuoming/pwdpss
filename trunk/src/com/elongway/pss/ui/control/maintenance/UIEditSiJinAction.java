package com.elongway.pss.ui.control.maintenance;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLSubjoinFeeFacade;

public class UIEditSiJinAction extends Action{
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String conditions="";
		BLSubjoinFeeFacade blSubjoinFeeFacade=new BLSubjoinFeeFacade();
		Collection col=blSubjoinFeeFacade.findByConditions(conditions);
		
		httpServletRequest.setAttribute("price", col);
		return actionMapping.findForward("editsijin");
		
	}

}
