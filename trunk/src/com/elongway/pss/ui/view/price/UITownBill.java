package com.elongway.pss.ui.view.price;

/**
 * ֱ�����ѽ��㵥
 * @author goodluck
 *
 */
public class UITownBill {
	/** ������� */
	private String townCode = "";
	/** ���� */
	private String powerQuantity = "";
	/** ���	 */
	private String powerFee = "";
	/** �������� */
	private String townName = "";
	/** ���� */
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
