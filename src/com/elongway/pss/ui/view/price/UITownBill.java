package com.elongway.pss.ui.view.price;

/**
 * 直供乡电费结算单
 * @author goodluck
 *
 */
public class UITownBill {
	/** 乡镇代码 */
	private String townCode = "";
	/** 电量 */
	private String powerQuantity = "";
	/** 电费	 */
	private String powerFee = "";
	/** 乡镇名称 */
	private String townName = "";
	/** 帐期 */
	private String billDate = "";
	
	public void setTownCode(String townCode) {
		this.townCode = townCode;
	}
	public String getPowerQuantity() {
		return powerQuantity;
	}
	public void setPowerQuantity(String powerQuantity) {
		this.powerQuantity = powerQuantity;
	}
	public String getPowerFee() {
		return powerFee;
	}
	public void setPowerFee(String powerFee) {
		this.powerFee = powerFee;
	}
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public String getTownCode() {
		return townCode;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	
}
