package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleSummary-趸售电费计算总表的数据传输对象基类<br>
 */
public class LwWholeSaleSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性线路代码 */
    private String lineCode = "";
    /** 属性统计年月 */
    private String statMonth = "";
    /** 属性用电分类 */
    private String powerClass = "";
    /** 属性总电量 */
    private double electricQuantity = 0D;
    /** 属性指针电量 */
    private double pointerQuantity = 0D;
    /** 属性三峡 */
    private double sanXiaFee = 0D;
    /** 属性居民基金 */
    private double surcharge = 0D;
    /** 属性合计 */
    private double sumFee = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性变损电量 */
    private double transLoss = 0D;
    /** 属性线损电量 */
    private double lineLoss = 0D;
    /** 属性无功电量 */
    private double unPointerQuantity = 0D;
    /** 属性功率因素 */
    private double rateCode = 0D;
    /** 属性调整值 */
    private double adjustRate = 0D;
    /** 属性农灌比例 */
    private double farmUseScale = 0D;
    /** 属性农灌电价 */
    private double farmUsePrice = 0D;
    /** 属性农灌电量 */
    private double farmUseQuantity = 0D;
    /** 属性农灌电费 */
    private double farmUseFee = 0D;
    /** 属性生产比例 */
    private double productScale = 0D;
    /** 属性生产电价 */
    private double productPrice = 0D;
    /** 属性生产电量 */
    private double productQuantity = 0D;
    /** 属性生产电费 */
    private double productFee = 0D;
    /** 属性居民比例 */
    private double denizenScale = 0D;
    /** 属性居民电价 */
    private double denizenPrice = 0D;
    /** 属性居民电量 */
    private double denizenQuantity = 0D;
    /** 属性居民电费 */
    private double denizenFee = 0D;
    /** 属性非居民比例 */
    private double unDenizenScale = 0D;
    /** 属性非居民电价 */
    private double unDenizenPrice = 0D;
    /** 属性非居民电量 */
    private double unDenizenQuantity = 0D;
    /** 属性非居民电费 */
    private double unDenizenFee = 0D;
    /** 属性工业比例 */
    private double industryScale = 0D;
    /** 属性工业电价 */
    private double industryPrice = 0D;
    /** 属性工业电量 */
    private double industryQuantity = 0D;
    /** 属性工业电费 */
    private double industryFee = 0D;
    /** 属性商业比例 */
    private double bizScale = 0D;
    /** 属性商业电价 */
    private double bizPrice = 0D;
    /** 属性商业电量 */
    private double bizQuantity = 0D;
    /** 属性商业电费 */
    private double bizFee = 0D;
    /** 属性力率电费 */
    private double powerRateFee = 0D;
    /** 属性所属电力机构 */
    private String upCompany = "";
    /** 属性电金 */
    private double powerFee = 0D;
    /** 属性录入日期 */
    private String inputDate = "";
    /** 属性电压等级 */
    private String kv = "";
    /** 属性趸售类型 */
    private String wholesaletype = "";
    /** 属性有功指针 */
    private double workNum = 0D;
    /** 属性无功指针 */
    private double unWorkNum = 0D;
    /** 属性非居商业工业基金 */
    private double otherSurcharge = 0D;
    /** 属性差别电量 */
    private String differenceQuantity = "";
    /** 属性无功变损电量 */
    private double unTransLoss = 0D;
    /** 属性无功线损电量 */
    private double unLineLoss = 0D;

    /**
     *  默认构造方法,构造一个默认的LwWholeSaleSummaryDtoBase对象
     */
    public LwWholeSaleSummaryDtoBase(){
    }

    /**
     * 设置属性线路代码
     * @param lineCode 待设置的属性线路代码的值
     */
    public void setLineCode(String lineCode){
        this.lineCode = StringUtils.rightTrim(lineCode);
    }

    /**
     * 获取属性线路代码
     * @return 属性线路代码的值
     */
    public String getLineCode(){
        return lineCode;
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
     * 设置属性总电量
     * @param electricQuantity 待设置的属性总电量的值
     */
    public void setElectricQuantity(double electricQuantity){
        this.electricQuantity = electricQuantity;
    }

    /**
     * 获取属性总电量
     * @return 属性总电量的值
     */
    public double getElectricQuantity(){
        return electricQuantity;
    }

    /**
     * 设置属性指针电量
     * @param pointerQuantity 待设置的属性指针电量的值
     */
    public void setPointerQuantity(double pointerQuantity){
        this.pointerQuantity = pointerQuantity;
    }

    /**
     * 获取属性指针电量
     * @return 属性指针电量的值
     */
    public double getPointerQuantity(){
        return pointerQuantity;
    }

    /**
     * 设置属性三峡
     * @param sanXiaFee 待设置的属性三峡的值
     */
    public void setSanXiaFee(double sanXiaFee){
        this.sanXiaFee = sanXiaFee;
    }

    /**
     * 获取属性三峡
     * @return 属性三峡的值
     */
    public double getSanXiaFee(){
        return sanXiaFee;
    }

    /**
     * 设置属性居民基金
     * @param surcharge 待设置的属性居民基金的值
     */
    public void setSurcharge(double surcharge){
        this.surcharge = surcharge;
    }

    /**
     * 获取属性居民基金
     * @return 属性居民基金的值
     */
    public double getSurcharge(){
        return surcharge;
    }

    /**
     * 设置属性合计
     * @param sumFee 待设置的属性合计的值
     */
    public void setSumFee(double sumFee){
        this.sumFee = sumFee;
    }

    /**
     * 获取属性合计
     * @return 属性合计的值
     */
    public double getSumFee(){
        return sumFee;
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

    /**
     * 设置属性变损电量
     * @param transLoss 待设置的属性变损电量的值
     */
    public void setTransLoss(double transLoss){
        this.transLoss = transLoss;
    }

    /**
     * 获取属性变损电量
     * @return 属性变损电量的值
     */
    public double getTransLoss(){
        return transLoss;
    }

    /**
     * 设置属性线损电量
     * @param lineLoss 待设置的属性线损电量的值
     */
    public void setLineLoss(double lineLoss){
        this.lineLoss = lineLoss;
    }

    /**
     * 获取属性线损电量
     * @return 属性线损电量的值
     */
    public double getLineLoss(){
        return lineLoss;
    }

    /**
     * 设置属性无功电量
     * @param unPointerQuantity 待设置的属性无功电量的值
     */
    public void setUnPointerQuantity(double unPointerQuantity){
        this.unPointerQuantity = unPointerQuantity;
    }

    /**
     * 获取属性无功电量
     * @return 属性无功电量的值
     */
    public double getUnPointerQuantity(){
        return unPointerQuantity;
    }

    /**
     * 设置属性功率因素
     * @param rateCode 待设置的属性功率因素的值
     */
    public void setRateCode(double rateCode){
        this.rateCode = rateCode;
    }

    /**
     * 获取属性功率因素
     * @return 属性功率因素的值
     */
    public double getRateCode(){
        return rateCode;
    }

    /**
     * 设置属性调整值
     * @param adjustRate 待设置的属性调整值的值
     */
    public void setAdjustRate(double adjustRate){
        this.adjustRate = adjustRate;
    }

    /**
     * 获取属性调整值
     * @return 属性调整值的值
     */
    public double getAdjustRate(){
        return adjustRate;
    }

    /**
     * 设置属性农灌比例
     * @param farmUseScale 待设置的属性农灌比例的值
     */
    public void setFarmUseScale(double farmUseScale){
        this.farmUseScale = farmUseScale;
    }

    /**
     * 获取属性农灌比例
     * @return 属性农灌比例的值
     */
    public double getFarmUseScale(){
        return farmUseScale;
    }

    /**
     * 设置属性农灌电价
     * @param farmUsePrice 待设置的属性农灌电价的值
     */
    public void setFarmUsePrice(double farmUsePrice){
        this.farmUsePrice = farmUsePrice;
    }

    /**
     * 获取属性农灌电价
     * @return 属性农灌电价的值
     */
    public double getFarmUsePrice(){
        return farmUsePrice;
    }

    /**
     * 设置属性农灌电量
     * @param farmUseQuantity 待设置的属性农灌电量的值
     */
    public void setFarmUseQuantity(double farmUseQuantity){
        this.farmUseQuantity = farmUseQuantity;
    }

    /**
     * 获取属性农灌电量
     * @return 属性农灌电量的值
     */
    public double getFarmUseQuantity(){
        return farmUseQuantity;
    }

    /**
     * 设置属性农灌电费
     * @param farmUseFee 待设置的属性农灌电费的值
     */
    public void setFarmUseFee(double farmUseFee){
        this.farmUseFee = farmUseFee;
    }

    /**
     * 获取属性农灌电费
     * @return 属性农灌电费的值
     */
    public double getFarmUseFee(){
        return farmUseFee;
    }

    /**
     * 设置属性生产比例
     * @param productScale 待设置的属性生产比例的值
     */
    public void setProductScale(double productScale){
        this.productScale = productScale;
    }

    /**
     * 获取属性生产比例
     * @return 属性生产比例的值
     */
    public double getProductScale(){
        return productScale;
    }

    /**
     * 设置属性生产电价
     * @param productPrice 待设置的属性生产电价的值
     */
    public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }

    /**
     * 获取属性生产电价
     * @return 属性生产电价的值
     */
    public double getProductPrice(){
        return productPrice;
    }

    /**
     * 设置属性生产电量
     * @param productQuantity 待设置的属性生产电量的值
     */
    public void setProductQuantity(double productQuantity){
        this.productQuantity = productQuantity;
    }

    /**
     * 获取属性生产电量
     * @return 属性生产电量的值
     */
    public double getProductQuantity(){
        return productQuantity;
    }

    /**
     * 设置属性生产电费
     * @param productFee 待设置的属性生产电费的值
     */
    public void setProductFee(double productFee){
        this.productFee = productFee;
    }

    /**
     * 获取属性生产电费
     * @return 属性生产电费的值
     */
    public double getProductFee(){
        return productFee;
    }

    /**
     * 设置属性居民比例
     * @param denizenScale 待设置的属性居民比例的值
     */
    public void setDenizenScale(double denizenScale){
        this.denizenScale = denizenScale;
    }

    /**
     * 获取属性居民比例
     * @return 属性居民比例的值
     */
    public double getDenizenScale(){
        return denizenScale;
    }

    /**
     * 设置属性居民电价
     * @param denizenPrice 待设置的属性居民电价的值
     */
    public void setDenizenPrice(double denizenPrice){
        this.denizenPrice = denizenPrice;
    }

    /**
     * 获取属性居民电价
     * @return 属性居民电价的值
     */
    public double getDenizenPrice(){
        return denizenPrice;
    }

    /**
     * 设置属性居民电量
     * @param denizenQuantity 待设置的属性居民电量的值
     */
    public void setDenizenQuantity(double denizenQuantity){
        this.denizenQuantity = denizenQuantity;
    }

    /**
     * 获取属性居民电量
     * @return 属性居民电量的值
     */
    public double getDenizenQuantity(){
        return denizenQuantity;
    }

    /**
     * 设置属性居民电费
     * @param denizenFee 待设置的属性居民电费的值
     */
    public void setDenizenFee(double denizenFee){
        this.denizenFee = denizenFee;
    }

    /**
     * 获取属性居民电费
     * @return 属性居民电费的值
     */
    public double getDenizenFee(){
        return denizenFee;
    }

    /**
     * 设置属性非居民比例
     * @param unDenizenScale 待设置的属性非居民比例的值
     */
    public void setUnDenizenScale(double unDenizenScale){
        this.unDenizenScale = unDenizenScale;
    }

    /**
     * 获取属性非居民比例
     * @return 属性非居民比例的值
     */
    public double getUnDenizenScale(){
        return unDenizenScale;
    }

    /**
     * 设置属性非居民电价
     * @param unDenizenPrice 待设置的属性非居民电价的值
     */
    public void setUnDenizenPrice(double unDenizenPrice){
        this.unDenizenPrice = unDenizenPrice;
    }

    /**
     * 获取属性非居民电价
     * @return 属性非居民电价的值
     */
    public double getUnDenizenPrice(){
        return unDenizenPrice;
    }

    /**
     * 设置属性非居民电量
     * @param unDenizenQuantity 待设置的属性非居民电量的值
     */
    public void setUnDenizenQuantity(double unDenizenQuantity){
        this.unDenizenQuantity = unDenizenQuantity;
    }

    /**
     * 获取属性非居民电量
     * @return 属性非居民电量的值
     */
    public double getUnDenizenQuantity(){
        return unDenizenQuantity;
    }

    /**
     * 设置属性非居民电费
     * @param unDenizenFee 待设置的属性非居民电费的值
     */
    public void setUnDenizenFee(double unDenizenFee){
        this.unDenizenFee = unDenizenFee;
    }

    /**
     * 获取属性非居民电费
     * @return 属性非居民电费的值
     */
    public double getUnDenizenFee(){
        return unDenizenFee;
    }

    /**
     * 设置属性工业比例
     * @param industryScale 待设置的属性工业比例的值
     */
    public void setIndustryScale(double industryScale){
        this.industryScale = industryScale;
    }

    /**
     * 获取属性工业比例
     * @return 属性工业比例的值
     */
    public double getIndustryScale(){
        return industryScale;
    }

    /**
     * 设置属性工业电价
     * @param industryPrice 待设置的属性工业电价的值
     */
    public void setIndustryPrice(double industryPrice){
        this.industryPrice = industryPrice;
    }

    /**
     * 获取属性工业电价
     * @return 属性工业电价的值
     */
    public double getIndustryPrice(){
        return industryPrice;
    }

    /**
     * 设置属性工业电量
     * @param industryQuantity 待设置的属性工业电量的值
     */
    public void setIndustryQuantity(double industryQuantity){
        this.industryQuantity = industryQuantity;
    }

    /**
     * 获取属性工业电量
     * @return 属性工业电量的值
     */
    public double getIndustryQuantity(){
        return industryQuantity;
    }

    /**
     * 设置属性工业电费
     * @param industryFee 待设置的属性工业电费的值
     */
    public void setIndustryFee(double industryFee){
        this.industryFee = industryFee;
    }

    /**
     * 获取属性工业电费
     * @return 属性工业电费的值
     */
    public double getIndustryFee(){
        return industryFee;
    }

    /**
     * 设置属性商业比例
     * @param bizScale 待设置的属性商业比例的值
     */
    public void setBizScale(double bizScale){
        this.bizScale = bizScale;
    }

    /**
     * 获取属性商业比例
     * @return 属性商业比例的值
     */
    public double getBizScale(){
        return bizScale;
    }

    /**
     * 设置属性商业电价
     * @param bizPrice 待设置的属性商业电价的值
     */
    public void setBizPrice(double bizPrice){
        this.bizPrice = bizPrice;
    }

    /**
     * 获取属性商业电价
     * @return 属性商业电价的值
     */
    public double getBizPrice(){
        return bizPrice;
    }

    /**
     * 设置属性商业电量
     * @param bizQuantity 待设置的属性商业电量的值
     */
    public void setBizQuantity(double bizQuantity){
        this.bizQuantity = bizQuantity;
    }

    /**
     * 获取属性商业电量
     * @return 属性商业电量的值
     */
    public double getBizQuantity(){
        return bizQuantity;
    }

    /**
     * 设置属性商业电费
     * @param bizFee 待设置的属性商业电费的值
     */
    public void setBizFee(double bizFee){
        this.bizFee = bizFee;
    }

    /**
     * 获取属性商业电费
     * @return 属性商业电费的值
     */
    public double getBizFee(){
        return bizFee;
    }

    /**
     * 设置属性力率电费
     * @param powerRateFee 待设置的属性力率电费的值
     */
    public void setPowerRateFee(double powerRateFee){
        this.powerRateFee = powerRateFee;
    }

    /**
     * 获取属性力率电费
     * @return 属性力率电费的值
     */
    public double getPowerRateFee(){
        return powerRateFee;
    }

    /**
     * 设置属性所属电力机构
     * @param upCompany 待设置的属性所属电力机构的值
     */
    public void setUpCompany(String upCompany){
        this.upCompany = StringUtils.rightTrim(upCompany);
    }

    /**
     * 获取属性所属电力机构
     * @return 属性所属电力机构的值
     */
    public String getUpCompany(){
        return upCompany;
    }

    /**
     * 设置属性电金
     * @param powerFee 待设置的属性电金的值
     */
    public void setPowerFee(double powerFee){
        this.powerFee = powerFee;
    }

    /**
     * 获取属性电金
     * @return 属性电金的值
     */
    public double getPowerFee(){
        return powerFee;
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
     * 设置属性电压等级
     * @param kv 待设置的属性电压等级的值
     */
    public void setKv(String kv){
        this.kv = StringUtils.rightTrim(kv);
    }

    /**
     * 获取属性电压等级
     * @return 属性电压等级的值
     */
    public String getKv(){
        return kv;
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
     * 设置属性有功指针
     * @param workNum 待设置的属性有功指针的值
     */
    public void setWorkNum(double workNum){
        this.workNum = workNum;
    }

    /**
     * 获取属性有功指针
     * @return 属性有功指针的值
     */
    public double getWorkNum(){
        return workNum;
    }

    /**
     * 设置属性无功指针
     * @param unWorkNum 待设置的属性无功指针的值
     */
    public void setUnWorkNum(double unWorkNum){
        this.unWorkNum = unWorkNum;
    }

    /**
     * 获取属性无功指针
     * @return 属性无功指针的值
     */
    public double getUnWorkNum(){
        return unWorkNum;
    }

    /**
     * 设置属性非居商业工业基金
     * @param otherSurcharge 待设置的属性非居商业工业基金的值
     */
    public void setOtherSurcharge(double otherSurcharge){
        this.otherSurcharge = otherSurcharge;
    }

    /**
     * 获取属性非居商业工业基金
     * @return 属性非居商业工业基金的值
     */
    public double getOtherSurcharge(){
        return otherSurcharge;
    }

    /**
     * 设置属性差别电量
     * @param differenceQuantity 待设置的属性差别电量的值
     */
    public void setDifferenceQuantity(String differenceQuantity){
        this.differenceQuantity = StringUtils.rightTrim(differenceQuantity);
    }

    /**
     * 获取属性差别电量
     * @return 属性差别电量的值
     */
    public String getDifferenceQuantity(){
        return differenceQuantity;
    }

    /**
     * 设置属性无功变损电量
     * @param unTransLoss 待设置的属性无功变损电量的值
     */
    public void setUnTransLoss(double unTransLoss){
        this.unTransLoss = unTransLoss;
    }

    /**
     * 获取属性无功变损电量
     * @return 属性无功变损电量的值
     */
    public double getUnTransLoss(){
        return unTransLoss;
    }

    /**
     * 设置属性无功线损电量
     * @param unLineLoss 待设置的属性无功线损电量的值
     */
    public void setUnLineLoss(double unLineLoss){
        this.unLineLoss = unLineLoss;
    }

    /**
     * 获取属性无功线损电量
     * @return 属性无功线损电量的值
     */
    public double getUnLineLoss(){
        return unLineLoss;
    }
}
