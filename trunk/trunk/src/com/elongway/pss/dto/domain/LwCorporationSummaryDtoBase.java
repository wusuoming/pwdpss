package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWCorporationSummary-大工业销售计算总表的数据传输对象基类<br>
 */
public class LwCorporationSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性线路代码 */
    private String lineCode = "";
    /** 属性统计年月 */
    private String statMonth = "";
    /** 属性用电分类 */
    private String powerClass = "";
    /** 属性总电量 */
    private double electricQuantity = 0D;
    /** 属性三峡 */
    private double sanXiaFee = 0D;
    /** 属性基金 */
    private double surcharge = 0D;
    /** 属性电金 */
    private double powerFee = 0D;
    /** 属性非居民电量 */
    private double unDenizenQuantity = 0D;
    /** 属性有功电量 */
    private double pointerQuantity = 0D;
    /** 属性有功电价 */
    private double pointerPrice = 0D;
    /** 属性有功电费 */
    private double pointerFee = 0D;
    /** 属性非居民电价 */
    private double unDenizenPrice = 0D;
    /** 属性非居民电费 */
    private double unDenizenFee = 0D;
    /** 属性调整值 */
    private double ajustRate = 0D;
    /** 属性力率电费 */
    private double powerRateFee = 0D;
    /** 属性功率因素 */
    private double rateCode = 0D;
    /** 属性需量电量 */
    private double needQuantity = 0D;
    /** 属性需量电价 */
    private double needPrice = 0D;
    /** 属性需量电费 */
    private double needFee = 0D;
    /** 属性户号 */
    private String userNo = "";
    /** 属性容量电量 */
    private double contentQuantity = 0D;
    /** 属性容量电价 */
    private double contentPrice = 0D;
    /** 属性容量电费 */
    private double contentFee = 0D;
    /** 属性无功电量 */
    private double unPointerQuantity = 0D;
    /** 属性基金电价 */
    private double surchargePrice = 0D;
    /** 属性三峡金电价 */
    private double sanXiaPrice = 0D;
    /** 属性电金电价 */
    private double powerPrice = 0D;
    /** 属性谷段电量 */
    private double valleyQuantity = 0D;
    /** 属性峰段电量 */
    private double peakQuantity = 0D;
    /** 属性峰段电价 */
    private double peakPrice = 0D;
    /** 属性谷段电j价 */
    private double valleyPrice = 0D;
    /** 属性峰段电费 */
    private double peakFee = 0D;
    /** 属性古段电费 */
    private double valleyFee = 0D;
    /** 属性变损电量 */
    private double lossQuantity = 0D;
    /** 属性标志位 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性电费合计 */
    private double sumFee = 0D;
    /** 属性录入日期 */
    private String inputDate = "";
    /** 属性抄见电量 */
    private double sumPointerQuantity = 0D;
    /** 属性电量类型 */
    private String quantityStyle = "";
    /** 属性改变前电价 */
    private double beforPrice = 0D;
    /** 属性改变后电价 */
    private double lastPrice = 0D;
    /** 属性改变前电量 */
    private double beforPower = 0D;
    /** 属性改变后电量 */
    private double lastPower = 0D;
    /** 属性改变前电费 */
    private double beforFee = 0D;
    /** 属性改变后电费 */
    private double lastFee = 0D;
    /** 属性是否发生改变 */
    private String ifchange = "";
    /** 属性需量指针 */
    private double needPointer = 0D;
    /** 属性有功线损电量 */
    private double lineLoss = 0D;
    /** 属性无功线损电量 */
    private double unLineLoss = 0D;
    /** 属性无功变损电量 */
    private double unLossQuantity = 0D;

    /**
     *  默认构造方法,构造一个默认的LwCorporationSummaryDtoBase对象
     */
    public LwCorporationSummaryDtoBase(){
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
     * 设置属性基金
     * @param surcharge 待设置的属性基金的值
     */
    public void setSurcharge(double surcharge){
        this.surcharge = surcharge;
    }

    /**
     * 获取属性基金
     * @return 属性基金的值
     */
    public double getSurcharge(){
        return surcharge;
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
     * 设置属性有功电量
     * @param pointerQuantity 待设置的属性有功电量的值
     */
    public void setPointerQuantity(double pointerQuantity){
        this.pointerQuantity = pointerQuantity;
    }

    /**
     * 获取属性有功电量
     * @return 属性有功电量的值
     */
    public double getPointerQuantity(){
        return pointerQuantity;
    }

    /**
     * 设置属性有功电价
     * @param pointerPrice 待设置的属性有功电价的值
     */
    public void setPointerPrice(double pointerPrice){
        this.pointerPrice = pointerPrice;
    }

    /**
     * 获取属性有功电价
     * @return 属性有功电价的值
     */
    public double getPointerPrice(){
        return pointerPrice;
    }

    /**
     * 设置属性有功电费
     * @param pointerFee 待设置的属性有功电费的值
     */
    public void setPointerFee(double pointerFee){
        this.pointerFee = pointerFee;
    }

    /**
     * 获取属性有功电费
     * @return 属性有功电费的值
     */
    public double getPointerFee(){
        return pointerFee;
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
     * 设置属性调整值
     * @param ajustRate 待设置的属性调整值的值
     */
    public void setAjustRate(double ajustRate){
        this.ajustRate = ajustRate;
    }

    /**
     * 获取属性调整值
     * @return 属性调整值的值
     */
    public double getAjustRate(){
        return ajustRate;
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
     * 设置属性需量电量
     * @param needQuantity 待设置的属性需量电量的值
     */
    public void setNeedQuantity(double needQuantity){
        this.needQuantity = needQuantity;
    }

    /**
     * 获取属性需量电量
     * @return 属性需量电量的值
     */
    public double getNeedQuantity(){
        return needQuantity;
    }

    /**
     * 设置属性需量电价
     * @param needPrice 待设置的属性需量电价的值
     */
    public void setNeedPrice(double needPrice){
        this.needPrice = needPrice;
    }

    /**
     * 获取属性需量电价
     * @return 属性需量电价的值
     */
    public double getNeedPrice(){
        return needPrice;
    }

    /**
     * 设置属性需量电费
     * @param needFee 待设置的属性需量电费的值
     */
    public void setNeedFee(double needFee){
        this.needFee = needFee;
    }

    /**
     * 获取属性需量电费
     * @return 属性需量电费的值
     */
    public double getNeedFee(){
        return needFee;
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
     * 设置属性容量电量
     * @param contentQuantity 待设置的属性容量电量的值
     */
    public void setContentQuantity(double contentQuantity){
        this.contentQuantity = contentQuantity;
    }

    /**
     * 获取属性容量电量
     * @return 属性容量电量的值
     */
    public double getContentQuantity(){
        return contentQuantity;
    }

    /**
     * 设置属性容量电价
     * @param contentPrice 待设置的属性容量电价的值
     */
    public void setContentPrice(double contentPrice){
        this.contentPrice = contentPrice;
    }

    /**
     * 获取属性容量电价
     * @return 属性容量电价的值
     */
    public double getContentPrice(){
        return contentPrice;
    }

    /**
     * 设置属性容量电费
     * @param contentFee 待设置的属性容量电费的值
     */
    public void setContentFee(double contentFee){
        this.contentFee = contentFee;
    }

    /**
     * 获取属性容量电费
     * @return 属性容量电费的值
     */
    public double getContentFee(){
        return contentFee;
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
     * 设置属性基金电价
     * @param surchargePrice 待设置的属性基金电价的值
     */
    public void setSurchargePrice(double surchargePrice){
        this.surchargePrice = surchargePrice;
    }

    /**
     * 获取属性基金电价
     * @return 属性基金电价的值
     */
    public double getSurchargePrice(){
        return surchargePrice;
    }

    /**
     * 设置属性三峡金电价
     * @param sanXiaPrice 待设置的属性三峡金电价的值
     */
    public void setSanXiaPrice(double sanXiaPrice){
        this.sanXiaPrice = sanXiaPrice;
    }

    /**
     * 获取属性三峡金电价
     * @return 属性三峡金电价的值
     */
    public double getSanXiaPrice(){
        return sanXiaPrice;
    }

    /**
     * 设置属性电金电价
     * @param powerPrice 待设置的属性电金电价的值
     */
    public void setPowerPrice(double powerPrice){
        this.powerPrice = powerPrice;
    }

    /**
     * 获取属性电金电价
     * @return 属性电金电价的值
     */
    public double getPowerPrice(){
        return powerPrice;
    }

    /**
     * 设置属性谷段电量
     * @param valleyQuantity 待设置的属性谷段电量的值
     */
    public void setValleyQuantity(double valleyQuantity){
        this.valleyQuantity = valleyQuantity;
    }

    /**
     * 获取属性谷段电量
     * @return 属性谷段电量的值
     */
    public double getValleyQuantity(){
        return valleyQuantity;
    }

    /**
     * 设置属性峰段电量
     * @param peakQuantity 待设置的属性峰段电量的值
     */
    public void setPeakQuantity(double peakQuantity){
        this.peakQuantity = peakQuantity;
    }

    /**
     * 获取属性峰段电量
     * @return 属性峰段电量的值
     */
    public double getPeakQuantity(){
        return peakQuantity;
    }

    /**
     * 设置属性峰段电价
     * @param peakPrice 待设置的属性峰段电价的值
     */
    public void setPeakPrice(double peakPrice){
        this.peakPrice = peakPrice;
    }

    /**
     * 获取属性峰段电价
     * @return 属性峰段电价的值
     */
    public double getPeakPrice(){
        return peakPrice;
    }

    /**
     * 设置属性谷段电j价
     * @param valleyPrice 待设置的属性谷段电j价的值
     */
    public void setValleyPrice(double valleyPrice){
        this.valleyPrice = valleyPrice;
    }

    /**
     * 获取属性谷段电j价
     * @return 属性谷段电j价的值
     */
    public double getValleyPrice(){
        return valleyPrice;
    }

    /**
     * 设置属性峰段电费
     * @param peakFee 待设置的属性峰段电费的值
     */
    public void setPeakFee(double peakFee){
        this.peakFee = peakFee;
    }

    /**
     * 获取属性峰段电费
     * @return 属性峰段电费的值
     */
    public double getPeakFee(){
        return peakFee;
    }

    /**
     * 设置属性古段电费
     * @param valleyFee 待设置的属性古段电费的值
     */
    public void setValleyFee(double valleyFee){
        this.valleyFee = valleyFee;
    }

    /**
     * 获取属性古段电费
     * @return 属性古段电费的值
     */
    public double getValleyFee(){
        return valleyFee;
    }

    /**
     * 设置属性变损电量
     * @param lossQuantity 待设置的属性变损电量的值
     */
    public void setLossQuantity(double lossQuantity){
        this.lossQuantity = lossQuantity;
    }

    /**
     * 获取属性变损电量
     * @return 属性变损电量的值
     */
    public double getLossQuantity(){
        return lossQuantity;
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
     * 设置属性电费合计
     * @param sumFee 待设置的属性电费合计的值
     */
    public void setSumFee(double sumFee){
        this.sumFee = sumFee;
    }

    /**
     * 获取属性电费合计
     * @return 属性电费合计的值
     */
    public double getSumFee(){
        return sumFee;
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
     * 设置属性抄见电量
     * @param sumPointerQuantity 待设置的属性抄见电量的值
     */
    public void setSumPointerQuantity(double sumPointerQuantity){
        this.sumPointerQuantity = sumPointerQuantity;
    }

    /**
     * 获取属性抄见电量
     * @return 属性抄见电量的值
     */
    public double getSumPointerQuantity(){
        return sumPointerQuantity;
    }

    /**
     * 设置属性电量类型
     * @param quantityStyle 待设置的属性电量类型的值
     */
    public void setQuantityStyle(String quantityStyle){
        this.quantityStyle = StringUtils.rightTrim(quantityStyle);
    }

    /**
     * 获取属性电量类型
     * @return 属性电量类型的值
     */
    public String getQuantityStyle(){
        return quantityStyle;
    }

    /**
     * 设置属性改变前电价
     * @param beforPrice 待设置的属性改变前电价的值
     */
    public void setBeforPrice(double beforPrice){
        this.beforPrice = beforPrice;
    }

    /**
     * 获取属性改变前电价
     * @return 属性改变前电价的值
     */
    public double getBeforPrice(){
        return beforPrice;
    }

    /**
     * 设置属性改变后电价
     * @param lastPrice 待设置的属性改变后电价的值
     */
    public void setLastPrice(double lastPrice){
        this.lastPrice = lastPrice;
    }

    /**
     * 获取属性改变后电价
     * @return 属性改变后电价的值
     */
    public double getLastPrice(){
        return lastPrice;
    }

    /**
     * 设置属性改变前电量
     * @param beforPower 待设置的属性改变前电量的值
     */
    public void setBeforPower(double beforPower){
        this.beforPower = beforPower;
    }

    /**
     * 获取属性改变前电量
     * @return 属性改变前电量的值
     */
    public double getBeforPower(){
        return beforPower;
    }

    /**
     * 设置属性改变后电量
     * @param lastPower 待设置的属性改变后电量的值
     */
    public void setLastPower(double lastPower){
        this.lastPower = lastPower;
    }

    /**
     * 获取属性改变后电量
     * @return 属性改变后电量的值
     */
    public double getLastPower(){
        return lastPower;
    }

    /**
     * 设置属性改变前电费
     * @param beforFee 待设置的属性改变前电费的值
     */
    public void setBeforFee(double beforFee){
        this.beforFee = beforFee;
    }

    /**
     * 获取属性改变前电费
     * @return 属性改变前电费的值
     */
    public double getBeforFee(){
        return beforFee;
    }

    /**
     * 设置属性改变后电费
     * @param lastFee 待设置的属性改变后电费的值
     */
    public void setLastFee(double lastFee){
        this.lastFee = lastFee;
    }

    /**
     * 获取属性改变后电费
     * @return 属性改变后电费的值
     */
    public double getLastFee(){
        return lastFee;
    }

    /**
     * 设置属性是否发生改变
     * @param ifchange 待设置的属性是否发生改变的值
     */
    public void setIfchange(String ifchange){
        this.ifchange = StringUtils.rightTrim(ifchange);
    }

    /**
     * 获取属性是否发生改变
     * @return 属性是否发生改变的值
     */
    public String getIfchange(){
        return ifchange;
    }

    /**
     * 设置属性需量指针
     * @param needPointer 待设置的属性需量指针的值
     */
    public void setNeedPointer(double needPointer){
        this.needPointer = needPointer;
    }

    /**
     * 获取属性需量指针
     * @return 属性需量指针的值
     */
    public double getNeedPointer(){
        return needPointer;
    }

    /**
     * 设置属性有功线损电量
     * @param lineLoss 待设置的属性有功线损电量的值
     */
    public void setLineLoss(double lineLoss){
        this.lineLoss = lineLoss;
    }

    /**
     * 获取属性有功线损电量
     * @return 属性有功线损电量的值
     */
    public double getLineLoss(){
        return lineLoss;
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

    /**
     * 设置属性无功变损电量
     * @param unLossQuantity 待设置的属性无功变损电量的值
     */
    public void setUnLossQuantity(double unLossQuantity){
        this.unLossQuantity = unLossQuantity;
    }

    /**
     * 获取属性无功变损电量
     * @return 属性无功变损电量的值
     */
    public double getUnLossQuantity(){
        return unLossQuantity;
    }
}
