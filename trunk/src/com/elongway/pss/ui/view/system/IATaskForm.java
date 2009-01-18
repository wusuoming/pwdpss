package com.elongway.pss.ui.view.system;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * 任务定义表 IATask
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */

public class IATaskForm  extends AbstractForm {

    private static final long serialVersionUID = 1L;
    /** 属性TaskCode */
    private String taskCode = "";
    /** 属性TaskName */
    private String taskName = "";
    /** 属性UserType */
    private String userType = "";
    /** 属性Description */
    private String description = "";
    /** 属性ValidStatus */
    private String validStatus = "";
    /** 属性Flag */
    private String flag = "";

    /**
     * 设置属性TaskCode
     * @param taskCode 待设置的属性TaskCode的值
     */
    public void setTaskCode(String taskCode){
        this.taskCode = StringUtils.rightTrim(taskCode);
    }

    /**
     * 获取属性TaskCode
     * @return 属性TaskCode的值
     */
    public String getTaskCode(){
        return taskCode;
    }

    /**
     * 设置属性TaskName
     * @param taskName 待设置的属性TaskName的值
     */
    public void setTaskName(String taskName){
        this.taskName = StringUtils.rightTrim(taskName);
    }

    /**
     * 获取属性TaskName
     * @return 属性TaskName的值
     */
    public String getTaskName(){
        return taskName;
    }

    /**
     * 设置属性UserType
     * @param userType 待设置的属性UserType的值
     */
    public void setUserType(String userType){
        this.userType = StringUtils.rightTrim(userType);
    }

    /**
     * 获取属性UserType
     * @return 属性UserType的值
     */
    public String getUserType(){
        return userType;
    }

    /**
     * 设置属性Description
     * @param description 待设置的属性Description的值
     */
    public void setDescription(String description){
        this.description = StringUtils.rightTrim(description);
    }

    /**
     * 获取属性Description
     * @return 属性Description的值
     */
    public String getDescription(){
        return description;
    }

    /**
     * 设置属性ValidStatus
     * @param validStatus 待设置的属性ValidStatus的值
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * 获取属性ValidStatus
     * @return 属性ValidStatus的值
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * 设置属性Flag
     * @param flag 待设置的属性Flag的值
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * 获取属性Flag
     * @return 属性Flag的值
     */
    public String getFlag(){
        return flag;
    }
}
