package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWRateCode-������ά��������ݴ���������<br>
 */
public class LwRateCodeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Թ������� */
    private String powerFactor = "";
    /** �����޹�/�й��������� */
    private double upPowerRate = 0D;
    /** �����޹�/�й��������� */
    private double lowPowerRate = 0D;
    /** ���Թ������ʹ��� */
    private String suppleType = "";
    /** ���Ե����� */
    private String adjustRate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwRateCodeDtoBase����
     */
    public LwRateCodeDtoBase(){
    }

    /**
     * �������Թ�������
     * @param powerFactor �����õ����Թ���������ֵ
     */
    public void setPowerFactor(String powerFactor){
        this.powerFactor = StringUtils.rightTrim(powerFactor);
    }

    /**
     * ��ȡ���Թ�������
     * @return ���Թ���������ֵ
     */
    public String getPowerFactor(){
        return powerFactor;
    }

    /**
     * ���������޹�/�й���������
     * @param upPowerRate �����õ������޹�/�й��������޵�ֵ
     */
    public void setUpPowerRate(double upPowerRate){
        this.upPowerRate = upPowerRate;
    }

    /**
     * ��ȡ�����޹�/�й���������
     * @return �����޹�/�й��������޵�ֵ
     */
    public double getUpPowerRate(){
        return upPowerRate;
    }

    /**
     * ���������޹�/�й���������
     * @param lowPowerRate �����õ������޹�/�й��������޵�ֵ
     */
    public void setLowPowerRate(double lowPowerRate){
        this.lowPowerRate = lowPowerRate;
    }

    /**
     * ��ȡ�����޹�/�й���������
     * @return �����޹�/�й��������޵�ֵ
     */
    public double getLowPowerRate(){
        return lowPowerRate;
    }

    /**
     * �������Թ������ʹ���
     * @param suppleType �����õ����Թ������ʹ����ֵ
     */
    public void setSuppleType(String suppleType){
        this.suppleType = StringUtils.rightTrim(suppleType);
    }

    /**
     * ��ȡ���Թ������ʹ���
     * @return ���Թ������ʹ����ֵ
     */
    public String getSuppleType(){
        return suppleType;
    }

    /**
     * �������Ե�����
     * @param adjustRate �����õ����Ե����ʵ�ֵ
     */
    public void setAdjustRate(String adjustRate){
        this.adjustRate = StringUtils.rightTrim(adjustRate);
    }

    /**
     * ��ȡ���Ե�����
     * @return ���Ե����ʵ�ֵ
     */
    public String getAdjustRate(){
        return adjustRate;
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
