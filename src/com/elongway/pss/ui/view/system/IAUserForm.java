package com.elongway.pss.ui.view.system;

import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * 承保信息查询(主查询)．
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */
public class IAUserForm extends AbstractForm {

	private static final long serialVersionUID = 1L;
	
	private String userCode = "";
    private String areaCode = "";
    private String userName = "";
    private String password = "";
    private String companyCode = "";
    private String companyType = "";
    private String userGrade = "";
    private String validStatus = "";

    public void setUserCode(String UserCode) {
		userCode = UserCode;
	} 
	public String getUserCode() {
		return userCode;
	}
	
	public void setAreaCode(String AreaCode) {
		areaCode = AreaCode;
	} 
	public String getAreaCode() {
		return areaCode;
	}
	
	public void setUserName(String UserName) {
		userName = UserName;
	} 
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String Password) {
		password = Password;
	} 
	public String getPassword() {
		return password;
	}
	
	public void setCompanyCode(String CompanyCode) {
		companyCode = CompanyCode;
	} 
	public String getCompanyCode() {
		return companyCode;
	}
	
	public void setCompanyType(String CompanyType) {
		companyType = CompanyType;
	} 
	public String getCompanyType() {
		return companyType;
	}
	
	public void setUserGrade(String UserGrade) {
		userGrade = UserGrade;
	} 
	public String getUserGrade() {
		return userGrade;
	}
	
	public void setValidStatus(String ValidStatus) {
		validStatus = ValidStatus;
	} 
	public String getValidStatus() {
		return validStatus;
	}	
}
