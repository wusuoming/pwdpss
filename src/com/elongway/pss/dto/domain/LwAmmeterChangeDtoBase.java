package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWAmmeterChange-电表换表信息的数据传输对象基类<br>
 */
public class LwAmmeterChangeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性序号 */
    private String id = "";
    /** 属性户号 */
    private String userNo = "";
    /** 属性户名 */
    private String userName = "";
    /** 属性表号 */
    private String ammeterNo = "";
    /** 属性相 */
    private String ammeterX = "";
    /** 属性伏 */
    private String ammeterV = "";
    /** 属性安 */
    private String ammeterA = "";
    /** 属性型式 */
    private String ammeterType = "";
    /** 属性厂名 */
    private String factoryName = "";
    /** 属性常数 */
    private String coust = "";
    /** 属性精度 */
    private String precision1 = "";
    /** 属性倍率 */
    private String rate = "";
    /** 属性表溢出的最大值 */
    private int maxnum = 0;
    /** 属性允许使用年限 */
    private String allowYear = "";
    /** 属性上表有功指针 */
    private double installWorkNum = 0D;
    /** 属性上表无功指针 */
    private double installIdleNum = 0D;
    /** 属性故障有功指针 */
    private double errorWorkNum = 0D;
    /** 属性故障无功指针 */
    private double errorIdleNum = 0D;
    /** 属性换表无功电量 */
    private double chgIdleQuantity = 0D;
    /** 属性换表有功电量 */
    private double chgWorkNum = 0D;
    /** 属性上月有功指针 */
    private double lastWorkNum = 0D;
    /** 属性上月无功指针 */
    private double lastIdleNum = 0D;
    /** 属性电流比 */
    private String ct = "";
    /** 属性电压比 */
    private String pt = "";
    /** 属性签名 */
    private String signature = "";
    /** 属性上表日期 */
    private String installDate = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性使用类型 */
    private String useStyle = "";
    /** 属性厂号 */
    private String factoryCcode = "";

    /**
     *  默认构造方法,构造一个默认的LwAmmeterChangeDtoBase对象
     */
    public LwAmmeterChangeDtoBase(){
    }

    /**
     * 设置属性序号
     * @param id 待设置的属性序号的值
     */
    public void setId(String id){
        this.id = StringUtils.rightTrim(id);
    }

    /**
     * 获取属性序号
     * @return 属性序号的值
     */
    public String getId(){
        return id;
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
     * 设置属性相
     * @param ammeterX 待设置的属性相的值
     */
    public void setAmmeterX(String ammeterX){
        this.ammeterX = StringUtils.rightTrim(ammeterX);
    }

    /**
     * 获取属性相
     * @return 属性相的值
     */
    public String getAmmeterX(){
        return ammeterX;
    }

    /**
     * 设置属性伏
     * @param ammeterV 待设置的属性伏的值
     */
    public void setAmmeterV(String ammeterV){
        this.ammeterV = StringUtils.rightTrim(ammeterV);
    }

    /**
     * 获取属性伏
     * @return 属性伏的值
     */
    public String getAmmeterV(){
        return ammeterV;
    }

    /**
     * 设置属性安
     * @param ammeterA 待设置的属性安的值
     */
    public void setAmmeterA(String ammeterA){
        this.ammeterA = StringUtils.rightTrim(ammeterA);
    }

    /**
     * 获取属性安
     * @return 属性安的值
     */
    public String getAmmeterA(){
        return ammeterA;
    }

    /**
     * 设置属性型式
     * @param ammeterType 待设置的属性型式的值
     */
    public void setAmmeterType(String ammeterType){
        this.ammeterType = StringUtils.rightTrim(ammeterType);
    }

    /**
     * 获取属性型式
     * @return 属性型式的值
     */
    public String getAmmeterType(){
        return ammeterType;
    }

    /**
     * 设置属性厂名
     * @param factoryName 待设置的属性厂名的值
     */
    public void setFactoryName(String factoryName){
        this.factoryName = StringUtils.rightTrim(factoryName);
    }

    /**
     * 获取属性厂名
     * @return 属性厂名的值
     */
    public String getFactoryName(){
        return factoryName;
    }

    /**
     * 设置属性常数
     * @param coust 待设置的属性常数的值
     */
    public void setCoust(String coust){
        this.coust = StringUtils.rightTrim(coust);
    }

    /**
     * 获取属性常数
     * @return 属性常数的值
     */
    public String getCoust(){
        return coust;
    }

    /**
     * 设置属性精度
     * @param precision 待设置的属性精度的值
     */
    public void setPrecision(String precision){
        this.precision1 = StringUtils.rightTrim(precision);
    }

    /**
     * 获取属性精度
     * @return 属性精度的值
     */
    public String getPrecision(){
        return precision1;
    }

    /**
     * 设置属性倍率
     * @param rate 待设置的属性倍率的值
     */
    public void setRate(String rate){
        this.rate = StringUtils.rightTrim(rate);
    }

    /**
     * 获取属性倍率
     * @return 属性倍率的值
     */
    public String getRate(){
        return rate;
    }

    /**
     * 设置属性表溢出的最大值
     * @param maxnum 待设置的属性表溢出的最大值的值
     */
    public void setMaxnum(int maxnum){
        this.maxnum = maxnum;
    }

    /**
     * 获取属性表溢出的最大值
     * @return 属性表溢出的最大值的值
     */
    public int getMaxnum(){
        return maxnum;
    }

    /**
     * 设置属性允许使用年限
     * @param allowYear 待设置的属性允许使用年限的值
     */
    public void setAllowYear(String allowYear){
        this.allowYear = StringUtils.rightTrim(allowYear);
    }

    /**
     * 获取属性允许使用年限
     * @return 属性允许使用年限的值
     */
    public String getAllowYear(){
        return allowYear;
    }

    /**
     * 设置属性上表有功指针
     * @param installWorkNum 待设置的属性上表有功指针的值
     */
    public void setInstallWorkNum(double installWorkNum){
        this.installWorkNum = installWorkNum;
    }

    /**
     * 获取属性上表有功指针
     * @return 属性上表有功指针的值
     */
    public double getInstallWorkNum(){
        return installWorkNum;
    }

    /**
     * 设置属性上表无功指针
     * @param installIdleNum 待设置的属性上表无功指针的值
     */
    public void setInstallIdleNum(double installIdleNum){
        this.installIdleNum = installIdleNum;
    }

    /**
     * 获取属性上表无功指针
     * @return 属性上表无功指针的值
     */
    public double getInstallIdleNum(){
        return installIdleNum;
    }

    /**
     * 设置属性故障有功指针
     * @param errorWorkNum 待设置的属性故障有功指针的值
     */
    public void setErrorWorkNum(double errorWorkNum){
        this.errorWorkNum = errorWorkNum;
    }

    /**
     * 获取属性故障有功指针
     * @return 属性故障有功指针的值
     */
    public double getErrorWorkNum(){
        return errorWorkNum;
    }

    /**
     * 设置属性故障无功指针
     * @param errorIdleNum 待设置的属性故障无功指针的值
     */
    public void setErrorIdleNum(double errorIdleNum){
        this.errorIdleNum = errorIdleNum;
    }

    /**
     * 获取属性故障无功指针
     * @return 属性故障无功指针的值
     */
    public double getErrorIdleNum(){
        return errorIdleNum;
    }

    /**
     * 设置属性换表无功电量
     * @param chgIdleQuantity 待设置的属性换表无功电量的值
     */
    public void setChgIdleQuantity(double chgIdleQuantity){
        this.chgIdleQuantity = chgIdleQuantity;
    }

    /**
     * 获取属性换表无功电量
     * @return 属性换表无功电量的值
     */
    public double getChgIdleQuantity(){
        return chgIdleQuantity;
    }

    /**
     * 设置属性换表有功电量
     * @param chgWorkNum 待设置的属性换表有功电量的值
     */
    public void setChgWorkNum(double chgWorkNum){
        this.chgWorkNum = chgWorkNum;
    }

    /**
     * 获取属性换表有功电量
     * @return 属性换表有功电量的值
     */
    public double getChgWorkNum(){
        return chgWorkNum;
    }

    /**
     * 设置属性上月有功指针
     * @param lastWorkNum 待设置的属性上月有功指针的值
     */
    public void setLastWorkNum(double lastWorkNum){
        this.lastWorkNum = lastWorkNum;
    }

    /**
     * 获取属性上月有功指针
     * @return 属性上月有功指针的值
     */
    public double getLastWorkNum(){
        return lastWorkNum;
    }

    /**
     * 设置属性上月无功指针
     * @param lastIdleNum 待设置的属性上月无功指针的值
     */
    public void setLastIdleNum(double lastIdleNum){
        this.lastIdleNum = lastIdleNum;
    }

    /**
     * 获取属性上月无功指针
     * @return 属性上月无功指针的值
     */
    public double getLastIdleNum(){
        return lastIdleNum;
    }

    /**
     * 设置属性电流比
     * @param ct 待设置的属性电流比的值
     */
    public void setCt(String ct){
        this.ct = StringUtils.rightTrim(ct);
    }

    /**
     * 获取属性电流比
     * @return 属性电流比的值
     */
    public String getCt(){
        return ct;
    }

    /**
     * 设置属性电压比
     * @param pt 待设置的属性电压比的值
     */
    public void setPt(String pt){
        this.pt = StringUtils.rightTrim(pt);
    }

    /**
     * 获取属性电压比
     * @return 属性电压比的值
     */
    public String getPt(){
        return pt;
    }

    /**
     * 设置属性签名
     * @param signature 待设置的属性签名的值
     */
    public void setSignature(String signature){
        this.signature = StringUtils.rightTrim(signature);
    }

    /**
     * 获取属性签名
     * @return 属性签名的值
     */
    public String getSignature(){
        return signature;
    }

    /**
     * 设置属性上表日期
     * @param installDate 待设置的属性上表日期的值
     */
    public void setInstallDate(String installDate){
        this.installDate = StringUtils.rightTrim(installDate);
    }

    /**
     * 获取属性上表日期
     * @return 属性上表日期的值
     */
    public String getInstallDate(){
        return installDate;
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

    /**
     * 设置属性使用类型
     * @param useStyle 待设置的属性使用类型的值
     */
    public void setUseStyle(String useStyle){
        this.useStyle = StringUtils.rightTrim(useStyle);
    }

    /**
     * 获取属性使用类型
     * @return 属性使用类型的值
     */
    public String getUseStyle(){
        return useStyle;
    }

    /**
     * 设置属性厂号
     * @param factoryCcode 待设置的属性厂号的值
     */
    public void setFactoryCcode(String factoryCcode){
        this.factoryCcode = StringUtils.rightTrim(factoryCcode);
    }

    /**
     * 获取属性厂号
     * @return 属性厂号的值
     */
    public String getFactoryCcode(){
        return factoryCcode;
    }
}
