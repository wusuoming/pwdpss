package com.elongway.pss.ui.view.maintenance;

import org.apache.struts.action.ActionForm;

import com.elongway.pss.ui.view.AbstractForm;
import com.sinosoft.sysframework.common.util.StringUtils;

public class LWUserLineForm extends ActionForm{
	private String UserNo;
	private String UserName;
	private String LineCode;
	private String ValidStatus;
	private String Flag;
	private String Remark;
	public String getFlag() {
		return Flag;
	}
	public void setFlag(String flag) {
		this.Flag = StringUtils.rightTrim(flag);
	}
	public String getLineCode() {
		return LineCode;
	}
	public void setLineCode(String lineCode) {
		this.LineCode = StringUtils.rightTrim(lineCode);
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		this.Remark = StringUtils.rightTrim(remark);
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = StringUtils.rightTrim(userName);
	}
	public String getUserNo() {
		return UserNo;
	}
	public void setUserNo(String userNo) {
		this.UserNo = StringUtils.rightTrim(userNo);
	}
	public String getValidStatus() {
		return ValidStatus;
	}
	public void setValidStatus(String validStatus) {
		this.ValidStatus = StringUtils.rightTrim(validStatus);
	}
	

}
