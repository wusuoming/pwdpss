package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWDcompany-�������������ݴ���������<br>
 */
public class LwDcompanyDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի������� */
    private String comCode = "";
    /** ���Ի����������� */
    private String comCName = "";
    /** ���Ի���Ӣ������ */
    private String comEName = "";
    /** ���Ե�ַ�������� */
    private String addressCName = "";
    /** ���Ե�ַӢ������ */
    private String addressEName = "";
    /** �����ʱ� */
    private String postCode = "";
    /** ���Ե绰 */
    private String phoneNumber = "";
    /** ���Դ��� */
    private String taxNumber = "";
    /** �����ϼ��������� */
    private String upperComCode = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwDcompanyDtoBase����
     */
    public LwDcompanyDtoBase(){
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
     * �������Ի�����������
     * @param comCName �����õ����Ի����������Ƶ�ֵ
     */
    public void setComCName(String comCName){
        this.comCName = StringUtils.rightTrim(comCName);
    }

    /**
     * ��ȡ���Ի�����������
     * @return ���Ի����������Ƶ�ֵ
     */
    public String getComCName(){
        return comCName;
    }

    /**
     * �������Ի���Ӣ������
     * @param comEName �����õ����Ի���Ӣ�����Ƶ�ֵ
     */
    public void setComEName(String comEName){
        this.comEName = StringUtils.rightTrim(comEName);
    }

    /**
     * ��ȡ���Ի���Ӣ������
     * @return ���Ի���Ӣ�����Ƶ�ֵ
     */
    public String getComEName(){
        return comEName;
    }

    /**
     * �������Ե�ַ��������
     * @param addressCName �����õ����Ե�ַ�������Ƶ�ֵ
     */
    public void setAddressCName(String addressCName){
        this.addressCName = StringUtils.rightTrim(addressCName);
    }

    /**
     * ��ȡ���Ե�ַ��������
     * @return ���Ե�ַ�������Ƶ�ֵ
     */
    public String getAddressCName(){
        return addressCName;
    }

    /**
     * �������Ե�ַӢ������
     * @param addressEName �����õ����Ե�ַӢ�����Ƶ�ֵ
     */
    public void setAddressEName(String addressEName){
        this.addressEName = StringUtils.rightTrim(addressEName);
    }

    /**
     * ��ȡ���Ե�ַӢ������
     * @return ���Ե�ַӢ�����Ƶ�ֵ
     */
    public String getAddressEName(){
        return addressEName;
    }

    /**
     * ���������ʱ�
     * @param postCode �����õ������ʱ��ֵ
     */
    public void setPostCode(String postCode){
        this.postCode = StringUtils.rightTrim(postCode);
    }

    /**
     * ��ȡ�����ʱ�
     * @return �����ʱ��ֵ
     */
    public String getPostCode(){
        return postCode;
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
     * @param taxNumber �����õ����Դ����ֵ
     */
    public void setTaxNumber(String taxNumber){
        this.taxNumber = StringUtils.rightTrim(taxNumber);
    }

    /**
     * ��ȡ���Դ���
     * @return ���Դ����ֵ
     */
    public String getTaxNumber(){
        return taxNumber;
    }

    /**
     * ���������ϼ���������
     * @param upperComCode �����õ������ϼ����������ֵ
     */
    public void setUpperComCode(String upperComCode){
        this.upperComCode = StringUtils.rightTrim(upperComCode);
    }

    /**
     * ��ȡ�����ϼ���������
     * @return �����ϼ����������ֵ
     */
    public String getUpperComCode(){
        return upperComCode;
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
