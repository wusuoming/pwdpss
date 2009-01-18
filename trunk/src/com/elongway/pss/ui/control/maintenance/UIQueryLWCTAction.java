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
import com.elongway.pss.bl.facade.BLLwptFacade;

public class UIQueryLWCTAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection CTcol=new ArrayList();
		String Modus=httpServletRequest.getParameter("Modus");
		String condition="1=1 ";
		if(Modus==null||"".equals(Modus)){
			
		}else{
			condition+=" and Modus='"+Modus+"'" ;
		}
		BLLwctFacade blLwctFacade=new BLLwctFacade();
		CTcol=blLwctFacade.findByConditions(condition);
		httpServletRequest.setAttribute("CTcol", CTcol);
		return actionMapping.findForward("viewLWCTList");
		}


}
