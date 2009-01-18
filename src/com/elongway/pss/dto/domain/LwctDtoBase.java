package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ���ǵ��������������ݴ���������<br>
 */
public class LwctDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������ʽ */
    private String modus = "";
    /** ���Ե����� */
    private String ct = "";
    /** ���Գ��� */
    private String factoryName = "";
    /** ���Ծ��� */
    private double exact = 0D;
    /** ���Ա��� */
    private double ctRate = 0D;
    /** ���Գ���A */
    private String fctoryCodeA = "";
    /** ���Գ���B */
    private String fctoryCodeB = "";
    /** ���Գ���C */
    private String fctoryCodeC = "";
    /** ���Ա�־λ */
    private String flag = "";
    /** ����¼������ */
    private String importDate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwctDtoBase����
     */
    public LwctDtoBase(){
    }

    /**
     * ����������ʽ
     * @param modus �����õ�������ʽ��ֵ
     */
    public void setModus(String modus){
        this.modus = StringUtils.rightTrim(modus);
    }

    /**
     * ��ȡ������ʽ
     * @return ������ʽ��ֵ
     */
    public String getModus(){
        return modus;
    }

    /**
     * �������Ե�����
     * @param ct �����õ����Ե����ȵ�ֵ
     */
    public void setCt(String ct){
        this.ct = StringUtils.rightTrim(ct);
    }

    /**
     * ��ȡ���Ե�����
     * @return ���Ե����ȵ�ֵ
     */
    public String getCt(){
        return ct;
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
     * �������Ծ���
     * @param exact �����õ����Ծ��ȵ�ֵ
     */
    public void setExact(double exact){
        this.exact = exact;
    }

    /**
     * ��ȡ���Ծ���
     * @return ���Ծ��ȵ�ֵ
     */
    public double getExact(){
        return exact;
    }

    /**
     * �������Ա���
     * @param ctRate �����õ����Ա��ʵ�ֵ
     */
    public void setCtRate(double ctRate){
        this.ctRate = ctRate;
    }

    /**
     * ��ȡ���Ա���
     * @return ���Ա��ʵ�ֵ
     */
    public double getCtRate(){
        return ctRate;
    }

    /**
     * �������Գ���A
     * @param fctoryCodeA �����õ����Գ���A��ֵ
     */
    public void setFctoryCodeA(String fctoryCodeA){
        this.fctoryCodeA = StringUtils.rightTrim(fctoryCodeA);
    }

    /**
     * ��ȡ���Գ���A
     * @return ���Գ���A��ֵ
     */
    public String getFctoryCodeA(){
        return fctoryCodeA;
    }

    /**
     * �������Գ���B
     * @param fctoryCodeB �����õ����Գ���B��ֵ
     */
    public void setFctoryCodeB(String fctoryCodeB){
        this.fctoryCodeB = StringUtils.rightTrim(fctoryCodeB);
    }

    /**
     * ��ȡ���Գ���B
     * @return ���Գ���B��ֵ
     */
    public String getFctoryCodeB(){
        return fctoryCodeB;
    }

    /**
     * �������Գ���C
     * @param fctoryCodeC �����õ����Գ���C��ֵ
     */
    public void setFctoryCodeC(String fctoryCodeC){
        this.fctoryCodeC = StringUtils.rightTrim(fctoryCodeC);
    }

    /**
     * ��ȡ���Գ���C
     * @return ���Գ���C��ֵ
     */
    public String getFctoryCodeC(){
        return fctoryCodeC;
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
     * ��������¼������
     * @param importDate �����õ�����¼�����ڵ�ֵ
     */
    public void setImportDate(String importDate){
        this.importDate = StringUtils.rightTrim(importDate);
    }

    /**
     * ��ȡ����¼������
     * @return ����¼�����ڵ�ֵ
     */
    public String getImportDate(){
        return importDate;
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
}
