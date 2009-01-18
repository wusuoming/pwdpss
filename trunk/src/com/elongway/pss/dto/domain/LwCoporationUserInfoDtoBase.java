package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWCoporationUserInfo-大工业用户信息表的数据传输对象基类<br>
 */
public class LwCoporationUserInfoDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性户名 */
    private String userName = "";
    /** 属性地址 */
    private String address = "";
    /** 属性开户行 */
    private String accountBank = "";
    /** 属性税号 */
    private String taxNo = "";
    /** 属性银行帐号 */
    private String accountNo = "";
    /** 属性容量/需量 */
    private String industryType = "";
    /** 属性供电电压 */
    private String voltage = "";
    /** 属性供电线路 */
    private String lineNo = "";
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志位 */
    private String flag = "";
    /** 属性容量电量 */
    private int rongliangPower = 0;
    /** 属性需量表倍率 */
    private int needRate = 0;
    /** 属性电金电量 */
    private String dianJinPower = "";
    /** 属性居民定量还是抄表 */
    private String pepoleFlag = "";
    /** 属性生产电价类型 */
    private String shengChanPrice = "";
    /** 属性停产电价类型 */
    private String tingChanPrice = "";
    /** 属性生产容量电价 */
    private double shengChanrongLiangPrice = 0D;
    /** 属性生产电金电价 */
    private double shengChandianJinPrice = 0D;
    /** 属性停产电金电价 */
    private double tingChandianJinPrice = 0D;
    /** 属性停产容量电价 */
    private double tingChanrongLiangPrice = 0D;
    /** 属性生产电价电压等级 */
    private String shengChanKV = "";
    /** 属性停产电价电压等级 */
    private String tingChanKV = "";
    /** 属性居民照明电量 */
    private String pepolePower = "";
    /** 属性线损比例 */
    private double lineLossScale = 0D;

    /**
     *  默认构造方法,构造一个默认的LwCoporationUserInfoDtoBase对象
     */
    public LwCoporationUserInfoDtoBase(){
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
     * 设置属性地址
     * @param address 待设置的属性地址的值
     */
    public void setAddress(String address){
        this.address = StringUtils.rightTrim(address);
    }

    /**
     * 获取属性地址
     * @return 属性地址的值
     */
    public String getAddress(){
        return address;
    }

    /**
     * 设置属性开户行
     * @param accountBank 待设置的属性开户行的值
     */
    public void setAccountBank(String accountBank){
        this.accountBank = StringUtils.rightTrim(accountBank);
    }

    /**
     * 获取属性开户行
     * @return 属性开户行的值
     */
    public String getAccountBank(){
        return accountBank;
    }

    /**
     * 设置属性税号
     * @param taxNo 待设置的属性税号的值
     */
    public void setTaxNo(String taxNo){
        this.taxNo = StringUtils.rightTrim(taxNo);
    }

    /**
     * 获取属性税号
     * @return 属性税号的值
     */
    public String getTaxNo(){
        return taxNo;
    }

    /**
     * 设置属性银行帐号
     * @param accountNo 待设置的属性银行帐号的值
     */
    public void setAccountNo(String accountNo){
        this.accountNo = StringUtils.rightTrim(accountNo);
    }

    /**
     * 获取属性银行帐号
     * @return 属性银行帐号的值
     */
    public String getAccountNo(){
        return accountNo;
    }

    /**
     * 设置属性容量/需量
     * @param industryType 待设置的属性容量/需量的值
     */
    public void setIndustryType(String industryType){
        this.industryType = StringUtils.rightTrim(industryType);
    }

    /**
     * 获取属性容量/需量
     * @return 属性容量/需量的值
     */
    public String getIndustryType(){
        return industryType;
    }

    /**
     * 设置属性供电电压
     * @param voltage 待设置的属性供电电压的值
     */
    public void setVoltage(String voltage){
        this.voltage = StringUtils.rightTrim(voltage);
    }

    /**
     * 获取属性供电电压
     * @return 属性供电电压的值
     */
    public String getVoltage(){
        return voltage;
    }

    /**
     * 设置属性供电线路
     * @param lineNo 待设置的属性供电线路的值
     */
    public void setLineNo(String lineNo){
        this.lineNo = StringUtils.rightTrim(lineNo);
    }

    /**
     * 获取属性供电线路
     * @return 属性供电线路的值
     */
    public String getLineNo(){
        return lineNo;
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
     * 设置属性容量电量
     * @param rongliangPower 待设置的属性容量电量的值
     */
    public void setRongliangPower(int rongliangPower){
        this.rongliangPower = rongliangPower;
    }

    /**
     * 获取属性容量电量
     * @return 属性容量电量的值
     */
    public int getRongliangPower(){
        return rongliangPower;
    }

    /**
     * 设置属性需量表倍率
     * @param needRate 待设置的属性需量表倍率的值
     */
    public void setNeedRate(int needRate){
        this.needRate = needRate;
    }

    /**
     * 获取属性需量表倍率
     * @return 属性需量表倍率的值
     */
    public int getNeedRate(){
        return needRate;
    }

    /**
     * 设置属性电金电量
     * @param dianJinPower 待设置的属性电金电量的值
     */
    public void setDianJinPower(String dianJinPower){
        this.dianJinPower = StringUtils.rightTrim(dianJinPower);
    }

    /**
     * 获取属性电金电量
     * @return 属性电金电量的值
     */
    public String getDianJinPower(){
        return dianJinPower;
    }

    /**
     * 设置属性居民定量还是抄表
     * @param pepoleFlag 待设置的属性居民定量还是抄表的值
     */
    public void setPepoleFlag(String pepoleFlag){
        this.pepoleFlag = StringUtils.rightTrim(pepoleFlag);
    }

    /**
     * 获取属性居民定量还是抄表
     * @return 属性居民定量还是抄表的值
     */
    public String getPepoleFlag(){
        return pepoleFlag;
    }

    /**
     * 设置属性生产电价类型
     * @param shengChanPrice 待设置的属性生产电价类型的值
     */
    public void setShengChanPrice(String shengChanPrice){
        this.shengChanPrice = StringUtils.rightTrim(shengChanPrice);
    }

    /**
     * 获取属性生产电价类型
     * @return 属性生产电价类型的值
     */
    public String getShengChanPrice(){
        return shengChanPrice;
    }

    /**
     * 设置属性停产电价类型
     * @param tingChanPrice 待设置的属性停产电价类型的值
     */
    public void setTingChanPrice(String tingChanPrice){
        this.tingChanPrice = StringUtils.rightTrim(tingChanPrice);
    }

    /**
     * 获取属性停产电价类型
     * @return 属性停产电价类型的值
     */
    public String getTingChanPrice(){
        return tingChanPrice;
    }

    /**
     * 设置属性生产容量电价
     * @param shengChanrongLiangPrice 待设置的属性生产容量电价的值
     */
    public void setShengChanrongLiangPrice(double shengChanrongLiangPrice){
        this.shengChanrongLiangPrice = shengChanrongLiangPrice;
    }

    /**
     * 获取属性生产容量电价
     * @return 属性生产容量电价的值
     */
    public double getShengChanrongLiangPrice(){
        return shengChanrongLiangPrice;
    }

    /**
     * 设置属性生产电金电价
     * @param shengChandianJinPrice 待设置的属性生产电金电价的值
     */
    public void setShengChandianJinPrice(double shengChandianJinPrice){
        this.shengChandianJinPrice = shengChandianJinPrice;
    }

    /**
     * 获取属性生产电金电价
     * @return 属性生产电金电价的值
     */
    public double getShengChandianJinPrice(){
        return shengChandianJinPrice;
    }

    /**
     * 设置属性停产电金电价
     * @param tingChandianJinPrice 待设置的属性停产电金电价的值
     */
    public void setTingChandianJinPrice(double tingChandianJinPrice){
        this.tingChandianJinPrice = tingChandianJinPrice;
    }

    /**
     * 获取属性停产电金电价
     * @return 属性停产电金电价的值
     */
    public double getTingChandianJinPrice(){
        return tingChandianJinPrice;
    }

    /**
     * 设置属性停产容量电价
     * @param tingChanrongLiangPrice 待设置的属性停产容量电价的值
     */
    public void setTingChanrongLiangPrice(double tingChanrongLiangPrice){
        this.tingChanrongLiangPrice = tingChanrongLiangPrice;
    }

    /**
     * 获取属性停产容量电价
     * @return 属性停产容量电价的值
     */
    public double getTingChanrongLiangPrice(){
        return tingChanrongLiangPrice;
    }

    /**
     * 设置属性生产电价电压等级
     * @param shengChanKV 待设置的属性生产电价电压等级的值
     */
    public void setShengChanKV(String shengChanKV){
        this.shengChanKV = StringUtils.rightTrim(shengChanKV);
    }

    /**
     * 获取属性生产电价电压等级
     * @return 属性生产电价电压等级的值
     */
    public String getShengChanKV(){
        return shengChanKV;
    }

    /**
     * 设置属性停产电价电压等级
     * @param tingChanKV 待设置的属性停产电价电压等级的值
     */
    public void setTingChanKV(String tingChanKV){
        this.tingChanKV = StringUtils.rightTrim(tingChanKV);
    }

    /**
     * 获取属性停产电价电压等级
     * @return 属性停产电价电压等级的值
     */
    public String getTingChanKV(){
        return tingChanKV;
    }

    /**
     * 设置属性居民照明电量
     * @param pepolePower 待设置的属性居民照明电量的值
     */
    public void setPepolePower(String pepolePower){
        this.pepolePower = StringUtils.rightTrim(pepolePower);
    }

    /**
     * 获取属性居民照明电量
     * @return 属性居民照明电量的值
     */
    public String getPepolePower(){
        return pepolePower;
    }

    /**
     * 设置属性线损比例
     * @param lineLossScale 待设置的属性线损比例的值
     */
    public void setLineLossScale(double lineLossScale){
        this.lineLossScale = lineLossScale;
    }

    /**
     * 获取属性线损比例
     * @return 属性线损比例的值
     */
    public double getLineLossScale(){
        return lineLossScale;
    }
}
