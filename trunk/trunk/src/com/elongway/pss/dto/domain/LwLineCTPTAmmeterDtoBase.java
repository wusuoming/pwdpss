package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ������·������ѹ����������ϵ������ݴ���������<br>
 */
public class LwLineCTPTAmmeterDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������·���� */
    private String lineCode = "";
    /** ���Ե�����������ʽ */
    private String ctModus = "";
    /** ���Ե�ѹ��������ʽ */
    private String ptModus = "";
    /** ���Դ�ҵ������ */
    private String pepoleAmmeterNo = "";
    /** ���Ա�� */
    private String ammeterNo = "";
    /** ���Ա�־λ */
    private String flag = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ����¼������ */
    private String inputDate = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwLineCTPTAmmeterDtoBase����
     */
    public LwLineCTPTAmmeterDtoBase(){
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
     * �������Դ�ҵ������
     * @param pepoleAmmeterNo �����õ����Դ�ҵ�����ŵ�ֵ
     */
    public void setPepoleAmmeterNo(String pepoleAmmeterNo){
        this.pepoleAmmeterNo = StringUtils.rightTrim(pepoleAmmeterNo);
    }

    /**
     * ��ȡ���Դ�ҵ������
     * @return ���Դ�ҵ�����ŵ�ֵ
     */
    public String getPepoleAmmeterNo(){
        return pepoleAmmeterNo;
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
