package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwShouShuTable-������ñ�����ݴ���������<br>
 */
public class LwShouShuTableDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** �����·� */
    private String month = "";
    /** ���Է������ */
    private String feeType = "";
    /** ���Ը���3 */
    private double extends3 = 0D;
    /** ���Ը���2 */
    private double extends2 = 0D;
    /** ���Ե��� */
    private double power = 0D;
    /** ���Դ���� */
    private double chunDianFei = 0D;
    /** ���Ե��˰ */
    private double dianFeiTax = 0D;
    /** ���Ժϼ� */
    private double sumDianFee = 0D;
    /** ���Բ���� */
    private double diffrentFei = 0D;
    /** ���Բ����˰ */
    private double diffrentFeiTax = 0D;
    /** ���Ե�� */
    private double dianJin = 0D;
    /** ���Ե��˰ */
    private double dianJinTax = 0D;
    /** ���Ի��� */
    private double jijin = 0D;
    /** ���Ի���˰ */
    private double jinjinTax = 0D;
    /** ������Ͽ */
    private double sanXia = 0D;
    /** ������Ͽ˰ */
    private double sanXiaTax = 0D;
    /** �����ܼ� */
    private double sumFee = 0D;
    /** ���Ը���1 */
    private double extends1 = 0D;

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwShouShuTableDtoBase����
     */
    public LwShouShuTableDtoBase(){
    }

    /**
     * ���������·�
     * @param month �����õ������·ݵ�ֵ
     */
    public void setMonth(String month){
        this.month = StringUtils.rightTrim(month);
    }

    /**
     * ��ȡ�����·�
     * @return �����·ݵ�ֵ
     */
    public String getMonth(){
        return month;
    }

    /**
     * �������Է������
     * @param feeType �����õ����Է�������ֵ
     */
    public void setFeeType(String feeType){
        this.feeType = StringUtils.rightTrim(feeType);
    }

    /**
     * ��ȡ���Է������
     * @return ���Է�������ֵ
     */
    public String getFeeType(){
        return feeType;
    }

    /**
     * �������Ը���3
     * @param extends3 �����õ����Ը���3��ֵ
     */
    public void setExtends3(double extends3){
        this.extends3 = extends3;
    }

    /**
     * ��ȡ���Ը���3
     * @return ���Ը���3��ֵ
     */
    public double getExtends3(){
        return extends3;
    }

    /**
     * �������Ը���2
     * @param extends2 �����õ����Ը���2��ֵ
     */
    public void setExtends2(double extends2){
        this.extends2 = extends2;
    }

    /**
     * ��ȡ���Ը���2
     * @return ���Ը���2��ֵ
     */
    public double getExtends2(){
        return extends2;
    }

    /**
     * �������Ե���
     * @param power �����õ����Ե�����ֵ
     */
    public void setPower(double power){
        this.power = power;
    }

    /**
     * ��ȡ���Ե���
     * @return ���Ե�����ֵ
     */
    public double getPower(){
        return power;
    }

    /**
     * �������Դ����
     * @param chunDianFei �����õ����Դ���ѵ�ֵ
     */
    public void setChunDianFei(double chunDianFei){
        this.chunDianFei = chunDianFei;
    }

    /**
     * ��ȡ���Դ����
     * @return ���Դ���ѵ�ֵ
     */
    public double getChunDianFei(){
        return chunDianFei;
    }

    /**
     * �������Ե��˰
     * @param dianFeiTax �����õ����Ե��˰��ֵ
     */
    public void setDianFeiTax(double dianFeiTax){
        this.dianFeiTax = dianFeiTax;
    }

    /**
     * ��ȡ���Ե��˰
     * @return ���Ե��˰��ֵ
     */
    public double getDianFeiTax(){
        return dianFeiTax;
    }

    /**
     * �������Ժϼ�
     * @param sumDianFee �����õ����ԺϼƵ�ֵ
     */
    public void setSumDianFee(double sumDianFee){
        this.sumDianFee = sumDianFee;
    }

    /**
     * ��ȡ���Ժϼ�
     * @return ���ԺϼƵ�ֵ
     */
    public double getSumDianFee(){
        return sumDianFee;
    }

    /**
     * �������Բ����
     * @param diffrentFei �����õ����Բ���ѵ�ֵ
     */
    public void setDiffrentFei(double diffrentFei){
        this.diffrentFei = diffrentFei;
    }

    /**
     * ��ȡ���Բ����
     * @return ���Բ���ѵ�ֵ
     */
    public double getDiffrentFei(){
        return diffrentFei;
    }

    /**
     * �������Բ����˰
     * @param diffrentFeiTax �����õ����Բ����˰��ֵ
     */
    public void setDiffrentFeiTax(double diffrentFeiTax){
        this.diffrentFeiTax = diffrentFeiTax;
    }

    /**
     * ��ȡ���Բ����˰
     * @return ���Բ����˰��ֵ
     */
    public double getDiffrentFeiTax(){
        return diffrentFeiTax;
    }

    /**
     * �������Ե��
     * @param dianJin �����õ����Ե���ֵ
     */
    public void setDianJin(double dianJin){
        this.dianJin = dianJin;
    }

    /**
     * ��ȡ���Ե��
     * @return ���Ե���ֵ
     */
    public double getDianJin(){
        return dianJin;
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
     * @param jijin �����õ����Ի����ֵ
     */
    public void setJijin(double jijin){
        this.jijin = jijin;
    }

    /**
     * ��ȡ���Ի���
     * @return ���Ի����ֵ
     */
    public double getJijin(){
        return jijin;
    }

    /**
     * �������Ի���˰
     * @param jinjinTax �����õ����Ի���˰��ֵ
     */
    public void setJinjinTax(double jinjinTax){
        this.jinjinTax = jinjinTax;
    }

    /**
     * ��ȡ���Ի���˰
     * @return ���Ի���˰��ֵ
     */
    public double getJinjinTax(){
        return jinjinTax;
    }

    /**
     * ����������Ͽ
     * @param sanXia �����õ�������Ͽ��ֵ
     */
    public void setSanXia(double sanXia){
        this.sanXia = sanXia;
    }

    /**
     * ��ȡ������Ͽ
     * @return ������Ͽ��ֵ
     */
    public double getSanXia(){
        return sanXia;
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
     * �������Ը���1
     * @param extends1 �����õ����Ը���1��ֵ
     */
    public void setExtends1(double extends1){
        this.extends1 = extends1;
    }

    /**
     * ��ȡ���Ը���1
     * @return ���Ը���1��ֵ
     */
    public double getExtends1(){
        return extends1;
    }
}
