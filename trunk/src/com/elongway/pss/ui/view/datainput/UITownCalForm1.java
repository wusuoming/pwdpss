package com.elongway.pss.ui.view.datainput;

import org.apache.struts.action.ActionForm;

/**
 * 电表信息维护 Form <br>
 * @author 乔有良
 * @version 1.0 2008-10-07
 */
public class UITownCalForm1 extends ActionForm {
	
	/** 属性线路代码 */
    private String lineCode = "";
	/** 户号 */
    private String userNo = "";
	public String getLineCode() {
		return lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}   
}
