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
}
