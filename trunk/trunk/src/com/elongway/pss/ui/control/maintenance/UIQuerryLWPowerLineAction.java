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
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.ui.view.maintenance.LWPowerLineForm;

public class UIQuerryLWPowerLineAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection PowerLinecollection=new ArrayList();
		LWPowerLineForm  lWPowerLineForm=(LWPowerLineForm)actionForm;
		/*String LineCode=lWPowerLineForm.getLineCode();
		String LineCName=lWPowerLineForm.getLineCName();
		String FeeCom=lWPowerLineForm.getFeeCom();
		String ComCode=lWPowerLineForm.getComCode();*/
		String LineCode=httpServletRequest.getParameter("LineCode");
		String LineCName=httpServletRequest.getParameter("LineCName");
		String FeeCom=httpServletRequest.getParameter("FeeCom");
		String ComCode=httpServletRequest.getParameter("ComCode");
		
		HttpSession session = httpServletRequest.getSession();
		String condition="1=1 ";
		if(LineCode==null||"".equals(LineCode)){
			
		}else{
			condition+=" and LineCode="+LineCode;
		}
		if(LineCName==null||"".equals(LineCName)){
			
		}else{
			condition+=" and LineCName="+LineCName;
		}
		if(FeeCom==null||"".equals(FeeCom)){
			
		}else{
			condition+=" and FeeCom="+FeeCom;
		}
		if(ComCode==null||"".equals(ComCode)){
			
		}else{
			condition+="and ComCode="+ComCode;
		}
		
		BLLwPowerLineFacade  blLwPowerLineFacade=new BLLwPowerLineFacade();
		PowerLinecollection=blLwPowerLineFacade.findByConditions(condition);
		session.setAttribute("powerLine", PowerLinecollection);
		return actionMapping.findForward("");
	}


}
