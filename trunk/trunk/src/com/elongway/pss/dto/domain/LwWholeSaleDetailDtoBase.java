package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleDetail-趸售费用明细表的数据传输对象基类<br>
 */
public class LwWholeSaleDetailDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性公司名称 */
    private String companyName = "";
    /** 属性统计日期 */
    private String inputDate = "";
    /** 属性非居民照明(10kv)电量 */
    private double unDenizenQuantity10kv = 0D;
    /** 属性非居民照明(10kv)金额 */
    private double unDenizenMoney10kv = 0D;
    /** 属性居民生活(10kv)电量 */
    private double denizenQuantity10kv = 0D;
    /** 属性居民生活(10kv)金额 */
    private double denizenMoney10kv = 0D;
    /** 属性农业生产(10kv)电量 */
    private double productQuantity10kv = 0D;
    /** 属性农业生产(10kv)金额 */
    private double productMoney10kv = 0D;
    /** 属性非普工业(10kv)电量 */
    private double unIndustryQuantity10kv = 0D;
    /** 属性非普工业(10kv)金额 */
    private double unIndustryMoney10kv = 0D;
    /** 属性农业排灌(10kv)电量 */
    private double farmUseQuantity10kv = 0D;
    /** 属性农业排灌(10kv)金额 */
    private double farmUseMoney10kv = 0D;
    /** 属性商业(10kv)电量 */
    private double bizQuantity10kv = 0D;
    /** 属性商业(10kv)金额 */
    private double bizMoney10kv = 0D;
    /** 属性非居民照明(35kv)电量 */
    private double unDenizenQuantity35kv = 0D;
    /** 属性非居民照明(35kv)金额 */
    private double unDenizenMoney35kv = 0D;
    /** 属性居民生活(35kv)电量 */
    private double denizenQuantity35kv = 0D;
    /** 属性居民生活(35kv)金额 */
    private double denizenMoney35kv = 0D;
    /** 属性农业生产(35kv)电量 */
    private double productQuantity35kv = 0D;
    /** 属性农业生产(35kv)金额 */
    private double productMoney35kv = 0D;
    /** 属性非普工业(35kv)电量 */
    private double unIndustryQuantity35kv = 0D;
    /** 属性非普工业(35kv)金额 */
    private double unIndustryMoney35kv = 0D;
    /** 属性农业排灌(35kv)电量 */
    private double farmUseQuantity35kv = 0D;
    /** 属性农业排灌(35kv)金额 */
    private double farmUseMoney35kv = 0D;
    /** 属性商业(35kv)电量 */
    private double bizQuantity35kv = 0D;
    /** 属性商业(35kv)金额 */
    private double bizMoney35kv = 0D;

    /**
     *  默认构造方法,构造一个默认的LwWholeSaleDetailDtoBase对象
     */
    public LwWholeSaleDetailDtoBase(){
    }

    /**
     * 设置属性公司名称
     * @param companyName 待设置的属性公司名称的值
     */
    public void setCompanyName(String companyName){
        this.companyName = StringUtils.rightTrim(companyName);
    }

    /**
     * 获取属性公司名称
     * @return 属性公司名称的值
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * 设置属性统计日期
     * @param inputDate 待设置的属性统计日期的值
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * 获取属性统计日期
     * @return 属性统计日期的值
     */
    public String getInputDate(){
        return inputDate;
    }

    /**
     * 设置属性非居民照明(10kv)电量
     * @param unDenizenQuantity10kv 待设置的属性非居民照明(10kv)电量的值
     */
    public void setUnDenizenQuantity10kv(double unDenizenQuantity10kv){
        this.unDenizenQuantity10kv = unDenizenQuantity10kv;
    }

    /**
     * 获取属性非居民照明(10kv)电量
     * @return 属性非居民照明(10kv)电量的值
     */
    public double getUnDenizenQuantity10kv(){
        return unDenizenQuantity10kv;
    }

    /**
     * 设置属性非居民照明(10kv)金额
     * @param unDenizenMoney10kv 待设置的属性非居民照明(10kv)金额的值
     */
    public void setUnDenizenMoney10kv(double unDenizenMoney10kv){
        this.unDenizenMoney10kv = unDenizenMoney10kv;
    }

    /**
     * 获取属性非居民照明(10kv)金额
     * @return 属性非居民照明(10kv)金额的值
     */
    public double getUnDenizenMoney10kv(){
        return unDenizenMoney10kv;
    }

    /**
     * 设置属性居民生活(10kv)电量
     * @param denizenQuantity10kv 待设置的属性居民生活(10kv)电量的值
     */
    public void setDenizenQuantity10kv(double denizenQuantity10kv){
        this.denizenQuantity10kv = denizenQuantity10kv;
    }

    /**
     * 获取属性居民生活(10kv)电量
     * @return 属性居民生活(10kv)电量的值
     */
    public double getDenizenQuantity10kv(){
        return denizenQuantity10kv;
    }

    /**
     * 设置属性居民生活(10kv)金额
     * @param denizenMoney10kv 待设置的属性居民生活(10kv)金额的值
     */
    public void setDenizenMoney10kv(double denizenMoney10kv){
        this.denizenMoney10kv = denizenMoney10kv;
    }

    /**
     * 获取属性居民生活(10kv)金额
     * @return 属性居民生活(10kv)金额的值
     */
    public double getDenizenMoney10kv(){
        return denizenMoney10kv;
    }

    /**
     * 设置属性农业生产(10kv)电量
     * @param productQuantity10kv 待设置的属性农业生产(10kv)电量的值
     */
    public void setProductQuantity10kv(double productQuantity10kv){
        this.productQuantity10kv = productQuantity10kv;
    }

    /**
     * 获取属性农业生产(10kv)电量
     * @return 属性农业生产(10kv)电量的值
     */
    public double getProductQuantity10kv(){
        return productQuantity10kv;
    }

    /**
     * 设置属性农业生产(10kv)金额
     * @param productMoney10kv 待设置的属性农业生产(10kv)金额的值
     */
    public void setProductMoney10kv(double productMoney10kv){
        this.productMoney10kv = productMoney10kv;
    }

    /**
     * 获取属性农业生产(10kv)金额
     * @return 属性农业生产(10kv)金额的值
     */
    public double getProductMoney10kv(){
        return productMoney10kv;
    }

    /**
     * 设置属性非普工业(10kv)电量
     * @param unIndustryQuantity10kv 待设置的属性非普工业(10kv)电量的值
     */
    public void setUnIndustryQuantity10kv(double unIndustryQuantity10kv){
        this.unIndustryQuantity10kv = unIndustryQuantity10kv;
    }

    /**
     * 获取属性非普工业(10kv)电量
     * @return 属性非普工业(10kv)电量的值
     */
    public double getUnIndustryQuantity10kv(){
        return unIndustryQuantity10kv;
    }

    /**
     * 设置属性非普工业(10kv)金额
     * @param unIndustryMoney10kv 待设置的属性非普工业(10kv)金额的值
     */
    public void setUnIndustryMoney10kv(double unIndustryMoney10kv){
        this.unIndustryMoney10kv = unIndustryMoney10kv;
    }

    /**
     * 获取属性非普工业(10kv)金额
     * @return 属性非普工业(10kv)金额的值
     */
    public double getUnIndustryMoney10kv(){
        return unIndustryMoney10kv;
    }

    /**
     * 设置属性农业排灌(10kv)电量
     * @param farmUseQuantity10kv 待设置的属性农业排灌(10kv)电量的值
     */
    public void setFarmUseQuantity10kv(double farmUseQuantity10kv){
        this.farmUseQuantity10kv = farmUseQuantity10kv;
    }

    /**
     * 获取属性农业排灌(10kv)电量
     * @return 属性农业排灌(10kv)电量的值
     */
    public double getFarmUseQuantity10kv(){
        return farmUseQuantity10kv;
    }

    /**
     * 设置属性农业排灌(10kv)金额
     * @param farmUseMoney10kv 待设置的属性农业排灌(10kv)金额的值
     */
    public void setFarmUseMoney10kv(double farmUseMoney10kv){
        this.farmUseMoney10kv = farmUseMoney10kv;
    }

    /**
     * 获取属性农业排灌(10kv)金额
     * @return 属性农业排灌(10kv)金额的值
     */
    public double getFarmUseMoney10kv(){
        return farmUseMoney10kv;
    }

    /**
     * 设置属性商业(10kv)电量
     * @param bizQuantity10kv 待设置的属性商业(10kv)电量的值
     */
    public void setBizQuantity10kv(double bizQuantity10kv){
        this.bizQuantity10kv = bizQuantity10kv;
    }

    /**
     * 获取属性商业(10kv)电量
     * @return 属性商业(10kv)电量的值
     */
    public double getBizQuantity10kv(){
        return bizQuantity10kv;
    }

    /**
     * 设置属性商业(10kv)金额
     * @param bizMoney10kv 待设置的属性商业(10kv)金额的值
     */
    public void setBizMoney10kv(double bizMoney10kv){
        this.bizMoney10kv = bizMoney10kv;
    }

    /**
     * 获取属性商业(10kv)金额
     * @return 属性商业(10kv)金额的值
     */
    public double getBizMoney10kv(){
        return bizMoney10kv;
    }

    /**
     * 设置属性非居民照明(35kv)电量
     * @param unDenizenQuantity35kv 待设置的属性非居民照明(35kv)电量的值
     */
    public void setUnDenizenQuantity35kv(double unDenizenQuantity35kv){
        this.unDenizenQuantity35kv = unDenizenQuantity35kv;
    }

    /**
     * 获取属性非居民照明(35kv)电量
     * @return 属性非居民照明(35kv)电量的值
     */
    public double getUnDenizenQuantity35kv(){
        return unDenizenQuantity35kv;
    }

    /**
     * 设置属性非居民照明(35kv)金额
     * @param unDenizenMoney35kv 待设置的属性非居民照明(35kv)金额的值
     */
    public void setUnDenizenMoney35kv(double unDenizenMoney35kv){
        this.unDenizenMoney35kv = unDenizenMoney35kv;
    }

    /**
     * 获取属性非居民照明(35kv)金额
     * @return 属性非居民照明(35kv)金额的值
     */
    public double getUnDenizenMoney35kv(){
        return unDenizenMoney35kv;
    }

    /**
     * 设置属性居民生活(35kv)电量
     * @param denizenQuantity35kv 待设置的属性居民生活(35kv)电量的值
     */
    public void setDenizenQuantity35kv(double denizenQuantity35kv){
        this.denizenQuantity35kv = denizenQuantity35kv;
    }

    /**
     * 获取属性居民生活(35kv)电量
     * @return 属性居民生活(35kv)电量的值
     */
    public double getDenizenQuantity35kv(){
        return denizenQuantity35kv;
    }

    /**
     * 设置属性居民生活(35kv)金额
     * @param denizenMoney35kv 待设置的属性居民生活(35kv)金额的值
     */
    public void setDenizenMoney35kv(double denizenMoney35kv){
        this.denizenMoney35kv = denizenMoney35kv;
    }

    /**
     * 获取属性居民生活(35kv)金额
     * @return 属性居民生活(35kv)金额的值
     */
    public double getDenizenMoney35kv(){
        return denizenMoney35kv;
    }

    /**
     * 设置属性农业生产(35kv)电量
     * @param productQuantity35kv 待设置的属性农业生产(35kv)电量的值
     */
    public void setProductQuantity35kv(double productQuantity35kv){
        this.productQuantity35kv = productQuantity35kv;
    }

    /**
     * 获取属性农业生产(35kv)电量
     * @return 属性农业生产(35kv)电量的值
     */
    public double getProductQuantity35kv(){
        return productQuantity35kv;
    }

    /**
     * 设置属性农业生产(35kv)金额
     * @param productMoney35kv 待设置的属性农业生产(35kv)金额的值
     */
    public void setProductMoney35kv(double productMoney35kv){
        this.productMoney35kv = productMoney35kv;
    }

    /**
     * 获取属性农业生产(35kv)金额
     * @return 属性农业生产(35kv)金额的值
     */
    public double getProductMoney35kv(){
        return productMoney35kv;
    }

    /**
     * 设置属性非普工业(35kv)电量
     * @param unIndustryQuantity35kv 待设置的属性非普工业(35kv)电量的值
     */
    public void setUnIndustryQuantity35kv(double unIndustryQuantity35kv){
        this.unIndustryQuantity35kv = unIndustryQuantity35kv;
    }

    /**
     * 获取属性非普工业(35kv)电量
     * @return 属性非普工业(35kv)电量的值
     */
    public double getUnIndustryQuantity35kv(){
        return unIndustryQuantity35kv;
    }

    /**
     * 设置属性非普工业(35kv)金额
     * @param unIndustryMoney35kv 待设置的属性非普工业(35kv)金额的值
     */
    public void setUnIndustryMoney35kv(double unIndustryMoney35kv){
        this.unIndustryMoney35kv = unIndustryMoney35kv;
    }

    /**
     * 获取属性非普工业(35kv)金额
     * @return 属性非普工业(35kv)金额的值
     */
    public double getUnIndustryMoney35kv(){
        return unIndustryMoney35kv;
    }

    /**
     * 设置属性农业排灌(35kv)电量
     * @param farmUseQuantity35kv 待设置的属性农业排灌(35kv)电量的值
     */
    public void setFarmUseQuantity35kv(double farmUseQuantity35kv){
        this.farmUseQuantity35kv = farmUseQuantity35kv;
    }

    /**
     * 获取属性农业排灌(35kv)电量
     * @return 属性农业排灌(35kv)电量的值
     */
    public double getFarmUseQuantity35kv(){
        return farmUseQuantity35kv;
    }

    /**
     * 设置属性农业排灌(35kv)金额
     * @param farmUseMoney35kv 待设置的属性农业排灌(35kv)金额的值
     */
    public void setFarmUseMoney35kv(double farmUseMoney35kv){
        this.farmUseMoney35kv = farmUseMoney35kv;
    }

    /**
     * 获取属性农业排灌(35kv)金额
     * @return 属性农业排灌(35kv)金额的值
     */
    public double getFarmUseMoney35kv(){
        return farmUseMoney35kv;
    }

    /**
     * 设置属性商业(35kv)电量
     * @param bizQuantity35kv 待设置的属性商业(35kv)电量的值
     */
    public void setBizQuantity35kv(double bizQuantity35kv){
        this.bizQuantity35kv = bizQuantity35kv;
    }

    /**
     * 获取属性商业(35kv)电量
     * @return 属性商业(35kv)电量的值
     */
    public double getBizQuantity35kv(){
        return bizQuantity35kv;
    }

    /**
     * 设置属性商业(35kv)金额
     * @param bizMoney35kv 待设置的属性商业(35kv)金额的值
     */
    public void setBizMoney35kv(double bizMoney35kv){
        this.bizMoney35kv = bizMoney35kv;
    }

    /**
     * 获取属性商业(35kv)金额
     * @return 属性商业(35kv)金额的值
     */
    public double getBizMoney35kv(){
        return bizMoney35kv;
    }
}
