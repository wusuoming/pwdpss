package com.elongway.pss.ui.view.system;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * ��λ����� IAGrade
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */
public class IAGradeForm extends AbstractForm {

    private static final long serialVersionUID = 1L;
    /** ����GradeCode */
    private String gradeCode = "";
    /** ����GradeName */
    private String gradeName = "";
    /** ����UserType */
    private String userType = "";
    /** ����Description */
    private String description = "";
    /** ����ValidStatus */
    private String validStatus = "";
    /** ����Flag */
    private String flag = "";

    /**
     * ��������GradeCode
     * @param gradeCode �����õ�����GradeCode��ֵ
     */
    public void setGradeCode(String gradeCode){
        this.gradeCode = StringUtils.rightTrim(gradeCode);
    }

    /**
     * ��ȡ����GradeCode
     * @return ����GradeCode��ֵ
     */
    public String getGradeCode(){
        return gradeCode;
    }

    /**
     * ��������GradeName
     * @param gradeName �����õ�����GradeName��ֵ
     */
    public void setGradeName(String gradeName){
        this.gradeName = StringUtils.rightTrim(gradeName);
    }

    /**
     * ��ȡ����GradeName
     * @return ����GradeName��ֵ
     */
    public String getGradeName(){
        return gradeName;
    }

    /**
     * ��������UserType
     * @param userType �����õ�����UserType��ֵ
     */
    public void setUserType(String userType){
        this.userType = StringUtils.rightTrim(userType);
    }

    /**
     * ��ȡ����UserType
     * @return ����UserType��ֵ
     */
    public String getUserType(){
        return userType;
    }

    /**
     * ��������Description
     * @param description �����õ�����Description��ֵ
     */
    public void setDescription(String description){
        this.description = StringUtils.rightTrim(description);
    }

    /**
     * ��ȡ����Description
     * @return ����Description��ֵ
     */
    public String getDescription(){
        return description;
    }

    /**
     * ��������ValidStatus
     * @param validStatus �����õ�����ValidStatus��ֵ
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * ��ȡ����ValidStatus
     * @return ����ValidStatus��ֵ
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * ��������Flag
     * @param flag �����õ�����Flag��ֵ
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * ��ȡ����Flag
     * @return ����Flag��ֵ
     */
    public String getFlag(){
        return flag;
    }
}
