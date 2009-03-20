package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWPowerFeeFaxing-电费电量发行表的数据传输对象基类<br>
 */
public class LwPowerFeeFaxingDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性户名 */
    private String userName = "";
    /** 属性统计年月 */
    private String statMonth = "";
    /** 属性统计方式 */
    private String statStyle = "";
    /** 属性录入日期 */
    private String inputDate = "";
    /** 属性电量 */
    private long quantity = 0L;
    /** 属性电费 */
    private double purePowerFee = 0D;
    /** 属性电费税 */
    private double powerFeeTax = 0D;
    /** 属性三峡 */
    private double sanXiaFee = 0D;
    /** 属性三峡税 */
    private double sanXiaTax = 0D;
    /** 属性电金 */
    private double pureDianJin = 0D;
    /** 属性电金税 */
    private double dianJinTax = 0D;
    /** 属性基金 */
    private double pureJiJin = 0D;
    /** 属性基金税 */
    private double jiJinTax = 0D;
    /** 属性差别电费 */
    private double chaBieFee = 0D;
    /** 属性差别电费税 */
    private double chaBieTax = 0D;
    /** 属性总计 */
    private double sumFee = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwPowerFeeFaxingDtoBase对象
     */
    public LwPowerFeeFaxingDtoBase(){
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
     * 设置属性统计方式
     * @param statStyle 待设置的属性统计方式的值
     */
    public void setStatStyle(String statStyle){
        this.statStyle = StringUtils.rightTrim(statStyle);
    }

    /**
     * 获取属性统计方式
     * @return 属性统计方式的值
     */
    public String getStatStyle(){
        return statStyle;
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
     * 设置属性电量
     * @param quantity 待设置的属性电量的值
     */
    public void setQuantity(long quantity){
        this.quantity = quantity;
    }

    /**
     * 获取属性电量
     * @return 属性电量的值
     */
    public long getQuantity(){
        return quantity;
    }

    /**
     * 设置属性电费
     * @param purePowerFee 待设置的属性电费的值
     */
    public void setPurePowerFee(double purePowerFee){
        this.purePowerFee = purePowerFee;
    }

    /**
     * 获取属性电费
     * @return 属性电费的值
     */
    public double getPurePowerFee(){
        return purePowerFee;
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
     * 设置属性三峡税
     * @param sanXiaTax 待设置的属性三峡税的值
     */
    public void setSanXiaTax(double sanXiaTax){
        this.sanXiaTax = sanXiaTax;
    }

    /**
     * 获取属性三峡税
     * @return 属性三峡税的值
     */
    public double getSanXiaTax(){
        return sanXiaTax;
    }

    /**
     * 设置属性电金
     * @param pureDianJin 待设置的属性电金的值
     */
    public void setPureDianJin(double pureDianJin){
        this.pureDianJin = pureDianJin;
    }

    /**
     * 获取属性电金
     * @return 属性电金的值
     */
    public double getPureDianJin(){
        return pureDianJin;
    }

    /**
     * 设置属性电金税
     * @param dianJinTax 待设置的属性电金税的值
     */
    public void setDianJinTax(double dianJinTax){
        this.dianJinTax = dianJinTax;
    }

    /**
     * 获取属性电金税
     * @return 属性电金税的值
     */
    public double getDianJinTax(){
        return dianJinTax;
    }

    /**
     * 设置属性基金
     * @param pureJiJin 待设置的属性基金的值
     */
    public void setPureJiJin(double pureJiJin){
        this.pureJiJin = pureJiJin;
    }

    /**
     * 获取属性基金
     * @return 属性基金的值
     */
    public double getPureJiJin(){
        return pureJiJin;
    }

    /**
     * 设置属性基金税
     * @param jiJinTax 待设置的属性基金税的值
     */
    public void setJiJinTax(double jiJinTax){
        this.jiJinTax = jiJinTax;
    }

    /**
     * 获取属性基金税
     * @return 属性基金税的值
     */
    public double getJiJinTax(){
        return jiJinTax;
    }

    /**
     * 设置属性差别电费
     * @param chaBieFee 待设置的属性差别电费的值
     */
    public void setChaBieFee(double chaBieFee){
        this.chaBieFee = chaBieFee;
    }

    /**
     * 获取属性差别电费
     * @return 属性差别电费的值
     */
    public double getChaBieFee(){
        return chaBieFee;
    }

    /**
     * 设置属性差别电费税
     * @param chaBieTax 待设置的属性差别电费税的值
     */
    public void setChaBieTax(double chaBieTax){
        this.chaBieTax = chaBieTax;
    }

    /**
     * 获取属性差别电费税
     * @return 属性差别电费税的值
     */
    public double getChaBieTax(){
        return chaBieTax;
    }

    /**
     * 设置属性总计
     * @param sumFee 待设置的属性总计的值
     */
    public void setSumFee(double sumFee){
        this.sumFee = sumFee;
    }

    /**
     * 获取属性总计
     * @return 属性总计的值
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
}
