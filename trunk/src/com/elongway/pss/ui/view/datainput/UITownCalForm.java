 package com.elongway.pss.ui.view.datainput;

import org.apache.struts.action.ActionForm;

import com.elongway.pss.ui.view.AbstractForm;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;
/**
 * ֱ�����Ѽ��� Form <br>
 * ��ѯ
 * 
 * @author ������
 * @version 1.0 2008-10-09
 */
public class UITownCalForm {

	private static final long serialVersionUID = 1L;
	/** ������·���� */
    private String lineCode = "";
	/** ���� */
    private String userNo = "";
    /** ���Ի��� */
    private String userName = "";
    /** ���Ե�ַ */
    private String address = "";
    /** ������������ */
    private String townCode = "";
    /** ���Ա�� */
    private String ammeterNo = "";
    /** ����ͳ������ */
    private String statMonth = "";
    /** ���������й�ָ���� */
    private String lastWorkNum = "";
    /** ���Ե����й�ָ���� */
    private String thisWorkNum = "";
    /** ���Ե����й����� */
    private double thisWorkPower = 0D;
    /** ���������޹�ָ���� */
    private String lastIdleNum = "";
    /** ���Ե����޹�ָ���� */
    private String thisIdleNum = "";
    /** ���Ա��� */
    private double rate = 0D;
    /** ���Գ������� */
    private double readQuantity = 0D;
    /** �����쳣���� */
    private double excepQuantity = 0D;
    /** ���Ի������ */
    private double chgAmmeterQuantity = 0D;
    /** �����˲����� */
    private double compensateQuantity = 0D;
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
