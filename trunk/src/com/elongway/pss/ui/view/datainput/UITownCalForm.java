 package com.elongway.pss.ui.view.datainput;

import org.apache.struts.action.ActionForm;

import com.elongway.pss.ui.view.AbstractForm;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;
/**
 * 直供乡电费计算 Form <br>
 * 查询
 * 
 * @author 乔有良
 * @version 1.0 2008-10-09
 */
public class UITownCalForm {

	private static final long serialVersionUID = 1L;
	/** 属性线路代码 */
    private String lineCode = "";
	/** 户号 */
    private String userNo = "";
    /** 属性户名 */
    private String userName = "";
    /** 属性地址 */
    private String address = "";
    /** 属性所属乡镇 */
    private String townCode = "";
    /** 属性表号 */
    private String ammeterNo = "";
    /** 属性统计年月 */
    private String statMonth = "";
    /** 属性上月有功指针数 */
    private String lastWorkNum = "";
    /** 属性当月有功指针数 */
    private String thisWorkNum = "";
    /** 属性当月有功电量 */
    private double thisWorkPower = 0D;
    /** 属性上月无功指针数 */
    private String lastIdleNum = "";
    /** 属性当月无功指针数 */
    private String thisIdleNum = "";
    /** 属性倍率 */
    private double rate = 0D;
    /** 属性抄见电量 */
    private double readQuantity = 0D;
    /** 属性异常电量 */
    private double excepQuantity = 0D;
    /** 属性换表电量 */
    private double chgAmmeterQuantity = 0D;
    /** 属性退补电量 */
    private double compensateQuantity = 0D;
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
	public String getStatMonth() {
		return statMonth;
	}
	public void setStatMonth(String statMonth) {
		this.statMonth = statMonth;
	}
	
	
	public double getThisWorkPower() {
		return thisWorkPower;
	}
	public void setThisWorkPower(double thisWorkPower) {
		this.thisWorkPower = thisWorkPower;
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
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
	public String getLastWorkNum() {
		return lastWorkNum;
	}
	public void setLastWorkNum(String lastWorkNum) {
		this.lastWorkNum = lastWorkNum;
	}
	public String getThisWorkNum() {
		return thisWorkNum;
	}
	public void setThisWorkNum(String thisWorkNum) {
		this.thisWorkNum = thisWorkNum;
	}
	public String getLastIdleNum() {
		return lastIdleNum;
	}
	public void setLastIdleNum(String lastIdleNum) {
		this.lastIdleNum = lastIdleNum;
	}
	public String getThisIdleNum() {
		return thisIdleNum;
	}
	public void setThisIdleNum(String thisIdleNum) {
		this.thisIdleNum = thisIdleNum;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public double getReadQuantity() {
		return readQuantity;
	}
	public void setReadQuantity(double readQuantity) {
		this.readQuantity = readQuantity;
	}
	public double getExcepQuantity() {
		return excepQuantity;
	}
	public void setExcepQuantity(double excepQuantity) {
		this.excepQuantity = excepQuantity;
	}
	public double getChgAmmeterQuantity() {
		return chgAmmeterQuantity;
	}
	public void setChgAmmeterQuantity(double chgAmmeterQuantity) {
		this.chgAmmeterQuantity = chgAmmeterQuantity;
	}
	public double getCompensateQuantity() {
		return compensateQuantity;
	}
	public void setCompensateQuantity(double compensateQuantity) {
		this.compensateQuantity = compensateQuantity;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTownCode() {
		return townCode;
	}
	public void setTownCode(String townCode) {
		this.townCode = townCode;
	}
}
