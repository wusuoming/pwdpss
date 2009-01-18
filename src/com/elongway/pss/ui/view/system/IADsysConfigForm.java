package com.elongway.pss.ui.view.system;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * 系统参数配置表IADsysConfig
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */
public class IADsysConfigForm extends AbstractForm {

	private static final long serialVersionUID = 1L;

	/** 属性ParameterCode */
	private String parameterCode = "";

	/** 属性ParameterType */
	private String parameterType = "";

	/** 属性CompanyCode */
	private String companyCode = "";

	/** 属性ParameterValue */
	private String parameterValue = "";

	/** 属性AreaCode */
	private String areaCode = "";

	/** 属性ValidStatus */
	private String validStatus = "";

	/** 属性ParameterDesc */
	private String parameterDesc = "";

	/** 属性Remark */
	private String remark = "";

	/** 属性Flag */
	private String flag = "";

	/**
	 * 设置属性ParameterCode
	 * 
	 * @param parameterCode
	 *            待设置的属性ParameterCode的值
	 */
	public void setParameterCode(String parameterCode) {
		this.parameterCode = StringUtils.rightTrim(parameterCode);
	}

	/**
	 * 获取属性ParameterCode
	 * 
	 * @return 属性ParameterCode的值
	 */
	public String getParameterCode() {
		return parameterCode;
	}

	/**
	 * 设置属性ParameterType
	 * 
	 * @param parameterType
	 *            待设置的属性ParameterType的值
	 */
	public void setParameterType(String parameterType) {
		this.parameterType = StringUtils.rightTrim(parameterType);
	}

	/**
	 * 获取属性ParameterType
	 * 
	 * @return 属性ParameterType的值
	 */
	public String getParameterType() {
		return parameterType;
	}

	/**
	 * 设置属性CompanyCode
	 * 
	 * @param companyCode
	 *            待设置的属性CompanyCode的值
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = StringUtils.rightTrim(companyCode);
	}

	/**
	 * 获取属性CompanyCode
	 * 
	 * @return 属性CompanyCode的值
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * 设置属性ParameterValue
	 * 
	 * @param parameterValue
	 *            待设置的属性ParameterValue的值
	 */
	public void setParameterValue(String parameterValue) {
		this.parameterValue = StringUtils.rightTrim(parameterValue);
	}

	/**
	 * 获取属性ParameterValue
	 * 
	 * @return 属性ParameterValue的值
	 */
	public String getParameterValue() {
		return parameterValue;
	}

	/**
	 * 设置属性AreaCode
	 * 
	 * @param areaCode
	 *            待设置的属性AreaCode的值
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = StringUtils.rightTrim(areaCode);
	}

	/**
	 * 获取属性AreaCode
	 * 
	 * @return 属性AreaCode的值
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * 设置属性ValidStatus
	 * 
	 * @param validStatus
	 *            待设置的属性ValidStatus的值
	 */
	public void setValidStatus(String validStatus) {
		this.validStatus = StringUtils.rightTrim(validStatus);
	}

	/**
	 * 获取属性ValidStatus
	 * 
	 * @return 属性ValidStatus的值
	 */
	public String getValidStatus() {
		return validStatus;
	}

	/**
	 * 设置属性ParameterDesc
	 * 
	 * @param parameterDesc
	 *            待设置的属性ParameterDesc的值
	 */
	public void setParameterDesc(String parameterDesc) {
		this.parameterDesc = StringUtils.rightTrim(parameterDesc);
	}

	/**
	 * 获取属性ParameterDesc
	 * 
	 * @return 属性ParameterDesc的值
	 */
	public String getParameterDesc() {
		return parameterDesc;
	}

	/**
	 * 设置属性Remark
	 * 
	 * @param remark
	 *            待设置的属性Remark的值
	 */
	public void setRemark(String remark) {
		this.remark = StringUtils.rightTrim(remark);
	}

	/**
	 * 获取属性Remark
	 * 
	 * @return 属性Remark的值
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置属性Flag
	 * 
	 * @param flag
	 *            待设置的属性Flag的值
	 */
	public void setFlag(String flag) {
		this.flag = StringUtils.rightTrim(flag);
	}

	/**
	 * 获取属性Flag
	 * 
	 * @return 属性Flag的值
	 */
	public String getFlag() {
		return flag;
	}
}
