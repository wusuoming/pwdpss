package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是Transfor-变压器信息的数据传输对象基类<br>
 */
public class TransforDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性变压器名称 */
    private String transforName = "";
    /** 属性电话 */
    private String phone = "";
    /** 属性变压器空载损耗 */
    private double kongzaiLoss = 0D;
    /** 属性连续供电时间 */
    private double suplyHour = 0D;
    /** 属性额定容量短路损耗 */
    private double duanluLoss = 0D;
    /** 属性额定容量 */
    private double contentPower = 0D;
    /** 属性用电时间 */
    private double useHour = 0D;
    /** 属性空载电流 */
    private double kongzaiCT = 0D;
    /** 属性短路电压 */
    private double duanluPT = 0D;
    /** 属性有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";

    /**
     *  默认构造方法,构造一个默认的TransforDtoBase对象
     */
    public TransforDtoBase(){
    }

    /**
     * 设置属性变压器名称
     * @param transforName 待设置的属性变压器名称的值
     */
    public void setTransforName(String transforName){
        this.transforName = StringUtils.rightTrim(transforName);
    }

    /**
     * 获取属性变压器名称
     * @return 属性变压器名称的值
     */
    public String getTransforName(){
        return transforName;
    }

    /**
     * 设置属性电话
     * @param phone 待设置的属性电话的值
     */
    public void setPhone(String phone){
        this.phone = StringUtils.rightTrim(phone);
    }

    /**
     * 获取属性电话
     * @return 属性电话的值
     */
    public String getPhone(){
        return phone;
    }

    /**
     * 设置属性变压器空载损耗
     * @param kongzaiLoss 待设置的属性变压器空载损耗的值
     */
    public void setKongzaiLoss(double kongzaiLoss){
        this.kongzaiLoss = kongzaiLoss;
    }

    /**
     * 获取属性变压器空载损耗
     * @return 属性变压器空载损耗的值
     */
    public double getKongzaiLoss(){
        return kongzaiLoss;
    }

    /**
     * 设置属性连续供电时间
     * @param suplyHour 待设置的属性连续供电时间的值
     */
    public void setSuplyHour(double suplyHour){
        this.suplyHour = suplyHour;
    }

    /**
     * 获取属性连续供电时间
     * @return 属性连续供电时间的值
     */
    public double getSuplyHour(){
        return suplyHour;
    }

    /**
     * 设置属性额定容量短路损耗
     * @param duanluLoss 待设置的属性额定容量短路损耗的值
     */
    public void setDuanluLoss(double duanluLoss){
        this.duanluLoss = duanluLoss;
    }

    /**
     * 获取属性额定容量短路损耗
     * @return 属性额定容量短路损耗的值
     */
    public double getDuanluLoss(){
        return duanluLoss;
    }

    /**
     * 设置属性额定容量
     * @param contentPower 待设置的属性额定容量的值
     */
    public void setContentPower(double contentPower){
        this.contentPower = contentPower;
    }

    /**
     * 获取属性额定容量
     * @return 属性额定容量的值
     */
    public double getContentPower(){
        return contentPower;
    }

    /**
     * 设置属性用电时间
     * @param useHour 待设置的属性用电时间的值
     */
    public void setUseHour(double useHour){
        this.useHour = useHour;
    }

    /**
     * 获取属性用电时间
     * @return 属性用电时间的值
     */
    public double getUseHour(){
        return useHour;
    }

    /**
     * 设置属性空载电流
     * @param kongzaiCT 待设置的属性空载电流的值
     */
    public void setKongzaiCT(double kongzaiCT){
        this.kongzaiCT = kongzaiCT;
    }

    /**
     * 获取属性空载电流
     * @return 属性空载电流的值
     */
    public double getKongzaiCT(){
        return kongzaiCT;
    }

    /**
     * 设置属性短路电压
     * @param duanluPT 待设置的属性短路电压的值
     */
    public void setDuanluPT(double duanluPT){
        this.duanluPT = duanluPT;
    }

    /**
     * 获取属性短路电压
     * @return 属性短路电压的值
     */
    public double getDuanluPT(){
        return duanluPT;
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
}
