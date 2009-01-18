package com.elongway.pss.dto.domain;

import java.io.Serializable;

import com.sinosoft.sysframework.common.util.StringUtils;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·��ѹ���������ձ�����ݴ���������<br>
 */
public class LwLinePTDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������·���� */
    private String lineCode = "";
    /** ���Ե�ѹ��������ʽ */
    private String ptModus = "";
    /** ���Ա�־λ */
    private String flag = "";
    /** ����¼������ */
    private String inputDate = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwLinePTDtoBase����
     */
    public LwLinePTDtoBase(){
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
     * �������Ե�ѹ��������ʽ
     * @param ptModus �����õ����Ե�ѹ��������ʽ��ֵ
     */
    public void setPtModus(String ptModus){
        this.ptModus = StringUtils.rightTrim(ptModus);
    }

    /**
     * ��ȡ���Ե�ѹ��������ʽ
     * @return ���Ե�ѹ��������ʽ��ֵ
     */
    public String getPtModus(){
        return ptModus;
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
