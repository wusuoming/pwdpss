package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADCompany�����ݴ���������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IADCompanyDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ����CompanyCode */
    private String companyCode = "";
    /** ����AreaCode */
    private String areaCode = "";
    /** ����CompanyCName */
    private String companyCName = "";
    /** ����CompanyEName */
    private String companyEName = "";
    /** ����AddressCName */
    private String addressCName = "";
    /** ����AddressEName */
    private String addressEName = "";
    /** ����PostCode */
    private String postCode = "";
    /** ����Phone */
    private String phone = "";
    /** ����Fax */
    private String fax = "";
    /** ����UpperCompanyCode */
    private String upperCompanyCode = "";
    /** ����InsurerName */
    private String insurerName = "";
    /** ����CompanyType */
    private String companyType = "";
    /** ����Remark */
    private String remark = "";
    /** ����ValidStatus */
    private String validStatus = "";
    /** ����Flag */
    private String flag = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�IADCompanyDtoBase����
     */
    public IADCompanyDtoBase(){
    }

    /**
     * ��������CompanyCode
     * @param companyCode �����õ�����CompanyCode��ֵ
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * ��ȡ����CompanyCode
     * @return ����CompanyCode��ֵ
     */
    public String getCompanyCode(){
        return companyCode;
    }

    /**
     * ��������AreaCode
     * @param areaCode �����õ�����AreaCode��ֵ
     */
    public void setAreaCode(String areaCode){
        this.areaCode = StringUtils.rightTrim(areaCode);
    }

    /**
     * ��ȡ����AreaCode
     * @return ����AreaCode��ֵ
     */
    public String getAreaCode(){
        return areaCode;
    }

    /**
     * ��������CompanyCName
     * @param companyCName �����õ�����CompanyCName��ֵ
     */
    public void setCompanyCName(String companyCName){
        this.companyCName = StringUtils.rightTrim(companyCName);
    }

    /**
     * ��ȡ����CompanyCName
     * @return ����CompanyCName��ֵ
     */
    public String getCompanyCName(){
        return companyCName;
    }

    /**
     * ��������CompanyEName
     * @param companyEName �����õ�����CompanyEName��ֵ
     */
    public void setCompanyEName(String companyEName){
        this.companyEName = StringUtils.rightTrim(companyEName);
    }

    /**
     * ��ȡ����CompanyEName
     * @return ����CompanyEName��ֵ
     */
    public String getCompanyEName(){
        return companyEName;
    }

    /**
     * ��������AddressCName
     * @param addressCName �����õ�����AddressCName��ֵ
     */
    public void setAddressCName(String addressCName){
        this.addressCName = StringUtils.rightTrim(addressCName);
    }

    /**
     * ��ȡ����AddressCName
     * @return ����AddressCName��ֵ
     */
    public String getAddressCName(){
        return addressCName;
    }

    /**
     * ��������AddressEName
     * @param addressEName �����õ�����AddressEName��ֵ
     */
    public void setAddressEName(String addressEName){
        this.addressEName = StringUtils.rightTrim(addressEName);
    }

    /**
     * ��ȡ����AddressEName
     * @return ����AddressEName��ֵ
     */
    public String getAddressEName(){
        return addressEName;
    }

    /**
     * ��������PostCode
     * @param postCode �����õ�����PostCode��ֵ
     */
    public void setPostCode(String postCode){
        this.postCode = StringUtils.rightTrim(postCode);
    }

    /**
     * ��ȡ����PostCode
     * @return ����PostCode��ֵ
     */
    public String getPostCode(){
        return postCode;
    }

    /**
     * ��������Phone
     * @param phone �����õ�����Phone��ֵ
     */
    public void setPhone(String phone){
        this.phone = StringUtils.rightTrim(phone);
    }

    /**
     * ��ȡ����Phone
     * @return ����Phone��ֵ
     */
    public String getPhone(){
        return phone;
    }

    /**
     * ��������Fax
     * @param fax �����õ�����Fax��ֵ
     */
    public void setFax(String fax){
        this.fax = StringUtils.rightTrim(fax);
    }

    /**
     * ��ȡ����Fax
     * @return ����Fax��ֵ
     */
    public String getFax(){
        return fax;
    }

    /**
     * ��������UpperCompanyCode
     * @param upperCompanyCode �����õ�����UpperCompanyCode��ֵ
     */
    public void setUpperCompanyCode(String upperCompanyCode){
        this.upperCompanyCode = StringUtils.rightTrim(upperCompanyCode);
    }

    /**
     * ��ȡ����UpperCompanyCode
     * @return ����UpperCompanyCode��ֵ
     */
    public String getUpperCompanyCode(){
        return upperCompanyCode;
    }

    /**
     * ��������InsurerName
     * @param insurerName �����õ�����InsurerName��ֵ
     */
    public void setInsurerName(String insurerName){
        this.insurerName = StringUtils.rightTrim(insurerName);
    }

    /**
     * ��ȡ����InsurerName
     * @return ����InsurerName��ֵ
     */
    public String getInsurerName(){
        return insurerName;
    }

    /**
     * ��������CompanyType
     * @param companyType �����õ�����CompanyType��ֵ
     */
    public void setCompanyType(String companyType){
        this.companyType = StringUtils.rightTrim(companyType);
    }

    /**
     * ��ȡ����CompanyType
     * @return ����CompanyType��ֵ
     */
    public String getCompanyType(){
        return companyType;
    }

    /**
     * ��������Remark
     * @param remark �����õ�����Remark��ֵ
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * ��ȡ����Remark
     * @return ����Remark��ֵ
     */
    public String getRemark(){
        return remark;
    }

    /**
     * ��������ValidStatus
     * @param validStatus �����õ�����ValidStatus��ֵ
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * ��ȡ����ValidStatus
     * @return ����ValidStatus��ֵ
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * ��������Flag
     * @param flag �����õ�����Flag��ֵ
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * ��ȡ����Flag
     * @return ����Flag��ֵ
     */
    public String getFlag(){
        return flag;
    }
}
