package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSalePurePrice-趸售纯电价表的数据传输对象基类<br>
 */
public class LwWholeSalePurePriceDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性电压等级 */
    private String voltLevel = "";
    /** 属性公司代码 */
    private String comCode = "";
    /** 属性公司名称 */
    private String comName = "";
    /** 属性居民电价 */
    private double peoplePrice = 0D;
    /** 属性非居民电价 */
    private double notPeoplePrice = 0D;
    /** 属性农灌电价 */
    private double farmPrice = 0D;
    /** 属性农业生产电价 */
    private double producePrice = 0D;
    /** 属性商业电价 */
    private double businessPrice = 0D;
    /** 属性非普工业 */
    private double industryPrice = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwWholeSalePurePriceDtoBase对象
     */
    public LwWholeSalePurePriceDtoBase(){
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
     * 设置属性公司代码
     * @param comCode 待设置的属性公司代码的值
     */
    public void setComCode(String comCode){
        this.comCode = StringUtils.rightTrim(comCode);
    }

    /**
     * 获取属性公司代码
     * @return 属性公司代码的值
     */
    public String getComCode(){
        return comCode;
    }

    /**
     * 设置属性公司名称
     * @param comName 待设置的属性公司名称的值
     */
    public void setComName(String comName){
        this.comName = StringUtils.rightTrim(comName);
    }

    /**
     * 获取属性公司名称
     * @return 属性公司名称的值
     */
    public String getComName(){
        return comName;
    }

    /**
     * 设置属性居民电价
     * @param peoplePrice 待设置的属性居民电价的值
     */
    public void setPeoplePrice(double peoplePrice){
        this.peoplePrice = peoplePrice;
    }

    /**
     * 获取属性居民电价
     * @return 属性居民电价的值
     */
    public double getPeoplePrice(){
        return peoplePrice;
    }

    /**
     * 设置属性非居民电价
     * @param notPeoplePrice 待设置的属性非居民电价的值
     */
    public void setNotPeoplePrice(double notPeoplePrice){
        this.notPeoplePrice = notPeoplePrice;
    }

    /**
     * 获取属性非居民电价
     * @return 属性非居民电价的值
     */
    public double getNotPeoplePrice(){
        return notPeoplePrice;
    }

    /**
     * 设置属性农灌电价
     * @param farmPrice 待设置的属性农灌电价的值
     */
    public void setFarmPrice(double farmPrice){
        this.farmPrice = farmPrice;
    }

    /**
     * 获取属性农灌电价
     * @return 属性农灌电价的值
     */
    public double getFarmPrice(){
        return farmPrice;
    }

    /**
     * 设置属性农业生产电价
     * @param producePrice 待设置的属性农业生产电价的值
     */
    public void setProducePrice(double producePrice){
        this.producePrice = producePrice;
    }

    /**
     * 获取属性农业生产电价
     * @return 属性农业生产电价的值
     */
    public double getProducePrice(){
        return producePrice;
    }

    /**
     * 设置属性商业电价
     * @param businessPrice 待设置的属性商业电价的值
     */
    public void setBusinessPrice(double businessPrice){
        this.businessPrice = businessPrice;
    }

    /**
     * 获取属性商业电价
     * @return 属性商业电价的值
     */
    public double getBusinessPrice(){
        return businessPrice;
    }

    /**
     * 设置属性非普工业
     * @param industryPrice 待设置的属性非普工业的值
     */
    public void setIndustryPrice(double industryPrice){
        this.industryPrice = industryPrice;
    }

    /**
     * 获取属性非普工业
     * @return 属性非普工业的值
     */
    public double getIndustryPrice(){
        return industryPrice;
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
