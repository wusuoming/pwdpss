package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADCompany的数据传输对象基类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IADCompanyDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性CompanyCode */
    private String companyCode = "";
    /** 属性AreaCode */
    private String areaCode = "";
    /** 属性CompanyCName */
    private String companyCName = "";
    /** 属性CompanyEName */
    private String companyEName = "";
    /** 属性AddressCName */
    private String addressCName = "";
    /** 属性AddressEName */
    private String addressEName = "";
    /** 属性PostCode */
    private String postCode = "";
    /** 属性Phone */
    private String phone = "";
    /** 属性Fax */
    private String fax = "";
    /** 属性UpperCompanyCode */
    private String upperCompanyCode = "";
    /** 属性InsurerName */
    private String insurerName = "";
    /** 属性CompanyType */
    private String companyType = "";
    /** 属性Remark */
    private String remark = "";
    /** 属性ValidStatus */
    private String validStatus = "";
    /** 属性Flag */
    private String flag = "";

    /**
     *  默认构造方法,构造一个默认的IADCompanyDtoBase对象
     */
    public IADCompanyDtoBase(){
    }

    /**
     * 设置属性CompanyCode
     * @param companyCode 待设置的属性CompanyCode的值
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * 获取属性CompanyCode
     * @return 属性CompanyCode的值
     */
    public String getCompanyCode(){
        return companyCode;
    }

    /**
     * 设置属性AreaCode
     * @param areaCode 待设置的属性AreaCode的值
     */
    public void setAreaCode(String areaCode){
        this.areaCode = StringUtils.rightTrim(areaCode);
    }

    /**
     * 获取属性AreaCode
     * @return 属性AreaCode的值
     */
    public String getAreaCode(){
        return areaCode;
    }

    /**
     * 设置属性CompanyCName
     * @param companyCName 待设置的属性CompanyCName的值
     */
    public void setCompanyCName(String companyCName){
        this.companyCName = StringUtils.rightTrim(companyCName);
    }

    /**
     * 获取属性CompanyCName
     * @return 属性CompanyCName的值
     */
    public String getCompanyCName(){
        return companyCName;
    }

    /**
     * 设置属性CompanyEName
     * @param companyEName 待设置的属性CompanyEName的值
     */
    public void setCompanyEName(String companyEName){
        this.companyEName = StringUtils.rightTrim(companyEName);
    }

    /**
     * 获取属性CompanyEName
     * @return 属性CompanyEName的值
     */
    public String getCompanyEName(){
        return companyEName;
    }

    /**
     * 设置属性AddressCName
     * @param addressCName 待设置的属性AddressCName的值
     */
    public void setAddressCName(String addressCName){
        this.addressCName = StringUtils.rightTrim(addressCName);
    }

    /**
     * 获取属性AddressCName
     * @return 属性AddressCName的值
     */
    public String getAddressCName(){
        return addressCName;
    }

    /**
     * 设置属性AddressEName
     * @param addressEName 待设置的属性AddressEName的值
     */
    public void setAddressEName(String addressEName){
        this.addressEName = StringUtils.rightTrim(addressEName);
    }

    /**
     * 获取属性AddressEName
     * @return 属性AddressEName的值
     */
    public String getAddressEName(){
        return addressEName;
    }

    /**
     * 设置属性PostCode
     * @param postCode 待设置的属性PostCode的值
     */
    public void setPostCode(String postCode){
        this.postCode = StringUtils.rightTrim(postCode);
    }

    /**
     * 获取属性PostCode
     * @return 属性PostCode的值
     */
    public String getPostCode(){
        return postCode;
    }

    /**
     * 设置属性Phone
     * @param phone 待设置的属性Phone的值
     */
    public void setPhone(String phone){
        this.phone = StringUtils.rightTrim(phone);
    }

    /**
     * 获取属性Phone
     * @return 属性Phone的值
     */
    public String getPhone(){
        return phone;
    }

    /**
     * 设置属性Fax
     * @param fax 待设置的属性Fax的值
     */
    public void setFax(String fax){
        this.fax = StringUtils.rightTrim(fax);
    }

    /**
     * 获取属性Fax
     * @return 属性Fax的值
     */
    public String getFax(){
        return fax;
    }

    /**
     * 设置属性UpperCompanyCode
     * @param upperCompanyCode 待设置的属性UpperCompanyCode的值
     */
    public void setUpperCompanyCode(String upperCompanyCode){
        this.upperCompanyCode = StringUtils.rightTrim(upperCompanyCode);
    }

    /**
     * 获取属性UpperCompanyCode
     * @return 属性UpperCompanyCode的值
     */
    public String getUpperCompanyCode(){
        return upperCompanyCode;
    }

    /**
     * 设置属性InsurerName
     * @param insurerName 待设置的属性InsurerName的值
     */
    public void setInsurerName(String insurerName){
        this.insurerName = StringUtils.rightTrim(insurerName);
    }

    /**
     * 获取属性InsurerName
     * @return 属性InsurerName的值
     */
    public String getInsurerName(){
        return insurerName;
    }

    /**
     * 设置属性CompanyType
     * @param companyType 待设置的属性CompanyType的值
     */
    public void setCompanyType(String companyType){
        this.companyType = StringUtils.rightTrim(companyType);
    }

    /**
     * 获取属性CompanyType
     * @return 属性CompanyType的值
     */
    public String getCompanyType(){
        return companyType;
    }

    /**
     * 设置属性Remark
     * @param remark 待设置的属性Remark的值
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * 获取属性Remark
     * @return 属性Remark的值
     */
    public String getRemark(){
        return remark;
    }

    /**
     * 设置属性ValidStatus
     * @param validStatus 待设置的属性ValidStatus的值
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * 获取属性ValidStatus
     * @return 属性ValidStatus的值
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * 设置属性Flag
     * @param flag 待设置的属性Flag的值
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * 获取属性Flag
     * @return 属性Flag的值
     */
    public String getFlag(){
        return flag;
    }
}
