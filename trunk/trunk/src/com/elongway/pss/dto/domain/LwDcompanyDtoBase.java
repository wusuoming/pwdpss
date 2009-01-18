package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWDcompany-机构代码表的数据传输对象基类<br>
 */
public class LwDcompanyDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性机构代码 */
    private String comCode = "";
    /** 属性机构中文名称 */
    private String comCName = "";
    /** 属性机构英文名称 */
    private String comEName = "";
    /** 属性地址中文名称 */
    private String addressCName = "";
    /** 属性地址英文名称 */
    private String addressEName = "";
    /** 属性邮编 */
    private String postCode = "";
    /** 属性电话 */
    private String phoneNumber = "";
    /** 属性传真 */
    private String taxNumber = "";
    /** 属性上级机构代码 */
    private String upperComCode = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwDcompanyDtoBase对象
     */
    public LwDcompanyDtoBase(){
    }

    /**
     * 设置属性机构代码
     * @param comCode 待设置的属性机构代码的值
     */
    public void setComCode(String comCode){
        this.comCode = StringUtils.rightTrim(comCode);
    }

    /**
     * 获取属性机构代码
     * @return 属性机构代码的值
     */
    public String getComCode(){
        return comCode;
    }

    /**
     * 设置属性机构中文名称
     * @param comCName 待设置的属性机构中文名称的值
     */
    public void setComCName(String comCName){
        this.comCName = StringUtils.rightTrim(comCName);
    }

    /**
     * 获取属性机构中文名称
     * @return 属性机构中文名称的值
     */
    public String getComCName(){
        return comCName;
    }

    /**
     * 设置属性机构英文名称
     * @param comEName 待设置的属性机构英文名称的值
     */
    public void setComEName(String comEName){
        this.comEName = StringUtils.rightTrim(comEName);
    }

    /**
     * 获取属性机构英文名称
     * @return 属性机构英文名称的值
     */
    public String getComEName(){
        return comEName;
    }

    /**
     * 设置属性地址中文名称
     * @param addressCName 待设置的属性地址中文名称的值
     */
    public void setAddressCName(String addressCName){
        this.addressCName = StringUtils.rightTrim(addressCName);
    }

    /**
     * 获取属性地址中文名称
     * @return 属性地址中文名称的值
     */
    public String getAddressCName(){
        return addressCName;
    }

    /**
     * 设置属性地址英文名称
     * @param addressEName 待设置的属性地址英文名称的值
     */
    public void setAddressEName(String addressEName){
        this.addressEName = StringUtils.rightTrim(addressEName);
    }

    /**
     * 获取属性地址英文名称
     * @return 属性地址英文名称的值
     */
    public String getAddressEName(){
        return addressEName;
    }

    /**
     * 设置属性邮编
     * @param postCode 待设置的属性邮编的值
     */
    public void setPostCode(String postCode){
        this.postCode = StringUtils.rightTrim(postCode);
    }

    /**
     * 获取属性邮编
     * @return 属性邮编的值
     */
    public String getPostCode(){
        return postCode;
    }

    /**
     * 设置属性电话
     * @param phoneNumber 待设置的属性电话的值
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = StringUtils.rightTrim(phoneNumber);
    }

    /**
     * 获取属性电话
     * @return 属性电话的值
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * 设置属性传真
     * @param taxNumber 待设置的属性传真的值
     */
    public void setTaxNumber(String taxNumber){
        this.taxNumber = StringUtils.rightTrim(taxNumber);
    }

    /**
     * 获取属性传真
     * @return 属性传真的值
     */
    public String getTaxNumber(){
        return taxNumber;
    }

    /**
     * 设置属性上级机构代码
     * @param upperComCode 待设置的属性上级机构代码的值
     */
    public void setUpperComCode(String upperComCode){
        this.upperComCode = StringUtils.rightTrim(upperComCode);
    }

    /**
     * 获取属性上级机构代码
     * @return 属性上级机构代码的值
     */
    public String getUpperComCode(){
        return upperComCode;
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
