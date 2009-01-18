package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;

public class UIQueryLWindicatorAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection indicatorcol=new ArrayList();
		String LINECODE=httpServletRequest.getParameter("LINECODE");
		String condition="1=1 ";
		if(LINECODE==null||"".equals(LINECODE)){
			
		}else{
			condition+=" and LINECODE='"+LINECODE+"'" ;
		}
		BLLwindicatorFacade blLwindicatorFacade=new BLLwindicatorFacade();
		indicatorcol=blLwindicatorFacade.findByConditions(condition);
		httpServletRequest.setAttribute("indicatorcol", indicatorcol);
		return actionMapping.findForward("viewLWindicatorList");
		}

}
