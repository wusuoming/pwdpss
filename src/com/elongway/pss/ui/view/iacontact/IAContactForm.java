package com.elongway.pss.ui.view.iacontact;


import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

import com.sinosoft.sysframework.web.view.AbstractForm;

import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;
/**
 * �б���Ϣ��ѯ��
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */
public class IAContactForm extends ActionForm{//AbstractForm {

	private static final long serialVersionUID = 1L;
	private FormFile file1;		
	private FormFile file2;
	private FormFile file3;
	private FormFile file4;
	private FormFile file5;
	
	private String dataType1 = ""; 
	private String dataType2 = "";
	private String dataType3 = "";
	private String dataType4 = "";
	private String dataType5 = "";
	private String dataType6 = "";
	private String dataType7 = "";
	private String dataType8 = "";
	
	private String count1 = "";
	private String count2 = "";
	private String count3 = "";
	private String count4 = "";
	private String count5 = "";
	private String count6 = "";
	private String count7 = "";
	private String count8 = "";
	
	private String editType1 = "";
	private String editType2 = "";
	private String editType3 = "";
	private String editType4 = "";
	private String editType5 = "";
	private String editType6 = "";
	private String editType7 = "";
	private String editType8 = "";
	
	private String appearType = "";
	private String editRequirement = "";
	private String editData = "";
	
	
	
	private String companyCode2 = ""; 
	private String userGrade = ""; 
	
	private String queryDealType = ""; 
	private String queryContactStatus = ""; 
	 /** ����ContactNo */
    private String contactNo = "";
    /** ����CompanyCode */
    private String companyCode = "";
    /** ����MakeCode */
    private String makeCode = "";
    /** ����AreaCode */
    private String areaCode = "";
    /** ����UserCode */
    private String userCode = "";
    /** ����Creator */
    private String creator = "";
    /** ����PhoneNumber */
    private String phoneNumber = "";
    /** ����Email */
    private String email = "";
    /** ����ApplyDate */
    private String applyDate = "";
    /** ����Amount */
    private int amount = 0;
    /** ����Content */
    private String content = "";
    /** ����DealType */
    private String dealType = "";
    /** ����ConfirmName */
    private String confirmName = "";
    /** ����ConfirmDate */
    private String confirmDate = "";
    /** ����ConfirmContent */
    private String confirmContent = "";
    /** ����ConfirmName */
    private String dealConfirmName = "";
    /** ����ConfirmDate */
    private String dealConfirmDate = "";
    /** ����ConfirmContent */
    private String dealConfirmContent = "";
    /** ����DealName */
    private String dealName = "";
    /** ����DealDate */
    private String dealDate = "";
    /** ����DealContent */
    private String dealContent = "";
    /** ����Status */
    private String status = "";
    /** ����Remark */
    private String remark = "";
    /** ����questionType */
    private String questionType = "";
    /** ����policyNo */
    private String tpolicyNo = "";
    /** ����ppolicyNo */
    private String ppolicyNo = "";
    /** ����policyQueryNo */
    private String policyQueryNo = "";
    /** ����policyConfirmNo */
    private String policyConfirmNo = "";
    /** ����endorseQueryNo */
    private String endorseQueryNo = "";
    /** ����endorseConfirmNo */
    private String endorseConfirmNo = "";
    /** ����tendorseQueryNo */
    private String tendorseQueryNo = "";
    /** ����tendorseConfirmNo */
    private String tendorseConfirmNo = "";
    /** ����endorseNo */
    private String endorseNo = "";
    /** ����registNo */
    private String registNo = "";
    /** ����claimQueryNo */
    private String claimQueryNo = "";

    

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�IAContactDtoBase����
     */
     

	public String getPolicyQueryNo() {
		return policyQueryNo;
	}

	public void setPolicyQueryNo(String policyQueryNo) {
		this.policyQueryNo = policyQueryNo;
	}

	public String getPolicyConfirmNo() {
		return policyConfirmNo;
	}

	public void setPolicyConfirmNo(String policyConfirmNo) {
		this.policyConfirmNo = policyConfirmNo;
	}

	public String getEndorseQueryNo() {
		return endorseQueryNo;
	}

	public void setEndorseQueryNo(String endorseQueryNo) {
		this.endorseQueryNo = endorseQueryNo;
	}

	public String getEndorseConfirmNo() {
		return endorseConfirmNo;
	}

	public void setEndorseConfirmNo(String endorseConfirmNo) {
		this.endorseConfirmNo = endorseConfirmNo;
	}

	public String getEndorseNo() {
		return endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}

	public String getRegistNo() {
		return registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getClaimQueryNo() {
		return claimQueryNo;
	}

	public void setClaimQueryNo(String claimQueryNo) {
		this.claimQueryNo = claimQueryNo;
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

    /**
     * ��������MakeCode
     * @param makeCode �����õ�����MakeCode��ֵ
     */
    public void setMakeCode(String makeCode){
        this.makeCode = StringUtils.rightTrim(makeCode);
    }

    /**
     * ��ȡ����MakeCode
     * @return ����MakeCode��ֵ
     */
    public String getMakeCode(){
        return makeCode;
    }

    /**
     * ��������AreaCode
     * @param areaCode �����õ�����AreaCode��ֵ
     */
    public void setAreaCode(String areaCode){
        this.areaCode = StringUtils.rightTrim(areaCode);
    }

    /**
     * ��ȡ����AreaCode
     * @return ����AreaCode��ֵ
     */
    public String getAreaCode(){
        return areaCode;
    }

    /**
     * ��������UserCode
     * @param userCode �����õ�����UserCode��ֵ
     */
    public void setUserCode(String userCode){
        this.userCode = StringUtils.rightTrim(userCode);
    }

    /**
     * ��ȡ����UserCode
     * @return ����UserCode��ֵ
     */
    public String getUserCode(){
        return userCode;
    }

    /**
     * ��������Creator
     * @param creator �����õ�����Creator��ֵ
     */
    public void setCreator(String creator){
        this.creator = StringUtils.rightTrim(creator);
    }

    /**
     * ��ȡ����Creator
     * @return ����Creator��ֵ
     */
    public String getCreator(){
        return creator;
    }

    /**
     * ��������PhoneNumber
     * @param phoneNumber �����õ�����PhoneNumber��ֵ
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = StringUtils.rightTrim(phoneNumber);
    }

    /**
     * ��ȡ����PhoneNumber
     * @return ����PhoneNumber��ֵ
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * ��������Email
     * @param email �����õ�����Email��ֵ
     */
    public void setEmail(String email){
        this.email = StringUtils.rightTrim(email);
    }

    /**
     * ��ȡ����Email
     * @return ����Email��ֵ
     */
    public String getEmail(){
        return email;
    }

    /**
     * ��������ApplyDate
     * @param applyDate �����õ�����ApplyDate��ֵ
     */
    public void setApplyDate(String applyDate){
        this.applyDate = applyDate;
    }

    /**
     * ��ȡ����ApplyDate
     * @return ����ApplyDate��ֵ
     */
    public String getApplyDate(){
        return applyDate;
    }

    /**
     * ��������Amount
     * @param amount �����õ�����Amount��ֵ
     */
    public void setAmount(int amount){
        this.amount = amount;
    }

    /**
     * ��ȡ����Amount
     * @return ����Amount��ֵ
     */
    public int getAmount(){
        return amount;
    }

    /**
     * ��������Content
     * @param content �����õ�����Content��ֵ
     */
    public void setContent(String content){
        this.content = StringUtils.rightTrim(content);
    }

    /**
     * ��ȡ����Content
     * @return ����Content��ֵ
     */
    public String getContent(){
        return content;
    }

    /**
     * ��������DealType
     * @param dealType �����õ�����DealType��ֵ
     */
    public void setDealType(String dealType){
        this.dealType = StringUtils.rightTrim(dealType);
    }

    /**
     * ��ȡ����DealType
     * @return ����DealType��ֵ
     */
    public String getDealType(){
        return dealType;
    }

    /**
     * ��������ConfirmName
     * @param confirmName �����õ�����ConfirmName��ֵ
     */
    public void setConfirmName(String confirmName){
        this.confirmName = StringUtils.rightTrim(confirmName);
    }

    /**
     * ��ȡ����ConfirmName
     * @return ����ConfirmName��ֵ
     */
    public String getConfirmName(){
        return confirmName;
    }

    /**
     * ��������ConfirmDate
     * @param confirmDate �����õ�����ConfirmDate��ֵ
     */
    public void setConfirmDate(String confirmDate){
        this.confirmDate = confirmDate;
    }

    /**
     * ��ȡ����ConfirmDate
     * @return ����ConfirmDate��ֵ
     */
    public String getConfirmDate(){
        return confirmDate;
    }

    /**
     * ��������ConfirmContent
     * @param confirmContent �����õ�����ConfirmContent��ֵ
     */
    public void setConfirmContent(String confirmContent){
        this.confirmContent = StringUtils.rightTrim(confirmContent);
    }

    /**
     * ��ȡ����ConfirmContent
     * @return ����ConfirmContent��ֵ
     */
    public String getConfirmContent(){
        return confirmContent;
    }

    /**
     * ��������DealName
     * @param dealName �����õ�����DealName��ֵ
     */
    public void setDealName(String dealName){
        this.dealName = StringUtils.rightTrim(dealName);
    }

    /**
     * ��ȡ����DealName
     * @return ����DealName��ֵ
     */
    public String getDealName(){
        return dealName;
    }

    /**
     * ��������DealDate
     * @param dealDate �����õ�����DealDate��ֵ
     */
    public void setDealDate(String dealDate){
        this.dealDate = dealDate;
    }

    /**
     * ��ȡ����DealDate
     * @return ����DealDate��ֵ
     */
    public String getDealDate(){
        return dealDate;
    }

    /**
     * ��������DealContent
     * @param dealContent �����õ�����DealContent��ֵ
     */
    public void setDealContent(String dealContent){
        this.dealContent = StringUtils.rightTrim(dealContent);
    }

    /**
     * ��ȡ����DealContent
     * @return ����DealContent��ֵ
     */
    public String getDealContent(){
        return dealContent;
    }

    /**
     * ��������Status
     * @param status �����õ�����Status��ֵ
     */
    public void setStatus(String status){
        this.status = StringUtils.rightTrim(status);
    }

    /**
     * ��ȡ����Status
     * @return ����Status��ֵ
     */
    public String getStatus(){
        return status;
    }

    /**
     * ��������Remark
     * @param remark �����õ�����Remark��ֵ
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * ��ȡ����Remark
     * @return ����Remark��ֵ
     */
    public String getRemark(){
        return remark;
    }

	public String getQueryContactStatus() {
		return queryContactStatus;
	}

	public void setQueryContactStatus(String queryContactStatus) {
		this.queryContactStatus = queryContactStatus;
	}

	public String getQueryDealType() {
		return queryDealType;
	}

	public void setQueryDealType(String queryDealType) {
		this.queryDealType = queryDealType;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public String getCompanyCode2() {
		return companyCode2;
	}

	public void setCompanyCode2(String companyCode2) {
		this.companyCode2 = companyCode2;
	}

	public String getDealConfirmContent() {
		return dealConfirmContent;
	}

	public void setDealConfirmContent(String dealConfirmContent) {
		this.dealConfirmContent = StringUtils.rightTrim(dealConfirmContent);
	}

	public String getDealConfirmDate() {
		return dealConfirmDate;
	}

	public void setDealConfirmDate(String dealConfirmDate) {
		this.dealConfirmDate = dealConfirmDate;
	}

	public String getDealConfirmName() {
		return dealConfirmName;
	}

	public void setDealConfirmName(String dealConfirmName) {
		this.dealConfirmName = StringUtils.rightTrim(dealConfirmName);
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public String getTpolicyNo() {
		return tpolicyNo;
	}

	public void setTpolicyNo(String tpolicyNo) {
		this.tpolicyNo = tpolicyNo;
	}

	public String getTendorseQueryNo() {
		return tendorseQueryNo;
	}

	public void setTendorseQueryNo(String tendorseQueryNo) {
		this.tendorseQueryNo = tendorseQueryNo;
	}

	public String getTendorseConfirmNo() {
		return tendorseConfirmNo;
	}

	public void setTendorseConfirmNo(String tendorseConfirmNo) {
		this.tendorseConfirmNo = tendorseConfirmNo;
	}

	public String getPpolicyNo() {
		return ppolicyNo;
	}

	public void setPpolicyNo(String ppolicyNo) {
		this.ppolicyNo = ppolicyNo;
	}

	public String getDataType1() {
		return dataType1;
	}

	public void setDataType1(String dataType1) {
		this.dataType1 = dataType1;
	}

	public String getDataType2() {
		return dataType2;
	}

	public void setDataType2(String dataType2) {
		this.dataType2 = dataType2;
	}

	public String getDataType3() {
		return dataType3;
	}

	public void setDataType3(String dataType3) {
		this.dataType3 = dataType3;
	}

	public String getDataType4() {
		return dataType4;
	}

	public void setDataType4(String dataType4) {
		this.dataType4 = dataType4;
	}

	public String getDataType5() {
		return dataType5;
	}

	public void setDataType5(String dataType5) {
		this.dataType5 = dataType5;
	}

	public String getDataType6() {
		return dataType6;
	}

	public void setDataType6(String dataType6) {
		this.dataType6 = dataType6;
	}

	public String getDataType7() {
		return dataType7;
	}

	public void setDataType7(String dataType7) {
		this.dataType7 = dataType7;
	}

	public String getDataType8() {
		return dataType8;
	}

	public void setDataType8(String dataType8) {
		this.dataType8 = dataType8;
	}

	public String getCount1() {
		return count1;
	}

	public void setCount1(String count1) {
		this.count1 = count1;
	}

	public String getCount2() {
		return count2;
	}

	public void setCount2(String count2) {
		this.count2 = count2;
	}

	public String getCount3() {
		return count3;
	}

	public void setCount3(String count3) {
		this.count3 = count3;
	}

	public String getCount4() {
		return count4;
	}

	public void setCount4(String count4) {
		this.count4 = count4;
	}

	public String getCount5() {
		return count5;
	}

	public void setCount5(String count5) {
		this.count5 = count5;
	}

	public String getCount6() {
		return count6;
	}

	public void setCount6(String count6) {
		this.count6 = count6;
	}

	public String getCount7() {
		return count7;
	}

	public void setCount7(String count7) {
		this.count7 = count7;
	}

	public String getCount8() {
		return count8;
	}

	public void setCount8(String count8) {
		this.count8 = count8;
	}

	public String getEditType1() {
		return editType1;
	}

	public void setEditType1(String editType1) {
		this.editType1 = editType1;
	}

	public String getEditType2() {
		return editType2;
	}

	public void setEditType2(String editType2) {
		this.editType2 = editType2;
	}

	public String getEditType3() {
		return editType3;
	}

	public void setEditType3(String editType3) {
		this.editType3 = editType3;
	}

	public String getEditType4() {
		return editType4;
	}

	public void setEditType4(String editType4) {
		this.editType4 = editType4;
	}

	public String getEditType5() {
		return editType5;
	}

	public void setEditType5(String editType5) {
		this.editType5 = editType5;
	}

	public String getEditType6() {
		return editType6;
	}

	public void setEditType6(String editType6) {
		this.editType6 = editType6;
	}

	public String getEditType7() {
		return editType7;
	}

	public void setEditType7(String editType7) {
		this.editType7 = editType7;
	}

	public String getEditType8() {
		return editType8;
	}

	public void setEditType8(String editType8) {
		this.editType8 = editType8;
	}

	public String getAppearType() {
		return appearType;
	}

	public void setAppearType(String appearType) {
		this.appearType = appearType;
	}

	public String getEditRequirement() {
		return editRequirement;
	}

	public void setEditRequirement(String editRequirement) {
		this.editRequirement = editRequirement;
	}

	public String getEditData() {
		return editData;
	}

	public void setEditData(String editData) {
		this.editData = editData;
	}

	public FormFile getFile1() {
		return file1;
	}

	public void setFile1(FormFile file1) {
		this.file1 = file1;
	}

	public FormFile getFile2() {
		return file2;
	}

	public void setFile2(FormFile file2) {
		this.file2 = file2;
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

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	
}
