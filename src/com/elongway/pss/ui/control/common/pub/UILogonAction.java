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
 * �����û���¼ Action
 * 
 * @author qiaoyl
 * @version 1.0 2008-10-07
 */
public class UILogonAction extends UIBaseAction {
	/** ������־ */
	private static Logger bugLogger = Logger.getLogger(UILogonAction.class);
	private static Logger uiLogger = Logger.getLogger(AppConst.SYSTEM_LOG);

	public ActionForward execute(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws UserException,
			Exception {
		BLLwSysUserFacade blLwSysUserFacade = new BLLwSysUserFacade();
		// �������
		HttpSession httpSession = httpServletRequest.getSession();
		httpSession.setAttribute(AppConst.SYSUSER_SESSION, null);

		// ������Ϣ
		LogonForm logonForm = (LogonForm) actionForm;

		String userCode = logonForm.getUserCode();
		String password = logonForm.getPassword();
		String cssStyle = logonForm.getCssStyle();
		uiLogger.info("�û����Ե�¼��" + userCode);

		String areaCode = "330000";

		// ����У��
		ActionMessages errors = new ActionMessages();

		// 1. ����������֤
		if (userCode.length() == 0) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"error.userCode.empty"));
			saveErrors(httpServletRequest, errors);
			uiLogger.info("�û����Ե�¼��" + userCode + "��ʧ��(�û���Ϊ��)��");
			
			return (actionMapping.getInputForward());
		}
		LwSysUserDto lwSysUserDto = blLwSysUserFacade.findByPrimaryKey(userCode);
		
		
		
		if (lwSysUserDto == null) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"error.userCode.empty"));
			saveErrors(httpServletRequest, errors);
			uiLogger.info("�û����Ե�¼��" + userCode + "��ʧ��(�û���Ϊ��)��");
			return (actionMapping.getInputForward());
		}
		if (!new BLPwdEncodeAction().fenCode(password).equals(
				lwSysUserDto.getPassword())) {
			// ������ȷ��
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
					"error.password.mismatch"));
			saveErrors(httpServletRequest, errors);
			uiLogger.info("�û����Ե�¼��" + userCode + "��ʧ��(���벻��ȷ)��");
			return (actionMapping.getInputForward());
		}

	

		// 3. ����Session
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

		// 4. ���� Form
		logonForm.setUserGrade(sysUser.getUserGrade());
		httpServletRequest.setAttribute("logonForm", logonForm);

		// 6. ���� Cache
		setResponseNoCache(httpServletResponse);

		return actionMapping.findForward(AppConst.SUCCESS_FORWARD);
	}
}
