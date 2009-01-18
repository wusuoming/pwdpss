package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADFile�����ݴ���������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IADFileDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ����ContactNo */
    private String contactNo = "";
    /** ����FileName */
    private String fileName = "";
    /** ����FileUuid */
    private String fileUuid = "";
    /** ����UpLoadDate */
    private DateTime upLoadDate = new DateTime();
    /** ����CompanyCode */
    private String companyCode = "";
    
    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�IADFileDtoBase����
     */
    public IADFileDtoBase(){
    }

    /**
     * ��������ContactNo
     * @param contactNo �����õ�����ContactNo��ֵ
     */
    public void setContactNo(String contactNo){
        this.contactNo = StringUtils.rightTrim(contactNo);
    }

    /**
     * ��ȡ����ContactNo
     * @return ����ContactNo��ֵ
     */
    public String getContactNo(){
        return contactNo;
    }

    /**
     * ��������FileName
     * @param fileName �����õ�����FileName��ֵ
     */
    public void setFileName(String fileName){
        this.fileName = StringUtils.rightTrim(fileName);
    }

    /**
     * ��ȡ����FileName
     * @return ����FileName��ֵ
     */
    public String getFileName(){
        return fileName;
    }

    /**
     * ��������FileUuid
     * @param fileUuid �����õ�����FileUuid��ֵ
     */
    public void setFileUuid(String fileUuid){
        this.fileUuid = StringUtils.rightTrim(fileUuid);
    }

    /**
     * ��ȡ����FileUuid
     * @return ����FileUuid��ֵ
     */
    public String getFileUuid(){
        return fileUuid;
    }

    /**
     * ��������UpLoadDate
     * @param upLoadDate �����õ�����UpLoadDate��ֵ
     */
    public void setUpLoadDate(DateTime upLoadDate){
        this.upLoadDate = upLoadDate;
    }

    /**
     * ��ȡ����UpLoadDate
     * @return ����UpLoadDate��ֵ
     */
    public DateTime getUpLoadDate(){
        return upLoadDate;
    }

    /**
     * ��������CompanyCode
     * @param companyCode �����õ�����CompanyCode��ֵ
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * ��ȡ����CompanyCode
     * @return ����CompanyCode��ֵ
     */
    public String getCompanyCode(){
        return companyCode;
    }
}
