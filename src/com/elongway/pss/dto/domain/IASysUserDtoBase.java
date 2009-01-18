package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IASysUser�����ݴ���������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IASysUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ����UserCode */
    private String userCode = "";
    /** ����AreaCode */
    private String areaCode = "";
    /** ����UserName */
    private String userName = "";
    /** ����Password */
    private String password = "";
    /** ����CompanyCode */
    private String companyCode = "";
    /** ����PhoneNumber */
    private String phoneNumber = "";
    /** ����Email */
    private String email = "";
    /** ����Fax */
    private String fax = "";
    /** ����UserGrade */
    private String userGrade = "";
    /** ����ValidStatus */
    private String validStatus = "";
    /** ����Flag */
    private String flag = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�IASysUserDtoBase����
     */
    public IASysUserDtoBase(){
    }

    /**
     * ��������UserCode
     * @param userCode �����õ�����UserCode��ֵ
     */
    public void setUserCode(String userCode){
        this.userCode = StringUtils.rightTrim(userCode);
    }

    /**
     * ��ȡ����UserCode
     * @return ����UserCode��ֵ
     */
    public String getUserCode(){
        return userCode;
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
     * ��������UserName
     * @param userName �����õ�����UserName��ֵ
     */
    public void setUserName(String userName){
        this.userName = StringUtils.rightTrim(userName);
    }

    /**
     * ��ȡ����UserName
     * @return ����UserName��ֵ
     */
    public String getUserName(){
        return userName;
    }

    /**
     * ��������Password
     * @param password �����õ�����Password��ֵ
     */
    public void setPassword(String password){
        this.password = StringUtils.rightTrim(password);
    }

    /**
     * ��ȡ����Password
     * @return ����Password��ֵ
     */
    public String getPassword(){
        return password;
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
     * ��������PhoneNumber
     * @param phoneNumber �����õ�����PhoneNumber��ֵ
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = StringUtils.rightTrim(phoneNumber);
    }

    /**
     * ��ȡ����PhoneNumber
     * @return ����PhoneNumber��ֵ
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * ��������Email
     * @param email �����õ�����Email��ֵ
     */
    public void setEmail(String email){
        this.email = StringUtils.rightTrim(email);
    }

    /**
     * ��ȡ����Email
     * @return ����Email��ֵ
     */
    public String getEmail(){
        return email;
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
     * ��������UserGrade
     * @param userGrade �����õ�����UserGrade��ֵ
     */
    public void setUserGrade(String userGrade){
        this.userGrade = StringUtils.rightTrim(userGrade);
    }

    /**
     * ��ȡ����UserGrade
     * @return ����UserGrade��ֵ
     */
    public String getUserGrade(){
        return userGrade;
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
