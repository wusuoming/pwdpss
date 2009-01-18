package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是subjoinFee-附加费用表的数据传输对象基类<br>
 */
public class SubjoinFeeDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性用电类别 */
    private String powerType = "";
    /** 属性名称 */
    private String name = "";
    /** 属性农网还贷 */
    private double nongwanghuanDai = 0D;
    /** 属性三峡 */
    private double sanXia = 0D;
    /** 属性库区移民 */
    private double kuquyimin = 0D;
    /** 属性可再生能源 */
    private double kezaishengnengyuan = 0D;

    /**
     *  默认构造方法,构造一个默认的SubjoinFeeDtoBase对象
     */
    public SubjoinFeeDtoBase(){
    }

    /**
     * 设置属性用电类别
     * @param powerType 待设置的属性用电类别的值
     */
    public void setPowerType(String powerType){
        this.powerType = StringUtils.rightTrim(powerType);
    }

    /**
     * 获取属性用电类别
     * @return 属性用电类别的值
     */
    public String getPowerType(){
        return powerType;
    }

    /**
     * 设置属性名称
     * @param name 待设置的属性名称的值
     */
    public void setName(String name){
        this.name = StringUtils.rightTrim(name);
    }

    /**
     * 获取属性名称
     * @return 属性名称的值
     */
    public String getName(){
        return name;
    }

    /**
     * 设置属性农网还贷
     * @param nongwanghuanDai 待设置的属性农网还贷的值
     */
    public void setNongwanghuanDai(double nongwanghuanDai){
        this.nongwanghuanDai = nongwanghuanDai;
    }

    /**
     * 获取属性农网还贷
     * @return 属性农网还贷的值
     */
    public double getNongwanghuanDai(){
        return nongwanghuanDai;
    }

    /**
     * 设置属性三峡
     * @param sanXia 待设置的属性三峡的值
     */
    public void setSanXia(double sanXia){
        this.sanXia = sanXia;
    }

    /**
     * 获取属性三峡
     * @return 属性三峡的值
     */
    public double getSanXia(){
        return sanXia;
    }

    /**
     * 设置属性库区移民
     * @param kuquyimin 待设置的属性库区移民的值
     */
    public void setKuquyimin(double kuquyimin){
        this.kuquyimin = kuquyimin;
    }

    /**
     * 获取属性库区移民
     * @return 属性库区移民的值
     */
    public double getKuquyimin(){
        return kuquyimin;
    }

    /**
     * 设置属性可再生能源
     * @param kezaishengnengyuan 待设置的属性可再生能源的值
     */
    public void setKezaishengnengyuan(double kezaishengnengyuan){
        this.kezaishengnengyuan = kezaishengnengyuan;
    }

    /**
     * 获取属性可再生能源
     * @return 属性可再生能源的值
     */
    public double getKezaishengnengyuan(){
        return kezaishengnengyuan;
    }
}
