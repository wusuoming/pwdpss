package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownProrateAppend-比例分摊追加表的数据传输对象基类<br>
 */
public class LwTownProrateAppendDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性农灌 */
    private double agricultural = 0D;
    /** 属性生产 */
    private double produce = 0D;
    /** 属性居民 */
    private double resident = 0D;
    /** 属性非居民 */
    private double indecisive = 0D;
    /** 属性非工业、普通工业电价 */
    private double industry = 0D;
    /** 属性商业 */
    private double business = 0D;
    /** 属性录入时间 */
    private String inputDate = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性标志 */
    private String flag = "";

    /**
     *  默认构造方法,构造一个默认的LwTownProrateAppendDtoBase对象
     */
    public LwTownProrateAppendDtoBase(){
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
     * 设置属性农灌
     * @param agricultural 待设置的属性农灌的值
     */
    public void setAgricultural(double agricultural){
        this.agricultural = agricultural;
    }

    /**
     * 获取属性农灌
     * @return 属性农灌的值
     */
    public double getAgricultural(){
        return agricultural;
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
     * 设置属性居民
     * @param resident 待设置的属性居民的值
     */
    public void setResident(double resident){
        this.resident = resident;
    }

    /**
     * 获取属性居民
     * @return 属性居民的值
     */
    public double getResident(){
        return resident;
    }

    /**
     * 设置属性非居民
     * @param indecisive 待设置的属性非居民的值
     */
    public void setIndecisive(double indecisive){
        this.indecisive = indecisive;
    }

    /**
     * 获取属性非居民
     * @return 属性非居民的值
     */
    public double getIndecisive(){
        return indecisive;
    }

    /**
     * 设置属性非工业、普通工业电价
     * @param industry 待设置的属性非工业、普通工业电价的值
     */
    public void setIndustry(double industry){
        this.industry = industry;
    }

    /**
     * 获取属性非工业、普通工业电价
     * @return 属性非工业、普通工业电价的值
     */
    public double getIndustry(){
        return industry;
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
