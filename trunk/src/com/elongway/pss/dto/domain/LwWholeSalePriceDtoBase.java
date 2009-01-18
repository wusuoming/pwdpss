package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSalePrice-趸售价格表的数据传输对象基类<br>
 */
public class LwWholeSalePriceDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性用电分类 */
    private String powerClass = "";
    /** 属性趸售区域 */
    private String saleArea = "";
    /** 属性起始电压 */
    private double voltageBegin = 0D;
    /** 属性终止电压 */
    private double voltageEnd = 0D;
    /** 属性单价 */
    private double price = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwWholeSalePriceDtoBase对象
     */
    public LwWholeSalePriceDtoBase(){
    }

    /**
     * 设置属性用电分类
     * @param powerClass 待设置的属性用电分类的值
     */
    public void setPowerClass(String powerClass){
        this.powerClass = StringUtils.rightTrim(powerClass);
    }

    /**
     * 获取属性用电分类
     * @return 属性用电分类的值
     */
    public String getPowerClass(){
        return powerClass;
    }

    /**
     * 设置属性趸售区域
     * @param saleArea 待设置的属性趸售区域的值
     */
    public void setSaleArea(String saleArea){
        this.saleArea = StringUtils.rightTrim(saleArea);
    }

    /**
     * 获取属性趸售区域
     * @return 属性趸售区域的值
     */
    public String getSaleArea(){
        return saleArea;
    }

    /**
     * 设置属性起始电压
     * @param voltageBegin 待设置的属性起始电压的值
     */
    public void setVoltageBegin(double voltageBegin){
        this.voltageBegin = voltageBegin;
    }

    /**
     * 获取属性起始电压
     * @return 属性起始电压的值
     */
    public double getVoltageBegin(){
        return voltageBegin;
    }

    /**
     * 设置属性终止电压
     * @param voltageEnd 待设置的属性终止电压的值
     */
    public void setVoltageEnd(double voltageEnd){
        this.voltageEnd = voltageEnd;
    }

    /**
     * 获取属性终止电压
     * @return 属性终止电压的值
     */
    public double getVoltageEnd(){
        return voltageEnd;
    }

    /**
     * 设置属性单价
     * @param price 待设置的属性单价的值
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * 获取属性单价
     * @return 属性单价的值
     */
    public double getPrice(){
        return price;
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
