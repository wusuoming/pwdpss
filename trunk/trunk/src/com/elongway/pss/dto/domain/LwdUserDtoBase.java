package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWDUser-操作员代码表的数据传输对象基类<br>
 */
public class LwdUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性操作员代码 */
    private String operatorCode = "";
    /** 属性密码 */
    private String password = "";
    /** 属性归属机构代码 */
    private String comCode = "";
    /** 属性操作员中文名称 */
    private String customerCName = "";
    /** 属性操作员英文名称 */
    private String customerEName = "";
    /** 属性证件类型 */
    private String identifyType = "";
    /** 属性证件号码 */
    private String identifyNumber = "";
    /** 属性性别 */
    private String sex = "";
    /** 属性年龄 */
    private long age = 0L;
    /** 属性电话 */
    private String phoneNumber = "";
    /** 属性传真 */
    private String faxNumber = "";
    /** 属性手机号码 */
    private String mobile = "";
    /** 属性E_mail信箱 */
    private String email = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwdUserDtoBase对象
     */
    public LwdUserDtoBase(){
    }

    /**
     * 设置属性操作员代码
     * @param operatorCode 待设置的属性操作员代码的值
     */
    public void setOperatorCode(String operatorCode){
        this.operatorCode = StringUtils.rightTrim(operatorCode);
    }

    /**
     * 获取属性操作员代码
     * @return 属性操作员代码的值
     */
    public String getOperatorCode(){
        return operatorCode;
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
     * 设置属性归属机构代码
     * @param comCode 待设置的属性归属机构代码的值
     */
    public void setComCode(String comCode){
        this.comCode = StringUtils.rightTrim(comCode);
    }

    /**
     * 获取属性归属机构代码
     * @return 属性归属机构代码的值
     */
    public String getComCode(){
        return comCode;
    }

    /**
     * 设置属性操作员中文名称
     * @param customerCName 待设置的属性操作员中文名称的值
     */
    public void setCustomerCName(String customerCName){
        this.customerCName = StringUtils.rightTrim(customerCName);
    }

    /**
     * 获取属性操作员中文名称
     * @return 属性操作员中文名称的值
     */
    public String getCustomerCName(){
        return customerCName;
    }

    /**
     * 设置属性操作员英文名称
     * @param customerEName 待设置的属性操作员英文名称的值
     */
    public void setCustomerEName(String customerEName){
        this.customerEName = StringUtils.rightTrim(customerEName);
    }

    /**
     * 获取属性操作员英文名称
     * @return 属性操作员英文名称的值
     */
    public String getCustomerEName(){
        return customerEName;
    }

    /**
     * 设置属性证件类型
     * @param identifyType 待设置的属性证件类型的值
     */
    public void setIdentifyType(String identifyType){
        this.identifyType = StringUtils.rightTrim(identifyType);
    }

    /**
     * 获取属性证件类型
     * @return 属性证件类型的值
     */
    public String getIdentifyType(){
        return identifyType;
    }

    /**
     * 设置属性证件号码
     * @param identifyNumber 待设置的属性证件号码的值
     */
    public void setIdentifyNumber(String identifyNumber){
        this.identifyNumber = StringUtils.rightTrim(identifyNumber);
    }

    /**
     * 获取属性证件号码
     * @return 属性证件号码的值
     */
    public String getIdentifyNumber(){
        return identifyNumber;
    }

    /**
     * 设置属性性别
     * @param sex 待设置的属性性别的值
     */
    public void setSex(String sex){
        this.sex = StringUtils.rightTrim(sex);
    }

    /**
     * 获取属性性别
     * @return 属性性别的值
     */
    public String getSex(){
        return sex;
    }

    /**
     * 设置属性年龄
     * @param age 待设置的属性年龄的值
     */
    public void setAge(long age){
        this.age = age;
    }

    /**
     * 获取属性年龄
     * @return 属性年龄的值
     */
    public long getAge(){
        return age;
    }

    /**
     * 设置属性电话
     * @param phoneNumber 待设置的属性电话的值
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = StringUtils.rightTrim(phoneNumber);
    }

    /**
     * 获取属性电话
     * @return 属性电话的值
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * 设置属性传真
     * @param faxNumber 待设置的属性传真的值
     */
    public void setFaxNumber(String faxNumber){
        this.faxNumber = StringUtils.rightTrim(faxNumber);
    }

    /**
     * 获取属性传真
     * @return 属性传真的值
     */
    public String getFaxNumber(){
        return faxNumber;
    }

    /**
     * 设置属性手机号码
     * @param mobile 待设置的属性手机号码的值
     */
    public void setMobile(String mobile){
        this.mobile = StringUtils.rightTrim(mobile);
    }

    /**
     * 获取属性手机号码
     * @return 属性手机号码的值
     */
    public String getMobile(){
        return mobile;
    }

    /**
     * 设置属性E_mail信箱
     * @param email 待设置的属性E_mail信箱的值
     */
    public void setEmail(String email){
        this.email = StringUtils.rightTrim(email);
    }

    /**
     * 获取属性E_mail信箱
     * @return 属性E_mail信箱的值
     */
    public String getEmail(){
        return email;
    }

    /**
     * 设置属性是否有效
     * @param validStatus 待设置的属性是否有效的值
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * 获取属性是否有效
     * @return 属性是否有效的值
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

    /**
     * 设置属性注释
     * @param remark 待设置的属性注释的值
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * 获取属性注释
     * @return 属性注释的值
     */
    public String getRemark(){
        return remark;
    }
}
