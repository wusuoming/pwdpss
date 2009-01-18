package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import sun.print.BackgroundLookupListener;

import com.elongway.pss.bl.facade.BLLwLineCTPTAmmeterFacade;
import com.elongway.pss.bl.facade.BLLwctFacade;

public class UIDeleteLWLineRalationAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String LineRalationId=httpServletRequest.getParameter("LineRalationId");
		String[] LineRalationId1=LineRalationId.split(",");
		BLLwLineCTPTAmmeterFacade  blLwLineCTPTAmmeterFacade=new BLLwLineCTPTAmmeterFacade();
		for(int i=0;i<LineRalationId1.length;i++){
			blLwLineCTPTAmmeterFacade.deleteByConditions("1=1 and LineCode='"+LineRalationId1[i]+"'");
		}
		return actionMapping.findForward("Success");
	}
}
