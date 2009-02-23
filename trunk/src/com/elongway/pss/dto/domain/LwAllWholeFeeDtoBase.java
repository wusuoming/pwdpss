package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwAllWholeFee-趸售总费用表的数据传输对象基类<br>
 */
public class LwAllWholeFeeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性趸售公司 */
    private String company = "";
    /** 属性年月 */
    private String inputdate = "";
    /** 属性电量 */
    private String power1 = "";
    /** 属性电费 */
    private String dianfei = "";
    /** 属性三峡 */
    private String sanxia = "";
    /** 属性电力资金 */
    private String dianjin = "";
    /** 属性基金 */
    private String jijin = "";
    /** 属性电费税 */
    private String dianfeitax = "";
    /** 属性三峡税 */
    private String sanxiatax = "";
    /** 属性电金税 */
    private String dianjintax = "";
    /** 属性总计 */
    private String sumfee = "";
    /** 属性海明炉 */
    private String haiminglu = "";
    /** 属性多边 */
    private String duobian = "";
    /** 属性追加 */
    private String zhuijia = "";
    /** 属性附加1 */
    private String fujia1 = "";
    /** 属性附加2 */
    private String fujia2 = "";
    /** 属性附加3 */
    private String fujia3 = "";
    /** 属性附加4 */
    private String fujia4 = "";
    /** 属性附加5 */
    private String fujia5 = "";
    /** 属性附加6 */
    private String fujia6 = "";
    /** 属性附加7 */
    private String fujia7 = "";
    /** 属性附加8 */
    private String fujia8 = "";
    /** 属性附加9 */
    private String fujia9 = "";
    /** 属性附加10 */
    private String fujia10 = "";
    /** 属性附加11 */
    private String fujia11 = "";
    /** 属性附加12 */
    private String fujia12 = "";

    /**
     *  默认构造方法,构造一个默认的LwAllWholeFeeDtoBase对象
     */
    public LwAllWholeFeeDtoBase(){
    }

    /**
     * 设置属性趸售公司
     * @param company 待设置的属性趸售公司的值
     */
    public void setCompany(String company){
        this.company = StringUtils.rightTrim(company);
    }

    /**
     * 获取属性趸售公司
     * @return 属性趸售公司的值
     */
    public String getCompany(){
        return company;
    }

    /**
     * 设置属性年月
     * @param inputdate 待设置的属性年月的值
     */
    public void setInputdate(String inputdate){
        this.inputdate = StringUtils.rightTrim(inputdate);
    }

    /**
     * 获取属性年月
     * @return 属性年月的值
     */
    public String getInputdate(){
        return inputdate;
    }

    /**
     * 设置属性电量
     * @param power1 待设置的属性电量的值
     */
    public void setPower1(String power1){
        this.power1 = StringUtils.rightTrim(power1);
    }

    /**
     * 获取属性电量
     * @return 属性电量的值
     */
    public String getPower1(){
        return power1;
    }

    /**
     * 设置属性电费
     * @param dianfei 待设置的属性电费的值
     */
    public void setDianfei(String dianfei){
        this.dianfei = StringUtils.rightTrim(dianfei);
    }

    /**
     * 获取属性电费
     * @return 属性电费的值
     */
    public String getDianfei(){
        return dianfei;
    }

    /**
     * 设置属性三峡
     * @param sanxia 待设置的属性三峡的值
     */
    public void setSanxia(String sanxia){
        this.sanxia = StringUtils.rightTrim(sanxia);
    }

    /**
     * 获取属性三峡
     * @return 属性三峡的值
     */
    public String getSanxia(){
        return sanxia;
    }

    /**
     * 设置属性电力资金
     * @param dianjin 待设置的属性电力资金的值
     */
    public void setDianjin(String dianjin){
        this.dianjin = StringUtils.rightTrim(dianjin);
    }

    /**
     * 获取属性电力资金
     * @return 属性电力资金的值
     */
    public String getDianjin(){
        return dianjin;
    }

    /**
     * 设置属性基金
     * @param jijin 待设置的属性基金的值
     */
    public void setJijin(String jijin){
        this.jijin = StringUtils.rightTrim(jijin);
    }

    /**
     * 获取属性基金
     * @return 属性基金的值
     */
    public String getJijin(){
        return jijin;
    }

    /**
     * 设置属性电费税
     * @param dianfeitax 待设置的属性电费税的值
     */
    public void setDianfeitax(String dianfeitax){
        this.dianfeitax = StringUtils.rightTrim(dianfeitax);
    }

    /**
     * 获取属性电费税
     * @return 属性电费税的值
     */
    public String getDianfeitax(){
        return dianfeitax;
    }

    /**
     * 设置属性三峡税
     * @param sanxiatax 待设置的属性三峡税的值
     */
    public void setSanxiatax(String sanxiatax){
        this.sanxiatax = StringUtils.rightTrim(sanxiatax);
    }

    /**
     * 获取属性三峡税
     * @return 属性三峡税的值
     */
    public String getSanxiatax(){
        return sanxiatax;
    }

    /**
     * 设置属性电金税
     * @param dianjintax 待设置的属性电金税的值
     */
    public void setDianjintax(String dianjintax){
        this.dianjintax = StringUtils.rightTrim(dianjintax);
    }

    /**
     * 获取属性电金税
     * @return 属性电金税的值
     */
    public String getDianjintax(){
        return dianjintax;
    }

    /**
     * 设置属性总计
     * @param sumfee 待设置的属性总计的值
     */
    public void setSumfee(String sumfee){
        this.sumfee = StringUtils.rightTrim(sumfee);
    }

    /**
     * 获取属性总计
     * @return 属性总计的值
     */
    public String getSumfee(){
        return sumfee;
    }

    /**
     * 设置属性海明炉
     * @param haiminglu 待设置的属性海明炉的值
     */
    public void setHaiminglu(String haiminglu){
        this.haiminglu = StringUtils.rightTrim(haiminglu);
    }

    /**
     * 获取属性海明炉
     * @return 属性海明炉的值
     */
    public String getHaiminglu(){
        return haiminglu;
    }

    /**
     * 设置属性多边
     * @param duobian 待设置的属性多边的值
     */
    public void setDuobian(String duobian){
        this.duobian = StringUtils.rightTrim(duobian);
    }

    /**
     * 获取属性多边
     * @return 属性多边的值
     */
    public String getDuobian(){
        return duobian;
    }

    /**
     * 设置属性追加
     * @param zhuijia 待设置的属性追加的值
     */
    public void setZhuijia(String zhuijia){
        this.zhuijia = StringUtils.rightTrim(zhuijia);
    }

    /**
     * 获取属性追加
     * @return 属性追加的值
     */
    public String getZhuijia(){
        return zhuijia;
    }

    /**
     * 设置属性附加1
     * @param fujia1 待设置的属性附加1的值
     */
    public void setFujia1(String fujia1){
        this.fujia1 = StringUtils.rightTrim(fujia1);
    }

    /**
     * 获取属性附加1
     * @return 属性附加1的值
     */
    public String getFujia1(){
        return fujia1;
    }

    /**
     * 设置属性附加2
     * @param fujia2 待设置的属性附加2的值
     */
    public void setFujia2(String fujia2){
        this.fujia2 = StringUtils.rightTrim(fujia2);
    }

    /**
     * 获取属性附加2
     * @return 属性附加2的值
     */
    public String getFujia2(){
        return fujia2;
    }

    /**
     * 设置属性附加3
     * @param fujia3 待设置的属性附加3的值
     */
    public void setFujia3(String fujia3){
        this.fujia3 = StringUtils.rightTrim(fujia3);
    }

    /**
     * 获取属性附加3
     * @return 属性附加3的值
     */
    public String getFujia3(){
        return fujia3;
    }

    /**
     * 设置属性附加4
     * @param fujia4 待设置的属性附加4的值
     */
    public void setFujia4(String fujia4){
        this.fujia4 = StringUtils.rightTrim(fujia4);
    }

    /**
     * 获取属性附加4
     * @return 属性附加4的值
     */
    public String getFujia4(){
        return fujia4;
    }

    /**
     * 设置属性附加5
     * @param fujia5 待设置的属性附加5的值
     */
    public void setFujia5(String fujia5){
        this.fujia5 = StringUtils.rightTrim(fujia5);
    }

    /**
     * 获取属性附加5
     * @return 属性附加5的值
     */
    public String getFujia5(){
        return fujia5;
    }

    /**
     * 设置属性附加6
     * @param fujia6 待设置的属性附加6的值
     */
    public void setFujia6(String fujia6){
        this.fujia6 = StringUtils.rightTrim(fujia6);
    }

    /**
     * 获取属性附加6
     * @return 属性附加6的值
     */
    public String getFujia6(){
        return fujia6;
    }

    /**
     * 设置属性附加7
     * @param fujia7 待设置的属性附加7的值
     */
    public void setFujia7(String fujia7){
        this.fujia7 = StringUtils.rightTrim(fujia7);
    }

    /**
     * 获取属性附加7
     * @return 属性附加7的值
     */
    public String getFujia7(){
        return fujia7;
    }

    /**
     * 设置属性附加8
     * @param fujia8 待设置的属性附加8的值
     */
    public void setFujia8(String fujia8){
        this.fujia8 = StringUtils.rightTrim(fujia8);
    }

    /**
     * 获取属性附加8
     * @return 属性附加8的值
     */
    public String getFujia8(){
        return fujia8;
    }

    /**
     * 设置属性附加9
     * @param fujia9 待设置的属性附加9的值
     */
    public void setFujia9(String fujia9){
        this.fujia9 = StringUtils.rightTrim(fujia9);
    }

    /**
     * 获取属性附加9
     * @return 属性附加9的值
     */
    public String getFujia9(){
        return fujia9;
    }

    /**
     * 设置属性附加10
     * @param fujia10 待设置的属性附加10的值
     */
    public void setFujia10(String fujia10){
        this.fujia10 = StringUtils.rightTrim(fujia10);
    }

    /**
     * 获取属性附加10
     * @return 属性附加10的值
     */
    public String getFujia10(){
        return fujia10;
    }

    /**
     * 设置属性附加11
     * @param fujia11 待设置的属性附加11的值
     */
    public void setFujia11(String fujia11){
        this.fujia11 = StringUtils.rightTrim(fujia11);
    }

    /**
     * 获取属性附加11
     * @return 属性附加11的值
     */
    public String getFujia11(){
        return fujia11;
    }

    /**
     * 设置属性附加12
     * @param fujia12 待设置的属性附加12的值
     */
    public void setFujia12(String fujia12){
        this.fujia12 = StringUtils.rightTrim(fujia12);
    }

    /**
     * 获取属性附加12
     * @return 属性附加12的值
     */
    public String getFujia12(){
        return fujia12;
    }
}
