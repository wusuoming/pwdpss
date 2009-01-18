package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWCorporationSummary-��ҵ���ۼ����ܱ�����ݴ���������<br>
 */
public class LwCorporationSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ������·���� */
    private String lineCode = "";
    /** ����ͳ������ */
    private String statMonth = "";
    /** �����õ���� */
    private String powerClass = "";
    /** �����ܵ��� */
    private double electricQuantity = 0D;
    /** ������Ͽ */
    private double sanXiaFee = 0D;
    /** ���Ի��� */
    private double surcharge = 0D;
    /** ���Ե�� */
    private double powerFee = 0D;
    /** ���ԷǾ������ */
    private double unDenizenQuantity = 0D;
    /** �����й����� */
    private double pointerQuantity = 0D;
    /** �����й���� */
    private double pointerPrice = 0D;
    /** �����й���� */
    private double pointerFee = 0D;
    /** ���ԷǾ����� */
    private double unDenizenPrice = 0D;
    /** ���ԷǾ����� */
    private double unDenizenFee = 0D;
    /** ���Ե���ֵ */
    private double ajustRate = 0D;
    /** �������ʵ�� */
    private double powerRateFee = 0D;
    /** ���Թ������� */
    private double rateCode = 0D;
    /** ������������ */
    private double needQuantity = 0D;
    /** ����������� */
    private double needPrice = 0D;
    /** ����������� */
    private double needFee = 0D;
    /** ���Ի��� */
    private String userNo = "";
    /** ������������ */
    private double contentQuantity = 0D;
    /** ����������� */
    private double contentPrice = 0D;
    /** ����������� */
    private double contentFee = 0D;
    /** �����޹����� */
    private double unPointerQuantity = 0D;
    /** ���Ի����� */
    private double surchargePrice = 0D;
    /** ������Ͽ���� */
    private double sanXiaPrice = 0D;
    /** ���Ե���� */
    private double powerPrice = 0D;
    /** ���Թȶε��� */
    private double valleyQuantity = 0D;
    /** ���Է�ε��� */
    private double peakQuantity = 0D;
    /** ���Է�ε�� */
    private double peakPrice = 0D;
    /** ���Թȶε�j�� */
    private double valleyPrice = 0D;
    /** ���Է�ε�� */
    private double peakFee = 0D;
    /** ���ԹŶε�� */
    private double valleyFee = 0D;
    /** ���Ա������ */
    private double lossQuantity = 0D;
    /** ���Ա�־λ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";
    /** ���Ե�Ѻϼ� */
    private double sumFee = 0D;
    /** ����¼������ */
    private String inputDate = "";
    /** ���Գ������� */
    private double sumPointerQuantity = 0D;
    /** ���Ե������� */
    private String quantityStyle = "";
    /** ���Ըı�ǰ��� */
    private double beforPrice = 0D;
    /** ���Ըı���� */
    private double lastPrice = 0D;
    /** ���Ըı�ǰ���� */
    private double beforPower = 0D;
    /** ���Ըı����� */
    private double lastPower = 0D;
    /** ���Ըı�ǰ��� */
    private double beforFee = 0D;
    /** ���Ըı���� */
    private double lastFee = 0D;
    /** �����Ƿ����ı� */
    private String ifchange = "";
    /** ��������ָ�� */
    private double needPointer = 0D;
    /** �����й�������� */
    private double lineLoss = 0D;
    /** �����޹�������� */
    private double unLineLoss = 0D;
    /** �����޹�������� */
    private double unLossQuantity = 0D;

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwCorporationSummaryDtoBase����
     */
    public LwCorporationSummaryDtoBase(){
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
     * �������Ի���
     * @param surcharge �����õ����Ի����ֵ
     */
    public void setSurcharge(double surcharge){
        this.surcharge = surcharge;
    }

    /**
     * ��ȡ���Ի���
     * @return ���Ի����ֵ
     */
    public double getSurcharge(){
        return surcharge;
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
     * ���������й�����
     * @param pointerQuantity �����õ������й�������ֵ
     */
    public void setPointerQuantity(double pointerQuantity){
        this.pointerQuantity = pointerQuantity;
    }

    /**
     * ��ȡ�����й�����
     * @return �����й�������ֵ
     */
    public double getPointerQuantity(){
        return pointerQuantity;
    }

    /**
     * ���������й����
     * @param pointerPrice �����õ������й���۵�ֵ
     */
    public void setPointerPrice(double pointerPrice){
        this.pointerPrice = pointerPrice;
    }

    /**
     * ��ȡ�����й����
     * @return �����й���۵�ֵ
     */
    public double getPointerPrice(){
        return pointerPrice;
    }

    /**
     * ���������й����
     * @param pointerFee �����õ������й���ѵ�ֵ
     */
    public void setPointerFee(double pointerFee){
        this.pointerFee = pointerFee;
    }

    /**
     * ��ȡ�����й����
     * @return �����й���ѵ�ֵ
     */
    public double getPointerFee(){
        return pointerFee;
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
     * �������Ե���ֵ
     * @param ajustRate �����õ����Ե���ֵ��ֵ
     */
    public void setAjustRate(double ajustRate){
        this.ajustRate = ajustRate;
    }

    /**
     * ��ȡ���Ե���ֵ
     * @return ���Ե���ֵ��ֵ
     */
    public double getAjustRate(){
        return ajustRate;
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
     * ����������������
     * @param needQuantity �����õ���������������ֵ
     */
    public void setNeedQuantity(double needQuantity){
        this.needQuantity = needQuantity;
    }

    /**
     * ��ȡ������������
     * @return ��������������ֵ
     */
    public double getNeedQuantity(){
        return needQuantity;
    }

    /**
     * ���������������
     * @param needPrice �����õ�����������۵�ֵ
     */
    public void setNeedPrice(double needPrice){
        this.needPrice = needPrice;
    }

    /**
     * ��ȡ�����������
     * @return ����������۵�ֵ
     */
    public double getNeedPrice(){
        return needPrice;
    }

    /**
     * ���������������
     * @param needFee �����õ�����������ѵ�ֵ
     */
    public void setNeedFee(double needFee){
        this.needFee = needFee;
    }

    /**
     * ��ȡ�����������
     * @return ����������ѵ�ֵ
     */
    public double getNeedFee(){
        return needFee;
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
     * ����������������
     * @param contentQuantity �����õ���������������ֵ
     */
    public void setContentQuantity(double contentQuantity){
        this.contentQuantity = contentQuantity;
    }

    /**
     * ��ȡ������������
     * @return ��������������ֵ
     */
    public double getContentQuantity(){
        return contentQuantity;
    }

    /**
     * ���������������
     * @param contentPrice �����õ�����������۵�ֵ
     */
    public void setContentPrice(double contentPrice){
        this.contentPrice = contentPrice;
    }

    /**
     * ��ȡ�����������
     * @return ����������۵�ֵ
     */
    public double getContentPrice(){
        return contentPrice;
    }

    /**
     * ���������������
     * @param contentFee �����õ�����������ѵ�ֵ
     */
    public void setContentFee(double contentFee){
        this.contentFee = contentFee;
    }

    /**
     * ��ȡ�����������
     * @return ����������ѵ�ֵ
     */
    public double getContentFee(){
        return contentFee;
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
     * �������Ի�����
     * @param surchargePrice �����õ����Ի����۵�ֵ
     */
    public void setSurchargePrice(double surchargePrice){
        this.surchargePrice = surchargePrice;
    }

    /**
     * ��ȡ���Ի�����
     * @return ���Ի����۵�ֵ
     */
    public double getSurchargePrice(){
        return surchargePrice;
    }

    /**
     * ����������Ͽ����
     * @param sanXiaPrice �����õ�������Ͽ���۵�ֵ
     */
    public void setSanXiaPrice(double sanXiaPrice){
        this.sanXiaPrice = sanXiaPrice;
    }

    /**
     * ��ȡ������Ͽ����
     * @return ������Ͽ���۵�ֵ
     */
    public double getSanXiaPrice(){
        return sanXiaPrice;
    }

    /**
     * �������Ե����
     * @param powerPrice �����õ����Ե���۵�ֵ
     */
    public void setPowerPrice(double powerPrice){
        this.powerPrice = powerPrice;
    }

    /**
     * ��ȡ���Ե����
     * @return ���Ե���۵�ֵ
     */
    public double getPowerPrice(){
        return powerPrice;
    }

    /**
     * �������Թȶε���
     * @param valleyQuantity �����õ����Թȶε�����ֵ
     */
    public void setValleyQuantity(double valleyQuantity){
        this.valleyQuantity = valleyQuantity;
    }

    /**
     * ��ȡ���Թȶε���
     * @return ���Թȶε�����ֵ
     */
    public double getValleyQuantity(){
        return valleyQuantity;
    }

    /**
     * �������Է�ε���
     * @param peakQuantity �����õ����Է�ε�����ֵ
     */
    public void setPeakQuantity(double peakQuantity){
        this.peakQuantity = peakQuantity;
    }

    /**
     * ��ȡ���Է�ε���
     * @return ���Է�ε�����ֵ
     */
    public double getPeakQuantity(){
        return peakQuantity;
    }

    /**
     * �������Է�ε��
     * @param peakPrice �����õ����Է�ε�۵�ֵ
     */
    public void setPeakPrice(double peakPrice){
        this.peakPrice = peakPrice;
    }

    /**
     * ��ȡ���Է�ε��
     * @return ���Է�ε�۵�ֵ
     */
    public double getPeakPrice(){
        return peakPrice;
    }

    /**
     * �������Թȶε�j��
     * @param valleyPrice �����õ����Թȶε�j�۵�ֵ
     */
    public void setValleyPrice(double valleyPrice){
        this.valleyPrice = valleyPrice;
    }

    /**
     * ��ȡ���Թȶε�j��
     * @return ���Թȶε�j�۵�ֵ
     */
    public double getValleyPrice(){
        return valleyPrice;
    }

    /**
     * �������Է�ε��
     * @param peakFee �����õ����Է�ε�ѵ�ֵ
     */
    public void setPeakFee(double peakFee){
        this.peakFee = peakFee;
    }

    /**
     * ��ȡ���Է�ε��
     * @return ���Է�ε�ѵ�ֵ
     */
    public double getPeakFee(){
        return peakFee;
    }

    /**
     * �������ԹŶε��
     * @param valleyFee �����õ����ԹŶε�ѵ�ֵ
     */
    public void setValleyFee(double valleyFee){
        this.valleyFee = valleyFee;
    }

    /**
     * ��ȡ���ԹŶε��
     * @return ���ԹŶε�ѵ�ֵ
     */
    public double getValleyFee(){
        return valleyFee;
    }

    /**
     * �������Ա������
     * @param lossQuantity �����õ����Ա��������ֵ
     */
    public void setLossQuantity(double lossQuantity){
        this.lossQuantity = lossQuantity;
    }

    /**
     * ��ȡ���Ա������
     * @return ���Ա��������ֵ
     */
    public double getLossQuantity(){
        return lossQuantity;
    }

    /**
     * �������Ա�־λ
     * @param flag �����õ����Ա�־λ��ֵ
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * ��ȡ���Ա�־λ
     * @return ���Ա�־λ��ֵ
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
     * �������Ե�Ѻϼ�
     * @param sumFee �����õ����Ե�ѺϼƵ�ֵ
     */
    public void setSumFee(double sumFee){
        this.sumFee = sumFee;
    }

    /**
     * ��ȡ���Ե�Ѻϼ�
     * @return ���Ե�ѺϼƵ�ֵ
     */
    public double getSumFee(){
        return sumFee;
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
     * �������Գ�������
     * @param sumPointerQuantity �����õ����Գ���������ֵ
     */
    public void setSumPointerQuantity(double sumPointerQuantity){
        this.sumPointerQuantity = sumPointerQuantity;
    }

    /**
     * ��ȡ���Գ�������
     * @return ���Գ���������ֵ
     */
    public double getSumPointerQuantity(){
        return sumPointerQuantity;
    }

    /**
     * �������Ե�������
     * @param quantityStyle �����õ����Ե������͵�ֵ
     */
    public void setQuantityStyle(String quantityStyle){
        this.quantityStyle = StringUtils.rightTrim(quantityStyle);
    }

    /**
     * ��ȡ���Ե�������
     * @return ���Ե������͵�ֵ
     */
    public String getQuantityStyle(){
        return quantityStyle;
    }

    /**
     * �������Ըı�ǰ���
     * @param beforPrice �����õ����Ըı�ǰ��۵�ֵ
     */
    public void setBeforPrice(double beforPrice){
        this.beforPrice = beforPrice;
    }

    /**
     * ��ȡ���Ըı�ǰ���
     * @return ���Ըı�ǰ��۵�ֵ
     */
    public double getBeforPrice(){
        return beforPrice;
    }

    /**
     * �������Ըı����
     * @param lastPrice �����õ����Ըı���۵�ֵ
     */
    public void setLastPrice(double lastPrice){
        this.lastPrice = lastPrice;
    }

    /**
     * ��ȡ���Ըı����
     * @return ���Ըı���۵�ֵ
     */
    public double getLastPrice(){
        return lastPrice;
    }

    /**
     * �������Ըı�ǰ����
     * @param beforPower �����õ����Ըı�ǰ������ֵ
     */
    public void setBeforPower(double beforPower){
        this.beforPower = beforPower;
    }

    /**
     * ��ȡ���Ըı�ǰ����
     * @return ���Ըı�ǰ������ֵ
     */
    public double getBeforPower(){
        return beforPower;
    }

    /**
     * �������Ըı�����
     * @param lastPower �����õ����Ըı�������ֵ
     */
    public void setLastPower(double lastPower){
        this.lastPower = lastPower;
    }

    /**
     * ��ȡ���Ըı�����
     * @return ���Ըı�������ֵ
     */
    public double getLastPower(){
        return lastPower;
    }

    /**
     * �������Ըı�ǰ���
     * @param beforFee �����õ����Ըı�ǰ��ѵ�ֵ
     */
    public void setBeforFee(double beforFee){
        this.beforFee = beforFee;
    }

    /**
     * ��ȡ���Ըı�ǰ���
     * @return ���Ըı�ǰ��ѵ�ֵ
     */
    public double getBeforFee(){
        return beforFee;
    }

    /**
     * �������Ըı����
     * @param lastFee �����õ����Ըı���ѵ�ֵ
     */
    public void setLastFee(double lastFee){
        this.lastFee = lastFee;
    }

    /**
     * ��ȡ���Ըı����
     * @return ���Ըı���ѵ�ֵ
     */
    public double getLastFee(){
        return lastFee;
    }

    /**
     * ���������Ƿ����ı�
     * @param ifchange �����õ������Ƿ����ı��ֵ
     */
    public void setIfchange(String ifchange){
        this.ifchange = StringUtils.rightTrim(ifchange);
    }

    /**
     * ��ȡ�����Ƿ����ı�
     * @return �����Ƿ����ı��ֵ
     */
    public String getIfchange(){
        return ifchange;
    }

    /**
     * ������������ָ��
     * @param needPointer �����õ���������ָ���ֵ
     */
    public void setNeedPointer(double needPointer){
        this.needPointer = needPointer;
    }

    /**
     * ��ȡ��������ָ��
     * @return ��������ָ���ֵ
     */
    public double getNeedPointer(){
        return needPointer;
    }

    /**
     * ���������й��������
     * @param lineLoss �����õ������й����������ֵ
     */
    public void setLineLoss(double lineLoss){
        this.lineLoss = lineLoss;
    }

    /**
     * ��ȡ�����й��������
     * @return �����й����������ֵ
     */
    public double getLineLoss(){
        return lineLoss;
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

    /**
     * ���������޹��������
     * @param unLossQuantity �����õ������޹����������ֵ
     */
    public void setUnLossQuantity(double unLossQuantity){
        this.unLossQuantity = unLossQuantity;
    }

    /**
     * ��ȡ�����޹��������
     * @return �����޹����������ֵ
     */
    public double getUnLossQuantity(){
        return unLossQuantity;
    }
}
