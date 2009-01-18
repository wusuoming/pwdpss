package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLLwSysUserFacade;

public class UIDeleteUserAction extends Action {

	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String UserLineNo=httpServletRequest.getParameter("UserLineNo");
		BLLwSysUserFacade blLwSysUserFacade=new BLLwSysUserFacade();
		
		
		String[] LineCodetemp=UserLineNo.split(",");
		
	
	
		for(int i=0;i<LineCodetemp.length;i++){
			blLwSysUserFacade.delete(LineCodetemp[i]);
		}
		return actionMapping.findForward("Success");


}
}
