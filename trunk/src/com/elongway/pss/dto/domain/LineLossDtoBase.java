package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LineLoss-������Ϣ������ݴ���������<br>
 */
public class LineLossDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������·���� */
    private String lineCode = "";
    /** ������·����ֵ */
    private double r = 0D;
    /** ������·���� */
    private double lineLong = 0D;
    /** ���Զ��ѹ */
    private double volt = 0D;
    /** �����õ�ʱ�� */
    private double t = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LineLossDtoBase����
     */
    public LineLossDtoBase(){
    }

    /**
     * ����������·����
     * @param lineCode �����õ�������·���Ƶ�ֵ
     */
    public void setLineCode(String lineCode){
        this.lineCode = StringUtils.rightTrim(lineCode);
    }

    /**
     * ��ȡ������·����
     * @return ������·���Ƶ�ֵ
     */
    public String getLineCode(){
        return lineCode;
    }

    /**
     * ����������·����ֵ
     * @param r �����õ�������·����ֵ��ֵ
     */
    public void setR(double r){
        this.r = r;
    }

    /**
     * ��ȡ������·����ֵ
     * @return ������·����ֵ��ֵ
     */
    public double getR(){
        return r;
    }

    /**
     * ����������·����
     * @param lineLong �����õ�������·���ȵ�ֵ
     */
    public void setLineLong(double lineLong){
        this.lineLong = lineLong;
    }

    /**
     * ��ȡ������·����
     * @return ������·���ȵ�ֵ
     */
    public double getLineLong(){
        return lineLong;
    }

    /**
     * �������Զ��ѹ
     * @param volt �����õ����Զ��ѹ��ֵ
     */
    public void setVolt(double volt){
        this.volt = volt;
    }

    /**
     * ��ȡ���Զ��ѹ
     * @return ���Զ��ѹ��ֵ
     */
    public double getVolt(){
        return volt;
    }

    /**
     * ���������õ�ʱ��
     * @param t �����õ������õ�ʱ���ֵ
     */
    public void setT(double t){
        this.t = t;
    }

    /**
     * ��ȡ�����õ�ʱ��
     * @return �����õ�ʱ���ֵ
     */
    public double getT(){
        return t;
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
