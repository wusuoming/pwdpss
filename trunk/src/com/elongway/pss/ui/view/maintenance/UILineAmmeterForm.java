package com.elongway.pss.ui.view.maintenance;

import org.apache.struts.action.ActionForm;

/**
 * �����Ϣά�� Form <br>
 * @author ������
 * @version 1.0 2008-10-07
 */
public class UILineAmmeterForm extends ActionForm {
	
	 /** ������·���� */
    private String lineCode = "";
    /** ���Ա�� */
    private String ammeterNo = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";
    
    /** ���� */
    private String action = "";
    /** ҳ�� */
    private String pageNo = "";
    /** ���� */
    private String rowsCount = "";
    /** ÿҳ���� */
    private String rowsPerPage = "";
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getRowsCount() {
		return rowsCount;
	}
	public void setRowsCount(String rowsCount) {
		this.rowsCount = rowsCount;
	}
	public String getRowsPerPage() {
		return rowsPerPage;
	}
	public void setRowsPerPage(String rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}
	public String getLineCode() {
		return lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	public String getAmmeterNo() {
		return ammeterNo;
	}
	public void setAmmeterNo(String ammeterNo) {
		this.ammeterNo = ammeterNo;
	}
	public String getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
