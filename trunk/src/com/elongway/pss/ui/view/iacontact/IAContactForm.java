package com.elongway.pss.ui.view.iacontact;


import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

import com.sinosoft.sysframework.web.view.AbstractForm;

import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;
/**
 * 承保信息查询．
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
	 /** 属性ContactNo */
    private String contactNo = "";
    /** 属性CompanyCode */
    private String companyCode = "";
    /** 属性MakeCode */
    private String makeCode = "";
    /** 属性AreaCode */
    private String areaCode = "";
    /** 属性UserCode */
    private String userCode = "";
    /** 属性Creator */
    private String creator = "";
    /** 属性PhoneNumber */
    private String phoneNumber = "";
    /** 属性Email */
    private String email = "";
    /** 属性ApplyDate */
    private String applyDate = "";
    /** 属性Amount */
    private int amount = 0;
    /** 属性Content */
    private String content = "";
    /** 属性DealType */
    private String dealType = "";
    /** 属性ConfirmName */
    private String confirmName = "";
    /** 属性ConfirmDate */
    private String confirmDate = "";
    /** 属性ConfirmContent */
    private String confirmContent = "";
    /** 属性ConfirmName */
    private String dealConfirmName = "";
    /** 属性ConfirmDate */
    private String dealConfirmDate = "";
    /** 属性ConfirmContent */
    private String dealConfirmContent = "";
    /** 属性DealName */
    private String dealName = "";
    /** 属性DealDate */
    private String dealDate = "";
    /** 属性DealContent */
    private String dealContent = "";
    /** 属性Status */
    private String status = "";
    /** 属性Remark */
    private String remark = "";
    /** 属性questionType */
    private String questionType = "";
    /** 属性policyNo */
    private String tpolicyNo = "";
    /** 属性ppolicyNo */
    private String ppolicyNo = "";
    /** 属性policyQueryNo */
    private String policyQueryNo = "";
    /** 属性policyConfirmNo */
    private String policyConfirmNo = "";
    /** 属性endorseQueryNo */
    private String endorseQueryNo = "";
    /** 属性endorseConfirmNo */
    private String endorseConfirmNo = "";
    /** 属性tendorseQueryNo */
    private String tendorseQueryNo = "";
    /** 属性tendorseConfirmNo */
    private String tendorseConfirmNo = "";
    /** 属性endorseNo */
    private String endorseNo = "";
    /** 属性registNo */
    private String registNo = "";
    /** 属性claimQueryNo */
    private String claimQueryNo = "";

    

    /**
     *  默认构造方法,构造一个默认的IAContactDtoBase对象
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

    /**
     * 设置属性MakeCode
     * @param makeCode 待设置的属性MakeCode的值
     */
    public void setMakeCode(String makeCode){
        this.makeCode = StringUtils.rightTrim(makeCode);
    }

    /**
     * 获取属性MakeCode
     * @return 属性MakeCode的值
     */
    public String getMakeCode(){
        return makeCode;
    }

    /**
     * 设置属性AreaCode
     * @param areaCode 待设置的属性AreaCode的值
     */
    public void setAreaCode(String areaCode){
        this.areaCode = StringUtils.rightTrim(areaCode);
    }

    /**
     * 获取属性AreaCode
     * @return 属性AreaCode的值
     */
    public String getAreaCode(){
        return areaCode;
    }

    /**
     * 设置属性UserCode
     * @param userCode 待设置的属性UserCode的值
     */
    public void setUserCode(String userCode){
        this.userCode = StringUtils.rightTrim(userCode);
    }

    /**
     * 获取属性UserCode
     * @return 属性UserCode的值
     */
    public String getUserCode(){
        return userCode;
    }

    /**
     * 设置属性Creator
     * @param creator 待设置的属性Creator的值
     */
    public void setCreator(String creator){
        this.creator = StringUtils.rightTrim(creator);
    }

    /**
     * 获取属性Creator
     * @return 属性Creator的值
     */
    public String getCreator(){
        return creator;
    }

    /**
     * 设置属性PhoneNumber
     * @param phoneNumber 待设置的属性PhoneNumber的值
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = StringUtils.rightTrim(phoneNumber);
    }

    /**
     * 获取属性PhoneNumber
     * @return 属性PhoneNumber的值
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * 设置属性Email
     * @param email 待设置的属性Email的值
     */
    public void setEmail(String email){
        this.email = StringUtils.rightTrim(email);
    }

    /**
     * 获取属性Email
     * @return 属性Email的值
     */
    public String getEmail(){
        return email;
    }

    /**
     * 设置属性ApplyDate
     * @param applyDate 待设置的属性ApplyDate的值
     */
    public void setApplyDate(String applyDate){
        this.applyDate = applyDate;
    }

    /**
     * 获取属性ApplyDate
     * @return 属性ApplyDate的值
     */
    public String getApplyDate(){
        return applyDate;
    }

    /**
     * 设置属性Amount
     * @param amount 待设置的属性Amount的值
     */
    public void setAmount(int amount){
        this.amount = amount;
    }

    /**
     * 获取属性Amount
     * @return 属性Amount的值
     */
    public int getAmount(){
        return amount;
    }

    /**
     * 设置属性Content
     * @param content 待设置的属性Content的值
     */
    public void setContent(String content){
        this.content = StringUtils.rightTrim(content);
    }

    /**
     * 获取属性Content
     * @return 属性Content的值
     */
    public String getContent(){
        return content;
    }

    /**
     * 设置属性DealType
     * @param dealType 待设置的属性DealType的值
     */
    public void setDealType(String dealType){
        this.dealType = StringUtils.rightTrim(dealType);
    }

    /**
     * 获取属性DealType
     * @return 属性DealType的值
     */
    public String getDealType(){
        return dealType;
    }

    /**
     * 设置属性ConfirmName
     * @param confirmName 待设置的属性ConfirmName的值
     */
    public void setConfirmName(String confirmName){
        this.confirmName = StringUtils.rightTrim(confirmName);
    }

    /**
     * 获取属性ConfirmName
     * @return 属性ConfirmName的值
     */
    public String getConfirmName(){
        return confirmName;
    }

    /**
     * 设置属性ConfirmDate
     * @param confirmDate 待设置的属性ConfirmDate的值
     */
    public void setConfirmDate(String confirmDate){
        this.confirmDate = confirmDate;
    }

    /**
     * 获取属性ConfirmDate
     * @return 属性ConfirmDate的值
     */
    public String getConfirmDate(){
        return confirmDate;
    }

    /**
     * 设置属性ConfirmContent
     * @param confirmContent 待设置的属性ConfirmContent的值
     */
    public void setConfirmContent(String confirmContent){
        this.confirmContent = StringUtils.rightTrim(confirmContent);
    }

    /**
     * 获取属性ConfirmContent
     * @return 属性ConfirmContent的值
     */
    public String getConfirmContent(){
        return confirmContent;
    }

    /**
     * 设置属性DealName
     * @param dealName 待设置的属性DealName的值
     */
    public void setDealName(String dealName){
        this.dealName = StringUtils.rightTrim(dealName);
    }

    /**
     * 获取属性DealName
     * @return 属性DealName的值
     */
    public String getDealName(){
        return dealName;
    }

    /**
     * 设置属性DealDate
     * @param dealDate 待设置的属性DealDate的值
     */
    public void setDealDate(String dealDate){
        this.dealDate = dealDate;
    }

    /**
     * 获取属性DealDate
     * @return 属性DealDate的值
     */
    public String getDealDate(){
        return dealDate;
    }

    /**
     * 设置属性DealContent
     * @param dealContent 待设置的属性DealContent的值
     */
    public void setDealContent(String dealContent){
        this.dealContent = StringUtils.rightTrim(dealContent);
    }

    /**
     * 获取属性DealContent
     * @return 属性DealContent的值
     */
    public String getDealContent(){
        return dealContent;
    }

    /**
     * 设置属性Status
     * @param status 待设置的属性Status的值
     */
    public void setStatus(String status){
        this.status = StringUtils.rightTrim(status);
    }

    /**
     * 获取属性Status
     * @return 属性Status的值
     */
    public String getStatus(){
        return status;
    }

    /**
     * 设置属性Remark
     * @param remark 待设置的属性Remark的值
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * 获取属性Remark
     * @return 属性Remark的值
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
