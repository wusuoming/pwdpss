package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.*;

/**
 * ����IASysUser�����ݴ��������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IASysUserDto extends IASysUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    String queryContactStatus ="";
    String userGrade ="";
    String upcompanyCode ="";
    String contactNo="";
    public String getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	public String getQueryContactStatus() {
		return queryContactStatus;
	}
	public void setQueryContactStatus(String queryContactStatus) {
		this.queryContactStatus = queryContactStatus;
	}
	/**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�IASysUserDto����
     */
    public IASysUserDto(){
    }
	public String getUpcompanyCode() {
		return upcompanyCode;
	}
	public void setUpcompanyCode(String upcompanyCode) {
		this.upcompanyCode = upcompanyCode;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
}
