package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLineLossFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;

public class UIDeleteLineLossAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String UserId=httpServletRequest.getParameter("UserId");
		String[] Userno=UserId.split(",");
		//System.out.println(UserNo.length);
		
		BLLineLossFacade  blLineLossFacade=new BLLineLossFacade();
		for(int i=0;i<Userno.length;i++){
			blLineLossFacade.delete(Userno[i]);
			
			
		}
		
		return actionMapping.findForward("Success");
	}
}
