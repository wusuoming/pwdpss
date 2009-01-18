package com.elongway.pss.dto.domain;

import java.io.Serializable;

import com.sinosoft.sysframework.common.util.StringUtils;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是线路电压互感器对照表的数据传输对象基类<br>
 */
public class LwLinePTDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性线路代码 */
    private String lineCode = "";
    /** 属性电压互感器型式 */
    private String ptModus = "";
    /** 属性标志位 */
    private String flag = "";
    /** 属性录入日期 */
    private String inputDate = "";

    /**
     *  默认构造方法,构造一个默认的LwLinePTDtoBase对象
     */
    public LwLinePTDtoBase(){
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
     * 设置属性电压互感器型式
     * @param ptModus 待设置的属性电压互感器型式的值
     */
    public void setPtModus(String ptModus){
        this.ptModus = StringUtils.rightTrim(ptModus);
    }

    /**
     * 获取属性电压互感器型式
     * @return 属性电压互感器型式的值
     */
    public String getPtModus(){
        return ptModus;
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
}
