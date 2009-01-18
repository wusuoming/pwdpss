package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWUserAmmeter-�û������ձ�����ݴ���������<br>
 */
public class LwUserAmmeterDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ���Ի��� */
    private String userName = "";
    /** ���Ա�� */
    private String ammeterNo = "";
    /** �����ϱ����� */
    private String installDate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwUserAmmeterDtoBase����
     */
    public LwUserAmmeterDtoBase(){
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
     * ���������ϱ�����
     * @param installDate �����õ������ϱ����ڵ�ֵ
     */
    public void setInstallDate(String installDate){
        this.installDate = StringUtils.rightTrim(installDate);
    }

    /**
     * ��ȡ�����ϱ�����
     * @return �����ϱ����ڵ�ֵ
     */
    public String getInstallDate(){
        return installDate;
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
