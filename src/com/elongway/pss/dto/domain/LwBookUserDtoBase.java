package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwBookUser-表本用户对照表的数据传输对象基类<br>
 */
public class LwBookUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性表本号 */
    private String bookNo = "";
    /** 属性表本名 */
    private String bookName = "";
    /** 属性用户代码 */
    private String userNo = "";
    /** 属性序号 */
    private int serialNo = 0;
    /** 属性备注 */
    private String remark = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";

    /**
     *  默认构造方法,构造一个默认的LwBookUserDtoBase对象
     */
    public LwBookUserDtoBase(){
    }

    /**
     * 设置属性表本号
     * @param bookNo 待设置的属性表本号的值
     */
    public void setBookNo(String bookNo){
        this.bookNo = StringUtils.rightTrim(bookNo);
    }

    /**
     * 获取属性表本号
     * @return 属性表本号的值
     */
    public String getBookNo(){
        return bookNo;
    }

    /**
     * 设置属性表本名
     * @param bookName 待设置的属性表本名的值
     */
    public void setBookName(String bookName){
        this.bookName = StringUtils.rightTrim(bookName);
    }

    /**
     * 获取属性表本名
     * @return 属性表本名的值
     */
    public String getBookName(){
        return bookName;
    }

    /**
     * 设置属性用户代码
     * @param userNo 待设置的属性用户代码的值
     */
    public void setUserNo(String userNo){
        this.userNo = StringUtils.rightTrim(userNo);
    }

    /**
     * 获取属性用户代码
     * @return 属性用户代码的值
     */
    public String getUserNo(){
        return userNo;
    }

    /**
     * 设置属性序号
     * @param serialNo 待设置的属性序号的值
     */
    public void setSerialNo(int serialNo){
        this.serialNo = serialNo;
    }

    /**
     * 获取属性序号
     * @return 属性序号的值
     */
    public int getSerialNo(){
        return serialNo;
    }

    /**
     * 设置属性备注
     * @param remark 待设置的属性备注的值
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * 获取属性备注
     * @return 属性备注的值
     */
    public String getRemark(){
        return remark;
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
}
