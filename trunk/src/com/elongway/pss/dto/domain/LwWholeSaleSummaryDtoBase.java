package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleSummary-���۵�Ѽ����ܱ�����ݴ���������<br>
 */
public class LwWholeSaleSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������·���� */
    private String lineCode = "";
    /** ����ͳ������ */
    private String statMonth = "";
    /** �����õ���� */
    private String powerClass = "";
    /** �����ܵ��� */
    private double electricQuantity = 0D;
    /** ����ָ����� */
    private double pointerQuantity = 0D;
    /** ������Ͽ */
    private double sanXiaFee = 0D;
    /** ���Ծ������ */
    private double surcharge = 0D;
    /** ���Ժϼ� */
    private double sumFee = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";
    /** ���Ա������ */
    private double transLoss = 0D;
    /** ����������� */
    private double lineLoss = 0D;
    /** �����޹����� */
    private double unPointerQuantity = 0D;
    /** ���Թ������� */
    private double rateCode = 0D;
    /** ���Ե���ֵ */
    private double adjustRate = 0D;
    /** ����ũ����� */
    private double farmUseScale = 0D;
    /** ����ũ���� */
    private double farmUsePrice = 0D;
    /** ����ũ����� */
    private double farmUseQuantity = 0D;
    /** ����ũ���� */
    private double farmUseFee = 0D;
    /** ������������ */
    private double productScale = 0D;
    /** ����������� */
    private double productPrice = 0D;
    /** ������������ */
    private double productQuantity = 0D;
    /** ����������� */
    private double productFee = 0D;
    /** ���Ծ������ */
    private double denizenScale = 0D;
    /** ���Ծ����� */
    private double denizenPrice = 0D;
    /** ���Ծ������ */
    private double denizenQuantity = 0D;
    /** ���Ծ����� */
    private double denizenFee = 0D;
    /** ���ԷǾ������ */
    private double unDenizenScale = 0D;
    /** ���ԷǾ����� */
    private double unDenizenPrice = 0D;
    /** ���ԷǾ������ */
    private double unDenizenQuantity = 0D;
    /** ���ԷǾ����� */
    private double unDenizenFee = 0D;
    /** ���Թ�ҵ���� */
    private double industryScale = 0D;
    /** ���Թ�ҵ��� */
    private double industryPrice = 0D;
    /** ���Թ�ҵ���� */
    private double industryQuantity = 0D;
    /** ���Թ�ҵ��� */
    private double industryFee = 0D;
    /** ������ҵ���� */
    private double bizScale = 0D;
    /** ������ҵ��� */
    private double bizPrice = 0D;
    /** ������ҵ���� */
    private double bizQuantity = 0D;
    /** ������ҵ��� */
    private double bizFee = 0D;
    /** �������ʵ�� */
    private double powerRateFee = 0D;
    /** ���������������� */
    private String upCompany = "";
    /** ���Ե�� */
    private double powerFee = 0D;
    /** ����¼������ */
    private String inputDate = "";
    /** ���Ե�ѹ�ȼ� */
    private String kv = "";
    /** ������������ */
    private String wholesaletype = "";
    /** �����й�ָ�� */
    private double workNum = 0D;
    /** �����޹�ָ�� */
    private double unWorkNum = 0D;
    /** ���ԷǾ���ҵ��ҵ���� */
    private double otherSurcharge = 0D;
    /** ���Բ����� */
    private String differenceQuantity = "";
    /** �����޹�������� */
    private double unTransLoss = 0D;
    /** �����޹�������� */
    private double unLineLoss = 0D;

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwWholeSaleSummaryDtoBase����
     */
    public LwWholeSaleSummaryDtoBase(){
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
     * ���������õ����
     * @param powerClass �����õ������õ�����ֵ
     */
    public void setPowerClass(String powerClass){
        this.powerClass = StringUtils.rightTrim(powerClass);
    }

    /**
     * ��ȡ�����õ����
     * @return �����õ�����ֵ
     */
    public String getPowerClass(){
        return powerClass;
    }

    /**
     * ���������ܵ���
     * @param electricQuantity �����õ������ܵ�����ֵ
     */
    public void setElectricQuantity(double electricQuantity){
        this.electricQuantity = electricQuantity;
    }

    /**
     * ��ȡ�����ܵ���
     * @return �����ܵ�����ֵ
     */
    public double getElectricQuantity(){
        return electricQuantity;
    }

    /**
     * ��������ָ�����
     * @param pointerQuantity �����õ�����ָ�������ֵ
     */
    public void setPointerQuantity(double pointerQuantity){
        this.pointerQuantity = pointerQuantity;
    }

    /**
     * ��ȡ����ָ�����
     * @return ����ָ�������ֵ
     */
    public double getPointerQuantity(){
        return pointerQuantity;
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
     * �������Ծ������
     * @param surcharge �����õ����Ծ�������ֵ
     */
    public void setSurcharge(double surcharge){
        this.surcharge = surcharge;
    }

    /**
     * ��ȡ���Ծ������
     * @return ���Ծ�������ֵ
     */
    public double getSurcharge(){
        return surcharge;
    }

    /**
     * �������Ժϼ�
     * @param sumFee �����õ����ԺϼƵ�ֵ
     */
    public void setSumFee(double sumFee){
        this.sumFee = sumFee;
    }

    /**
     * ��ȡ���Ժϼ�
     * @return ���ԺϼƵ�ֵ
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

    /**
     * �������Ա������
     * @param transLoss �����õ����Ա��������ֵ
     */
    public void setTransLoss(double transLoss){
        this.transLoss = transLoss;
    }

    /**
     * ��ȡ���Ա������
     * @return ���Ա��������ֵ
     */
    public double getTransLoss(){
        return transLoss;
    }

    /**
     * ���������������
     * @param lineLoss �����õ��������������ֵ
     */
    public void setLineLoss(double lineLoss){
        this.lineLoss = lineLoss;
    }

    /**
     * ��ȡ�����������
     * @return �������������ֵ
     */
    public double getLineLoss(){
        return lineLoss;
    }

    /**
     * ���������޹�����
     * @param unPointerQuantity �����õ������޹�������ֵ
     */
    public void setUnPointerQuantity(double unPointerQuantity){
        this.unPointerQuantity = unPointerQuantity;
    }

    /**
     * ��ȡ�����޹�����
     * @return �����޹�������ֵ
     */
    public double getUnPointerQuantity(){
        return unPointerQuantity;
    }

    /**
     * �������Թ�������
     * @param rateCode �����õ����Թ������ص�ֵ
     */
    public void setRateCode(double rateCode){
        this.rateCode = rateCode;
    }

    /**
     * ��ȡ���Թ�������
     * @return ���Թ������ص�ֵ
     */
    public double getRateCode(){
        return rateCode;
    }

    /**
     * �������Ե���ֵ
     * @param adjustRate �����õ����Ե���ֵ��ֵ
     */
    public void setAdjustRate(double adjustRate){
        this.adjustRate = adjustRate;
    }

    /**
     * ��ȡ���Ե���ֵ
     * @return ���Ե���ֵ��ֵ
     */
    public double getAdjustRate(){
        return adjustRate;
    }

    /**
     * ��������ũ�����
     * @param farmUseScale �����õ�����ũ�������ֵ
     */
    public void setFarmUseScale(double farmUseScale){
        this.farmUseScale = farmUseScale;
    }

    /**
     * ��ȡ����ũ�����
     * @return ����ũ�������ֵ
     */
    public double getFarmUseScale(){
        return farmUseScale;
    }

    /**
     * ��������ũ����
     * @param farmUsePrice �����õ�����ũ���۵�ֵ
     */
    public void setFarmUsePrice(double farmUsePrice){
        this.farmUsePrice = farmUsePrice;
    }

    /**
     * ��ȡ����ũ����
     * @return ����ũ���۵�ֵ
     */
    public double getFarmUsePrice(){
        return farmUsePrice;
    }

    /**
     * ��������ũ�����
     * @param farmUseQuantity �����õ�����ũ�������ֵ
     */
    public void setFarmUseQuantity(double farmUseQuantity){
        this.farmUseQuantity = farmUseQuantity;
    }

    /**
     * ��ȡ����ũ�����
     * @return ����ũ�������ֵ
     */
    public double getFarmUseQuantity(){
        return farmUseQuantity;
    }

    /**
     * ��������ũ����
     * @param farmUseFee �����õ�����ũ���ѵ�ֵ
     */
    public void setFarmUseFee(double farmUseFee){
        this.farmUseFee = farmUseFee;
    }

    /**
     * ��ȡ����ũ����
     * @return ����ũ���ѵ�ֵ
     */
    public double getFarmUseFee(){
        return farmUseFee;
    }

    /**
     * ����������������
     * @param productScale �����õ���������������ֵ
     */
    public void setProductScale(double productScale){
        this.productScale = productScale;
    }

    /**
     * ��ȡ������������
     * @return ��������������ֵ
     */
    public double getProductScale(){
        return productScale;
    }

    /**
     * ���������������
     * @param productPrice �����õ�����������۵�ֵ
     */
    public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }

    /**
     * ��ȡ�����������
     * @return ����������۵�ֵ
     */
    public double getProductPrice(){
        return productPrice;
    }

    /**
     * ����������������
     * @param productQuantity �����õ���������������ֵ
     */
    public void setProductQuantity(double productQuantity){
        this.productQuantity = productQuantity;
    }

    /**
     * ��ȡ������������
     * @return ��������������ֵ
     */
    public double getProductQuantity(){
        return productQuantity;
    }

    /**
     * ���������������
     * @param productFee �����õ�����������ѵ�ֵ
     */
    public void setProductFee(double productFee){
        this.productFee = productFee;
    }

    /**
     * ��ȡ�����������
     * @return ����������ѵ�ֵ
     */
    public double getProductFee(){
        return productFee;
    }

    /**
     * �������Ծ������
     * @param denizenScale �����õ����Ծ��������ֵ
     */
    public void setDenizenScale(double denizenScale){
        this.denizenScale = denizenScale;
    }

    /**
     * ��ȡ���Ծ������
     * @return ���Ծ��������ֵ
     */
    public double getDenizenScale(){
        return denizenScale;
    }

    /**
     * �������Ծ�����
     * @param denizenPrice �����õ����Ծ����۵�ֵ
     */
    public void setDenizenPrice(double denizenPrice){
        this.denizenPrice = denizenPrice;
    }

    /**
     * ��ȡ���Ծ�����
     * @return ���Ծ����۵�ֵ
     */
    public double getDenizenPrice(){
        return denizenPrice;
    }

    /**
     * �������Ծ������
     * @param denizenQuantity �����õ����Ծ��������ֵ
     */
    public void setDenizenQuantity(double denizenQuantity){
        this.denizenQuantity = denizenQuantity;
    }

    /**
     * ��ȡ���Ծ������
     * @return ���Ծ��������ֵ
     */
    public double getDenizenQuantity(){
        return denizenQuantity;
    }

    /**
     * �������Ծ�����
     * @param denizenFee �����õ����Ծ����ѵ�ֵ
     */
    public void setDenizenFee(double denizenFee){
        this.denizenFee = denizenFee;
    }

    /**
     * ��ȡ���Ծ�����
     * @return ���Ծ����ѵ�ֵ
     */
    public double getDenizenFee(){
        return denizenFee;
    }

    /**
     * �������ԷǾ������
     * @param unDenizenScale �����õ����ԷǾ��������ֵ
     */
    public void setUnDenizenScale(double unDenizenScale){
        this.unDenizenScale = unDenizenScale;
    }

    /**
     * ��ȡ���ԷǾ������
     * @return ���ԷǾ��������ֵ
     */
    public double getUnDenizenScale(){
        return unDenizenScale;
    }

    /**
     * �������ԷǾ�����
     * @param unDenizenPrice �����õ����ԷǾ����۵�ֵ
     */
    public void setUnDenizenPrice(double unDenizenPrice){
        this.unDenizenPrice = unDenizenPrice;
    }

    /**
     * ��ȡ���ԷǾ�����
     * @return ���ԷǾ����۵�ֵ
     */
    public double getUnDenizenPrice(){
        return unDenizenPrice;
    }

    /**
     * �������ԷǾ������
     * @param unDenizenQuantity �����õ����ԷǾ��������ֵ
     */
    public void setUnDenizenQuantity(double unDenizenQuantity){
        this.unDenizenQuantity = unDenizenQuantity;
    }

    /**
     * ��ȡ���ԷǾ������
     * @return ���ԷǾ��������ֵ
     */
    public double getUnDenizenQuantity(){
        return unDenizenQuantity;
    }

    /**
     * �������ԷǾ�����
     * @param unDenizenFee �����õ����ԷǾ����ѵ�ֵ
     */
    public void setUnDenizenFee(double unDenizenFee){
        this.unDenizenFee = unDenizenFee;
    }

    /**
     * ��ȡ���ԷǾ�����
     * @return ���ԷǾ����ѵ�ֵ
     */
    public double getUnDenizenFee(){
        return unDenizenFee;
    }

    /**
     * �������Թ�ҵ����
     * @param industryScale �����õ����Թ�ҵ������ֵ
     */
    public void setIndustryScale(double industryScale){
        this.industryScale = industryScale;
    }

    /**
     * ��ȡ���Թ�ҵ����
     * @return ���Թ�ҵ������ֵ
     */
    public double getIndustryScale(){
        return industryScale;
    }

    /**
     * �������Թ�ҵ���
     * @param industryPrice �����õ����Թ�ҵ��۵�ֵ
     */
    public void setIndustryPrice(double industryPrice){
        this.industryPrice = industryPrice;
    }

    /**
     * ��ȡ���Թ�ҵ���
     * @return ���Թ�ҵ��۵�ֵ
     */
    public double getIndustryPrice(){
        return industryPrice;
    }

    /**
     * �������Թ�ҵ����
     * @param industryQuantity �����õ����Թ�ҵ������ֵ
     */
    public void setIndustryQuantity(double industryQuantity){
        this.industryQuantity = industryQuantity;
    }

    /**
     * ��ȡ���Թ�ҵ����
     * @return ���Թ�ҵ������ֵ
     */
    public double getIndustryQuantity(){
        return industryQuantity;
    }

    /**
     * �������Թ�ҵ���
     * @param industryFee �����õ����Թ�ҵ��ѵ�ֵ
     */
    public void setIndustryFee(double industryFee){
        this.industryFee = industryFee;
    }

    /**
     * ��ȡ���Թ�ҵ���
     * @return ���Թ�ҵ��ѵ�ֵ
     */
    public double getIndustryFee(){
        return industryFee;
    }

    /**
     * ����������ҵ����
     * @param bizScale �����õ�������ҵ������ֵ
     */
    public void setBizScale(double bizScale){
        this.bizScale = bizScale;
    }

    /**
     * ��ȡ������ҵ����
     * @return ������ҵ������ֵ
     */
    public double getBizScale(){
        return bizScale;
    }

    /**
     * ����������ҵ���
     * @param bizPrice �����õ�������ҵ��۵�ֵ
     */
    public void setBizPrice(double bizPrice){
        this.bizPrice = bizPrice;
    }

    /**
     * ��ȡ������ҵ���
     * @return ������ҵ��۵�ֵ
     */
    public double getBizPrice(){
        return bizPrice;
    }

    /**
     * ����������ҵ����
     * @param bizQuantity �����õ�������ҵ������ֵ
     */
    public void setBizQuantity(double bizQuantity){
        this.bizQuantity = bizQuantity;
    }

    /**
     * ��ȡ������ҵ����
     * @return ������ҵ������ֵ
     */
    public double getBizQuantity(){
        return bizQuantity;
    }

    /**
     * ����������ҵ���
     * @param bizFee �����õ�������ҵ��ѵ�ֵ
     */
    public void setBizFee(double bizFee){
        this.bizFee = bizFee;
    }

    /**
     * ��ȡ������ҵ���
     * @return ������ҵ��ѵ�ֵ
     */
    public double getBizFee(){
        return bizFee;
    }

    /**
     * �����������ʵ��
     * @param powerRateFee �����õ��������ʵ�ѵ�ֵ
     */
    public void setPowerRateFee(double powerRateFee){
        this.powerRateFee = powerRateFee;
    }

    /**
     * ��ȡ�������ʵ��
     * @return �������ʵ�ѵ�ֵ
     */
    public double getPowerRateFee(){
        return powerRateFee;
    }

    /**
     * ��������������������
     * @param upCompany �����õ�������������������ֵ
     */
    public void setUpCompany(String upCompany){
        this.upCompany = StringUtils.rightTrim(upCompany);
    }

    /**
     * ��ȡ����������������
     * @return ������������������ֵ
     */
    public String getUpCompany(){
        return upCompany;
    }

    /**
     * �������Ե��
     * @param powerFee �����õ����Ե���ֵ
     */
    public void setPowerFee(double powerFee){
        this.powerFee = powerFee;
    }

    /**
     * ��ȡ���Ե��
     * @return ���Ե���ֵ
     */
    public double getPowerFee(){
        return powerFee;
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
     * �������Ե�ѹ�ȼ�
     * @param kv �����õ����Ե�ѹ�ȼ���ֵ
     */
    public void setKv(String kv){
        this.kv = StringUtils.rightTrim(kv);
    }

    /**
     * ��ȡ���Ե�ѹ�ȼ�
     * @return ���Ե�ѹ�ȼ���ֵ
     */
    public String getKv(){
        return kv;
    }

    /**
     * ����������������
     * @param wholesaletype �����õ������������͵�ֵ
     */
    public void setWholesaletype(String wholesaletype){
        this.wholesaletype = StringUtils.rightTrim(wholesaletype);
    }

    /**
     * ��ȡ������������
     * @return �����������͵�ֵ
     */
    public String getWholesaletype(){
        return wholesaletype;
    }

    /**
     * ���������й�ָ��
     * @param workNum �����õ������й�ָ���ֵ
     */
    public void setWorkNum(double workNum){
        this.workNum = workNum;
    }

    /**
     * ��ȡ�����й�ָ��
     * @return �����й�ָ���ֵ
     */
    public double getWorkNum(){
        return workNum;
    }

    /**
     * ���������޹�ָ��
     * @param unWorkNum �����õ������޹�ָ���ֵ
     */
    public void setUnWorkNum(double unWorkNum){
        this.unWorkNum = unWorkNum;
    }

    /**
     * ��ȡ�����޹�ָ��
     * @return �����޹�ָ���ֵ
     */
    public double getUnWorkNum(){
        return unWorkNum;
    }

    /**
     * �������ԷǾ���ҵ��ҵ����
     * @param otherSurcharge �����õ����ԷǾ���ҵ��ҵ�����ֵ
     */
    public void setOtherSurcharge(double otherSurcharge){
        this.otherSurcharge = otherSurcharge;
    }

    /**
     * ��ȡ���ԷǾ���ҵ��ҵ����
     * @return ���ԷǾ���ҵ��ҵ�����ֵ
     */
    public double getOtherSurcharge(){
        return otherSurcharge;
    }

    /**
     * �������Բ�����
     * @param differenceQuantity �����õ����Բ�������ֵ
     */
    public void setDifferenceQuantity(String differenceQuantity){
        this.differenceQuantity = StringUtils.rightTrim(differenceQuantity);
    }

    /**
     * ��ȡ���Բ�����
     * @return ���Բ�������ֵ
     */
    public String getDifferenceQuantity(){
        return differenceQuantity;
    }

    /**
     * ���������޹��������
     * @param unTransLoss �����õ������޹����������ֵ
     */
    public void setUnTransLoss(double unTransLoss){
        this.unTransLoss = unTransLoss;
    }

    /**
     * ��ȡ�����޹��������
     * @return �����޹����������ֵ
     */
    public double getUnTransLoss(){
        return unTransLoss;
    }

    /**
     * ���������޹��������
     * @param unLineLoss �����õ������޹����������ֵ
     */
    public void setUnLineLoss(double unLineLoss){
        this.unLineLoss = unLineLoss;
    }

    /**
     * ��ȡ�����޹��������
     * @return �����޹����������ֵ
     */
    public double getUnLineLoss(){
        return unLineLoss;
    }
}
