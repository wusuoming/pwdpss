package com.elongway.pss.dto.custom;
/**
 * 电价Dto
 * @author goodluck
 *
 */
public class TownSataDto {
	
	String statMonth = "";
	
	String comCode = "";
	String companyName  = "";
	// 总电量
	double sumPower = 0.0;
	// 总电费
	double sumPowerFee = 0.0;
	// 电费
	double powerFee = 0.0;
	// 总电金
	double sumDianJin = 0.0;
	// 总三峡
	double sumSanXia = 0.0;
	// 总基金
	double sumJiJin = 0.0;
	// 总库区
	double sumKuQu = 0.0;

	

	// 纯电金
	double pureDianJin = 0.0;
	// 电金税
	double dianJinTax = 0.0;
	// 纯三峡
	double pureSanXia = 0.0;
	// 三峡税
	double sanXiaTax = 0.0;
	// 纯基金
	double pureJiJin = 0.0;
	// 基金税
	double jiJinTax = 0.0;
	// 纯电费
	double purePowerFee = 0D;
	// 电费税
	double powerFeeTax = 0.0;
	public double getSumPower() {
		return sumPower;
	}
	public void setSumPower(double sumPower) {
		this.sumPower = sumPower;
	}
	public double getSumPowerFee() {
		return sumPowerFee;
	}
	public void setSumPowerFee(double sumPowerFee) {
		this.sumPowerFee = sumPowerFee;
	}
	public double getPowerFee() {
		return powerFee;
	}
	public void setPowerFee(double powerFee) {
		this.powerFee = powerFee;
	}
	public double getSumDianJin() {
		return sumDianJin;
	}
	public void setSumDianJin(double sumDianJin) {
		this.sumDianJin = sumDianJin;
	}
	public double getSumSanXia() {
		return sumSanXia;
	}
	public void setSumSanXia(double sumSanXia) {
		this.sumSanXia = sumSanXia;
	}
	public double getSumJiJin() {
		return sumJiJin;
	}
	public void setSumJiJin(double sumJiJin) {
		this.sumJiJin = sumJiJin;
	}
	public double getSumKuQu() {
		return sumKuQu;
	}
	public void setSumKuQu(double sumKuQu) {
		this.sumKuQu = sumKuQu;
	}
	public double getPureDianJin() {
		return pureDianJin;
	}
	public void setPureDianJin(double pureDianJin) {
		this.pureDianJin = pureDianJin;
	}
	public double getDianJinTax() {
		return dianJinTax;
	}
	public void setDianJinTax(double dianJinTax) {
		this.dianJinTax = dianJinTax;
	}
	public double getPureSanXia() {
		return pureSanXia;
	}
	public void setPureSanXia(double pureSanXia) {
		this.pureSanXia = pureSanXia;
	}
	public double getSanXiaTax() {
		return sanXiaTax;
	}
	public void setSanXiaTax(double sanXiaTax) {
		this.sanXiaTax = sanXiaTax;
	}
	public double getPureJiJin() {
		return pureJiJin;
	}
	public void setPureJiJin(double pureJiJin) {
		this.pureJiJin = pureJiJin;
	}
	public double getJiJinTax() {
		return jiJinTax;
	}
	public void setJiJinTax(double jiJinTax) {
		this.jiJinTax = jiJinTax;
	}
	public double getPurePowerFee() {
		return purePowerFee;
	}
	public void setPurePowerFee(double purePowerFee) {
		this.purePowerFee = purePowerFee;
	}
	public double getPowerFeeTax() {
		return powerFeeTax;
	}
	public void setPowerFeeTax(double powerFeeTax) {
		this.powerFeeTax = powerFeeTax;
	}
	public String getStatMonth() {
		return statMonth;
	}
	public void setStatMonth(String statMonth) {
		this.statMonth = statMonth;
	}
	public String getComCode() {
		return comCode;
	}
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
