package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownProrateAppend-������̯׷�ӱ�����ݴ���������<br>
 */
public class LwTownProrateAppendDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ����ũ�� */
    private double agricultural = 0D;
    /** �������� */
    private double produce = 0D;
    /** ���Ծ��� */
    private double resident = 0D;
    /** ���ԷǾ��� */
    private double indecisive = 0D;
    /** ���Էǹ�ҵ����ͨ��ҵ��� */
    private double industry = 0D;
    /** ������ҵ */
    private double business = 0D;
    /** ����¼��ʱ�� */
    private String inputDate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ����ע�� */
    private String remark = "";
    /** ���Ա�־ */
    private String flag = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwTownProrateAppendDtoBase����
     */
    public LwTownProrateAppendDtoBase(){
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
     * ��������ũ��
     * @param agricultural �����õ�����ũ���ֵ
     */
    public void setAgricultural(double agricultural){
        this.agricultural = agricultural;
    }

    /**
     * ��ȡ����ũ��
     * @return ����ũ���ֵ
     */
    public double getAgricultural(){
        return agricultural;
    }

    /**
     * ������������
     * @param produce �����õ�����������ֵ
     */
    public void setProduce(double produce){
        this.produce = produce;
    }

    /**
     * ��ȡ��������
     * @return ����������ֵ
     */
    public double getProduce(){
        return produce;
    }

    /**
     * �������Ծ���
     * @param resident �����õ����Ծ����ֵ
     */
    public void setResident(double resident){
        this.resident = resident;
    }

    /**
     * ��ȡ���Ծ���
     * @return ���Ծ����ֵ
     */
    public double getResident(){
        return resident;
    }

    /**
     * �������ԷǾ���
     * @param indecisive �����õ����ԷǾ����ֵ
     */
    public void setIndecisive(double indecisive){
        this.indecisive = indecisive;
    }

    /**
     * ��ȡ���ԷǾ���
     * @return ���ԷǾ����ֵ
     */
    public double getIndecisive(){
        return indecisive;
    }

    /**
     * �������Էǹ�ҵ����ͨ��ҵ���
     * @param industry �����õ����Էǹ�ҵ����ͨ��ҵ��۵�ֵ
     */
    public void setIndustry(double industry){
        this.industry = industry;
    }

    /**
     * ��ȡ���Էǹ�ҵ����ͨ��ҵ���
     * @return ���Էǹ�ҵ����ͨ��ҵ��۵�ֵ
     */
    public double getIndustry(){
        return industry;
    }

    /**
     * ����������ҵ
     * @param business �����õ�������ҵ��ֵ
     */
    public void setBusiness(double business){
        this.business = business;
    }

    /**
     * ��ȡ������ҵ
     * @return ������ҵ��ֵ
     */
    public double getBusiness(){
        return business;
    }

    /**
     * ��������¼��ʱ��
     * @param inputDate �����õ�����¼��ʱ���ֵ
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * ��ȡ����¼��ʱ��
     * @return ����¼��ʱ���ֵ
     */
    public String getInputDate(){
        return inputDate;
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
