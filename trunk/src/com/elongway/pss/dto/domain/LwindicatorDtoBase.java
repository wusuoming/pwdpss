package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWindicator-电表指针记录表的数据传输对象基类<br>
 */
public class LwindicatorDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性线路代码 */
    private String lineCode = "";
    /** 属性表号 */
    private String ammeterNo = "";
    /** 属性统计年月 */
    private String statMonth = "";
    /** 属性当月有功指针数 */
    private int thisWorkNum = 0;
    /** 属性当月无功指针数 */
    private int thisIdleNum = 0;
    /** 属性倍率 */
    private double rate = 0D;
    /** 属性录入时间 */
    private String inputDate = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwindicatorDtoBase对象
     */
    public LwindicatorDtoBase(){
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
     * 设置属性表号
     * @param ammeterNo 待设置的属性表号的值
     */
    public void setAmmeterNo(String ammeterNo){
        this.ammeterNo = StringUtils.rightTrim(ammeterNo);
    }

    /**
     * 获取属性表号
     * @return 属性表号的值
     */
    public String getAmmeterNo(){
        return ammeterNo;
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
     * 设置属性当月有功指针数
     * @param thisWorkNum 待设置的属性当月有功指针数的值
     */
    public void setThisWorkNum(int thisWorkNum){
        this.thisWorkNum = thisWorkNum;
    }

    /**
     * 获取属性当月有功指针数
     * @return 属性当月有功指针数的值
     */
    public int getThisWorkNum(){
        return thisWorkNum;
    }

    /**
     * 设置属性当月无功指针数
     * @param thisIdleNum 待设置的属性当月无功指针数的值
     */
    public void setThisIdleNum(int thisIdleNum){
        this.thisIdleNum = thisIdleNum;
    }

    /**
     * 获取属性当月无功指针数
     * @return 属性当月无功指针数的值
     */
    public int getThisIdleNum(){
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
     * 设置属性录入时间
     * @param inputDate 待设置的属性录入时间的值
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * 获取属性录入时间
     * @return 属性录入时间的值
     */
    public String getInputDate(){
        return inputDate;
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
