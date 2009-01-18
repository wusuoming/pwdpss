package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownPriceSummaryAppend-ֱ����׷�ӵ�Ѽ����ܱ�����ݴ���������<br>
 */
public class LwTownPriceSummaryAppendDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ����ͳ������ */
    private String statMonth = "";
    /** ����¼������ */
    private String inputDate = "";
    /** ����׷��ũ���� */
    private double appendFarmFee = 0D;
    /** ����׷�ӹ�ҵ��� */
    private double appendIndustryFee = 0D;
    /** ����׷��������� */
    private double appendProduceFee = 0D;
    /** ����׷����ҵ��� */
    private double appendBizFee = 0D;
    /** ����׷�ӷǾ����� */
    private double appendNotPeopleFee = 0D;
    /** ����׷�վ����� */
    private double appendPeopleFee = 0D;
    /** ����׷�ӵ�� */
    private double appendCalPowerFee = 0D;
    /** ����׷�Ӽ������ */
    private double appendCalQuantity = 0D;
    /** ����׷��ũҵ���� */
    private double appendLoan = 0D;
    /** ����׷����Ͽ */
    private double appendSanXia = 0D;
    /** ����׷�տ�������Դ���ӷ� */
    private double appendKZS = 0D;
    /** ����׷�տ���������� */
    private double appendKuQu = 0D;
    /** ���Ի���ϼ� */
    private double appendJiJin = 0D;
    /** ����׷�յ�Ѻϼ� */
    private double sumAppendFee = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwTownPriceSummaryAppendDtoBase����
     */
    public LwTownPriceSummaryAppendDtoBase(){
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
     * ��������ͳ������
     * @param statMonth �����õ�����ͳ�����µ�ֵ
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * ��ȡ����ͳ������
     * @return ����ͳ�����µ�ֵ
     */
    public String getStatMonth(){
        return statMonth;
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
     * ��������׷��ũ����
     * @param appendFarmFee �����õ�����׷��ũ���ѵ�ֵ
     */
    public void setAppendFarmFee(double appendFarmFee){
        this.appendFarmFee = appendFarmFee;
    }

    /**
     * ��ȡ����׷��ũ����
     * @return ����׷��ũ���ѵ�ֵ
     */
    public double getAppendFarmFee(){
        return appendFarmFee;
    }

    /**
     * ��������׷�ӹ�ҵ���
     * @param appendIndustryFee �����õ�����׷�ӹ�ҵ��ѵ�ֵ
     */
    public void setAppendIndustryFee(double appendIndustryFee){
        this.appendIndustryFee = appendIndustryFee;
    }

    /**
     * ��ȡ����׷�ӹ�ҵ���
     * @return ����׷�ӹ�ҵ��ѵ�ֵ
     */
    public double getAppendIndustryFee(){
        return appendIndustryFee;
    }

    /**
     * ��������׷���������
     * @param appendProduceFee �����õ�����׷��������ѵ�ֵ
     */
    public void setAppendProduceFee(double appendProduceFee){
        this.appendProduceFee = appendProduceFee;
    }

    /**
     * ��ȡ����׷���������
     * @return ����׷��������ѵ�ֵ
     */
    public double getAppendProduceFee(){
        return appendProduceFee;
    }

    /**
     * ��������׷����ҵ���
     * @param appendBizFee �����õ�����׷����ҵ��ѵ�ֵ
     */
    public void setAppendBizFee(double appendBizFee){
        this.appendBizFee = appendBizFee;
    }

    /**
     * ��ȡ����׷����ҵ���
     * @return ����׷����ҵ��ѵ�ֵ
     */
    public double getAppendBizFee(){
        return appendBizFee;
    }

    /**
     * ��������׷�ӷǾ�����
     * @param appendNotPeopleFee �����õ�����׷�ӷǾ����ѵ�ֵ
     */
    public void setAppendNotPeopleFee(double appendNotPeopleFee){
        this.appendNotPeopleFee = appendNotPeopleFee;
    }

    /**
     * ��ȡ����׷�ӷǾ�����
     * @return ����׷�ӷǾ����ѵ�ֵ
     */
    public double getAppendNotPeopleFee(){
        return appendNotPeopleFee;
    }

    /**
     * ��������׷�վ�����
     * @param appendPeopleFee �����õ�����׷�վ����ѵ�ֵ
     */
    public void setAppendPeopleFee(double appendPeopleFee){
        this.appendPeopleFee = appendPeopleFee;
    }

    /**
     * ��ȡ����׷�վ�����
     * @return ����׷�վ����ѵ�ֵ
     */
    public double getAppendPeopleFee(){
        return appendPeopleFee;
    }

    /**
     * ��������׷�ӵ��
     * @param appendCalPowerFee �����õ�����׷�ӵ�ѵ�ֵ
     */
    public void setAppendCalPowerFee(double appendCalPowerFee){
        this.appendCalPowerFee = appendCalPowerFee;
    }

    /**
     * ��ȡ����׷�ӵ��
     * @return ����׷�ӵ�ѵ�ֵ
     */
    public double getAppendCalPowerFee(){
        return appendCalPowerFee;
    }

    /**
     * ��������׷�Ӽ������
     * @param appendCalQuantity �����õ�����׷�Ӽ��������ֵ
     */
    public void setAppendCalQuantity(double appendCalQuantity){
        this.appendCalQuantity = appendCalQuantity;
    }

    /**
     * ��ȡ����׷�Ӽ������
     * @return ����׷�Ӽ��������ֵ
     */
    public double getAppendCalQuantity(){
        return appendCalQuantity;
    }

    /**
     * ��������׷��ũҵ����
     * @param appendLoan �����õ�����׷��ũҵ������ֵ
     */
    public void setAppendLoan(double appendLoan){
        this.appendLoan = appendLoan;
    }

    /**
     * ��ȡ����׷��ũҵ����
     * @return ����׷��ũҵ������ֵ
     */
    public double getAppendLoan(){
        return appendLoan;
    }

    /**
     * ��������׷����Ͽ
     * @param appendSanXia �����õ�����׷����Ͽ��ֵ
     */
    public void setAppendSanXia(double appendSanXia){
        this.appendSanXia = appendSanXia;
    }

    /**
     * ��ȡ����׷����Ͽ
     * @return ����׷����Ͽ��ֵ
     */
    public double getAppendSanXia(){
        return appendSanXia;
    }

    /**
     * ��������׷�տ�������Դ���ӷ�
     * @param appendKZS �����õ�����׷�տ�������Դ���ӷѵ�ֵ
     */
    public void setAppendKZS(double appendKZS){
        this.appendKZS = appendKZS;
    }

    /**
     * ��ȡ����׷�տ�������Դ���ӷ�
     * @return ����׷�տ�������Դ���ӷѵ�ֵ
     */
    public double getAppendKZS(){
        return appendKZS;
    }

    /**
     * ��������׷�տ����������
     * @param appendKuQu �����õ�����׷�տ�����������ֵ
     */
    public void setAppendKuQu(double appendKuQu){
        this.appendKuQu = appendKuQu;
    }

    /**
     * ��ȡ����׷�տ����������
     * @return ����׷�տ�����������ֵ
     */
    public double getAppendKuQu(){
        return appendKuQu;
    }

    /**
     * �������Ի���ϼ�
     * @param appendJiJin �����õ����Ի���ϼƵ�ֵ
     */
    public void setAppendJiJin(double appendJiJin){
        this.appendJiJin = appendJiJin;
    }

    /**
     * ��ȡ���Ի���ϼ�
     * @return ���Ի���ϼƵ�ֵ
     */
    public double getAppendJiJin(){
        return appendJiJin;
    }

    /**
     * ��������׷�յ�Ѻϼ�
     * @param sumAppendFee �����õ�����׷�յ�ѺϼƵ�ֵ
     */
    public void setSumAppendFee(double sumAppendFee){
        this.sumAppendFee = sumAppendFee;
    }

    /**
     * ��ȡ����׷�յ�Ѻϼ�
     * @return ����׷�յ�ѺϼƵ�ֵ
     */
    public double getSumAppendFee(){
        return sumAppendFee;
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
}
