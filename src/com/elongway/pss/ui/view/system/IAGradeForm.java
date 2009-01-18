package com.elongway.pss.ui.view.system;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * 岗位定义表 IAGrade
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */
public class IAGradeForm extends AbstractForm {

    private static final long serialVersionUID = 1L;
    /** 属性GradeCode */
    private String gradeCode = "";
    /** 属性GradeName */
    private String gradeName = "";
    /** 属性UserType */
    private String userType = "";
    /** 属性Description */
    private String description = "";
    /** 属性ValidStatus */
    private String validStatus = "";
    /** 属性Flag */
    private String flag = "";

    /**
     * 设置属性GradeCode
     * @param gradeCode 待设置的属性GradeCode的值
     */
    public void setGradeCode(String gradeCode){
        this.gradeCode = StringUtils.rightTrim(gradeCode);
    }

    /**
     * 获取属性GradeCode
     * @return 属性GradeCode的值
     */
    public String getGradeCode(){
        return gradeCode;
    }

    /**
     * 设置属性GradeName
     * @param gradeName 待设置的属性GradeName的值
     */
    public void setGradeName(String gradeName){
        this.gradeName = StringUtils.rightTrim(gradeName);
    }

    /**
     * 获取属性GradeName
     * @return 属性GradeName的值
     */
    public String getGradeName(){
        return gradeName;
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
