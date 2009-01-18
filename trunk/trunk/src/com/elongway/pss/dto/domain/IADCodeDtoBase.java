package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADCode�����ݴ���������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IADCodeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ����CodeType */
    private String codeType = "";
    /** ����CodeCode */
    private String codeCode = "";
    /** ����CodeCName */
    private String codeCName = "";
    /** ����CodeEName */
    private String codeEName = "";
    /** ����ValidStatus */
    private String validStatus = "";
    /** ����Flag */
    private String flag = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�IADCodeDtoBase����
     */
    public IADCodeDtoBase(){
    }

    /**
     * ��������CodeType
     * @param codeType �����õ�����CodeType��ֵ
     */
    public void setCodeType(String codeType){
        this.codeType = StringUtils.rightTrim(codeType);
    }

    /**
     * ��ȡ����CodeType
     * @return ����CodeType��ֵ
     */
    public String getCodeType(){
        return codeType;
    }

    /**
     * ��������CodeCode
     * @param codeCode �����õ�����CodeCode��ֵ
     */
    public void setCodeCode(String codeCode){
        this.codeCode = StringUtils.rightTrim(codeCode);
    }

    /**
     * ��ȡ����CodeCode
     * @return ����CodeCode��ֵ
     */
    public String getCodeCode(){
        return codeCode;
    }

    /**
     * ��������CodeCName
     * @param codeCName �����õ�����CodeCName��ֵ
     */
    public void setCodeCName(String codeCName){
        this.codeCName = StringUtils.rightTrim(codeCName);
    }

    /**
     * ��ȡ����CodeCName
     * @return ����CodeCName��ֵ
     */
    public String getCodeCName(){
        return codeCName;
    }

    /**
     * ��������CodeEName
     * @param codeEName �����õ�����CodeEName��ֵ
     */
    public void setCodeEName(String codeEName){
        this.codeEName = StringUtils.rightTrim(codeEName);
    }

    /**
     * ��ȡ����CodeEName
     * @return ����CodeEName��ֵ
     */
    public String getCodeEName(){
        return codeEName;
    }

    /**
     * ��������ValidStatus
     * @param validStatus �����õ�����ValidStatus��ֵ
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * ��ȡ����ValidStatus
     * @return ����ValidStatus��ֵ
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * ��������Flag
     * @param flag �����õ�����Flag��ֵ
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * ��ȡ����Flag
     * @return ����Flag��ֵ
     */
    public String getFlag(){
        return flag;
    }
}
