package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWUserLine-用户线路对照表的数据传输对象基类<br>
 */
public class LwUserLineDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性户名 */
    private String userName = "";
    /** 属性线路代码 */
    private String lineCode = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwUserLineDtoBase对象
     */
    public LwUserLineDtoBase(){
    }

    /**
     * 设置属性户号
     * @param userNo 待设置的属性户号的值
     */
    public void setUserNo(String userNo){
        this.userNo = StringUtils.rightTrim(userNo);
    }

    /**
     * 获取属性户号
     * @return 属性户号的值
     */
    public String getUserNo(){
        return userNo;
    }

    /**
     * 设置属性户名
     * @param userName 待设置的属性户名的值
     */
    public void setUserName(String userName){
        this.userName = StringUtils.rightTrim(userName);
    }

    /**
     * 获取属性户名
     * @return 属性户名的值
     */
    public String getUserName(){
        return userName;
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
