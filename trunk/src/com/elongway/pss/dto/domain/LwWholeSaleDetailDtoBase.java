package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleDetail-���۷�����ϸ������ݴ���������<br>
 */
public class LwWholeSaleDetailDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Թ�˾���� */
    private String companyName = "";
    /** ����ͳ������ */
    private String inputDate = "";
    /** ���ԷǾ�������(10kv)���� */
    private double unDenizenQuantity10kv = 0D;
    /** ���ԷǾ�������(10kv)��� */
    private double unDenizenMoney10kv = 0D;
    /** ���Ծ�������(10kv)���� */
    private double denizenQuantity10kv = 0D;
    /** ���Ծ�������(10kv)��� */
    private double denizenMoney10kv = 0D;
    /** ����ũҵ����(10kv)���� */
    private double productQuantity10kv = 0D;
    /** ����ũҵ����(10kv)��� */
    private double productMoney10kv = 0D;
    /** ���Է��չ�ҵ(10kv)���� */
    private double unIndustryQuantity10kv = 0D;
    /** ���Է��չ�ҵ(10kv)��� */
    private double unIndustryMoney10kv = 0D;
    /** ����ũҵ�Ź�(10kv)���� */
    private double farmUseQuantity10kv = 0D;
    /** ����ũҵ�Ź�(10kv)��� */
    private double farmUseMoney10kv = 0D;
    /** ������ҵ(10kv)���� */
    private double bizQuantity10kv = 0D;
    /** ������ҵ(10kv)��� */
    private double bizMoney10kv = 0D;
    /** ���ԷǾ�������(35kv)���� */
    private double unDenizenQuantity35kv = 0D;
    /** ���ԷǾ�������(35kv)��� */
    private double unDenizenMoney35kv = 0D;
    /** ���Ծ�������(35kv)���� */
    private double denizenQuantity35kv = 0D;
    /** ���Ծ�������(35kv)��� */
    private double denizenMoney35kv = 0D;
    /** ����ũҵ����(35kv)���� */
    private double productQuantity35kv = 0D;
    /** ����ũҵ����(35kv)��� */
    private double productMoney35kv = 0D;
    /** ���Է��չ�ҵ(35kv)���� */
    private double unIndustryQuantity35kv = 0D;
    /** ���Է��չ�ҵ(35kv)��� */
    private double unIndustryMoney35kv = 0D;
    /** ����ũҵ�Ź�(35kv)���� */
    private double farmUseQuantity35kv = 0D;
    /** ����ũҵ�Ź�(35kv)��� */
    private double farmUseMoney35kv = 0D;
    /** ������ҵ(35kv)���� */
    private double bizQuantity35kv = 0D;
    /** ������ҵ(35kv)��� */
    private double bizMoney35kv = 0D;

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwWholeSaleDetailDtoBase����
     */
    public LwWholeSaleDetailDtoBase(){
    }

    /**
     * �������Թ�˾����
     * @param companyName �����õ����Թ�˾���Ƶ�ֵ
     */
    public void setCompanyName(String companyName){
        this.companyName = StringUtils.rightTrim(companyName);
    }

    /**
     * ��ȡ���Թ�˾����
     * @return ���Թ�˾���Ƶ�ֵ
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * ��������ͳ������
     * @param inputDate �����õ�����ͳ�����ڵ�ֵ
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * ��ȡ����ͳ������
     * @return ����ͳ�����ڵ�ֵ
     */
    public String getInputDate(){
        return inputDate;
    }

    /**
     * �������ԷǾ�������(10kv)����
     * @param unDenizenQuantity10kv �����õ����ԷǾ�������(10kv)������ֵ
     */
    public void setUnDenizenQuantity10kv(double unDenizenQuantity10kv){
        this.unDenizenQuantity10kv = unDenizenQuantity10kv;
    }

    /**
     * ��ȡ���ԷǾ�������(10kv)����
     * @return ���ԷǾ�������(10kv)������ֵ
     */
    public double getUnDenizenQuantity10kv(){
        return unDenizenQuantity10kv;
    }

    /**
     * �������ԷǾ�������(10kv)���
     * @param unDenizenMoney10kv �����õ����ԷǾ�������(10kv)����ֵ
     */
    public void setUnDenizenMoney10kv(double unDenizenMoney10kv){
        this.unDenizenMoney10kv = unDenizenMoney10kv;
    }

    /**
     * ��ȡ���ԷǾ�������(10kv)���
     * @return ���ԷǾ�������(10kv)����ֵ
     */
    public double getUnDenizenMoney10kv(){
        return unDenizenMoney10kv;
    }

    /**
     * �������Ծ�������(10kv)����
     * @param denizenQuantity10kv �����õ����Ծ�������(10kv)������ֵ
     */
    public void setDenizenQuantity10kv(double denizenQuantity10kv){
        this.denizenQuantity10kv = denizenQuantity10kv;
    }

    /**
     * ��ȡ���Ծ�������(10kv)����
     * @return ���Ծ�������(10kv)������ֵ
     */
    public double getDenizenQuantity10kv(){
        return denizenQuantity10kv;
    }

    /**
     * �������Ծ�������(10kv)���
     * @param denizenMoney10kv �����õ����Ծ�������(10kv)����ֵ
     */
    public void setDenizenMoney10kv(double denizenMoney10kv){
        this.denizenMoney10kv = denizenMoney10kv;
    }

    /**
     * ��ȡ���Ծ�������(10kv)���
     * @return ���Ծ�������(10kv)����ֵ
     */
    public double getDenizenMoney10kv(){
        return denizenMoney10kv;
    }

    /**
     * ��������ũҵ����(10kv)����
     * @param productQuantity10kv �����õ�����ũҵ����(10kv)������ֵ
     */
    public void setProductQuantity10kv(double productQuantity10kv){
        this.productQuantity10kv = productQuantity10kv;
    }

    /**
     * ��ȡ����ũҵ����(10kv)����
     * @return ����ũҵ����(10kv)������ֵ
     */
    public double getProductQuantity10kv(){
        return productQuantity10kv;
    }

    /**
     * ��������ũҵ����(10kv)���
     * @param productMoney10kv �����õ�����ũҵ����(10kv)����ֵ
     */
    public void setProductMoney10kv(double productMoney10kv){
        this.productMoney10kv = productMoney10kv;
    }

    /**
     * ��ȡ����ũҵ����(10kv)���
     * @return ����ũҵ����(10kv)����ֵ
     */
    public double getProductMoney10kv(){
        return productMoney10kv;
    }

    /**
     * �������Է��չ�ҵ(10kv)����
     * @param unIndustryQuantity10kv �����õ����Է��չ�ҵ(10kv)������ֵ
     */
    public void setUnIndustryQuantity10kv(double unIndustryQuantity10kv){
        this.unIndustryQuantity10kv = unIndustryQuantity10kv;
    }

    /**
     * ��ȡ���Է��չ�ҵ(10kv)����
     * @return ���Է��չ�ҵ(10kv)������ֵ
     */
    public double getUnIndustryQuantity10kv(){
        return unIndustryQuantity10kv;
    }

    /**
     * �������Է��չ�ҵ(10kv)���
     * @param unIndustryMoney10kv �����õ����Է��չ�ҵ(10kv)����ֵ
     */
    public void setUnIndustryMoney10kv(double unIndustryMoney10kv){
        this.unIndustryMoney10kv = unIndustryMoney10kv;
    }

    /**
     * ��ȡ���Է��չ�ҵ(10kv)���
     * @return ���Է��չ�ҵ(10kv)����ֵ
     */
    public double getUnIndustryMoney10kv(){
        return unIndustryMoney10kv;
    }

    /**
     * ��������ũҵ�Ź�(10kv)����
     * @param farmUseQuantity10kv �����õ�����ũҵ�Ź�(10kv)������ֵ
     */
    public void setFarmUseQuantity10kv(double farmUseQuantity10kv){
        this.farmUseQuantity10kv = farmUseQuantity10kv;
    }

    /**
     * ��ȡ����ũҵ�Ź�(10kv)����
     * @return ����ũҵ�Ź�(10kv)������ֵ
     */
    public double getFarmUseQuantity10kv(){
        return farmUseQuantity10kv;
    }

    /**
     * ��������ũҵ�Ź�(10kv)���
     * @param farmUseMoney10kv �����õ�����ũҵ�Ź�(10kv)����ֵ
     */
    public void setFarmUseMoney10kv(double farmUseMoney10kv){
        this.farmUseMoney10kv = farmUseMoney10kv;
    }

    /**
     * ��ȡ����ũҵ�Ź�(10kv)���
     * @return ����ũҵ�Ź�(10kv)����ֵ
     */
    public double getFarmUseMoney10kv(){
        return farmUseMoney10kv;
    }

    /**
     * ����������ҵ(10kv)����
     * @param bizQuantity10kv �����õ�������ҵ(10kv)������ֵ
     */
    public void setBizQuantity10kv(double bizQuantity10kv){
        this.bizQuantity10kv = bizQuantity10kv;
    }

    /**
     * ��ȡ������ҵ(10kv)����
     * @return ������ҵ(10kv)������ֵ
     */
    public double getBizQuantity10kv(){
        return bizQuantity10kv;
    }

    /**
     * ����������ҵ(10kv)���
     * @param bizMoney10kv �����õ�������ҵ(10kv)����ֵ
     */
    public void setBizMoney10kv(double bizMoney10kv){
        this.bizMoney10kv = bizMoney10kv;
    }

    /**
     * ��ȡ������ҵ(10kv)���
     * @return ������ҵ(10kv)����ֵ
     */
    public double getBizMoney10kv(){
        return bizMoney10kv;
    }

    /**
     * �������ԷǾ�������(35kv)����
     * @param unDenizenQuantity35kv �����õ����ԷǾ�������(35kv)������ֵ
     */
    public void setUnDenizenQuantity35kv(double unDenizenQuantity35kv){
        this.unDenizenQuantity35kv = unDenizenQuantity35kv;
    }

    /**
     * ��ȡ���ԷǾ�������(35kv)����
     * @return ���ԷǾ�������(35kv)������ֵ
     */
    public double getUnDenizenQuantity35kv(){
        return unDenizenQuantity35kv;
    }

    /**
     * �������ԷǾ�������(35kv)���
     * @param unDenizenMoney35kv �����õ����ԷǾ�������(35kv)����ֵ
     */
    public void setUnDenizenMoney35kv(double unDenizenMoney35kv){
        this.unDenizenMoney35kv = unDenizenMoney35kv;
    }

    /**
     * ��ȡ���ԷǾ�������(35kv)���
     * @return ���ԷǾ�������(35kv)����ֵ
     */
    public double getUnDenizenMoney35kv(){
        return unDenizenMoney35kv;
    }

    /**
     * �������Ծ�������(35kv)����
     * @param denizenQuantity35kv �����õ����Ծ�������(35kv)������ֵ
     */
    public void setDenizenQuantity35kv(double denizenQuantity35kv){
        this.denizenQuantity35kv = denizenQuantity35kv;
    }

    /**
     * ��ȡ���Ծ�������(35kv)����
     * @return ���Ծ�������(35kv)������ֵ
     */
    public double getDenizenQuantity35kv(){
        return denizenQuantity35kv;
    }

    /**
     * �������Ծ�������(35kv)���
     * @param denizenMoney35kv �����õ����Ծ�������(35kv)����ֵ
     */
    public void setDenizenMoney35kv(double denizenMoney35kv){
        this.denizenMoney35kv = denizenMoney35kv;
    }

    /**
     * ��ȡ���Ծ�������(35kv)���
     * @return ���Ծ�������(35kv)����ֵ
     */
    public double getDenizenMoney35kv(){
        return denizenMoney35kv;
    }

    /**
     * ��������ũҵ����(35kv)����
     * @param productQuantity35kv �����õ�����ũҵ����(35kv)������ֵ
     */
    public void setProductQuantity35kv(double productQuantity35kv){
        this.productQuantity35kv = productQuantity35kv;
    }

    /**
     * ��ȡ����ũҵ����(35kv)����
     * @return ����ũҵ����(35kv)������ֵ
     */
    public double getProductQuantity35kv(){
        return productQuantity35kv;
    }

    /**
     * ��������ũҵ����(35kv)���
     * @param productMoney35kv �����õ�����ũҵ����(35kv)����ֵ
     */
    public void setProductMoney35kv(double productMoney35kv){
        this.productMoney35kv = productMoney35kv;
    }

    /**
     * ��ȡ����ũҵ����(35kv)���
     * @return ����ũҵ����(35kv)����ֵ
     */
    public double getProductMoney35kv(){
        return productMoney35kv;
    }

    /**
     * �������Է��չ�ҵ(35kv)����
     * @param unIndustryQuantity35kv �����õ����Է��չ�ҵ(35kv)������ֵ
     */
    public void setUnIndustryQuantity35kv(double unIndustryQuantity35kv){
        this.unIndustryQuantity35kv = unIndustryQuantity35kv;
    }

    /**
     * ��ȡ���Է��չ�ҵ(35kv)����
     * @return ���Է��չ�ҵ(35kv)������ֵ
     */
    public double getUnIndustryQuantity35kv(){
        return unIndustryQuantity35kv;
    }

    /**
     * �������Է��չ�ҵ(35kv)���
     * @param unIndustryMoney35kv �����õ����Է��չ�ҵ(35kv)����ֵ
     */
    public void setUnIndustryMoney35kv(double unIndustryMoney35kv){
        this.unIndustryMoney35kv = unIndustryMoney35kv;
    }

    /**
     * ��ȡ���Է��չ�ҵ(35kv)���
     * @return ���Է��չ�ҵ(35kv)����ֵ
     */
    public double getUnIndustryMoney35kv(){
        return unIndustryMoney35kv;
    }

    /**
     * ��������ũҵ�Ź�(35kv)����
     * @param farmUseQuantity35kv �����õ�����ũҵ�Ź�(35kv)������ֵ
     */
    public void setFarmUseQuantity35kv(double farmUseQuantity35kv){
        this.farmUseQuantity35kv = farmUseQuantity35kv;
    }

    /**
     * ��ȡ����ũҵ�Ź�(35kv)����
     * @return ����ũҵ�Ź�(35kv)������ֵ
     */
    public double getFarmUseQuantity35kv(){
        return farmUseQuantity35kv;
    }

    /**
     * ��������ũҵ�Ź�(35kv)���
     * @param farmUseMoney35kv �����õ�����ũҵ�Ź�(35kv)����ֵ
     */
    public void setFarmUseMoney35kv(double farmUseMoney35kv){
        this.farmUseMoney35kv = farmUseMoney35kv;
    }

    /**
     * ��ȡ����ũҵ�Ź�(35kv)���
     * @return ����ũҵ�Ź�(35kv)����ֵ
     */
    public double getFarmUseMoney35kv(){
        return farmUseMoney35kv;
    }

    /**
     * ����������ҵ(35kv)����
     * @param bizQuantity35kv �����õ�������ҵ(35kv)������ֵ
     */
    public void setBizQuantity35kv(double bizQuantity35kv){
        this.bizQuantity35kv = bizQuantity35kv;
    }

    /**
     * ��ȡ������ҵ(35kv)����
     * @return ������ҵ(35kv)������ֵ
     */
    public double getBizQuantity35kv(){
        return bizQuantity35kv;
    }

    /**
     * ����������ҵ(35kv)���
     * @param bizMoney35kv �����õ�������ҵ(35kv)����ֵ
     */
    public void setBizMoney35kv(double bizMoney35kv){
        this.bizMoney35kv = bizMoney35kv;
    }

    /**
     * ��ȡ������ҵ(35kv)���
     * @return ������ҵ(35kv)����ֵ
     */
    public double getBizMoney35kv(){
        return bizMoney35kv;
    }
}
