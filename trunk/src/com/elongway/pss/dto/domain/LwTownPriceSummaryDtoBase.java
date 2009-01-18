package com.elongway.pss.dto.domain;

import java.io.Serializable;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.common.util.StringUtils;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownPriceSummary-直供乡电费计算总表的数据传输对象基类<br>
 */
public class LwTownPriceSummaryDtoBase implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 属性户号 */
    private String userNo = "";
    /** 属性线路代码 */
    private String lineCode = "";
    /** 属性统计年月 */
    private String statMonth = "";
    /** 属性总电费 */
    private double electricFee = 0D;
    /** 属性居民电量 */
    private double peopleQuantity = 0D;
    /** 属性居民比例 */
    private double peopleScale = 0D;
    /** 属性居民电价 */
    private double peoplePrice = 0D;
    /** 属性居民电费 */
    private double peopleFee = 0D;
    /** 属性居民电费合计 */
    private double sumPeopleFee = 0D;
    /** 属性居民电金 */
    private double peopleDianJin = 0D;
    /** 属性居民三峡 */
    private double peopleFeeSanXia = 0D;
    /** 属性居民基金 */
    private double peopleJiJin = 0D;
    /** 属性居民库区 */
    private double peopleKuQu = 0D;
    /** 属性非居民电量 */
    private double notPeopleQuantity = 0D;
    /** 属性非居民比例 */
    private double notPeopleScale = 0D;
    /** 属性非居民电价 */
    private double notPeoplePrice = 0D;
    /** 属性非居民电费 */
    private double notPeopleFee = 0D;
    /** 属性非居民电费合计 */
    private double sumNotPeopleFee = 0D;
    /** 属性非居民电金 */
    private double notPeopleDianJin = 0D;
    /** 属性非居民三峡 */
    private double notPeopleFeeSanXia = 0D;
    /** 属性非居民基金 */
    private double notPeopleJiJin = 0D;
    /** 属性非居民库区 */
    private double notPeopleKuQu = 0D;
    /** 属性农灌电量 */
    private double farmQuantity = 0D;
    /** 属性农灌比例 */
    private double farmScale = 0D;
    /** 属性农灌电价 */
    private double farmPrice = 0D;
    /** 属性农灌电费 */
    private double farmFee = 0D;
    /** 属性农灌电费合计 */
    private double sumFarmFee = 0D;
    /** 属性农灌电金 */
    private double farmDianJin = 0D;
    /** 属性农灌三峡 */
    private double farmSanXia = 0D;
    /** 属性农灌基金 */
    private double farmJiJin = 0D;
    /** 属性农灌库区 */
    private double farmKuQu = 0D;
    /** 属性农业生产电量 */
    private double produceQuantity = 0D;
    /** 属性农业生产比例 */
    private double produceScale = 0D;
    /** 属性农业生产电价 */
    private double producePrice = 0D;
    /** 属性农业生产电费 */
    private double produceFee = 0D;
    /** 属性农业生产电费合计 */
    private double sumProduceFee = 0D;
    /** 属性农业生产电金 */
    private double produceDianJin = 0D;
    /** 属性农业生产三峡 */
    private double produceSanXia = 0D;
    /** 属性农业生产库区 */
    private double produceKuQu = 0D;
    /** 属性农业生产基金 */
    private double produceJiJin = 0D;
    /** 属性商业电量 */
    private double bizQuantity = 0D;
    /** 属性商业比例 */
    private double bizScale = 0D;
    /** 属性商业电价 */
    private double bizPrice = 0D;
    /** 属性商业电费 */
    private double bizFee = 0D;
    /** 属性商业电费合计 */
    private double sumBizFee = 0D;
    /** 属性商业电金 */
    private double bizDianJin = 0D;
    /** 属性商业三峡 */
    private double bizSanXia = 0D;
    /** 属性商业库区 */
    private double bizKuQu = 0D;
    /** 属性商业基金 */
    private double bizJiJin = 0D;
    /** 属性非工业、普通工业电量 */
    private double industryQuantity = 0D;
    /** 属性非工业比例 */
    private double industryScale = 0D;
    /** 属性非工业电价 */
    private double industryPrice = 0D;
    /** 属性非工业电费 */
    private double industryFee = 0D;
    /** 属性非工业电费合计 */
    private double sumIndustryFee = 0D;
    /** 属性非工业电金 */
    private double industryDianJin = 0D;
    /** 属性非工业三峡 */
    private double industrySanXia = 0D;
    /** 属性非工业库区 */
    private double industryKuQu = 0D;
    /** 属性非工业基金 */
    private double industryJiJin = 0D;
    /** 属性变损电量 */
    private long tranferLossQuantity = 0L;
    /** 属性功率因数 */
    private double rateCode = 0D;
    /** 属性调整值 */
    private double adjustValue = 0D;
    /** 属性力率电费 */
    private double rateFee = 0D;
    /** 属性农业还贷资金 */
    private double loan = 0D;
    /** 属性三峡 */
    private double sanXiaFee = 0D;
    /** 属性可再生能源附加费 */
    private double surcharge = 0D;
    /** 属性库区移民基金 */
    private double migrationFee = 0D;
    /** 属性电量合计 */
    private double sumQuantity = 0D;
    /** 属性电费合计 */
    private double sumFee = 0D;
    /** 属性电金合计 */
    private double sumDianJin = 0D;
    /** 属性三峡合计 */
    private double sumSanXia = 0D;
    /** 属性基金合计 */
    private double sumJiJin = 0D;
    /** 属性是否有效 */
    private String validStatus = "";
    /** 属性标志 */
    private String flag = "";
    /** 属性注释 */
    private String remark = "";
    /** 属性库区合计 */
    private double sumKuQu = 0D;
    /** 属性录入日期 */
    private String inputDate = "";

    /**
     *  默认构造方法,构造一个默认的LwTownPriceSummaryDtoBase对象
     */
    public LwTownPriceSummaryDtoBase(){
    }

    /**
     * 设置属性户号
     * @param userNo 待设置的属性户号的值
     */
    public void setUserNo(String userNo){
        this.userNo = StringUtils.rightTrim(userNo);
    }

    /**
     * 获取属性户号
     * @return 属性户号的值
     */
    public String getUserNo(){
        return userNo;
    }

    /**
     * 设置属性线路代码
     * @param lineCode 待设置的属性线路代码的值
     */
    public void setLineCode(String lineCode){
        this.lineCode = StringUtils.rightTrim(lineCode);
    }

    /**
     * 获取属性线路代码
     * @return 属性线路代码的值
     */
    public String getLineCode(){
        return lineCode;
    }

    /**
     * 设置属性统计年月
     * @param statMonth 待设置的属性统计年月的值
     */
    public void setStatMonth(String statMonth){
        this.statMonth = StringUtils.rightTrim(statMonth);
    }

    /**
     * 获取属性统计年月
     * @return 属性统计年月的值
     */
    public String getStatMonth(){
        return statMonth;
    }

    /**
     * 设置属性总电费
     * @param electricFee 待设置的属性总电费的值
     */
    public void setElectricFee(double electricFee){
        this.electricFee = electricFee;
    }

    /**
     * 获取属性总电费
     * @return 属性总电费的值
     */
    public double getElectricFee(){
        return electricFee;
    }

    /**
     * 设置属性居民电量
     * @param peopleQuantity 待设置的属性居民电量的值
     */
    public void setPeopleQuantity(double peopleQuantity){
        this.peopleQuantity = peopleQuantity;
    }

    /**
     * 获取属性居民电量
     * @return 属性居民电量的值
     */
    public double getPeopleQuantity(){
        return peopleQuantity;
    }

    /**
     * 设置属性居民比例
     * @param peopleScale 待设置的属性居民比例的值
     */
    public void setPeopleScale(double peopleScale){
        this.peopleScale = peopleScale;
    }

    /**
     * 获取属性居民比例
     * @return 属性居民比例的值
     */
    public double getPeopleScale(){
        return peopleScale;
    }

    /**
     * 设置属性居民电价
     * @param peoplePrice 待设置的属性居民电价的值
     */
    public void setPeoplePrice(double peoplePrice){
        this.peoplePrice = peoplePrice;
    }

    /**
     * 获取属性居民电价
     * @return 属性居民电价的值
     */
    public double getPeoplePrice(){
        return peoplePrice;
    }

    /**
     * 设置属性居民电费
     * @param peopleFee 待设置的属性居民电费的值
     */
    public void setPeopleFee(double peopleFee){
        this.peopleFee = peopleFee;
    }

    /**
     * 获取属性居民电费
     * @return 属性居民电费的值
     */
    public double getPeopleFee(){
        return peopleFee;
    }

    /**
     * 设置属性居民电费合计
     * @param sumPeopleFee 待设置的属性居民电费合计的值
     */
    public void setSumPeopleFee(double sumPeopleFee){
        this.sumPeopleFee = sumPeopleFee;
    }

    /**
     * 获取属性居民电费合计
     * @return 属性居民电费合计的值
     */
    public double getSumPeopleFee(){
        return sumPeopleFee;
    }

    /**
     * 设置属性居民电金
     * @param peopleDianJin 待设置的属性居民电金的值
     */
    public void setPeopleDianJin(double peopleDianJin){
        this.peopleDianJin = peopleDianJin;
    }

    /**
     * 获取属性居民电金
     * @return 属性居民电金的值
     */
    public double getPeopleDianJin(){
        return peopleDianJin;
    }

    /**
     * 设置属性居民三峡
     * @param peopleFeeSanXia 待设置的属性居民三峡的值
     */
    public void setPeopleFeeSanXia(double peopleFeeSanXia){
        this.peopleFeeSanXia = peopleFeeSanXia;
    }

    /**
     * 获取属性居民三峡
     * @return 属性居民三峡的值
     */
    public double getPeopleFeeSanXia(){
        return peopleFeeSanXia;
    }

    /**
     * 设置属性居民基金
     * @param peopleJiJin 待设置的属性居民基金的值
     */
    public void setPeopleJiJin(double peopleJiJin){
        this.peopleJiJin = peopleJiJin;
    }

    /**
     * 获取属性居民基金
     * @return 属性居民基金的值
     */
    public double getPeopleJiJin(){
        return peopleJiJin;
    }

    /**
     * 设置属性居民库区
     * @param peopleKuQu 待设置的属性居民库区的值
     */
    public void setPeopleKuQu(double peopleKuQu){
        this.peopleKuQu = peopleKuQu;
    }

    /**
     * 获取属性居民库区
     * @return 属性居民库区的值
     */
    public double getPeopleKuQu(){
        return peopleKuQu;
    }

    /**
     * 设置属性非居民电量
     * @param notPeopleQuantity 待设置的属性非居民电量的值
     */
    public void setNotPeopleQuantity(double notPeopleQuantity){
        this.notPeopleQuantity = notPeopleQuantity;
    }

    /**
     * 获取属性非居民电量
     * @return 属性非居民电量的值
     */
    public double getNotPeopleQuantity(){
        return notPeopleQuantity;
    }

    /**
     * 设置属性非居民比例
     * @param notPeopleScale 待设置的属性非居民比例的值
     */
    public void setNotPeopleScale(double notPeopleScale){
        this.notPeopleScale = notPeopleScale;
    }

    /**
     * 获取属性非居民比例
     * @return 属性非居民比例的值
     */
    public double getNotPeopleScale(){
        return notPeopleScale;
    }

    /**
     * 设置属性非居民电价
     * @param notPeoplePrice 待设置的属性非居民电价的值
     */
    public void setNotPeoplePrice(double notPeoplePrice){
        this.notPeoplePrice = notPeoplePrice;
    }

    /**
     * 获取属性非居民电价
     * @return 属性非居民电价的值
     */
    public double getNotPeoplePrice(){
        return notPeoplePrice;
    }

    /**
     * 设置属性非居民电费
     * @param notPeopleFee 待设置的属性非居民电费的值
     */
    public void setNotPeopleFee(double notPeopleFee){
        this.notPeopleFee = notPeopleFee;
    }

    /**
     * 获取属性非居民电费
     * @return 属性非居民电费的值
     */
    public double getNotPeopleFee(){
        return notPeopleFee;
    }

    /**
     * 设置属性非居民电费合计
     * @param sumNotPeopleFee 待设置的属性非居民电费合计的值
     */
    public void setSumNotPeopleFee(double sumNotPeopleFee){
        this.sumNotPeopleFee = sumNotPeopleFee;
    }

    /**
     * 获取属性非居民电费合计
     * @return 属性非居民电费合计的值
     */
    public double getSumNotPeopleFee(){
        return sumNotPeopleFee;
    }

    /**
     * 设置属性非居民电金
     * @param notPeopleDianJin 待设置的属性非居民电金的值
     */
    public void setNotPeopleDianJin(double notPeopleDianJin){
        this.notPeopleDianJin = notPeopleDianJin;
    }

    /**
     * 获取属性非居民电金
     * @return 属性非居民电金的值
     */
    public double getNotPeopleDianJin(){
        return notPeopleDianJin;
    }

    /**
     * 设置属性非居民三峡
     * @param notPeopleFeeSanXia 待设置的属性非居民三峡的值
     */
    public void setNotPeopleFeeSanXia(double notPeopleFeeSanXia){
        this.notPeopleFeeSanXia = notPeopleFeeSanXia;
    }

    /**
     * 获取属性非居民三峡
     * @return 属性非居民三峡的值
     */
    public double getNotPeopleFeeSanXia(){
        return notPeopleFeeSanXia;
    }

    /**
     * 设置属性非居民基金
     * @param notPeopleJiJin 待设置的属性非居民基金的值
     */
    public void setNotPeopleJiJin(double notPeopleJiJin){
        this.notPeopleJiJin = notPeopleJiJin;
    }

    /**
     * 获取属性非居民基金
     * @return 属性非居民基金的值
     */
    public double getNotPeopleJiJin(){
        return notPeopleJiJin;
    }

    /**
     * 设置属性非居民库区
     * @param notPeopleKuQu 待设置的属性非居民库区的值
     */
    public void setNotPeopleKuQu(double notPeopleKuQu){
        this.notPeopleKuQu = notPeopleKuQu;
    }

    /**
     * 获取属性非居民库区
     * @return 属性非居民库区的值
     */
    public double getNotPeopleKuQu(){
        return notPeopleKuQu;
    }

    /**
     * 设置属性农灌电量
     * @param farmQuantity 待设置的属性农灌电量的值
     */
    public void setFarmQuantity(double farmQuantity){
        this.farmQuantity = farmQuantity;
    }

    /**
     * 获取属性农灌电量
     * @return 属性农灌电量的值
     */
    public double getFarmQuantity(){
        return farmQuantity;
    }

    /**
     * 设置属性农灌比例
     * @param farmScale 待设置的属性农灌比例的值
     */
    public void setFarmScale(double farmScale){
        this.farmScale = farmScale;
    }

    /**
     * 获取属性农灌比例
     * @return 属性农灌比例的值
     */
    public double getFarmScale(){
        return farmScale;
    }

    /**
     * 设置属性农灌电价
     * @param farmPrice 待设置的属性农灌电价的值
     */
    public void setFarmPrice(double farmPrice){
        this.farmPrice = farmPrice;
    }

    /**
     * 获取属性农灌电价
     * @return 属性农灌电价的值
     */
    public double getFarmPrice(){
        return farmPrice;
    }

    /**
     * 设置属性农灌电费
     * @param farmFee 待设置的属性农灌电费的值
     */
    public void setFarmFee(double farmFee){
        this.farmFee = farmFee;
    }

    /**
     * 获取属性农灌电费
     * @return 属性农灌电费的值
     */
    public double getFarmFee(){
        return farmFee;
    }

    /**
     * 设置属性农灌电费合计
     * @param sumFarmFee 待设置的属性农灌电费合计的值
     */
    public void setSumFarmFee(double sumFarmFee){
        this.sumFarmFee = sumFarmFee;
    }

    /**
     * 获取属性农灌电费合计
     * @return 属性农灌电费合计的值
     */
    public double getSumFarmFee(){
        return sumFarmFee;
    }

    /**
     * 设置属性农灌电金
     * @param farmDianJin 待设置的属性农灌电金的值
     */
    public void setFarmDianJin(double farmDianJin){
        this.farmDianJin = farmDianJin;
    }

    /**
     * 获取属性农灌电金
     * @return 属性农灌电金的值
     */
    public double getFarmDianJin(){
        return farmDianJin;
    }

    /**
     * 设置属性农灌三峡
     * @param farmSanXia 待设置的属性农灌三峡的值
     */
    public void setFarmSanXia(double farmSanXia){
        this.farmSanXia = farmSanXia;
    }

    /**
     * 获取属性农灌三峡
     * @return 属性农灌三峡的值
     */
    public double getFarmSanXia(){
        return farmSanXia;
    }

    /**
     * 设置属性农灌基金
     * @param farmJiJin 待设置的属性农灌基金的值
     */
    public void setFarmJiJin(double farmJiJin){
        this.farmJiJin = farmJiJin;
    }

    /**
     * 获取属性农灌基金
     * @return 属性农灌基金的值
     */
    public double getFarmJiJin(){
        return farmJiJin;
    }

    /**
     * 设置属性农灌库区
     * @param farmKuQu 待设置的属性农灌库区的值
     */
    public void setFarmKuQu(double farmKuQu){
        this.farmKuQu = farmKuQu;
    }

    /**
     * 获取属性农灌库区
     * @return 属性农灌库区的值
     */
    public double getFarmKuQu(){
        return farmKuQu;
    }

    /**
     * 设置属性农业生产电量
     * @param produceQuantity 待设置的属性农业生产电量的值
     */
    public void setProduceQuantity(double produceQuantity){
        this.produceQuantity = produceQuantity;
    }

    /**
     * 获取属性农业生产电量
     * @return 属性农业生产电量的值
     */
    public double getProduceQuantity(){
        return produceQuantity;
    }

    /**
     * 设置属性农业生产比例
     * @param produceScale 待设置的属性农业生产比例的值
     */
    public void setProduceScale(double produceScale){
        this.produceScale = produceScale;
    }

    /**
     * 获取属性农业生产比例
     * @return 属性农业生产比例的值
     */
    public double getProduceScale(){
        return produceScale;
    }

    /**
     * 设置属性农业生产电价
     * @param producePrice 待设置的属性农业生产电价的值
     */
    public void setProducePrice(double producePrice){
        this.producePrice = producePrice;
    }

    /**
     * 获取属性农业生产电价
     * @return 属性农业生产电价的值
     */
    public double getProducePrice(){
        return producePrice;
    }

    /**
     * 设置属性农业生产电费
     * @param produceFee 待设置的属性农业生产电费的值
     */
    public void setProduceFee(double produceFee){
        this.produceFee = produceFee;
    }

    /**
     * 获取属性农业生产电费
     * @return 属性农业生产电费的值
     */
    public double getProduceFee(){
        return produceFee;
    }

    /**
     * 设置属性农业生产电费合计
     * @param sumProduceFee 待设置的属性农业生产电费合计的值
     */
    public void setSumProduceFee(double sumProduceFee){
        this.sumProduceFee = sumProduceFee;
    }

    /**
     * 获取属性农业生产电费合计
     * @return 属性农业生产电费合计的值
     */
    public double getSumProduceFee(){
        return sumProduceFee;
    }

    /**
     * 设置属性农业生产电金
     * @param produceDianJin 待设置的属性农业生产电金的值
     */
    public void setProduceDianJin(double produceDianJin){
        this.produceDianJin = produceDianJin;
    }

    /**
     * 获取属性农业生产电金
     * @return 属性农业生产电金的值
     */
    public double getProduceDianJin(){
        return produceDianJin;
    }

    /**
     * 设置属性农业生产三峡
     * @param produceSanXia 待设置的属性农业生产三峡的值
     */
    public void setProduceSanXia(double produceSanXia){
        this.produceSanXia = produceSanXia;
    }

    /**
     * 获取属性农业生产三峡
     * @return 属性农业生产三峡的值
     */
    public double getProduceSanXia(){
        return produceSanXia;
    }

    /**
     * 设置属性农业生产库区
     * @param produceKuQu 待设置的属性农业生产库区的值
     */
    public void setProduceKuQu(double produceKuQu){
        this.produceKuQu = produceKuQu;
    }

    /**
     * 获取属性农业生产库区
     * @return 属性农业生产库区的值
     */
    public double getProduceKuQu(){
        return produceKuQu;
    }

    /**
     * 设置属性农业生产基金
     * @param produceJiJin 待设置的属性农业生产基金的值
     */
    public void setProduceJiJin(double produceJiJin){
        this.produceJiJin = produceJiJin;
    }

    /**
     * 获取属性农业生产基金
     * @return 属性农业生产基金的值
     */
    public double getProduceJiJin(){
        return produceJiJin;
    }

    /**
     * 设置属性商业电量
     * @param bizQuantity 待设置的属性商业电量的值
     */
    public void setBizQuantity(double bizQuantity){
        this.bizQuantity = bizQuantity;
    }

    /**
     * 获取属性商业电量
     * @return 属性商业电量的值
     */
    public double getBizQuantity(){
        return bizQuantity;
    }

    /**
     * 设置属性商业比例
     * @param bizScale 待设置的属性商业比例的值
     */
    public void setBizScale(double bizScale){
        this.bizScale = bizScale;
    }

    /**
     * 获取属性商业比例
     * @return 属性商业比例的值
     */
    public double getBizScale(){
        return bizScale;
    }

    /**
     * 设置属性商业电价
     * @param bizPrice 待设置的属性商业电价的值
     */
    public void setBizPrice(double bizPrice){
        this.bizPrice = bizPrice;
    }

    /**
     * 获取属性商业电价
     * @return 属性商业电价的值
     */
    public double getBizPrice(){
        return bizPrice;
    }

    /**
     * 设置属性商业电费
     * @param bizFee 待设置的属性商业电费的值
     */
    public void setBizFee(double bizFee){
        this.bizFee = bizFee;
    }

    /**
     * 获取属性商业电费
     * @return 属性商业电费的值
     */
    public double getBizFee(){
        return bizFee;
    }

    /**
     * 设置属性商业电费合计
     * @param sumBizFee 待设置的属性商业电费合计的值
     */
    public void setSumBizFee(double sumBizFee){
        this.sumBizFee = sumBizFee;
    }

    /**
     * 获取属性商业电费合计
     * @return 属性商业电费合计的值
     */
    public double getSumBizFee(){
        return sumBizFee;
    }

    /**
     * 设置属性商业电金
     * @param bizDianJin 待设置的属性商业电金的值
     */
    public void setBizDianJin(double bizDianJin){
        this.bizDianJin = bizDianJin;
    }

    /**
     * 获取属性商业电金
     * @return 属性商业电金的值
     */
    public double getBizDianJin(){
        return bizDianJin;
    }

    /**
     * 设置属性商业三峡
     * @param bizSanXia 待设置的属性商业三峡的值
     */
    public void setBizSanXia(double bizSanXia){
        this.bizSanXia = bizSanXia;
    }

    /**
     * 获取属性商业三峡
     * @return 属性商业三峡的值
     */
    public double getBizSanXia(){
        return bizSanXia;
    }

    /**
     * 设置属性商业库区
     * @param bizKuQu 待设置的属性商业库区的值
     */
    public void setBizKuQu(double bizKuQu){
        this.bizKuQu = bizKuQu;
    }

    /**
     * 获取属性商业库区
     * @return 属性商业库区的值
     */
    public double getBizKuQu(){
        return bizKuQu;
    }

    /**
     * 设置属性商业基金
     * @param bizJiJin 待设置的属性商业基金的值
     */
    public void setBizJiJin(double bizJiJin){
        this.bizJiJin = bizJiJin;
    }

    /**
     * 获取属性商业基金
     * @return 属性商业基金的值
     */
    public double getBizJiJin(){
        return bizJiJin;
    }

    /**
     * 设置属性非工业、普通工业电量
     * @param industryQuantity 待设置的属性非工业、普通工业电量的值
     */
    public void setIndustryQuantity(double industryQuantity){
        this.industryQuantity = industryQuantity;
    }

    /**
     * 获取属性非工业、普通工业电量
     * @return 属性非工业、普通工业电量的值
     */
    public double getIndustryQuantity(){
        return industryQuantity;
    }

    /**
     * 设置属性非工业比例
     * @param industryScale 待设置的属性非工业比例的值
     */
    public void setIndustryScale(double industryScale){
        this.industryScale = industryScale;
    }

    /**
     * 获取属性非工业比例
     * @return 属性非工业比例的值
     */
    public double getIndustryScale(){
        return industryScale;
    }

    /**
     * 设置属性非工业电价
     * @param industryPrice 待设置的属性非工业电价的值
     */
    public void setIndustryPrice(double industryPrice){
        this.industryPrice = industryPrice;
    }

    /**
     * 获取属性非工业电价
     * @return 属性非工业电价的值
     */
    public double getIndustryPrice(){
        return industryPrice;
    }

    /**
     * 设置属性非工业电费
     * @param industryFee 待设置的属性非工业电费的值
     */
    public void setIndustryFee(double industryFee){
        this.industryFee = industryFee;
    }

    /**
     * 获取属性非工业电费
     * @return 属性非工业电费的值
     */
    public double getIndustryFee(){
        return industryFee;
    }

    /**
     * 设置属性非工业电费合计
     * @param sumIndustryFee 待设置的属性非工业电费合计的值
     */
    public void setSumIndustryFee(double sumIndustryFee){
        this.sumIndustryFee = sumIndustryFee;
    }

    /**
     * 获取属性非工业电费合计
     * @return 属性非工业电费合计的值
     */
    public double getSumIndustryFee(){
        return sumIndustryFee;
    }

    /**
     * 设置属性非工业电金
     * @param industryDianJin 待设置的属性非工业电金的值
     */
    public void setIndustryDianJin(double industryDianJin){
        this.industryDianJin = industryDianJin;
    }

    /**
     * 获取属性非工业电金
     * @return 属性非工业电金的值
     */
    public double getIndustryDianJin(){
        return industryDianJin;
    }

    /**
     * 设置属性非工业三峡
     * @param industrySanXia 待设置的属性非工业三峡的值
     */
    public void setIndustrySanXia(double industrySanXia){
        this.industrySanXia = industrySanXia;
    }

    /**
     * 获取属性非工业三峡
     * @return 属性非工业三峡的值
     */
    public double getIndustrySanXia(){
        return industrySanXia;
    }

    /**
     * 设置属性非工业库区
     * @param industryKuQu 待设置的属性非工业库区的值
     */
    public void setIndustryKuQu(double industryKuQu){
        this.industryKuQu = industryKuQu;
    }

    /**
     * 获取属性非工业库区
     * @return 属性非工业库区的值
     */
    public double getIndustryKuQu(){
        return industryKuQu;
    }

    /**
     * 设置属性非工业基金
     * @param industryJiJin 待设置的属性非工业基金的值
     */
    public void setIndustryJiJin(double industryJiJin){
        this.industryJiJin = industryJiJin;
    }

    /**
     * 获取属性非工业基金
     * @return 属性非工业基金的值
     */
    public double getIndustryJiJin(){
        return industryJiJin;
    }

    /**
     * 设置属性变损电量
     * @param tranferLossQuantity 待设置的属性变损电量的值
     */
    public void setTranferLossQuantity(long tranferLossQuantity){
        this.tranferLossQuantity = tranferLossQuantity;
    }

    /**
     * 获取属性变损电量
     * @return 属性变损电量的值
     */
    public long getTranferLossQuantity(){
        return tranferLossQuantity;
    }

    /**
     * 设置属性功率因数
     * @param rateCode 待设置的属性功率因数的值
     */
    public void setRateCode(double rateCode){
        this.rateCode = rateCode;
    }

    /**
     * 获取属性功率因数
     * @return 属性功率因数的值
     */
    public double getRateCode(){
        return rateCode;
    }

    /**
     * 设置属性调整值
     * @param adjustValue 待设置的属性调整值的值
     */
    public void setAdjustValue(double adjustValue){
        this.adjustValue = adjustValue;
    }

    /**
     * 获取属性调整值
     * @return 属性调整值的值
     */
    public double getAdjustValue(){
        return adjustValue;
    }

    /**
     * 设置属性力率电费
     * @param rateFee 待设置的属性力率电费的值
     */
    public void setRateFee(double rateFee){
        this.rateFee = rateFee;
    }

    /**
     * 获取属性力率电费
     * @return 属性力率电费的值
     */
    public double getRateFee(){
        return rateFee;
    }

    /**
     * 设置属性农业还贷资金
     * @param loan 待设置的属性农业还贷资金的值
     */
    public void setLoan(double loan){
        this.loan = loan;
    }

    /**
     * 获取属性农业还贷资金
     * @return 属性农业还贷资金的值
     */
    public double getLoan(){
        return loan;
    }

    /**
     * 设置属性三峡
     * @param sanXiaFee 待设置的属性三峡的值
     */
    public void setSanXiaFee(double sanXiaFee){
        this.sanXiaFee = sanXiaFee;
    }

    /**
     * 获取属性三峡
     * @return 属性三峡的值
     */
    public double getSanXiaFee(){
        return sanXiaFee;
    }

    /**
     * 设置属性可再生能源附加费
     * @param surcharge 待设置的属性可再生能源附加费的值
     */
    public void setSurcharge(double surcharge){
        this.surcharge = surcharge;
    }

    /**
     * 获取属性可再生能源附加费
     * @return 属性可再生能源附加费的值
     */
    public double getSurcharge(){
        return surcharge;
    }

    /**
     * 设置属性库区移民基金
     * @param migrationFee 待设置的属性库区移民基金的值
     */
    public void setMigrationFee(double migrationFee){
        this.migrationFee = migrationFee;
    }

    /**
     * 获取属性库区移民基金
     * @return 属性库区移民基金的值
     */
    public double getMigrationFee(){
        return migrationFee;
    }

    /**
     * 设置属性电量合计
     * @param sumQuantity 待设置的属性电量合计的值
     */
    public void setSumQuantity(double sumQuantity){
        this.sumQuantity = sumQuantity;
    }

    /**
     * 获取属性电量合计
     * @return 属性电量合计的值
     */
    public double getSumQuantity(){
        return sumQuantity;
    }

    /**
     * 设置属性电费合计
     * @param sumFee 待设置的属性电费合计的值
     */
    public void setSumFee(double sumFee){
        this.sumFee = sumFee;
    }

    /**
     * 获取属性电费合计
     * @return 属性电费合计的值
     */
    public double getSumFee(){
        return sumFee;
    }

    /**
     * 设置属性电金合计
     * @param sumDianJin 待设置的属性电金合计的值
     */
    public void setSumDianJin(double sumDianJin){
        this.sumDianJin = sumDianJin;
    }

    /**
     * 获取属性电金合计
     * @return 属性电金合计的值
     */
    public double getSumDianJin(){
        return sumDianJin;
    }

    /**
     * 设置属性三峡合计
     * @param sumSanXia 待设置的属性三峡合计的值
     */
    public void setSumSanXia(double sumSanXia){
        this.sumSanXia = sumSanXia;
    }

    /**
     * 获取属性三峡合计
     * @return 属性三峡合计的值
     */
    public double getSumSanXia(){
        return sumSanXia;
    }

    /**
     * 设置属性基金合计
     * @param sumJiJin 待设置的属性基金合计的值
     */
    public void setSumJiJin(double sumJiJin){
        this.sumJiJin = sumJiJin;
    }

    /**
     * 获取属性基金合计
     * @return 属性基金合计的值
     */
    public double getSumJiJin(){
        return sumJiJin;
    }

    /**
     * 设置属性是否有效
     * @param validStatus 待设置的属性是否有效的值
     */
    public void setValidStatus(String validStatus){
        this.validStatus = StringUtils.rightTrim(validStatus);
    }

    /**
     * 获取属性是否有效
     * @return 属性是否有效的值
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * 设置属性标志
     * @param flag 待设置的属性标志的值
     */
    public void setFlag(String flag){
        this.flag = StringUtils.rightTrim(flag);
    }

    /**
     * 获取属性标志
     * @return 属性标志的值
     */
    public String getFlag(){
        return flag;
    }

    /**
     * 设置属性注释
     * @param remark 待设置的属性注释的值
     */
    public void setRemark(String remark){
        this.remark = StringUtils.rightTrim(remark);
    }

    /**
     * 获取属性注释
     * @return 属性注释的值
     */
    public String getRemark(){
        return remark;
    }

    /**
     * 设置属性库区合计
     * @param sumKuQu 待设置的属性库区合计的值
     */
    public void setSumKuQu(double sumKuQu){
        this.sumKuQu = sumKuQu;
    }

    /**
     * 获取属性库区合计
     * @return 属性库区合计的值
     */
    public double getSumKuQu(){
        return sumKuQu;
    }

    /**
     * 设置属性录入日期
     * @param inputDate 待设置的属性录入日期的值
     */
    public void setInputDate(String inputDate){
        this.inputDate = StringUtils.rightTrim(inputDate);
    }

    /**
     * 获取属性录入日期
     * @return 属性录入日期的值
     */
    public String getInputDate(){
        return inputDate;
    }
}
