package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IAContact�����ݴ���������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class IAContactDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
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
    private DateTime applyDate = new DateTime();
    /** ����Amount */
    private int amount = 0;
    /** ����Content */
    private String content = "";
    /** ����DealType */
    private String dealType = "";
    /** ����ConfirmName */
    private String confirmName = "";
    /** ����ConfirmDate */
    private DateTime confirmDate = new DateTime();
    /** ����ConfirmContent */
    private String confirmContent = "";
    /** ����DealConfirmName */
    private String dealConfirmName = "";
    /** ����DealConfirmDate */
    private DateTime dealConfirmDate = new DateTime();
    /** ����DealConfirmContent */
    private String dealConfirmContent = "";
    /** ����DealName */
    private String dealName = "";
    /** ����DealDate */
    private DateTime dealDate = new DateTime();
    /** ����DealContent */
    private String dealContent = "";
    /** ����Status */
    private String status = "";
    /** ����Remark */
    private String remark = "";
    /** ����RuestionType */
    private String questionType = "";
    /** ����RuestionType */
    private String editData = "";
    /** ����RuestionType */
    private String appearType = "";
    /** ����RuestionType */
    private String editRequirement = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�IAContactDtoBase����
     */
    public IAContactDtoBase(){
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
    public void setApplyDate(DateTime applyDate){
        this.applyDate = applyDate;
    }

    /**
     * ��ȡ����ApplyDate
     * @return ����ApplyDate��ֵ
     */
    public DateTime getApplyDate(){
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
    public void setConfirmDate(DateTime confirmDate){
        this.confirmDate = confirmDate;
    }

    /**
     * ��ȡ����ConfirmDate
     * @return ����ConfirmDate��ֵ
     */
    public DateTime getConfirmDate(){
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
    public void setDealDate(DateTime dealDate){
        this.dealDate = dealDate;
    }

    /**
     * ��ȡ����DealDate
     * @return ����DealDate��ֵ
     */
    public DateTime getDealDate(){
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
