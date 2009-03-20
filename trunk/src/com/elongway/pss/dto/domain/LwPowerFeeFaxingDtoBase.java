package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerFeeFaxing-��ѵ������б�����ݴ���������<br>
 */
public class LwPowerFeeFaxingDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ���Ի��� */
    private String userName = "";
    /** ����ͳ������ */
    private String statMonth = "";
    /** ����ͳ�Ʒ�ʽ */
    private String statStyle = "";
    /** ����¼������ */
    private String inputDate = "";
    /** ���Ե��� */
    private long quantity = 0L;
    /** ���Ե�� */
    private double purePowerFee = 0D;
    /** ���Ե��˰ */
    private double powerFeeTax = 0D;
    /** ������Ͽ */
    private double sanXiaFee = 0D;
    /** ������Ͽ˰ */
    private double sanXiaTax = 0D;
    /** ���Ե�� */
    private double pureDianJin = 0D;
    /** ���Ե��˰ */
    private double dianJinTax = 0D;
    /** ���Ի��� */
    private double pureJiJin = 0D;
    /** ���Ի���˰ */
    private double jiJinTax = 0D;
    /** ���Բ���� */
    private double chaBieFee = 0D;
    /** ���Բ����˰ */
    private double chaBieTax = 0D;
    /** �����ܼ� */
    private double sumFee = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwPowerFeeFaxingDtoBase����
     */
    public LwPowerFeeFaxingDtoBase(){
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
     * ��������ͳ������
     * @param statMonth �����õ�����ͳ�����µ�ֵ
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * ��ȡ����ͳ������
     * @return ����ͳ�����µ�ֵ
     */
    public String getStatMonth(){
        return statMonth;
    }

    /**
     * ��������ͳ�Ʒ�ʽ
     * @param statStyle �����õ�����ͳ�Ʒ�ʽ��ֵ
     */
    public void setStatStyle(String statStyle){
        this.statStyle = StringUtils.rightTrim(statStyle);
    }

    /**
     * ��ȡ����ͳ�Ʒ�ʽ
     * @return ����ͳ�Ʒ�ʽ��ֵ
     */
    public String getStatStyle(){
        return statStyle;
    }

    /**
     * ��������¼������
     * @param inputDate �����õ�����¼�����ڵ�ֵ
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * ��ȡ����¼������
     * @return ����¼�����ڵ�ֵ
     */
    public String getInputDate(){
        return inputDate;
    }

    /**
     * �������Ե���
     * @param quantity �����õ����Ե�����ֵ
     */
    public void setQuantity(long quantity){
        this.quantity = quantity;
    }

    /**
     * ��ȡ���Ե���
     * @return ���Ե�����ֵ
     */
    public long getQuantity(){
        return quantity;
    }

    /**
     * �������Ե��
     * @param purePowerFee �����õ����Ե�ѵ�ֵ
     */
    public void setPurePowerFee(double purePowerFee){
        this.purePowerFee = purePowerFee;
    }

    /**
     * ��ȡ���Ե��
     * @return ���Ե�ѵ�ֵ
     */
    public double getPurePowerFee(){
        return purePowerFee;
    }

    /**
     * �������Ե��˰
     * @param powerFeeTax �����õ����Ե��˰��ֵ
     */
    public void setPowerFeeTax(double powerFeeTax){
        this.powerFeeTax = powerFeeTax;
    }

    /**
     * ��ȡ���Ե��˰
     * @return ���Ե��˰��ֵ
     */
    public double getPowerFeeTax(){
        return powerFeeTax;
    }

    /**
     * ����������Ͽ
     * @param sanXiaFee �����õ�������Ͽ��ֵ
     */
    public void setSanXiaFee(double sanXiaFee){
        this.sanXiaFee = sanXiaFee;
    }

    /**
     * ��ȡ������Ͽ
     * @return ������Ͽ��ֵ
     */
    public double getSanXiaFee(){
        return sanXiaFee;
    }

    /**
     * ����������Ͽ˰
     * @param sanXiaTax �����õ�������Ͽ˰��ֵ
     */
    public void setSanXiaTax(double sanXiaTax){
        this.sanXiaTax = sanXiaTax;
    }

    /**
     * ��ȡ������Ͽ˰
     * @return ������Ͽ˰��ֵ
     */
    public double getSanXiaTax(){
        return sanXiaTax;
    }

    /**
     * �������Ե��
     * @param pureDianJin �����õ����Ե���ֵ
     */
    public void setPureDianJin(double pureDianJin){
        this.pureDianJin = pureDianJin;
    }

    /**
     * ��ȡ���Ե��
     * @return ���Ե���ֵ
     */
    public double getPureDianJin(){
        return pureDianJin;
    }

    /**
     * �������Ե��˰
     * @param dianJinTax �����õ����Ե��˰��ֵ
     */
    public void setDianJinTax(double dianJinTax){
        this.dianJinTax = dianJinTax;
    }

    /**
     * ��ȡ���Ե��˰
     * @return ���Ե��˰��ֵ
     */
    public double getDianJinTax(){
        return dianJinTax;
    }

    /**
     * �������Ի���
     * @param pureJiJin �����õ����Ի����ֵ
     */
    public void setPureJiJin(double pureJiJin){
        this.pureJiJin = pureJiJin;
    }

    /**
     * ��ȡ���Ի���
     * @return ���Ի����ֵ
     */
    public double getPureJiJin(){
        return pureJiJin;
    }

    /**
     * �������Ի���˰
     * @param jiJinTax �����õ����Ի���˰��ֵ
     */
    public void setJiJinTax(double jiJinTax){
        this.jiJinTax = jiJinTax;
    }

    /**
     * ��ȡ���Ի���˰
     * @return ���Ի���˰��ֵ
     */
    public double getJiJinTax(){
        return jiJinTax;
    }

    /**
     * �������Բ����
     * @param chaBieFee �����õ����Բ���ѵ�ֵ
     */
    public void setChaBieFee(double chaBieFee){
        this.chaBieFee = chaBieFee;
    }

    /**
     * ��ȡ���Բ����
     * @return ���Բ���ѵ�ֵ
     */
    public double getChaBieFee(){
        return chaBieFee;
    }

    /**
     * �������Բ����˰
     * @param chaBieTax �����õ����Բ����˰��ֵ
     */
    public void setChaBieTax(double chaBieTax){
        this.chaBieTax = chaBieTax;
    }

    /**
     * ��ȡ���Բ����˰
     * @return ���Բ����˰��ֵ
     */
    public double getChaBieTax(){
        return chaBieTax;
    }

    /**
     * ���������ܼ�
     * @param sumFee �����õ������ܼƵ�ֵ
     */
    public void setSumFee(double sumFee){
        this.sumFee = sumFee;
    }

    /**
     * ��ȡ�����ܼ�
     * @return �����ܼƵ�ֵ
     */
    public double getSumFee(){
        return sumFee;
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
