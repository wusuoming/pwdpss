package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWSysUser-��¼�û�������ݴ���������<br>
 */
public class LwSysUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** �����û����� */
    private String userCode = "";
    /** �����û����� */
    private String userName = "";
    /** �������� */
    private String password = "";
    /** ���Ի������� */
    private String companyCode = "";
    /** ���Ե绰���� */
    private String phoneNumber = "";
    /** ���Ե����ʼ� */
    private String email = "";
    /** ���Դ��� */
    private String fax = "";
    /** �����û�Ȩ�� */
    private String userGrade = "";
    /** ������Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwSysUserDtoBase����
     */
    public LwSysUserDtoBase(){
    }

    /**
     * ���������û�����
     * @param userCode �����õ������û������ֵ
     */
    public void setUserCode(String userCode){
        this.userCode = StringUtils.rightTrim(userCode);
    }

    /**
     * ��ȡ�����û�����
     * @return �����û������ֵ
     */
    public String getUserCode(){
        return userCode;
    }

    /**
     * ���������û�����
     * @param userName �����õ������û����Ƶ�ֵ
     */
    public void setUserName(String userName){
        this.userName = StringUtils.rightTrim(userName);
    }

    /**
     * ��ȡ�����û�����
     * @return �����û����Ƶ�ֵ
     */
    public String getUserName(){
        return userName;
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
     * �������Ի�������
     * @param companyCode �����õ����Ի������Ƶ�ֵ
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * ��ȡ���Ի�������
     * @return ���Ի������Ƶ�ֵ
     */
    public String getCompanyCode(){
        return companyCode;
    }

    /**
     * �������Ե绰����
     * @param phoneNumber �����õ����Ե绰�����ֵ
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = StringUtils.rightTrim(phoneNumber);
    }

    /**
     * ��ȡ���Ե绰����
     * @return ���Ե绰�����ֵ
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * �������Ե����ʼ�
     * @param email �����õ����Ե����ʼ���ֵ
     */
    public void setEmail(String email){
        this.email = StringUtils.rightTrim(email);
    }

    /**
     * ��ȡ���Ե����ʼ�
     * @return ���Ե����ʼ���ֵ
     */
    public String getEmail(){
        return email;
    }

    /**
     * �������Դ���
     * @param fax �����õ����Դ����ֵ
     */
    public void setFax(String fax){
        this.fax = StringUtils.rightTrim(fax);
    }

    /**
     * ��ȡ���Դ���
     * @return ���Դ����ֵ
     */
    public String getFax(){
        return fax;
    }

    /**
     * ���������û�Ȩ��
     * @param userGrade �����õ������û�Ȩ�޵�ֵ
     */
    public void setUserGrade(String userGrade){
        this.userGrade = StringUtils.rightTrim(userGrade);
    }

    /**
     * ��ȡ�����û�Ȩ��
     * @return �����û�Ȩ�޵�ֵ
     */
    public String getUserGrade(){
        return userGrade;
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
