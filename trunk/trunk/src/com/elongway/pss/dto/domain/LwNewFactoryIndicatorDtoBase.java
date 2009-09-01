package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWNewFactoryIndicator-大工业新电表指针记录表的数据传输对象基类<br>
 */
public class LwNewFactoryIndicatorDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性换表无功电量 */
    private String unChgAmmeterQuantity = "";
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
    /** 属性退补有功电量 */
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
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性居民换表电量 */
    private String pepoleUnChgAmmeterQuantity = "";
    /** 属性用户名 */
    private String username = "";
    /** 属性退补无功电量 */
    private double unCompensateQuantity = 0D;
    /** 属性表号 */
    private String ammeterNo = "";
    /** 属性电表类型 */
    private String ammeterStyle = "";
    /** 属性有功电量 */
    private String workQuantity = "";
    /** 属性无功电量 */
    private String unworkQuantity = "";
    /** 属性是否发生停产或生产 */
    private String ifChange = "";
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
    /** 属性改变后的无功电量 */
    private String changeUnworkQuantity = "";
    /** 属性改变后的有功电量 */
    private String changeworkQuantity = "";
    /** 属性状态改变时的有功指针 */
    private double changeWorkPointer = 0D;
    /** 属性状态改变时的无功指针 */
    private double changeunWorkPointer = 0D;
    /** 属性改变后的换表有功电量 */
    private String chageChgAmmeterQuantity = "";
    /** 属性改变后的换表无功电量 */
    private String changeunChgAmmeterQuantity = "";
    /** 属性改变后的退补有功电量 */
    private String changeCompensateQuantity = "";
    /** 属性改变后的退补无功电量 */
    private String changeunCompensateQuantity = "";
    /** 属性改变前容量电量 */
    private double rlquantityafbefore = 0D;
    /** 属性改变后容量电量 */
    private double rlquantityaf = 0D;
    /** 属性改变后容量电价 */
    private double rlpriceaf = 0D;
    /** 属性改变后是否调价 */
    private String chgpriceafflag = "";

    /**
     *  默认构造方法,构造一个默认的LwNewFactoryIndicatorDtoBase对象
     */
    public LwNewFactoryIndicatorDtoBase(){
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
     * 设置属性退补有功电量
     * @param compensateQuantity 待设置的属性退补有功电量的值
     */
    public void setCompensateQuantity(double compensateQuantity){
        this.compensateQuantity = compensateQuantity;
    }

    /**
     * 获取属性退补有功电量
     * @return 属性退补有功电量的值
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
     * 设置属性退补无功电量
     * @param unCompensateQuantity 待设置的属性退补无功电量的值
     */
    public void setUnCompensateQuantity(double unCompensateQuantity){
        this.unCompensateQuantity = unCompensateQuantity;
    }

    /**
     * 获取属性退补无功电量
     * @return 属性退补无功电量的值
     */
    public double getUnCompensateQuantity(){
        return unCompensateQuantity;
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
     * 设置属性有功电量
     * @param workQuantity 待设置的属性有功电量的值
     */
    public void setWorkQuantity(String workQuantity){
        this.workQuantity = StringUtils.rightTrim(workQuantity);
    }

    /**
     * 获取属性有功电量
     * @return 属性有功电量的值
     */
    public String getWorkQuantity(){
        return workQuantity;
    }

    /**
     * 设置属性无功电量
     * @param unworkQuantity 待设置的属性无功电量的值
     */
    public void setUnworkQuantity(String unworkQuantity){
        this.unworkQuantity = StringUtils.rightTrim(unworkQuantity);
    }

    /**
     * 获取属性无功电量
     * @return 属性无功电量的值
     */
    public String getUnworkQuantity(){
        return unworkQuantity;
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

    /**
     * 设置属性改变后的无功电量
     * @param changeUnworkQuantity 待设置的属性改变后的无功电量的值
     */
    public void setChangeUnworkQuantity(String changeUnworkQuantity){
        this.changeUnworkQuantity = StringUtils.rightTrim(changeUnworkQuantity);
    }

    /**
     * 获取属性改变后的无功电量
     * @return 属性改变后的无功电量的值
     */
    public String getChangeUnworkQuantity(){
        return changeUnworkQuantity;
    }

    /**
     * 设置属性改变后的有功电量
     * @param changeworkQuantity 待设置的属性改变后的有功电量的值
     */
    public void setChangeworkQuantity(String changeworkQuantity){
        this.changeworkQuantity = StringUtils.rightTrim(changeworkQuantity);
    }

    /**
     * 获取属性改变后的有功电量
     * @return 属性改变后的有功电量的值
     */
    public String getChangeworkQuantity(){
        return changeworkQuantity;
    }

    /**
     * 设置属性状态改变时的有功指针
     * @param changeWorkPointer 待设置的属性状态改变时的有功指针的值
     */
    public void setChangeWorkPointer(double changeWorkPointer){
        this.changeWorkPointer = changeWorkPointer;
    }

    /**
     * 获取属性状态改变时的有功指针
     * @return 属性状态改变时的有功指针的值
     */
    public double getChangeWorkPointer(){
        return changeWorkPointer;
    }

    /**
     * 设置属性状态改变时的无功指针
     * @param changeunWorkPointer 待设置的属性状态改变时的无功指针的值
     */
    public void setChangeunWorkPointer(double changeunWorkPointer){
        this.changeunWorkPointer = changeunWorkPointer;
    }

    /**
     * 获取属性状态改变时的无功指针
     * @return 属性状态改变时的无功指针的值
     */
    public double getChangeunWorkPointer(){
        return changeunWorkPointer;
    }

    /**
     * 设置属性改变后的换表有功电量
     * @param chageChgAmmeterQuantity 待设置的属性改变后的换表有功电量的值
     */
    public void setChageChgAmmeterQuantity(String chageChgAmmeterQuantity){
        this.chageChgAmmeterQuantity = StringUtils.rightTrim(chageChgAmmeterQuantity);
    }

    /**
     * 获取属性改变后的换表有功电量
     * @return 属性改变后的换表有功电量的值
     */
    public String getChageChgAmmeterQuantity(){
        return chageChgAmmeterQuantity;
    }

    /**
     * 设置属性改变后的换表无功电量
     * @param changeunChgAmmeterQuantity 待设置的属性改变后的换表无功电量的值
     */
    public void setChangeunChgAmmeterQuantity(String changeunChgAmmeterQuantity){
        this.changeunChgAmmeterQuantity = StringUtils.rightTrim(changeunChgAmmeterQuantity);
    }

    /**
     * 获取属性改变后的换表无功电量
     * @return 属性改变后的换表无功电量的值
     */
    public String getChangeunChgAmmeterQuantity(){
        return changeunChgAmmeterQuantity;
    }

    /**
     * 设置属性改变后的退补有功电量
     * @param changeCompensateQuantity 待设置的属性改变后的退补有功电量的值
     */
    public void setChangeCompensateQuantity(String changeCompensateQuantity){
        this.changeCompensateQuantity = StringUtils.rightTrim(changeCompensateQuantity);
    }

    /**
     * 获取属性改变后的退补有功电量
     * @return 属性改变后的退补有功电量的值
     */
    public String getChangeCompensateQuantity(){
        return changeCompensateQuantity;
    }

    /**
     * 设置属性改变后的退补无功电量
     * @param changeunCompensateQuantity 待设置的属性改变后的退补无功电量的值
     */
    public void setChangeunCompensateQuantity(String changeunCompensateQuantity){
        this.changeunCompensateQuantity = StringUtils.rightTrim(changeunCompensateQuantity);
    }

    /**
     * 获取属性改变后的退补无功电量
     * @return 属性改变后的退补无功电量的值
     */
    public String getChangeunCompensateQuantity(){
        return changeunCompensateQuantity;
    }

    /**
     * 设置属性改变前容量电量
     * @param rlquantityafbefore 待设置的属性改变前容量电量的值
     */
    public void setRlquantityafbefore(double rlquantityafbefore){
        this.rlquantityafbefore = rlquantityafbefore;
    }

    /**
     * 获取属性改变前容量电量
     * @return 属性改变前容量电量的值
     */
    public double getRlquantityafbefore(){
        return rlquantityafbefore;
    }

    /**
     * 设置属性改变后容量电量
     * @param rlquantityaf 待设置的属性改变后容量电量的值
     */
    public void setRlquantityaf(double rlquantityaf){
        this.rlquantityaf = rlquantityaf;
    }

    /**
     * 获取属性改变后容量电量
     * @return 属性改变后容量电量的值
     */
    public double getRlquantityaf(){
        return rlquantityaf;
    }

    /**
     * 设置属性改变后容量电价
     * @param rlpriceaf 待设置的属性改变后容量电价的值
     */
    public void setRlpriceaf(double rlpriceaf){
        this.rlpriceaf = rlpriceaf;
    }

    /**
     * 获取属性改变后容量电价
     * @return 属性改变后容量电价的值
     */
    public double getRlpriceaf(){
        return rlpriceaf;
    }

    /**
     * 设置属性改变后是否调价
     * @param chgpriceafflag 待设置的属性改变后是否调价的值
     */
    public void setChgpriceafflag(String chgpriceafflag){
        this.chgpriceafflag = StringUtils.rightTrim(chgpriceafflag);
    }

    /**
     * 获取属性改变后是否调价
     * @return 属性改变后是否调价的值
     */
    public String getChgpriceafflag(){
        return chgpriceafflag;
    }
}
