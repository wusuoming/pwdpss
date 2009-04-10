package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleStatDetail-���۰����ͳ�Ƶ����ݴ���������<br>
 */
public class LwWholeSaleStatDetailDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Թ�˾���� */
    private String companyCode = "";
    /** ���Թ�˾���� */
    private String companyName = "";
    /** ����ͳ�Ʊ�־ */
    private String statStyle = "";
    /** ����ͳ������ */
    private String inputDate = "";
    /** ���ԷǾ�������(10kv)���� */
    private int unDenizenQuantity10kv = 0;
    /** ���ԷǾ�������(10kv)��� */
    private double unDenizenMoney10kv = 0D;
    /** ���Ծ�������(10kv)���� */
    private int denizenQuantity10kv = 0;
    /** ���Ծ�������(10kv)��� */
    private double denizenMoney10kv = 0D;
    /** ����ũҵ����(10kv)���� */
    private int productQuantity10kv = 0;
    /** ����ũҵ����(10kv)��� */
    private double productMoney10kv = 0D;
    /** ���Է��չ�ҵ(10kv)���� */
    private int unIndustryQuantity10kv = 0;
    /** ���Է��չ�ҵ(10kv)��� */
    private double unIndustryMoney10kv = 0D;
    /** ����ũҵ�Ź�(10kv)���� */
    private int farmUseQuantity10kv = 0;
    /** ����ũҵ�Ź�(10kv)��� */
    private double farmUseMoney10kv = 0D;
    /** ������ҵ(10kv)���� */
    private int bizQuantity10kv = 0;
    /** ������ҵ(10kv)��� */
    private double bizMoney10kv = 0D;
    /** ���ԷǾ�������(35kv)���� */
    private int unDenizenQuantity35kv = 0;
    /** ���ԷǾ�������(35kv)��� */
    private double unDenizenMoney35kv = 0D;
    /** ���Ծ�������(35kv)���� */
    private int denizenQuantity35kv = 0;
    /** ���Ծ�������(35kv)��� */
    private double denizenMoney35kv = 0D;
    /** ����ũҵ����(35kv)���� */
    private int productQuantity35kv = 0;
    /** ����ũҵ����(35kv)��� */
    private double productMoney35kv = 0D;
    /** ���Է��չ�ҵ(35kv)���� */
    private int unIndustryQuantity35kv = 0;
    /** ���Է��չ�ҵ(35kv)��� */
    private double unIndustryMoney35kv = 0D;
    /** ����ũҵ�Ź�(35kv)���� */
    private int farmUseQuantity35kv = 0;
    /** ����ũҵ�Ź�(35kv)��� */
    private double farmUseMoney35kv = 0D;
    /** ������ҵ(35kv)���� */
    private int bizQuantity35kv = 0;
    /** ������ҵ(35kv)��� */
    private double bizMoney35kv = 0D;
    /** ������10KV���� */
    private int sumQuantity10KV = 0;
    /** ������35KV���� */
    private int sumQuantity35KV = 0;
    /** �����ܵ��� */
    private int sumQuantity = 0;
    /** ���Ե�� */
    private double powerFee = 0D;
    /** ���Ե��˰ */
    private double powerFeeTax = 0D;
    /** �������ʵ�� */
    private double lilvFee = 0D;
    /** ���Թ㲥�� */
    private double broadFee = 0D;
    /** ���Ժ���¯ */
    private double haiminglu = 0D;
    /** ���Զ�ߵ�� */
    private double duobianFee = 0D;
    /** �����˲���� */
    private double tuibuFee = 0D;
    /** �����ܵ�� */
    private double sumPowerFee = 0D;

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwWholeSaleStatDetailDtoBase����
     */
    public LwWholeSaleStatDetailDtoBase(){
    }

    /**
     * �������Թ�˾����
     * @param companyCode �����õ����Թ�˾�����ֵ
     */
    public void setCompanyCode(String companyCode){
        this.companyCode = StringUtils.rightTrim(companyCode);
    }

    /**
     * ��ȡ���Թ�˾����
     * @return ���Թ�˾�����ֵ
     */
    public String getCompanyCode(){
        return companyCode;
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
     * ��������ͳ�Ʊ�־
     * @param statStyle �����õ�����ͳ�Ʊ�־��ֵ
     */
    public void setStatStyle(String statStyle){
        this.statStyle = StringUtils.rightTrim(statStyle);
    }

    /**
     * ��ȡ����ͳ�Ʊ�־
     * @return ����ͳ�Ʊ�־��ֵ
     */
    public String getStatStyle(){
        return statStyle;
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
    public void setUnDenizenQuantity10kv(int unDenizenQuantity10kv){
        this.unDenizenQuantity10kv = unDenizenQuantity10kv;
    }

    /**
     * ��ȡ���ԷǾ�������(10kv)����
     * @return ���ԷǾ�������(10kv)������ֵ
     */
    public int getUnDenizenQuantity10kv(){
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
    public void setDenizenQuantity10kv(int denizenQuantity10kv){
        this.denizenQuantity10kv = denizenQuantity10kv;
    }

    /**
     * ��ȡ���Ծ�������(10kv)����
     * @return ���Ծ�������(10kv)������ֵ
     */
    public int getDenizenQuantity10kv(){
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
    public void setProductQuantity10kv(int productQuantity10kv){
        this.productQuantity10kv = productQuantity10kv;
    }

    /**
     * ��ȡ����ũҵ����(10kv)����
     * @return ����ũҵ����(10kv)������ֵ
     */
    public int getProductQuantity10kv(){
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
    public void setUnIndustryQuantity10kv(int unIndustryQuantity10kv){
        this.unIndustryQuantity10kv = unIndustryQuantity10kv;
    }

    /**
     * ��ȡ���Է��չ�ҵ(10kv)����
     * @return ���Է��չ�ҵ(10kv)������ֵ
     */
    public int getUnIndustryQuantity10kv(){
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
    public void setFarmUseQuantity10kv(int farmUseQuantity10kv){
        this.farmUseQuantity10kv = farmUseQuantity10kv;
    }

    /**
     * ��ȡ����ũҵ�Ź�(10kv)����
     * @return ����ũҵ�Ź�(10kv)������ֵ
     */
    public int getFarmUseQuantity10kv(){
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
    public void setBizQuantity10kv(int bizQuantity10kv){
        this.bizQuantity10kv = bizQuantity10kv;
    }

    /**
     * ��ȡ������ҵ(10kv)����
     * @return ������ҵ(10kv)������ֵ
     */
    public int getBizQuantity10kv(){
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
    public void setUnDenizenQuantity35kv(int unDenizenQuantity35kv){
        this.unDenizenQuantity35kv = unDenizenQuantity35kv;
    }

    /**
     * ��ȡ���ԷǾ�������(35kv)����
     * @return ���ԷǾ�������(35kv)������ֵ
     */
    public int getUnDenizenQuantity35kv(){
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
    public void setDenizenQuantity35kv(int denizenQuantity35kv){
        this.denizenQuantity35kv = denizenQuantity35kv;
    }

    /**
     * ��ȡ���Ծ�������(35kv)����
     * @return ���Ծ�������(35kv)������ֵ
     */
    public int getDenizenQuantity35kv(){
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
    public void setProductQuantity35kv(int productQuantity35kv){
        this.productQuantity35kv = productQuantity35kv;
    }

    /**
     * ��ȡ����ũҵ����(35kv)����
     * @return ����ũҵ����(35kv)������ֵ
     */
    public int getProductQuantity35kv(){
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
    public void setUnIndustryQuantity35kv(int unIndustryQuantity35kv){
        this.unIndustryQuantity35kv = unIndustryQuantity35kv;
    }

    /**
     * ��ȡ���Է��չ�ҵ(35kv)����
     * @return ���Է��չ�ҵ(35kv)������ֵ
     */
    public int getUnIndustryQuantity35kv(){
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
    public void setFarmUseQuantity35kv(int farmUseQuantity35kv){
        this.farmUseQuantity35kv = farmUseQuantity35kv;
    }

    /**
     * ��ȡ����ũҵ�Ź�(35kv)����
     * @return ����ũҵ�Ź�(35kv)������ֵ
     */
    public int getFarmUseQuantity35kv(){
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
    public void setBizQuantity35kv(int bizQuantity35kv){
        this.bizQuantity35kv = bizQuantity35kv;
    }

    /**
     * ��ȡ������ҵ(35kv)����
     * @return ������ҵ(35kv)������ֵ
     */
    public int getBizQuantity35kv(){
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

    /**
     * ����������10KV����
     * @param sumQuantity10KV �����õ�������10KV������ֵ
     */
    public void setSumQuantity10KV(int sumQuantity10KV){
        this.sumQuantity10KV = sumQuantity10KV;
    }

    /**
     * ��ȡ������10KV����
     * @return ������10KV������ֵ
     */
    public int getSumQuantity10KV(){
        return sumQuantity10KV;
    }

    /**
     * ����������35KV����
     * @param sumQuantity35KV �����õ�������35KV������ֵ
     */
    public void setSumQuantity35KV(int sumQuantity35KV){
        this.sumQuantity35KV = sumQuantity35KV;
    }

    /**
     * ��ȡ������35KV����
     * @return ������35KV������ֵ
     */
    public int getSumQuantity35KV(){
        return sumQuantity35KV;
    }

    /**
     * ���������ܵ���
     * @param sumQuantity �����õ������ܵ�����ֵ
     */
    public void setSumQuantity(int sumQuantity){
        this.sumQuantity = sumQuantity;
    }

    /**
     * ��ȡ�����ܵ���
     * @return �����ܵ�����ֵ
     */
    public int getSumQuantity(){
        return sumQuantity;
    }

    /**
     * �������Ե��
     * @param powerFee �����õ����Ե�ѵ�ֵ
     */
    public void setPowerFee(double powerFee){
        this.powerFee = powerFee;
    }

    /**
     * ��ȡ���Ե��
     * @return ���Ե�ѵ�ֵ
     */
    public double getPowerFee(){
        return powerFee;
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
     * �����������ʵ��
     * @param lilvFee �����õ��������ʵ�ѵ�ֵ
     */
    public void setLilvFee(double lilvFee){
        this.lilvFee = lilvFee;
    }

    /**
     * ��ȡ�������ʵ��
     * @return �������ʵ�ѵ�ֵ
     */
    public double getLilvFee(){
        return lilvFee;
    }

    /**
     * �������Թ㲥��
     * @param broadFee �����õ����Թ㲥�ѵ�ֵ
     */
    public void setBroadFee(double broadFee){
        this.broadFee = broadFee;
    }

    /**
     * ��ȡ���Թ㲥��
     * @return ���Թ㲥�ѵ�ֵ
     */
    public double getBroadFee(){
        return broadFee;
    }

    /**
     * �������Ժ���¯
     * @param haiminglu �����õ����Ժ���¯��ֵ
     */
    public void setHaiminglu(double haiminglu){
        this.haiminglu = haiminglu;
    }

    /**
     * ��ȡ���Ժ���¯
     * @return ���Ժ���¯��ֵ
     */
    public double getHaiminglu(){
        return haiminglu;
    }

    /**
     * �������Զ�ߵ��
     * @param duobianFee �����õ����Զ�ߵ�ѵ�ֵ
     */
    public void setDuobianFee(double duobianFee){
        this.duobianFee = duobianFee;
    }

    /**
     * ��ȡ���Զ�ߵ��
     * @return ���Զ�ߵ�ѵ�ֵ
     */
    public double getDuobianFee(){
        return duobianFee;
    }

    /**
     * ���������˲����
     * @param tuibuFee �����õ������˲���ѵ�ֵ
     */
    public void setTuibuFee(double tuibuFee){
        this.tuibuFee = tuibuFee;
    }

    /**
     * ��ȡ�����˲����
     * @return �����˲���ѵ�ֵ
     */
    public double getTuibuFee(){
        return tuibuFee;
    }

    /**
     * ���������ܵ��
     * @param sumPowerFee �����õ������ܵ�ѵ�ֵ
     */
    public void setSumPowerFee(double sumPowerFee){
        this.sumPowerFee = sumPowerFee;
    }

    /**
     * ��ȡ�����ܵ��
     * @return �����ܵ�ѵ�ֵ
     */
    public double getSumPowerFee(){
        return sumPowerFee;
    }
}
