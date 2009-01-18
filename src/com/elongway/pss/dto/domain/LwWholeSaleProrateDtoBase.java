package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleProrate-���۱�����̯������ݴ���������<br>
 */
public class LwWholeSaleProrateDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի������� */
    private String comCode = "";
    /** ���Ի������� */
    private String companyName = "";
    /** ���Ծ��� */
    private double people = 0D;
    /** ���ԷǾ��� */
    private double notPeople = 0D;
    /** ����ũ�� */
    private double farm = 0D;
    /** �������� */
    private double produce = 0D;
    /** ������ҵ */
    private double business = 0D;
    /** ���Է��չ�ҵ */
    private double industry = 0D;
    /** ���Ե�ѹ�ȼ� */
    private String voltLevel = "";
    /** ����¼��ʱ�� */
    private String inputDate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ����ע�� */
    private String remark = "";
    /** ���Ա�־ */
    private String flag = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwWholeSaleProrateDtoBase����
     */
    public LwWholeSaleProrateDtoBase(){
    }

    /**
     * �������Ի�������
     * @param comCode �����õ����Ի��������ֵ
     */
    public void setComCode(String comCode){
        this.comCode = StringUtils.rightTrim(comCode);
    }

    /**
     * ��ȡ���Ի�������
     * @return ���Ի��������ֵ
     */
    public String getComCode(){
        return comCode;
    }

    /**
     * �������Ի�������
     * @param companyName �����õ����Ի������Ƶ�ֵ
     */
    public void setCompanyName(String companyName){
        this.companyName = StringUtils.rightTrim(companyName);
    }

    /**
     * ��ȡ���Ի�������
     * @return ���Ի������Ƶ�ֵ
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * �������Ծ���
     * @param people �����õ����Ծ����ֵ
     */
    public void setPeople(double people){
        this.people = people;
    }

    /**
     * ��ȡ���Ծ���
     * @return ���Ծ����ֵ
     */
    public double getPeople(){
        return people;
    }

    /**
     * �������ԷǾ���
     * @param notPeople �����õ����ԷǾ����ֵ
     */
    public void setNotPeople(double notPeople){
        this.notPeople = notPeople;
    }

    /**
     * ��ȡ���ԷǾ���
     * @return ���ԷǾ����ֵ
     */
    public double getNotPeople(){
        return notPeople;
    }

    /**
     * ��������ũ��
     * @param farm �����õ�����ũ���ֵ
     */
    public void setFarm(double farm){
        this.farm = farm;
    }

    /**
     * ��ȡ����ũ��
     * @return ����ũ���ֵ
     */
    public double getFarm(){
        return farm;
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
     * �������Է��չ�ҵ
     * @param industry �����õ����Է��չ�ҵ��ֵ
     */
    public void setIndustry(double industry){
        this.industry = industry;
    }

    /**
     * ��ȡ���Է��չ�ҵ
     * @return ���Է��չ�ҵ��ֵ
     */
    public double getIndustry(){
        return industry;
    }

    /**
     * �������Ե�ѹ�ȼ�
     * @param voltLevel �����õ����Ե�ѹ�ȼ���ֵ
     */
    public void setVoltLevel(String voltLevel){
        this.voltLevel = StringUtils.rightTrim(voltLevel);
    }

    /**
     * ��ȡ���Ե�ѹ�ȼ�
     * @return ���Ե�ѹ�ȼ���ֵ
     */
    public String getVoltLevel(){
        return voltLevel;
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
