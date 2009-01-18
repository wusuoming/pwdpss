package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwAmmeterChangeFacade;
import com.elongway.pss.bl.facade.BLLwProrateFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;

public class UIDeleteTransforAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String UserId=httpServletRequest.getParameter("UserId");
		String[] Userno=UserId.split(",");
		//System.out.println(UserNo.length);
		BLTransforFacade  blTransforFacade=new BLTransforFacade();
		for(int i=0;i<Userno.length;i++){
			blTransforFacade.delete(Userno[i]);
		}
		return actionMapping.findForward("Success");
	}

}
