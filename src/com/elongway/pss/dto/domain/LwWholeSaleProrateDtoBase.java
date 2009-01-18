package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleProrate-趸售比例分摊表的数据传输对象基类<br>
 */
public class LwWholeSaleProrateDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性机构代码 */
    private String comCode = "";
    /** 属性机构名称 */
    private String companyName = "";
    /** 属性居民 */
    private double people = 0D;
    /** 属性非居民 */
    private double notPeople = 0D;
    /** 属性农灌 */
    private double farm = 0D;
    /** 属性生产 */
    private double produce = 0D;
    /** 属性商业 */
    private double business = 0D;
    /** 属性非普工业 */
    private double industry = 0D;
    /** 属性电压等级 */
    private String voltLevel = "";
    /** 属性录入时间 */
    private String inputDate = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性标志 */
    private String flag = "";

    /**
     *  默认构造方法,构造一个默认的LwWholeSaleProrateDtoBase对象
     */
    public LwWholeSaleProrateDtoBase(){
    }

    /**
     * 设置属性机构代码
     * @param comCode 待设置的属性机构代码的值
     */
    public void setComCode(String comCode){
        this.comCode = StringUtils.rightTrim(comCode);
    }

    /**
     * 获取属性机构代码
     * @return 属性机构代码的值
     */
    public String getComCode(){
        return comCode;
    }

    /**
     * 设置属性机构名称
     * @param companyName 待设置的属性机构名称的值
     */
    public void setCompanyName(String companyName){
        this.companyName = StringUtils.rightTrim(companyName);
    }

    /**
     * 获取属性机构名称
     * @return 属性机构名称的值
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * 设置属性居民
     * @param people 待设置的属性居民的值
     */
    public void setPeople(double people){
        this.people = people;
    }

    /**
     * 获取属性居民
     * @return 属性居民的值
     */
    public double getPeople(){
        return people;
    }

    /**
     * 设置属性非居民
     * @param notPeople 待设置的属性非居民的值
     */
    public void setNotPeople(double notPeople){
        this.notPeople = notPeople;
    }

    /**
     * 获取属性非居民
     * @return 属性非居民的值
     */
    public double getNotPeople(){
        return notPeople;
    }

    /**
     * 设置属性农灌
     * @param farm 待设置的属性农灌的值
     */
    public void setFarm(double farm){
        this.farm = farm;
    }

    /**
     * 获取属性农灌
     * @return 属性农灌的值
     */
    public double getFarm(){
        return farm;
    }

    /**
     * 设置属性生产
     * @param produce 待设置的属性生产的值
     */
    public void setProduce(double produce){
        this.produce = produce;
    }

    /**
     * 获取属性生产
     * @return 属性生产的值
     */
    public double getProduce(){
        return produce;
    }

    /**
     * 设置属性商业
     * @param business 待设置的属性商业的值
     */
    public void setBusiness(double business){
        this.business = business;
    }

    /**
     * 获取属性商业
     * @return 属性商业的值
     */
    public double getBusiness(){
        return business;
    }

    /**
     * 设置属性非普工业
     * @param industry 待设置的属性非普工业的值
     */
    public void setIndustry(double industry){
        this.industry = industry;
    }

    /**
     * 获取属性非普工业
     * @return 属性非普工业的值
     */
    public double getIndustry(){
        return industry;
    }

    /**
     * 设置属性电压等级
     * @param voltLevel 待设置的属性电压等级的值
     */
    public void setVoltLevel(String voltLevel){
        this.voltLevel = StringUtils.rightTrim(voltLevel);
    }

    /**
     * 获取属性电压等级
     * @return 属性电压等级的值
     */
    public String getVoltLevel(){
        return voltLevel;
    }

    /**
     * 设置属性录入时间
     * @param inputDate 待设置的属性录入时间的值
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * 获取属性录入时间
     * @return 属性录入时间的值
     */
    public String getInputDate(){
        return inputDate;
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
