package com.elongway.pss.dto.custom;
/**
 * 换表Dto
 * @author qiaoyouliang 2008-11-12
 *
 */
public class ChangeAmmeterDto {
	// 换表有功电量
	private double chgWorkQuantity = 0D;
	// 换表无功电量
	private double chgIdleQuantity = 0D;
	// 换表有功指针
	private double chgWorkPointer = 0D;
	// 换表无功指针
	private double chgIdlePointer = 0D;
	public double getChgWorkQuantity() {
		return chgWorkQuantity;
	}
	public void setChgWorkQuantity(double chgWorkQuantity) {
		this.chgWorkQuantity = chgWorkQuantity;
	}
	public double getChgIdleQuantity() {
		return chgIdleQuantity;
	}
	public void setChgIdleQuantity(double chgIdleQuantity) {
		this.chgIdleQuantity = chgIdleQuantity;
	}
	public double getChgWorkPointer() {
		return chgWorkPointer;
	}
	public void setChgWorkPointer(double chgWorkPointer) {
		this.chgWorkPointer = chgWorkPointer;
	}
	public double getChgIdlePointer() {
		return chgIdlePointer;
	}
	public void setChgIdlePointer(double chgIdlePointer) {
		this.chgIdlePointer = chgIdlePointer;
	}
	

	
}
