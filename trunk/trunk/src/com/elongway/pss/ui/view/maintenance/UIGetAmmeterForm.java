package com.elongway.pss.ui.view.maintenance;

import org.apache.struts.action.ActionForm;

/**
 * 电表信息维护 Form <br>
 * @author 乔有良
 * @version 1.0 2008-10-07
 */
public class UIGetAmmeterForm extends ActionForm {
	
	 /** 属性表号 */
    private String ammeterNo = "";
    /** 线路代码*/
    private String lineCode = "";
    /** 属性相 */
    private String ammeterX = "";
    /** 属性伏 */
    private String ammeterV = "";
    /** 属性安 */
    private String ammeterA = "";
    /** 属性型式 */
    private String ammeterType = "";
    /** 属性厂名 */
    private String factoryName = "";
    /** 属性常数 */
    private String coust = "";
    /** 属性精度 */
    private String precision = "";
    /** 属性倍率 */
    private String rate = "";
    /** 属性指针1 */
    private double pointer1 = 0D;
    /** 属性签名1 */
    private String signature1 = "";
    /** 属性指针2 */
    private double pointer2 = 0D;
    /** 属性签名2 */
    private String signature2 = "";
    /** 属性指针3 */
    private double pointer3 = 0D;
    /** 属性签名3 */
    private String signature3 = "";
    /** 属性表溢出的最大值 */
    private int maxnum = 0;
    /** 属性允许使用年限 */
    private String allowYear = "";
    /** 属性允许使用日期 */
    private String allowDate = "";
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
    private int count = 0;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAmmeterNo() {
		return ammeterNo;
	}
	public void setAmmeterNo(String ammeterNo) {
		this.ammeterNo = ammeterNo;
	}
	
	public String getAllowYear() {
		return allowYear;
	}
	public void setAllowYear(String allowYear) {
		this.allowYear = allowYear;
	}
	public String getAllowDate() {
		return allowDate;
	}
	public void setAllowDate(String allowDate) {
		this.allowDate = allowDate;
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
	public String getAmmeterX() {
		return ammeterX;
	}
	public void setAmmeterX(String ammeterX) {
		this.ammeterX = ammeterX;
	}
	public String getAmmeterV() {
		return ammeterV;
	}
	public void setAmmeterV(String ammeterV) {
		this.ammeterV = ammeterV;
	}
	public String getAmmeterA() {
		return ammeterA;
	}
	public void setAmmeterA(String ammeterA) {
		this.ammeterA = ammeterA;
	}
	public String getAmmeterType() {
		return ammeterType;
	}
	public void setAmmeterType(String ammeterType) {
		this.ammeterType = ammeterType;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public String getCoust() {
		return coust;
	}
	public void setCoust(String coust) {
		this.coust = coust;
	}
	public String getPrecision() {
		return precision;
	}
	public void setPrecision(String precision) {
		this.precision = precision;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public double getPointer1() {
		return pointer1;
	}
	public void setPointer1(double pointer1) {
		this.pointer1 = pointer1;
	}
	public String getSignature1() {
		return signature1;
	}
	public void setSignature1(String signature1) {
		this.signature1 = signature1;
	}
	public double getPointer2() {
		return pointer2;
	}
	public void setPointer2(double pointer2) {
		this.pointer2 = pointer2;
	}
	public String getSignature2() {
		return signature2;
	}
	public void setSignature2(String signature2) {
		this.signature2 = signature2;
	}
	public double getPointer3() {
		return pointer3;
	}
	public void setPointer3(double pointer3) {
		this.pointer3 = pointer3;
	}
	public String getSignature3() {
		return signature3;
	}
	public void setSignature3(String signature3) {
		this.signature3 = signature3;
	}
	public int getMaxnum() {
		return maxnum;
	}
	public void setMaxnum(int maxnum) {
		this.maxnum = maxnum;
	}
	public String getLineCode() {
		return lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	
	
}
