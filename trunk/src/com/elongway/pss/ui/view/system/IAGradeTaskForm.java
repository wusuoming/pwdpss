package com.elongway.pss.ui.view.system;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * �б���Ϣ��ѯ(����ѯ)��
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */
public class IAGradeTaskForm extends AbstractForm {

    private static final long serialVersionUID = 1L;
    /** ���Ը�λ���� */
    private String gradeCode = "";
    /** ����������� */
    private String taskCode = "";
    /** ���Կɴ���Ļ������� */
    private String companyCode = "";
    /** ����Ȩ�޼��� */
    private int powerLevel = 0;
    /** ����Ч��״̬ */
    private String validStatus = "";
    /** ���Ա�־�ֶ� */
    private String flag = "";
    /** ����������� */
    private String areaCode = "";

    /**
     * �������Ը�λ����
     * @param gradeCode �����õ����Ը�λ�����ֵ
     */
    public void setGradeCode(String gradeCode){
        this.gradeCode = StringUtils.rightTrim(gradeCode);
    }

    /**
     * ��ȡ���Ը�λ����
     * @return ���Ը�λ�����ֵ
     */
    public String getGradeCode(){
        return gradeCode;
    }

    /**
     * ���������������
     * @param taskCode �����õ�������������ֵ
     */
    public void setTaskCode(String taskCode){
        this.taskCode = StringUtils.rightTrim(taskCode);
    }

    /**
     * ��ȡ�����������
     * @return ������������ֵ
     */
    public String getTaskCode(){
        return taskCode;
    }

    /**
     * �������Կɴ���Ļ�������
     * @param companyCode �����õ����Կɴ���Ļ��������ֵ
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * ��ȡ���Կɴ���Ļ�������
     * @return ���Կɴ���Ļ��������ֵ
     */
    public String getCompanyCode(){
        return companyCode;
    }

    /**
     * ��������Ȩ�޼���
     * @param powerLevel �����õ�����Ȩ�޼����ֵ
     */
    public void setPowerLevel(int powerLevel){
        this.powerLevel = powerLevel;
    }

    /**
     * ��ȡ����Ȩ�޼���
     * @return ����Ȩ�޼����ֵ
     */
    public int getPowerLevel(){
        return powerLevel;
    }

    /**
     * ��������Ч��״̬
     * @param validStatus �����õ�����Ч��״̬��ֵ
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * ��ȡ����Ч��״̬
     * @return ����Ч��״̬��ֵ
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * �������Ա�־�ֶ�
     * @param flag �����õ����Ա�־�ֶε�ֵ
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * ��ȡ���Ա�־�ֶ�
     * @return ���Ա�־�ֶε�ֵ
     */
    public String getFlag(){
        return flag;
    }

    /**
     * ���������������
     * @param areaCode �����õ�������������ֵ
     */
    public void setAreaCode(String areaCode){
        this.areaCode = StringUtils.rightTrim(areaCode);
    }

    /**
     * ��ȡ�����������
     * @return ������������ֵ
     */
    public String getAreaCode(){
        return areaCode;
    }
}
