package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWSalePrice-���۵�۱�����ݴ���������<br>
 */
public class LwSalePriceDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** �����õ���� */
    private String powerClass = "";
    /** ���Ե�۷��� */
    private String priceCategory = "";
    /** ������ʼ��ѹ */
    private double voltageBegin = 0D;
    /** ������ֹ��ѹ */
    private double voltageEnd = 0D;
    /** ����ԭ������ */
    private String materialsType = "";
    /** ���Ե��� */
    private double price = 0D;
    /** ������Ч���� */
    private String validDate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwSalePriceDtoBase����
     */
    public LwSalePriceDtoBase(){
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
     * �������Ե�۷���
     * @param priceCategory �����õ����Ե�۷����ֵ
     */
    public void setPriceCategory(String priceCategory){
        this.priceCategory = StringUtils.rightTrim(priceCategory);
    }

    /**
     * ��ȡ���Ե�۷���
     * @return ���Ե�۷����ֵ
     */
    public String getPriceCategory(){
        return priceCategory;
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
     * ��������ԭ������
     * @param materialsType �����õ�����ԭ�����͵�ֵ
     */
    public void setMaterialsType(String materialsType){
        this.materialsType = StringUtils.rightTrim(materialsType);
    }

    /**
     * ��ȡ����ԭ������
     * @return ����ԭ�����͵�ֵ
     */
    public String getMaterialsType(){
        return materialsType;
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
     * ����������Ч����
     * @param validDate �����õ�������Ч���ڵ�ֵ
     */
    public void setValidDate(String validDate){
        this.validDate = StringUtils.rightTrim(validDate);
    }

    /**
     * ��ȡ������Ч����
     * @return ������Ч���ڵ�ֵ
     */
    public String getValidDate(){
        return validDate;
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
