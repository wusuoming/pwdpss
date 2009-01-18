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
import com.elongway.pss.bl.facade.BLLwWholeSaleIndicatorFacade;
import com.elongway.pss.bl.facade.BLLwWholeSaleUserInfoFacade;
import com.elongway.pss.ui.view.maintenance.LWPowerLineForm;

public class UIGetLWWholeSaleUserListAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection wholeSaleList=new ArrayList();
		LWPowerLineForm  lWPowerLineForm=(LWPowerLineForm)actionForm;
		/*String LineCode=lWPowerLineForm.getLineCode();
		String LineCName=lWPowerLineForm.getLineCName();
		String FeeCom=lWPowerLineForm.getFeeCom();
		String ComCode=lWPowerLineForm.getComCode();*/
		String company=httpServletRequest.getParameter("company");
		String UserNo=httpServletRequest.getParameter("UserNo");
		
		
		
		String condition="1=1 ";
		if(company==null||"".equals(company)){
			
		}else{
			condition+=" and company='"+company+"'";
		}
		if(UserNo==null||"".equals(UserNo)){
			
		}else{
			condition+=" and UserNo like '%"+UserNo+"%'" ;
		}
		
		BLLwWholeSaleUserInfoFacade blLwWholeSaleUserInfoFacade=new BLLwWholeSaleUserInfoFacade();
		wholeSaleList=blLwWholeSaleUserInfoFacade.findByConditions(condition);
		httpServletRequest.setAttribute("wholeSaleList", wholeSaleList);
	
		return actionMapping.findForward("viewLWWholeSaleList");
	}

}
