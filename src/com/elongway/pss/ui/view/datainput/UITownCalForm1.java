package com.elongway.pss.ui.view.datainput;

import org.apache.struts.action.ActionForm;

/**
 * �����Ϣά�� Form <br>
 * @author ������
 * @version 1.0 2008-10-07
 */
public class UITownCalForm1 extends ActionForm {
	
	/** ������·���� */
    private String lineCode = "";
	/** ���� */
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
