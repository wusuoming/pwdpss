package com.elongway.pss.dto.custom;

import java.util.Comparator;

/**
 * ֱ������Ѱ���ѹ�ȼ��ϼ�DTO
 * @author goodluck
 *
 */
public class TownFeeSumCustomDto  implements Comparable{
	/** ������̯	 */
	private String classId = null;
	/** ���	 */
	private String serialNo = null;
	/** ��ѹ�ȼ�����	 */
	private String voltLevel = null;
	/** ��ѹ�ȼ�����	 */
	private String voltLevelName = null;
	/** ����  */
	private double quantity = 0D;
	/** ���	 */
	private double powerFee = 0D;
	/** �ϼ�	 */
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
