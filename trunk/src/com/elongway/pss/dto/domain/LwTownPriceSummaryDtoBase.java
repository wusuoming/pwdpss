package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownPriceSummary-ֱ�����Ѽ����ܱ�����ݴ���������<br>
 */
public class LwTownPriceSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ������·���� */
    private String lineCode = "";
    /** ����ͳ������ */
    private String statMonth = "";
    /** �����ܵ�� */
    private double electricFee = 0D;
    /** ���Ծ������ */
    private double peopleQuantity = 0D;
    /** ���Ծ������ */
    private double peopleScale = 0D;
    /** ���Ծ����� */
    private double peoplePrice = 0D;
    /** ���Ծ����� */
    private double peopleFee = 0D;
    /** ���Ծ����Ѻϼ� */
    private double sumPeopleFee = 0D;
    /** ���Ծ����� */
    private double peopleDianJin = 0D;
    /** ���Ծ�����Ͽ */
    private double peopleFeeSanXia = 0D;
    /** ���Ծ������ */
    private double peopleJiJin = 0D;
    /** ���Ծ������ */
    private double peopleKuQu = 0D;
    /** ���ԷǾ������ */
    private double notPeopleQuantity = 0D;
    /** ���ԷǾ������ */
    private double notPeopleScale = 0D;
    /** ���ԷǾ����� */
    private double notPeoplePrice = 0D;
    /** ���ԷǾ����� */
    private double notPeopleFee = 0D;
    /** ���ԷǾ����Ѻϼ� */
    private double sumNotPeopleFee = 0D;
    /** ���ԷǾ����� */
    private double notPeopleDianJin = 0D;
    /** ���ԷǾ�����Ͽ */
    private double notPeopleFeeSanXia = 0D;
    /** ���ԷǾ������ */
    private double notPeopleJiJin = 0D;
    /** ���ԷǾ������ */
    private double notPeopleKuQu = 0D;
    /** ����ũ����� */
    private double farmQuantity = 0D;
    /** ����ũ����� */
    private double farmScale = 0D;
    /** ����ũ���� */
    private double farmPrice = 0D;
    /** ����ũ���� */
    private double farmFee = 0D;
    /** ����ũ���Ѻϼ� */
    private double sumFarmFee = 0D;
    /** ����ũ���� */
    private double farmDianJin = 0D;
    /** ����ũ����Ͽ */
    private double farmSanXia = 0D;
    /** ����ũ����� */
    private double farmJiJin = 0D;
    /** ����ũ����� */
    private double farmKuQu = 0D;
    /** ����ũҵ�������� */
    private double produceQuantity = 0D;
    /** ����ũҵ�������� */
    private double produceScale = 0D;
    /** ����ũҵ������� */
    private double producePrice = 0D;
    /** ����ũҵ������� */
    private double produceFee = 0D;
    /** ����ũҵ������Ѻϼ� */
    private double sumProduceFee = 0D;
    /** ����ũҵ������� */
    private double produceDianJin = 0D;
    /** ����ũҵ������Ͽ */
    private double produceSanXia = 0D;
    /** ����ũҵ�������� */
    private double produceKuQu = 0D;
    /** ����ũҵ�������� */
    private double produceJiJin = 0D;
    /** ������ҵ���� */
    private double bizQuantity = 0D;
    /** ������ҵ���� */
    private double bizScale = 0D;
    /** ������ҵ��� */
    private double bizPrice = 0D;
    /** ������ҵ��� */
    private double bizFee = 0D;
    /** ������ҵ��Ѻϼ� */
    private double sumBizFee = 0D;
    /** ������ҵ��� */
    private double bizDianJin = 0D;
    /** ������ҵ��Ͽ */
    private double bizSanXia = 0D;
    /** ������ҵ���� */
    private double bizKuQu = 0D;
    /** ������ҵ���� */
    private double bizJiJin = 0D;
    /** ���Էǹ�ҵ����ͨ��ҵ���� */
    private double industryQuantity = 0D;
    /** ���Էǹ�ҵ���� */
    private double industryScale = 0D;
    /** ���Էǹ�ҵ��� */
    private double industryPrice = 0D;
    /** ���Էǹ�ҵ��� */
    private double industryFee = 0D;
    /** ���Էǹ�ҵ��Ѻϼ� */
    private double sumIndustryFee = 0D;
    /** ���Էǹ�ҵ��� */
    private double industryDianJin = 0D;
    /** ���Էǹ�ҵ��Ͽ */
    private double industrySanXia = 0D;
    /** ���Էǹ�ҵ���� */
    private double industryKuQu = 0D;
    /** ���Էǹ�ҵ���� */
    private double industryJiJin = 0D;
    /** ���Ա������ */
    private long tranferLossQuantity = 0L;
    /** ���Թ������� */
    private double rateCode = 0D;
    /** ���Ե���ֵ */
    private double adjustValue = 0D;
    /** �������ʵ�� */
    private double rateFee = 0D;
    /** ����ũҵ�����ʽ� */
    private double loan = 0D;
    /** ������Ͽ */
    private double sanXiaFee = 0D;
    /** ���Կ�������Դ���ӷ� */
    private double surcharge = 0D;
    /** ���Կ���������� */
    private double migrationFee = 0D;
    /** ���Ե����ϼ� */
    private double sumQuantity = 0D;
    /** ���Ե�Ѻϼ� */
    private double sumFee = 0D;
    /** ���Ե��ϼ� */
    private double sumDianJin = 0D;
    /** ������Ͽ�ϼ� */
    private double sumSanXia = 0D;
    /** ���Ի���ϼ� */
    private double sumJiJin = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";
    /** ���Կ����ϼ� */
    private double sumKuQu = 0D;
    /** ����¼������ */
    private String inputDate = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwTownPriceSummaryDtoBase����
     */
    public LwTownPriceSummaryDtoBase(){
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
     * ���������ܵ��
     * @param electricFee �����õ������ܵ�ѵ�ֵ
     */
    public void setElectricFee(double electricFee){
        this.electricFee = electricFee;
    }

    /**
     * ��ȡ�����ܵ��
     * @return �����ܵ�ѵ�ֵ
     */
    public double getElectricFee(){
        return electricFee;
    }

    /**
     * �������Ծ������
     * @param peopleQuantity �����õ����Ծ��������ֵ
     */
    public void setPeopleQuantity(double peopleQuantity){
        this.peopleQuantity = peopleQuantity;
    }

    /**
     * ��ȡ���Ծ������
     * @return ���Ծ��������ֵ
     */
    public double getPeopleQuantity(){
        return peopleQuantity;
    }

    /**
     * �������Ծ������
     * @param peopleScale �����õ����Ծ��������ֵ
     */
    public void setPeopleScale(double peopleScale){
        this.peopleScale = peopleScale;
    }

    /**
     * ��ȡ���Ծ������
     * @return ���Ծ��������ֵ
     */
    public double getPeopleScale(){
        return peopleScale;
    }

    /**
     * �������Ծ�����
     * @param peoplePrice �����õ����Ծ����۵�ֵ
     */
    public void setPeoplePrice(double peoplePrice){
        this.peoplePrice = peoplePrice;
    }

    /**
     * ��ȡ���Ծ�����
     * @return ���Ծ����۵�ֵ
     */
    public double getPeoplePrice(){
        return peoplePrice;
    }

    /**
     * �������Ծ�����
     * @param peopleFee �����õ����Ծ����ѵ�ֵ
     */
    public void setPeopleFee(double peopleFee){
        this.peopleFee = peopleFee;
    }

    /**
     * ��ȡ���Ծ�����
     * @return ���Ծ����ѵ�ֵ
     */
    public double getPeopleFee(){
        return peopleFee;
    }

    /**
     * �������Ծ����Ѻϼ�
     * @param sumPeopleFee �����õ����Ծ����ѺϼƵ�ֵ
     */
    public void setSumPeopleFee(double sumPeopleFee){
        this.sumPeopleFee = sumPeopleFee;
    }

    /**
     * ��ȡ���Ծ����Ѻϼ�
     * @return ���Ծ����ѺϼƵ�ֵ
     */
    public double getSumPeopleFee(){
        return sumPeopleFee;
    }

    /**
     * �������Ծ�����
     * @param peopleDianJin �����õ����Ծ������ֵ
     */
    public void setPeopleDianJin(double peopleDianJin){
        this.peopleDianJin = peopleDianJin;
    }

    /**
     * ��ȡ���Ծ�����
     * @return ���Ծ������ֵ
     */
    public double getPeopleDianJin(){
        return peopleDianJin;
    }

    /**
     * �������Ծ�����Ͽ
     * @param peopleFeeSanXia �����õ����Ծ�����Ͽ��ֵ
     */
    public void setPeopleFeeSanXia(double peopleFeeSanXia){
        this.peopleFeeSanXia = peopleFeeSanXia;
    }

    /**
     * ��ȡ���Ծ�����Ͽ
     * @return ���Ծ�����Ͽ��ֵ
     */
    public double getPeopleFeeSanXia(){
        return peopleFeeSanXia;
    }

    /**
     * �������Ծ������
     * @param peopleJiJin �����õ����Ծ�������ֵ
     */
    public void setPeopleJiJin(double peopleJiJin){
        this.peopleJiJin = peopleJiJin;
    }

    /**
     * ��ȡ���Ծ������
     * @return ���Ծ�������ֵ
     */
    public double getPeopleJiJin(){
        return peopleJiJin;
    }

    /**
     * �������Ծ������
     * @param peopleKuQu �����õ����Ծ��������ֵ
     */
    public void setPeopleKuQu(double peopleKuQu){
        this.peopleKuQu = peopleKuQu;
    }

    /**
     * ��ȡ���Ծ������
     * @return ���Ծ��������ֵ
     */
    public double getPeopleKuQu(){
        return peopleKuQu;
    }

    /**
     * �������ԷǾ������
     * @param notPeopleQuantity �����õ����ԷǾ��������ֵ
     */
    public void setNotPeopleQuantity(double notPeopleQuantity){
        this.notPeopleQuantity = notPeopleQuantity;
    }

    /**
     * ��ȡ���ԷǾ������
     * @return ���ԷǾ��������ֵ
     */
    public double getNotPeopleQuantity(){
        return notPeopleQuantity;
    }

    /**
     * �������ԷǾ������
     * @param notPeopleScale �����õ����ԷǾ��������ֵ
     */
    public void setNotPeopleScale(double notPeopleScale){
        this.notPeopleScale = notPeopleScale;
    }

    /**
     * ��ȡ���ԷǾ������
     * @return ���ԷǾ��������ֵ
     */
    public double getNotPeopleScale(){
        return notPeopleScale;
    }

    /**
     * �������ԷǾ�����
     * @param notPeoplePrice �����õ����ԷǾ����۵�ֵ
     */
    public void setNotPeoplePrice(double notPeoplePrice){
        this.notPeoplePrice = notPeoplePrice;
    }

    /**
     * ��ȡ���ԷǾ�����
     * @return ���ԷǾ����۵�ֵ
     */
    public double getNotPeoplePrice(){
        return notPeoplePrice;
    }

    /**
     * �������ԷǾ�����
     * @param notPeopleFee �����õ����ԷǾ����ѵ�ֵ
     */
    public void setNotPeopleFee(double notPeopleFee){
        this.notPeopleFee = notPeopleFee;
    }

    /**
     * ��ȡ���ԷǾ�����
     * @return ���ԷǾ����ѵ�ֵ
     */
    public double getNotPeopleFee(){
        return notPeopleFee;
    }

    /**
     * �������ԷǾ����Ѻϼ�
     * @param sumNotPeopleFee �����õ����ԷǾ����ѺϼƵ�ֵ
     */
    public void setSumNotPeopleFee(double sumNotPeopleFee){
        this.sumNotPeopleFee = sumNotPeopleFee;
    }

    /**
     * ��ȡ���ԷǾ����Ѻϼ�
     * @return ���ԷǾ����ѺϼƵ�ֵ
     */
    public double getSumNotPeopleFee(){
        return sumNotPeopleFee;
    }

    /**
     * �������ԷǾ�����
     * @param notPeopleDianJin �����õ����ԷǾ������ֵ
     */
    public void setNotPeopleDianJin(double notPeopleDianJin){
        this.notPeopleDianJin = notPeopleDianJin;
    }

    /**
     * ��ȡ���ԷǾ�����
     * @return ���ԷǾ������ֵ
     */
    public double getNotPeopleDianJin(){
        return notPeopleDianJin;
    }

    /**
     * �������ԷǾ�����Ͽ
     * @param notPeopleFeeSanXia �����õ����ԷǾ�����Ͽ��ֵ
     */
    public void setNotPeopleFeeSanXia(double notPeopleFeeSanXia){
        this.notPeopleFeeSanXia = notPeopleFeeSanXia;
    }

    /**
     * ��ȡ���ԷǾ�����Ͽ
     * @return ���ԷǾ�����Ͽ��ֵ
     */
    public double getNotPeopleFeeSanXia(){
        return notPeopleFeeSanXia;
    }

    /**
     * �������ԷǾ������
     * @param notPeopleJiJin �����õ����ԷǾ�������ֵ
     */
    public void setNotPeopleJiJin(double notPeopleJiJin){
        this.notPeopleJiJin = notPeopleJiJin;
    }

    /**
     * ��ȡ���ԷǾ������
     * @return ���ԷǾ�������ֵ
     */
    public double getNotPeopleJiJin(){
        return notPeopleJiJin;
    }

    /**
     * �������ԷǾ������
     * @param notPeopleKuQu �����õ����ԷǾ��������ֵ
     */
    public void setNotPeopleKuQu(double notPeopleKuQu){
        this.notPeopleKuQu = notPeopleKuQu;
    }

    /**
     * ��ȡ���ԷǾ������
     * @return ���ԷǾ��������ֵ
     */
    public double getNotPeopleKuQu(){
        return notPeopleKuQu;
    }

    /**
     * ��������ũ�����
     * @param farmQuantity �����õ�����ũ�������ֵ
     */
    public void setFarmQuantity(double farmQuantity){
        this.farmQuantity = farmQuantity;
    }

    /**
     * ��ȡ����ũ�����
     * @return ����ũ�������ֵ
     */
    public double getFarmQuantity(){
        return farmQuantity;
    }

    /**
     * ��������ũ�����
     * @param farmScale �����õ�����ũ�������ֵ
     */
    public void setFarmScale(double farmScale){
        this.farmScale = farmScale;
    }

    /**
     * ��ȡ����ũ�����
     * @return ����ũ�������ֵ
     */
    public double getFarmScale(){
        return farmScale;
    }

    /**
     * ��������ũ����
     * @param farmPrice �����õ�����ũ���۵�ֵ
     */
    public void setFarmPrice(double farmPrice){
        this.farmPrice = farmPrice;
    }

    /**
     * ��ȡ����ũ����
     * @return ����ũ���۵�ֵ
     */
    public double getFarmPrice(){
        return farmPrice;
    }

    /**
     * ��������ũ����
     * @param farmFee �����õ�����ũ���ѵ�ֵ
     */
    public void setFarmFee(double farmFee){
        this.farmFee = farmFee;
    }

    /**
     * ��ȡ����ũ����
     * @return ����ũ���ѵ�ֵ
     */
    public double getFarmFee(){
        return farmFee;
    }

    /**
     * ��������ũ���Ѻϼ�
     * @param sumFarmFee �����õ�����ũ���ѺϼƵ�ֵ
     */
    public void setSumFarmFee(double sumFarmFee){
        this.sumFarmFee = sumFarmFee;
    }

    /**
     * ��ȡ����ũ���Ѻϼ�
     * @return ����ũ���ѺϼƵ�ֵ
     */
    public double getSumFarmFee(){
        return sumFarmFee;
    }

    /**
     * ��������ũ����
     * @param farmDianJin �����õ�����ũ�����ֵ
     */
    public void setFarmDianJin(double farmDianJin){
        this.farmDianJin = farmDianJin;
    }

    /**
     * ��ȡ����ũ����
     * @return ����ũ�����ֵ
     */
    public double getFarmDianJin(){
        return farmDianJin;
    }

    /**
     * ��������ũ����Ͽ
     * @param farmSanXia �����õ�����ũ����Ͽ��ֵ
     */
    public void setFarmSanXia(double farmSanXia){
        this.farmSanXia = farmSanXia;
    }

    /**
     * ��ȡ����ũ����Ͽ
     * @return ����ũ����Ͽ��ֵ
     */
    public double getFarmSanXia(){
        return farmSanXia;
    }

    /**
     * ��������ũ�����
     * @param farmJiJin �����õ�����ũ������ֵ
     */
    public void setFarmJiJin(double farmJiJin){
        this.farmJiJin = farmJiJin;
    }

    /**
     * ��ȡ����ũ�����
     * @return ����ũ������ֵ
     */
    public double getFarmJiJin(){
        return farmJiJin;
    }

    /**
     * ��������ũ�����
     * @param farmKuQu �����õ�����ũ�������ֵ
     */
    public void setFarmKuQu(double farmKuQu){
        this.farmKuQu = farmKuQu;
    }

    /**
     * ��ȡ����ũ�����
     * @return ����ũ�������ֵ
     */
    public double getFarmKuQu(){
        return farmKuQu;
    }

    /**
     * ��������ũҵ��������
     * @param produceQuantity �����õ�����ũҵ����������ֵ
     */
    public void setProduceQuantity(double produceQuantity){
        this.produceQuantity = produceQuantity;
    }

    /**
     * ��ȡ����ũҵ��������
     * @return ����ũҵ����������ֵ
     */
    public double getProduceQuantity(){
        return produceQuantity;
    }

    /**
     * ��������ũҵ��������
     * @param produceScale �����õ�����ũҵ����������ֵ
     */
    public void setProduceScale(double produceScale){
        this.produceScale = produceScale;
    }

    /**
     * ��ȡ����ũҵ��������
     * @return ����ũҵ����������ֵ
     */
    public double getProduceScale(){
        return produceScale;
    }

    /**
     * ��������ũҵ�������
     * @param producePrice �����õ�����ũҵ������۵�ֵ
     */
    public void setProducePrice(double producePrice){
        this.producePrice = producePrice;
    }

    /**
     * ��ȡ����ũҵ�������
     * @return ����ũҵ������۵�ֵ
     */
    public double getProducePrice(){
        return producePrice;
    }

    /**
     * ��������ũҵ�������
     * @param produceFee �����õ�����ũҵ������ѵ�ֵ
     */
    public void setProduceFee(double produceFee){
        this.produceFee = produceFee;
    }

    /**
     * ��ȡ����ũҵ�������
     * @return ����ũҵ������ѵ�ֵ
     */
    public double getProduceFee(){
        return produceFee;
    }

    /**
     * ��������ũҵ������Ѻϼ�
     * @param sumProduceFee �����õ�����ũҵ������ѺϼƵ�ֵ
     */
    public void setSumProduceFee(double sumProduceFee){
        this.sumProduceFee = sumProduceFee;
    }

    /**
     * ��ȡ����ũҵ������Ѻϼ�
     * @return ����ũҵ������ѺϼƵ�ֵ
     */
    public double getSumProduceFee(){
        return sumProduceFee;
    }

    /**
     * ��������ũҵ�������
     * @param produceDianJin �����õ�����ũҵ��������ֵ
     */
    public void setProduceDianJin(double produceDianJin){
        this.produceDianJin = produceDianJin;
    }

    /**
     * ��ȡ����ũҵ�������
     * @return ����ũҵ��������ֵ
     */
    public double getProduceDianJin(){
        return produceDianJin;
    }

    /**
     * ��������ũҵ������Ͽ
     * @param produceSanXia �����õ�����ũҵ������Ͽ��ֵ
     */
    public void setProduceSanXia(double produceSanXia){
        this.produceSanXia = produceSanXia;
    }

    /**
     * ��ȡ����ũҵ������Ͽ
     * @return ����ũҵ������Ͽ��ֵ
     */
    public double getProduceSanXia(){
        return produceSanXia;
    }

    /**
     * ��������ũҵ��������
     * @param produceKuQu �����õ�����ũҵ����������ֵ
     */
    public void setProduceKuQu(double produceKuQu){
        this.produceKuQu = produceKuQu;
    }

    /**
     * ��ȡ����ũҵ��������
     * @return ����ũҵ����������ֵ
     */
    public double getProduceKuQu(){
        return produceKuQu;
    }

    /**
     * ��������ũҵ��������
     * @param produceJiJin �����õ�����ũҵ���������ֵ
     */
    public void setProduceJiJin(double produceJiJin){
        this.produceJiJin = produceJiJin;
    }

    /**
     * ��ȡ����ũҵ��������
     * @return ����ũҵ���������ֵ
     */
    public double getProduceJiJin(){
        return produceJiJin;
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
     * ����������ҵ��Ѻϼ�
     * @param sumBizFee �����õ�������ҵ��ѺϼƵ�ֵ
     */
    public void setSumBizFee(double sumBizFee){
        this.sumBizFee = sumBizFee;
    }

    /**
     * ��ȡ������ҵ��Ѻϼ�
     * @return ������ҵ��ѺϼƵ�ֵ
     */
    public double getSumBizFee(){
        return sumBizFee;
    }

    /**
     * ����������ҵ���
     * @param bizDianJin �����õ�������ҵ����ֵ
     */
    public void setBizDianJin(double bizDianJin){
        this.bizDianJin = bizDianJin;
    }

    /**
     * ��ȡ������ҵ���
     * @return ������ҵ����ֵ
     */
    public double getBizDianJin(){
        return bizDianJin;
    }

    /**
     * ����������ҵ��Ͽ
     * @param bizSanXia �����õ�������ҵ��Ͽ��ֵ
     */
    public void setBizSanXia(double bizSanXia){
        this.bizSanXia = bizSanXia;
    }

    /**
     * ��ȡ������ҵ��Ͽ
     * @return ������ҵ��Ͽ��ֵ
     */
    public double getBizSanXia(){
        return bizSanXia;
    }

    /**
     * ����������ҵ����
     * @param bizKuQu �����õ�������ҵ������ֵ
     */
    public void setBizKuQu(double bizKuQu){
        this.bizKuQu = bizKuQu;
    }

    /**
     * ��ȡ������ҵ����
     * @return ������ҵ������ֵ
     */
    public double getBizKuQu(){
        return bizKuQu;
    }

    /**
     * ����������ҵ����
     * @param bizJiJin �����õ�������ҵ�����ֵ
     */
    public void setBizJiJin(double bizJiJin){
        this.bizJiJin = bizJiJin;
    }

    /**
     * ��ȡ������ҵ����
     * @return ������ҵ�����ֵ
     */
    public double getBizJiJin(){
        return bizJiJin;
    }

    /**
     * �������Էǹ�ҵ����ͨ��ҵ����
     * @param industryQuantity �����õ����Էǹ�ҵ����ͨ��ҵ������ֵ
     */
    public void setIndustryQuantity(double industryQuantity){
        this.industryQuantity = industryQuantity;
    }

    /**
     * ��ȡ���Էǹ�ҵ����ͨ��ҵ����
     * @return ���Էǹ�ҵ����ͨ��ҵ������ֵ
     */
    public double getIndustryQuantity(){
        return industryQuantity;
    }

    /**
     * �������Էǹ�ҵ����
     * @param industryScale �����õ����Էǹ�ҵ������ֵ
     */
    public void setIndustryScale(double industryScale){
        this.industryScale = industryScale;
    }

    /**
     * ��ȡ���Էǹ�ҵ����
     * @return ���Էǹ�ҵ������ֵ
     */
    public double getIndustryScale(){
        return industryScale;
    }

    /**
     * �������Էǹ�ҵ���
     * @param industryPrice �����õ����Էǹ�ҵ��۵�ֵ
     */
    public void setIndustryPrice(double industryPrice){
        this.industryPrice = industryPrice;
    }

    /**
     * ��ȡ���Էǹ�ҵ���
     * @return ���Էǹ�ҵ��۵�ֵ
     */
    public double getIndustryPrice(){
        return industryPrice;
    }

    /**
     * �������Էǹ�ҵ���
     * @param industryFee �����õ����Էǹ�ҵ��ѵ�ֵ
     */
    public void setIndustryFee(double industryFee){
        this.industryFee = industryFee;
    }

    /**
     * ��ȡ���Էǹ�ҵ���
     * @return ���Էǹ�ҵ��ѵ�ֵ
     */
    public double getIndustryFee(){
        return industryFee;
    }

    /**
     * �������Էǹ�ҵ��Ѻϼ�
     * @param sumIndustryFee �����õ����Էǹ�ҵ��ѺϼƵ�ֵ
     */
    public void setSumIndustryFee(double sumIndustryFee){
        this.sumIndustryFee = sumIndustryFee;
    }

    /**
     * ��ȡ���Էǹ�ҵ��Ѻϼ�
     * @return ���Էǹ�ҵ��ѺϼƵ�ֵ
     */
    public double getSumIndustryFee(){
        return sumIndustryFee;
    }

    /**
     * �������Էǹ�ҵ���
     * @param industryDianJin �����õ����Էǹ�ҵ����ֵ
     */
    public void setIndustryDianJin(double industryDianJin){
        this.industryDianJin = industryDianJin;
    }

    /**
     * ��ȡ���Էǹ�ҵ���
     * @return ���Էǹ�ҵ����ֵ
     */
    public double getIndustryDianJin(){
        return industryDianJin;
    }

    /**
     * �������Էǹ�ҵ��Ͽ
     * @param industrySanXia �����õ����Էǹ�ҵ��Ͽ��ֵ
     */
    public void setIndustrySanXia(double industrySanXia){
        this.industrySanXia = industrySanXia;
    }

    /**
     * ��ȡ���Էǹ�ҵ��Ͽ
     * @return ���Էǹ�ҵ��Ͽ��ֵ
     */
    public double getIndustrySanXia(){
        return industrySanXia;
    }

    /**
     * �������Էǹ�ҵ����
     * @param industryKuQu �����õ����Էǹ�ҵ������ֵ
     */
    public void setIndustryKuQu(double industryKuQu){
        this.industryKuQu = industryKuQu;
    }

    /**
     * ��ȡ���Էǹ�ҵ����
     * @return ���Էǹ�ҵ������ֵ
     */
    public double getIndustryKuQu(){
        return industryKuQu;
    }

    /**
     * �������Էǹ�ҵ����
     * @param industryJiJin �����õ����Էǹ�ҵ�����ֵ
     */
    public void setIndustryJiJin(double industryJiJin){
        this.industryJiJin = industryJiJin;
    }

    /**
     * ��ȡ���Էǹ�ҵ����
     * @return ���Էǹ�ҵ�����ֵ
     */
    public double getIndustryJiJin(){
        return industryJiJin;
    }

    /**
     * �������Ա������
     * @param tranferLossQuantity �����õ����Ա��������ֵ
     */
    public void setTranferLossQuantity(long tranferLossQuantity){
        this.tranferLossQuantity = tranferLossQuantity;
    }

    /**
     * ��ȡ���Ա������
     * @return ���Ա��������ֵ
     */
    public long getTranferLossQuantity(){
        return tranferLossQuantity;
    }

    /**
     * �������Թ�������
     * @param rateCode �����õ����Թ���������ֵ
     */
    public void setRateCode(double rateCode){
        this.rateCode = rateCode;
    }

    /**
     * ��ȡ���Թ�������
     * @return ���Թ���������ֵ
     */
    public double getRateCode(){
        return rateCode;
    }

    /**
     * �������Ե���ֵ
     * @param adjustValue �����õ����Ե���ֵ��ֵ
     */
    public void setAdjustValue(double adjustValue){
        this.adjustValue = adjustValue;
    }

    /**
     * ��ȡ���Ե���ֵ
     * @return ���Ե���ֵ��ֵ
     */
    public double getAdjustValue(){
        return adjustValue;
    }

    /**
     * �����������ʵ��
     * @param rateFee �����õ��������ʵ�ѵ�ֵ
     */
    public void setRateFee(double rateFee){
        this.rateFee = rateFee;
    }

    /**
     * ��ȡ�������ʵ��
     * @return �������ʵ�ѵ�ֵ
     */
    public double getRateFee(){
        return rateFee;
    }

    /**
     * ��������ũҵ�����ʽ�
     * @param loan �����õ�����ũҵ�����ʽ��ֵ
     */
    public void setLoan(double loan){
        this.loan = loan;
    }

    /**
     * ��ȡ����ũҵ�����ʽ�
     * @return ����ũҵ�����ʽ��ֵ
     */
    public double getLoan(){
        return loan;
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
     * �������Կ�������Դ���ӷ�
     * @param surcharge �����õ����Կ�������Դ���ӷѵ�ֵ
     */
    public void setSurcharge(double surcharge){
        this.surcharge = surcharge;
    }

    /**
     * ��ȡ���Կ�������Դ���ӷ�
     * @return ���Կ�������Դ���ӷѵ�ֵ
     */
    public double getSurcharge(){
        return surcharge;
    }

    /**
     * �������Կ����������
     * @param migrationFee �����õ����Կ�����������ֵ
     */
    public void setMigrationFee(double migrationFee){
        this.migrationFee = migrationFee;
    }

    /**
     * ��ȡ���Կ����������
     * @return ���Կ�����������ֵ
     */
    public double getMigrationFee(){
        return migrationFee;
    }

    /**
     * �������Ե����ϼ�
     * @param sumQuantity �����õ����Ե����ϼƵ�ֵ
     */
    public void setSumQuantity(double sumQuantity){
        this.sumQuantity = sumQuantity;
    }

    /**
     * ��ȡ���Ե����ϼ�
     * @return ���Ե����ϼƵ�ֵ
     */
    public double getSumQuantity(){
        return sumQuantity;
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
     * �������Ե��ϼ�
     * @param sumDianJin �����õ����Ե��ϼƵ�ֵ
     */
    public void setSumDianJin(double sumDianJin){
        this.sumDianJin = sumDianJin;
    }

    /**
     * ��ȡ���Ե��ϼ�
     * @return ���Ե��ϼƵ�ֵ
     */
    public double getSumDianJin(){
        return sumDianJin;
    }

    /**
     * ����������Ͽ�ϼ�
     * @param sumSanXia �����õ�������Ͽ�ϼƵ�ֵ
     */
    public void setSumSanXia(double sumSanXia){
        this.sumSanXia = sumSanXia;
    }

    /**
     * ��ȡ������Ͽ�ϼ�
     * @return ������Ͽ�ϼƵ�ֵ
     */
    public double getSumSanXia(){
        return sumSanXia;
    }

    /**
     * �������Ի���ϼ�
     * @param sumJiJin �����õ����Ի���ϼƵ�ֵ
     */
    public void setSumJiJin(double sumJiJin){
        this.sumJiJin = sumJiJin;
    }

    /**
     * ��ȡ���Ի���ϼ�
     * @return ���Ի���ϼƵ�ֵ
     */
    public double getSumJiJin(){
        return sumJiJin;
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
     * �������Կ����ϼ�
     * @param sumKuQu �����õ����Կ����ϼƵ�ֵ
     */
    public void setSumKuQu(double sumKuQu){
        this.sumKuQu = sumKuQu;
    }

    /**
     * ��ȡ���Կ����ϼ�
     * @return ���Կ����ϼƵ�ֵ
     */
    public double getSumKuQu(){
        return sumKuQu;
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
}
