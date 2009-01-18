package com.elongway.pss.ui.view.common;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * 修改用户名信息
 * 
 * @author yangfuqiang
 * @version 2006-08-26
 */
public class UpdatePasswordForm extends AbstractForm {

	private static final long serialVersionUID = 1L;

	private String action;

	private String updUserCode;

	private String updUserName;

	private String oldPassword;

	private String newPassword;

	private String confirmPassword;

	private String xitong;

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setUpdUserCode(String updUserCode) {
		this.updUserCode = StringUtils.rightTrim(updUserCode);
	}

	public String getUpdUserCode() {
		return updUserCode;
	}

	public void setUpdUserName(String updUserName) {
		this.updUserName = StringUtils.rightTrim(updUserName);
	}

	public String getUpdUserName() {
		return updUserName;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = StringUtils.rightTrim(oldPassword);
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = StringUtils.rightTrim(newPassword);
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = StringUtils.rightTrim(confirmPassword);
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setXitong(String xitong) {
		this.xitong = StringUtils.rightTrim(xitong);
	}

	public String getXitong() {
		return xitong;
	}

	public ActionErrors validate(ActionMapping actionMapping,
			HttpServletRequest httpServletRequest) {
		/** @todo: finish this method, this is just the skeleton. */
		return null;
	}

	public void reset(ActionMapping actionMapping,
			HttpServletRequest httpServletRequest) {
	}
}