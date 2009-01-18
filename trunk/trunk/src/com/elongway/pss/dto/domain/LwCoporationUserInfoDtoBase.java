package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWCoporationUserInfo-��ҵ�û���Ϣ������ݴ���������<br>
 */
public class LwCoporationUserInfoDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** ���Ի��� */
    private String userNo = "";
    /** ���Ի��� */
    private String userName = "";
    /** ���Ե�ַ */
    private String address = "";
    /** ���Կ����� */
    private String accountBank = "";
    /** ����˰�� */
    private String taxNo = "";
    /** ���������ʺ� */
    private String accountNo = "";
    /** ��������/���� */
    private String industryType = "";
    /** ���Թ����ѹ */
    private String voltage = "";
    /** ���Թ�����· */
    private String lineNo = "";
    /** �����Ƿ���Ч */
    private String validStatus = "";
    /** ���Ա�־λ */
    private String flag = "";
    /** ������������ */
    private int rongliangPower = 0;
    /** ������������ */
    private int needRate = 0;
    /** ���Ե����� */
    private String dianJinPower = "";
    /** ���Ծ��������ǳ��� */
    private String pepoleFlag = "";
    /** ��������������� */
    private String shengChanPrice = "";
    /** ����ͣ��������� */
    private String tingChanPrice = "";
    /** ��������������� */
    private double shengChanrongLiangPrice = 0D;
    /** ������������� */
    private double shengChandianJinPrice = 0D;
    /** ����ͣ������� */
    private double tingChandianJinPrice = 0D;
    /** ����ͣ��������� */
    private double tingChanrongLiangPrice = 0D;
    /** ����������۵�ѹ�ȼ� */
    private String shengChanKV = "";
    /** ����ͣ����۵�ѹ�ȼ� */
    private String tingChanKV = "";
    /** ���Ծ����������� */
    private String pepolePower = "";
    /** ����������� */
    private double lineLossScale = 0D;

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwCoporationUserInfoDtoBase����
     */
    public LwCoporationUserInfoDtoBase(){
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
     * �������Կ�����
     * @param accountBank �����õ����Կ����е�ֵ
     */
    public void setAccountBank(String accountBank){
        this.accountBank = StringUtils.rightTrim(accountBank);
    }

    /**
     * ��ȡ���Կ�����
     * @return ���Կ����е�ֵ
     */
    public String getAccountBank(){
        return accountBank;
    }

    /**
     * ��������˰��
     * @param taxNo �����õ�����˰�ŵ�ֵ
     */
    public void setTaxNo(String taxNo){
        this.taxNo = StringUtils.rightTrim(taxNo);
    }

    /**
     * ��ȡ����˰��
     * @return ����˰�ŵ�ֵ
     */
    public String getTaxNo(){
        return taxNo;
    }

    /**
     * �������������ʺ�
     * @param accountNo �����õ����������ʺŵ�ֵ
     */
    public void setAccountNo(String accountNo){
        this.accountNo = StringUtils.rightTrim(accountNo);
    }

    /**
     * ��ȡ���������ʺ�
     * @return ���������ʺŵ�ֵ
     */
    public String getAccountNo(){
        return accountNo;
    }

    /**
     * ������������/����
     * @param industryType �����õ���������/������ֵ
     */
    public void setIndustryType(String industryType){
        this.industryType = StringUtils.rightTrim(industryType);
    }

    /**
     * ��ȡ��������/����
     * @return ��������/������ֵ
     */
    public String getIndustryType(){
        return industryType;
    }

    /**
     * �������Թ����ѹ
     * @param voltage �����õ����Թ����ѹ��ֵ
     */
    public void setVoltage(String voltage){
        this.voltage = StringUtils.rightTrim(voltage);
    }

    /**
     * ��ȡ���Թ����ѹ
     * @return ���Թ����ѹ��ֵ
     */
    public String getVoltage(){
        return voltage;
    }

    /**
     * �������Թ�����·
     * @param lineNo �����õ����Թ�����·��ֵ
     */
    public void setLineNo(String lineNo){
        this.lineNo = StringUtils.rightTrim(lineNo);
    }

    /**
     * ��ȡ���Թ�����·
     * @return ���Թ�����·��ֵ
     */
    public String getLineNo(){
        return lineNo;
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
     * ����������������
     * @param rongliangPower �����õ���������������ֵ
     */
    public void setRongliangPower(int rongliangPower){
        this.rongliangPower = rongliangPower;
    }

    /**
     * ��ȡ������������
     * @return ��������������ֵ
     */
    public int getRongliangPower(){
        return rongliangPower;
    }

    /**
     * ����������������
     * @param needRate �����õ������������ʵ�ֵ
     */
    public void setNeedRate(int needRate){
        this.needRate = needRate;
    }

    /**
     * ��ȡ������������
     * @return �����������ʵ�ֵ
     */
    public int getNeedRate(){
        return needRate;
    }

    /**
     * �������Ե�����
     * @param dianJinPower �����õ����Ե�������ֵ
     */
    public void setDianJinPower(String dianJinPower){
        this.dianJinPower = StringUtils.rightTrim(dianJinPower);
    }

    /**
     * ��ȡ���Ե�����
     * @return ���Ե�������ֵ
     */
    public String getDianJinPower(){
        return dianJinPower;
    }

    /**
     * �������Ծ��������ǳ���
     * @param pepoleFlag �����õ����Ծ��������ǳ����ֵ
     */
    public void setPepoleFlag(String pepoleFlag){
        this.pepoleFlag = StringUtils.rightTrim(pepoleFlag);
    }

    /**
     * ��ȡ���Ծ��������ǳ���
     * @return ���Ծ��������ǳ����ֵ
     */
    public String getPepoleFlag(){
        return pepoleFlag;
    }

    /**
     * �������������������
     * @param shengChanPrice �����õ���������������͵�ֵ
     */
    public void setShengChanPrice(String shengChanPrice){
        this.shengChanPrice = StringUtils.rightTrim(shengChanPrice);
    }

    /**
     * ��ȡ���������������
     * @return ��������������͵�ֵ
     */
    public String getShengChanPrice(){
        return shengChanPrice;
    }

    /**
     * ��������ͣ���������
     * @param tingChanPrice �����õ�����ͣ��������͵�ֵ
     */
    public void setTingChanPrice(String tingChanPrice){
        this.tingChanPrice = StringUtils.rightTrim(tingChanPrice);
    }

    /**
     * ��ȡ����ͣ���������
     * @return ����ͣ��������͵�ֵ
     */
    public String getTingChanPrice(){
        return tingChanPrice;
    }

    /**
     * �������������������
     * @param shengChanrongLiangPrice �����õ���������������۵�ֵ
     */
    public void setShengChanrongLiangPrice(double shengChanrongLiangPrice){
        this.shengChanrongLiangPrice = shengChanrongLiangPrice;
    }

    /**
     * ��ȡ���������������
     * @return ��������������۵�ֵ
     */
    public double getShengChanrongLiangPrice(){
        return shengChanrongLiangPrice;
    }

    /**
     * �����������������
     * @param shengChandianJinPrice �����õ�������������۵�ֵ
     */
    public void setShengChandianJinPrice(double shengChandianJinPrice){
        this.shengChandianJinPrice = shengChandianJinPrice;
    }

    /**
     * ��ȡ�������������
     * @return ������������۵�ֵ
     */
    public double getShengChandianJinPrice(){
        return shengChandianJinPrice;
    }

    /**
     * ��������ͣ�������
     * @param tingChandianJinPrice �����õ�����ͣ������۵�ֵ
     */
    public void setTingChandianJinPrice(double tingChandianJinPrice){
        this.tingChandianJinPrice = tingChandianJinPrice;
    }

    /**
     * ��ȡ����ͣ�������
     * @return ����ͣ������۵�ֵ
     */
    public double getTingChandianJinPrice(){
        return tingChandianJinPrice;
    }

    /**
     * ��������ͣ���������
     * @param tingChanrongLiangPrice �����õ�����ͣ��������۵�ֵ
     */
    public void setTingChanrongLiangPrice(double tingChanrongLiangPrice){
        this.tingChanrongLiangPrice = tingChanrongLiangPrice;
    }

    /**
     * ��ȡ����ͣ���������
     * @return ����ͣ��������۵�ֵ
     */
    public double getTingChanrongLiangPrice(){
        return tingChanrongLiangPrice;
    }

    /**
     * ��������������۵�ѹ�ȼ�
     * @param shengChanKV �����õ�����������۵�ѹ�ȼ���ֵ
     */
    public void setShengChanKV(String shengChanKV){
        this.shengChanKV = StringUtils.rightTrim(shengChanKV);
    }

    /**
     * ��ȡ����������۵�ѹ�ȼ�
     * @return ����������۵�ѹ�ȼ���ֵ
     */
    public String getShengChanKV(){
        return shengChanKV;
    }

    /**
     * ��������ͣ����۵�ѹ�ȼ�
     * @param tingChanKV �����õ�����ͣ����۵�ѹ�ȼ���ֵ
     */
    public void setTingChanKV(String tingChanKV){
        this.tingChanKV = StringUtils.rightTrim(tingChanKV);
    }

    /**
     * ��ȡ����ͣ����۵�ѹ�ȼ�
     * @return ����ͣ����۵�ѹ�ȼ���ֵ
     */
    public String getTingChanKV(){
        return tingChanKV;
    }

    /**
     * �������Ծ�����������
     * @param pepolePower �����õ����Ծ�������������ֵ
     */
    public void setPepolePower(String pepolePower){
        this.pepolePower = StringUtils.rightTrim(pepolePower);
    }

    /**
     * ��ȡ���Ծ�����������
     * @return ���Ծ�������������ֵ
     */
    public String getPepolePower(){
        return pepolePower;
    }

    /**
     * ���������������
     * @param lineLossScale �����õ��������������ֵ
     */
    public void setLineLossScale(double lineLossScale){
        this.lineLossScale = lineLossScale;
    }

    /**
     * ��ȡ�����������
     * @return �������������ֵ
     */
    public double getLineLossScale(){
        return lineLossScale;
    }
}
