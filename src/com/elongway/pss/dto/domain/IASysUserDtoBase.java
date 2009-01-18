package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IASysUser的数据传输对象基类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IASysUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性UserCode */
    private String userCode = "";
    /** 属性AreaCode */
    private String areaCode = "";
    /** 属性UserName */
    private String userName = "";
    /** 属性Password */
    private String password = "";
    /** 属性CompanyCode */
    private String companyCode = "";
    /** 属性PhoneNumber */
    private String phoneNumber = "";
    /** 属性Email */
    private String email = "";
    /** 属性Fax */
    private String fax = "";
    /** 属性UserGrade */
    private String userGrade = "";
    /** 属性ValidStatus */
    private String validStatus = "";
    /** 属性Flag */
    private String flag = "";

    /**
     *  默认构造方法,构造一个默认的IASysUserDtoBase对象
     */
    public IASysUserDtoBase(){
    }

    /**
     * 设置属性UserCode
     * @param userCode 待设置的属性UserCode的值
     */
    public void setUserCode(String userCode){
        this.userCode = StringUtils.rightTrim(userCode);
    }

    /**
     * 获取属性UserCode
     * @return 属性UserCode的值
     */
    public String getUserCode(){
        return userCode;
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
     * 设置属性UserName
     * @param userName 待设置的属性UserName的值
     */
    public void setUserName(String userName){
        this.userName = StringUtils.rightTrim(userName);
    }

    /**
     * 获取属性UserName
     * @return 属性UserName的值
     */
    public String getUserName(){
        return userName;
    }

    /**
     * 设置属性Password
     * @param password 待设置的属性Password的值
     */
    public void setPassword(String password){
        this.password = StringUtils.rightTrim(password);
    }

    /**
     * 获取属性Password
     * @return 属性Password的值
     */
    public String getPassword(){
        return password;
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
     * 设置属性PhoneNumber
     * @param phoneNumber 待设置的属性PhoneNumber的值
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = StringUtils.rightTrim(phoneNumber);
    }

    /**
     * 获取属性PhoneNumber
     * @return 属性PhoneNumber的值
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * 设置属性Email
     * @param email 待设置的属性Email的值
     */
    public void setEmail(String email){
        this.email = StringUtils.rightTrim(email);
    }

    /**
     * 获取属性Email
     * @return 属性Email的值
     */
    public String getEmail(){
        return email;
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
     * 设置属性UserGrade
     * @param userGrade 待设置的属性UserGrade的值
     */
    public void setUserGrade(String userGrade){
        this.userGrade = StringUtils.rightTrim(userGrade);
    }

    /**
     * 获取属性UserGrade
     * @return 属性UserGrade的值
     */
    public String getUserGrade(){
        return userGrade;
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
