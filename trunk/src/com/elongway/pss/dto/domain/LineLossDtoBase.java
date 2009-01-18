package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LineLoss-线损信息表的数据传输对象基类<br>
 */
public class LineLossDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性线路名称 */
    private String lineCode = "";
    /** 属性线路电阻值 */
    private double r = 0D;
    /** 属性线路长度 */
    private double lineLong = 0D;
    /** 属性额定电压 */
    private double volt = 0D;
    /** 属性用电时间 */
    private double t = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LineLossDtoBase对象
     */
    public LineLossDtoBase(){
    }

    /**
     * 设置属性线路名称
     * @param lineCode 待设置的属性线路名称的值
     */
    public void setLineCode(String lineCode){
        this.lineCode = StringUtils.rightTrim(lineCode);
    }

    /**
     * 获取属性线路名称
     * @return 属性线路名称的值
     */
    public String getLineCode(){
        return lineCode;
    }

    /**
     * 设置属性线路电阻值
     * @param r 待设置的属性线路电阻值的值
     */
    public void setR(double r){
        this.r = r;
    }

    /**
     * 获取属性线路电阻值
     * @return 属性线路电阻值的值
     */
    public double getR(){
        return r;
    }

    /**
     * 设置属性线路长度
     * @param lineLong 待设置的属性线路长度的值
     */
    public void setLineLong(double lineLong){
        this.lineLong = lineLong;
    }

    /**
     * 获取属性线路长度
     * @return 属性线路长度的值
     */
    public double getLineLong(){
        return lineLong;
    }

    /**
     * 设置属性额定电压
     * @param volt 待设置的属性额定电压的值
     */
    public void setVolt(double volt){
        this.volt = volt;
    }

    /**
     * 获取属性额定电压
     * @return 属性额定电压的值
     */
    public double getVolt(){
        return volt;
    }

    /**
     * 设置属性用电时间
     * @param t 待设置的属性用电时间的值
     */
    public void setT(double t){
        this.t = t;
    }

    /**
     * 获取属性用电时间
     * @return 属性用电时间的值
     */
    public double getT(){
        return t;
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
