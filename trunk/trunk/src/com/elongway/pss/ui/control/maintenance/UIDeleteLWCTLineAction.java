package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.bl.facade.BLLwptFacade;

public class UIDeleteLWCTLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String CTId=httpServletRequest.getParameter("CTId");
		String[] CTId1=CTId.split(",");
		BLLwctFacade  blLwctFacade=new BLLwctFacade();
		for(int i=0;i<CTId1.length;i++){
			blLwctFacade.delete(CTId1[i]);
		}
		return actionMapping.findForward("Success");
	}
}
