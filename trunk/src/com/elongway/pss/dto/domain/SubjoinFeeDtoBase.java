package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����subjoinFee-���ӷ��ñ�����ݴ���������<br>
 */
public class SubjoinFeeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** �����õ���� */
    private String powerType = "";
    /** �������� */
    private String name = "";
    /** ����ũ������ */
    private double nongwanghuanDai = 0D;
    /** ������Ͽ */
    private double sanXia = 0D;
    /** ���Կ������� */
    private double kuquyimin = 0D;
    /** ���Կ�������Դ */
    private double kezaishengnengyuan = 0D;

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�SubjoinFeeDtoBase����
     */
    public SubjoinFeeDtoBase(){
    }

    /**
     * ���������õ����
     * @param powerType �����õ������õ�����ֵ
     */
    public void setPowerType(String powerType){
        this.powerType = StringUtils.rightTrim(powerType);
    }

    /**
     * ��ȡ�����õ����
     * @return �����õ�����ֵ
     */
    public String getPowerType(){
        return powerType;
    }

    /**
     * ������������
     * @param name �����õ��������Ƶ�ֵ
     */
    public void setName(String name){
        this.name = StringUtils.rightTrim(name);
    }

    /**
     * ��ȡ��������
     * @return �������Ƶ�ֵ
     */
    public String getName(){
        return name;
    }

    /**
     * ��������ũ������
     * @param nongwanghuanDai �����õ�����ũ��������ֵ
     */
    public void setNongwanghuanDai(double nongwanghuanDai){
        this.nongwanghuanDai = nongwanghuanDai;
    }

    /**
     * ��ȡ����ũ������
     * @return ����ũ��������ֵ
     */
    public double getNongwanghuanDai(){
        return nongwanghuanDai;
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
     * �������Կ�������
     * @param kuquyimin �����õ����Կ��������ֵ
     */
    public void setKuquyimin(double kuquyimin){
        this.kuquyimin = kuquyimin;
    }

    /**
     * ��ȡ���Կ�������
     * @return ���Կ��������ֵ
     */
    public double getKuquyimin(){
        return kuquyimin;
    }

    /**
     * �������Կ�������Դ
     * @param kezaishengnengyuan �����õ����Կ�������Դ��ֵ
     */
    public void setKezaishengnengyuan(double kezaishengnengyuan){
        this.kezaishengnengyuan = kezaishengnengyuan;
    }

    /**
     * ��ȡ���Կ�������Դ
     * @return ���Կ�������Դ��ֵ
     */
    public double getKezaishengnengyuan(){
        return kezaishengnengyuan;
    }
}
