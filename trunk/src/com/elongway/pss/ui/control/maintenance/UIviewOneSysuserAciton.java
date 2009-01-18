package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.facade.BLLwSysUserFacade;
import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.dto.domain.LwctDto;

public class UIviewOneSysuserAciton extends Action {
	public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		String UserLineNo=httpServletRequest.getParameter("UserLineNo");
		String[] UserLineNo1=UserLineNo.split(",");
		BLLwSysUserFacade blLwSysUserFacade=new BLLwSysUserFacade();
		LwSysUserDto  lwSysUserDto=new LwSysUserDto();
		lwSysUserDto=blLwSysUserFacade.findByPrimaryKey(UserLineNo1[0]);
		httpServletRequest.setAttribute("sysUser", lwSysUserDto);
		return actionMapping.findForward("viewOneUser");
		

}

}
