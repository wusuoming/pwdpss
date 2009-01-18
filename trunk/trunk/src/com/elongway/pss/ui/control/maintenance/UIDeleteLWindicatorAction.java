package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwUserLineFacade;
import com.elongway.pss.bl.facade.BLLwindicatorFacade;

public class UIDeleteLWindicatorAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String indicatorId=httpServletRequest.getParameter("indicatorId");
		
		String[] indicator=indicatorId.split(",");
		
		for(int i=0;i<indicator.length;i++){
			String[]  condition=indicator[i].split(";");
			String Linecode=condition[0];
			String InputDate=condition[1];
			
			BLLwindicatorFacade  blLwindicatorFacade=new BLLwindicatorFacade();
			blLwindicatorFacade.delete(Linecode, InputDate);
		}
	
		return actionMapping.findForward("Success");

	}
}
