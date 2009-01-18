package com.elongway.pss.ui.view.maintenance;

import org.apache.struts.action.ActionForm;

import com.elongway.pss.ui.view.AbstractForm;
import com.sinosoft.sysframework.common.util.StringUtils;

public class AddLWPowerUserForm extends ActionForm{
	private String UserNo;
	private String UserName;
	private String Address;
	private String ValidStatus;
	private String TownCode;
	private String Remark;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getTownCode() {
		return TownCode;
	}
	public void setTownCode(String townCode) {
		TownCode = townCode;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserNo() {
		return UserNo;
	}
	public void setUserNo(String userNo) {
		UserNo = userNo;
	}
	public String getValidStatus() {
		return ValidStatus;
	}
	public void setValidStatus(String validStatus) {
		ValidStatus = validStatus;
	}
	

}
