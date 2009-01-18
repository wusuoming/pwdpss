package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADCode的数据传输对象基类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IADCodeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性CodeType */
    private String codeType = "";
    /** 属性CodeCode */
    private String codeCode = "";
    /** 属性CodeCName */
    private String codeCName = "";
    /** 属性CodeEName */
    private String codeEName = "";
    /** 属性ValidStatus */
    private String validStatus = "";
    /** 属性Flag */
    private String flag = "";

    /**
     *  默认构造方法,构造一个默认的IADCodeDtoBase对象
     */
    public IADCodeDtoBase(){
    }

    /**
     * 设置属性CodeType
     * @param codeType 待设置的属性CodeType的值
     */
    public void setCodeType(String codeType){
        this.codeType = StringUtils.rightTrim(codeType);
    }

    /**
     * 获取属性CodeType
     * @return 属性CodeType的值
     */
    public String getCodeType(){
        return codeType;
    }

    /**
     * 设置属性CodeCode
     * @param codeCode 待设置的属性CodeCode的值
     */
    public void setCodeCode(String codeCode){
        this.codeCode = StringUtils.rightTrim(codeCode);
    }

    /**
     * 获取属性CodeCode
     * @return 属性CodeCode的值
     */
    public String getCodeCode(){
        return codeCode;
    }

    /**
     * 设置属性CodeCName
     * @param codeCName 待设置的属性CodeCName的值
     */
    public void setCodeCName(String codeCName){
        this.codeCName = StringUtils.rightTrim(codeCName);
    }

    /**
     * 获取属性CodeCName
     * @return 属性CodeCName的值
     */
    public String getCodeCName(){
        return codeCName;
    }

    /**
     * 设置属性CodeEName
     * @param codeEName 待设置的属性CodeEName的值
     */
    public void setCodeEName(String codeEName){
        this.codeEName = StringUtils.rightTrim(codeEName);
    }

    /**
     * 获取属性CodeEName
     * @return 属性CodeEName的值
     */
    public String getCodeEName(){
        return codeEName;
    }

    /**
     * 设置属性ValidStatus
     * @param validStatus 待设置的属性ValidStatus的值
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * 获取属性ValidStatus
     * @return 属性ValidStatus的值
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * 设置属性Flag
     * @param flag 待设置的属性Flag的值
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * 获取属性Flag
     * @return 属性Flag的值
     */
    public String getFlag(){
        return flag;
    }
}
