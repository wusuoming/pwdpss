package com.elongway.pss.ui.view.system;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * ϵͳ�������ñ�IADsysConfig
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */
public class IADsysConfigForm extends AbstractForm {

	private static final long serialVersionUID = 1L;

	/** ����ParameterCode */
	private String parameterCode = "";

	/** ����ParameterType */
	private String parameterType = "";

	/** ����CompanyCode */
	private String companyCode = "";

	/** ����ParameterValue */
	private String parameterValue = "";

	/** ����AreaCode */
	private String areaCode = "";

	/** ����ValidStatus */
	private String validStatus = "";

	/** ����ParameterDesc */
	private String parameterDesc = "";

	/** ����Remark */
	private String remark = "";

	/** ����Flag */
	private String flag = "";

	/**
	 * ��������ParameterCode
	 * 
	 * @param parameterCode
	 *            �����õ�����ParameterCode��ֵ
	 */
	public void setParameterCode(String parameterCode) {
		this.parameterCode = StringUtils.rightTrim(parameterCode);
	}

	/**
	 * ��ȡ����ParameterCode
	 * 
	 * @return ����ParameterCode��ֵ
	 */
	public String getParameterCode() {
		return parameterCode;
	}

	/**
	 * ��������ParameterType
	 * 
	 * @param parameterType
	 *            �����õ�����ParameterType��ֵ
	 */
	public void setParameterType(String parameterType) {
		this.parameterType = StringUtils.rightTrim(parameterType);
	}

	/**
	 * ��ȡ����ParameterType
	 * 
	 * @return ����ParameterType��ֵ
	 */
	public String getParameterType() {
		return parameterType;
	}

	/**
	 * ��������CompanyCode
	 * 
	 * @param companyCode
	 *            �����õ�����CompanyCode��ֵ
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = StringUtils.rightTrim(companyCode);
	}

	/**
	 * ��ȡ����CompanyCode
	 * 
	 * @return ����CompanyCode��ֵ
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * ��������ParameterValue
	 * 
	 * @param parameterValue
	 *            �����õ�����ParameterValue��ֵ
	 */
	public void setParameterValue(String parameterValue) {
		this.parameterValue = StringUtils.rightTrim(parameterValue);
	}

	/**
	 * ��ȡ����ParameterValue
	 * 
	 * @return ����ParameterValue��ֵ
	 */
	public String getParameterValue() {
		return parameterValue;
	}

	/**
	 * ��������AreaCode
	 * 
	 * @param areaCode
	 *            �����õ�����AreaCode��ֵ
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = StringUtils.rightTrim(areaCode);
	}

	/**
	 * ��ȡ����AreaCode
	 * 
	 * @return ����AreaCode��ֵ
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * ��������ValidStatus
	 * 
	 * @param validStatus
	 *            �����õ�����ValidStatus��ֵ
	 */
	public void setValidStatus(String validStatus) {
		this.validStatus = StringUtils.rightTrim(validStatus);
	}

	/**
	 * ��ȡ����ValidStatus
	 * 
	 * @return ����ValidStatus��ֵ
	 */
	public String getValidStatus() {
		return validStatus;
	}

	/**
	 * ��������ParameterDesc
	 * 
	 * @param parameterDesc
	 *            �����õ�����ParameterDesc��ֵ
	 */
	public void setParameterDesc(String parameterDesc) {
		this.parameterDesc = StringUtils.rightTrim(parameterDesc);
	}

	/**
	 * ��ȡ����ParameterDesc
	 * 
	 * @return ����ParameterDesc��ֵ
	 */
	public String getParameterDesc() {
		return parameterDesc;
	}

	/**
	 * ��������Remark
	 * 
	 * @param remark
	 *            �����õ�����Remark��ֵ
	 */
	public void setRemark(String remark) {
		this.remark = StringUtils.rightTrim(remark);
	}

	/**
	 * ��ȡ����Remark
	 * 
	 * @return ����Remark��ֵ
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * ��������Flag
	 * 
	 * @param flag
	 *            �����õ�����Flag��ֵ
	 */
	public void setFlag(String flag) {
		this.flag = StringUtils.rightTrim(flag);
	}

	/**
	 * ��ȡ����Flag
	 * 
	 * @return ����Flag��ֵ
	 */
	public String getFlag() {
		return flag;
	}
}
