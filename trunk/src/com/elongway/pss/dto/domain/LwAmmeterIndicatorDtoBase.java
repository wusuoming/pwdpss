package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeterIndicator-�����¼������ݴ���������<br>
 */
public class LwAmmeterIndicatorDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������� */
    private String serialNo = "";
    /** ���Ա�� */
    private String ammeterNo = "";
    /** ���Ե�ǰָ�� */
    private int currentNum = 0;
    /** �����ϱ�ָ�� */
    private int startNum = 0;
    /** ���Գ������� */
    private String readAmmeterDate = "";
    /** ���Ի������� */
    private String operateDate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwAmmeterIndicatorDtoBase����
     */
    public LwAmmeterIndicatorDtoBase(){
    }

    /**
     * �����������
     * @param serialNo �����õ�������ŵ�ֵ
     */
    public void setSerialNo(String serialNo){
        this.serialNo = StringUtils.rightTrim(serialNo);
    }

    /**
     * ��ȡ�������
     * @return ������ŵ�ֵ
     */
    public String getSerialNo(){
        return serialNo;
    }

    /**
     * �������Ա��
     * @param ammeterNo �����õ����Ա�ŵ�ֵ
     */
    public void setAmmeterNo(String ammeterNo){
        this.ammeterNo = StringUtils.rightTrim(ammeterNo);
    }

    /**
     * ��ȡ���Ա��
     * @return ���Ա�ŵ�ֵ
     */
    public String getAmmeterNo(){
        return ammeterNo;
    }

    /**
     * �������Ե�ǰָ��
     * @param currentNum �����õ����Ե�ǰָ���ֵ
     */
    public void setCurrentNum(int currentNum){
        this.currentNum = currentNum;
    }

    /**
     * ��ȡ���Ե�ǰָ��
     * @return ���Ե�ǰָ���ֵ
     */
    public int getCurrentNum(){
        return currentNum;
    }

    /**
     * ���������ϱ�ָ��
     * @param startNum �����õ������ϱ�ָ���ֵ
     */
    public void setStartNum(int startNum){
        this.startNum = startNum;
    }

    /**
     * ��ȡ�����ϱ�ָ��
     * @return �����ϱ�ָ���ֵ
     */
    public int getStartNum(){
        return startNum;
    }

    /**
     * �������Գ�������
     * @param readAmmeterDate �����õ����Գ������ڵ�ֵ
     */
    public void setReadAmmeterDate(String readAmmeterDate){
        this.readAmmeterDate = StringUtils.rightTrim(readAmmeterDate);
    }

    /**
     * ��ȡ���Գ�������
     * @return ���Գ������ڵ�ֵ
     */
    public String getReadAmmeterDate(){
        return readAmmeterDate;
    }

    /**
     * �������Ի�������
     * @param operateDate �����õ����Ի������ڵ�ֵ
     */
    public void setOperateDate(String operateDate){
        this.operateDate = StringUtils.rightTrim(operateDate);
    }

    /**
     * ��ȡ���Ի�������
     * @return ���Ի������ڵ�ֵ
     */
    public String getOperateDate(){
        return operateDate;
    }

    /**
     * ���������Ƿ���Ч
     * @param validStatus �����õ������Ƿ���Ч��ֵ
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * ��ȡ�����Ƿ���Ч
     * @return �����Ƿ���Ч��ֵ
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * �������Ա�־
     * @param flag �����õ����Ա�־��ֵ
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * ��ȡ���Ա�־
     * @return ���Ա�־��ֵ
     */
    public String getFlag(){
        return flag;
    }

    /**
     * ��������ע��
     * @param remark �����õ�����ע�͵�ֵ
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * ��ȡ����ע��
     * @return ����ע�͵�ֵ
     */
    public String getRemark(){
        return remark;
    }
}
