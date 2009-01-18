package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerUser-�õ��û���Ϣ������ݴ���������<br>
 */
public class LwPowerUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ���Ի��� */
    private String userName = "";
    /** ���Ե�ַ */
    private String address = "";
    /** ������������ */
    private String townCode = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** �����õ����� */
    private String superClass = "";
    /** ���Դ�ҵ���� */
    private String factoryStyle = "";
    /** ������������ */
    private String wholeSaleStyle = "";
    /** ���Ե�ѹ�ȼ� */
    private String saleVoltLevel = "";
    /** ������·���� */
    private String lineCode = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwPowerUserDtoBase����
     */
    public LwPowerUserDtoBase(){
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
     * �������Ի���
     * @param userName �����õ����Ի�����ֵ
     */
    public void setUserName(String userName){
        this.userName = StringUtils.rightTrim(userName);
    }

    /**
     * ��ȡ���Ի���
     * @return ���Ի�����ֵ
     */
    public String getUserName(){
        return userName;
    }

    /**
     * �������Ե�ַ
     * @param address �����õ����Ե�ַ��ֵ
     */
    public void setAddress(String address){
        this.address = StringUtils.rightTrim(address);
    }

    /**
     * ��ȡ���Ե�ַ
     * @return ���Ե�ַ��ֵ
     */
    public String getAddress(){
        return address;
    }

    /**
     * ����������������
     * @param townCode �����õ��������������ֵ
     */
    public void setTownCode(String townCode){
        this.townCode = StringUtils.rightTrim(townCode);
    }

    /**
     * ��ȡ������������
     * @return �������������ֵ
     */
    public String getTownCode(){
        return townCode;
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
     * ���������õ�����
     * @param superClass �����õ������õ����͵�ֵ
     */
    public void setSuperClass(String superClass){
        this.superClass = StringUtils.rightTrim(superClass);
    }

    /**
     * ��ȡ�����õ�����
     * @return �����õ����͵�ֵ
     */
    public String getSuperClass(){
        return superClass;
    }

    /**
     * �������Դ�ҵ����
     * @param factoryStyle �����õ����Դ�ҵ���͵�ֵ
     */
    public void setFactoryStyle(String factoryStyle){
        this.factoryStyle = StringUtils.rightTrim(factoryStyle);
    }

    /**
     * ��ȡ���Դ�ҵ����
     * @return ���Դ�ҵ���͵�ֵ
     */
    public String getFactoryStyle(){
        return factoryStyle;
    }

    /**
     * ����������������
     * @param wholeSaleStyle �����õ������������͵�ֵ
     */
    public void setWholeSaleStyle(String wholeSaleStyle){
        this.wholeSaleStyle = StringUtils.rightTrim(wholeSaleStyle);
    }

    /**
     * ��ȡ������������
     * @return �����������͵�ֵ
     */
    public String getWholeSaleStyle(){
        return wholeSaleStyle;
    }

    /**
     * �������Ե�ѹ�ȼ�
     * @param saleVoltLevel �����õ����Ե�ѹ�ȼ���ֵ
     */
    public void setSaleVoltLevel(String saleVoltLevel){
        this.saleVoltLevel = StringUtils.rightTrim(saleVoltLevel);
    }

    /**
     * ��ȡ���Ե�ѹ�ȼ�
     * @return ���Ե�ѹ�ȼ���ֵ
     */
    public String getSaleVoltLevel(){
        return saleVoltLevel;
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
}
