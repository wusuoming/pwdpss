package com.elongway.pss.ui.view.common;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.apache.struts.upload.MultipartRequestHandler;

public class UploadForm extends ActionForm{
	private String contactNo; 
	private String fileName; 
	private String contentType; 
	private int fileSize;    	   
	private String fileBody;
	private static final long serialVersionUID = 1L;
	public static final String ERROR_PROPERTY_MAX_LENGTH_EXCEEDED = "org.apache.struts.webapp.upload.MaxLengthExceeded"; 

	private FormFile file1;	
	
	private FormFile file2 ;
	private FormFile file3 ;
	private FormFile file4 ;
	private FormFile file5 ;
	
	public FormFile getFile2() {
		return file2;
	}

//	public String getFile3() {
//		return file3;
//	}
//
//	public void setFile3(String file3) {
//		this.file3 = file3;
//	}

	public FormFile getFile1() {
		return file1;
	}

	public void setFile1(FormFile file1) {
		this.file1=file1;
	}
	public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request)
    {
        ActionErrors errors = null;
        //has the maximum length been exceeded?
        Boolean maxLengthExceeded = (Boolean) request
                .getAttribute(MultipartRequestHandler.ATTRIBUTE_MAX_LENGTH_EXCEEDED);
        if ((maxLengthExceeded != null) && (maxLengthExceeded.booleanValue()))
        {
            errors = new ActionErrors();
            errors.add(ERROR_PROPERTY_MAX_LENGTH_EXCEEDED, new ActionError(
                    "maxLengthExceeded"));
        }
        return errors; 

    }

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
	

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public static String getERROR_PROPERTY_MAX_LENGTH_EXCEEDED() {
		return ERROR_PROPERTY_MAX_LENGTH_EXCEEDED;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getFileBody() {
		return fileBody;
	}

	public void setFileBody(String fileBody) {
		this.fileBody = fileBody;
	}


	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}



	public void setFile2(FormFile file2) {
		this.file2 = file2;
	}



	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public FormFile getFile3() {
		return file3;
	}

	public void setFile3(FormFile file3) {
		this.file3 = file3;
	}

	public FormFile getFile4() {
		return file4;
	}

	public void setFile4(FormFile file4) {
		this.file4 = file4;
	}

	public FormFile getFile5() {
		return file5;
	}

	public void setFile5(FormFile file5) {
		this.file5 = file5;
	}
}