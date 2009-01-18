package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSalePurePrice-���۴���۱�����ݴ���������<br>
 */
public class LwWholeSalePurePriceDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ե�ѹ�ȼ� */
    private String voltLevel = "";
    /** ���Թ�˾���� */
    private String comCode = "";
    /** ���Թ�˾���� */
    private String comName = "";
    /** ���Ծ����� */
    private double peoplePrice = 0D;
    /** ���ԷǾ����� */
    private double notPeoplePrice = 0D;
    /** ����ũ���� */
    private double farmPrice = 0D;
    /** ����ũҵ������� */
    private double producePrice = 0D;
    /** ������ҵ��� */
    private double businessPrice = 0D;
    /** ���Է��չ�ҵ */
    private double industryPrice = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwWholeSalePurePriceDtoBase����
     */
    public LwWholeSalePurePriceDtoBase(){
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
     * �������Թ�˾����
     * @param comCode �����õ����Թ�˾�����ֵ
     */
    public void setComCode(String comCode){
        this.comCode = StringUtils.rightTrim(comCode);
    }

    /**
     * ��ȡ���Թ�˾����
     * @return ���Թ�˾�����ֵ
     */
    public String getComCode(){
        return comCode;
    }

    /**
     * �������Թ�˾����
     * @param comName �����õ����Թ�˾���Ƶ�ֵ
     */
    public void setComName(String comName){
        this.comName = StringUtils.rightTrim(comName);
    }

    /**
     * ��ȡ���Թ�˾����
     * @return ���Թ�˾���Ƶ�ֵ
     */
    public String getComName(){
        return comName;
    }

    /**
     * �������Ծ�����
     * @param peoplePrice �����õ����Ծ����۵�ֵ
     */
    public void setPeoplePrice(double peoplePrice){
        this.peoplePrice = peoplePrice;
    }

    /**
     * ��ȡ���Ծ�����
     * @return ���Ծ����۵�ֵ
     */
    public double getPeoplePrice(){
        return peoplePrice;
    }

    /**
     * �������ԷǾ�����
     * @param notPeoplePrice �����õ����ԷǾ����۵�ֵ
     */
    public void setNotPeoplePrice(double notPeoplePrice){
        this.notPeoplePrice = notPeoplePrice;
    }

    /**
     * ��ȡ���ԷǾ�����
     * @return ���ԷǾ����۵�ֵ
     */
    public double getNotPeoplePrice(){
        return notPeoplePrice;
    }

    /**
     * ��������ũ����
     * @param farmPrice �����õ�����ũ���۵�ֵ
     */
    public void setFarmPrice(double farmPrice){
        this.farmPrice = farmPrice;
    }

    /**
     * ��ȡ����ũ����
     * @return ����ũ���۵�ֵ
     */
    public double getFarmPrice(){
        return farmPrice;
    }

    /**
     * ��������ũҵ�������
     * @param producePrice �����õ�����ũҵ������۵�ֵ
     */
    public void setProducePrice(double producePrice){
        this.producePrice = producePrice;
    }

    /**
     * ��ȡ����ũҵ�������
     * @return ����ũҵ������۵�ֵ
     */
    public double getProducePrice(){
        return producePrice;
    }

    /**
     * ����������ҵ���
     * @param businessPrice �����õ�������ҵ��۵�ֵ
     */
    public void setBusinessPrice(double businessPrice){
        this.businessPrice = businessPrice;
    }

    /**
     * ��ȡ������ҵ���
     * @return ������ҵ��۵�ֵ
     */
    public double getBusinessPrice(){
        return businessPrice;
    }

    /**
     * �������Է��չ�ҵ
     * @param industryPrice �����õ����Է��չ�ҵ��ֵ
     */
    public void setIndustryPrice(double industryPrice){
        this.industryPrice = industryPrice;
    }

    /**
     * ��ȡ���Է��չ�ҵ
     * @return ���Է��չ�ҵ��ֵ
     */
    public double getIndustryPrice(){
        return industryPrice;
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
