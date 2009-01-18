package com.elongway.pss.ui.dataInput;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwCoporationUserInfoFacade;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIShowCorporationUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String conditions="1=1 ";
		BLLwCoporationUserInfoFacade blLwCoporationUserInfoFacade=new BLLwCoporationUserInfoFacade();
		Collection corporationUser=new ArrayList();
		corporationUser=blLwCoporationUserInfoFacade.findByConditions(conditions);
		if(corporationUser == null||corporationUser.size()==0){
			throw new UserException(-6,-710,this.getClass().getName(),"系统中没有录入大工业用电用户");
		}
		httpServletRequest.setAttribute("corporationUser", corporationUser);
		return actionMapping.findForward("corporationInputBefore");

	}

}
