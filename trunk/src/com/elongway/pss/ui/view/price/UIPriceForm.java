 package com.elongway.pss.ui.view.price;

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
public class UIPriceForm extends ActionForm{

	private static final long serialVersionUID = 1L;
	/** �����õ������� */
    private String powerClasscode = "";
    /** �����õ�������� */
    private String powerClassName = "";
    /** ���Ե�ѹ����0-1kv */
    private String kvone = "";
    /** ���Ե�ѹ����1-10kv */
    private String kV10 = "";
    /** ���Ե�ѹ�����ؼ�35kv���� */
    private String kV35MoreXian = "";
    /** ���Ե�ѹ�����ؼ�35kv���� */
    private String kV10Xian = "";
    
    /** ���Ե�ѹ�����ؼ�35kv���� */
    private String kV35MoreXia = "";
    /** ���Ե�ѹ�����ؼ�35kv���� */
    private String kV10KvXia = "";
    /** ���Ե�ѹ����35-110kv */
    private String kV110 = "";
    /** ���Ե�ѹ����110-220kv */
    private String kV220 = "";
    /** ���Ե�ѹ�������220kv */
    private String kV220More = "";    
    /** ���Բ������� */
    private String meterialsType = "";
    /** ����������� */
    private String maxXuLiang = "";
    /** ����������� */
    private String rongLiang = "0";
    /** ���Ե��� */
    private double price = 0D;
    /** ������Ч���� */
    private String validDate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
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
		
	public String getPowerClasscode() {
		return powerClasscode;
	}
	public void setPowerClasscode(String powerClasscode) {
		this.powerClasscode = powerClasscode;
	}
	public String getPowerClassName() {
		return powerClassName;
	}
	public void setPowerClassName(String powerClassName) {
		this.powerClassName = powerClassName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	public String getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
	
	public String getKV1() {
		return kvone;
	}
	public void setKV1(String kv1) {
		kvone = kv1;
	}
	public String getKV10() {
		return kV10;
	}
	public void setKV10(String kv10) {
		kV10 = kv10;
	}
	public String getKV110() {
		return kV110;
	}
	public void setKV110(String kv110) {
		kV110 = kv110;
	}
	public String getKv220() {
		return kV220;
	}
	public void setKv220(String kv220) {
		this.kV220 = kv220;
	}
	public String getKv220More() {
		return kV220More;
	}
	public void setKv220More(String kv220More) {
		this.kV220More = kv220More;
	}
	public String getMaxXuLiang() {
		return maxXuLiang;
	}
	public void setMaxXuLiang(String maxXuLiang) {
		this.maxXuLiang = maxXuLiang;
	}
	public String getRongLiang() {
		return rongLiang;
	}
	public void setRongLiang(String rongLiang) {
		this.rongLiang = rongLiang;
	}
	public String getMeterialsType() {
		return meterialsType;
	}
	public void setMeterialsType(String meterialsType) {
		this.meterialsType = meterialsType;
	}
	public String getKV10Xia() {
		return kV10KvXia;
	}
	public void setKV10Xia(String kvXia) {
		kV10KvXia = kvXia;
	}
	public String getKV35MoreXian() {
		return kV35MoreXian;
	}
	public void setKV35MoreXian(String moreXian) {
		kV35MoreXian = moreXian;
	}
	public String getKV10Xian() {
		return kV10Xian;
	}
	public void setKV10Xian(String kvXian) {
		kV10Xian = kvXian;
	}
	public String getKV35MoreXia() {
		return kV35MoreXia;
	}
	public void setKV35MoreXia(String moreXia) {
		kV35MoreXia = moreXia;
	}
	
	
}
