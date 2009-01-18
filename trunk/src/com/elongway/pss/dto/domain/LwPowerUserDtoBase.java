package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWPowerUser-用电用户信息表的数据传输对象基类<br>
 */
public class LwPowerUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性户名 */
    private String userName = "";
    /** 属性地址 */
    private String address = "";
    /** 属性所属乡镇 */
    private String townCode = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性用电类型 */
    private String superClass = "";
    /** 属性大工业类型 */
    private String factoryStyle = "";
    /** 属性趸售类型 */
    private String wholeSaleStyle = "";
    /** 属性电压等级 */
    private String saleVoltLevel = "";
    /** 属性线路代码 */
    private String lineCode = "";

    /**
     *  默认构造方法,构造一个默认的LwPowerUserDtoBase对象
     */
    public LwPowerUserDtoBase(){
    }

    /**
     * 设置属性户号
     * @param userNo 待设置的属性户号的值
     */
    public void setUserNo(String userNo){
        this.userNo = StringUtils.rightTrim(userNo);
    }

    /**
     * 获取属性户号
     * @return 属性户号的值
     */
    public String getUserNo(){
        return userNo;
    }

    /**
     * 设置属性户名
     * @param userName 待设置的属性户名的值
     */
    public void setUserName(String userName){
        this.userName = StringUtils.rightTrim(userName);
    }

    /**
     * 获取属性户名
     * @return 属性户名的值
     */
    public String getUserName(){
        return userName;
    }

    /**
     * 设置属性地址
     * @param address 待设置的属性地址的值
     */
    public void setAddress(String address){
        this.address = StringUtils.rightTrim(address);
    }

    /**
     * 获取属性地址
     * @return 属性地址的值
     */
    public String getAddress(){
        return address;
    }

    /**
     * 设置属性所属乡镇
     * @param townCode 待设置的属性所属乡镇的值
     */
    public void setTownCode(String townCode){
        this.townCode = StringUtils.rightTrim(townCode);
    }

    /**
     * 获取属性所属乡镇
     * @return 属性所属乡镇的值
     */
    public String getTownCode(){
        return townCode;
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
     * 设置属性用电类型
     * @param superClass 待设置的属性用电类型的值
     */
    public void setSuperClass(String superClass){
        this.superClass = StringUtils.rightTrim(superClass);
    }

    /**
     * 获取属性用电类型
     * @return 属性用电类型的值
     */
    public String getSuperClass(){
        return superClass;
    }

    /**
     * 设置属性大工业类型
     * @param factoryStyle 待设置的属性大工业类型的值
     */
    public void setFactoryStyle(String factoryStyle){
        this.factoryStyle = StringUtils.rightTrim(factoryStyle);
    }

    /**
     * 获取属性大工业类型
     * @return 属性大工业类型的值
     */
    public String getFactoryStyle(){
        return factoryStyle;
    }

    /**
     * 设置属性趸售类型
     * @param wholeSaleStyle 待设置的属性趸售类型的值
     */
    public void setWholeSaleStyle(String wholeSaleStyle){
        this.wholeSaleStyle = StringUtils.rightTrim(wholeSaleStyle);
    }

    /**
     * 获取属性趸售类型
     * @return 属性趸售类型的值
     */
    public String getWholeSaleStyle(){
        return wholeSaleStyle;
    }

    /**
     * 设置属性电压等级
     * @param saleVoltLevel 待设置的属性电压等级的值
     */
    public void setSaleVoltLevel(String saleVoltLevel){
        this.saleVoltLevel = StringUtils.rightTrim(saleVoltLevel);
    }

    /**
     * 获取属性电压等级
     * @return 属性电压等级的值
     */
    public String getSaleVoltLevel(){
        return saleVoltLevel;
    }

    /**
     * 设置属性线路代码
     * @param lineCode 待设置的属性线路代码的值
     */
    public void setLineCode(String lineCode){
        this.lineCode = StringUtils.rightTrim(lineCode);
    }

    /**
     * 获取属性线路代码
     * @return 属性线路代码的值
     */
    public String getLineCode(){
        return lineCode;
    }
}
