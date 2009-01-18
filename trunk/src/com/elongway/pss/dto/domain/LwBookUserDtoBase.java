package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwBookUser-���û����ձ�����ݴ���������<br>
 */
public class LwBookUserDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ա��� */
    private String bookNo = "";
    /** ���Ա��� */
    private String bookName = "";
    /** �����û����� */
    private String userNo = "";
    /** ������� */
    private int serialNo = 0;
    /** ���Ա�ע */
    private String remark = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwBookUserDtoBase����
     */
    public LwBookUserDtoBase(){
    }

    /**
     * �������Ա���
     * @param bookNo �����õ����Ա��ŵ�ֵ
     */
    public void setBookNo(String bookNo){
        this.bookNo = StringUtils.rightTrim(bookNo);
    }

    /**
     * ��ȡ���Ա���
     * @return ���Ա��ŵ�ֵ
     */
    public String getBookNo(){
        return bookNo;
    }

    /**
     * �������Ա���
     * @param bookName �����õ����Ա�����ֵ
     */
    public void setBookName(String bookName){
        this.bookName = StringUtils.rightTrim(bookName);
    }

    /**
     * ��ȡ���Ա���
     * @return ���Ա�����ֵ
     */
    public String getBookName(){
        return bookName;
    }

    /**
     * ���������û�����
     * @param userNo �����õ������û������ֵ
     */
    public void setUserNo(String userNo){
        this.userNo = StringUtils.rightTrim(userNo);
    }

    /**
     * ��ȡ�����û�����
     * @return �����û������ֵ
     */
    public String getUserNo(){
        return userNo;
    }

    /**
     * �����������
     * @param serialNo �����õ�������ŵ�ֵ
     */
    public void setSerialNo(int serialNo){
        this.serialNo = serialNo;
    }

    /**
     * ��ȡ�������
     * @return ������ŵ�ֵ
     */
    public int getSerialNo(){
        return serialNo;
    }

    /**
     * �������Ա�ע
     * @param remark �����õ����Ա�ע��ֵ
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * ��ȡ���Ա�ע
     * @return ���Ա�ע��ֵ
     */
    public String getRemark(){
        return remark;
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
}
