package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownGouDianFaxing-直供乡购电结算单的数据传输对象基类<br>
 */
public class LwTownGouDianFaxingDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性乡镇代码 */
    private String townCode = "";
    /** 属性乡镇名称 */
    private String townName = "";
    /** 属性发行年月 */
    private String statMonth = "";
    /** 属性售电量 */
    private double powerQuantity = 0D;
    /** 属性纯电费 */
    private double pureFee = 0D;
    /** 属性电费税 */
    private double powerFeeTax = 0D;
    /** 属性电金 */
    private double pureDianJin = 0D;
    /** 属性电金税 */
    private double dianJinTax = 0D;
    /** 属性三峡 */
    private double pureSanXia = 0D;
    /** 属性三峡税 */
    private double sanXiaTax = 0D;
    /** 属性基金 */
    private double pureJiJin = 0D;
    /** 属性基金税 */
    private double jiJinTax = 0D;
    /** 属性总计 */
    private double sumFee = 0D;
    /** 属性有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwTownGouDianFaxingDtoBase对象
     */
    public LwTownGouDianFaxingDtoBase(){
    }

    /**
     * 设置属性乡镇代码
     * @param townCode 待设置的属性乡镇代码的值
     */
    public void setTownCode(String townCode){
        this.townCode = StringUtils.rightTrim(townCode);
    }

    /**
     * 获取属性乡镇代码
     * @return 属性乡镇代码的值
     */
    public String getTownCode(){
        return townCode;
    }

    /**
     * 设置属性乡镇名称
     * @param townName 待设置的属性乡镇名称的值
     */
    public void setTownName(String townName){
        this.townName = StringUtils.rightTrim(townName);
    }

    /**
     * 获取属性乡镇名称
     * @return 属性乡镇名称的值
     */
    public String getTownName(){
        return townName;
    }

    /**
     * 设置属性发行年月
     * @param statMonth 待设置的属性发行年月的值
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * 获取属性发行年月
     * @return 属性发行年月的值
     */
    public String getStatMonth(){
        return statMonth;
    }

    /**
     * 设置属性售电量
     * @param powerQuantity 待设置的属性售电量的值
     */
    public void setPowerQuantity(double powerQuantity){
        this.powerQuantity = powerQuantity;
    }

    /**
     * 获取属性售电量
     * @return 属性售电量的值
     */
    public double getPowerQuantity(){
        return powerQuantity;
    }

    /**
     * 设置属性纯电费
     * @param pureFee 待设置的属性纯电费的值
     */
    public void setPureFee(double pureFee){
        this.pureFee = pureFee;
    }

    /**
     * 获取属性纯电费
     * @return 属性纯电费的值
     */
    public double getPureFee(){
        return pureFee;
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
     * 设置属性三峡
     * @param pureSanXia 待设置的属性三峡的值
     */
    public void setPureSanXia(double pureSanXia){
        this.pureSanXia = pureSanXia;
    }

    /**
     * 获取属性三峡
     * @return 属性三峡的值
     */
    public double getPureSanXia(){
        return pureSanXia;
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
     * 设置属性有效
     * @param validStatus 待设置的属性有效的值
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * 获取属性有效
     * @return 属性有效的值
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
