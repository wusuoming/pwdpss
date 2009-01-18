package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWAmmeter-电表信息表的数据传输对象基类<br>
 */
public class LwAmmeterDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性表号 */
    private String ammeterNo = "";
    /** 属性相 */
    private String ammeterX = "";
    /** 属性伏 */
    private String ammeterV = "";
    /** 属性安 */
    private String ammeterA = "";
    /** 属性型式 */
    private String ammeterType = "";
    /** 属性厂名 */
    private String factoryName = "";
    /** 属性常数 */
    private String coust = "";
    /** 属性精度 */
    private String precision1 = "";
    /** 属性倍率 */
    private String rate = "";
    /** 属性表溢出的最大值 */
    private int maxnum = 0;
    /** 属性允许使用年限 */
    private String allowYear = "";
    /** 属性允许使用日期 */
    private String allowDate = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwAmmeterDtoBase对象
     */
    public LwAmmeterDtoBase(){
    }

    /**
     * 设置属性表号
     * @param ammeterNo 待设置的属性表号的值
     */
    public void setAmmeterNo(String ammeterNo){
        this.ammeterNo = StringUtils.rightTrim(ammeterNo);
    }

    /**
     * 获取属性表号
     * @return 属性表号的值
     */
    public String getAmmeterNo(){
        return ammeterNo;
    }

    /**
     * 设置属性相
     * @param ammeterX 待设置的属性相的值
     */
    public void setAmmeterX(String ammeterX){
        this.ammeterX = StringUtils.rightTrim(ammeterX);
    }

    /**
     * 获取属性相
     * @return 属性相的值
     */
    public String getAmmeterX(){
        return ammeterX;
    }

    /**
     * 设置属性伏
     * @param ammeterV 待设置的属性伏的值
     */
    public void setAmmeterV(String ammeterV){
        this.ammeterV = StringUtils.rightTrim(ammeterV);
    }

    /**
     * 获取属性伏
     * @return 属性伏的值
     */
    public String getAmmeterV(){
        return ammeterV;
    }

    /**
     * 设置属性安
     * @param ammeterA 待设置的属性安的值
     */
    public void setAmmeterA(String ammeterA){
        this.ammeterA = StringUtils.rightTrim(ammeterA);
    }

    /**
     * 获取属性安
     * @return 属性安的值
     */
    public String getAmmeterA(){
        return ammeterA;
    }

    /**
     * 设置属性型式
     * @param ammeterType 待设置的属性型式的值
     */
    public void setAmmeterType(String ammeterType){
        this.ammeterType = StringUtils.rightTrim(ammeterType);
    }

    /**
     * 获取属性型式
     * @return 属性型式的值
     */
    public String getAmmeterType(){
        return ammeterType;
    }

    /**
     * 设置属性厂名
     * @param factoryName 待设置的属性厂名的值
     */
    public void setFactoryName(String factoryName){
        this.factoryName = StringUtils.rightTrim(factoryName);
    }

    /**
     * 获取属性厂名
     * @return 属性厂名的值
     */
    public String getFactoryName(){
        return factoryName;
    }

    /**
     * 设置属性常数
     * @param coust 待设置的属性常数的值
     */
    public void setCoust(String coust){
        this.coust = StringUtils.rightTrim(coust);
    }

    /**
     * 获取属性常数
     * @return 属性常数的值
     */
    public String getCoust(){
        return coust;
    }

    /**
     * 设置属性精度
     * @param precision 待设置的属性精度的值
     */
    public void setPrecision(String precision){
        this.precision1 = StringUtils.rightTrim(precision);
    }

    /**
     * 获取属性精度
     * @return 属性精度的值
     */
    public String getPrecision(){
        return precision1;
    }

    /**
     * 设置属性倍率
     * @param rate 待设置的属性倍率的值
     */
    public void setRate(String rate){
        this.rate = StringUtils.rightTrim(rate);
    }

    /**
     * 获取属性倍率
     * @return 属性倍率的值
     */
    public String getRate(){
        return rate;
    }

    /**
     * 设置属性表溢出的最大值
     * @param maxnum 待设置的属性表溢出的最大值的值
     */
    public void setMaxnum(int maxnum){
        this.maxnum = maxnum;
    }

    /**
     * 获取属性表溢出的最大值
     * @return 属性表溢出的最大值的值
     */
    public int getMaxnum(){
        return maxnum;
    }

    /**
     * 设置属性允许使用年限
     * @param allowYear 待设置的属性允许使用年限的值
     */
    public void setAllowYear(String allowYear){
        this.allowYear = StringUtils.rightTrim(allowYear);
    }

    /**
     * 获取属性允许使用年限
     * @return 属性允许使用年限的值
     */
    public String getAllowYear(){
        return allowYear;
    }

    /**
     * 设置属性允许使用日期
     * @param allowDate 待设置的属性允许使用日期的值
     */
    public void setAllowDate(String allowDate){
        this.allowDate = StringUtils.rightTrim(allowDate);
    }

    /**
     * 获取属性允许使用日期
     * @return 属性允许使用日期的值
     */
    public String getAllowDate(){
        return allowDate;
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
