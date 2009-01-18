package com.elongway.pss.ui.control.common.pub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.elongway.pss.bl.action.custom.BLPwdEncodeAction;
import com.elongway.pss.bl.facade.BLIASysUserFacade;
import com.elongway.pss.bl.facade.BLLwSysUserFacade;
import com.elongway.pss.dto.domain.IASysUserDto;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.ui.control.UIBaseAction;
import com.elongway.pss.ui.view.common.LogonForm;
import com.elongway.pss.util.AppConst;
import com.elongway.pss.util.ConfigKey;
import com.sinosoft.sysframework.exceptionlog.UserException;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.AppConfig;

/**
 * 个人用户登录 Action
 * 
 * @author qiaoyl
 * @version 1.0 2008-10-07
 */
public class UILogonAction extends UIBaseAction {
	/** 调试日志 */
	private static Logger bugLogger = Logger.getLogger(UILogonAction.class);
	private static Logger uiLogger = Logger.getLogger(AppConst.SYSTEM_LOG);

	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,
			Exception {
		BLLwSysUserFacade blLwSysUserFacade = new BLLwSysUserFacade();
		// 清空现有
		HttpSession httpSession = httpServletRequest.getSession();
		httpSession.setAttribute(AppConst.SYSUSER_SESSION, null);

		// 参数信息
		LogonForm logonForm = (LogonForm) actionForm;

		String userCode = logonForm.getUserCode();
		String password = logonForm.getPassword();
		String cssStyle = logonForm.getCssStyle();
		uiLogger.info("用户尝试登录：" + userCode);

		String areaCode = "330000";

		// 数据校验
		ActionMessages errors = new ActionMessages();

		// 1. 参数基本验证
		if (userCode.length() == 0) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"error.userCode.empty"));
			saveErrors(httpServletRequest, errors);
			uiLogger.info("用户尝试登录：" + userCode + "，失败(用户码为空)。");
			
			return (actionMapping.getInputForward());
		}
		LwSysUserDto lwSysUserDto = blLwSysUserFacade.findByPrimaryKey(userCode);
		
		
		
		if (lwSysUserDto == null) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"error.userCode.empty"));
			saveErrors(httpServletRequest, errors);
			uiLogger.info("用户尝试登录：" + userCode + "，失败(用户码为空)。");
			return (actionMapping.getInputForward());
		}
		if (!new BLPwdEncodeAction().fenCode(password).equals(
				lwSysUserDto.getPassword())) {
			// 密码正确？
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"error.password.mismatch"));
			saveErrors(httpServletRequest, errors);
			uiLogger.info("用户尝试登录：" + userCode + "，失败(密码不正确)。");
			return (actionMapping.getInputForward());
		}

	

		// 3. 保存Session
		SysUser sysUser = new SysUser();

		sysUser.setUserGrade(lwSysUserDto.getUserGrade());
		sysUser.setUserCode(lwSysUserDto.getUserCode());
		sysUser.setUserName(lwSysUserDto.getUserName());
		sysUser.setCompanyCode(lwSysUserDto.getCompanyCode());
		sysUser.setUserGrade(lwSysUserDto.getUserGrade());
		sysUser.setEmail(lwSysUserDto.getEmail());
		sysUser.setPhoneNumber(lwSysUserDto.getPhoneNumber());
		sysUser.setUserName(lwSysUserDto.getUserName());

		// Hashtable powerLevel = new PowerCheck().getPowerLevel(iaSysUserDto
		// .getUserCode(), iaSysUserDto.getAreaCode(), iaSysUserDto
		// .getCompanyCode());
		// sysUser.setPowerLevel(powerLevel);

		sysUser.setCssStyle(cssStyle);

		httpSession.setMaxInactiveInterval(Integer.parseInt(AppConfig
				.get(ConfigKey.SESSION_EXPIRED_SECONDS)));

		httpSession.setAttribute(AppConst.SYSUSER_SESSION, sysUser);

		// 4. 设置 Form
		logonForm.setUserGrade(sysUser.getUserGrade());
		httpServletRequest.setAttribute("logonForm", logonForm);

		// 6. 设置 Cache
		setResponseNoCache(httpServletResponse);

		return actionMapping.findForward(AppConst.SUCCESS_FORWARD);
	}
}
