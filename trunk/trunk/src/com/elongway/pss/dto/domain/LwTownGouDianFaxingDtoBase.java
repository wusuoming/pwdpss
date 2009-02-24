package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownGouDianFaxing-ֱ���繺����㵥�����ݴ���������<br>
 */
public class LwTownGouDianFaxingDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ����������� */
    private String townCode = "";
    /** ������������ */
    private String townName = "";
    /** ���Է������� */
    private String statMonth = "";
    /** �����۵��� */
    private double powerQuantity = 0D;
    /** ���Դ���� */
    private double pureFee = 0D;
    /** ���Ե��˰ */
    private double powerFeeTax = 0D;
    /** ���Ե�� */
    private double pureDianJin = 0D;
    /** ���Ե��˰ */
    private double dianJinTax = 0D;
    /** ������Ͽ */
    private double pureSanXia = 0D;
    /** ������Ͽ˰ */
    private double sanXiaTax = 0D;
    /** ���Ի��� */
    private double pureJiJin = 0D;
    /** ���Ի���˰ */
    private double jiJinTax = 0D;
    /** �����ܼ� */
    private double sumFee = 0D;
    /** ������Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwTownGouDianFaxingDtoBase����
     */
    public LwTownGouDianFaxingDtoBase(){
    }

    /**
     * ���������������
     * @param townCode �����õ�������������ֵ
     */
    public void setTownCode(String townCode){
        this.townCode = StringUtils.rightTrim(townCode);
    }

    /**
     * ��ȡ�����������
     * @return ������������ֵ
     */
    public String getTownCode(){
        return townCode;
    }

    /**
     * ����������������
     * @param townName �����õ������������Ƶ�ֵ
     */
    public void setTownName(String townName){
        this.townName = StringUtils.rightTrim(townName);
    }

    /**
     * ��ȡ������������
     * @return �����������Ƶ�ֵ
     */
    public String getTownName(){
        return townName;
    }

    /**
     * �������Է�������
     * @param statMonth �����õ����Է������µ�ֵ
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * ��ȡ���Է�������
     * @return ���Է������µ�ֵ
     */
    public String getStatMonth(){
        return statMonth;
    }

    /**
     * ���������۵���
     * @param powerQuantity �����õ������۵�����ֵ
     */
    public void setPowerQuantity(double powerQuantity){
        this.powerQuantity = powerQuantity;
    }

    /**
     * ��ȡ�����۵���
     * @return �����۵�����ֵ
     */
    public double getPowerQuantity(){
        return powerQuantity;
    }

    /**
     * �������Դ����
     * @param pureFee �����õ����Դ���ѵ�ֵ
     */
    public void setPureFee(double pureFee){
        this.pureFee = pureFee;
    }

    /**
     * ��ȡ���Դ����
     * @return ���Դ���ѵ�ֵ
     */
    public double getPureFee(){
        return pureFee;
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
     * ����������Ͽ
     * @param pureSanXia �����õ�������Ͽ��ֵ
     */
    public void setPureSanXia(double pureSanXia){
        this.pureSanXia = pureSanXia;
    }

    /**
     * ��ȡ������Ͽ
     * @return ������Ͽ��ֵ
     */
    public double getPureSanXia(){
        return pureSanXia;
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
     * ����������Ч
     * @param validStatus �����õ�������Ч��ֵ
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * ��ȡ������Ч
     * @return ������Ч��ֵ
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
