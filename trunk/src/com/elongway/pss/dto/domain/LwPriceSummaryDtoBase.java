package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPriceSummary-��Ѽ����ܱ�����ݴ���������<br>
 */
public class LwPriceSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������·���� */
    private String lineCode = "";
    /** ����ͳ������ */
    private String statMonth = "";
    /** �����õ���� */
    private String powerClass = "";
    /** ���Ե��� */
    private double electricQuantity = 0D;
    /** ���Ե�� */
    private double electricFee = 0D;
    /** ���Ե�� */
    private double loan = 0D;
    /** ������Ͽ */
    private double sanXiaFee = 0D;
    /** ���Ի��� */
    private double surcharge = 0D;
    /** ���Ժϼ� */
    private double sumFee = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwPriceSummaryDtoBase����
     */
    public LwPriceSummaryDtoBase(){
    }

    /**
     * ����������·����
     * @param lineCode �����õ�������·�����ֵ
     */
    public void setLineCode(String lineCode){
        this.lineCode = StringUtils.rightTrim(lineCode);
    }

    /**
     * ��ȡ������·����
     * @return ������·�����ֵ
     */
    public String getLineCode(){
        return lineCode;
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
     * ���������õ����
     * @param powerClass �����õ������õ�����ֵ
     */
    public void setPowerClass(String powerClass){
        this.powerClass = StringUtils.rightTrim(powerClass);
    }

    /**
     * ��ȡ�����õ����
     * @return �����õ�����ֵ
     */
    public String getPowerClass(){
        return powerClass;
    }

    /**
     * �������Ե���
     * @param electricQuantity �����õ����Ե�����ֵ
     */
    public void setElectricQuantity(double electricQuantity){
        this.electricQuantity = electricQuantity;
    }

    /**
     * ��ȡ���Ե���
     * @return ���Ե�����ֵ
     */
    public double getElectricQuantity(){
        return electricQuantity;
    }

    /**
     * �������Ե��
     * @param electricFee �����õ����Ե�ѵ�ֵ
     */
    public void setElectricFee(double electricFee){
        this.electricFee = electricFee;
    }

    /**
     * ��ȡ���Ե��
     * @return ���Ե�ѵ�ֵ
     */
    public double getElectricFee(){
        return electricFee;
    }

    /**
     * �������Ե��
     * @param loan �����õ����Ե���ֵ
     */
    public void setLoan(double loan){
        this.loan = loan;
    }

    /**
     * ��ȡ���Ե��
     * @return ���Ե���ֵ
     */
    public double getLoan(){
        return loan;
    }

    /**
     * ����������Ͽ
     * @param sanXiaFee �����õ�������Ͽ��ֵ
     */
    public void setSanXiaFee(double sanXiaFee){
        this.sanXiaFee = sanXiaFee;
    }

    /**
     * ��ȡ������Ͽ
     * @return ������Ͽ��ֵ
     */
    public double getSanXiaFee(){
        return sanXiaFee;
    }

    /**
     * �������Ի���
     * @param surcharge �����õ����Ի����ֵ
     */
    public void setSurcharge(double surcharge){
        this.surcharge = surcharge;
    }

    /**
     * ��ȡ���Ի���
     * @return ���Ի����ֵ
     */
    public double getSurcharge(){
        return surcharge;
    }

    /**
     * �������Ժϼ�
     * @param sumFee �����õ����ԺϼƵ�ֵ
     */
    public void setSumFee(double sumFee){
        this.sumFee = sumFee;
    }

    /**
     * ��ȡ���Ժϼ�
     * @return ���ԺϼƵ�ֵ
     */
    public double getSumFee(){
        return sumFee;
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
