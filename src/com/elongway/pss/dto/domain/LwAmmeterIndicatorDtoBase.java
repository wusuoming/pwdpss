package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWAmmeterIndicator-换表记录表的数据传输对象基类<br>
 */
public class LwAmmeterIndicatorDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性序号 */
    private String serialNo = "";
    /** 属性表号 */
    private String ammeterNo = "";
    /** 属性当前指针 */
    private int currentNum = 0;
    /** 属性上表指针 */
    private int startNum = 0;
    /** 属性抄表日期 */
    private String readAmmeterDate = "";
    /** 属性换表日期 */
    private String operateDate = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwAmmeterIndicatorDtoBase对象
     */
    public LwAmmeterIndicatorDtoBase(){
    }

    /**
     * 设置属性序号
     * @param serialNo 待设置的属性序号的值
     */
    public void setSerialNo(String serialNo){
        this.serialNo = StringUtils.rightTrim(serialNo);
    }

    /**
     * 获取属性序号
     * @return 属性序号的值
     */
    public String getSerialNo(){
        return serialNo;
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
     * 设置属性当前指针
     * @param currentNum 待设置的属性当前指针的值
     */
    public void setCurrentNum(int currentNum){
        this.currentNum = currentNum;
    }

    /**
     * 获取属性当前指针
     * @return 属性当前指针的值
     */
    public int getCurrentNum(){
        return currentNum;
    }

    /**
     * 设置属性上表指针
     * @param startNum 待设置的属性上表指针的值
     */
    public void setStartNum(int startNum){
        this.startNum = startNum;
    }

    /**
     * 获取属性上表指针
     * @return 属性上表指针的值
     */
    public int getStartNum(){
        return startNum;
    }

    /**
     * 设置属性抄表日期
     * @param readAmmeterDate 待设置的属性抄表日期的值
     */
    public void setReadAmmeterDate(String readAmmeterDate){
        this.readAmmeterDate = StringUtils.rightTrim(readAmmeterDate);
    }

    /**
     * 获取属性抄表日期
     * @return 属性抄表日期的值
     */
    public String getReadAmmeterDate(){
        return readAmmeterDate;
    }

    /**
     * 设置属性换表日期
     * @param operateDate 待设置的属性换表日期的值
     */
    public void setOperateDate(String operateDate){
        this.operateDate = StringUtils.rightTrim(operateDate);
    }

    /**
     * 获取属性换表日期
     * @return 属性换表日期的值
     */
    public String getOperateDate(){
        return operateDate;
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
