package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwSysUserFacade;
import com.elongway.pss.bl.facade.BLLwctFacade;

public class UIviewsysUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection logonUser=new ArrayList();
		String USERCODE=httpServletRequest.getParameter("USERCODE");
		String USERNAME=httpServletRequest.getParameter("USERNAME");
		String condition="1=1 ";
		if(USERCODE==null||"".equals(USERCODE)){
			
		}else{
			condition+=" and USERCODE='"+USERCODE+"'" ;
		}
if(USERNAME==null||"".equals(USERNAME)){
			
		}else{
			condition+=" and USERNAME='"+USERNAME+"'" ;
		}
		BLLwSysUserFacade blLwSysUserFacade=new BLLwSysUserFacade();
		logonUser=blLwSysUserFacade.findByConditions(condition);
		httpServletRequest.setAttribute("logonUser", logonUser);
		return actionMapping.findForward("viewUser");
		}


}
