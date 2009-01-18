package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwPowerLineFacade;
import com.elongway.pss.bl.facade.BLTransforFacade;
import com.elongway.pss.ui.view.maintenance.LWPowerLineForm;

public class UIqueryTransforAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
	Collection transforcollection=new ArrayList();
	
	/*String LineCode=lWPowerLineForm.getLineCode();
	String LineCName=lWPowerLineForm.getLineCName();
	String FeeCom=lWPowerLineForm.getFeeCom();
	String ComCode=lWPowerLineForm.getComCode();*/
	String transforName=httpServletRequest.getParameter("transforName");
	
	
	String condition="1=1 ";
	if(transforName==null||"".equals(transforName)){
		
	}else{
		condition+=" and transforName="+transforName;
	}
	
	BLTransforFacade blTransforFacade=new BLTransforFacade();
	transforcollection=blTransforFacade.findByConditions(condition);
	httpServletRequest.setAttribute("transfor", transforcollection);
	return actionMapping.findForward("showTransfor");
}


}
