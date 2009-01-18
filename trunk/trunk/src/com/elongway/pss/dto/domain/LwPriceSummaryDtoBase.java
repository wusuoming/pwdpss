package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWPriceSummary-电费计算总表的数据传输对象基类<br>
 */
public class LwPriceSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性线路代码 */
    private String lineCode = "";
    /** 属性统计年月 */
    private String statMonth = "";
    /** 属性用电分类 */
    private String powerClass = "";
    /** 属性电量 */
    private double electricQuantity = 0D;
    /** 属性电费 */
    private double electricFee = 0D;
    /** 属性电金 */
    private double loan = 0D;
    /** 属性三峡 */
    private double sanXiaFee = 0D;
    /** 属性基金 */
    private double surcharge = 0D;
    /** 属性合计 */
    private double sumFee = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwPriceSummaryDtoBase对象
     */
    public LwPriceSummaryDtoBase(){
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
     * 设置属性电量
     * @param electricQuantity 待设置的属性电量的值
     */
    public void setElectricQuantity(double electricQuantity){
        this.electricQuantity = electricQuantity;
    }

    /**
     * 获取属性电量
     * @return 属性电量的值
     */
    public double getElectricQuantity(){
        return electricQuantity;
    }

    /**
     * 设置属性电费
     * @param electricFee 待设置的属性电费的值
     */
    public void setElectricFee(double electricFee){
        this.electricFee = electricFee;
    }

    /**
     * 获取属性电费
     * @return 属性电费的值
     */
    public double getElectricFee(){
        return electricFee;
    }

    /**
     * 设置属性电金
     * @param loan 待设置的属性电金的值
     */
    public void setLoan(double loan){
        this.loan = loan;
    }

    /**
     * 获取属性电金
     * @return 属性电金的值
     */
    public double getLoan(){
        return loan;
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
}
