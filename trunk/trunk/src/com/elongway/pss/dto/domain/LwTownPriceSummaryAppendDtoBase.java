package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownPriceSummaryAppend-直供乡追加电费计算总表的数据传输对象基类<br>
 */
public class LwTownPriceSummaryAppendDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性统计年月 */
    private String statMonth = "";
    /** 属性录入日期 */
    private String inputDate = "";
    /** 属性追加农灌电费 */
    private double appendFarmFee = 0D;
    /** 属性追加工业电费 */
    private double appendIndustryFee = 0D;
    /** 属性追收生产电费 */
    private double appendProduceFee = 0D;
    /** 属性追加商业电费 */
    private double appendBizFee = 0D;
    /** 属性追加非居民电费 */
    private double appendNotPeopleFee = 0D;
    /** 属性追收居民电费 */
    private double appendPeopleFee = 0D;
    /** 属性追加电费 */
    private double appendCalPowerFee = 0D;
    /** 属性追加计算电量 */
    private double appendCalQuantity = 0D;
    /** 属性追收农业还贷 */
    private double appendLoan = 0D;
    /** 属性追收三峡 */
    private double appendSanXia = 0D;
    /** 属性追收可再生能源附加费 */
    private double appendKZS = 0D;
    /** 属性追收库区移民基金 */
    private double appendKuQu = 0D;
    /** 属性基金合计 */
    private double appendJiJin = 0D;
    /** 属性追收电费合计 */
    private double sumAppendFee = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwTownPriceSummaryAppendDtoBase对象
     */
    public LwTownPriceSummaryAppendDtoBase(){
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
     * 设置属性统计年月
     * @param statMonth 待设置的属性统计年月的值
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * 获取属性统计年月
     * @return 属性统计年月的值
     */
    public String getStatMonth(){
        return statMonth;
    }

    /**
     * 设置属性录入日期
     * @param inputDate 待设置的属性录入日期的值
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * 获取属性录入日期
     * @return 属性录入日期的值
     */
    public String getInputDate(){
        return inputDate;
    }

    /**
     * 设置属性追加农灌电费
     * @param appendFarmFee 待设置的属性追加农灌电费的值
     */
    public void setAppendFarmFee(double appendFarmFee){
        this.appendFarmFee = appendFarmFee;
    }

    /**
     * 获取属性追加农灌电费
     * @return 属性追加农灌电费的值
     */
    public double getAppendFarmFee(){
        return appendFarmFee;
    }

    /**
     * 设置属性追加工业电费
     * @param appendIndustryFee 待设置的属性追加工业电费的值
     */
    public void setAppendIndustryFee(double appendIndustryFee){
        this.appendIndustryFee = appendIndustryFee;
    }

    /**
     * 获取属性追加工业电费
     * @return 属性追加工业电费的值
     */
    public double getAppendIndustryFee(){
        return appendIndustryFee;
    }

    /**
     * 设置属性追收生产电费
     * @param appendProduceFee 待设置的属性追收生产电费的值
     */
    public void setAppendProduceFee(double appendProduceFee){
        this.appendProduceFee = appendProduceFee;
    }

    /**
     * 获取属性追收生产电费
     * @return 属性追收生产电费的值
     */
    public double getAppendProduceFee(){
        return appendProduceFee;
    }

    /**
     * 设置属性追加商业电费
     * @param appendBizFee 待设置的属性追加商业电费的值
     */
    public void setAppendBizFee(double appendBizFee){
        this.appendBizFee = appendBizFee;
    }

    /**
     * 获取属性追加商业电费
     * @return 属性追加商业电费的值
     */
    public double getAppendBizFee(){
        return appendBizFee;
    }

    /**
     * 设置属性追加非居民电费
     * @param appendNotPeopleFee 待设置的属性追加非居民电费的值
     */
    public void setAppendNotPeopleFee(double appendNotPeopleFee){
        this.appendNotPeopleFee = appendNotPeopleFee;
    }

    /**
     * 获取属性追加非居民电费
     * @return 属性追加非居民电费的值
     */
    public double getAppendNotPeopleFee(){
        return appendNotPeopleFee;
    }

    /**
     * 设置属性追收居民电费
     * @param appendPeopleFee 待设置的属性追收居民电费的值
     */
    public void setAppendPeopleFee(double appendPeopleFee){
        this.appendPeopleFee = appendPeopleFee;
    }

    /**
     * 获取属性追收居民电费
     * @return 属性追收居民电费的值
     */
    public double getAppendPeopleFee(){
        return appendPeopleFee;
    }

    /**
     * 设置属性追加电费
     * @param appendCalPowerFee 待设置的属性追加电费的值
     */
    public void setAppendCalPowerFee(double appendCalPowerFee){
        this.appendCalPowerFee = appendCalPowerFee;
    }

    /**
     * 获取属性追加电费
     * @return 属性追加电费的值
     */
    public double getAppendCalPowerFee(){
        return appendCalPowerFee;
    }

    /**
     * 设置属性追加计算电量
     * @param appendCalQuantity 待设置的属性追加计算电量的值
     */
    public void setAppendCalQuantity(double appendCalQuantity){
        this.appendCalQuantity = appendCalQuantity;
    }

    /**
     * 获取属性追加计算电量
     * @return 属性追加计算电量的值
     */
    public double getAppendCalQuantity(){
        return appendCalQuantity;
    }

    /**
     * 设置属性追收农业还贷
     * @param appendLoan 待设置的属性追收农业还贷的值
     */
    public void setAppendLoan(double appendLoan){
        this.appendLoan = appendLoan;
    }

    /**
     * 获取属性追收农业还贷
     * @return 属性追收农业还贷的值
     */
    public double getAppendLoan(){
        return appendLoan;
    }

    /**
     * 设置属性追收三峡
     * @param appendSanXia 待设置的属性追收三峡的值
     */
    public void setAppendSanXia(double appendSanXia){
        this.appendSanXia = appendSanXia;
    }

    /**
     * 获取属性追收三峡
     * @return 属性追收三峡的值
     */
    public double getAppendSanXia(){
        return appendSanXia;
    }

    /**
     * 设置属性追收可再生能源附加费
     * @param appendKZS 待设置的属性追收可再生能源附加费的值
     */
    public void setAppendKZS(double appendKZS){
        this.appendKZS = appendKZS;
    }

    /**
     * 获取属性追收可再生能源附加费
     * @return 属性追收可再生能源附加费的值
     */
    public double getAppendKZS(){
        return appendKZS;
    }

    /**
     * 设置属性追收库区移民基金
     * @param appendKuQu 待设置的属性追收库区移民基金的值
     */
    public void setAppendKuQu(double appendKuQu){
        this.appendKuQu = appendKuQu;
    }

    /**
     * 获取属性追收库区移民基金
     * @return 属性追收库区移民基金的值
     */
    public double getAppendKuQu(){
        return appendKuQu;
    }

    /**
     * 设置属性基金合计
     * @param appendJiJin 待设置的属性基金合计的值
     */
    public void setAppendJiJin(double appendJiJin){
        this.appendJiJin = appendJiJin;
    }

    /**
     * 获取属性基金合计
     * @return 属性基金合计的值
     */
    public double getAppendJiJin(){
        return appendJiJin;
    }

    /**
     * 设置属性追收电费合计
     * @param sumAppendFee 待设置的属性追收电费合计的值
     */
    public void setSumAppendFee(double sumAppendFee){
        this.sumAppendFee = sumAppendFee;
    }

    /**
     * 获取属性追收电费合计
     * @return 属性追收电费合计的值
     */
    public double getSumAppendFee(){
        return sumAppendFee;
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
