package com.elongway.pss.ui.view.system;

import com.sinosoft.sysframework.common.util.StringUtils;
import com.sinosoft.sysframework.web.view.AbstractForm;

/**
 * 承保信息查询(主查询)．
 * 
 * @author yangfuqiang
 * @version 1.0 2006-09-18
 */
public class IAGradeTaskForm extends AbstractForm {

    private static final long serialVersionUID = 1L;
    /** 属性岗位代码 */
    private String gradeCode = "";
    /** 属性任务代码 */
    private String taskCode = "";
    /** 属性可处理的机构代码 */
    private String companyCode = "";
    /** 属性权限级别 */
    private int powerLevel = 0;
    /** 属性效力状态 */
    private String validStatus = "";
    /** 属性标志字段 */
    private String flag = "";
    /** 属性区域代码 */
    private String areaCode = "";

    /**
     * 设置属性岗位代码
     * @param gradeCode 待设置的属性岗位代码的值
     */
    public void setGradeCode(String gradeCode){
        this.gradeCode = StringUtils.rightTrim(gradeCode);
    }

    /**
     * 获取属性岗位代码
     * @return 属性岗位代码的值
     */
    public String getGradeCode(){
        return gradeCode;
    }

    /**
     * 设置属性任务代码
     * @param taskCode 待设置的属性任务代码的值
     */
    public void setTaskCode(String taskCode){
        this.taskCode = StringUtils.rightTrim(taskCode);
    }

    /**
     * 获取属性任务代码
     * @return 属性任务代码的值
     */
    public String getTaskCode(){
        return taskCode;
    }

    /**
     * 设置属性可处理的机构代码
     * @param companyCode 待设置的属性可处理的机构代码的值
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * 获取属性可处理的机构代码
     * @return 属性可处理的机构代码的值
     */
    public String getCompanyCode(){
        return companyCode;
    }

    /**
     * 设置属性权限级别
     * @param powerLevel 待设置的属性权限级别的值
     */
    public void setPowerLevel(int powerLevel){
        this.powerLevel = powerLevel;
    }

    /**
     * 获取属性权限级别
     * @return 属性权限级别的值
     */
    public int getPowerLevel(){
        return powerLevel;
    }

    /**
     * 设置属性效力状态
     * @param validStatus 待设置的属性效力状态的值
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * 获取属性效力状态
     * @return 属性效力状态的值
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * 设置属性标志字段
     * @param flag 待设置的属性标志字段的值
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * 获取属性标志字段
     * @return 属性标志字段的值
     */
    public String getFlag(){
        return flag;
    }

    /**
     * 设置属性区域代码
     * @param areaCode 待设置的属性区域代码的值
     */
    public void setAreaCode(String areaCode){
        this.areaCode = StringUtils.rightTrim(areaCode);
    }

    /**
     * 获取属性区域代码
     * @return 属性区域代码的值
     */
    public String getAreaCode(){
        return areaCode;
    }
}
