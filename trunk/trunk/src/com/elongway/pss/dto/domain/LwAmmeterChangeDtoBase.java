package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeterChange-�������Ϣ�����ݴ���������<br>
 */
public class LwAmmeterChangeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������� */
    private String id = "";
    /** ���Ի��� */
    private String userNo = "";
    /** ���Ի��� */
    private String userName = "";
    /** ���Ա�� */
    private String ammeterNo = "";
    /** ������ */
    private String ammeterX = "";
    /** ���Է� */
    private String ammeterV = "";
    /** ���԰� */
    private String ammeterA = "";
    /** ������ʽ */
    private String ammeterType = "";
    /** ���Գ��� */
    private String factoryName = "";
    /** ���Գ��� */
    private String coust = "";
    /** ���Ծ��� */
    private String precision1 = "";
    /** ���Ա��� */
    private String rate = "";
    /** ���Ա���������ֵ */
    private int maxnum = 0;
    /** ��������ʹ������ */
    private String allowYear = "";
    /** �����ϱ��й�ָ�� */
    private double installWorkNum = 0D;
    /** �����ϱ��޹�ָ�� */
    private double installIdleNum = 0D;
    /** ���Թ����й�ָ�� */
    private double errorWorkNum = 0D;
    /** ���Թ����޹�ָ�� */
    private double errorIdleNum = 0D;
    /** ���Ի����޹����� */
    private double chgIdleQuantity = 0D;
    /** ���Ի����й����� */
    private double chgWorkNum = 0D;
    /** ���������й�ָ�� */
    private double lastWorkNum = 0D;
    /** ���������޹�ָ�� */
    private double lastIdleNum = 0D;
    /** ���Ե����� */
    private String ct = "";
    /** ���Ե�ѹ�� */
    private String pt = "";
    /** ����ǩ�� */
    private String signature = "";
    /** �����ϱ����� */
    private String installDate = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";
    /** ����ʹ������ */
    private String useStyle = "";
    /** ���Գ��� */
    private String factoryCcode = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwAmmeterChangeDtoBase����
     */
    public LwAmmeterChangeDtoBase(){
    }

    /**
     * �����������
     * @param id �����õ�������ŵ�ֵ
     */
    public void setId(String id){
        this.id = StringUtils.rightTrim(id);
    }

    /**
     * ��ȡ�������
     * @return ������ŵ�ֵ
     */
    public String getId(){
        return id;
    }

    /**
     * �������Ի���
     * @param userNo �����õ����Ի��ŵ�ֵ
     */
    public void setUserNo(String userNo){
        this.userNo = StringUtils.rightTrim(userNo);
    }

    /**
     * ��ȡ���Ի���
     * @return ���Ի��ŵ�ֵ
     */
    public String getUserNo(){
        return userNo;
    }

    /**
     * �������Ի���
     * @param userName �����õ����Ի�����ֵ
     */
    public void setUserName(String userName){
        this.userName = StringUtils.rightTrim(userName);
    }

    /**
     * ��ȡ���Ի���
     * @return ���Ի�����ֵ
     */
    public String getUserName(){
        return userName;
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
     * ����������
     * @param ammeterX �����õ��������ֵ
     */
    public void setAmmeterX(String ammeterX){
        this.ammeterX = StringUtils.rightTrim(ammeterX);
    }

    /**
     * ��ȡ������
     * @return �������ֵ
     */
    public String getAmmeterX(){
        return ammeterX;
    }

    /**
     * �������Է�
     * @param ammeterV �����õ����Է���ֵ
     */
    public void setAmmeterV(String ammeterV){
        this.ammeterV = StringUtils.rightTrim(ammeterV);
    }

    /**
     * ��ȡ���Է�
     * @return ���Է���ֵ
     */
    public String getAmmeterV(){
        return ammeterV;
    }

    /**
     * �������԰�
     * @param ammeterA �����õ����԰���ֵ
     */
    public void setAmmeterA(String ammeterA){
        this.ammeterA = StringUtils.rightTrim(ammeterA);
    }

    /**
     * ��ȡ���԰�
     * @return ���԰���ֵ
     */
    public String getAmmeterA(){
        return ammeterA;
    }

    /**
     * ����������ʽ
     * @param ammeterType �����õ�������ʽ��ֵ
     */
    public void setAmmeterType(String ammeterType){
        this.ammeterType = StringUtils.rightTrim(ammeterType);
    }

    /**
     * ��ȡ������ʽ
     * @return ������ʽ��ֵ
     */
    public String getAmmeterType(){
        return ammeterType;
    }

    /**
     * �������Գ���
     * @param factoryName �����õ����Գ�����ֵ
     */
    public void setFactoryName(String factoryName){
        this.factoryName = StringUtils.rightTrim(factoryName);
    }

    /**
     * ��ȡ���Գ���
     * @return ���Գ�����ֵ
     */
    public String getFactoryName(){
        return factoryName;
    }

    /**
     * �������Գ���
     * @param coust �����õ����Գ�����ֵ
     */
    public void setCoust(String coust){
        this.coust = StringUtils.rightTrim(coust);
    }

    /**
     * ��ȡ���Գ���
     * @return ���Գ�����ֵ
     */
    public String getCoust(){
        return coust;
    }

    /**
     * �������Ծ���
     * @param precision �����õ����Ծ��ȵ�ֵ
     */
    public void setPrecision(String precision){
        this.precision1 = StringUtils.rightTrim(precision);
    }

    /**
     * ��ȡ���Ծ���
     * @return ���Ծ��ȵ�ֵ
     */
    public String getPrecision(){
        return precision1;
    }

    /**
     * �������Ա���
     * @param rate �����õ����Ա��ʵ�ֵ
     */
    public void setRate(String rate){
        this.rate = StringUtils.rightTrim(rate);
    }

    /**
     * ��ȡ���Ա���
     * @return ���Ա��ʵ�ֵ
     */
    public String getRate(){
        return rate;
    }

    /**
     * �������Ա���������ֵ
     * @param maxnum �����õ����Ա���������ֵ��ֵ
     */
    public void setMaxnum(int maxnum){
        this.maxnum = maxnum;
    }

    /**
     * ��ȡ���Ա���������ֵ
     * @return ���Ա���������ֵ��ֵ
     */
    public int getMaxnum(){
        return maxnum;
    }

    /**
     * ������������ʹ������
     * @param allowYear �����õ���������ʹ�����޵�ֵ
     */
    public void setAllowYear(String allowYear){
        this.allowYear = StringUtils.rightTrim(allowYear);
    }

    /**
     * ��ȡ��������ʹ������
     * @return ��������ʹ�����޵�ֵ
     */
    public String getAllowYear(){
        return allowYear;
    }

    /**
     * ���������ϱ��й�ָ��
     * @param installWorkNum �����õ������ϱ��й�ָ���ֵ
     */
    public void setInstallWorkNum(double installWorkNum){
        this.installWorkNum = installWorkNum;
    }

    /**
     * ��ȡ�����ϱ��й�ָ��
     * @return �����ϱ��й�ָ���ֵ
     */
    public double getInstallWorkNum(){
        return installWorkNum;
    }

    /**
     * ���������ϱ��޹�ָ��
     * @param installIdleNum �����õ������ϱ��޹�ָ���ֵ
     */
    public void setInstallIdleNum(double installIdleNum){
        this.installIdleNum = installIdleNum;
    }

    /**
     * ��ȡ�����ϱ��޹�ָ��
     * @return �����ϱ��޹�ָ���ֵ
     */
    public double getInstallIdleNum(){
        return installIdleNum;
    }

    /**
     * �������Թ����й�ָ��
     * @param errorWorkNum �����õ����Թ����й�ָ���ֵ
     */
    public void setErrorWorkNum(double errorWorkNum){
        this.errorWorkNum = errorWorkNum;
    }

    /**
     * ��ȡ���Թ����й�ָ��
     * @return ���Թ����й�ָ���ֵ
     */
    public double getErrorWorkNum(){
        return errorWorkNum;
    }

    /**
     * �������Թ����޹�ָ��
     * @param errorIdleNum �����õ����Թ����޹�ָ���ֵ
     */
    public void setErrorIdleNum(double errorIdleNum){
        this.errorIdleNum = errorIdleNum;
    }

    /**
     * ��ȡ���Թ����޹�ָ��
     * @return ���Թ����޹�ָ���ֵ
     */
    public double getErrorIdleNum(){
        return errorIdleNum;
    }

    /**
     * �������Ի����޹�����
     * @param chgIdleQuantity �����õ����Ի����޹�������ֵ
     */
    public void setChgIdleQuantity(double chgIdleQuantity){
        this.chgIdleQuantity = chgIdleQuantity;
    }

    /**
     * ��ȡ���Ի����޹�����
     * @return ���Ի����޹�������ֵ
     */
    public double getChgIdleQuantity(){
        return chgIdleQuantity;
    }

    /**
     * �������Ի����й�����
     * @param chgWorkNum �����õ����Ի����й�������ֵ
     */
    public void setChgWorkNum(double chgWorkNum){
        this.chgWorkNum = chgWorkNum;
    }

    /**
     * ��ȡ���Ի����й�����
     * @return ���Ի����й�������ֵ
     */
    public double getChgWorkNum(){
        return chgWorkNum;
    }

    /**
     * �������������й�ָ��
     * @param lastWorkNum �����õ����������й�ָ���ֵ
     */
    public void setLastWorkNum(double lastWorkNum){
        this.lastWorkNum = lastWorkNum;
    }

    /**
     * ��ȡ���������й�ָ��
     * @return ���������й�ָ���ֵ
     */
    public double getLastWorkNum(){
        return lastWorkNum;
    }

    /**
     * �������������޹�ָ��
     * @param lastIdleNum �����õ����������޹�ָ���ֵ
     */
    public void setLastIdleNum(double lastIdleNum){
        this.lastIdleNum = lastIdleNum;
    }

    /**
     * ��ȡ���������޹�ָ��
     * @return ���������޹�ָ���ֵ
     */
    public double getLastIdleNum(){
        return lastIdleNum;
    }

    /**
     * �������Ե�����
     * @param ct �����õ����Ե����ȵ�ֵ
     */
    public void setCt(String ct){
        this.ct = StringUtils.rightTrim(ct);
    }

    /**
     * ��ȡ���Ե�����
     * @return ���Ե����ȵ�ֵ
     */
    public String getCt(){
        return ct;
    }

    /**
     * �������Ե�ѹ��
     * @param pt �����õ����Ե�ѹ�ȵ�ֵ
     */
    public void setPt(String pt){
        this.pt = StringUtils.rightTrim(pt);
    }

    /**
     * ��ȡ���Ե�ѹ��
     * @return ���Ե�ѹ�ȵ�ֵ
     */
    public String getPt(){
        return pt;
    }

    /**
     * ��������ǩ��
     * @param signature �����õ�����ǩ����ֵ
     */
    public void setSignature(String signature){
        this.signature = StringUtils.rightTrim(signature);
    }

    /**
     * ��ȡ����ǩ��
     * @return ����ǩ����ֵ
     */
    public String getSignature(){
        return signature;
    }

    /**
     * ���������ϱ�����
     * @param installDate �����õ������ϱ����ڵ�ֵ
     */
    public void setInstallDate(String installDate){
        this.installDate = StringUtils.rightTrim(installDate);
    }

    /**
     * ��ȡ�����ϱ�����
     * @return �����ϱ����ڵ�ֵ
     */
    public String getInstallDate(){
        return installDate;
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

    /**
     * ��������ʹ������
     * @param useStyle �����õ�����ʹ�����͵�ֵ
     */
    public void setUseStyle(String useStyle){
        this.useStyle = StringUtils.rightTrim(useStyle);
    }

    /**
     * ��ȡ����ʹ������
     * @return ����ʹ�����͵�ֵ
     */
    public String getUseStyle(){
        return useStyle;
    }

    /**
     * �������Գ���
     * @param factoryCcode �����õ����Գ��ŵ�ֵ
     */
    public void setFactoryCcode(String factoryCcode){
        this.factoryCcode = StringUtils.rightTrim(factoryCcode);
    }

    /**
     * ��ȡ���Գ���
     * @return ���Գ��ŵ�ֵ
     */
    public String getFactoryCcode(){
        return factoryCcode;
    }
}
