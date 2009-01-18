package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWFactoryIndicator-��ҵ���ָ���¼������ݴ���������<br>
 */
public class LwFactoryIndicatorDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ���Գ������� */
    private String readDate = "";
    /** ����¼������ */
    private String inputDate = "";
    /** �������� */
    private String statMonth = "";
    /** ���Ե����й�ָ���� */
    private double thisWorkNum = 0D;
    /** ���������й�ָ���� */
    private double lastWorkNum = 0D;
    /** ���Ե����޹�ָ���� */
    private double thisIdleNum = 0D;
    /** ���������޹�ָ���� */
    private double lastIdleNum = 0D;
    /** ���Ա��� */
    private double rate = 0D;
    /** ���Գ������� */
    private double readQuantity = 0D;
    /** �����쳣���� */
    private double excepQuantity = 0D;
    /** ���Ի������ */
    private double chgAmmeterQuantity = 0D;
    /** �����˲����� */
    private double compensateQuantity = 0D;
    /** ����������� */
    private double lineLossQuantity = 0D;
    /** ���Ա������ */
    private double transLossQuantity = 0D;
    /** ������������ */
    private double needQuantity = 0D;
    /** ������������ */
    private double rongliangQuantity = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ծ������й�ָ���� */
    private double peopleThisWorkNum = 0D;
    /** ���Ծ��������й�ָ���� */
    private double peopleLastWorkNum = 0D;
    /** ���Ծ������޹�ָ���� */
    private double peopleThisIdleNum = 0D;
    /** ���Ծ��������޹�ָ���� */
    private double peopleLastIdleNum = 0D;
    /** ���Ծ����� */
    private double peopleRate = 0D;
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";
    /** ���Ծ������ */
    private double peopleQuantity = 0D;
    /** ���Ի����޹����� */
    private String unChgAmmeterQuantity = "";
    /** ���Ծ��񻻱���� */
    private String pepoleUnChgAmmeterQuantity = "";
    /** �����û��� */
    private String username = "";
    /** ���Ե������ */
    private String ammeterStyle = "";
    /** �����Ƿ���ͣ�������� */
    private String ifChange = "";
    /** ����״̬�ı�ʱ��ָ�� */
    private double changePointer = 0D;
    /** ���Ա仯ǰ��״̬ */
    private String changeBefore = "";
    /** ���Ա仯���״̬ */
    private String changeAfter = "";
    /** ���Ա仯ǰ������ */
    private String day = "";
    /** ���Ա仯������� */
    private String changeday = "";
    /** ���Ըı������ */
    private String changeDate = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwFactoryIndicatorDtoBase����
     */
    public LwFactoryIndicatorDtoBase(){
    }

    /**
     * �������Ի���
     * @param userNo �����õ����Ի��ŵ�ֵ
     */
    public void setUserNo(String userNo){
        this.userNo = StringUtils.rightTrim(userNo);
    }

    /**
     * ��ȡ���Ի���
     * @return ���Ի��ŵ�ֵ
     */
    public String getUserNo(){
        return userNo;
    }

    /**
     * �������Գ�������
     * @param readDate �����õ����Գ������ڵ�ֵ
     */
    public void setReadDate(String readDate){
        this.readDate = StringUtils.rightTrim(readDate);
    }

    /**
     * ��ȡ���Գ�������
     * @return ���Գ������ڵ�ֵ
     */
    public String getReadDate(){
        return readDate;
    }

    /**
     * ��������¼������
     * @param inputDate �����õ�����¼�����ڵ�ֵ
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * ��ȡ����¼������
     * @return ����¼�����ڵ�ֵ
     */
    public String getInputDate(){
        return inputDate;
    }

    /**
     * ������������
     * @param statMonth �����õ��������ڵ�ֵ
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * ��ȡ��������
     * @return �������ڵ�ֵ
     */
    public String getStatMonth(){
        return statMonth;
    }

    /**
     * �������Ե����й�ָ����
     * @param thisWorkNum �����õ����Ե����й�ָ������ֵ
     */
    public void setThisWorkNum(double thisWorkNum){
        this.thisWorkNum = thisWorkNum;
    }

    /**
     * ��ȡ���Ե����й�ָ����
     * @return ���Ե����й�ָ������ֵ
     */
    public double getThisWorkNum(){
        return thisWorkNum;
    }

    /**
     * �������������й�ָ����
     * @param lastWorkNum �����õ����������й�ָ������ֵ
     */
    public void setLastWorkNum(double lastWorkNum){
        this.lastWorkNum = lastWorkNum;
    }

    /**
     * ��ȡ���������й�ָ����
     * @return ���������й�ָ������ֵ
     */
    public double getLastWorkNum(){
        return lastWorkNum;
    }

    /**
     * �������Ե����޹�ָ����
     * @param thisIdleNum �����õ����Ե����޹�ָ������ֵ
     */
    public void setThisIdleNum(double thisIdleNum){
        this.thisIdleNum = thisIdleNum;
    }

    /**
     * ��ȡ���Ե����޹�ָ����
     * @return ���Ե����޹�ָ������ֵ
     */
    public double getThisIdleNum(){
        return thisIdleNum;
    }

    /**
     * �������������޹�ָ����
     * @param lastIdleNum �����õ����������޹�ָ������ֵ
     */
    public void setLastIdleNum(double lastIdleNum){
        this.lastIdleNum = lastIdleNum;
    }

    /**
     * ��ȡ���������޹�ָ����
     * @return ���������޹�ָ������ֵ
     */
    public double getLastIdleNum(){
        return lastIdleNum;
    }

    /**
     * �������Ա���
     * @param rate �����õ����Ա��ʵ�ֵ
     */
    public void setRate(double rate){
        this.rate = rate;
    }

    /**
     * ��ȡ���Ա���
     * @return ���Ա��ʵ�ֵ
     */
    public double getRate(){
        return rate;
    }

    /**
     * �������Գ�������
     * @param readQuantity �����õ����Գ���������ֵ
     */
    public void setReadQuantity(double readQuantity){
        this.readQuantity = readQuantity;
    }

    /**
     * ��ȡ���Գ�������
     * @return ���Գ���������ֵ
     */
    public double getReadQuantity(){
        return readQuantity;
    }

    /**
     * ���������쳣����
     * @param excepQuantity �����õ������쳣������ֵ
     */
    public void setExcepQuantity(double excepQuantity){
        this.excepQuantity = excepQuantity;
    }

    /**
     * ��ȡ�����쳣����
     * @return �����쳣������ֵ
     */
    public double getExcepQuantity(){
        return excepQuantity;
    }

    /**
     * �������Ի������
     * @param chgAmmeterQuantity �����õ����Ի��������ֵ
     */
    public void setChgAmmeterQuantity(double chgAmmeterQuantity){
        this.chgAmmeterQuantity = chgAmmeterQuantity;
    }

    /**
     * ��ȡ���Ի������
     * @return ���Ի��������ֵ
     */
    public double getChgAmmeterQuantity(){
        return chgAmmeterQuantity;
    }

    /**
     * ���������˲�����
     * @param compensateQuantity �����õ������˲�������ֵ
     */
    public void setCompensateQuantity(double compensateQuantity){
        this.compensateQuantity = compensateQuantity;
    }

    /**
     * ��ȡ�����˲�����
     * @return �����˲�������ֵ
     */
    public double getCompensateQuantity(){
        return compensateQuantity;
    }

    /**
     * ���������������
     * @param lineLossQuantity �����õ��������������ֵ
     */
    public void setLineLossQuantity(double lineLossQuantity){
        this.lineLossQuantity = lineLossQuantity;
    }

    /**
     * ��ȡ�����������
     * @return �������������ֵ
     */
    public double getLineLossQuantity(){
        return lineLossQuantity;
    }

    /**
     * �������Ա������
     * @param transLossQuantity �����õ����Ա��������ֵ
     */
    public void setTransLossQuantity(double transLossQuantity){
        this.transLossQuantity = transLossQuantity;
    }

    /**
     * ��ȡ���Ա������
     * @return ���Ա��������ֵ
     */
    public double getTransLossQuantity(){
        return transLossQuantity;
    }

    /**
     * ����������������
     * @param needQuantity �����õ���������������ֵ
     */
    public void setNeedQuantity(double needQuantity){
        this.needQuantity = needQuantity;
    }

    /**
     * ��ȡ������������
     * @return ��������������ֵ
     */
    public double getNeedQuantity(){
        return needQuantity;
    }

    /**
     * ����������������
     * @param rongliangQuantity �����õ���������������ֵ
     */
    public void setRongliangQuantity(double rongliangQuantity){
        this.rongliangQuantity = rongliangQuantity;
    }

    /**
     * ��ȡ������������
     * @return ��������������ֵ
     */
    public double getRongliangQuantity(){
        return rongliangQuantity;
    }

    /**
     * ���������Ƿ���Ч
     * @param validStatus �����õ������Ƿ���Ч��ֵ
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * ��ȡ�����Ƿ���Ч
     * @return �����Ƿ���Ч��ֵ
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * �������Ծ������й�ָ����
     * @param peopleThisWorkNum �����õ����Ծ������й�ָ������ֵ
     */
    public void setPeopleThisWorkNum(double peopleThisWorkNum){
        this.peopleThisWorkNum = peopleThisWorkNum;
    }

    /**
     * ��ȡ���Ծ������й�ָ����
     * @return ���Ծ������й�ָ������ֵ
     */
    public double getPeopleThisWorkNum(){
        return peopleThisWorkNum;
    }

    /**
     * �������Ծ��������й�ָ����
     * @param peopleLastWorkNum �����õ����Ծ��������й�ָ������ֵ
     */
    public void setPeopleLastWorkNum(double peopleLastWorkNum){
        this.peopleLastWorkNum = peopleLastWorkNum;
    }

    /**
     * ��ȡ���Ծ��������й�ָ����
     * @return ���Ծ��������й�ָ������ֵ
     */
    public double getPeopleLastWorkNum(){
        return peopleLastWorkNum;
    }

    /**
     * �������Ծ������޹�ָ����
     * @param peopleThisIdleNum �����õ����Ծ������޹�ָ������ֵ
     */
    public void setPeopleThisIdleNum(double peopleThisIdleNum){
        this.peopleThisIdleNum = peopleThisIdleNum;
    }

    /**
     * ��ȡ���Ծ������޹�ָ����
     * @return ���Ծ������޹�ָ������ֵ
     */
    public double getPeopleThisIdleNum(){
        return peopleThisIdleNum;
    }

    /**
     * �������Ծ��������޹�ָ����
     * @param peopleLastIdleNum �����õ����Ծ��������޹�ָ������ֵ
     */
    public void setPeopleLastIdleNum(double peopleLastIdleNum){
        this.peopleLastIdleNum = peopleLastIdleNum;
    }

    /**
     * ��ȡ���Ծ��������޹�ָ����
     * @return ���Ծ��������޹�ָ������ֵ
     */
    public double getPeopleLastIdleNum(){
        return peopleLastIdleNum;
    }

    /**
     * �������Ծ�����
     * @param peopleRate �����õ����Ծ����ʵ�ֵ
     */
    public void setPeopleRate(double peopleRate){
        this.peopleRate = peopleRate;
    }

    /**
     * ��ȡ���Ծ�����
     * @return ���Ծ����ʵ�ֵ
     */
    public double getPeopleRate(){
        return peopleRate;
    }

    /**
     * �������Ա�־
     * @param flag �����õ����Ա�־��ֵ
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * ��ȡ���Ա�־
     * @return ���Ա�־��ֵ
     */
    public String getFlag(){
        return flag;
    }

    /**
     * ��������ע��
     * @param remark �����õ�����ע�͵�ֵ
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * ��ȡ����ע��
     * @return ����ע�͵�ֵ
     */
    public String getRemark(){
        return remark;
    }

    /**
     * �������Ծ������
     * @param peopleQuantity �����õ����Ծ��������ֵ
     */
    public void setPeopleQuantity(double peopleQuantity){
        this.peopleQuantity = peopleQuantity;
    }

    /**
     * ��ȡ���Ծ������
     * @return ���Ծ��������ֵ
     */
    public double getPeopleQuantity(){
        return peopleQuantity;
    }

    /**
     * �������Ի����޹�����
     * @param unChgAmmeterQuantity �����õ����Ի����޹�������ֵ
     */
    public void setUnChgAmmeterQuantity(String unChgAmmeterQuantity){
        this.unChgAmmeterQuantity = StringUtils.rightTrim(unChgAmmeterQuantity);
    }

    /**
     * ��ȡ���Ի����޹�����
     * @return ���Ի����޹�������ֵ
     */
    public String getUnChgAmmeterQuantity(){
        return unChgAmmeterQuantity;
    }

    /**
     * �������Ծ��񻻱����
     * @param pepoleUnChgAmmeterQuantity �����õ����Ծ��񻻱������ֵ
     */
    public void setPepoleUnChgAmmeterQuantity(String pepoleUnChgAmmeterQuantity){
        this.pepoleUnChgAmmeterQuantity = StringUtils.rightTrim(pepoleUnChgAmmeterQuantity);
    }

    /**
     * ��ȡ���Ծ��񻻱����
     * @return ���Ծ��񻻱������ֵ
     */
    public String getPepoleUnChgAmmeterQuantity(){
        return pepoleUnChgAmmeterQuantity;
    }

    /**
     * ���������û���
     * @param username �����õ������û�����ֵ
     */
    public void setUsername(String username){
        this.username = StringUtils.rightTrim(username);
    }

    /**
     * ��ȡ�����û���
     * @return �����û�����ֵ
     */
    public String getUsername(){
        return username;
    }

    /**
     * �������Ե������
     * @param ammeterStyle �����õ����Ե�����͵�ֵ
     */
    public void setAmmeterStyle(String ammeterStyle){
        this.ammeterStyle = StringUtils.rightTrim(ammeterStyle);
    }

    /**
     * ��ȡ���Ե������
     * @return ���Ե�����͵�ֵ
     */
    public String getAmmeterStyle(){
        return ammeterStyle;
    }

    /**
     * ���������Ƿ���ͣ��������
     * @param ifChange �����õ������Ƿ���ͣ����������ֵ
     */
    public void setIfChange(String ifChange){
        this.ifChange = StringUtils.rightTrim(ifChange);
    }

    /**
     * ��ȡ�����Ƿ���ͣ��������
     * @return �����Ƿ���ͣ����������ֵ
     */
    public String getIfChange(){
        return ifChange;
    }

    /**
     * ��������״̬�ı�ʱ��ָ��
     * @param changePointer �����õ�����״̬�ı�ʱ��ָ���ֵ
     */
    public void setChangePointer(double changePointer){
        this.changePointer = changePointer;
    }

    /**
     * ��ȡ����״̬�ı�ʱ��ָ��
     * @return ����״̬�ı�ʱ��ָ���ֵ
     */
    public double getChangePointer(){
        return changePointer;
    }

    /**
     * �������Ա仯ǰ��״̬
     * @param changeBefore �����õ����Ա仯ǰ��״̬��ֵ
     */
    public void setChangeBefore(String changeBefore){
        this.changeBefore = StringUtils.rightTrim(changeBefore);
    }

    /**
     * ��ȡ���Ա仯ǰ��״̬
     * @return ���Ա仯ǰ��״̬��ֵ
     */
    public String getChangeBefore(){
        return changeBefore;
    }

    /**
     * �������Ա仯���״̬
     * @param changeAfter �����õ����Ա仯���״̬��ֵ
     */
    public void setChangeAfter(String changeAfter){
        this.changeAfter = StringUtils.rightTrim(changeAfter);
    }

    /**
     * ��ȡ���Ա仯���״̬
     * @return ���Ա仯���״̬��ֵ
     */
    public String getChangeAfter(){
        return changeAfter;
    }

    /**
     * �������Ա仯ǰ������
     * @param day �����õ����Ա仯ǰ��������ֵ
     */
    public void setDay(String day){
        this.day = StringUtils.rightTrim(day);
    }

    /**
     * ��ȡ���Ա仯ǰ������
     * @return ���Ա仯ǰ��������ֵ
     */
    public String getDay(){
        return day;
    }

    /**
     * �������Ա仯�������
     * @param changeday �����õ����Ա仯���������ֵ
     */
    public void setChangeday(String changeday){
        this.changeday = StringUtils.rightTrim(changeday);
    }

    /**
     * ��ȡ���Ա仯�������
     * @return ���Ա仯���������ֵ
     */
    public String getChangeday(){
        return changeday;
    }

    /**
     * �������Ըı������
     * @param changeDate �����õ����Ըı�����ڵ�ֵ
     */
    public void setChangeDate(String changeDate){
        this.changeDate = StringUtils.rightTrim(changeDate);
    }

    /**
     * ��ȡ���Ըı������
     * @return ���Ըı�����ڵ�ֵ
     */
    public String getChangeDate(){
        return changeDate;
    }
}
