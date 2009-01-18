package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWFactoryIndicator-大工业电表指针记录表的数据传输对象基类<br>
 */
public class LwFactoryIndicatorDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性抄表日期 */
    private String readDate = "";
    /** 属性录入日期 */
    private String inputDate = "";
    /** 属性帐期 */
    private String statMonth = "";
    /** 属性当月有功指针数 */
    private double thisWorkNum = 0D;
    /** 属性上月有功指针数 */
    private double lastWorkNum = 0D;
    /** 属性当月无功指针数 */
    private double thisIdleNum = 0D;
    /** 属性上月无功指针数 */
    private double lastIdleNum = 0D;
    /** 属性倍率 */
    private double rate = 0D;
    /** 属性抄见电量 */
    private double readQuantity = 0D;
    /** 属性异常电量 */
    private double excepQuantity = 0D;
    /** 属性换表电量 */
    private double chgAmmeterQuantity = 0D;
    /** 属性退补电量 */
    private double compensateQuantity = 0D;
    /** 属性线损电量 */
    private double lineLossQuantity = 0D;
    /** 属性变损电量 */
    private double transLossQuantity = 0D;
    /** 属性需量电量 */
    private double needQuantity = 0D;
    /** 属性容量电量 */
    private double rongliangQuantity = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性居民当月有功指针数 */
    private double peopleThisWorkNum = 0D;
    /** 属性居民上月有功指针数 */
    private double peopleLastWorkNum = 0D;
    /** 属性居民当月无功指针数 */
    private double peopleThisIdleNum = 0D;
    /** 属性居民上月无功指针数 */
    private double peopleLastIdleNum = 0D;
    /** 属性居民倍率 */
    private double peopleRate = 0D;
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性居民电量 */
    private double peopleQuantity = 0D;
    /** 属性换表无功电量 */
    private String unChgAmmeterQuantity = "";
    /** 属性居民换表电量 */
    private String pepoleUnChgAmmeterQuantity = "";
    /** 属性用户名 */
    private String username = "";
    /** 属性电表类型 */
    private String ammeterStyle = "";
    /** 属性是否发生停产或生产 */
    private String ifChange = "";
    /** 属性状态改变时的指针 */
    private double changePointer = 0D;
    /** 属性变化前的状态 */
    private String changeBefore = "";
    /** 属性变化后的状态 */
    private String changeAfter = "";
    /** 属性变化前的天数 */
    private String day = "";
    /** 属性变化后的天数 */
    private String changeday = "";
    /** 属性改变的日期 */
    private String changeDate = "";

    /**
     *  默认构造方法,构造一个默认的LwFactoryIndicatorDtoBase对象
     */
    public LwFactoryIndicatorDtoBase(){
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
     * 设置属性抄表日期
     * @param readDate 待设置的属性抄表日期的值
     */
    public void setReadDate(String readDate){
        this.readDate = StringUtils.rightTrim(readDate);
    }

    /**
     * 获取属性抄表日期
     * @return 属性抄表日期的值
     */
    public String getReadDate(){
        return readDate;
    }

    /**
     * 设置属性录入日期
     * @param inputDate 待设置的属性录入日期的值
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * 获取属性录入日期
     * @return 属性录入日期的值
     */
    public String getInputDate(){
        return inputDate;
    }

    /**
     * 设置属性帐期
     * @param statMonth 待设置的属性帐期的值
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * 获取属性帐期
     * @return 属性帐期的值
     */
    public String getStatMonth(){
        return statMonth;
    }

    /**
     * 设置属性当月有功指针数
     * @param thisWorkNum 待设置的属性当月有功指针数的值
     */
    public void setThisWorkNum(double thisWorkNum){
        this.thisWorkNum = thisWorkNum;
    }

    /**
     * 获取属性当月有功指针数
     * @return 属性当月有功指针数的值
     */
    public double getThisWorkNum(){
        return thisWorkNum;
    }

    /**
     * 设置属性上月有功指针数
     * @param lastWorkNum 待设置的属性上月有功指针数的值
     */
    public void setLastWorkNum(double lastWorkNum){
        this.lastWorkNum = lastWorkNum;
    }

    /**
     * 获取属性上月有功指针数
     * @return 属性上月有功指针数的值
     */
    public double getLastWorkNum(){
        return lastWorkNum;
    }

    /**
     * 设置属性当月无功指针数
     * @param thisIdleNum 待设置的属性当月无功指针数的值
     */
    public void setThisIdleNum(double thisIdleNum){
        this.thisIdleNum = thisIdleNum;
    }

    /**
     * 获取属性当月无功指针数
     * @return 属性当月无功指针数的值
     */
    public double getThisIdleNum(){
        return thisIdleNum;
    }

    /**
     * 设置属性上月无功指针数
     * @param lastIdleNum 待设置的属性上月无功指针数的值
     */
    public void setLastIdleNum(double lastIdleNum){
        this.lastIdleNum = lastIdleNum;
    }

    /**
     * 获取属性上月无功指针数
     * @return 属性上月无功指针数的值
     */
    public double getLastIdleNum(){
        return lastIdleNum;
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
     * 设置属性抄见电量
     * @param readQuantity 待设置的属性抄见电量的值
     */
    public void setReadQuantity(double readQuantity){
        this.readQuantity = readQuantity;
    }

    /**
     * 获取属性抄见电量
     * @return 属性抄见电量的值
     */
    public double getReadQuantity(){
        return readQuantity;
    }

    /**
     * 设置属性异常电量
     * @param excepQuantity 待设置的属性异常电量的值
     */
    public void setExcepQuantity(double excepQuantity){
        this.excepQuantity = excepQuantity;
    }

    /**
     * 获取属性异常电量
     * @return 属性异常电量的值
     */
    public double getExcepQuantity(){
        return excepQuantity;
    }

    /**
     * 设置属性换表电量
     * @param chgAmmeterQuantity 待设置的属性换表电量的值
     */
    public void setChgAmmeterQuantity(double chgAmmeterQuantity){
        this.chgAmmeterQuantity = chgAmmeterQuantity;
    }

    /**
     * 获取属性换表电量
     * @return 属性换表电量的值
     */
    public double getChgAmmeterQuantity(){
        return chgAmmeterQuantity;
    }

    /**
     * 设置属性退补电量
     * @param compensateQuantity 待设置的属性退补电量的值
     */
    public void setCompensateQuantity(double compensateQuantity){
        this.compensateQuantity = compensateQuantity;
    }

    /**
     * 获取属性退补电量
     * @return 属性退补电量的值
     */
    public double getCompensateQuantity(){
        return compensateQuantity;
    }

    /**
     * 设置属性线损电量
     * @param lineLossQuantity 待设置的属性线损电量的值
     */
    public void setLineLossQuantity(double lineLossQuantity){
        this.lineLossQuantity = lineLossQuantity;
    }

    /**
     * 获取属性线损电量
     * @return 属性线损电量的值
     */
    public double getLineLossQuantity(){
        return lineLossQuantity;
    }

    /**
     * 设置属性变损电量
     * @param transLossQuantity 待设置的属性变损电量的值
     */
    public void setTransLossQuantity(double transLossQuantity){
        this.transLossQuantity = transLossQuantity;
    }

    /**
     * 获取属性变损电量
     * @return 属性变损电量的值
     */
    public double getTransLossQuantity(){
        return transLossQuantity;
    }

    /**
     * 设置属性需量电量
     * @param needQuantity 待设置的属性需量电量的值
     */
    public void setNeedQuantity(double needQuantity){
        this.needQuantity = needQuantity;
    }

    /**
     * 获取属性需量电量
     * @return 属性需量电量的值
     */
    public double getNeedQuantity(){
        return needQuantity;
    }

    /**
     * 设置属性容量电量
     * @param rongliangQuantity 待设置的属性容量电量的值
     */
    public void setRongliangQuantity(double rongliangQuantity){
        this.rongliangQuantity = rongliangQuantity;
    }

    /**
     * 获取属性容量电量
     * @return 属性容量电量的值
     */
    public double getRongliangQuantity(){
        return rongliangQuantity;
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
     * 设置属性居民当月有功指针数
     * @param peopleThisWorkNum 待设置的属性居民当月有功指针数的值
     */
    public void setPeopleThisWorkNum(double peopleThisWorkNum){
        this.peopleThisWorkNum = peopleThisWorkNum;
    }

    /**
     * 获取属性居民当月有功指针数
     * @return 属性居民当月有功指针数的值
     */
    public double getPeopleThisWorkNum(){
        return peopleThisWorkNum;
    }

    /**
     * 设置属性居民上月有功指针数
     * @param peopleLastWorkNum 待设置的属性居民上月有功指针数的值
     */
    public void setPeopleLastWorkNum(double peopleLastWorkNum){
        this.peopleLastWorkNum = peopleLastWorkNum;
    }

    /**
     * 获取属性居民上月有功指针数
     * @return 属性居民上月有功指针数的值
     */
    public double getPeopleLastWorkNum(){
        return peopleLastWorkNum;
    }

    /**
     * 设置属性居民当月无功指针数
     * @param peopleThisIdleNum 待设置的属性居民当月无功指针数的值
     */
    public void setPeopleThisIdleNum(double peopleThisIdleNum){
        this.peopleThisIdleNum = peopleThisIdleNum;
    }

    /**
     * 获取属性居民当月无功指针数
     * @return 属性居民当月无功指针数的值
     */
    public double getPeopleThisIdleNum(){
        return peopleThisIdleNum;
    }

    /**
     * 设置属性居民上月无功指针数
     * @param peopleLastIdleNum 待设置的属性居民上月无功指针数的值
     */
    public void setPeopleLastIdleNum(double peopleLastIdleNum){
        this.peopleLastIdleNum = peopleLastIdleNum;
    }

    /**
     * 获取属性居民上月无功指针数
     * @return 属性居民上月无功指针数的值
     */
    public double getPeopleLastIdleNum(){
        return peopleLastIdleNum;
    }

    /**
     * 设置属性居民倍率
     * @param peopleRate 待设置的属性居民倍率的值
     */
    public void setPeopleRate(double peopleRate){
        this.peopleRate = peopleRate;
    }

    /**
     * 获取属性居民倍率
     * @return 属性居民倍率的值
     */
    public double getPeopleRate(){
        return peopleRate;
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
     * 设置属性居民电量
     * @param peopleQuantity 待设置的属性居民电量的值
     */
    public void setPeopleQuantity(double peopleQuantity){
        this.peopleQuantity = peopleQuantity;
    }

    /**
     * 获取属性居民电量
     * @return 属性居民电量的值
     */
    public double getPeopleQuantity(){
        return peopleQuantity;
    }

    /**
     * 设置属性换表无功电量
     * @param unChgAmmeterQuantity 待设置的属性换表无功电量的值
     */
    public void setUnChgAmmeterQuantity(String unChgAmmeterQuantity){
        this.unChgAmmeterQuantity = StringUtils.rightTrim(unChgAmmeterQuantity);
    }

    /**
     * 获取属性换表无功电量
     * @return 属性换表无功电量的值
     */
    public String getUnChgAmmeterQuantity(){
        return unChgAmmeterQuantity;
    }

    /**
     * 设置属性居民换表电量
     * @param pepoleUnChgAmmeterQuantity 待设置的属性居民换表电量的值
     */
    public void setPepoleUnChgAmmeterQuantity(String pepoleUnChgAmmeterQuantity){
        this.pepoleUnChgAmmeterQuantity = StringUtils.rightTrim(pepoleUnChgAmmeterQuantity);
    }

    /**
     * 获取属性居民换表电量
     * @return 属性居民换表电量的值
     */
    public String getPepoleUnChgAmmeterQuantity(){
        return pepoleUnChgAmmeterQuantity;
    }

    /**
     * 设置属性用户名
     * @param username 待设置的属性用户名的值
     */
    public void setUsername(String username){
        this.username = StringUtils.rightTrim(username);
    }

    /**
     * 获取属性用户名
     * @return 属性用户名的值
     */
    public String getUsername(){
        return username;
    }

    /**
     * 设置属性电表类型
     * @param ammeterStyle 待设置的属性电表类型的值
     */
    public void setAmmeterStyle(String ammeterStyle){
        this.ammeterStyle = StringUtils.rightTrim(ammeterStyle);
    }

    /**
     * 获取属性电表类型
     * @return 属性电表类型的值
     */
    public String getAmmeterStyle(){
        return ammeterStyle;
    }

    /**
     * 设置属性是否发生停产或生产
     * @param ifChange 待设置的属性是否发生停产或生产的值
     */
    public void setIfChange(String ifChange){
        this.ifChange = StringUtils.rightTrim(ifChange);
    }

    /**
     * 获取属性是否发生停产或生产
     * @return 属性是否发生停产或生产的值
     */
    public String getIfChange(){
        return ifChange;
    }

    /**
     * 设置属性状态改变时的指针
     * @param changePointer 待设置的属性状态改变时的指针的值
     */
    public void setChangePointer(double changePointer){
        this.changePointer = changePointer;
    }

    /**
     * 获取属性状态改变时的指针
     * @return 属性状态改变时的指针的值
     */
    public double getChangePointer(){
        return changePointer;
    }

    /**
     * 设置属性变化前的状态
     * @param changeBefore 待设置的属性变化前的状态的值
     */
    public void setChangeBefore(String changeBefore){
        this.changeBefore = StringUtils.rightTrim(changeBefore);
    }

    /**
     * 获取属性变化前的状态
     * @return 属性变化前的状态的值
     */
    public String getChangeBefore(){
        return changeBefore;
    }

    /**
     * 设置属性变化后的状态
     * @param changeAfter 待设置的属性变化后的状态的值
     */
    public void setChangeAfter(String changeAfter){
        this.changeAfter = StringUtils.rightTrim(changeAfter);
    }

    /**
     * 获取属性变化后的状态
     * @return 属性变化后的状态的值
     */
    public String getChangeAfter(){
        return changeAfter;
    }

    /**
     * 设置属性变化前的天数
     * @param day 待设置的属性变化前的天数的值
     */
    public void setDay(String day){
        this.day = StringUtils.rightTrim(day);
    }

    /**
     * 获取属性变化前的天数
     * @return 属性变化前的天数的值
     */
    public String getDay(){
        return day;
    }

    /**
     * 设置属性变化后的天数
     * @param changeday 待设置的属性变化后的天数的值
     */
    public void setChangeday(String changeday){
        this.changeday = StringUtils.rightTrim(changeday);
    }

    /**
     * 获取属性变化后的天数
     * @return 属性变化后的天数的值
     */
    public String getChangeday(){
        return changeday;
    }

    /**
     * 设置属性改变的日期
     * @param changeDate 待设置的属性改变的日期的值
     */
    public void setChangeDate(String changeDate){
        this.changeDate = StringUtils.rightTrim(changeDate);
    }

    /**
     * 获取属性改变的日期
     * @return 属性改变的日期的值
     */
    public String getChangeDate(){
        return changeDate;
    }
}
