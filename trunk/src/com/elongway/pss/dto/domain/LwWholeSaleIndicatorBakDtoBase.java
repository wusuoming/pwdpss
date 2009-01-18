package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleIndicatorBak-趸售电表指针记录备份表的数据传输对象基类<br>
 */
public class LwWholeSaleIndicatorBakDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性帐期 */
    private String statMonth = "";
    /** 属性上月有功指针数 */
    private double lastWorkNum = 0D;
    /** 属性当月有功指针数 */
    private double thisWorkNum = 0D;
    /** 属性上月无功指针数 */
    private double lastIdleNum = 0D;
    /** 属性当月无功指针数 */
    private double thisIdleNum = 0D;
    /** 属性倍率 */
    private double rate = 0D;
    /** 属性抄见电量 */
    private double readQuantity = 0D;
    /** 属性异常电量 */
    private double excepQuantity = 0D;
    /** 属性换表电量 */
    private double chgAmmeterQuantity = 0D;
    /** 属性退补无功电量 */
    private double unCompensateQuantity = 0D;
    /** 属性退补有功电量 */
    private double compensateQuantity = 0D;
    /** 属性无功线损电量 */
    private double unLineLossQuantity = 0D;
    /** 属性有功线损电量 */
    private double lineLossQuantity = 0D;
    /** 属性无功变损电量 */
    private double unTransLossQuantity = 0D;
    /** 属性有功变损电量 */
    private double transLossQuantity = 0D;
    /** 属性有功电量 */
    private String workQuantity = "";
    /** 属性无功电量 */
    private String unworkQuantity = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性录入日期 */
    private String inputDate = "";
    /** 属性抄表日期 */
    private String readDate = "";
    /** 属性线损比例 */
    private double lossRate = 0D;
    /** 属性功率因素 */
    private double powerCode = 0D;
    /** 属性换表无功电量 */
    private double unChgAmmeterQuantity = 0D;
    /** 属性是否算费 */
    private String ifCal = "";
    /** 属性差别电量 */
    private String differenceQuantity = "";

    /**
     *  默认构造方法,构造一个默认的LwWholeSaleIndicatorBakDtoBase对象
     */
    public LwWholeSaleIndicatorBakDtoBase(){
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
     * 设置属性帐期
     * @param statMonth 待设置的属性帐期的值
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * 获取属性帐期
     * @return 属性帐期的值
     */
    public String getStatMonth(){
        return statMonth;
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
     * 设置属性上月无功指针数
     * @param lastIdleNum 待设置的属性上月无功指针数的值
     */
    public void setLastIdleNum(double lastIdleNum){
        this.lastIdleNum = lastIdleNum;
    }

    /**
     * 获取属性上月无功指针数
     * @return 属性上月无功指针数的值
     */
    public double getLastIdleNum(){
        return lastIdleNum;
    }

    /**
     * 设置属性当月无功指针数
     * @param thisIdleNum 待设置的属性当月无功指针数的值
     */
    public void setThisIdleNum(double thisIdleNum){
        this.thisIdleNum = thisIdleNum;
    }

    /**
     * 获取属性当月无功指针数
     * @return 属性当月无功指针数的值
     */
    public double getThisIdleNum(){
        return thisIdleNum;
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
     * 设置属性抄见电量
     * @param readQuantity 待设置的属性抄见电量的值
     */
    public void setReadQuantity(double readQuantity){
        this.readQuantity = readQuantity;
    }

    /**
     * 获取属性抄见电量
     * @return 属性抄见电量的值
     */
    public double getReadQuantity(){
        return readQuantity;
    }

    /**
     * 设置属性异常电量
     * @param excepQuantity 待设置的属性异常电量的值
     */
    public void setExcepQuantity(double excepQuantity){
        this.excepQuantity = excepQuantity;
    }

    /**
     * 获取属性异常电量
     * @return 属性异常电量的值
     */
    public double getExcepQuantity(){
        return excepQuantity;
    }

    /**
     * 设置属性换表电量
     * @param chgAmmeterQuantity 待设置的属性换表电量的值
     */
    public void setChgAmmeterQuantity(double chgAmmeterQuantity){
        this.chgAmmeterQuantity = chgAmmeterQuantity;
    }

    /**
     * 获取属性换表电量
     * @return 属性换表电量的值
     */
    public double getChgAmmeterQuantity(){
        return chgAmmeterQuantity;
    }

    /**
     * 设置属性退补无功电量
     * @param unCompensateQuantity 待设置的属性退补无功电量的值
     */
    public void setUnCompensateQuantity(double unCompensateQuantity){
        this.unCompensateQuantity = unCompensateQuantity;
    }

    /**
     * 获取属性退补无功电量
     * @return 属性退补无功电量的值
     */
    public double getUnCompensateQuantity(){
        return unCompensateQuantity;
    }

    /**
     * 设置属性退补有功电量
     * @param compensateQuantity 待设置的属性退补有功电量的值
     */
    public void setCompensateQuantity(double compensateQuantity){
        this.compensateQuantity = compensateQuantity;
    }

    /**
     * 获取属性退补有功电量
     * @return 属性退补有功电量的值
     */
    public double getCompensateQuantity(){
        return compensateQuantity;
    }

    /**
     * 设置属性无功线损电量
     * @param unLineLossQuantity 待设置的属性无功线损电量的值
     */
    public void setUnLineLossQuantity(double unLineLossQuantity){
        this.unLineLossQuantity = unLineLossQuantity;
    }

    /**
     * 获取属性无功线损电量
     * @return 属性无功线损电量的值
     */
    public double getUnLineLossQuantity(){
        return unLineLossQuantity;
    }

    /**
     * 设置属性有功线损电量
     * @param lineLossQuantity 待设置的属性有功线损电量的值
     */
    public void setLineLossQuantity(double lineLossQuantity){
        this.lineLossQuantity = lineLossQuantity;
    }

    /**
     * 获取属性有功线损电量
     * @return 属性有功线损电量的值
     */
    public double getLineLossQuantity(){
        return lineLossQuantity;
    }

    /**
     * 设置属性无功变损电量
     * @param unTransLossQuantity 待设置的属性无功变损电量的值
     */
    public void setUnTransLossQuantity(double unTransLossQuantity){
        this.unTransLossQuantity = unTransLossQuantity;
    }

    /**
     * 获取属性无功变损电量
     * @return 属性无功变损电量的值
     */
    public double getUnTransLossQuantity(){
        return unTransLossQuantity;
    }

    /**
     * 设置属性有功变损电量
     * @param transLossQuantity 待设置的属性有功变损电量的值
     */
    public void setTransLossQuantity(double transLossQuantity){
        this.transLossQuantity = transLossQuantity;
    }

    /**
     * 获取属性有功变损电量
     * @return 属性有功变损电量的值
     */
    public double getTransLossQuantity(){
        return transLossQuantity;
    }

    /**
     * 设置属性有功电量
     * @param workQuantity 待设置的属性有功电量的值
     */
    public void setWorkQuantity(String workQuantity){
        this.workQuantity = StringUtils.rightTrim(workQuantity);
    }

    /**
     * 获取属性有功电量
     * @return 属性有功电量的值
     */
    public String getWorkQuantity(){
        return workQuantity;
    }

    /**
     * 设置属性无功电量
     * @param unworkQuantity 待设置的属性无功电量的值
     */
    public void setUnworkQuantity(String unworkQuantity){
        this.unworkQuantity = StringUtils.rightTrim(unworkQuantity);
    }

    /**
     * 获取属性无功电量
     * @return 属性无功电量的值
     */
    public String getUnworkQuantity(){
        return unworkQuantity;
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
     * 设置属性线损比例
     * @param lossRate 待设置的属性线损比例的值
     */
    public void setLossRate(double lossRate){
        this.lossRate = lossRate;
    }

    /**
     * 获取属性线损比例
     * @return 属性线损比例的值
     */
    public double getLossRate(){
        return lossRate;
    }

    /**
     * 设置属性功率因素
     * @param powerCode 待设置的属性功率因素的值
     */
    public void setPowerCode(double powerCode){
        this.powerCode = powerCode;
    }

    /**
     * 获取属性功率因素
     * @return 属性功率因素的值
     */
    public double getPowerCode(){
        return powerCode;
    }

    /**
     * 设置属性换表无功电量
     * @param unChgAmmeterQuantity 待设置的属性换表无功电量的值
     */
    public void setUnChgAmmeterQuantity(double unChgAmmeterQuantity){
        this.unChgAmmeterQuantity = unChgAmmeterQuantity;
    }

    /**
     * 获取属性换表无功电量
     * @return 属性换表无功电量的值
     */
    public double getUnChgAmmeterQuantity(){
        return unChgAmmeterQuantity;
    }

    /**
     * 设置属性是否算费
     * @param ifCal 待设置的属性是否算费的值
     */
    public void setIfCal(String ifCal){
        this.ifCal = StringUtils.rightTrim(ifCal);
    }

    /**
     * 获取属性是否算费
     * @return 属性是否算费的值
     */
    public String getIfCal(){
        return ifCal;
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
}
