package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwptFacade;

public class UIQueryLWPTAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
	Collection PTcol=new ArrayList();
	String Modus=httpServletRequest.getParameter("Modus");
	String condition="1=1 ";
	if(Modus==null||"".equals(Modus)){
		
	}else{
		condition+=" and Modus='"+Modus+"'" ;
	}
	BLLwptFacade blLwptFacade=new BLLwptFacade();
	PTcol=blLwptFacade.findByConditions(condition);
	httpServletRequest.setAttribute("PTcol", PTcol);
	return actionMapping.findForward("viewLWPTList");
	}

}
