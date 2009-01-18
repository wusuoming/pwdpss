package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����Transfor-��ѹ����Ϣ�����ݴ���������<br>
 */
public class TransforDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ա�ѹ������ */
    private String transforName = "";
    /** ���Ե绰 */
    private String phone = "";
    /** ���Ա�ѹ��������� */
    private double kongzaiLoss = 0D;
    /** ������������ʱ�� */
    private double suplyHour = 0D;
    /** ���Զ������·��� */
    private double duanluLoss = 0D;
    /** ���Զ���� */
    private double contentPower = 0D;
    /** �����õ�ʱ�� */
    private double useHour = 0D;
    /** ���Կ��ص��� */
    private double kongzaiCT = 0D;
    /** ���Զ�·��ѹ */
    private double duanluPT = 0D;
    /** ������Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�TransforDtoBase����
     */
    public TransforDtoBase(){
    }

    /**
     * �������Ա�ѹ������
     * @param transforName �����õ����Ա�ѹ�����Ƶ�ֵ
     */
    public void setTransforName(String transforName){
        this.transforName = StringUtils.rightTrim(transforName);
    }

    /**
     * ��ȡ���Ա�ѹ������
     * @return ���Ա�ѹ�����Ƶ�ֵ
     */
    public String getTransforName(){
        return transforName;
    }

    /**
     * �������Ե绰
     * @param phone �����õ����Ե绰��ֵ
     */
    public void setPhone(String phone){
        this.phone = StringUtils.rightTrim(phone);
    }

    /**
     * ��ȡ���Ե绰
     * @return ���Ե绰��ֵ
     */
    public String getPhone(){
        return phone;
    }

    /**
     * �������Ա�ѹ���������
     * @param kongzaiLoss �����õ����Ա�ѹ��������ĵ�ֵ
     */
    public void setKongzaiLoss(double kongzaiLoss){
        this.kongzaiLoss = kongzaiLoss;
    }

    /**
     * ��ȡ���Ա�ѹ���������
     * @return ���Ա�ѹ��������ĵ�ֵ
     */
    public double getKongzaiLoss(){
        return kongzaiLoss;
    }

    /**
     * ����������������ʱ��
     * @param suplyHour �����õ�������������ʱ���ֵ
     */
    public void setSuplyHour(double suplyHour){
        this.suplyHour = suplyHour;
    }

    /**
     * ��ȡ������������ʱ��
     * @return ������������ʱ���ֵ
     */
    public double getSuplyHour(){
        return suplyHour;
    }

    /**
     * �������Զ������·���
     * @param duanluLoss �����õ����Զ������·��ĵ�ֵ
     */
    public void setDuanluLoss(double duanluLoss){
        this.duanluLoss = duanluLoss;
    }

    /**
     * ��ȡ���Զ������·���
     * @return ���Զ������·��ĵ�ֵ
     */
    public double getDuanluLoss(){
        return duanluLoss;
    }

    /**
     * �������Զ����
     * @param contentPower �����õ����Զ������ֵ
     */
    public void setContentPower(double contentPower){
        this.contentPower = contentPower;
    }

    /**
     * ��ȡ���Զ����
     * @return ���Զ������ֵ
     */
    public double getContentPower(){
        return contentPower;
    }

    /**
     * ���������õ�ʱ��
     * @param useHour �����õ������õ�ʱ���ֵ
     */
    public void setUseHour(double useHour){
        this.useHour = useHour;
    }

    /**
     * ��ȡ�����õ�ʱ��
     * @return �����õ�ʱ���ֵ
     */
    public double getUseHour(){
        return useHour;
    }

    /**
     * �������Կ��ص���
     * @param kongzaiCT �����õ����Կ��ص�����ֵ
     */
    public void setKongzaiCT(double kongzaiCT){
        this.kongzaiCT = kongzaiCT;
    }

    /**
     * ��ȡ���Կ��ص���
     * @return ���Կ��ص�����ֵ
     */
    public double getKongzaiCT(){
        return kongzaiCT;
    }

    /**
     * �������Զ�·��ѹ
     * @param duanluPT �����õ����Զ�·��ѹ��ֵ
     */
    public void setDuanluPT(double duanluPT){
        this.duanluPT = duanluPT;
    }

    /**
     * ��ȡ���Զ�·��ѹ
     * @return ���Զ�·��ѹ��ֵ
     */
    public double getDuanluPT(){
        return duanluPT;
    }

    /**
     * ����������Ч
     * @param validStatus �����õ�������Ч��ֵ
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * ��ȡ������Ч
     * @return ������Ч��ֵ
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
}
