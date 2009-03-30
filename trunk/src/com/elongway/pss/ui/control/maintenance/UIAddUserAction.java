package com.elongway.pss.ui.control.maintenance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.custom.BLPwdEncodeAction;
import com.elongway.pss.bl.facade.BLLwSysUserFacade;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIAddUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {
		
		/** 1 - 声明变量	 */
		BLLwSysUserFacade blLwSysUserFacade = new BLLwSysUserFacade();
		LwSysUserDto lwSysUserDto = null;
		LwSysUserDto tempDto = null;
		
		/** 2 - 获得表单数据	 */
		String USERCODE = httpServletRequest.getParameter("USERCODE");
		String USERNAME = httpServletRequest.getParameter("USERNAME");
		String PASSWORD = httpServletRequest.getParameter("PASSWORD");
		String USERGRADE = httpServletRequest.getParameter("USERGRADE");
		String VALIDSTATUS = httpServletRequest.getParameter("VALIDSTATUS");
		String oldpassword = httpServletRequest.getParameter("oldpassword");
		
		/** 3 - 用户校验	 */
		tempDto = blLwSysUserFacade.findByPrimaryKey(USERCODE);		
		if (tempDto!=null) {
			throw new UserException(-6, -710, this.getClass().getName(),
					"用户已存在");
		}
		
		/** 4 - 组织用户信息	 */
		lwSysUserDto = new LwSysUserDto();
		lwSysUserDto.setUserCode(USERCODE);
		lwSysUserDto.setUserGrade(USERGRADE);
		lwSysUserDto.setUserName(USERNAME);
		lwSysUserDto.setValidStatus(VALIDSTATUS);
		lwSysUserDto.setPassword(new BLPwdEncodeAction().fenCode(PASSWORD));		
			
		/** 5 - 插入数据	 */
		blLwSysUserFacade.insert(lwSysUserDto);
		return actionMapping.findForward("Success");

	}
}
