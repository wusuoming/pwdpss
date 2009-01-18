 package com.elongway.pss.ui.view.price;

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
public class UIPriceForm extends ActionForm{

	private static final long serialVersionUID = 1L;
	/** 属性用电分类代码 */
    private String powerClasscode = "";
    /** 属性用电分类名称 */
    private String powerClassName = "";
    /** 属性电压区间0-1kv */
    private String kvone = "";
    /** 属性电压区间1-10kv */
    private String kV10 = "";
    /** 属性电压区间县级35kv以上 */
    private String kV35MoreXian = "";
    /** 属性电压区间县级35kv以上 */
    private String kV10Xian = "";
    
    /** 属性电压区间县级35kv以上 */
    private String kV35MoreXia = "";
    /** 属性电压区间县级35kv以上 */
    private String kV10KvXia = "";
    /** 属性电压区间35-110kv */
    private String kV110 = "";
    /** 属性电压区间110-220kv */
    private String kV220 = "";
    /** 属性电压区间大于220kv */
    private String kV220More = "";    
    /** 属性材料类型 */
    private String meterialsType = "";
    /** 属性最大需量 */
    private String maxXuLiang = "";
    /** 属性最大容量 */
    private String rongLiang = "0";
    /** 属性单价 */
    private double price = 0D;
    /** 属性生效日期 */
    private String validDate = "";
    /** 属性是否有效 */
    private String validStatus = "";
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
