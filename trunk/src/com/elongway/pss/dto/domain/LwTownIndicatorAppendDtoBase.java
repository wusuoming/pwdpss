package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownIndicatorAppend-直供乡追加电费指针记录表的数据传输对象基类<br>
 */
public class LwTownIndicatorAppendDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性户名 */
    private String userName = "";
    /** 属性地址 */
    private String address = "";
    /** 属性抄表日期 */
    private String readDate = "";
    /** 属性统计日期 */
    private String statMonth = "";
    /** 属性当月有功指针数 */
    private double thisWorkNum = 0D;
    /** 属性月中抄表指针 */
    private double midWorkNum = 0D;
    /** 属性上月有功指针数 */
    private double lastWorkNum = 0D;
    /** 属性倍率 */
    private double rate = 0D;
    /** 属性追加电量 */
    private double readQuantity = 0D;
    /** 属性居民电价 */
    private double peoplePrice = 0D;
    /** 属性非居民电价 */
    private double notPeoplePrice = 0D;
    /** 属性农灌电价 */
    private double farmPrice = 0D;
    /** 属性生产电价 */
    private double producePrice = 0D;
    /** 属性商业电价 */
    private double businessPrice = 0D;
    /** 属性电压等级 */
    private int voltlevel = 0;
    /** 属性非普工业 */
    private double industryPrice = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性追加日期 */
    private String appendDate = "";

    /**
     *  默认构造方法,构造一个默认的LwTownIndicatorAppendDtoBase对象
     */
    public LwTownIndicatorAppendDtoBase(){
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
     * 设置属性户名
     * @param userName 待设置的属性户名的值
     */
    public void setUserName(String userName){
        this.userName = StringUtils.rightTrim(userName);
    }

    /**
     * 获取属性户名
     * @return 属性户名的值
     */
    public String getUserName(){
        return userName;
    }

    /**
     * 设置属性地址
     * @param address 待设置的属性地址的值
     */
    public void setAddress(String address){
        this.address = StringUtils.rightTrim(address);
    }

    /**
     * 获取属性地址
     * @return 属性地址的值
     */
    public String getAddress(){
        return address;
    }

    /**
     * 设置属性抄表日期
     * @param readDate 待设置的属性抄表日期的值
     */
    public void setReadDate(String readDate){
        this.readDate = StringUtils.rightTrim(readDate);
    }

    /**
     * 获取属性抄表日期
     * @return 属性抄表日期的值
     */
    public String getReadDate(){
        return readDate;
    }

    /**
     * 设置属性统计日期
     * @param statMonth 待设置的属性统计日期的值
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * 获取属性统计日期
     * @return 属性统计日期的值
     */
    public String getStatMonth(){
        return statMonth;
    }

    /**
     * 设置属性当月有功指针数
     * @param thisWorkNum 待设置的属性当月有功指针数的值
     */
    public void setThisWorkNum(double thisWorkNum){
        this.thisWorkNum = thisWorkNum;
    }

    /**
     * 获取属性当月有功指针数
     * @return 属性当月有功指针数的值
     */
    public double getThisWorkNum(){
        return thisWorkNum;
    }

    /**
     * 设置属性月中抄表指针
     * @param midWorkNum 待设置的属性月中抄表指针的值
     */
    public void setMidWorkNum(double midWorkNum){
        this.midWorkNum = midWorkNum;
    }

    /**
     * 获取属性月中抄表指针
     * @return 属性月中抄表指针的值
     */
    public double getMidWorkNum(){
        return midWorkNum;
    }

    /**
     * 设置属性上月有功指针数
     * @param lastWorkNum 待设置的属性上月有功指针数的值
     */
    public void setLastWorkNum(double lastWorkNum){
        this.lastWorkNum = lastWorkNum;
    }

    /**
     * 获取属性上月有功指针数
     * @return 属性上月有功指针数的值
     */
    public double getLastWorkNum(){
        return lastWorkNum;
    }

    /**
     * 设置属性倍率
     * @param rate 待设置的属性倍率的值
     */
    public void setRate(double rate){
        this.rate = rate;
    }

    /**
     * 获取属性倍率
     * @return 属性倍率的值
     */
    public double getRate(){
        return rate;
    }

    /**
     * 设置属性追加电量
     * @param readQuantity 待设置的属性追加电量的值
     */
    public void setReadQuantity(double readQuantity){
        this.readQuantity = readQuantity;
    }

    /**
     * 获取属性追加电量
     * @return 属性追加电量的值
     */
    public double getReadQuantity(){
        return readQuantity;
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
     * 设置属性生产电价
     * @param producePrice 待设置的属性生产电价的值
     */
    public void setProducePrice(double producePrice){
        this.producePrice = producePrice;
    }

    /**
     * 获取属性生产电价
     * @return 属性生产电价的值
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
     * 设置属性电压等级
     * @param voltlevel 待设置的属性电压等级的值
     */
    public void setVoltlevel(int voltlevel){
        this.voltlevel = voltlevel;
    }

    /**
     * 获取属性电压等级
     * @return 属性电压等级的值
     */
    public int getVoltlevel(){
        return voltlevel;
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

    /**
     * 设置属性追加日期
     * @param appendDate 待设置的属性追加日期的值
     */
    public void setAppendDate(String appendDate){
        this.appendDate = StringUtils.rightTrim(appendDate);
    }

    /**
     * 获取属性追加日期
     * @return 属性追加日期的值
     */
    public String getAppendDate(){
        return appendDate;
    }
}
