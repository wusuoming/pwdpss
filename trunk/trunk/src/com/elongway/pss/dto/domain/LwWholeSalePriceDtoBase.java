package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSalePrice-���ۼ۸������ݴ���������<br>
 */
public class LwWholeSalePriceDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** �����õ���� */
    private String powerClass = "";
    /** ������������ */
    private String saleArea = "";
    /** ������ʼ��ѹ */
    private double voltageBegin = 0D;
    /** ������ֹ��ѹ */
    private double voltageEnd = 0D;
    /** ���Ե��� */
    private double price = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwWholeSalePriceDtoBase����
     */
    public LwWholeSalePriceDtoBase(){
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
     * ����������������
     * @param saleArea �����õ��������������ֵ
     */
    public void setSaleArea(String saleArea){
        this.saleArea = StringUtils.rightTrim(saleArea);
    }

    /**
     * ��ȡ������������
     * @return �������������ֵ
     */
    public String getSaleArea(){
        return saleArea;
    }

    /**
     * ����������ʼ��ѹ
     * @param voltageBegin �����õ�������ʼ��ѹ��ֵ
     */
    public void setVoltageBegin(double voltageBegin){
        this.voltageBegin = voltageBegin;
    }

    /**
     * ��ȡ������ʼ��ѹ
     * @return ������ʼ��ѹ��ֵ
     */
    public double getVoltageBegin(){
        return voltageBegin;
    }

    /**
     * ����������ֹ��ѹ
     * @param voltageEnd �����õ�������ֹ��ѹ��ֵ
     */
    public void setVoltageEnd(double voltageEnd){
        this.voltageEnd = voltageEnd;
    }

    /**
     * ��ȡ������ֹ��ѹ
     * @return ������ֹ��ѹ��ֵ
     */
    public double getVoltageEnd(){
        return voltageEnd;
    }

    /**
     * �������Ե���
     * @param price �����õ����Ե��۵�ֵ
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * ��ȡ���Ե���
     * @return ���Ե��۵�ֵ
     */
    public double getPrice(){
        return price;
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
