package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWPowerLine-线路信息表的数据传输对象基类<br>
 */
public class LwPowerLineDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性线路代码 */
    private String lineCode = "";
    /** 属性线路中文名称 */
    private String lineCName = "";
    /** 属性线路英文名称 */
    private String lineEName = "";
    /** 属性机构代码 */
    private String comCode = "";
    /** 属性供电目标 */
    private String targetCode = "";
    /** 属性供电类型 */
    private String supplyType = "";
    /** 属性电流互感器 */
    private double ct = 0D;
    /** 属性电压互感器 */
    private double pt = 0D;
    /** 属性电压等级 */
    private double voltLevel = 0D;
    /** 属性硅铁线损 */
    private double siFeLoss = 0D;
    /** 属性损失比例 */
    private double lossProp = 0D;
    /** 属性价格分类 */
    private String priceCategory = "";
    /** 属性损失标志 */
    private String lossFlag = "";
    /** 属性倍率 */
    private double rate = 0D;
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";

    /**
     *  默认构造方法,构造一个默认的LwPowerLineDtoBase对象
     */
    public LwPowerLineDtoBase(){
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
     * 设置属性线路中文名称
     * @param lineCName 待设置的属性线路中文名称的值
     */
    public void setLineCName(String lineCName){
        this.lineCName = StringUtils.rightTrim(lineCName);
    }

    /**
     * 获取属性线路中文名称
     * @return 属性线路中文名称的值
     */
    public String getLineCName(){
        return lineCName;
    }

    /**
     * 设置属性线路英文名称
     * @param lineEName 待设置的属性线路英文名称的值
     */
    public void setLineEName(String lineEName){
        this.lineEName = StringUtils.rightTrim(lineEName);
    }

    /**
     * 获取属性线路英文名称
     * @return 属性线路英文名称的值
     */
    public String getLineEName(){
        return lineEName;
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
     * 设置属性供电目标
     * @param targetCode 待设置的属性供电目标的值
     */
    public void setTargetCode(String targetCode){
        this.targetCode = StringUtils.rightTrim(targetCode);
    }

    /**
     * 获取属性供电目标
     * @return 属性供电目标的值
     */
    public String getTargetCode(){
        return targetCode;
    }

    /**
     * 设置属性供电类型
     * @param supplyType 待设置的属性供电类型的值
     */
    public void setSupplyType(String supplyType){
        this.supplyType = StringUtils.rightTrim(supplyType);
    }

    /**
     * 获取属性供电类型
     * @return 属性供电类型的值
     */
    public String getSupplyType(){
        return supplyType;
    }

    /**
     * 设置属性电流互感器
     * @param ct 待设置的属性电流互感器的值
     */
    public void setCt(double ct){
        this.ct = ct;
    }

    /**
     * 获取属性电流互感器
     * @return 属性电流互感器的值
     */
    public double getCt(){
        return ct;
    }

    /**
     * 设置属性电压互感器
     * @param pt 待设置的属性电压互感器的值
     */
    public void setPt(double pt){
        this.pt = pt;
    }

    /**
     * 获取属性电压互感器
     * @return 属性电压互感器的值
     */
    public double getPt(){
        return pt;
    }

    /**
     * 设置属性电压等级
     * @param voltLevel 待设置的属性电压等级的值
     */
    public void setVoltLevel(double voltLevel){
        this.voltLevel = voltLevel;
    }

    /**
     * 获取属性电压等级
     * @return 属性电压等级的值
     */
    public double getVoltLevel(){
        return voltLevel;
    }

    /**
     * 设置属性硅铁线损
     * @param siFeLoss 待设置的属性硅铁线损的值
     */
    public void setSiFeLoss(double siFeLoss){
        this.siFeLoss = siFeLoss;
    }

    /**
     * 获取属性硅铁线损
     * @return 属性硅铁线损的值
     */
    public double getSiFeLoss(){
        return siFeLoss;
    }

    /**
     * 设置属性损失比例
     * @param lossProp 待设置的属性损失比例的值
     */
    public void setLossProp(double lossProp){
        this.lossProp = lossProp;
    }

    /**
     * 获取属性损失比例
     * @return 属性损失比例的值
     */
    public double getLossProp(){
        return lossProp;
    }

    /**
     * 设置属性价格分类
     * @param priceCategory 待设置的属性价格分类的值
     */
    public void setPriceCategory(String priceCategory){
        this.priceCategory = StringUtils.rightTrim(priceCategory);
    }

    /**
     * 获取属性价格分类
     * @return 属性价格分类的值
     */
    public String getPriceCategory(){
        return priceCategory;
    }

    /**
     * 设置属性损失标志
     * @param lossFlag 待设置的属性损失标志的值
     */
    public void setLossFlag(String lossFlag){
        this.lossFlag = StringUtils.rightTrim(lossFlag);
    }

    /**
     * 获取属性损失标志
     * @return 属性损失标志的值
     */
    public String getLossFlag(){
        return lossFlag;
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
