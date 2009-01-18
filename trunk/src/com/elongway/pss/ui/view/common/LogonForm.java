package com.elongway.pss.ui.view.common;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * µÇÂ¼ÐÅÏ¢
 * 
 * @author yangfuqiang
 * @version 2006-09-17
 */
public class LogonForm extends AbstractForm {

	private static final long serialVersionUID = 1L;
	private String userGrade;

	private String userCode;

	private String userName;

	private String password;

	private String cssStyle;

	public String getPassword() {
		return password;
	}

	public String getCssStyle() {
		return cssStyle;
	}

	public void setCssStyle(String cssStyle) {
		this.cssStyle = StringUtils.rightTrim(cssStyle);
	}

	public void setPassword(String password) {
		this.password = StringUtils.rightTrim(password);
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = StringUtils.rightTrim(userCode);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = StringUtils.rightTrim(userName);
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

}