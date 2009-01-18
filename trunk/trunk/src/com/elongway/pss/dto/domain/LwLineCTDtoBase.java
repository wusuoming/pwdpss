package com.elongway.pss.dto.domain;

import java.io.Serializable;

import com.sinosoft.sysframework.common.util.StringUtils;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·�������������ձ�����ݴ���������<br>
 */
public class LwLineCTDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������·���� */
    private String lineCode = "";
    /** ���Ե�����������ʽ */
    private String ctModus = "";
    /** ���Ա�־λ */
    private String flag = "";
    /** ����¼������ */
    private String inputDate = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwLineCTDtoBase����
     */
    public LwLineCTDtoBase(){
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

    /**
     * �������Ե�����������ʽ
     * @param ctModus �����õ����Ե�����������ʽ��ֵ
     */
    public void setCtModus(String ctModus){
        this.ctModus = StringUtils.rightTrim(ctModus);
    }

    /**
     * ��ȡ���Ե�����������ʽ
     * @return ���Ե�����������ʽ��ֵ
     */
    public String getCtModus(){
        return ctModus;
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
     * @param inputDate �����õ�����¼�����ڵ�ֵ
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * ��ȡ����¼������
     * @return ����¼�����ڵ�ֵ
     */
    public String getInputDate(){
        return inputDate;
    }
}
