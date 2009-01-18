package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeter-�����Ϣ������ݴ���������<br>
 */
public class LwAmmeterDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ա�� */
    private String ammeterNo = "";
    /** ������ */
    private String ammeterX = "";
    /** ���Է� */
    private String ammeterV = "";
    /** ���԰� */
    private String ammeterA = "";
    /** ������ʽ */
    private String ammeterType = "";
    /** ���Գ��� */
    private String factoryName = "";
    /** ���Գ��� */
    private String coust = "";
    /** ���Ծ��� */
    private String precision1 = "";
    /** ���Ա��� */
    private String rate = "";
    /** ���Ա���������ֵ */
    private int maxnum = 0;
    /** ��������ʹ������ */
    private String allowYear = "";
    /** ��������ʹ������ */
    private String allowDate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwAmmeterDtoBase����
     */
    public LwAmmeterDtoBase(){
    }

    /**
     * �������Ա��
     * @param ammeterNo �����õ����Ա�ŵ�ֵ
     */
    public void setAmmeterNo(String ammeterNo){
        this.ammeterNo = StringUtils.rightTrim(ammeterNo);
    }

    /**
     * ��ȡ���Ա��
     * @return ���Ա�ŵ�ֵ
     */
    public String getAmmeterNo(){
        return ammeterNo;
    }

    /**
     * ����������
     * @param ammeterX �����õ��������ֵ
     */
    public void setAmmeterX(String ammeterX){
        this.ammeterX = StringUtils.rightTrim(ammeterX);
    }

    /**
     * ��ȡ������
     * @return �������ֵ
     */
    public String getAmmeterX(){
        return ammeterX;
    }

    /**
     * �������Է�
     * @param ammeterV �����õ����Է���ֵ
     */
    public void setAmmeterV(String ammeterV){
        this.ammeterV = StringUtils.rightTrim(ammeterV);
    }

    /**
     * ��ȡ���Է�
     * @return ���Է���ֵ
     */
    public String getAmmeterV(){
        return ammeterV;
    }

    /**
     * �������԰�
     * @param ammeterA �����õ����԰���ֵ
     */
    public void setAmmeterA(String ammeterA){
        this.ammeterA = StringUtils.rightTrim(ammeterA);
    }

    /**
     * ��ȡ���԰�
     * @return ���԰���ֵ
     */
    public String getAmmeterA(){
        return ammeterA;
    }

    /**
     * ����������ʽ
     * @param ammeterType �����õ�������ʽ��ֵ
     */
    public void setAmmeterType(String ammeterType){
        this.ammeterType = StringUtils.rightTrim(ammeterType);
    }

    /**
     * ��ȡ������ʽ
     * @return ������ʽ��ֵ
     */
    public String getAmmeterType(){
        return ammeterType;
    }

    /**
     * �������Գ���
     * @param factoryName �����õ����Գ�����ֵ
     */
    public void setFactoryName(String factoryName){
        this.factoryName = StringUtils.rightTrim(factoryName);
    }

    /**
     * ��ȡ���Գ���
     * @return ���Գ�����ֵ
     */
    public String getFactoryName(){
        return factoryName;
    }

    /**
     * �������Գ���
     * @param coust �����õ����Գ�����ֵ
     */
    public void setCoust(String coust){
        this.coust = StringUtils.rightTrim(coust);
    }

    /**
     * ��ȡ���Գ���
     * @return ���Գ�����ֵ
     */
    public String getCoust(){
        return coust;
    }

    /**
     * �������Ծ���
     * @param precision �����õ����Ծ��ȵ�ֵ
     */
    public void setPrecision(String precision){
        this.precision1 = StringUtils.rightTrim(precision);
    }

    /**
     * ��ȡ���Ծ���
     * @return ���Ծ��ȵ�ֵ
     */
    public String getPrecision(){
        return precision1;
    }

    /**
     * �������Ա���
     * @param rate �����õ����Ա��ʵ�ֵ
     */
    public void setRate(String rate){
        this.rate = StringUtils.rightTrim(rate);
    }

    /**
     * ��ȡ���Ա���
     * @return ���Ա��ʵ�ֵ
     */
    public String getRate(){
        return rate;
    }

    /**
     * �������Ա���������ֵ
     * @param maxnum �����õ����Ա���������ֵ��ֵ
     */
    public void setMaxnum(int maxnum){
        this.maxnum = maxnum;
    }

    /**
     * ��ȡ���Ա���������ֵ
     * @return ���Ա���������ֵ��ֵ
     */
    public int getMaxnum(){
        return maxnum;
    }

    /**
     * ������������ʹ������
     * @param allowYear �����õ���������ʹ�����޵�ֵ
     */
    public void setAllowYear(String allowYear){
        this.allowYear = StringUtils.rightTrim(allowYear);
    }

    /**
     * ��ȡ��������ʹ������
     * @return ��������ʹ�����޵�ֵ
     */
    public String getAllowYear(){
        return allowYear;
    }

    /**
     * ������������ʹ������
     * @param allowDate �����õ���������ʹ�����ڵ�ֵ
     */
    public void setAllowDate(String allowDate){
        this.allowDate = StringUtils.rightTrim(allowDate);
    }

    /**
     * ��ȡ��������ʹ������
     * @return ��������ʹ�����ڵ�ֵ
     */
    public String getAllowDate(){
        return allowDate;
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
