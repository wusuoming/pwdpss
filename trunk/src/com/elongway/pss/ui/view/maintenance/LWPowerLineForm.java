package com.elongway.pss.ui.view.maintenance;

import org.apache.struts.action.ActionForm;

import com.elongway.pss.ui.view.AbstractForm;
import com.sinosoft.sysframework.common.util.StringUtils;

public class LWPowerLineForm extends ActionForm{
	private String LineCode;
	private String LineCName;
	private String LineEName;
	private String FeeCom;
	private String ComCode;
	private String TargetCode;
	private String SupplyType;
	private String CT;
	private String PT;
	private String VoltLevel;
	private String SiFeLoss;
	private String SanXiaLoss;
	private String LossProp;
	private String PriceCategory;
	private String LossFlag;
	private String Rate;
	private String Flag;
	private String Remark;
	public String getComCode() {
		return ComCode;
	}
	public void setComCode(String comCode) {
		this.ComCode = StringUtils.rightTrim(comCode);
	}
	public String getCT() {
		return CT;
	}
	public void setCT(String ct) {
		this.CT = StringUtils.rightTrim(ct);
	}
	public String getFeeCom() {
		return FeeCom;
	}
	public void setFeeCom(String feeCom) {
		this.FeeCom = StringUtils.rightTrim(feeCom);
	}
	public String getFlag() {
		return Flag;
	}
	public void setFlag(String flag) {
		this.Flag = StringUtils.rightTrim(flag);
	}
	public String getLineCName() {
		return LineCName;
	}
	public void setLineCName(String lineCName) {
		this.LineCName = StringUtils.rightTrim(lineCName);
	}
	public String getLineCode() {
		return LineCode;
	}
	public void setLineCode(String lineCode) {
		this.LineCode = StringUtils.rightTrim(lineCode);
	}
	public String getLineEName() {
		return LineEName;
	}
	public void setLineEName(String lineEName) {
		this.LineEName = StringUtils.rightTrim(lineEName);
	}
	public String getLossFlag() {
		return LossFlag;
	}
	public void setLossFlag(String lossFlag) {
		this.LossFlag = StringUtils.rightTrim(lossFlag);
	}
	public String getLossProp() {
		return LossProp;
	}
	public void setLossProp(String lossProp) {
		this.LossProp = StringUtils.rightTrim(lossProp);
	}
	public String getPriceCategory() {
		return PriceCategory;
	}
	public void setPriceCategory(String priceCategory) {
		this.PriceCategory = StringUtils.rightTrim(priceCategory);
	}
	public String getPT() {
		return PT;
	}
	public void setPT(String pt) {
		this.PT = StringUtils.rightTrim(pt);
	}
	public String getRate() {
		return Rate;
	}
	public void setRate(String rate) {
		this.Rate = StringUtils.rightTrim(rate);
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		this.Remark = StringUtils.rightTrim(remark);
	}
	public String getSanXiaLoss() {
		return SanXiaLoss;
	}
	public void setSanXiaLoss(String sanXiaLoss) {
		this.SanXiaLoss = StringUtils.rightTrim(sanXiaLoss);
	}
	public String getSiFeLoss() {
		return SiFeLoss;
	}
	public void setSiFeLoss(String siFeLoss) {
		this.SiFeLoss = StringUtils.rightTrim(siFeLoss);
	}
	public String getSupplyType() {
		return SupplyType;
	}
	public void setSupplyType(String supplyType) {
		this.SupplyType = StringUtils.rightTrim(supplyType);
	}
	public String getTargetCode() {
		return TargetCode;
	}
	public void setTargetCode(String targetCode) {
		this.TargetCode = StringUtils.rightTrim(targetCode);
	}
	public String getVoltLevel() {
		return VoltLevel;
	}
	public void setVoltLevel(String voltLevel) {
		this.VoltLevel = StringUtils.rightTrim(voltLevel);
	}


}
