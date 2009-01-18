package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWSysUser-登录用户表的数据传输对象基类<br>
 */
public class LwSysUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性用户代码 */
    private String userCode = "";
    /** 属性用户名称 */
    private String userName = "";
    /** 属性密码 */
    private String password = "";
    /** 属性机构名称 */
    private String companyCode = "";
    /** 属性电话号码 */
    private String phoneNumber = "";
    /** 属性电子邮件 */
    private String email = "";
    /** 属性传真 */
    private String fax = "";
    /** 属性用户权限 */
    private String userGrade = "";
    /** 属性有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";

    /**
     *  默认构造方法,构造一个默认的LwSysUserDtoBase对象
     */
    public LwSysUserDtoBase(){
    }

    /**
     * 设置属性用户代码
     * @param userCode 待设置的属性用户代码的值
     */
    public void setUserCode(String userCode){
        this.userCode = StringUtils.rightTrim(userCode);
    }

    /**
     * 获取属性用户代码
     * @return 属性用户代码的值
     */
    public String getUserCode(){
        return userCode;
    }

    /**
     * 设置属性用户名称
     * @param userName 待设置的属性用户名称的值
     */
    public void setUserName(String userName){
        this.userName = StringUtils.rightTrim(userName);
    }

    /**
     * 获取属性用户名称
     * @return 属性用户名称的值
     */
    public String getUserName(){
        return userName;
    }

    /**
     * 设置属性密码
     * @param password 待设置的属性密码的值
     */
    public void setPassword(String password){
        this.password = StringUtils.rightTrim(password);
    }

    /**
     * 获取属性密码
     * @return 属性密码的值
     */
    public String getPassword(){
        return password;
    }

    /**
     * 设置属性机构名称
     * @param companyCode 待设置的属性机构名称的值
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * 获取属性机构名称
     * @return 属性机构名称的值
     */
    public String getCompanyCode(){
        return companyCode;
    }

    /**
     * 设置属性电话号码
     * @param phoneNumber 待设置的属性电话号码的值
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = StringUtils.rightTrim(phoneNumber);
    }

    /**
     * 获取属性电话号码
     * @return 属性电话号码的值
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * 设置属性电子邮件
     * @param email 待设置的属性电子邮件的值
     */
    public void setEmail(String email){
        this.email = StringUtils.rightTrim(email);
    }

    /**
     * 获取属性电子邮件
     * @return 属性电子邮件的值
     */
    public String getEmail(){
        return email;
    }

    /**
     * 设置属性传真
     * @param fax 待设置的属性传真的值
     */
    public void setFax(String fax){
        this.fax = StringUtils.rightTrim(fax);
    }

    /**
     * 获取属性传真
     * @return 属性传真的值
     */
    public String getFax(){
        return fax;
    }

    /**
     * 设置属性用户权限
     * @param userGrade 待设置的属性用户权限的值
     */
    public void setUserGrade(String userGrade){
        this.userGrade = StringUtils.rightTrim(userGrade);
    }

    /**
     * 获取属性用户权限
     * @return 属性用户权限的值
     */
    public String getUserGrade(){
        return userGrade;
    }

    /**
     * 设置属性有效
     * @param validStatus 待设置的属性有效的值
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * 获取属性有效
     * @return 属性有效的值
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * 设置属性标志
     * @param flag 待设置的属性标志的值
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * 获取属性标志
     * @return 属性标志的值
     */
    public String getFlag(){
        return flag;
    }
}
