package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADFile的数据传输对象基类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IADFileDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性ContactNo */
    private String contactNo = "";
    /** 属性FileName */
    private String fileName = "";
    /** 属性FileUuid */
    private String fileUuid = "";
    /** 属性UpLoadDate */
    private DateTime upLoadDate = new DateTime();
    /** 属性CompanyCode */
    private String companyCode = "";
    
    /**
     *  默认构造方法,构造一个默认的IADFileDtoBase对象
     */
    public IADFileDtoBase(){
    }

    /**
     * 设置属性ContactNo
     * @param contactNo 待设置的属性ContactNo的值
     */
    public void setContactNo(String contactNo){
        this.contactNo = StringUtils.rightTrim(contactNo);
    }

    /**
     * 获取属性ContactNo
     * @return 属性ContactNo的值
     */
    public String getContactNo(){
        return contactNo;
    }

    /**
     * 设置属性FileName
     * @param fileName 待设置的属性FileName的值
     */
    public void setFileName(String fileName){
        this.fileName = StringUtils.rightTrim(fileName);
    }

    /**
     * 获取属性FileName
     * @return 属性FileName的值
     */
    public String getFileName(){
        return fileName;
    }

    /**
     * 设置属性FileUuid
     * @param fileUuid 待设置的属性FileUuid的值
     */
    public void setFileUuid(String fileUuid){
        this.fileUuid = StringUtils.rightTrim(fileUuid);
    }

    /**
     * 获取属性FileUuid
     * @return 属性FileUuid的值
     */
    public String getFileUuid(){
        return fileUuid;
    }

    /**
     * 设置属性UpLoadDate
     * @param upLoadDate 待设置的属性UpLoadDate的值
     */
    public void setUpLoadDate(DateTime upLoadDate){
        this.upLoadDate = upLoadDate;
    }

    /**
     * 获取属性UpLoadDate
     * @return 属性UpLoadDate的值
     */
    public DateTime getUpLoadDate(){
        return upLoadDate;
    }

    /**
     * 设置属性CompanyCode
     * @param companyCode 待设置的属性CompanyCode的值
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * 获取属性CompanyCode
     * @return 属性CompanyCode的值
     */
    public String getCompanyCode(){
        return companyCode;
    }
}
