package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IAContact的数据传输对象基类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IAContactDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
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
    private DateTime applyDate = new DateTime();
    /** 属性Amount */
    private int amount = 0;
    /** 属性Content */
    private String content = "";
    /** 属性DealType */
    private String dealType = "";
    /** 属性ConfirmName */
    private String confirmName = "";
    /** 属性ConfirmDate */
    private DateTime confirmDate = new DateTime();
    /** 属性ConfirmContent */
    private String confirmContent = "";
    /** 属性DealConfirmName */
    private String dealConfirmName = "";
    /** 属性DealConfirmDate */
    private DateTime dealConfirmDate = new DateTime();
    /** 属性DealConfirmContent */
    private String dealConfirmContent = "";
    /** 属性DealName */
    private String dealName = "";
    /** 属性DealDate */
    private DateTime dealDate = new DateTime();
    /** 属性DealContent */
    private String dealContent = "";
    /** 属性Status */
    private String status = "";
    /** 属性Remark */
    private String remark = "";
    /** 属性RuestionType */
    private String questionType = "";
    /** 属性RuestionType */
    private String editData = "";
    /** 属性RuestionType */
    private String appearType = "";
    /** 属性RuestionType */
    private String editRequirement = "";

    /**
     *  默认构造方法,构造一个默认的IAContactDtoBase对象
     */
    public IAContactDtoBase(){
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
    public void setApplyDate(DateTime applyDate){
        this.applyDate = applyDate;
    }

    /**
     * 获取属性ApplyDate
     * @return 属性ApplyDate的值
     */
    public DateTime getApplyDate(){
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
    public void setConfirmDate(DateTime confirmDate){
        this.confirmDate = confirmDate;
    }

    /**
     * 获取属性ConfirmDate
     * @return 属性ConfirmDate的值
     */
    public DateTime getConfirmDate(){
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
    public void setDealDate(DateTime dealDate){
        this.dealDate = dealDate;
    }

    /**
     * 获取属性DealDate
     * @return 属性DealDate的值
     */
    public DateTime getDealDate(){
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

	public String getDealConfirmContent() {
		return dealConfirmContent;
	}

	public void setDealConfirmContent(String dealConfirmContent) {
		this.dealConfirmContent = dealConfirmContent;
	}

	public DateTime getDealConfirmDate() {
		return dealConfirmDate;
	}

	public void setDealConfirmDate(DateTime dealConfirmDate) {
		this.dealConfirmDate = dealConfirmDate;
	}

	public String getDealConfirmName() {
		return dealConfirmName;
	}

	public void setDealConfirmName(String dealConfirmName) {
		this.dealConfirmName = dealConfirmName;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = StringUtils.rightTrim(questionType);
	}

	public String getEditData() {
		return editData;
	}

	public void setEditData(String editData) {
		this.editData = editData;
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


}
