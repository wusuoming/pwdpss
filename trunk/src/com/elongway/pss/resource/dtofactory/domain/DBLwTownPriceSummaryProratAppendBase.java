package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownPriceSummaryProrateAppend-直供乡追加电费计算总表的数据访问对象基类<br>
 */
public class DBLwTownPriceSummaryProratAppendBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwTownPriceSummaryProratAppendBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownPriceSummaryProratAppendBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public void insert(LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwTownPriceSummaryProratAppend (");
        buffer.append("UserNo,");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("ElectricFee,");
        buffer.append("PeopleQuantity,");
        buffer.append("PeopleScale,");
        buffer.append("PeoplePrice,");
        buffer.append("PeopleFee,");
        buffer.append("SumPeopleFee,");
        buffer.append("PeopleDianJin,");
        buffer.append("PeopleFeeSanXia,");
        buffer.append("PeopleJiJin,");
        buffer.append("PeopleKuQu,");
        buffer.append("NotPeopleQuantity,");
        buffer.append("NotPeopleScale,");
        buffer.append("NotPeoplePrice,");
        buffer.append("NotPeopleFee,");
        buffer.append("SumNotPeopleFee,");
        buffer.append("NotPeopleDianJin,");
        buffer.append("NotPeopleFeeSanXia,");
        buffer.append("NotPeopleJiJin,");
        buffer.append("NotPeopleKuQu,");
        buffer.append("FarmQuantity,");
        buffer.append("FarmScale,");
        buffer.append("FarmPrice,");
        buffer.append("FarmFee,");
        buffer.append("SumFarmFee,");
        buffer.append("FarmDianJin,");
        buffer.append("FarmSanXia,");
        buffer.append("FarmJiJin,");
        buffer.append("FarmKuQu,");
        buffer.append("ProduceQuantity,");
        buffer.append("ProduceScale,");
        buffer.append("ProducePrice,");
        buffer.append("ProduceFee,");
        buffer.append("SumProduceFee,");
        buffer.append("ProduceDianJin,");
        buffer.append("ProduceSanXia,");
        buffer.append("ProduceKuQu,");
        buffer.append("ProduceJiJin,");
        buffer.append("BizQuantity,");
        buffer.append("BizScale,");
        buffer.append("BizPrice,");
        buffer.append("BizFee,");
        buffer.append("SumBizFee,");
        buffer.append("BizDianJin,");
        buffer.append("BizSanXia,");
        buffer.append("BizKuQu,");
        buffer.append("BizJiJin,");
        buffer.append("IndustryQuantity,");
        buffer.append("IndustryScale,");
        buffer.append("IndustryPrice,");
        buffer.append("IndustryFee,");
        buffer.append("SumIndustryFee,");
        buffer.append("IndustryDianJin,");
        buffer.append("IndustrySanXia,");
        buffer.append("IndustryKuQu,");
        buffer.append("IndustryJiJin,");
        buffer.append("TranferLossQuantity,");
        buffer.append("RateCode,");
        buffer.append("AdjustValue,");
        buffer.append("RateFee,");
        buffer.append("Loan,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("MigrationFee,");
        buffer.append("SumQuantity,");
        buffer.append("SumFee,");
        buffer.append("SumDianJin,");
        buffer.append("SumSanXia,");
        buffer.append("SumJiJin,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("SumKuQu,");
        buffer.append("InputDate ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwTownPriceSummaryProratAppendDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryProratAppendDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryProratAppendDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getElectricFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getPeopleQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getPeopleScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getPeopleDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getPeopleFeeSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getPeopleJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getPeopleKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getNotPeopleQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getNotPeopleScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getNotPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getNotPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumNotPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getNotPeopleDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getNotPeopleFeeSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getNotPeopleJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getNotPeopleKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getFarmQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getFarmScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getFarmPrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getFarmFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumFarmFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getFarmDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getFarmSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getFarmJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getFarmKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getProduceQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getProduceScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getProducePrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getProduceFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumProduceFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getProduceDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getProduceSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getProduceKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getProduceJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getBizQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getBizScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getBizPrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getBizFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumBizFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getBizDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getBizSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getBizKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getBizJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getIndustryQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getIndustryScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getIndustryPrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getIndustryFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumIndustryFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getIndustryDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getIndustrySanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getIndustryKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getIndustryJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getTranferLossQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getRateCode()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getAdjustValue()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getRateFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getLoan()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSanXiaFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSurcharge()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getMigrationFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumJiJin()).append(",");
            debugBuffer.append("'").append(lwTownPriceSummaryProratAppendDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryProratAppendDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryProratAppendDto.getRemark()).append("',");
            debugBuffer.append("").append(lwTownPriceSummaryProratAppendDto.getSumKuQu()).append(",");
            debugBuffer.append("'").append(lwTownPriceSummaryProratAppendDto.getInputDate()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwTownPriceSummaryProratAppendDto.getUserNo());
        dbManager.setString(2,lwTownPriceSummaryProratAppendDto.getLineCode());
        dbManager.setString(3,lwTownPriceSummaryProratAppendDto.getStatMonth());
        dbManager.setDouble(4,lwTownPriceSummaryProratAppendDto.getElectricFee());
        dbManager.setDouble(5,lwTownPriceSummaryProratAppendDto.getPeopleQuantity());
        dbManager.setDouble(6,lwTownPriceSummaryProratAppendDto.getPeopleScale());
        dbManager.setDouble(7,lwTownPriceSummaryProratAppendDto.getPeoplePrice());
        dbManager.setDouble(8,lwTownPriceSummaryProratAppendDto.getPeopleFee());
        dbManager.setDouble(9,lwTownPriceSummaryProratAppendDto.getSumPeopleFee());
        dbManager.setDouble(10,lwTownPriceSummaryProratAppendDto.getPeopleDianJin());
        dbManager.setDouble(11,lwTownPriceSummaryProratAppendDto.getPeopleFeeSanXia());
        dbManager.setDouble(12,lwTownPriceSummaryProratAppendDto.getPeopleJiJin());
        dbManager.setDouble(13,lwTownPriceSummaryProratAppendDto.getPeopleKuQu());
        dbManager.setDouble(14,lwTownPriceSummaryProratAppendDto.getNotPeopleQuantity());
        dbManager.setDouble(15,lwTownPriceSummaryProratAppendDto.getNotPeopleScale());
        dbManager.setDouble(16,lwTownPriceSummaryProratAppendDto.getNotPeoplePrice());
        dbManager.setDouble(17,lwTownPriceSummaryProratAppendDto.getNotPeopleFee());
        dbManager.setDouble(18,lwTownPriceSummaryProratAppendDto.getSumNotPeopleFee());
        dbManager.setDouble(19,lwTownPriceSummaryProratAppendDto.getNotPeopleDianJin());
        dbManager.setDouble(20,lwTownPriceSummaryProratAppendDto.getNotPeopleFeeSanXia());
        dbManager.setDouble(21,lwTownPriceSummaryProratAppendDto.getNotPeopleJiJin());
        dbManager.setDouble(22,lwTownPriceSummaryProratAppendDto.getNotPeopleKuQu());
        dbManager.setDouble(23,lwTownPriceSummaryProratAppendDto.getFarmQuantity());
        dbManager.setDouble(24,lwTownPriceSummaryProratAppendDto.getFarmScale());
        dbManager.setDouble(25,lwTownPriceSummaryProratAppendDto.getFarmPrice());
        dbManager.setDouble(26,lwTownPriceSummaryProratAppendDto.getFarmFee());
        dbManager.setDouble(27,lwTownPriceSummaryProratAppendDto.getSumFarmFee());
        dbManager.setDouble(28,lwTownPriceSummaryProratAppendDto.getFarmDianJin());
        dbManager.setDouble(29,lwTownPriceSummaryProratAppendDto.getFarmSanXia());
        dbManager.setDouble(30,lwTownPriceSummaryProratAppendDto.getFarmJiJin());
        dbManager.setDouble(31,lwTownPriceSummaryProratAppendDto.getFarmKuQu());
        dbManager.setDouble(32,lwTownPriceSummaryProratAppendDto.getProduceQuantity());
        dbManager.setDouble(33,lwTownPriceSummaryProratAppendDto.getProduceScale());
        dbManager.setDouble(34,lwTownPriceSummaryProratAppendDto.getProducePrice());
        dbManager.setDouble(35,lwTownPriceSummaryProratAppendDto.getProduceFee());
        dbManager.setDouble(36,lwTownPriceSummaryProratAppendDto.getSumProduceFee());
        dbManager.setDouble(37,lwTownPriceSummaryProratAppendDto.getProduceDianJin());
        dbManager.setDouble(38,lwTownPriceSummaryProratAppendDto.getProduceSanXia());
        dbManager.setDouble(39,lwTownPriceSummaryProratAppendDto.getProduceKuQu());
        dbManager.setDouble(40,lwTownPriceSummaryProratAppendDto.getProduceJiJin());
        dbManager.setDouble(41,lwTownPriceSummaryProratAppendDto.getBizQuantity());
        dbManager.setDouble(42,lwTownPriceSummaryProratAppendDto.getBizScale());
        dbManager.setDouble(43,lwTownPriceSummaryProratAppendDto.getBizPrice());
        dbManager.setDouble(44,lwTownPriceSummaryProratAppendDto.getBizFee());
        dbManager.setDouble(45,lwTownPriceSummaryProratAppendDto.getSumBizFee());
        dbManager.setDouble(46,lwTownPriceSummaryProratAppendDto.getBizDianJin());
        dbManager.setDouble(47,lwTownPriceSummaryProratAppendDto.getBizSanXia());
        dbManager.setDouble(48,lwTownPriceSummaryProratAppendDto.getBizKuQu());
        dbManager.setDouble(49,lwTownPriceSummaryProratAppendDto.getBizJiJin());
        dbManager.setDouble(50,lwTownPriceSummaryProratAppendDto.getIndustryQuantity());
        dbManager.setDouble(51,lwTownPriceSummaryProratAppendDto.getIndustryScale());
        dbManager.setDouble(52,lwTownPriceSummaryProratAppendDto.getIndustryPrice());
        dbManager.setDouble(53,lwTownPriceSummaryProratAppendDto.getIndustryFee());
        dbManager.setDouble(54,lwTownPriceSummaryProratAppendDto.getSumIndustryFee());
        dbManager.setDouble(55,lwTownPriceSummaryProratAppendDto.getIndustryDianJin());
        dbManager.setDouble(56,lwTownPriceSummaryProratAppendDto.getIndustrySanXia());
        dbManager.setDouble(57,lwTownPriceSummaryProratAppendDto.getIndustryKuQu());
        dbManager.setDouble(58,lwTownPriceSummaryProratAppendDto.getIndustryJiJin());
        dbManager.setLong(59,lwTownPriceSummaryProratAppendDto.getTranferLossQuantity());
        dbManager.setDouble(60,lwTownPriceSummaryProratAppendDto.getRateCode());
        dbManager.setDouble(61,lwTownPriceSummaryProratAppendDto.getAdjustValue());
        dbManager.setDouble(62,lwTownPriceSummaryProratAppendDto.getRateFee());
        dbManager.setDouble(63,lwTownPriceSummaryProratAppendDto.getLoan());
        dbManager.setDouble(64,lwTownPriceSummaryProratAppendDto.getSanXiaFee());
        dbManager.setDouble(65,lwTownPriceSummaryProratAppendDto.getSurcharge());
        dbManager.setDouble(66,lwTownPriceSummaryProratAppendDto.getMigrationFee());
        dbManager.setDouble(67,lwTownPriceSummaryProratAppendDto.getSumQuantity());
        dbManager.setDouble(68,lwTownPriceSummaryProratAppendDto.getSumFee());
        dbManager.setDouble(69,lwTownPriceSummaryProratAppendDto.getSumDianJin());
        dbManager.setDouble(70,lwTownPriceSummaryProratAppendDto.getSumSanXia());
        dbManager.setDouble(71,lwTownPriceSummaryProratAppendDto.getSumJiJin());
        dbManager.setString(72,lwTownPriceSummaryProratAppendDto.getValidStatus());
        dbManager.setString(73,lwTownPriceSummaryProratAppendDto.getFlag());
        dbManager.setString(74,lwTownPriceSummaryProratAppendDto.getRemark());
        dbManager.setDouble(75,lwTownPriceSummaryProratAppendDto.getSumKuQu());
        dbManager.setString(76,lwTownPriceSummaryProratAppendDto.getInputDate());
        dbManager.executePreparedUpdate();

    }

    /**
     * 采用批方式插入多条数据
     * @param collection collection
     * @throws Exception
     */
    public void insertAll(Collection collection)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwTownPriceSummaryProratAppend (");
        buffer.append("UserNo,");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("ElectricFee,");
        buffer.append("PeopleQuantity,");
        buffer.append("PeopleScale,");
        buffer.append("PeoplePrice,");
        buffer.append("PeopleFee,");
        buffer.append("SumPeopleFee,");
        buffer.append("PeopleDianJin,");
        buffer.append("PeopleFeeSanXia,");
        buffer.append("PeopleJiJin,");
        buffer.append("PeopleKuQu,");
        buffer.append("NotPeopleQuantity,");
        buffer.append("NotPeopleScale,");
        buffer.append("NotPeoplePrice,");
        buffer.append("NotPeopleFee,");
        buffer.append("SumNotPeopleFee,");
        buffer.append("NotPeopleDianJin,");
        buffer.append("NotPeopleFeeSanXia,");
        buffer.append("NotPeopleJiJin,");
        buffer.append("NotPeopleKuQu,");
        buffer.append("FarmQuantity,");
        buffer.append("FarmScale,");
        buffer.append("FarmPrice,");
        buffer.append("FarmFee,");
        buffer.append("SumFarmFee,");
        buffer.append("FarmDianJin,");
        buffer.append("FarmSanXia,");
        buffer.append("FarmJiJin,");
        buffer.append("FarmKuQu,");
        buffer.append("ProduceQuantity,");
        buffer.append("ProduceScale,");
        buffer.append("ProducePrice,");
        buffer.append("ProduceFee,");
        buffer.append("SumProduceFee,");
        buffer.append("ProduceDianJin,");
        buffer.append("ProduceSanXia,");
        buffer.append("ProduceKuQu,");
        buffer.append("ProduceJiJin,");
        buffer.append("BizQuantity,");
        buffer.append("BizScale,");
        buffer.append("BizPrice,");
        buffer.append("BizFee,");
        buffer.append("SumBizFee,");
        buffer.append("BizDianJin,");
        buffer.append("BizSanXia,");
        buffer.append("BizKuQu,");
        buffer.append("BizJiJin,");
        buffer.append("IndustryQuantity,");
        buffer.append("IndustryScale,");
        buffer.append("IndustryPrice,");
        buffer.append("IndustryFee,");
        buffer.append("SumIndustryFee,");
        buffer.append("IndustryDianJin,");
        buffer.append("IndustrySanXia,");
        buffer.append("IndustryKuQu,");
        buffer.append("IndustryJiJin,");
        buffer.append("TranferLossQuantity,");
        buffer.append("RateCode,");
        buffer.append("AdjustValue,");
        buffer.append("RateFee,");
        buffer.append("Loan,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("MigrationFee,");
        buffer.append("SumQuantity,");
        buffer.append("SumFee,");
        buffer.append("SumDianJin,");
        buffer.append("SumSanXia,");
        buffer.append("SumJiJin,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("SumKuQu,");
        buffer.append("InputDate ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto = (LwTownPriceSummaryProratAppendDto)i.next();
            dbManager.setString(1,lwTownPriceSummaryProratAppendDto.getUserNo());
            dbManager.setString(2,lwTownPriceSummaryProratAppendDto.getLineCode());
            dbManager.setString(3,lwTownPriceSummaryProratAppendDto.getStatMonth());
            dbManager.setDouble(4,lwTownPriceSummaryProratAppendDto.getElectricFee());
            dbManager.setDouble(5,lwTownPriceSummaryProratAppendDto.getPeopleQuantity());
            dbManager.setDouble(6,lwTownPriceSummaryProratAppendDto.getPeopleScale());
            dbManager.setDouble(7,lwTownPriceSummaryProratAppendDto.getPeoplePrice());
            dbManager.setDouble(8,lwTownPriceSummaryProratAppendDto.getPeopleFee());
            dbManager.setDouble(9,lwTownPriceSummaryProratAppendDto.getSumPeopleFee());
            dbManager.setDouble(10,lwTownPriceSummaryProratAppendDto.getPeopleDianJin());
            dbManager.setDouble(11,lwTownPriceSummaryProratAppendDto.getPeopleFeeSanXia());
            dbManager.setDouble(12,lwTownPriceSummaryProratAppendDto.getPeopleJiJin());
            dbManager.setDouble(13,lwTownPriceSummaryProratAppendDto.getPeopleKuQu());
            dbManager.setDouble(14,lwTownPriceSummaryProratAppendDto.getNotPeopleQuantity());
            dbManager.setDouble(15,lwTownPriceSummaryProratAppendDto.getNotPeopleScale());
            dbManager.setDouble(16,lwTownPriceSummaryProratAppendDto.getNotPeoplePrice());
            dbManager.setDouble(17,lwTownPriceSummaryProratAppendDto.getNotPeopleFee());
            dbManager.setDouble(18,lwTownPriceSummaryProratAppendDto.getSumNotPeopleFee());
            dbManager.setDouble(19,lwTownPriceSummaryProratAppendDto.getNotPeopleDianJin());
            dbManager.setDouble(20,lwTownPriceSummaryProratAppendDto.getNotPeopleFeeSanXia());
            dbManager.setDouble(21,lwTownPriceSummaryProratAppendDto.getNotPeopleJiJin());
            dbManager.setDouble(22,lwTownPriceSummaryProratAppendDto.getNotPeopleKuQu());
            dbManager.setDouble(23,lwTownPriceSummaryProratAppendDto.getFarmQuantity());
            dbManager.setDouble(24,lwTownPriceSummaryProratAppendDto.getFarmScale());
            dbManager.setDouble(25,lwTownPriceSummaryProratAppendDto.getFarmPrice());
            dbManager.setDouble(26,lwTownPriceSummaryProratAppendDto.getFarmFee());
            dbManager.setDouble(27,lwTownPriceSummaryProratAppendDto.getSumFarmFee());
            dbManager.setDouble(28,lwTownPriceSummaryProratAppendDto.getFarmDianJin());
            dbManager.setDouble(29,lwTownPriceSummaryProratAppendDto.getFarmSanXia());
            dbManager.setDouble(30,lwTownPriceSummaryProratAppendDto.getFarmJiJin());
            dbManager.setDouble(31,lwTownPriceSummaryProratAppendDto.getFarmKuQu());
            dbManager.setDouble(32,lwTownPriceSummaryProratAppendDto.getProduceQuantity());
            dbManager.setDouble(33,lwTownPriceSummaryProratAppendDto.getProduceScale());
            dbManager.setDouble(34,lwTownPriceSummaryProratAppendDto.getProducePrice());
            dbManager.setDouble(35,lwTownPriceSummaryProratAppendDto.getProduceFee());
            dbManager.setDouble(36,lwTownPriceSummaryProratAppendDto.getSumProduceFee());
            dbManager.setDouble(37,lwTownPriceSummaryProratAppendDto.getProduceDianJin());
            dbManager.setDouble(38,lwTownPriceSummaryProratAppendDto.getProduceSanXia());
            dbManager.setDouble(39,lwTownPriceSummaryProratAppendDto.getProduceKuQu());
            dbManager.setDouble(40,lwTownPriceSummaryProratAppendDto.getProduceJiJin());
            dbManager.setDouble(41,lwTownPriceSummaryProratAppendDto.getBizQuantity());
            dbManager.setDouble(42,lwTownPriceSummaryProratAppendDto.getBizScale());
            dbManager.setDouble(43,lwTownPriceSummaryProratAppendDto.getBizPrice());
            dbManager.setDouble(44,lwTownPriceSummaryProratAppendDto.getBizFee());
            dbManager.setDouble(45,lwTownPriceSummaryProratAppendDto.getSumBizFee());
            dbManager.setDouble(46,lwTownPriceSummaryProratAppendDto.getBizDianJin());
            dbManager.setDouble(47,lwTownPriceSummaryProratAppendDto.getBizSanXia());
            dbManager.setDouble(48,lwTownPriceSummaryProratAppendDto.getBizKuQu());
            dbManager.setDouble(49,lwTownPriceSummaryProratAppendDto.getBizJiJin());
            dbManager.setDouble(50,lwTownPriceSummaryProratAppendDto.getIndustryQuantity());
            dbManager.setDouble(51,lwTownPriceSummaryProratAppendDto.getIndustryScale());
            dbManager.setDouble(52,lwTownPriceSummaryProratAppendDto.getIndustryPrice());
            dbManager.setDouble(53,lwTownPriceSummaryProratAppendDto.getIndustryFee());
            dbManager.setDouble(54,lwTownPriceSummaryProratAppendDto.getSumIndustryFee());
            dbManager.setDouble(55,lwTownPriceSummaryProratAppendDto.getIndustryDianJin());
            dbManager.setDouble(56,lwTownPriceSummaryProratAppendDto.getIndustrySanXia());
            dbManager.setDouble(57,lwTownPriceSummaryProratAppendDto.getIndustryKuQu());
            dbManager.setDouble(58,lwTownPriceSummaryProratAppendDto.getIndustryJiJin());
            dbManager.setLong(59,lwTownPriceSummaryProratAppendDto.getTranferLossQuantity());
            dbManager.setDouble(60,lwTownPriceSummaryProratAppendDto.getRateCode());
            dbManager.setDouble(61,lwTownPriceSummaryProratAppendDto.getAdjustValue());
            dbManager.setDouble(62,lwTownPriceSummaryProratAppendDto.getRateFee());
            dbManager.setDouble(63,lwTownPriceSummaryProratAppendDto.getLoan());
            dbManager.setDouble(64,lwTownPriceSummaryProratAppendDto.getSanXiaFee());
            dbManager.setDouble(65,lwTownPriceSummaryProratAppendDto.getSurcharge());
            dbManager.setDouble(66,lwTownPriceSummaryProratAppendDto.getMigrationFee());
            dbManager.setDouble(67,lwTownPriceSummaryProratAppendDto.getSumQuantity());
            dbManager.setDouble(68,lwTownPriceSummaryProratAppendDto.getSumFee());
            dbManager.setDouble(69,lwTownPriceSummaryProratAppendDto.getSumDianJin());
            dbManager.setDouble(70,lwTownPriceSummaryProratAppendDto.getSumSanXia());
            dbManager.setDouble(71,lwTownPriceSummaryProratAppendDto.getSumJiJin());
            dbManager.setString(72,lwTownPriceSummaryProratAppendDto.getValidStatus());
            dbManager.setString(73,lwTownPriceSummaryProratAppendDto.getFlag());
            dbManager.setString(74,lwTownPriceSummaryProratAppendDto.getRemark());
            dbManager.setDouble(75,lwTownPriceSummaryProratAppendDto.getSumKuQu());
            dbManager.setString(76,lwTownPriceSummaryProratAppendDto.getInputDate());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userNo 户号
     * @param statMonth 统计年月
     * @throws Exception
     */
    public void delete(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwTownPriceSummaryProratAppend ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        dbManager.setString(2,statMonth);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public void update(LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwTownPriceSummaryProratAppend SET ");
        buffer.append("LineCode = ?, ");
        buffer.append("ElectricFee = ?, ");
        buffer.append("PeopleQuantity = ?, ");
        buffer.append("PeopleScale = ?, ");
        buffer.append("PeoplePrice = ?, ");
        buffer.append("PeopleFee = ?, ");
        buffer.append("SumPeopleFee = ?, ");
        buffer.append("PeopleDianJin = ?, ");
        buffer.append("PeopleFeeSanXia = ?, ");
        buffer.append("PeopleJiJin = ?, ");
        buffer.append("PeopleKuQu = ?, ");
        buffer.append("NotPeopleQuantity = ?, ");
        buffer.append("NotPeopleScale = ?, ");
        buffer.append("NotPeoplePrice = ?, ");
        buffer.append("NotPeopleFee = ?, ");
        buffer.append("SumNotPeopleFee = ?, ");
        buffer.append("NotPeopleDianJin = ?, ");
        buffer.append("NotPeopleFeeSanXia = ?, ");
        buffer.append("NotPeopleJiJin = ?, ");
        buffer.append("NotPeopleKuQu = ?, ");
        buffer.append("FarmQuantity = ?, ");
        buffer.append("FarmScale = ?, ");
        buffer.append("FarmPrice = ?, ");
        buffer.append("FarmFee = ?, ");
        buffer.append("SumFarmFee = ?, ");
        buffer.append("FarmDianJin = ?, ");
        buffer.append("FarmSanXia = ?, ");
        buffer.append("FarmJiJin = ?, ");
        buffer.append("FarmKuQu = ?, ");
        buffer.append("ProduceQuantity = ?, ");
        buffer.append("ProduceScale = ?, ");
        buffer.append("ProducePrice = ?, ");
        buffer.append("ProduceFee = ?, ");
        buffer.append("SumProduceFee = ?, ");
        buffer.append("ProduceDianJin = ?, ");
        buffer.append("ProduceSanXia = ?, ");
        buffer.append("ProduceKuQu = ?, ");
        buffer.append("ProduceJiJin = ?, ");
        buffer.append("BizQuantity = ?, ");
        buffer.append("BizScale = ?, ");
        buffer.append("BizPrice = ?, ");
        buffer.append("BizFee = ?, ");
        buffer.append("SumBizFee = ?, ");
        buffer.append("BizDianJin = ?, ");
        buffer.append("BizSanXia = ?, ");
        buffer.append("BizKuQu = ?, ");
        buffer.append("BizJiJin = ?, ");
        buffer.append("IndustryQuantity = ?, ");
        buffer.append("IndustryScale = ?, ");
        buffer.append("IndustryPrice = ?, ");
        buffer.append("IndustryFee = ?, ");
        buffer.append("SumIndustryFee = ?, ");
        buffer.append("IndustryDianJin = ?, ");
        buffer.append("IndustrySanXia = ?, ");
        buffer.append("IndustryKuQu = ?, ");
        buffer.append("IndustryJiJin = ?, ");
        buffer.append("TranferLossQuantity = ?, ");
        buffer.append("RateCode = ?, ");
        buffer.append("AdjustValue = ?, ");
        buffer.append("RateFee = ?, ");
        buffer.append("Loan = ?, ");
        buffer.append("SanXiaFee = ?, ");
        buffer.append("Surcharge = ?, ");
        buffer.append("MigrationFee = ?, ");
        buffer.append("SumQuantity = ?, ");
        buffer.append("SumFee = ?, ");
        buffer.append("SumDianJin = ?, ");
        buffer.append("SumSanXia = ?, ");
        buffer.append("SumJiJin = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("SumKuQu = ?, ");
        buffer.append("InputDate = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwTownPriceSummaryProratAppend SET ");
            debugBuffer.append("LineCode = '" + lwTownPriceSummaryProratAppendDto.getLineCode() + "', ");
            debugBuffer.append("ElectricFee = " + lwTownPriceSummaryProratAppendDto.getElectricFee() + ", ");
            debugBuffer.append("PeopleQuantity = " + lwTownPriceSummaryProratAppendDto.getPeopleQuantity() + ", ");
            debugBuffer.append("PeopleScale = " + lwTownPriceSummaryProratAppendDto.getPeopleScale() + ", ");
            debugBuffer.append("PeoplePrice = " + lwTownPriceSummaryProratAppendDto.getPeoplePrice() + ", ");
            debugBuffer.append("PeopleFee = " + lwTownPriceSummaryProratAppendDto.getPeopleFee() + ", ");
            debugBuffer.append("SumPeopleFee = " + lwTownPriceSummaryProratAppendDto.getSumPeopleFee() + ", ");
            debugBuffer.append("PeopleDianJin = " + lwTownPriceSummaryProratAppendDto.getPeopleDianJin() + ", ");
            debugBuffer.append("PeopleFeeSanXia = " + lwTownPriceSummaryProratAppendDto.getPeopleFeeSanXia() + ", ");
            debugBuffer.append("PeopleJiJin = " + lwTownPriceSummaryProratAppendDto.getPeopleJiJin() + ", ");
            debugBuffer.append("PeopleKuQu = " + lwTownPriceSummaryProratAppendDto.getPeopleKuQu() + ", ");
            debugBuffer.append("NotPeopleQuantity = " + lwTownPriceSummaryProratAppendDto.getNotPeopleQuantity() + ", ");
            debugBuffer.append("NotPeopleScale = " + lwTownPriceSummaryProratAppendDto.getNotPeopleScale() + ", ");
            debugBuffer.append("NotPeoplePrice = " + lwTownPriceSummaryProratAppendDto.getNotPeoplePrice() + ", ");
            debugBuffer.append("NotPeopleFee = " + lwTownPriceSummaryProratAppendDto.getNotPeopleFee() + ", ");
            debugBuffer.append("SumNotPeopleFee = " + lwTownPriceSummaryProratAppendDto.getSumNotPeopleFee() + ", ");
            debugBuffer.append("NotPeopleDianJin = " + lwTownPriceSummaryProratAppendDto.getNotPeopleDianJin() + ", ");
            debugBuffer.append("NotPeopleFeeSanXia = " + lwTownPriceSummaryProratAppendDto.getNotPeopleFeeSanXia() + ", ");
            debugBuffer.append("NotPeopleJiJin = " + lwTownPriceSummaryProratAppendDto.getNotPeopleJiJin() + ", ");
            debugBuffer.append("NotPeopleKuQu = " + lwTownPriceSummaryProratAppendDto.getNotPeopleKuQu() + ", ");
            debugBuffer.append("FarmQuantity = " + lwTownPriceSummaryProratAppendDto.getFarmQuantity() + ", ");
            debugBuffer.append("FarmScale = " + lwTownPriceSummaryProratAppendDto.getFarmScale() + ", ");
            debugBuffer.append("FarmPrice = " + lwTownPriceSummaryProratAppendDto.getFarmPrice() + ", ");
            debugBuffer.append("FarmFee = " + lwTownPriceSummaryProratAppendDto.getFarmFee() + ", ");
            debugBuffer.append("SumFarmFee = " + lwTownPriceSummaryProratAppendDto.getSumFarmFee() + ", ");
            debugBuffer.append("FarmDianJin = " + lwTownPriceSummaryProratAppendDto.getFarmDianJin() + ", ");
            debugBuffer.append("FarmSanXia = " + lwTownPriceSummaryProratAppendDto.getFarmSanXia() + ", ");
            debugBuffer.append("FarmJiJin = " + lwTownPriceSummaryProratAppendDto.getFarmJiJin() + ", ");
            debugBuffer.append("FarmKuQu = " + lwTownPriceSummaryProratAppendDto.getFarmKuQu() + ", ");
            debugBuffer.append("ProduceQuantity = " + lwTownPriceSummaryProratAppendDto.getProduceQuantity() + ", ");
            debugBuffer.append("ProduceScale = " + lwTownPriceSummaryProratAppendDto.getProduceScale() + ", ");
            debugBuffer.append("ProducePrice = " + lwTownPriceSummaryProratAppendDto.getProducePrice() + ", ");
            debugBuffer.append("ProduceFee = " + lwTownPriceSummaryProratAppendDto.getProduceFee() + ", ");
            debugBuffer.append("SumProduceFee = " + lwTownPriceSummaryProratAppendDto.getSumProduceFee() + ", ");
            debugBuffer.append("ProduceDianJin = " + lwTownPriceSummaryProratAppendDto.getProduceDianJin() + ", ");
            debugBuffer.append("ProduceSanXia = " + lwTownPriceSummaryProratAppendDto.getProduceSanXia() + ", ");
            debugBuffer.append("ProduceKuQu = " + lwTownPriceSummaryProratAppendDto.getProduceKuQu() + ", ");
            debugBuffer.append("ProduceJiJin = " + lwTownPriceSummaryProratAppendDto.getProduceJiJin() + ", ");
            debugBuffer.append("BizQuantity = " + lwTownPriceSummaryProratAppendDto.getBizQuantity() + ", ");
            debugBuffer.append("BizScale = " + lwTownPriceSummaryProratAppendDto.getBizScale() + ", ");
            debugBuffer.append("BizPrice = " + lwTownPriceSummaryProratAppendDto.getBizPrice() + ", ");
            debugBuffer.append("BizFee = " + lwTownPriceSummaryProratAppendDto.getBizFee() + ", ");
            debugBuffer.append("SumBizFee = " + lwTownPriceSummaryProratAppendDto.getSumBizFee() + ", ");
            debugBuffer.append("BizDianJin = " + lwTownPriceSummaryProratAppendDto.getBizDianJin() + ", ");
            debugBuffer.append("BizSanXia = " + lwTownPriceSummaryProratAppendDto.getBizSanXia() + ", ");
            debugBuffer.append("BizKuQu = " + lwTownPriceSummaryProratAppendDto.getBizKuQu() + ", ");
            debugBuffer.append("BizJiJin = " + lwTownPriceSummaryProratAppendDto.getBizJiJin() + ", ");
            debugBuffer.append("IndustryQuantity = " + lwTownPriceSummaryProratAppendDto.getIndustryQuantity() + ", ");
            debugBuffer.append("IndustryScale = " + lwTownPriceSummaryProratAppendDto.getIndustryScale() + ", ");
            debugBuffer.append("IndustryPrice = " + lwTownPriceSummaryProratAppendDto.getIndustryPrice() + ", ");
            debugBuffer.append("IndustryFee = " + lwTownPriceSummaryProratAppendDto.getIndustryFee() + ", ");
            debugBuffer.append("SumIndustryFee = " + lwTownPriceSummaryProratAppendDto.getSumIndustryFee() + ", ");
            debugBuffer.append("IndustryDianJin = " + lwTownPriceSummaryProratAppendDto.getIndustryDianJin() + ", ");
            debugBuffer.append("IndustrySanXia = " + lwTownPriceSummaryProratAppendDto.getIndustrySanXia() + ", ");
            debugBuffer.append("IndustryKuQu = " + lwTownPriceSummaryProratAppendDto.getIndustryKuQu() + ", ");
            debugBuffer.append("IndustryJiJin = " + lwTownPriceSummaryProratAppendDto.getIndustryJiJin() + ", ");
            debugBuffer.append("TranferLossQuantity = " + lwTownPriceSummaryProratAppendDto.getTranferLossQuantity() + ", ");
            debugBuffer.append("RateCode = " + lwTownPriceSummaryProratAppendDto.getRateCode() + ", ");
            debugBuffer.append("AdjustValue = " + lwTownPriceSummaryProratAppendDto.getAdjustValue() + ", ");
            debugBuffer.append("RateFee = " + lwTownPriceSummaryProratAppendDto.getRateFee() + ", ");
            debugBuffer.append("Loan = " + lwTownPriceSummaryProratAppendDto.getLoan() + ", ");
            debugBuffer.append("SanXiaFee = " + lwTownPriceSummaryProratAppendDto.getSanXiaFee() + ", ");
            debugBuffer.append("Surcharge = " + lwTownPriceSummaryProratAppendDto.getSurcharge() + ", ");
            debugBuffer.append("MigrationFee = " + lwTownPriceSummaryProratAppendDto.getMigrationFee() + ", ");
            debugBuffer.append("SumQuantity = " + lwTownPriceSummaryProratAppendDto.getSumQuantity() + ", ");
            debugBuffer.append("SumFee = " + lwTownPriceSummaryProratAppendDto.getSumFee() + ", ");
            debugBuffer.append("SumDianJin = " + lwTownPriceSummaryProratAppendDto.getSumDianJin() + ", ");
            debugBuffer.append("SumSanXia = " + lwTownPriceSummaryProratAppendDto.getSumSanXia() + ", ");
            debugBuffer.append("SumJiJin = " + lwTownPriceSummaryProratAppendDto.getSumJiJin() + ", ");
            debugBuffer.append("ValidStatus = '" + lwTownPriceSummaryProratAppendDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwTownPriceSummaryProratAppendDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwTownPriceSummaryProratAppendDto.getRemark() + "', ");
            debugBuffer.append("SumKuQu = " + lwTownPriceSummaryProratAppendDto.getSumKuQu() + ", ");
            debugBuffer.append("InputDate = '" + lwTownPriceSummaryProratAppendDto.getInputDate() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwTownPriceSummaryProratAppendDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwTownPriceSummaryProratAppendDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwTownPriceSummaryProratAppendDto.getLineCode());
        dbManager.setDouble(2,lwTownPriceSummaryProratAppendDto.getElectricFee());
        dbManager.setDouble(3,lwTownPriceSummaryProratAppendDto.getPeopleQuantity());
        dbManager.setDouble(4,lwTownPriceSummaryProratAppendDto.getPeopleScale());
        dbManager.setDouble(5,lwTownPriceSummaryProratAppendDto.getPeoplePrice());
        dbManager.setDouble(6,lwTownPriceSummaryProratAppendDto.getPeopleFee());
        dbManager.setDouble(7,lwTownPriceSummaryProratAppendDto.getSumPeopleFee());
        dbManager.setDouble(8,lwTownPriceSummaryProratAppendDto.getPeopleDianJin());
        dbManager.setDouble(9,lwTownPriceSummaryProratAppendDto.getPeopleFeeSanXia());
        dbManager.setDouble(10,lwTownPriceSummaryProratAppendDto.getPeopleJiJin());
        dbManager.setDouble(11,lwTownPriceSummaryProratAppendDto.getPeopleKuQu());
        dbManager.setDouble(12,lwTownPriceSummaryProratAppendDto.getNotPeopleQuantity());
        dbManager.setDouble(13,lwTownPriceSummaryProratAppendDto.getNotPeopleScale());
        dbManager.setDouble(14,lwTownPriceSummaryProratAppendDto.getNotPeoplePrice());
        dbManager.setDouble(15,lwTownPriceSummaryProratAppendDto.getNotPeopleFee());
        dbManager.setDouble(16,lwTownPriceSummaryProratAppendDto.getSumNotPeopleFee());
        dbManager.setDouble(17,lwTownPriceSummaryProratAppendDto.getNotPeopleDianJin());
        dbManager.setDouble(18,lwTownPriceSummaryProratAppendDto.getNotPeopleFeeSanXia());
        dbManager.setDouble(19,lwTownPriceSummaryProratAppendDto.getNotPeopleJiJin());
        dbManager.setDouble(20,lwTownPriceSummaryProratAppendDto.getNotPeopleKuQu());
        dbManager.setDouble(21,lwTownPriceSummaryProratAppendDto.getFarmQuantity());
        dbManager.setDouble(22,lwTownPriceSummaryProratAppendDto.getFarmScale());
        dbManager.setDouble(23,lwTownPriceSummaryProratAppendDto.getFarmPrice());
        dbManager.setDouble(24,lwTownPriceSummaryProratAppendDto.getFarmFee());
        dbManager.setDouble(25,lwTownPriceSummaryProratAppendDto.getSumFarmFee());
        dbManager.setDouble(26,lwTownPriceSummaryProratAppendDto.getFarmDianJin());
        dbManager.setDouble(27,lwTownPriceSummaryProratAppendDto.getFarmSanXia());
        dbManager.setDouble(28,lwTownPriceSummaryProratAppendDto.getFarmJiJin());
        dbManager.setDouble(29,lwTownPriceSummaryProratAppendDto.getFarmKuQu());
        dbManager.setDouble(30,lwTownPriceSummaryProratAppendDto.getProduceQuantity());
        dbManager.setDouble(31,lwTownPriceSummaryProratAppendDto.getProduceScale());
        dbManager.setDouble(32,lwTownPriceSummaryProratAppendDto.getProducePrice());
        dbManager.setDouble(33,lwTownPriceSummaryProratAppendDto.getProduceFee());
        dbManager.setDouble(34,lwTownPriceSummaryProratAppendDto.getSumProduceFee());
        dbManager.setDouble(35,lwTownPriceSummaryProratAppendDto.getProduceDianJin());
        dbManager.setDouble(36,lwTownPriceSummaryProratAppendDto.getProduceSanXia());
        dbManager.setDouble(37,lwTownPriceSummaryProratAppendDto.getProduceKuQu());
        dbManager.setDouble(38,lwTownPriceSummaryProratAppendDto.getProduceJiJin());
        dbManager.setDouble(39,lwTownPriceSummaryProratAppendDto.getBizQuantity());
        dbManager.setDouble(40,lwTownPriceSummaryProratAppendDto.getBizScale());
        dbManager.setDouble(41,lwTownPriceSummaryProratAppendDto.getBizPrice());
        dbManager.setDouble(42,lwTownPriceSummaryProratAppendDto.getBizFee());
        dbManager.setDouble(43,lwTownPriceSummaryProratAppendDto.getSumBizFee());
        dbManager.setDouble(44,lwTownPriceSummaryProratAppendDto.getBizDianJin());
        dbManager.setDouble(45,lwTownPriceSummaryProratAppendDto.getBizSanXia());
        dbManager.setDouble(46,lwTownPriceSummaryProratAppendDto.getBizKuQu());
        dbManager.setDouble(47,lwTownPriceSummaryProratAppendDto.getBizJiJin());
        dbManager.setDouble(48,lwTownPriceSummaryProratAppendDto.getIndustryQuantity());
        dbManager.setDouble(49,lwTownPriceSummaryProratAppendDto.getIndustryScale());
        dbManager.setDouble(50,lwTownPriceSummaryProratAppendDto.getIndustryPrice());
        dbManager.setDouble(51,lwTownPriceSummaryProratAppendDto.getIndustryFee());
        dbManager.setDouble(52,lwTownPriceSummaryProratAppendDto.getSumIndustryFee());
        dbManager.setDouble(53,lwTownPriceSummaryProratAppendDto.getIndustryDianJin());
        dbManager.setDouble(54,lwTownPriceSummaryProratAppendDto.getIndustrySanXia());
        dbManager.setDouble(55,lwTownPriceSummaryProratAppendDto.getIndustryKuQu());
        dbManager.setDouble(56,lwTownPriceSummaryProratAppendDto.getIndustryJiJin());
        dbManager.setLong(57,lwTownPriceSummaryProratAppendDto.getTranferLossQuantity());
        dbManager.setDouble(58,lwTownPriceSummaryProratAppendDto.getRateCode());
        dbManager.setDouble(59,lwTownPriceSummaryProratAppendDto.getAdjustValue());
        dbManager.setDouble(60,lwTownPriceSummaryProratAppendDto.getRateFee());
        dbManager.setDouble(61,lwTownPriceSummaryProratAppendDto.getLoan());
        dbManager.setDouble(62,lwTownPriceSummaryProratAppendDto.getSanXiaFee());
        dbManager.setDouble(63,lwTownPriceSummaryProratAppendDto.getSurcharge());
        dbManager.setDouble(64,lwTownPriceSummaryProratAppendDto.getMigrationFee());
        dbManager.setDouble(65,lwTownPriceSummaryProratAppendDto.getSumQuantity());
        dbManager.setDouble(66,lwTownPriceSummaryProratAppendDto.getSumFee());
        dbManager.setDouble(67,lwTownPriceSummaryProratAppendDto.getSumDianJin());
        dbManager.setDouble(68,lwTownPriceSummaryProratAppendDto.getSumSanXia());
        dbManager.setDouble(69,lwTownPriceSummaryProratAppendDto.getSumJiJin());
        dbManager.setString(70,lwTownPriceSummaryProratAppendDto.getValidStatus());
        dbManager.setString(71,lwTownPriceSummaryProratAppendDto.getFlag());
        dbManager.setString(72,lwTownPriceSummaryProratAppendDto.getRemark());
        dbManager.setDouble(73,lwTownPriceSummaryProratAppendDto.getSumKuQu());
        dbManager.setString(74,lwTownPriceSummaryProratAppendDto.getInputDate());
        //设置条件字段;
        dbManager.setString(75,lwTownPriceSummaryProratAppendDto.getUserNo());
        dbManager.setString(76,lwTownPriceSummaryProratAppendDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 统计年月
     * @return LwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public LwTownPriceSummaryProratAppendDto findByPrimaryKey(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("ElectricFee,");
        buffer.append("PeopleQuantity,");
        buffer.append("PeopleScale,");
        buffer.append("PeoplePrice,");
        buffer.append("PeopleFee,");
        buffer.append("SumPeopleFee,");
        buffer.append("PeopleDianJin,");
        buffer.append("PeopleFeeSanXia,");
        buffer.append("PeopleJiJin,");
        buffer.append("PeopleKuQu,");
        buffer.append("NotPeopleQuantity,");
        buffer.append("NotPeopleScale,");
        buffer.append("NotPeoplePrice,");
        buffer.append("NotPeopleFee,");
        buffer.append("SumNotPeopleFee,");
        buffer.append("NotPeopleDianJin,");
        buffer.append("NotPeopleFeeSanXia,");
        buffer.append("NotPeopleJiJin,");
        buffer.append("NotPeopleKuQu,");
        buffer.append("FarmQuantity,");
        buffer.append("FarmScale,");
        buffer.append("FarmPrice,");
        buffer.append("FarmFee,");
        buffer.append("SumFarmFee,");
        buffer.append("FarmDianJin,");
        buffer.append("FarmSanXia,");
        buffer.append("FarmJiJin,");
        buffer.append("FarmKuQu,");
        buffer.append("ProduceQuantity,");
        buffer.append("ProduceScale,");
        buffer.append("ProducePrice,");
        buffer.append("ProduceFee,");
        buffer.append("SumProduceFee,");
        buffer.append("ProduceDianJin,");
        buffer.append("ProduceSanXia,");
        buffer.append("ProduceKuQu,");
        buffer.append("ProduceJiJin,");
        buffer.append("BizQuantity,");
        buffer.append("BizScale,");
        buffer.append("BizPrice,");
        buffer.append("BizFee,");
        buffer.append("SumBizFee,");
        buffer.append("BizDianJin,");
        buffer.append("BizSanXia,");
        buffer.append("BizKuQu,");
        buffer.append("BizJiJin,");
        buffer.append("IndustryQuantity,");
        buffer.append("IndustryScale,");
        buffer.append("IndustryPrice,");
        buffer.append("IndustryFee,");
        buffer.append("SumIndustryFee,");
        buffer.append("IndustryDianJin,");
        buffer.append("IndustrySanXia,");
        buffer.append("IndustryKuQu,");
        buffer.append("IndustryJiJin,");
        buffer.append("TranferLossQuantity,");
        buffer.append("RateCode,");
        buffer.append("AdjustValue,");
        buffer.append("RateFee,");
        buffer.append("Loan,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("MigrationFee,");
        buffer.append("SumQuantity,");
        buffer.append("SumFee,");
        buffer.append("SumDianJin,");
        buffer.append("SumSanXia,");
        buffer.append("SumJiJin,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("SumKuQu,");
        buffer.append("InputDate ");
        buffer.append("FROM LwTownPriceSummaryProratAppend ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        dbManager.setString(2,statMonth);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto = null;
        if(resultSet.next()){
            lwTownPriceSummaryProratAppendDto = new LwTownPriceSummaryProratAppendDto();
            lwTownPriceSummaryProratAppendDto.setUserNo(dbManager.getString(resultSet,1));
            lwTownPriceSummaryProratAppendDto.setLineCode(dbManager.getString(resultSet,2));
            lwTownPriceSummaryProratAppendDto.setStatMonth(dbManager.getString(resultSet,3));
            lwTownPriceSummaryProratAppendDto.setElectricFee(dbManager.getDouble(resultSet,4));
            lwTownPriceSummaryProratAppendDto.setPeopleQuantity(dbManager.getDouble(resultSet,5));
            lwTownPriceSummaryProratAppendDto.setPeopleScale(dbManager.getDouble(resultSet,6));
            lwTownPriceSummaryProratAppendDto.setPeoplePrice(dbManager.getDouble(resultSet,7));
            lwTownPriceSummaryProratAppendDto.setPeopleFee(dbManager.getDouble(resultSet,8));
            lwTownPriceSummaryProratAppendDto.setSumPeopleFee(dbManager.getDouble(resultSet,9));
            lwTownPriceSummaryProratAppendDto.setPeopleDianJin(dbManager.getDouble(resultSet,10));
            lwTownPriceSummaryProratAppendDto.setPeopleFeeSanXia(dbManager.getDouble(resultSet,11));
            lwTownPriceSummaryProratAppendDto.setPeopleJiJin(dbManager.getDouble(resultSet,12));
            lwTownPriceSummaryProratAppendDto.setPeopleKuQu(dbManager.getDouble(resultSet,13));
            lwTownPriceSummaryProratAppendDto.setNotPeopleQuantity(dbManager.getDouble(resultSet,14));
            lwTownPriceSummaryProratAppendDto.setNotPeopleScale(dbManager.getDouble(resultSet,15));
            lwTownPriceSummaryProratAppendDto.setNotPeoplePrice(dbManager.getDouble(resultSet,16));
            lwTownPriceSummaryProratAppendDto.setNotPeopleFee(dbManager.getDouble(resultSet,17));
            lwTownPriceSummaryProratAppendDto.setSumNotPeopleFee(dbManager.getDouble(resultSet,18));
            lwTownPriceSummaryProratAppendDto.setNotPeopleDianJin(dbManager.getDouble(resultSet,19));
            lwTownPriceSummaryProratAppendDto.setNotPeopleFeeSanXia(dbManager.getDouble(resultSet,20));
            lwTownPriceSummaryProratAppendDto.setNotPeopleJiJin(dbManager.getDouble(resultSet,21));
            lwTownPriceSummaryProratAppendDto.setNotPeopleKuQu(dbManager.getDouble(resultSet,22));
            lwTownPriceSummaryProratAppendDto.setFarmQuantity(dbManager.getDouble(resultSet,23));
            lwTownPriceSummaryProratAppendDto.setFarmScale(dbManager.getDouble(resultSet,24));
            lwTownPriceSummaryProratAppendDto.setFarmPrice(dbManager.getDouble(resultSet,25));
            lwTownPriceSummaryProratAppendDto.setFarmFee(dbManager.getDouble(resultSet,26));
            lwTownPriceSummaryProratAppendDto.setSumFarmFee(dbManager.getDouble(resultSet,27));
            lwTownPriceSummaryProratAppendDto.setFarmDianJin(dbManager.getDouble(resultSet,28));
            lwTownPriceSummaryProratAppendDto.setFarmSanXia(dbManager.getDouble(resultSet,29));
            lwTownPriceSummaryProratAppendDto.setFarmJiJin(dbManager.getDouble(resultSet,30));
            lwTownPriceSummaryProratAppendDto.setFarmKuQu(dbManager.getDouble(resultSet,31));
            lwTownPriceSummaryProratAppendDto.setProduceQuantity(dbManager.getDouble(resultSet,32));
            lwTownPriceSummaryProratAppendDto.setProduceScale(dbManager.getDouble(resultSet,33));
            lwTownPriceSummaryProratAppendDto.setProducePrice(dbManager.getDouble(resultSet,34));
            lwTownPriceSummaryProratAppendDto.setProduceFee(dbManager.getDouble(resultSet,35));
            lwTownPriceSummaryProratAppendDto.setSumProduceFee(dbManager.getDouble(resultSet,36));
            lwTownPriceSummaryProratAppendDto.setProduceDianJin(dbManager.getDouble(resultSet,37));
            lwTownPriceSummaryProratAppendDto.setProduceSanXia(dbManager.getDouble(resultSet,38));
            lwTownPriceSummaryProratAppendDto.setProduceKuQu(dbManager.getDouble(resultSet,39));
            lwTownPriceSummaryProratAppendDto.setProduceJiJin(dbManager.getDouble(resultSet,40));
            lwTownPriceSummaryProratAppendDto.setBizQuantity(dbManager.getDouble(resultSet,41));
            lwTownPriceSummaryProratAppendDto.setBizScale(dbManager.getDouble(resultSet,42));
            lwTownPriceSummaryProratAppendDto.setBizPrice(dbManager.getDouble(resultSet,43));
            lwTownPriceSummaryProratAppendDto.setBizFee(dbManager.getDouble(resultSet,44));
            lwTownPriceSummaryProratAppendDto.setSumBizFee(dbManager.getDouble(resultSet,45));
            lwTownPriceSummaryProratAppendDto.setBizDianJin(dbManager.getDouble(resultSet,46));
            lwTownPriceSummaryProratAppendDto.setBizSanXia(dbManager.getDouble(resultSet,47));
            lwTownPriceSummaryProratAppendDto.setBizKuQu(dbManager.getDouble(resultSet,48));
            lwTownPriceSummaryProratAppendDto.setBizJiJin(dbManager.getDouble(resultSet,49));
            lwTownPriceSummaryProratAppendDto.setIndustryQuantity(dbManager.getDouble(resultSet,50));
            lwTownPriceSummaryProratAppendDto.setIndustryScale(dbManager.getDouble(resultSet,51));
            lwTownPriceSummaryProratAppendDto.setIndustryPrice(dbManager.getDouble(resultSet,52));
            lwTownPriceSummaryProratAppendDto.setIndustryFee(dbManager.getDouble(resultSet,53));
            lwTownPriceSummaryProratAppendDto.setSumIndustryFee(dbManager.getDouble(resultSet,54));
            lwTownPriceSummaryProratAppendDto.setIndustryDianJin(dbManager.getDouble(resultSet,55));
            lwTownPriceSummaryProratAppendDto.setIndustrySanXia(dbManager.getDouble(resultSet,56));
            lwTownPriceSummaryProratAppendDto.setIndustryKuQu(dbManager.getDouble(resultSet,57));
            lwTownPriceSummaryProratAppendDto.setIndustryJiJin(dbManager.getDouble(resultSet,58));
            lwTownPriceSummaryProratAppendDto.setTranferLossQuantity(dbManager.getLong(resultSet,59));
            lwTownPriceSummaryProratAppendDto.setRateCode(dbManager.getDouble(resultSet,60));
            lwTownPriceSummaryProratAppendDto.setAdjustValue(dbManager.getDouble(resultSet,61));
            lwTownPriceSummaryProratAppendDto.setRateFee(dbManager.getDouble(resultSet,62));
            lwTownPriceSummaryProratAppendDto.setLoan(dbManager.getDouble(resultSet,63));
            lwTownPriceSummaryProratAppendDto.setSanXiaFee(dbManager.getDouble(resultSet,64));
            lwTownPriceSummaryProratAppendDto.setSurcharge(dbManager.getDouble(resultSet,65));
            lwTownPriceSummaryProratAppendDto.setMigrationFee(dbManager.getDouble(resultSet,66));
            lwTownPriceSummaryProratAppendDto.setSumQuantity(dbManager.getDouble(resultSet,67));
            lwTownPriceSummaryProratAppendDto.setSumFee(dbManager.getDouble(resultSet,68));
            lwTownPriceSummaryProratAppendDto.setSumDianJin(dbManager.getDouble(resultSet,69));
            lwTownPriceSummaryProratAppendDto.setSumSanXia(dbManager.getDouble(resultSet,70));
            lwTownPriceSummaryProratAppendDto.setSumJiJin(dbManager.getDouble(resultSet,71));
            lwTownPriceSummaryProratAppendDto.setValidStatus(dbManager.getString(resultSet,72));
            lwTownPriceSummaryProratAppendDto.setFlag(dbManager.getString(resultSet,73));
            lwTownPriceSummaryProratAppendDto.setRemark(dbManager.getString(resultSet,74));
            lwTownPriceSummaryProratAppendDto.setSumKuQu(dbManager.getDouble(resultSet,75));
            lwTownPriceSummaryProratAppendDto.setInputDate(dbManager.getString(resultSet,76));
        }
        resultSet.close();
        return lwTownPriceSummaryProratAppendDto;
    }

    /**
     * 按条件查询多条数据
     * @param conditions 查询条件
     * @param pageNo 页号
     * @param rowsPerPage 每页的行数
     * @return Collection
     * @throws Exception
     */
    public Collection findByConditions(String conditions,int pageNo,int rowsPerPage)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("ElectricFee,");
        buffer.append("PeopleQuantity,");
        buffer.append("PeopleScale,");
        buffer.append("PeoplePrice,");
        buffer.append("PeopleFee,");
        buffer.append("SumPeopleFee,");
        buffer.append("PeopleDianJin,");
        buffer.append("PeopleFeeSanXia,");
        buffer.append("PeopleJiJin,");
        buffer.append("PeopleKuQu,");
        buffer.append("NotPeopleQuantity,");
        buffer.append("NotPeopleScale,");
        buffer.append("NotPeoplePrice,");
        buffer.append("NotPeopleFee,");
        buffer.append("SumNotPeopleFee,");
        buffer.append("NotPeopleDianJin,");
        buffer.append("NotPeopleFeeSanXia,");
        buffer.append("NotPeopleJiJin,");
        buffer.append("NotPeopleKuQu,");
        buffer.append("FarmQuantity,");
        buffer.append("FarmScale,");
        buffer.append("FarmPrice,");
        buffer.append("FarmFee,");
        buffer.append("SumFarmFee,");
        buffer.append("FarmDianJin,");
        buffer.append("FarmSanXia,");
        buffer.append("FarmJiJin,");
        buffer.append("FarmKuQu,");
        buffer.append("ProduceQuantity,");
        buffer.append("ProduceScale,");
        buffer.append("ProducePrice,");
        buffer.append("ProduceFee,");
        buffer.append("SumProduceFee,");
        buffer.append("ProduceDianJin,");
        buffer.append("ProduceSanXia,");
        buffer.append("ProduceKuQu,");
        buffer.append("ProduceJiJin,");
        buffer.append("BizQuantity,");
        buffer.append("BizScale,");
        buffer.append("BizPrice,");
        buffer.append("BizFee,");
        buffer.append("SumBizFee,");
        buffer.append("BizDianJin,");
        buffer.append("BizSanXia,");
        buffer.append("BizKuQu,");
        buffer.append("BizJiJin,");
        buffer.append("IndustryQuantity,");
        buffer.append("IndustryScale,");
        buffer.append("IndustryPrice,");
        buffer.append("IndustryFee,");
        buffer.append("SumIndustryFee,");
        buffer.append("IndustryDianJin,");
        buffer.append("IndustrySanXia,");
        buffer.append("IndustryKuQu,");
        buffer.append("IndustryJiJin,");
        buffer.append("TranferLossQuantity,");
        buffer.append("RateCode,");
        buffer.append("AdjustValue,");
        buffer.append("RateFee,");
        buffer.append("Loan,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("MigrationFee,");
        buffer.append("SumQuantity,");
        buffer.append("SumFee,");
        buffer.append("SumDianJin,");
        buffer.append("SumSanXia,");
        buffer.append("SumJiJin,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("SumKuQu,");
        buffer.append("InputDate ");
        buffer.append("FROM LwTownPriceSummaryProratAppend WHERE ");
        buffer.append(conditions);
        boolean supportPaging = false;//数据库是否支持分页
        if (pageNo > 0){
            //对Oracle优化
            if(dbManager.getConnection().getMetaData().getDatabaseProductName().equalsIgnoreCase("Oracle")){
                buffer.insert(0,"SELECT * FROM ( SELECT row_.*, rownum rownum_ FROM (");
                buffer.append(") row_ WHERE rownum <= "+rowsPerPage * pageNo+") WHERE rownum_ > "+rowsPerPage * (pageNo - 1));
                supportPaging=true;
            }
            else if(dbManager.getConnection().getMetaData().getDatabaseProductName().equalsIgnoreCase("DB2")){
                String sql = buffer.toString();
                buffer.setLength(0);
                buffer.append("select * from ( select rownumber() over(");
                int orderByIndex = sql.toLowerCase().indexOf("order by");
                if ( orderByIndex>0 ) {
                   buffer.append( sql.substring(orderByIndex) );
                }
                buffer.append(") as rownumber_,");
                buffer.append(sql.substring( 6 ));
                buffer.append(" ) as temp_ where rownumber_");
                buffer.append(" between "+ (rowsPerPage * (pageNo - 1) + 1) +" and "+rowsPerPage * pageNo);
                supportPaging=true;
            }
        }
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        ResultSet resultSet = dbManager.executeQuery(buffer.toString());
        int count=0;
        if(supportPaging==false && pageNo>1){
            dbManager.locate(resultSet,rowsPerPage * (pageNo - 1));
        }

        //定义返回结果集合
        Collection collection = new ArrayList(rowsPerPage);
        LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwTownPriceSummaryProratAppendDto = new LwTownPriceSummaryProratAppendDto();
            lwTownPriceSummaryProratAppendDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwTownPriceSummaryProratAppendDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwTownPriceSummaryProratAppendDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwTownPriceSummaryProratAppendDto.setElectricFee(dbManager.getDouble(resultSet,"ElectricFee"));
            lwTownPriceSummaryProratAppendDto.setPeopleQuantity(dbManager.getDouble(resultSet,"PeopleQuantity"));
            lwTownPriceSummaryProratAppendDto.setPeopleScale(dbManager.getDouble(resultSet,"PeopleScale"));
            lwTownPriceSummaryProratAppendDto.setPeoplePrice(dbManager.getDouble(resultSet,"PeoplePrice"));
            lwTownPriceSummaryProratAppendDto.setPeopleFee(dbManager.getDouble(resultSet,"PeopleFee"));
            lwTownPriceSummaryProratAppendDto.setSumPeopleFee(dbManager.getDouble(resultSet,"SumPeopleFee"));
            lwTownPriceSummaryProratAppendDto.setPeopleDianJin(dbManager.getDouble(resultSet,"PeopleDianJin"));
            lwTownPriceSummaryProratAppendDto.setPeopleFeeSanXia(dbManager.getDouble(resultSet,"PeopleFeeSanXia"));
            lwTownPriceSummaryProratAppendDto.setPeopleJiJin(dbManager.getDouble(resultSet,"PeopleJiJin"));
            lwTownPriceSummaryProratAppendDto.setPeopleKuQu(dbManager.getDouble(resultSet,"PeopleKuQu"));
            lwTownPriceSummaryProratAppendDto.setNotPeopleQuantity(dbManager.getDouble(resultSet,"NotPeopleQuantity"));
            lwTownPriceSummaryProratAppendDto.setNotPeopleScale(dbManager.getDouble(resultSet,"NotPeopleScale"));
            lwTownPriceSummaryProratAppendDto.setNotPeoplePrice(dbManager.getDouble(resultSet,"NotPeoplePrice"));
            lwTownPriceSummaryProratAppendDto.setNotPeopleFee(dbManager.getDouble(resultSet,"NotPeopleFee"));
            lwTownPriceSummaryProratAppendDto.setSumNotPeopleFee(dbManager.getDouble(resultSet,"SumNotPeopleFee"));
            lwTownPriceSummaryProratAppendDto.setNotPeopleDianJin(dbManager.getDouble(resultSet,"NotPeopleDianJin"));
            lwTownPriceSummaryProratAppendDto.setNotPeopleFeeSanXia(dbManager.getDouble(resultSet,"NotPeopleFeeSanXia"));
            lwTownPriceSummaryProratAppendDto.setNotPeopleJiJin(dbManager.getDouble(resultSet,"NotPeopleJiJin"));
            lwTownPriceSummaryProratAppendDto.setNotPeopleKuQu(dbManager.getDouble(resultSet,"NotPeopleKuQu"));
            lwTownPriceSummaryProratAppendDto.setFarmQuantity(dbManager.getDouble(resultSet,"FarmQuantity"));
            lwTownPriceSummaryProratAppendDto.setFarmScale(dbManager.getDouble(resultSet,"FarmScale"));
            lwTownPriceSummaryProratAppendDto.setFarmPrice(dbManager.getDouble(resultSet,"FarmPrice"));
            lwTownPriceSummaryProratAppendDto.setFarmFee(dbManager.getDouble(resultSet,"FarmFee"));
            lwTownPriceSummaryProratAppendDto.setSumFarmFee(dbManager.getDouble(resultSet,"SumFarmFee"));
            lwTownPriceSummaryProratAppendDto.setFarmDianJin(dbManager.getDouble(resultSet,"FarmDianJin"));
            lwTownPriceSummaryProratAppendDto.setFarmSanXia(dbManager.getDouble(resultSet,"FarmSanXia"));
            lwTownPriceSummaryProratAppendDto.setFarmJiJin(dbManager.getDouble(resultSet,"FarmJiJin"));
            lwTownPriceSummaryProratAppendDto.setFarmKuQu(dbManager.getDouble(resultSet,"FarmKuQu"));
            lwTownPriceSummaryProratAppendDto.setProduceQuantity(dbManager.getDouble(resultSet,"ProduceQuantity"));
            lwTownPriceSummaryProratAppendDto.setProduceScale(dbManager.getDouble(resultSet,"ProduceScale"));
            lwTownPriceSummaryProratAppendDto.setProducePrice(dbManager.getDouble(resultSet,"ProducePrice"));
            lwTownPriceSummaryProratAppendDto.setProduceFee(dbManager.getDouble(resultSet,"ProduceFee"));
            lwTownPriceSummaryProratAppendDto.setSumProduceFee(dbManager.getDouble(resultSet,"SumProduceFee"));
            lwTownPriceSummaryProratAppendDto.setProduceDianJin(dbManager.getDouble(resultSet,"ProduceDianJin"));
            lwTownPriceSummaryProratAppendDto.setProduceSanXia(dbManager.getDouble(resultSet,"ProduceSanXia"));
            lwTownPriceSummaryProratAppendDto.setProduceKuQu(dbManager.getDouble(resultSet,"ProduceKuQu"));
            lwTownPriceSummaryProratAppendDto.setProduceJiJin(dbManager.getDouble(resultSet,"ProduceJiJin"));
            lwTownPriceSummaryProratAppendDto.setBizQuantity(dbManager.getDouble(resultSet,"BizQuantity"));
            lwTownPriceSummaryProratAppendDto.setBizScale(dbManager.getDouble(resultSet,"BizScale"));
            lwTownPriceSummaryProratAppendDto.setBizPrice(dbManager.getDouble(resultSet,"BizPrice"));
            lwTownPriceSummaryProratAppendDto.setBizFee(dbManager.getDouble(resultSet,"BizFee"));
            lwTownPriceSummaryProratAppendDto.setSumBizFee(dbManager.getDouble(resultSet,"SumBizFee"));
            lwTownPriceSummaryProratAppendDto.setBizDianJin(dbManager.getDouble(resultSet,"BizDianJin"));
            lwTownPriceSummaryProratAppendDto.setBizSanXia(dbManager.getDouble(resultSet,"BizSanXia"));
            lwTownPriceSummaryProratAppendDto.setBizKuQu(dbManager.getDouble(resultSet,"BizKuQu"));
            lwTownPriceSummaryProratAppendDto.setBizJiJin(dbManager.getDouble(resultSet,"BizJiJin"));
            lwTownPriceSummaryProratAppendDto.setIndustryQuantity(dbManager.getDouble(resultSet,"IndustryQuantity"));
            lwTownPriceSummaryProratAppendDto.setIndustryScale(dbManager.getDouble(resultSet,"IndustryScale"));
            lwTownPriceSummaryProratAppendDto.setIndustryPrice(dbManager.getDouble(resultSet,"IndustryPrice"));
            lwTownPriceSummaryProratAppendDto.setIndustryFee(dbManager.getDouble(resultSet,"IndustryFee"));
            lwTownPriceSummaryProratAppendDto.setSumIndustryFee(dbManager.getDouble(resultSet,"SumIndustryFee"));
            lwTownPriceSummaryProratAppendDto.setIndustryDianJin(dbManager.getDouble(resultSet,"IndustryDianJin"));
            lwTownPriceSummaryProratAppendDto.setIndustrySanXia(dbManager.getDouble(resultSet,"IndustrySanXia"));
            lwTownPriceSummaryProratAppendDto.setIndustryKuQu(dbManager.getDouble(resultSet,"IndustryKuQu"));
            lwTownPriceSummaryProratAppendDto.setIndustryJiJin(dbManager.getDouble(resultSet,"IndustryJiJin"));
            lwTownPriceSummaryProratAppendDto.setTranferLossQuantity(dbManager.getLong(resultSet,"TranferLossQuantity"));
            lwTownPriceSummaryProratAppendDto.setRateCode(dbManager.getDouble(resultSet,"RateCode"));
            lwTownPriceSummaryProratAppendDto.setAdjustValue(dbManager.getDouble(resultSet,"AdjustValue"));
            lwTownPriceSummaryProratAppendDto.setRateFee(dbManager.getDouble(resultSet,"RateFee"));
            lwTownPriceSummaryProratAppendDto.setLoan(dbManager.getDouble(resultSet,"Loan"));
            lwTownPriceSummaryProratAppendDto.setSanXiaFee(dbManager.getDouble(resultSet,"SanXiaFee"));
            lwTownPriceSummaryProratAppendDto.setSurcharge(dbManager.getDouble(resultSet,"Surcharge"));
            lwTownPriceSummaryProratAppendDto.setMigrationFee(dbManager.getDouble(resultSet,"MigrationFee"));
            lwTownPriceSummaryProratAppendDto.setSumQuantity(dbManager.getDouble(resultSet,"SumQuantity"));
            lwTownPriceSummaryProratAppendDto.setSumFee(dbManager.getDouble(resultSet,"SumFee"));
            lwTownPriceSummaryProratAppendDto.setSumDianJin(dbManager.getDouble(resultSet,"SumDianJin"));
            lwTownPriceSummaryProratAppendDto.setSumSanXia(dbManager.getDouble(resultSet,"SumSanXia"));
            lwTownPriceSummaryProratAppendDto.setSumJiJin(dbManager.getDouble(resultSet,"SumJiJin"));
            lwTownPriceSummaryProratAppendDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwTownPriceSummaryProratAppendDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwTownPriceSummaryProratAppendDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwTownPriceSummaryProratAppendDto.setSumKuQu(dbManager.getDouble(resultSet,"SumKuQu"));
            lwTownPriceSummaryProratAppendDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            collection.add(lwTownPriceSummaryProratAppendDto);
        }
        resultSet.close();
        return collection;
    }

    /**
     * 按条件查询多条数据
     * @param conditions 查询条件
     * @return Collection
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
            throws Exception{
        return findByConditions(conditions,0,0);
    }

    /**
     * 按条件删除数据
     * @param conditions 查询条件
     * @return 删除的行数
     * @throws Exception
     */
    public int deleteByConditions(String conditions)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwTownPriceSummaryProratAppend WHERE ");
        buffer.append(conditions);
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        int count = dbManager.executeUpdate(buffer.toString());
        return count;
    }

    /**
     * 查询满足模糊查询条件的记录数
     * @param conditions conditions
     * @return 满足模糊查询条件的记录数
     * @throws Exception
     */
    public int getCount(String conditions) 
        throws Exception{
        int count = -1;
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("SELECT count(*) FROM LwTownPriceSummaryProratAppend WHERE ");
        buffer.append(conditions);
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        ResultSet resultSet = dbManager.executeQuery(buffer.toString());
        resultSet.next();
        count = dbManager.getInt(resultSet,1);
        resultSet.close();
        return count;
    }
}
