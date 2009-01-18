package com.elongway.pss.ui.view.maintenance;

import org.apache.struts.action.ActionForm;

/**
 * 电表信息维护 Form <br>
 * @author 乔有良
 * @version 1.0 2008-10-07
 */
public class UILineAmmeterForm extends ActionForm {
	
	 /** 属性线路代码 */
    private String lineCode = "";
    /** 属性表号 */
    private String ammeterNo = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";
    
    /** 动作 */
    private String action = "";
    /** 页号 */
    private String pageNo = "";
    /** 行数 */
    private String rowsCount = "";
    /** 每页行数 */
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
