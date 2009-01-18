package com.elongway.pss.ui.control.maintenance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.elongway.pss.bl.action.custom.BLPwdEncodeAction;
import com.elongway.pss.bl.facade.BLLwSysUserFacade;
import com.elongway.pss.bl.facade.BLLwctFacade;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.dto.domain.LwctDto;
import com.sinosoft.sysframework.exceptionlog.UserException;

public class UIEditUserAction extends Action {
	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws Exception {

		/**
		 * modify by qiaoyouliang 2008-12-31 begin 修改对用户信息修改的代码，格式化代码
		 */
		/** 1-声明变量 */
		BLLwSysUserFacade blLwSysUserFacade = new BLLwSysUserFacade();
		// 原密码
		String oldpassword = "";
		// 新密码
		String newpassword = "";
		// 确认新密码
		String confirmPwd = "";
		// 用户权限代码
		String USERGRADE = "";
		// 是否有效
		String VALIDSTATUS = "";
		// 用户代码
		String userCode = null;
		// 用户名称
		String userName = "";
		// 用户DTO
		LwSysUserDto lwSysUserDto = null;
		/** 2-获取表单数据 */

		userCode = httpServletRequest.getParameter("userCode");
		userName = httpServletRequest.getParameter("userName");
		oldpassword = httpServletRequest.getParameter("oldpassword");
		newpassword = httpServletRequest.getParameter("newpassword");
		confirmPwd = httpServletRequest.getParameter("confirmPwd");
		USERGRADE = httpServletRequest.getParameter("USERGRADE");
		VALIDSTATUS = httpServletRequest.getParameter("VALIDSTATUS");

		lwSysUserDto = blLwSysUserFacade.findByPrimaryKey(userCode);
		/** 3-确认密码输入 */
		// 原密码校验
		if (!new BLPwdEncodeAction().fenCode(oldpassword).equals(
				lwSysUserDto.getPassword())) {
			throw new UserException(-98, -1020, this.getClass().getName());
		}
		// 新密码确认校验
		if (!confirmPwd.equals(newpassword)) {
			throw new UserException(-98, -1019, this.getClass().getName());
		}
		/** 4-更新 */
		/**
		 * modify by qiaoyouliang 2008-12-31 end 修改对用户信息修改的代码，格式化代码
		 */

		lwSysUserDto.setUserGrade(USERGRADE);
		lwSysUserDto.setUserName(userName);
		lwSysUserDto.setValidStatus(VALIDSTATUS);
		lwSysUserDto.setPassword(newpassword);
		blLwSysUserFacade.update(lwSysUserDto);

		return actionMapping.findForward("Success");

	}

}
