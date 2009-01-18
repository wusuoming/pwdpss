package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleIndicatorBak-���۵��ָ���¼���ݱ�����ݴ���������<br>
 */
public class LwWholeSaleIndicatorBakDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** �������� */
    private String statMonth = "";
    /** ���������й�ָ���� */
    private double lastWorkNum = 0D;
    /** ���Ե����й�ָ���� */
    private double thisWorkNum = 0D;
    /** ���������޹�ָ���� */
    private double lastIdleNum = 0D;
    /** ���Ե����޹�ָ���� */
    private double thisIdleNum = 0D;
    /** ���Ա��� */
    private double rate = 0D;
    /** ���Գ������� */
    private double readQuantity = 0D;
    /** �����쳣���� */
    private double excepQuantity = 0D;
    /** ���Ի������ */
    private double chgAmmeterQuantity = 0D;
    /** �����˲��޹����� */
    private double unCompensateQuantity = 0D;
    /** �����˲��й����� */
    private double compensateQuantity = 0D;
    /** �����޹�������� */
    private double unLineLossQuantity = 0D;
    /** �����й�������� */
    private double lineLossQuantity = 0D;
    /** �����޹�������� */
    private double unTransLossQuantity = 0D;
    /** �����й�������� */
    private double transLossQuantity = 0D;
    /** �����й����� */
    private String workQuantity = "";
    /** �����޹����� */
    private String unworkQuantity = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";
    /** ����¼������ */
    private String inputDate = "";
    /** ���Գ������� */
    private String readDate = "";
    /** ����������� */
    private double lossRate = 0D;
    /** ���Թ������� */
    private double powerCode = 0D;
    /** ���Ի����޹����� */
    private double unChgAmmeterQuantity = 0D;
    /** �����Ƿ���� */
    private String ifCal = "";
    /** ���Բ����� */
    private String differenceQuantity = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwWholeSaleIndicatorBakDtoBase����
     */
    public LwWholeSaleIndicatorBakDtoBase(){
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
     * ���������˲��޹�����
     * @param unCompensateQuantity �����õ������˲��޹�������ֵ
     */
    public void setUnCompensateQuantity(double unCompensateQuantity){
        this.unCompensateQuantity = unCompensateQuantity;
    }

    /**
     * ��ȡ�����˲��޹�����
     * @return �����˲��޹�������ֵ
     */
    public double getUnCompensateQuantity(){
        return unCompensateQuantity;
    }

    /**
     * ���������˲��й�����
     * @param compensateQuantity �����õ������˲��й�������ֵ
     */
    public void setCompensateQuantity(double compensateQuantity){
        this.compensateQuantity = compensateQuantity;
    }

    /**
     * ��ȡ�����˲��й�����
     * @return �����˲��й�������ֵ
     */
    public double getCompensateQuantity(){
        return compensateQuantity;
    }

    /**
     * ���������޹��������
     * @param unLineLossQuantity �����õ������޹����������ֵ
     */
    public void setUnLineLossQuantity(double unLineLossQuantity){
        this.unLineLossQuantity = unLineLossQuantity;
    }

    /**
     * ��ȡ�����޹��������
     * @return �����޹����������ֵ
     */
    public double getUnLineLossQuantity(){
        return unLineLossQuantity;
    }

    /**
     * ���������й��������
     * @param lineLossQuantity �����õ������й����������ֵ
     */
    public void setLineLossQuantity(double lineLossQuantity){
        this.lineLossQuantity = lineLossQuantity;
    }

    /**
     * ��ȡ�����й��������
     * @return �����й����������ֵ
     */
    public double getLineLossQuantity(){
        return lineLossQuantity;
    }

    /**
     * ���������޹��������
     * @param unTransLossQuantity �����õ������޹����������ֵ
     */
    public void setUnTransLossQuantity(double unTransLossQuantity){
        this.unTransLossQuantity = unTransLossQuantity;
    }

    /**
     * ��ȡ�����޹��������
     * @return �����޹����������ֵ
     */
    public double getUnTransLossQuantity(){
        return unTransLossQuantity;
    }

    /**
     * ���������й��������
     * @param transLossQuantity �����õ������й����������ֵ
     */
    public void setTransLossQuantity(double transLossQuantity){
        this.transLossQuantity = transLossQuantity;
    }

    /**
     * ��ȡ�����й��������
     * @return �����й����������ֵ
     */
    public double getTransLossQuantity(){
        return transLossQuantity;
    }

    /**
     * ���������й�����
     * @param workQuantity �����õ������й�������ֵ
     */
    public void setWorkQuantity(String workQuantity){
        this.workQuantity = StringUtils.rightTrim(workQuantity);
    }

    /**
     * ��ȡ�����й�����
     * @return �����й�������ֵ
     */
    public String getWorkQuantity(){
        return workQuantity;
    }

    /**
     * ���������޹�����
     * @param unworkQuantity �����õ������޹�������ֵ
     */
    public void setUnworkQuantity(String unworkQuantity){
        this.unworkQuantity = StringUtils.rightTrim(unworkQuantity);
    }

    /**
     * ��ȡ�����޹�����
     * @return �����޹�������ֵ
     */
    public String getUnworkQuantity(){
        return unworkQuantity;
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
     * ���������������
     * @param lossRate �����õ��������������ֵ
     */
    public void setLossRate(double lossRate){
        this.lossRate = lossRate;
    }

    /**
     * ��ȡ�����������
     * @return �������������ֵ
     */
    public double getLossRate(){
        return lossRate;
    }

    /**
     * �������Թ�������
     * @param powerCode �����õ����Թ������ص�ֵ
     */
    public void setPowerCode(double powerCode){
        this.powerCode = powerCode;
    }

    /**
     * ��ȡ���Թ�������
     * @return ���Թ������ص�ֵ
     */
    public double getPowerCode(){
        return powerCode;
    }

    /**
     * �������Ի����޹�����
     * @param unChgAmmeterQuantity �����õ����Ի����޹�������ֵ
     */
    public void setUnChgAmmeterQuantity(double unChgAmmeterQuantity){
        this.unChgAmmeterQuantity = unChgAmmeterQuantity;
    }

    /**
     * ��ȡ���Ի����޹�����
     * @return ���Ի����޹�������ֵ
     */
    public double getUnChgAmmeterQuantity(){
        return unChgAmmeterQuantity;
    }

    /**
     * ���������Ƿ����
     * @param ifCal �����õ������Ƿ���ѵ�ֵ
     */
    public void setIfCal(String ifCal){
        this.ifCal = StringUtils.rightTrim(ifCal);
    }

    /**
     * ��ȡ�����Ƿ����
     * @return �����Ƿ���ѵ�ֵ
     */
    public String getIfCal(){
        return ifCal;
    }

    /**
     * �������Բ�����
     * @param differenceQuantity �����õ����Բ�������ֵ
     */
    public void setDifferenceQuantity(String differenceQuantity){
        this.differenceQuantity = StringUtils.rightTrim(differenceQuantity);
    }

    /**
     * ��ȡ���Բ�����
     * @return ���Բ�������ֵ
     */
    public String getDifferenceQuantity(){
        return differenceQuantity;
    }
}
