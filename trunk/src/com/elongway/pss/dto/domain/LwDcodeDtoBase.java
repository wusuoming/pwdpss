package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwDcode-基础代码表的数据传输对象基类<br>
 */
public class LwDcodeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性接口代码类型 */
    private String codeType = "";
    /** 属性代码 */
    private String codeCode = "";
    /** 属性代码中文名称 */
    private String codeCName = "";
    /** 属性代码英文名称 */
    private String codeEName = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";

    /**
     *  默认构造方法,构造一个默认的LwDcodeDtoBase对象
     */
    public LwDcodeDtoBase(){
    }

    /**
     * 设置属性接口代码类型
     * @param codeType 待设置的属性接口代码类型的值
     */
    public void setCodeType(String codeType){
        this.codeType = StringUtils.rightTrim(codeType);
    }

    /**
     * 获取属性接口代码类型
     * @return 属性接口代码类型的值
     */
    public String getCodeType(){
        return codeType;
    }

    /**
     * 设置属性代码
     * @param codeCode 待设置的属性代码的值
     */
    public void setCodeCode(String codeCode){
        this.codeCode = StringUtils.rightTrim(codeCode);
    }

    /**
     * 获取属性代码
     * @return 属性代码的值
     */
    public String getCodeCode(){
        return codeCode;
    }

    /**
     * 设置属性代码中文名称
     * @param codeCName 待设置的属性代码中文名称的值
     */
    public void setCodeCName(String codeCName){
        this.codeCName = StringUtils.rightTrim(codeCName);
    }

    /**
     * 获取属性代码中文名称
     * @return 属性代码中文名称的值
     */
    public String getCodeCName(){
        return codeCName;
    }

    /**
     * 设置属性代码英文名称
     * @param codeEName 待设置的属性代码英文名称的值
     */
    public void setCodeEName(String codeEName){
        this.codeEName = StringUtils.rightTrim(codeEName);
    }

    /**
     * 获取属性代码英文名称
     * @return 属性代码英文名称的值
     */
    public String getCodeEName(){
        return codeEName;
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
