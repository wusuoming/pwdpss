package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWDUser-����Ա���������ݴ���������<br>
 */
public class LwdUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Բ���Ա���� */
    private String operatorCode = "";
    /** �������� */
    private String password = "";
    /** ���Թ����������� */
    private String comCode = "";
    /** ���Բ���Ա�������� */
    private String customerCName = "";
    /** ���Բ���ԱӢ������ */
    private String customerEName = "";
    /** ����֤������ */
    private String identifyType = "";
    /** ����֤������ */
    private String identifyNumber = "";
    /** �����Ա� */
    private String sex = "";
    /** �������� */
    private long age = 0L;
    /** ���Ե绰 */
    private String phoneNumber = "";
    /** ���Դ��� */
    private String faxNumber = "";
    /** �����ֻ����� */
    private String mobile = "";
    /** ����E_mail���� */
    private String email = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwdUserDtoBase����
     */
    public LwdUserDtoBase(){
    }

    /**
     * �������Բ���Ա����
     * @param operatorCode �����õ����Բ���Ա�����ֵ
     */
    public void setOperatorCode(String operatorCode){
        this.operatorCode = StringUtils.rightTrim(operatorCode);
    }

    /**
     * ��ȡ���Բ���Ա����
     * @return ���Բ���Ա�����ֵ
     */
    public String getOperatorCode(){
        return operatorCode;
    }

    /**
     * ������������
     * @param password �����õ����������ֵ
     */
    public void setPassword(String password){
        this.password = StringUtils.rightTrim(password);
    }

    /**
     * ��ȡ��������
     * @return ���������ֵ
     */
    public String getPassword(){
        return password;
    }

    /**
     * �������Թ�����������
     * @param comCode �����õ����Թ������������ֵ
     */
    public void setComCode(String comCode){
        this.comCode = StringUtils.rightTrim(comCode);
    }

    /**
     * ��ȡ���Թ�����������
     * @return ���Թ������������ֵ
     */
    public String getComCode(){
        return comCode;
    }

    /**
     * �������Բ���Ա��������
     * @param customerCName �����õ����Բ���Ա�������Ƶ�ֵ
     */
    public void setCustomerCName(String customerCName){
        this.customerCName = StringUtils.rightTrim(customerCName);
    }

    /**
     * ��ȡ���Բ���Ա��������
     * @return ���Բ���Ա�������Ƶ�ֵ
     */
    public String getCustomerCName(){
        return customerCName;
    }

    /**
     * �������Բ���ԱӢ������
     * @param customerEName �����õ����Բ���ԱӢ�����Ƶ�ֵ
     */
    public void setCustomerEName(String customerEName){
        this.customerEName = StringUtils.rightTrim(customerEName);
    }

    /**
     * ��ȡ���Բ���ԱӢ������
     * @return ���Բ���ԱӢ�����Ƶ�ֵ
     */
    public String getCustomerEName(){
        return customerEName;
    }

    /**
     * ��������֤������
     * @param identifyType �����õ�����֤�����͵�ֵ
     */
    public void setIdentifyType(String identifyType){
        this.identifyType = StringUtils.rightTrim(identifyType);
    }

    /**
     * ��ȡ����֤������
     * @return ����֤�����͵�ֵ
     */
    public String getIdentifyType(){
        return identifyType;
    }

    /**
     * ��������֤������
     * @param identifyNumber �����õ�����֤�������ֵ
     */
    public void setIdentifyNumber(String identifyNumber){
        this.identifyNumber = StringUtils.rightTrim(identifyNumber);
    }

    /**
     * ��ȡ����֤������
     * @return ����֤�������ֵ
     */
    public String getIdentifyNumber(){
        return identifyNumber;
    }

    /**
     * ���������Ա�
     * @param sex �����õ������Ա��ֵ
     */
    public void setSex(String sex){
        this.sex = StringUtils.rightTrim(sex);
    }

    /**
     * ��ȡ�����Ա�
     * @return �����Ա��ֵ
     */
    public String getSex(){
        return sex;
    }

    /**
     * ������������
     * @param age �����õ����������ֵ
     */
    public void setAge(long age){
        this.age = age;
    }

    /**
     * ��ȡ��������
     * @return ���������ֵ
     */
    public long getAge(){
        return age;
    }

    /**
     * �������Ե绰
     * @param phoneNumber �����õ����Ե绰��ֵ
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = StringUtils.rightTrim(phoneNumber);
    }

    /**
     * ��ȡ���Ե绰
     * @return ���Ե绰��ֵ
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * �������Դ���
     * @param faxNumber �����õ����Դ����ֵ
     */
    public void setFaxNumber(String faxNumber){
        this.faxNumber = StringUtils.rightTrim(faxNumber);
    }

    /**
     * ��ȡ���Դ���
     * @return ���Դ����ֵ
     */
    public String getFaxNumber(){
        return faxNumber;
    }

    /**
     * ���������ֻ�����
     * @param mobile �����õ������ֻ������ֵ
     */
    public void setMobile(String mobile){
        this.mobile = StringUtils.rightTrim(mobile);
    }

    /**
     * ��ȡ�����ֻ�����
     * @return �����ֻ������ֵ
     */
    public String getMobile(){
        return mobile;
    }

    /**
     * ��������E_mail����
     * @param email �����õ�����E_mail�����ֵ
     */
    public void setEmail(String email){
        this.email = StringUtils.rightTrim(email);
    }

    /**
     * ��ȡ����E_mail����
     * @return ����E_mail�����ֵ
     */
    public String getEmail(){
        return email;
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
