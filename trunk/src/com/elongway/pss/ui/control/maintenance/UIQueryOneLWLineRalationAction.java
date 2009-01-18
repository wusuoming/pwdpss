package com.elongway.pss.ui.control.maintenance;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwLineCTPTAmmeterFacade;

public class UIQueryOneLWLineRalationAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String LineCode=httpServletRequest.getParameter("httpServletRequest");
		String condition="1=1 ";
		if(LineCode==null||"".equals(LineCode)){
			
		}else{
			condition+=" and LineCode='"+LineCode+"'" ;
		}
		BLLwLineCTPTAmmeterFacade blLwLineCTPTAmmeterFacade=new BLLwLineCTPTAmmeterFacade();
		Collection LineRalationcol=blLwLineCTPTAmmeterFacade.findByConditions(condition);
		httpServletRequest.setAttribute("LineRalationcol", LineRalationcol);
		return actionMapping.findForward("viewOneLineRalation");
	}


}
