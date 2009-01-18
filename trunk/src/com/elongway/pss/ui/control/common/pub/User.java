package com.elongway.pss.ui.control.common.pub;

import java.io.Serializable;
import java.util.Collection;

/**
 * LZY: 未使用！
 * 系统用户类
 * <p>Title: PICCZB</p>
 * <p>Description: PICC业务系统设计原则及开发规范(J2EE)版演示程序</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>@createdate 2003/05/15</p>
 * @author zhouxianli
 * @version 1.0
 */
public final class User implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String password; //用户密码
    private String userCode; //用户代码
    private String userName;
    private String projectNo; //项目编号
    private String projectName;
    private String cssStyle; //样式
    private String taskCode; //任务代码
    private String checkCode; //权限检验代码
    private String localHost; //Web服务器IP地址
    private String paperTypeCode; //
    private String temp; //临时存放数据的字段
    private String fileName; //控件保存时用
//    private FileItem fileItem;
    private Collection checkList; //用于存放用户权限
    private Object queryConditionForm;
    private String createType; //新增类型
    private String createTypeName; //新增类型名称
    private String createNo; //新增号码
    private String createUpdatePaperType; //对底稿操作类型，是新增、还是修改
    private String acBookCode; //账簿代码
    private String itemCode; //科目代码
    private String insertCreateProjectNo; //是在程序表中新增底稿用的
    private String insertCreateProcedureNo; //是在程序表中新增底稿用的
    private String insertCreatePaperVersion; //是在程序表中新增底稿用的
    private String insertCreatePaperName; //是在程序表中新增底稿用的
    private String insertCreatePaperNature; //是在程序表中新增底稿用的
    private String company; //部门代码
    private String payMode; //收支类别
    private Collection knowledgeTypeList; //用于存放专家知识库类型

    private String areaCode = ""; //用于存放用户区域代码(必须).
    /**
     * 获取用户密码
     * @return 用户密码
     */
    public String getPassword(){
        return password;
    }

    /**
     * 设置用户密码
     * @param password 用户密码
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * 获取用户代码
     * @return 用户代码
     */
    public String getUserCode(){
        return userCode;
    }

    /**
     * 设置用户代码
     * @param userCode 用户代码
     */
    public void setUserCode(String userCode){
        this.userCode = userCode;
    }

    /**
     * 获取用户名称
     * @return 用户名称
     */
    public String getUserName(){
        return userName;
    }

    /**
     * 设置用户名称
     * @param userName 用户名称
     */
    public void setUserName(String userName){
        this.userName = userName;
    }

    /**
     * 获取项目编号
     * @return 项目编号
     */
    public String getProjectNo(){
        return projectNo;
    }

    /**
     * 设置项目编号
     * @param projectNo 项目编号
     */
    public void setProjectNo(String projectNo){
        this.projectNo = projectNo;
    }

    /**
     * 获取项目名称
     * @return 项目名称
     */
    public String getProjectName(){
        return projectName;
    }

    /**
     * 设置项目名称
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    /**
     * 获取任务代码
     * @return taskCode 任务代码
     */
    public String getTaskCode(){
        return taskCode;
    }

    /**
     * 设置任务代码
     * @param taskCode 任务代码
     */
    public void setTaskCode(String taskCode){
        this.taskCode = taskCode;
    }

    /**
     * 获取权限检验代码
     * @return checkCode 权限检验代码
     */
    public String getCheckCode(){
        return checkCode;
    }

    /**
     * 设置权限检验代码
     * @param checkCode 权限检验代码
     */
    public void setCheckCode(String checkCode){
        this.checkCode = checkCode;
    }

    /**
     * 获取权限数组
     * @return checkList
     */
    public Collection getCheckList(){
        return checkList;
    }

    /**
     * 设置权限数组
     * @param checkList 权限检验代码
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
	 * @param areaCode 要设置的 areaCode
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
}