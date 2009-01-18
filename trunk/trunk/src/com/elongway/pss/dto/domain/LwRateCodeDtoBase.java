package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWRateCode-调整率维护表的数据传输对象基类<br>
 */
public class LwRateCodeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性功率因数 */
    private String powerFactor = "";
    /** 属性无功/有功比率上限 */
    private double upPowerRate = 0D;
    /** 属性无功/有功比率下限 */
    private double lowPowerRate = 0D;
    /** 属性供电类型代码 */
    private String suppleType = "";
    /** 属性调整率 */
    private String adjustRate = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwRateCodeDtoBase对象
     */
    public LwRateCodeDtoBase(){
    }

    /**
     * 设置属性功率因数
     * @param powerFactor 待设置的属性功率因数的值
     */
    public void setPowerFactor(String powerFactor){
        this.powerFactor = StringUtils.rightTrim(powerFactor);
    }

    /**
     * 获取属性功率因数
     * @return 属性功率因数的值
     */
    public String getPowerFactor(){
        return powerFactor;
    }

    /**
     * 设置属性无功/有功比率上限
     * @param upPowerRate 待设置的属性无功/有功比率上限的值
     */
    public void setUpPowerRate(double upPowerRate){
        this.upPowerRate = upPowerRate;
    }

    /**
     * 获取属性无功/有功比率上限
     * @return 属性无功/有功比率上限的值
     */
    public double getUpPowerRate(){
        return upPowerRate;
    }

    /**
     * 设置属性无功/有功比率下限
     * @param lowPowerRate 待设置的属性无功/有功比率下限的值
     */
    public void setLowPowerRate(double lowPowerRate){
        this.lowPowerRate = lowPowerRate;
    }

    /**
     * 获取属性无功/有功比率下限
     * @return 属性无功/有功比率下限的值
     */
    public double getLowPowerRate(){
        return lowPowerRate;
    }

    /**
     * 设置属性供电类型代码
     * @param suppleType 待设置的属性供电类型代码的值
     */
    public void setSuppleType(String suppleType){
        this.suppleType = StringUtils.rightTrim(suppleType);
    }

    /**
     * 获取属性供电类型代码
     * @return 属性供电类型代码的值
     */
    public String getSuppleType(){
        return suppleType;
    }

    /**
     * 设置属性调整率
     * @param adjustRate 待设置的属性调整率的值
     */
    public void setAdjustRate(String adjustRate){
        this.adjustRate = StringUtils.rightTrim(adjustRate);
    }

    /**
     * 获取属性调整率
     * @return 属性调整率的值
     */
    public String getAdjustRate(){
        return adjustRate;
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
