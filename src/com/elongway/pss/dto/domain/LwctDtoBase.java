package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是电流互感器的数据传输对象基类<br>
 */
public class LwctDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性型式 */
    private String modus = "";
    /** 属性电流比 */
    private String ct = "";
    /** 属性厂名 */
    private String factoryName = "";
    /** 属性精度 */
    private double exact = 0D;
    /** 属性倍率 */
    private double ctRate = 0D;
    /** 属性厂号A */
    private String fctoryCodeA = "";
    /** 属性厂号B */
    private String fctoryCodeB = "";
    /** 属性厂号C */
    private String fctoryCodeC = "";
    /** 属性标志位 */
    private String flag = "";
    /** 属性录入日期 */
    private String importDate = "";
    /** 属性是否有效 */
    private String validStatus = "";

    /**
     *  默认构造方法,构造一个默认的LwctDtoBase对象
     */
    public LwctDtoBase(){
    }

    /**
     * 设置属性型式
     * @param modus 待设置的属性型式的值
     */
    public void setModus(String modus){
        this.modus = StringUtils.rightTrim(modus);
    }

    /**
     * 获取属性型式
     * @return 属性型式的值
     */
    public String getModus(){
        return modus;
    }

    /**
     * 设置属性电流比
     * @param ct 待设置的属性电流比的值
     */
    public void setCt(String ct){
        this.ct = StringUtils.rightTrim(ct);
    }

    /**
     * 获取属性电流比
     * @return 属性电流比的值
     */
    public String getCt(){
        return ct;
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
     * 设置属性精度
     * @param exact 待设置的属性精度的值
     */
    public void setExact(double exact){
        this.exact = exact;
    }

    /**
     * 获取属性精度
     * @return 属性精度的值
     */
    public double getExact(){
        return exact;
    }

    /**
     * 设置属性倍率
     * @param ctRate 待设置的属性倍率的值
     */
    public void setCtRate(double ctRate){
        this.ctRate = ctRate;
    }

    /**
     * 获取属性倍率
     * @return 属性倍率的值
     */
    public double getCtRate(){
        return ctRate;
    }

    /**
     * 设置属性厂号A
     * @param fctoryCodeA 待设置的属性厂号A的值
     */
    public void setFctoryCodeA(String fctoryCodeA){
        this.fctoryCodeA = StringUtils.rightTrim(fctoryCodeA);
    }

    /**
     * 获取属性厂号A
     * @return 属性厂号A的值
     */
    public String getFctoryCodeA(){
        return fctoryCodeA;
    }

    /**
     * 设置属性厂号B
     * @param fctoryCodeB 待设置的属性厂号B的值
     */
    public void setFctoryCodeB(String fctoryCodeB){
        this.fctoryCodeB = StringUtils.rightTrim(fctoryCodeB);
    }

    /**
     * 获取属性厂号B
     * @return 属性厂号B的值
     */
    public String getFctoryCodeB(){
        return fctoryCodeB;
    }

    /**
     * 设置属性厂号C
     * @param fctoryCodeC 待设置的属性厂号C的值
     */
    public void setFctoryCodeC(String fctoryCodeC){
        this.fctoryCodeC = StringUtils.rightTrim(fctoryCodeC);
    }

    /**
     * 获取属性厂号C
     * @return 属性厂号C的值
     */
    public String getFctoryCodeC(){
        return fctoryCodeC;
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
     * 设置属性录入日期
     * @param importDate 待设置的属性录入日期的值
     */
    public void setImportDate(String importDate){
        this.importDate = StringUtils.rightTrim(importDate);
    }

    /**
     * 获取属性录入日期
     * @return 属性录入日期的值
     */
    public String getImportDate(){
        return importDate;
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
}
