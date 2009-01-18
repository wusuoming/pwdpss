package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleUserInfo-趸售用户信息表的数据传输对象基类<br>
 */
public class LwWholeSaleUserInfoDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性户名 */
    private String userName = "";
    /** 属性供电电压 */
    private String voltage = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志位 */
    private String flag = "";
    /** 属性所属电力公司 */
    private String company = "";
    /** 属性电话 */
    private String phoneNo = "";
    /** 属性趸售类型 */
    private String wholesaletype = "";
    /** 属性所属线路 */
    private String lineCode = "";
    /** 属性是否算费 */
    private String ifCal = "";

    /**
     *  默认构造方法,构造一个默认的LwWholeSaleUserInfoDtoBase对象
     */
    public LwWholeSaleUserInfoDtoBase(){
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
     * 设置属性供电电压
     * @param voltage 待设置的属性供电电压的值
     */
    public void setVoltage(String voltage){
        this.voltage = StringUtils.rightTrim(voltage);
    }

    /**
     * 获取属性供电电压
     * @return 属性供电电压的值
     */
    public String getVoltage(){
        return voltage;
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
     * 设置属性标志位
     * @param flag 待设置的属性标志位的值
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * 获取属性标志位
     * @return 属性标志位的值
     */
    public String getFlag(){
        return flag;
    }

    /**
     * 设置属性所属电力公司
     * @param company 待设置的属性所属电力公司的值
     */
    public void setCompany(String company){
        this.company = StringUtils.rightTrim(company);
    }

    /**
     * 获取属性所属电力公司
     * @return 属性所属电力公司的值
     */
    public String getCompany(){
        return company;
    }

    /**
     * 设置属性电话
     * @param phoneNo 待设置的属性电话的值
     */
    public void setPhoneNo(String phoneNo){
        this.phoneNo = StringUtils.rightTrim(phoneNo);
    }

    /**
     * 获取属性电话
     * @return 属性电话的值
     */
    public String getPhoneNo(){
        return phoneNo;
    }

    /**
     * 设置属性趸售类型
     * @param wholesaletype 待设置的属性趸售类型的值
     */
    public void setWholesaletype(String wholesaletype){
        this.wholesaletype = StringUtils.rightTrim(wholesaletype);
    }

    /**
     * 获取属性趸售类型
     * @return 属性趸售类型的值
     */
    public String getWholesaletype(){
        return wholesaletype;
    }

    /**
     * 设置属性所属线路
     * @param lineCode 待设置的属性所属线路的值
     */
    public void setLineCode(String lineCode){
        this.lineCode = StringUtils.rightTrim(lineCode);
    }

    /**
     * 获取属性所属线路
     * @return 属性所属线路的值
     */
    public String getLineCode(){
        return lineCode;
    }

    /**
     * 设置属性是否算费
     * @param ifCal 待设置的属性是否算费的值
     */
    public void setIfCal(String ifCal){
        this.ifCal = StringUtils.rightTrim(ifCal);
    }

    /**
     * 获取属性是否算费
     * @return 属性是否算费的值
     */
    public String getIfCal(){
        return ifCal;
    }
}
