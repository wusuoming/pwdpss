package com.elongway.pss.dto.custom;

import java.util.Comparator;

/**
 * 直供乡算费按电压等级合计DTO
 * @author goodluck
 *
 */
public class TownFeeSumCustomDto  implements Comparable{
	/** 比例分摊	 */
	private String classId = null;
	/** 序号	 */
	private String serialNo = null;
	/** 电压等级代码	 */
	private String voltLevel = null;
	/** 电压等级名称	 */
	private String voltLevelName = null;
	/** 电量  */
	private double quantity = 0D;
	/** 电费	 */
	private double powerFee = 0D;
	/** 合计	 */
	private double sumFee = 0D;
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getVoltLevel() {
		return voltLevel;
	}
	public void setVoltLevel(String voltLevel) {
		this.voltLevel = voltLevel;
	}
	public String getVoltLevelName() {
		return voltLevelName;
	}
	public void setVoltLevelName(String voltLevelName) {
		this.voltLevelName = voltLevelName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPowerFee() {
		return powerFee;
	}
	public void setPowerFee(double powerFee) {
		this.powerFee = powerFee;
	}
	public double getSumFee() {
		return sumFee;
	}
	public void setSumFee(double sumFee) {
		this.sumFee = sumFee;
	}
	public static class ListComparator implements Comparator{
		  public int compare(Object o1,Object o2){
			  TownFeeSumCustomDto u1 = (TownFeeSumCustomDto) o1;
				TownFeeSumCustomDto u2 = (TownFeeSumCustomDto) o2;
		   int result=u1.getSerialNo().compareTo(u2.getSerialNo());
		   if (result==0){
		    result=u1.getVoltLevel().compareTo(u1.getVoltLevel());
		   }
		   return result;
		  }
		 }
	 public int compareTo(Object arg0) {
		 TownFeeSumCustomDto s=(TownFeeSumCustomDto) arg0;
		  return serialNo.compareTo(s.getSerialNo());
		 }
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
}
