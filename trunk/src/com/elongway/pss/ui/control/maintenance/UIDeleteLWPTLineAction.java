package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwptFacade;

public class UIDeleteLWPTLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String PTId=httpServletRequest.getParameter("PTId");
		String[] PTId1=PTId.split(",");
		BLLwptFacade  blLwptFacade=new BLLwptFacade();
		for(int i=0;i<PTId1.length;i++){
			blLwptFacade.delete(PTId1[i]);
		}
		return actionMapping.findForward("Success");
	}

}
