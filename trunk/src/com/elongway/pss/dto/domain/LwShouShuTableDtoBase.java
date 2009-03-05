package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwShouShuTable-手输费用表的数据传输对象基类<br>
 */
public class LwShouShuTableDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性月份 */
    private String month = "";
    /** 属性费用类别 */
    private String feeType = "";
    /** 属性附加3 */
    private double extends3 = 0D;
    /** 属性附加2 */
    private double extends2 = 0D;
    /** 属性电量 */
    private double power = 0D;
    /** 属性纯电费 */
    private double chunDianFei = 0D;
    /** 属性电费税 */
    private double dianFeiTax = 0D;
    /** 属性合计 */
    private double sumDianFee = 0D;
    /** 属性差别电费 */
    private double diffrentFei = 0D;
    /** 属性差别电费税 */
    private double diffrentFeiTax = 0D;
    /** 属性电金 */
    private double dianJin = 0D;
    /** 属性电金税 */
    private double dianJinTax = 0D;
    /** 属性基金 */
    private double jijin = 0D;
    /** 属性基金税 */
    private double jinjinTax = 0D;
    /** 属性三峡 */
    private double sanXia = 0D;
    /** 属性三峡税 */
    private double sanXiaTax = 0D;
    /** 属性总计 */
    private double sumFee = 0D;
    /** 属性附加1 */
    private double extends1 = 0D;

    /**
     *  默认构造方法,构造一个默认的LwShouShuTableDtoBase对象
     */
    public LwShouShuTableDtoBase(){
    }

    /**
     * 设置属性月份
     * @param month 待设置的属性月份的值
     */
    public void setMonth(String month){
        this.month = StringUtils.rightTrim(month);
    }

    /**
     * 获取属性月份
     * @return 属性月份的值
     */
    public String getMonth(){
        return month;
    }

    /**
     * 设置属性费用类别
     * @param feeType 待设置的属性费用类别的值
     */
    public void setFeeType(String feeType){
        this.feeType = StringUtils.rightTrim(feeType);
    }

    /**
     * 获取属性费用类别
     * @return 属性费用类别的值
     */
    public String getFeeType(){
        return feeType;
    }

    /**
     * 设置属性附加3
     * @param extends3 待设置的属性附加3的值
     */
    public void setExtends3(double extends3){
        this.extends3 = extends3;
    }

    /**
     * 获取属性附加3
     * @return 属性附加3的值
     */
    public double getExtends3(){
        return extends3;
    }

    /**
     * 设置属性附加2
     * @param extends2 待设置的属性附加2的值
     */
    public void setExtends2(double extends2){
        this.extends2 = extends2;
    }

    /**
     * 获取属性附加2
     * @return 属性附加2的值
     */
    public double getExtends2(){
        return extends2;
    }

    /**
     * 设置属性电量
     * @param power 待设置的属性电量的值
     */
    public void setPower(double power){
        this.power = power;
    }

    /**
     * 获取属性电量
     * @return 属性电量的值
     */
    public double getPower(){
        return power;
    }

    /**
     * 设置属性纯电费
     * @param chunDianFei 待设置的属性纯电费的值
     */
    public void setChunDianFei(double chunDianFei){
        this.chunDianFei = chunDianFei;
    }

    /**
     * 获取属性纯电费
     * @return 属性纯电费的值
     */
    public double getChunDianFei(){
        return chunDianFei;
    }

    /**
     * 设置属性电费税
     * @param dianFeiTax 待设置的属性电费税的值
     */
    public void setDianFeiTax(double dianFeiTax){
        this.dianFeiTax = dianFeiTax;
    }

    /**
     * 获取属性电费税
     * @return 属性电费税的值
     */
    public double getDianFeiTax(){
        return dianFeiTax;
    }

    /**
     * 设置属性合计
     * @param sumDianFee 待设置的属性合计的值
     */
    public void setSumDianFee(double sumDianFee){
        this.sumDianFee = sumDianFee;
    }

    /**
     * 获取属性合计
     * @return 属性合计的值
     */
    public double getSumDianFee(){
        return sumDianFee;
    }

    /**
     * 设置属性差别电费
     * @param diffrentFei 待设置的属性差别电费的值
     */
    public void setDiffrentFei(double diffrentFei){
        this.diffrentFei = diffrentFei;
    }

    /**
     * 获取属性差别电费
     * @return 属性差别电费的值
     */
    public double getDiffrentFei(){
        return diffrentFei;
    }

    /**
     * 设置属性差别电费税
     * @param diffrentFeiTax 待设置的属性差别电费税的值
     */
    public void setDiffrentFeiTax(double diffrentFeiTax){
        this.diffrentFeiTax = diffrentFeiTax;
    }

    /**
     * 获取属性差别电费税
     * @return 属性差别电费税的值
     */
    public double getDiffrentFeiTax(){
        return diffrentFeiTax;
    }

    /**
     * 设置属性电金
     * @param dianJin 待设置的属性电金的值
     */
    public void setDianJin(double dianJin){
        this.dianJin = dianJin;
    }

    /**
     * 获取属性电金
     * @return 属性电金的值
     */
    public double getDianJin(){
        return dianJin;
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
     * @param jijin 待设置的属性基金的值
     */
    public void setJijin(double jijin){
        this.jijin = jijin;
    }

    /**
     * 获取属性基金
     * @return 属性基金的值
     */
    public double getJijin(){
        return jijin;
    }

    /**
     * 设置属性基金税
     * @param jinjinTax 待设置的属性基金税的值
     */
    public void setJinjinTax(double jinjinTax){
        this.jinjinTax = jinjinTax;
    }

    /**
     * 获取属性基金税
     * @return 属性基金税的值
     */
    public double getJinjinTax(){
        return jinjinTax;
    }

    /**
     * 设置属性三峡
     * @param sanXia 待设置的属性三峡的值
     */
    public void setSanXia(double sanXia){
        this.sanXia = sanXia;
    }

    /**
     * 获取属性三峡
     * @return 属性三峡的值
     */
    public double getSanXia(){
        return sanXia;
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
     * 设置属性附加1
     * @param extends1 待设置的属性附加1的值
     */
    public void setExtends1(double extends1){
        this.extends1 = extends1;
    }

    /**
     * 获取属性附加1
     * @return 属性附加1的值
     */
    public double getExtends1(){
        return extends1;
    }
}
