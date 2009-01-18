package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleUserInfo-�����û���Ϣ������ݴ���������<br>
 */
public class LwWholeSaleUserInfoDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ���Ի��� */
    private String userName = "";
    /** ���Թ����ѹ */
    private String voltage = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־λ */
    private String flag = "";
    /** ��������������˾ */
    private String company = "";
    /** ���Ե绰 */
    private String phoneNo = "";
    /** ������������ */
    private String wholesaletype = "";
    /** ����������· */
    private String lineCode = "";
    /** �����Ƿ���� */
    private String ifCal = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwWholeSaleUserInfoDtoBase����
     */
    public LwWholeSaleUserInfoDtoBase(){
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
     * �������Թ����ѹ
     * @param voltage �����õ����Թ����ѹ��ֵ
     */
    public void setVoltage(String voltage){
        this.voltage = StringUtils.rightTrim(voltage);
    }

    /**
     * ��ȡ���Թ����ѹ
     * @return ���Թ����ѹ��ֵ
     */
    public String getVoltage(){
        return voltage;
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
     * �������Ա�־λ
     * @param flag �����õ����Ա�־λ��ֵ
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * ��ȡ���Ա�־λ
     * @return ���Ա�־λ��ֵ
     */
    public String getFlag(){
        return flag;
    }

    /**
     * ������������������˾
     * @param company �����õ���������������˾��ֵ
     */
    public void setCompany(String company){
        this.company = StringUtils.rightTrim(company);
    }

    /**
     * ��ȡ��������������˾
     * @return ��������������˾��ֵ
     */
    public String getCompany(){
        return company;
    }

    /**
     * �������Ե绰
     * @param phoneNo �����õ����Ե绰��ֵ
     */
    public void setPhoneNo(String phoneNo){
        this.phoneNo = StringUtils.rightTrim(phoneNo);
    }

    /**
     * ��ȡ���Ե绰
     * @return ���Ե绰��ֵ
     */
    public String getPhoneNo(){
        return phoneNo;
    }

    /**
     * ����������������
     * @param wholesaletype �����õ������������͵�ֵ
     */
    public void setWholesaletype(String wholesaletype){
        this.wholesaletype = StringUtils.rightTrim(wholesaletype);
    }

    /**
     * ��ȡ������������
     * @return �����������͵�ֵ
     */
    public String getWholesaletype(){
        return wholesaletype;
    }

    /**
     * ��������������·
     * @param lineCode �����õ�����������·��ֵ
     */
    public void setLineCode(String lineCode){
        this.lineCode = StringUtils.rightTrim(lineCode);
    }

    /**
     * ��ȡ����������·
     * @return ����������·��ֵ
     */
    public String getLineCode(){
        return lineCode;
    }

    /**
     * ���������Ƿ����
     * @param ifCal �����õ������Ƿ���ѵ�ֵ
     */
    public void setIfCal(String ifCal){
        this.ifCal = StringUtils.rightTrim(ifCal);
    }

    /**
     * ��ȡ�����Ƿ����
     * @return �����Ƿ���ѵ�ֵ
     */
    public String getIfCal(){
        return ifCal;
    }
}
