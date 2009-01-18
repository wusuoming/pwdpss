package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownIndicatorAppend-ֱ����׷�ӵ��ָ���¼������ݴ���������<br>
 */
public class LwTownIndicatorAppendDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ���Ի��� */
    private String userName = "";
    /** ���Ե�ַ */
    private String address = "";
    /** ���Գ������� */
    private String readDate = "";
    /** ����ͳ������ */
    private String statMonth = "";
    /** ���Ե����й�ָ���� */
    private double thisWorkNum = 0D;
    /** �������г���ָ�� */
    private double midWorkNum = 0D;
    /** ���������й�ָ���� */
    private double lastWorkNum = 0D;
    /** ���Ա��� */
    private double rate = 0D;
    /** ����׷�ӵ��� */
    private double readQuantity = 0D;
    /** ���Ծ����� */
    private double peoplePrice = 0D;
    /** ���ԷǾ����� */
    private double notPeoplePrice = 0D;
    /** ����ũ���� */
    private double farmPrice = 0D;
    /** ����������� */
    private double producePrice = 0D;
    /** ������ҵ��� */
    private double businessPrice = 0D;
    /** ���Ե�ѹ�ȼ� */
    private int voltlevel = 0;
    /** ���Է��չ�ҵ */
    private double industryPrice = 0D;
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־ */
    private String flag = "";
    /** ����ע�� */
    private String remark = "";
    /** ����׷������ */
    private String appendDate = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwTownIndicatorAppendDtoBase����
     */
    public LwTownIndicatorAppendDtoBase(){
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
     * �������Ե�ַ
     * @param address �����õ����Ե�ַ��ֵ
     */
    public void setAddress(String address){
        this.address = StringUtils.rightTrim(address);
    }

    /**
     * ��ȡ���Ե�ַ
     * @return ���Ե�ַ��ֵ
     */
    public String getAddress(){
        return address;
    }

    /**
     * �������Գ�������
     * @param readDate �����õ����Գ������ڵ�ֵ
     */
    public void setReadDate(String readDate){
        this.readDate = StringUtils.rightTrim(readDate);
    }

    /**
     * ��ȡ���Գ�������
     * @return ���Գ������ڵ�ֵ
     */
    public String getReadDate(){
        return readDate;
    }

    /**
     * ��������ͳ������
     * @param statMonth �����õ�����ͳ�����ڵ�ֵ
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * ��ȡ����ͳ������
     * @return ����ͳ�����ڵ�ֵ
     */
    public String getStatMonth(){
        return statMonth;
    }

    /**
     * �������Ե����й�ָ����
     * @param thisWorkNum �����õ����Ե����й�ָ������ֵ
     */
    public void setThisWorkNum(double thisWorkNum){
        this.thisWorkNum = thisWorkNum;
    }

    /**
     * ��ȡ���Ե����й�ָ����
     * @return ���Ե����й�ָ������ֵ
     */
    public double getThisWorkNum(){
        return thisWorkNum;
    }

    /**
     * �����������г���ָ��
     * @param midWorkNum �����õ��������г���ָ���ֵ
     */
    public void setMidWorkNum(double midWorkNum){
        this.midWorkNum = midWorkNum;
    }

    /**
     * ��ȡ�������г���ָ��
     * @return �������г���ָ���ֵ
     */
    public double getMidWorkNum(){
        return midWorkNum;
    }

    /**
     * �������������й�ָ����
     * @param lastWorkNum �����õ����������й�ָ������ֵ
     */
    public void setLastWorkNum(double lastWorkNum){
        this.lastWorkNum = lastWorkNum;
    }

    /**
     * ��ȡ���������й�ָ����
     * @return ���������й�ָ������ֵ
     */
    public double getLastWorkNum(){
        return lastWorkNum;
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
     * ��������׷�ӵ���
     * @param readQuantity �����õ�����׷�ӵ�����ֵ
     */
    public void setReadQuantity(double readQuantity){
        this.readQuantity = readQuantity;
    }

    /**
     * ��ȡ����׷�ӵ���
     * @return ����׷�ӵ�����ֵ
     */
    public double getReadQuantity(){
        return readQuantity;
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
     * ���������������
     * @param producePrice �����õ�����������۵�ֵ
     */
    public void setProducePrice(double producePrice){
        this.producePrice = producePrice;
    }

    /**
     * ��ȡ�����������
     * @return ����������۵�ֵ
     */
    public double getProducePrice(){
        return producePrice;
    }

    /**
     * ����������ҵ���
     * @param businessPrice �����õ�������ҵ��۵�ֵ
     */
    public void setBusinessPrice(double businessPrice){
        this.businessPrice = businessPrice;
    }

    /**
     * ��ȡ������ҵ���
     * @return ������ҵ��۵�ֵ
     */
    public double getBusinessPrice(){
        return businessPrice;
    }

    /**
     * �������Ե�ѹ�ȼ�
     * @param voltlevel �����õ����Ե�ѹ�ȼ���ֵ
     */
    public void setVoltlevel(int voltlevel){
        this.voltlevel = voltlevel;
    }

    /**
     * ��ȡ���Ե�ѹ�ȼ�
     * @return ���Ե�ѹ�ȼ���ֵ
     */
    public int getVoltlevel(){
        return voltlevel;
    }

    /**
     * �������Է��չ�ҵ
     * @param industryPrice �����õ����Է��չ�ҵ��ֵ
     */
    public void setIndustryPrice(double industryPrice){
        this.industryPrice = industryPrice;
    }

    /**
     * ��ȡ���Է��չ�ҵ
     * @return ���Է��չ�ҵ��ֵ
     */
    public double getIndustryPrice(){
        return industryPrice;
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
     * ��������׷������
     * @param appendDate �����õ�����׷�����ڵ�ֵ
     */
    public void setAppendDate(String appendDate){
        this.appendDate = StringUtils.rightTrim(appendDate);
    }

    /**
     * ��ȡ����׷������
     * @return ����׷�����ڵ�ֵ
     */
    public String getAppendDate(){
        return appendDate;
    }
}
