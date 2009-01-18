package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.elongway.pss.bl.facade.BLLwptFacade;

public class UIGetCorporationUserListAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		Collection corporationUserList=new ArrayList();
		String UserNo=httpServletRequest.getParameter("UserNo");
		String UserName=httpServletRequest.getParameter("UserName");
		String condition="1=1 ";
		if("".equals(UserNo)||UserNo==null){
			
		}else{
			
			condition+=" and UserNo='"+UserNo+"'" ;
		}
		if("".equals(UserName)||UserName==null){
			}
		else{
			condition+=" and UserName like '%"+UserName+"%'" ;
		}
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		corporationUserList=blLwCoporationUserInfoFacade.findByConditions(condition);
		httpServletRequest.setAttribute("corporationUserList", corporationUserList);
		return actionMapping.findForward("corporationUserList");
		}

}
