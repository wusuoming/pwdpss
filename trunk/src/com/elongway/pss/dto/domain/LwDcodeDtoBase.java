package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwDcode-�������������ݴ���������<br>
 */
public class LwDcodeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Խӿڴ������� */
    private String codeType = "";
    /** ���Դ��� */
    private String codeCode = "";
    /** ���Դ����������� */
    private String codeCName = "";
    /** ���Դ���Ӣ������ */
    private String codeEName = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwDcodeDtoBase����
     */
    public LwDcodeDtoBase(){
    }

    /**
     * �������Խӿڴ�������
     * @param codeType �����õ����Խӿڴ������͵�ֵ
     */
    public void setCodeType(String codeType){
        this.codeType = StringUtils.rightTrim(codeType);
    }

    /**
     * ��ȡ���Խӿڴ�������
     * @return ���Խӿڴ������͵�ֵ
     */
    public String getCodeType(){
        return codeType;
    }

    /**
     * �������Դ���
     * @param codeCode �����õ����Դ����ֵ
     */
    public void setCodeCode(String codeCode){
        this.codeCode = StringUtils.rightTrim(codeCode);
    }

    /**
     * ��ȡ���Դ���
     * @return ���Դ����ֵ
     */
    public String getCodeCode(){
        return codeCode;
    }

    /**
     * �������Դ�����������
     * @param codeCName �����õ����Դ����������Ƶ�ֵ
     */
    public void setCodeCName(String codeCName){
        this.codeCName = StringUtils.rightTrim(codeCName);
    }

    /**
     * ��ȡ���Դ�����������
     * @return ���Դ����������Ƶ�ֵ
     */
    public String getCodeCName(){
        return codeCName;
    }

    /**
     * �������Դ���Ӣ������
     * @param codeEName �����õ����Դ���Ӣ�����Ƶ�ֵ
     */
    public void setCodeEName(String codeEName){
        this.codeEName = StringUtils.rightTrim(codeEName);
    }

    /**
     * ��ȡ���Դ���Ӣ������
     * @return ���Դ���Ӣ�����Ƶ�ֵ
     */
    public String getCodeEName(){
        return codeEName;
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
