package com.elongway.pss.ui.control.common.pub;

import java.io.Serializable;
import java.util.Collection;

/**
 * LZY: δʹ�ã�
 * ϵͳ�û���
 * <p>Title: PICCZB</p>
 * <p>Description: PICCҵ��ϵͳ���ԭ�򼰿����淶(J2EE)����ʾ����</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>@createdate 2003/05/15</p>
 * @author zhouxianli
 * @version 1.0
 */
public final class User implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String password; //�û�����
    private String userCode; //�û�����
    private String userName;
    private String projectNo; //��Ŀ���
    private String projectName;
    private String cssStyle; //��ʽ
    private String taskCode; //�������
    private String checkCode; //Ȩ�޼������
    private String localHost; //Web������IP��ַ
    private String paperTypeCode; //
    private String temp; //��ʱ������ݵ��ֶ�
    private String fileName; //�ؼ�����ʱ��
//    private FileItem fileItem;
    private Collection checkList; //���ڴ���û�Ȩ��
    private Object queryConditionForm;
    private String createType; //��������
    private String createTypeName; //������������
    private String createNo; //��������
    private String createUpdatePaperType; //�Ե׸�������ͣ��������������޸�
    private String acBookCode; //�˲�����
    private String itemCode; //��Ŀ����
    private String insertCreateProjectNo; //���ڳ�����������׸��õ�
    private String insertCreateProcedureNo; //���ڳ�����������׸��õ�
    private String insertCreatePaperVersion; //���ڳ�����������׸��õ�
    private String insertCreatePaperName; //���ڳ�����������׸��õ�
    private String insertCreatePaperNature; //���ڳ�����������׸��õ�
    private String company; //���Ŵ���
    private String payMode; //��֧���
    private Collection knowledgeTypeList; //���ڴ��ר��֪ʶ������

    private String areaCode = ""; //���ڴ���û��������(����).
    /**
     * ��ȡ�û�����
     * @return �û�����
     */
    public String getPassword(){
        return password;
    }

    /**
     * �����û�����
     * @param password �û�����
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * ��ȡ�û�����
     * @return �û�����
     */
    public String getUserCode(){
        return userCode;
    }

    /**
     * �����û�����
     * @param userCode �û�����
     */
    public void setUserCode(String userCode){
        this.userCode = userCode;
    }

    /**
     * ��ȡ�û�����
     * @return �û�����
     */
    public String getUserName(){
        return userName;
    }

    /**
     * �����û�����
     * @param userName �û�����
     */
    public void setUserName(String userName){
        this.userName = userName;
    }

    /**
     * ��ȡ��Ŀ���
     * @return ��Ŀ���
     */
    public String getProjectNo(){
        return projectNo;
    }

    /**
     * ������Ŀ���
     * @param projectNo ��Ŀ���
     */
    public void setProjectNo(String projectNo){
        this.projectNo = projectNo;
    }

    /**
     * ��ȡ��Ŀ����
     * @return ��Ŀ����
     */
    public String getProjectName(){
        return projectName;
    }

    /**
     * ������Ŀ����
     * @param projectName ��Ŀ����
     */
    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    /**
     * ��ȡ�������
     * @return taskCode �������
     */
    public String getTaskCode(){
        return taskCode;
    }

    /**
     * �����������
     * @param taskCode �������
     */
    public void setTaskCode(String taskCode){
        this.taskCode = taskCode;
    }

    /**
     * ��ȡȨ�޼������
     * @return checkCode Ȩ�޼������
     */
    public String getCheckCode(){
        return checkCode;
    }

    /**
     * ����Ȩ�޼������
     * @param checkCode Ȩ�޼������
     */
    public void setCheckCode(String checkCode){
        this.checkCode = checkCode;
    }

    /**
     * ��ȡȨ������
     * @return checkList
     */
    public Collection getCheckList(){
        return checkList;
    }

    /**
     * ����Ȩ������
     * @param checkList Ȩ�޼������
     */
    public void setCheckList(Collection checkList){
        this.checkList = checkList;
    }

    public String getCssStyle(){
        return cssStyle;
    }

    public void setCssStyle(String cssStyle){
        this.cssStyle = cssStyle;
    }

    public String getLocalHost(){
        return localHost;
    }

    public void setLocalHost(String localHost){
        this.localHost = localHost;
    }

    public String getPaperTypeCode(){
        return paperTypeCode;
    }

    public void setPaperTypeCode(String paperTypeCode){
        this.paperTypeCode = paperTypeCode;
    }

    public String getTemp(){
        return temp;
    }

    public void setTemp(String temp){
        this.temp = temp;
    }

    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public Object getQueryConditionForm(){
        return queryConditionForm;
    }

    public void setQueryConditionForm(Object queryConditionForm){
        this.queryConditionForm = queryConditionForm;
    }

//    public FileItem getFileItem(){
//        return fileItem;
//    }
//
//    public void setFileItem(FileItem fileItem){
//        this.fileItem = fileItem;
//    }

    public String getCreateType(){
        return createType;
    }

    public void setCreateType(String createType){
        this.createType = createType;
    }

    public String getCreateTypeName(){
        return createTypeName;
    }

    public void setCreateTypeName(String createTypeName){
        this.createTypeName = createTypeName;
    }

    public String getCreateNo(){
        return createNo;
    }

    public void setCreateNo(String createNo){
        this.createNo = createNo;
    }

    public String getAcBookCode(){
        return acBookCode;
    }

    public void setAcBookCode(String acBookCode){
        this.acBookCode = acBookCode;
    }

    public String getItemCode(){
        return itemCode;
    }

    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
    }

    public String getCreateUpdatePaperType(){
        return createUpdatePaperType;
    }

    public void setCreateUpdatePaperType(String createUpdatePaperType){
        this.createUpdatePaperType = createUpdatePaperType;
    }

    public void setInsertCreateProjectNo(String insertCreateProjectNo){
        this.insertCreateProjectNo = insertCreateProjectNo;
    }

    public String getInsertCreateProjectNo(){
        return insertCreateProjectNo;
    }

    public void setInsertCreateProcedureNo(String insertCreateProcedureNo){
        this.insertCreateProcedureNo = insertCreateProcedureNo;
    }

    public String getInsertCreateProcedureNo(){
        return insertCreateProcedureNo;
    }

    public void setInsertCreatePaperVersion(String insertCreatePaperVersion){
        this.insertCreatePaperVersion = insertCreatePaperVersion;
    }

    public String getInsertCreatePaperVersion(){
        return insertCreatePaperVersion;
    }

    public void setInsertCreatePaperName(String insertCreatePaperName){
        this.insertCreatePaperName = insertCreatePaperName;
    }

    public String getInsertCreatePaperName(){
        return insertCreatePaperName;
    }

    public void setInsertCreatePaperNature(String insertCreatePaperNature){
        this.insertCreatePaperNature = insertCreatePaperNature;
    }

    public String getInsertCreatePaperNature(){
        return insertCreatePaperNature;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getPayMode(){
        return payMode;
    }

    public void setPayMode(String payMode){
        this.payMode = payMode;
    }

    public Collection getKnowledgeTypeList(){
        return knowledgeTypeList;
    }

    public void setKnowledgeTypeList(Collection knowledgeTypeList){
        this.knowledgeTypeList = knowledgeTypeList;
    }

	/**
	 * @return areaCode
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * @param areaCode Ҫ���õ� areaCode
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
}