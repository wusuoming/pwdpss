package com.elongway.pss.ui.view.system;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * ������� IATask
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */

public class IATaskForm  extends AbstractForm {

    private static final long serialVersionUID = 1L;
    /** ����TaskCode */
    private String taskCode = "";
    /** ����TaskName */
    private String taskName = "";
    /** ����UserType */
    private String userType = "";
    /** ����Description */
    private String description = "";
    /** ����ValidStatus */
    private String validStatus = "";
    /** ����Flag */
    private String flag = "";

    /**
     * ��������TaskCode
     * @param taskCode �����õ�����TaskCode��ֵ
     */
    public void setTaskCode(String taskCode){
        this.taskCode = StringUtils.rightTrim(taskCode);
    }

    /**
     * ��ȡ����TaskCode
     * @return ����TaskCode��ֵ
     */
    public String getTaskCode(){
        return taskCode;
    }

    /**
     * ��������TaskName
     * @param taskName �����õ�����TaskName��ֵ
     */
    public void setTaskName(String taskName){
        this.taskName = StringUtils.rightTrim(taskName);
    }

    /**
     * ��ȡ����TaskName
     * @return ����TaskName��ֵ
     */
    public String getTaskName(){
        return taskName;
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
