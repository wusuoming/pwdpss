package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerLine-��·��Ϣ������ݴ���������<br>
 */
public class LwPowerLineDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������·���� */
    private String lineCode = "";
    /** ������·�������� */
    private String lineCName = "";
    /** ������·Ӣ������ */
    private String lineEName = "";
    /** ���Ի������� */
    private String comCode = "";
    /** ���Թ���Ŀ�� */
    private String targetCode = "";
    /** ���Թ������� */
    private String supplyType = "";
    /** ���Ե��������� */
    private double ct = 0D;
    /** ���Ե�ѹ������ */
    private double pt = 0D;
    /** ���Ե�ѹ�ȼ� */
    private double voltLevel = 0D;
    /** ���Թ������� */
    private double siFeLoss = 0D;
    /** ������ʧ���� */
    private double lossProp = 0D;
    /** ���Լ۸���� */
    private String priceCategory = "";
    /** ������ʧ��־ */
    private String lossFlag = "";
    /** ���Ա��� */
    private double rate = 0D;
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwPowerLineDtoBase����
     */
    public LwPowerLineDtoBase(){
    }

    /**
     * ����������·����
     * @param lineCode �����õ�������·�����ֵ
     */
    public void setLineCode(String lineCode){
        this.lineCode = StringUtils.rightTrim(lineCode);
    }

    /**
     * ��ȡ������·����
     * @return ������·�����ֵ
     */
    public String getLineCode(){
        return lineCode;
    }

    /**
     * ����������·��������
     * @param lineCName �����õ�������·�������Ƶ�ֵ
     */
    public void setLineCName(String lineCName){
        this.lineCName = StringUtils.rightTrim(lineCName);
    }

    /**
     * ��ȡ������·��������
     * @return ������·�������Ƶ�ֵ
     */
    public String getLineCName(){
        return lineCName;
    }

    /**
     * ����������·Ӣ������
     * @param lineEName �����õ�������·Ӣ�����Ƶ�ֵ
     */
    public void setLineEName(String lineEName){
        this.lineEName = StringUtils.rightTrim(lineEName);
    }

    /**
     * ��ȡ������·Ӣ������
     * @return ������·Ӣ�����Ƶ�ֵ
     */
    public String getLineEName(){
        return lineEName;
    }

    /**
     * �������Ի�������
     * @param comCode �����õ����Ի��������ֵ
     */
    public void setComCode(String comCode){
        this.comCode = StringUtils.rightTrim(comCode);
    }

    /**
     * ��ȡ���Ի�������
     * @return ���Ի��������ֵ
     */
    public String getComCode(){
        return comCode;
    }

    /**
     * �������Թ���Ŀ��
     * @param targetCode �����õ����Թ���Ŀ���ֵ
     */
    public void setTargetCode(String targetCode){
        this.targetCode = StringUtils.rightTrim(targetCode);
    }

    /**
     * ��ȡ���Թ���Ŀ��
     * @return ���Թ���Ŀ���ֵ
     */
    public String getTargetCode(){
        return targetCode;
    }

    /**
     * �������Թ�������
     * @param supplyType �����õ����Թ������͵�ֵ
     */
    public void setSupplyType(String supplyType){
        this.supplyType = StringUtils.rightTrim(supplyType);
    }

    /**
     * ��ȡ���Թ�������
     * @return ���Թ������͵�ֵ
     */
    public String getSupplyType(){
        return supplyType;
    }

    /**
     * �������Ե���������
     * @param ct �����õ����Ե�����������ֵ
     */
    public void setCt(double ct){
        this.ct = ct;
    }

    /**
     * ��ȡ���Ե���������
     * @return ���Ե�����������ֵ
     */
    public double getCt(){
        return ct;
    }

    /**
     * �������Ե�ѹ������
     * @param pt �����õ����Ե�ѹ��������ֵ
     */
    public void setPt(double pt){
        this.pt = pt;
    }

    /**
     * ��ȡ���Ե�ѹ������
     * @return ���Ե�ѹ��������ֵ
     */
    public double getPt(){
        return pt;
    }

    /**
     * �������Ե�ѹ�ȼ�
     * @param voltLevel �����õ����Ե�ѹ�ȼ���ֵ
     */
    public void setVoltLevel(double voltLevel){
        this.voltLevel = voltLevel;
    }

    /**
     * ��ȡ���Ե�ѹ�ȼ�
     * @return ���Ե�ѹ�ȼ���ֵ
     */
    public double getVoltLevel(){
        return voltLevel;
    }

    /**
     * �������Թ�������
     * @param siFeLoss �����õ����Թ��������ֵ
     */
    public void setSiFeLoss(double siFeLoss){
        this.siFeLoss = siFeLoss;
    }

    /**
     * ��ȡ���Թ�������
     * @return ���Թ��������ֵ
     */
    public double getSiFeLoss(){
        return siFeLoss;
    }

    /**
     * ����������ʧ����
     * @param lossProp �����õ�������ʧ������ֵ
     */
    public void setLossProp(double lossProp){
        this.lossProp = lossProp;
    }

    /**
     * ��ȡ������ʧ����
     * @return ������ʧ������ֵ
     */
    public double getLossProp(){
        return lossProp;
    }

    /**
     * �������Լ۸����
     * @param priceCategory �����õ����Լ۸�����ֵ
     */
    public void setPriceCategory(String priceCategory){
        this.priceCategory = StringUtils.rightTrim(priceCategory);
    }

    /**
     * ��ȡ���Լ۸����
     * @return ���Լ۸�����ֵ
     */
    public String getPriceCategory(){
        return priceCategory;
    }

    /**
     * ����������ʧ��־
     * @param lossFlag �����õ�������ʧ��־��ֵ
     */
    public void setLossFlag(String lossFlag){
        this.lossFlag = StringUtils.rightTrim(lossFlag);
    }

    /**
     * ��ȡ������ʧ��־
     * @return ������ʧ��־��ֵ
     */
    public String getLossFlag(){
        return lossFlag;
    }

    /**
     * �������Ա���
     * @param rate �����õ����Ա��ʵ�ֵ
     */
    public void setRate(double rate){
        this.rate = rate;
    }

    /**
     * ��ȡ���Ա���
     * @return ���Ա��ʵ�ֵ
     */
    public double getRate(){
        return rate;
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
