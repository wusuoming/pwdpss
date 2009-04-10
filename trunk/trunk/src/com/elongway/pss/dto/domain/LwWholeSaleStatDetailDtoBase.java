package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleStatDetail-趸售按电价统计的数据传输对象基类<br>
 */
public class LwWholeSaleStatDetailDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性公司代码 */
    private String companyCode = "";
    /** 属性公司名称 */
    private String companyName = "";
    /** 属性统计标志 */
    private String statStyle = "";
    /** 属性统计日期 */
    private String inputDate = "";
    /** 属性非居民照明(10kv)电量 */
    private int unDenizenQuantity10kv = 0;
    /** 属性非居民照明(10kv)金额 */
    private double unDenizenMoney10kv = 0D;
    /** 属性居民生活(10kv)电量 */
    private int denizenQuantity10kv = 0;
    /** 属性居民生活(10kv)金额 */
    private double denizenMoney10kv = 0D;
    /** 属性农业生产(10kv)电量 */
    private int productQuantity10kv = 0;
    /** 属性农业生产(10kv)金额 */
    private double productMoney10kv = 0D;
    /** 属性非普工业(10kv)电量 */
    private int unIndustryQuantity10kv = 0;
    /** 属性非普工业(10kv)金额 */
    private double unIndustryMoney10kv = 0D;
    /** 属性农业排灌(10kv)电量 */
    private int farmUseQuantity10kv = 0;
    /** 属性农业排灌(10kv)金额 */
    private double farmUseMoney10kv = 0D;
    /** 属性商业(10kv)电量 */
    private int bizQuantity10kv = 0;
    /** 属性商业(10kv)金额 */
    private double bizMoney10kv = 0D;
    /** 属性非居民照明(35kv)电量 */
    private int unDenizenQuantity35kv = 0;
    /** 属性非居民照明(35kv)金额 */
    private double unDenizenMoney35kv = 0D;
    /** 属性居民生活(35kv)电量 */
    private int denizenQuantity35kv = 0;
    /** 属性居民生活(35kv)金额 */
    private double denizenMoney35kv = 0D;
    /** 属性农业生产(35kv)电量 */
    private int productQuantity35kv = 0;
    /** 属性农业生产(35kv)金额 */
    private double productMoney35kv = 0D;
    /** 属性非普工业(35kv)电量 */
    private int unIndustryQuantity35kv = 0;
    /** 属性非普工业(35kv)金额 */
    private double unIndustryMoney35kv = 0D;
    /** 属性农业排灌(35kv)电量 */
    private int farmUseQuantity35kv = 0;
    /** 属性农业排灌(35kv)金额 */
    private double farmUseMoney35kv = 0D;
    /** 属性商业(35kv)电量 */
    private int bizQuantity35kv = 0;
    /** 属性商业(35kv)金额 */
    private double bizMoney35kv = 0D;
    /** 属性总10KV电量 */
    private int sumQuantity10KV = 0;
    /** 属性总35KV电量 */
    private int sumQuantity35KV = 0;
    /** 属性总电量 */
    private int sumQuantity = 0;
    /** 属性电费 */
    private double powerFee = 0D;
    /** 属性电费税 */
    private double powerFeeTax = 0D;
    /** 属性力率电费 */
    private double lilvFee = 0D;
    /** 属性广播费 */
    private double broadFee = 0D;
    /** 属性海明炉 */
    private double haiminglu = 0D;
    /** 属性多边电费 */
    private double duobianFee = 0D;
    /** 属性退补电费 */
    private double tuibuFee = 0D;
    /** 属性总电费 */
    private double sumPowerFee = 0D;

    /**
     *  默认构造方法,构造一个默认的LwWholeSaleStatDetailDtoBase对象
     */
    public LwWholeSaleStatDetailDtoBase(){
    }

    /**
     * 设置属性公司代码
     * @param companyCode 待设置的属性公司代码的值
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * 获取属性公司代码
     * @return 属性公司代码的值
     */
    public String getCompanyCode(){
        return companyCode;
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
     * 设置属性统计标志
     * @param statStyle 待设置的属性统计标志的值
     */
    public void setStatStyle(String statStyle){
        this.statStyle = StringUtils.rightTrim(statStyle);
    }

    /**
     * 获取属性统计标志
     * @return 属性统计标志的值
     */
    public String getStatStyle(){
        return statStyle;
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
    public void setUnDenizenQuantity10kv(int unDenizenQuantity10kv){
        this.unDenizenQuantity10kv = unDenizenQuantity10kv;
    }

    /**
     * 获取属性非居民照明(10kv)电量
     * @return 属性非居民照明(10kv)电量的值
     */
    public int getUnDenizenQuantity10kv(){
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
    public void setDenizenQuantity10kv(int denizenQuantity10kv){
        this.denizenQuantity10kv = denizenQuantity10kv;
    }

    /**
     * 获取属性居民生活(10kv)电量
     * @return 属性居民生活(10kv)电量的值
     */
    public int getDenizenQuantity10kv(){
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
    public void setProductQuantity10kv(int productQuantity10kv){
        this.productQuantity10kv = productQuantity10kv;
    }

    /**
     * 获取属性农业生产(10kv)电量
     * @return 属性农业生产(10kv)电量的值
     */
    public int getProductQuantity10kv(){
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
    public void setUnIndustryQuantity10kv(int unIndustryQuantity10kv){
        this.unIndustryQuantity10kv = unIndustryQuantity10kv;
    }

    /**
     * 获取属性非普工业(10kv)电量
     * @return 属性非普工业(10kv)电量的值
     */
    public int getUnIndustryQuantity10kv(){
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
    public void setFarmUseQuantity10kv(int farmUseQuantity10kv){
        this.farmUseQuantity10kv = farmUseQuantity10kv;
    }

    /**
     * 获取属性农业排灌(10kv)电量
     * @return 属性农业排灌(10kv)电量的值
     */
    public int getFarmUseQuantity10kv(){
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
    public void setBizQuantity10kv(int bizQuantity10kv){
        this.bizQuantity10kv = bizQuantity10kv;
    }

    /**
     * 获取属性商业(10kv)电量
     * @return 属性商业(10kv)电量的值
     */
    public int getBizQuantity10kv(){
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
    public void setUnDenizenQuantity35kv(int unDenizenQuantity35kv){
        this.unDenizenQuantity35kv = unDenizenQuantity35kv;
    }

    /**
     * 获取属性非居民照明(35kv)电量
     * @return 属性非居民照明(35kv)电量的值
     */
    public int getUnDenizenQuantity35kv(){
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
    public void setDenizenQuantity35kv(int denizenQuantity35kv){
        this.denizenQuantity35kv = denizenQuantity35kv;
    }

    /**
     * 获取属性居民生活(35kv)电量
     * @return 属性居民生活(35kv)电量的值
     */
    public int getDenizenQuantity35kv(){
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
    public void setProductQuantity35kv(int productQuantity35kv){
        this.productQuantity35kv = productQuantity35kv;
    }

    /**
     * 获取属性农业生产(35kv)电量
     * @return 属性农业生产(35kv)电量的值
     */
    public int getProductQuantity35kv(){
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
    public void setUnIndustryQuantity35kv(int unIndustryQuantity35kv){
        this.unIndustryQuantity35kv = unIndustryQuantity35kv;
    }

    /**
     * 获取属性非普工业(35kv)电量
     * @return 属性非普工业(35kv)电量的值
     */
    public int getUnIndustryQuantity35kv(){
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
    public void setFarmUseQuantity35kv(int farmUseQuantity35kv){
        this.farmUseQuantity35kv = farmUseQuantity35kv;
    }

    /**
     * 获取属性农业排灌(35kv)电量
     * @return 属性农业排灌(35kv)电量的值
     */
    public int getFarmUseQuantity35kv(){
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
    public void setBizQuantity35kv(int bizQuantity35kv){
        this.bizQuantity35kv = bizQuantity35kv;
    }

    /**
     * 获取属性商业(35kv)电量
     * @return 属性商业(35kv)电量的值
     */
    public int getBizQuantity35kv(){
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

    /**
     * 设置属性总10KV电量
     * @param sumQuantity10KV 待设置的属性总10KV电量的值
     */
    public void setSumQuantity10KV(int sumQuantity10KV){
        this.sumQuantity10KV = sumQuantity10KV;
    }

    /**
     * 获取属性总10KV电量
     * @return 属性总10KV电量的值
     */
    public int getSumQuantity10KV(){
        return sumQuantity10KV;
    }

    /**
     * 设置属性总35KV电量
     * @param sumQuantity35KV 待设置的属性总35KV电量的值
     */
    public void setSumQuantity35KV(int sumQuantity35KV){
        this.sumQuantity35KV = sumQuantity35KV;
    }

    /**
     * 获取属性总35KV电量
     * @return 属性总35KV电量的值
     */
    public int getSumQuantity35KV(){
        return sumQuantity35KV;
    }

    /**
     * 设置属性总电量
     * @param sumQuantity 待设置的属性总电量的值
     */
    public void setSumQuantity(int sumQuantity){
        this.sumQuantity = sumQuantity;
    }

    /**
     * 获取属性总电量
     * @return 属性总电量的值
     */
    public int getSumQuantity(){
        return sumQuantity;
    }

    /**
     * 设置属性电费
     * @param powerFee 待设置的属性电费的值
     */
    public void setPowerFee(double powerFee){
        this.powerFee = powerFee;
    }

    /**
     * 获取属性电费
     * @return 属性电费的值
     */
    public double getPowerFee(){
        return powerFee;
    }

    /**
     * 设置属性电费税
     * @param powerFeeTax 待设置的属性电费税的值
     */
    public void setPowerFeeTax(double powerFeeTax){
        this.powerFeeTax = powerFeeTax;
    }

    /**
     * 获取属性电费税
     * @return 属性电费税的值
     */
    public double getPowerFeeTax(){
        return powerFeeTax;
    }

    /**
     * 设置属性力率电费
     * @param lilvFee 待设置的属性力率电费的值
     */
    public void setLilvFee(double lilvFee){
        this.lilvFee = lilvFee;
    }

    /**
     * 获取属性力率电费
     * @return 属性力率电费的值
     */
    public double getLilvFee(){
        return lilvFee;
    }

    /**
     * 设置属性广播费
     * @param broadFee 待设置的属性广播费的值
     */
    public void setBroadFee(double broadFee){
        this.broadFee = broadFee;
    }

    /**
     * 获取属性广播费
     * @return 属性广播费的值
     */
    public double getBroadFee(){
        return broadFee;
    }

    /**
     * 设置属性海明炉
     * @param haiminglu 待设置的属性海明炉的值
     */
    public void setHaiminglu(double haiminglu){
        this.haiminglu = haiminglu;
    }

    /**
     * 获取属性海明炉
     * @return 属性海明炉的值
     */
    public double getHaiminglu(){
        return haiminglu;
    }

    /**
     * 设置属性多边电费
     * @param duobianFee 待设置的属性多边电费的值
     */
    public void setDuobianFee(double duobianFee){
        this.duobianFee = duobianFee;
    }

    /**
     * 获取属性多边电费
     * @return 属性多边电费的值
     */
    public double getDuobianFee(){
        return duobianFee;
    }

    /**
     * 设置属性退补电费
     * @param tuibuFee 待设置的属性退补电费的值
     */
    public void setTuibuFee(double tuibuFee){
        this.tuibuFee = tuibuFee;
    }

    /**
     * 获取属性退补电费
     * @return 属性退补电费的值
     */
    public double getTuibuFee(){
        return tuibuFee;
    }

    /**
     * 设置属性总电费
     * @param sumPowerFee 待设置的属性总电费的值
     */
    public void setSumPowerFee(double sumPowerFee){
        this.sumPowerFee = sumPowerFee;
    }

    /**
     * 获取属性总电费
     * @return 属性总电费的值
     */
    public double getSumPowerFee(){
        return sumPowerFee;
    }
}
