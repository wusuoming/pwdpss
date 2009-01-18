package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLineLossFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;

public class UIqueryLineLossAction extends Action {

	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection lineLoss=new ArrayList();
		
		
		String LineCode=httpServletRequest.getParameter("LineCode");
		
		
		String condition="1=1 ";
		if(LineCode==null||"".equals(LineCode)){
			
		}else{
			condition+=" and LineCode="+LineCode;
		}
		
		BLLineLossFacade  blLineLossFacade=new BLLineLossFacade();
		lineLoss=blLineLossFacade.findByConditions(condition);
		httpServletRequest.setAttribute("lineLoss", lineLoss);
		return actionMapping.findForward("showLineLoss");
	}

}
