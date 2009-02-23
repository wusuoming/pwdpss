package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwAllWholeFee-�����ܷ��ñ�����ݴ���������<br>
 */
public class LwAllWholeFeeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** �������۹�˾ */
    private String company = "";
    /** �������� */
    private String inputdate = "";
    /** ���Ե��� */
    private String power1 = "";
    /** ���Ե�� */
    private String dianfei = "";
    /** ������Ͽ */
    private String sanxia = "";
    /** ���Ե����ʽ� */
    private String dianjin = "";
    /** ���Ի��� */
    private String jijin = "";
    /** ���Ե��˰ */
    private String dianfeitax = "";
    /** ������Ͽ˰ */
    private String sanxiatax = "";
    /** ���Ե��˰ */
    private String dianjintax = "";
    /** �����ܼ� */
    private String sumfee = "";
    /** ���Ժ���¯ */
    private String haiminglu = "";
    /** ���Զ�� */
    private String duobian = "";
    /** ����׷�� */
    private String zhuijia = "";
    /** ���Ը���1 */
    private String fujia1 = "";
    /** ���Ը���2 */
    private String fujia2 = "";
    /** ���Ը���3 */
    private String fujia3 = "";
    /** ���Ը���4 */
    private String fujia4 = "";
    /** ���Ը���5 */
    private String fujia5 = "";
    /** ���Ը���6 */
    private String fujia6 = "";
    /** ���Ը���7 */
    private String fujia7 = "";
    /** ���Ը���8 */
    private String fujia8 = "";
    /** ���Ը���9 */
    private String fujia9 = "";
    /** ���Ը���10 */
    private String fujia10 = "";
    /** ���Ը���11 */
    private String fujia11 = "";
    /** ���Ը���12 */
    private String fujia12 = "";

    /**
     *  Ĭ�Ϲ��췽��,����һ��Ĭ�ϵ�LwAllWholeFeeDtoBase����
     */
    public LwAllWholeFeeDtoBase(){
    }

    /**
     * �����������۹�˾
     * @param company �����õ��������۹�˾��ֵ
     */
    public void setCompany(String company){
        this.company = StringUtils.rightTrim(company);
    }

    /**
     * ��ȡ�������۹�˾
     * @return �������۹�˾��ֵ
     */
    public String getCompany(){
        return company;
    }

    /**
     * ������������
     * @param inputdate �����õ��������µ�ֵ
     */
    public void setInputdate(String inputdate){
        this.inputdate = StringUtils.rightTrim(inputdate);
    }

    /**
     * ��ȡ��������
     * @return �������µ�ֵ
     */
    public String getInputdate(){
        return inputdate;
    }

    /**
     * �������Ե���
     * @param power1 �����õ����Ե�����ֵ
     */
    public void setPower1(String power1){
        this.power1 = StringUtils.rightTrim(power1);
    }

    /**
     * ��ȡ���Ե���
     * @return ���Ե�����ֵ
     */
    public String getPower1(){
        return power1;
    }

    /**
     * �������Ե��
     * @param dianfei �����õ����Ե�ѵ�ֵ
     */
    public void setDianfei(String dianfei){
        this.dianfei = StringUtils.rightTrim(dianfei);
    }

    /**
     * ��ȡ���Ե��
     * @return ���Ե�ѵ�ֵ
     */
    public String getDianfei(){
        return dianfei;
    }

    /**
     * ����������Ͽ
     * @param sanxia �����õ�������Ͽ��ֵ
     */
    public void setSanxia(String sanxia){
        this.sanxia = StringUtils.rightTrim(sanxia);
    }

    /**
     * ��ȡ������Ͽ
     * @return ������Ͽ��ֵ
     */
    public String getSanxia(){
        return sanxia;
    }

    /**
     * �������Ե����ʽ�
     * @param dianjin �����õ����Ե����ʽ��ֵ
     */
    public void setDianjin(String dianjin){
        this.dianjin = StringUtils.rightTrim(dianjin);
    }

    /**
     * ��ȡ���Ե����ʽ�
     * @return ���Ե����ʽ��ֵ
     */
    public String getDianjin(){
        return dianjin;
    }

    /**
     * �������Ի���
     * @param jijin �����õ����Ի����ֵ
     */
    public void setJijin(String jijin){
        this.jijin = StringUtils.rightTrim(jijin);
    }

    /**
     * ��ȡ���Ի���
     * @return ���Ի����ֵ
     */
    public String getJijin(){
        return jijin;
    }

    /**
     * �������Ե��˰
     * @param dianfeitax �����õ����Ե��˰��ֵ
     */
    public void setDianfeitax(String dianfeitax){
        this.dianfeitax = StringUtils.rightTrim(dianfeitax);
    }

    /**
     * ��ȡ���Ե��˰
     * @return ���Ե��˰��ֵ
     */
    public String getDianfeitax(){
        return dianfeitax;
    }

    /**
     * ����������Ͽ˰
     * @param sanxiatax �����õ�������Ͽ˰��ֵ
     */
    public void setSanxiatax(String sanxiatax){
        this.sanxiatax = StringUtils.rightTrim(sanxiatax);
    }

    /**
     * ��ȡ������Ͽ˰
     * @return ������Ͽ˰��ֵ
     */
    public String getSanxiatax(){
        return sanxiatax;
    }

    /**
     * �������Ե��˰
     * @param dianjintax �����õ����Ե��˰��ֵ
     */
    public void setDianjintax(String dianjintax){
        this.dianjintax = StringUtils.rightTrim(dianjintax);
    }

    /**
     * ��ȡ���Ե��˰
     * @return ���Ե��˰��ֵ
     */
    public String getDianjintax(){
        return dianjintax;
    }

    /**
     * ���������ܼ�
     * @param sumfee �����õ������ܼƵ�ֵ
     */
    public void setSumfee(String sumfee){
        this.sumfee = StringUtils.rightTrim(sumfee);
    }

    /**
     * ��ȡ�����ܼ�
     * @return �����ܼƵ�ֵ
     */
    public String getSumfee(){
        return sumfee;
    }

    /**
     * �������Ժ���¯
     * @param haiminglu �����õ����Ժ���¯��ֵ
     */
    public void setHaiminglu(String haiminglu){
        this.haiminglu = StringUtils.rightTrim(haiminglu);
    }

    /**
     * ��ȡ���Ժ���¯
     * @return ���Ժ���¯��ֵ
     */
    public String getHaiminglu(){
        return haiminglu;
    }

    /**
     * �������Զ��
     * @param duobian �����õ����Զ�ߵ�ֵ
     */
    public void setDuobian(String duobian){
        this.duobian = StringUtils.rightTrim(duobian);
    }

    /**
     * ��ȡ���Զ��
     * @return ���Զ�ߵ�ֵ
     */
    public String getDuobian(){
        return duobian;
    }

    /**
     * ��������׷��
     * @param zhuijia �����õ�����׷�ӵ�ֵ
     */
    public void setZhuijia(String zhuijia){
        this.zhuijia = StringUtils.rightTrim(zhuijia);
    }

    /**
     * ��ȡ����׷��
     * @return ����׷�ӵ�ֵ
     */
    public String getZhuijia(){
        return zhuijia;
    }

    /**
     * �������Ը���1
     * @param fujia1 �����õ����Ը���1��ֵ
     */
    public void setFujia1(String fujia1){
        this.fujia1 = StringUtils.rightTrim(fujia1);
    }

    /**
     * ��ȡ���Ը���1
     * @return ���Ը���1��ֵ
     */
    public String getFujia1(){
        return fujia1;
    }

    /**
     * �������Ը���2
     * @param fujia2 �����õ����Ը���2��ֵ
     */
    public void setFujia2(String fujia2){
        this.fujia2 = StringUtils.rightTrim(fujia2);
    }

    /**
     * ��ȡ���Ը���2
     * @return ���Ը���2��ֵ
     */
    public String getFujia2(){
        return fujia2;
    }

    /**
     * �������Ը���3
     * @param fujia3 �����õ����Ը���3��ֵ
     */
    public void setFujia3(String fujia3){
        this.fujia3 = StringUtils.rightTrim(fujia3);
    }

    /**
     * ��ȡ���Ը���3
     * @return ���Ը���3��ֵ
     */
    public String getFujia3(){
        return fujia3;
    }

    /**
     * �������Ը���4
     * @param fujia4 �����õ����Ը���4��ֵ
     */
    public void setFujia4(String fujia4){
        this.fujia4 = StringUtils.rightTrim(fujia4);
    }

    /**
     * ��ȡ���Ը���4
     * @return ���Ը���4��ֵ
     */
    public String getFujia4(){
        return fujia4;
    }

    /**
     * �������Ը���5
     * @param fujia5 �����õ����Ը���5��ֵ
     */
    public void setFujia5(String fujia5){
        this.fujia5 = StringUtils.rightTrim(fujia5);
    }

    /**
     * ��ȡ���Ը���5
     * @return ���Ը���5��ֵ
     */
    public String getFujia5(){
        return fujia5;
    }

    /**
     * �������Ը���6
     * @param fujia6 �����õ����Ը���6��ֵ
     */
    public void setFujia6(String fujia6){
        this.fujia6 = StringUtils.rightTrim(fujia6);
    }

    /**
     * ��ȡ���Ը���6
     * @return ���Ը���6��ֵ
     */
    public String getFujia6(){
        return fujia6;
    }

    /**
     * �������Ը���7
     * @param fujia7 �����õ����Ը���7��ֵ
     */
    public void setFujia7(String fujia7){
        this.fujia7 = StringUtils.rightTrim(fujia7);
    }

    /**
     * ��ȡ���Ը���7
     * @return ���Ը���7��ֵ
     */
    public String getFujia7(){
        return fujia7;
    }

    /**
     * �������Ը���8
     * @param fujia8 �����õ����Ը���8��ֵ
     */
    public void setFujia8(String fujia8){
        this.fujia8 = StringUtils.rightTrim(fujia8);
    }

    /**
     * ��ȡ���Ը���8
     * @return ���Ը���8��ֵ
     */
    public String getFujia8(){
        return fujia8;
    }

    /**
     * �������Ը���9
     * @param fujia9 �����õ����Ը���9��ֵ
     */
    public void setFujia9(String fujia9){
        this.fujia9 = StringUtils.rightTrim(fujia9);
    }

    /**
     * ��ȡ���Ը���9
     * @return ���Ը���9��ֵ
     */
    public String getFujia9(){
        return fujia9;
    }

    /**
     * �������Ը���10
     * @param fujia10 �����õ����Ը���10��ֵ
     */
    public void setFujia10(String fujia10){
        this.fujia10 = StringUtils.rightTrim(fujia10);
    }

    /**
     * ��ȡ���Ը���10
     * @return ���Ը���10��ֵ
     */
    public String getFujia10(){
        return fujia10;
    }

    /**
     * �������Ը���11
     * @param fujia11 �����õ����Ը���11��ֵ
     */
    public void setFujia11(String fujia11){
        this.fujia11 = StringUtils.rightTrim(fujia11);
    }

    /**
     * ��ȡ���Ը���11
     * @return ���Ը���11��ֵ
     */
    public String getFujia11(){
        return fujia11;
    }

    /**
     * �������Ը���12
     * @param fujia12 �����õ����Ը���12��ֵ
     */
    public void setFujia12(String fujia12){
        this.fujia12 = StringUtils.rightTrim(fujia12);
    }

    /**
     * ��ȡ���Ը���12
     * @return ���Ը���12��ֵ
     */
    public String getFujia12(){
        return fujia12;
    }
}
