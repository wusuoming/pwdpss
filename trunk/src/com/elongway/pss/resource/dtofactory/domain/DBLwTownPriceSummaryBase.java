package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownPriceSummary-直供乡电费计算总表的数据访问对象基类<br>
 */
public class DBLwTownPriceSummaryBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwTownPriceSummaryBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownPriceSummaryBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public void insert(LwTownPriceSummaryDto lwTownPriceSummaryDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwTownPriceSummary (");
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
            debugBuffer.append("'").append(lwTownPriceSummaryDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getElectricFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getPeopleQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getPeopleScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getPeopleDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getPeopleFeeSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getPeopleJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getPeopleKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getNotPeopleQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getNotPeopleScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getNotPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getNotPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumNotPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getNotPeopleDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getNotPeopleFeeSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getNotPeopleJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getNotPeopleKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getFarmQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getFarmScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getFarmPrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getFarmFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumFarmFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getFarmDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getFarmSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getFarmJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getFarmKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getProduceQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getProduceScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getProducePrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getProduceFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumProduceFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getProduceDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getProduceSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getProduceKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getProduceJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getBizQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getBizScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getBizPrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getBizFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumBizFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getBizDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getBizSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getBizKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getBizJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getIndustryQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getIndustryScale()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getIndustryPrice()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getIndustryFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumIndustryFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getIndustryDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getIndustrySanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getIndustryKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getIndustryJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getTranferLossQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getRateCode()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getAdjustValue()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getRateFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getLoan()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSanXiaFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSurcharge()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getMigrationFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumDianJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumJiJin()).append(",");
            debugBuffer.append("'").append(lwTownPriceSummaryDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryDto.getRemark()).append("',");
            debugBuffer.append("").append(lwTownPriceSummaryDto.getSumKuQu()).append(",");
            debugBuffer.append("'").append(lwTownPriceSummaryDto.getInputDate()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwTownPriceSummaryDto.getUserNo());
        dbManager.setString(2,lwTownPriceSummaryDto.getLineCode());
        dbManager.setString(3,lwTownPriceSummaryDto.getStatMonth());
        dbManager.setDouble(4,lwTownPriceSummaryDto.getElectricFee());
        dbManager.setDouble(5,lwTownPriceSummaryDto.getPeopleQuantity());
        dbManager.setDouble(6,lwTownPriceSummaryDto.getPeopleScale());
        dbManager.setDouble(7,lwTownPriceSummaryDto.getPeoplePrice());
        dbManager.setDouble(8,lwTownPriceSummaryDto.getPeopleFee());
        dbManager.setDouble(9,lwTownPriceSummaryDto.getSumPeopleFee());
        dbManager.setDouble(10,lwTownPriceSummaryDto.getPeopleDianJin());
        dbManager.setDouble(11,lwTownPriceSummaryDto.getPeopleFeeSanXia());
        dbManager.setDouble(12,lwTownPriceSummaryDto.getPeopleJiJin());
        dbManager.setDouble(13,lwTownPriceSummaryDto.getPeopleKuQu());
        dbManager.setDouble(14,lwTownPriceSummaryDto.getNotPeopleQuantity());
        dbManager.setDouble(15,lwTownPriceSummaryDto.getNotPeopleScale());
        dbManager.setDouble(16,lwTownPriceSummaryDto.getNotPeoplePrice());
        dbManager.setDouble(17,lwTownPriceSummaryDto.getNotPeopleFee());
        dbManager.setDouble(18,lwTownPriceSummaryDto.getSumNotPeopleFee());
        dbManager.setDouble(19,lwTownPriceSummaryDto.getNotPeopleDianJin());
        dbManager.setDouble(20,lwTownPriceSummaryDto.getNotPeopleFeeSanXia());
        dbManager.setDouble(21,lwTownPriceSummaryDto.getNotPeopleJiJin());
        dbManager.setDouble(22,lwTownPriceSummaryDto.getNotPeopleKuQu());
        dbManager.setDouble(23,lwTownPriceSummaryDto.getFarmQuantity());
        dbManager.setDouble(24,lwTownPriceSummaryDto.getFarmScale());
        dbManager.setDouble(25,lwTownPriceSummaryDto.getFarmPrice());
        dbManager.setDouble(26,lwTownPriceSummaryDto.getFarmFee());
        dbManager.setDouble(27,lwTownPriceSummaryDto.getSumFarmFee());
        dbManager.setDouble(28,lwTownPriceSummaryDto.getFarmDianJin());
        dbManager.setDouble(29,lwTownPriceSummaryDto.getFarmSanXia());
        dbManager.setDouble(30,lwTownPriceSummaryDto.getFarmJiJin());
        dbManager.setDouble(31,lwTownPriceSummaryDto.getFarmKuQu());
        dbManager.setDouble(32,lwTownPriceSummaryDto.getProduceQuantity());
        dbManager.setDouble(33,lwTownPriceSummaryDto.getProduceScale());
        dbManager.setDouble(34,lwTownPriceSummaryDto.getProducePrice());
        dbManager.setDouble(35,lwTownPriceSummaryDto.getProduceFee());
        dbManager.setDouble(36,lwTownPriceSummaryDto.getSumProduceFee());
        dbManager.setDouble(37,lwTownPriceSummaryDto.getProduceDianJin());
        dbManager.setDouble(38,lwTownPriceSummaryDto.getProduceSanXia());
        dbManager.setDouble(39,lwTownPriceSummaryDto.getProduceKuQu());
        dbManager.setDouble(40,lwTownPriceSummaryDto.getProduceJiJin());
        dbManager.setDouble(41,lwTownPriceSummaryDto.getBizQuantity());
        dbManager.setDouble(42,lwTownPriceSummaryDto.getBizScale());
        dbManager.setDouble(43,lwTownPriceSummaryDto.getBizPrice());
        dbManager.setDouble(44,lwTownPriceSummaryDto.getBizFee());
        dbManager.setDouble(45,lwTownPriceSummaryDto.getSumBizFee());
        dbManager.setDouble(46,lwTownPriceSummaryDto.getBizDianJin());
        dbManager.setDouble(47,lwTownPriceSummaryDto.getBizSanXia());
        dbManager.setDouble(48,lwTownPriceSummaryDto.getBizKuQu());
        dbManager.setDouble(49,lwTownPriceSummaryDto.getBizJiJin());
        dbManager.setDouble(50,lwTownPriceSummaryDto.getIndustryQuantity());
        dbManager.setDouble(51,lwTownPriceSummaryDto.getIndustryScale());
        dbManager.setDouble(52,lwTownPriceSummaryDto.getIndustryPrice());
        dbManager.setDouble(53,lwTownPriceSummaryDto.getIndustryFee());
        dbManager.setDouble(54,lwTownPriceSummaryDto.getSumIndustryFee());
        dbManager.setDouble(55,lwTownPriceSummaryDto.getIndustryDianJin());
        dbManager.setDouble(56,lwTownPriceSummaryDto.getIndustrySanXia());
        dbManager.setDouble(57,lwTownPriceSummaryDto.getIndustryKuQu());
        dbManager.setDouble(58,lwTownPriceSummaryDto.getIndustryJiJin());
        dbManager.setLong(59,lwTownPriceSummaryDto.getTranferLossQuantity());
        dbManager.setDouble(60,lwTownPriceSummaryDto.getRateCode());
        dbManager.setDouble(61,lwTownPriceSummaryDto.getAdjustValue());
        dbManager.setDouble(62,lwTownPriceSummaryDto.getRateFee());
        dbManager.setDouble(63,lwTownPriceSummaryDto.getLoan());
        dbManager.setDouble(64,lwTownPriceSummaryDto.getSanXiaFee());
        dbManager.setDouble(65,lwTownPriceSummaryDto.getSurcharge());
        dbManager.setDouble(66,lwTownPriceSummaryDto.getMigrationFee());
        dbManager.setDouble(67,lwTownPriceSummaryDto.getSumQuantity());
        dbManager.setDouble(68,lwTownPriceSummaryDto.getSumFee());
        dbManager.setDouble(69,lwTownPriceSummaryDto.getSumDianJin());
        dbManager.setDouble(70,lwTownPriceSummaryDto.getSumSanXia());
        dbManager.setDouble(71,lwTownPriceSummaryDto.getSumJiJin());
        dbManager.setString(72,lwTownPriceSummaryDto.getValidStatus());
        dbManager.setString(73,lwTownPriceSummaryDto.getFlag());
        dbManager.setString(74,lwTownPriceSummaryDto.getRemark());
        dbManager.setDouble(75,lwTownPriceSummaryDto.getSumKuQu());
        dbManager.setString(76,lwTownPriceSummaryDto.getInputDate());
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
        buffer.append("INSERT INTO LwTownPriceSummary (");
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
            LwTownPriceSummaryDto lwTownPriceSummaryDto = (LwTownPriceSummaryDto)i.next();
            dbManager.setString(1,lwTownPriceSummaryDto.getUserNo());
            dbManager.setString(2,lwTownPriceSummaryDto.getLineCode());
            dbManager.setString(3,lwTownPriceSummaryDto.getStatMonth());
            dbManager.setDouble(4,lwTownPriceSummaryDto.getElectricFee());
            dbManager.setDouble(5,lwTownPriceSummaryDto.getPeopleQuantity());
            dbManager.setDouble(6,lwTownPriceSummaryDto.getPeopleScale());
            dbManager.setDouble(7,lwTownPriceSummaryDto.getPeoplePrice());
            dbManager.setDouble(8,lwTownPriceSummaryDto.getPeopleFee());
            dbManager.setDouble(9,lwTownPriceSummaryDto.getSumPeopleFee());
            dbManager.setDouble(10,lwTownPriceSummaryDto.getPeopleDianJin());
            dbManager.setDouble(11,lwTownPriceSummaryDto.getPeopleFeeSanXia());
            dbManager.setDouble(12,lwTownPriceSummaryDto.getPeopleJiJin());
            dbManager.setDouble(13,lwTownPriceSummaryDto.getPeopleKuQu());
            dbManager.setDouble(14,lwTownPriceSummaryDto.getNotPeopleQuantity());
            dbManager.setDouble(15,lwTownPriceSummaryDto.getNotPeopleScale());
            dbManager.setDouble(16,lwTownPriceSummaryDto.getNotPeoplePrice());
            dbManager.setDouble(17,lwTownPriceSummaryDto.getNotPeopleFee());
            dbManager.setDouble(18,lwTownPriceSummaryDto.getSumNotPeopleFee());
            dbManager.setDouble(19,lwTownPriceSummaryDto.getNotPeopleDianJin());
            dbManager.setDouble(20,lwTownPriceSummaryDto.getNotPeopleFeeSanXia());
            dbManager.setDouble(21,lwTownPriceSummaryDto.getNotPeopleJiJin());
            dbManager.setDouble(22,lwTownPriceSummaryDto.getNotPeopleKuQu());
            dbManager.setDouble(23,lwTownPriceSummaryDto.getFarmQuantity());
            dbManager.setDouble(24,lwTownPriceSummaryDto.getFarmScale());
            dbManager.setDouble(25,lwTownPriceSummaryDto.getFarmPrice());
            dbManager.setDouble(26,lwTownPriceSummaryDto.getFarmFee());
            dbManager.setDouble(27,lwTownPriceSummaryDto.getSumFarmFee());
            dbManager.setDouble(28,lwTownPriceSummaryDto.getFarmDianJin());
            dbManager.setDouble(29,lwTownPriceSummaryDto.getFarmSanXia());
            dbManager.setDouble(30,lwTownPriceSummaryDto.getFarmJiJin());
            dbManager.setDouble(31,lwTownPriceSummaryDto.getFarmKuQu());
            dbManager.setDouble(32,lwTownPriceSummaryDto.getProduceQuantity());
            dbManager.setDouble(33,lwTownPriceSummaryDto.getProduceScale());
            dbManager.setDouble(34,lwTownPriceSummaryDto.getProducePrice());
            dbManager.setDouble(35,lwTownPriceSummaryDto.getProduceFee());
            dbManager.setDouble(36,lwTownPriceSummaryDto.getSumProduceFee());
            dbManager.setDouble(37,lwTownPriceSummaryDto.getProduceDianJin());
            dbManager.setDouble(38,lwTownPriceSummaryDto.getProduceSanXia());
            dbManager.setDouble(39,lwTownPriceSummaryDto.getProduceKuQu());
            dbManager.setDouble(40,lwTownPriceSummaryDto.getProduceJiJin());
            dbManager.setDouble(41,lwTownPriceSummaryDto.getBizQuantity());
            dbManager.setDouble(42,lwTownPriceSummaryDto.getBizScale());
            dbManager.setDouble(43,lwTownPriceSummaryDto.getBizPrice());
            dbManager.setDouble(44,lwTownPriceSummaryDto.getBizFee());
            dbManager.setDouble(45,lwTownPriceSummaryDto.getSumBizFee());
            dbManager.setDouble(46,lwTownPriceSummaryDto.getBizDianJin());
            dbManager.setDouble(47,lwTownPriceSummaryDto.getBizSanXia());
            dbManager.setDouble(48,lwTownPriceSummaryDto.getBizKuQu());
            dbManager.setDouble(49,lwTownPriceSummaryDto.getBizJiJin());
            dbManager.setDouble(50,lwTownPriceSummaryDto.getIndustryQuantity());
            dbManager.setDouble(51,lwTownPriceSummaryDto.getIndustryScale());
            dbManager.setDouble(52,lwTownPriceSummaryDto.getIndustryPrice());
            dbManager.setDouble(53,lwTownPriceSummaryDto.getIndustryFee());
            dbManager.setDouble(54,lwTownPriceSummaryDto.getSumIndustryFee());
            dbManager.setDouble(55,lwTownPriceSummaryDto.getIndustryDianJin());
            dbManager.setDouble(56,lwTownPriceSummaryDto.getIndustrySanXia());
            dbManager.setDouble(57,lwTownPriceSummaryDto.getIndustryKuQu());
            dbManager.setDouble(58,lwTownPriceSummaryDto.getIndustryJiJin());
            dbManager.setLong(59,lwTownPriceSummaryDto.getTranferLossQuantity());
            dbManager.setDouble(60,lwTownPriceSummaryDto.getRateCode());
            dbManager.setDouble(61,lwTownPriceSummaryDto.getAdjustValue());
            dbManager.setDouble(62,lwTownPriceSummaryDto.getRateFee());
            dbManager.setDouble(63,lwTownPriceSummaryDto.getLoan());
            dbManager.setDouble(64,lwTownPriceSummaryDto.getSanXiaFee());
            dbManager.setDouble(65,lwTownPriceSummaryDto.getSurcharge());
            dbManager.setDouble(66,lwTownPriceSummaryDto.getMigrationFee());
            dbManager.setDouble(67,lwTownPriceSummaryDto.getSumQuantity());
            dbManager.setDouble(68,lwTownPriceSummaryDto.getSumFee());
            dbManager.setDouble(69,lwTownPriceSummaryDto.getSumDianJin());
            dbManager.setDouble(70,lwTownPriceSummaryDto.getSumSanXia());
            dbManager.setDouble(71,lwTownPriceSummaryDto.getSumJiJin());
            dbManager.setString(72,lwTownPriceSummaryDto.getValidStatus());
            dbManager.setString(73,lwTownPriceSummaryDto.getFlag());
            dbManager.setString(74,lwTownPriceSummaryDto.getRemark());
            dbManager.setDouble(75,lwTownPriceSummaryDto.getSumKuQu());
            dbManager.setString(76,lwTownPriceSummaryDto.getInputDate());
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
        buffer.append("DELETE FROM LwTownPriceSummary ");
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
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public void update(LwTownPriceSummaryDto lwTownPriceSummaryDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwTownPriceSummary SET ");
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
            debugBuffer.append("UPDATE LwTownPriceSummary SET ");
            debugBuffer.append("LineCode = '" + lwTownPriceSummaryDto.getLineCode() + "', ");
            debugBuffer.append("ElectricFee = " + lwTownPriceSummaryDto.getElectricFee() + ", ");
            debugBuffer.append("PeopleQuantity = " + lwTownPriceSummaryDto.getPeopleQuantity() + ", ");
            debugBuffer.append("PeopleScale = " + lwTownPriceSummaryDto.getPeopleScale() + ", ");
            debugBuffer.append("PeoplePrice = " + lwTownPriceSummaryDto.getPeoplePrice() + ", ");
            debugBuffer.append("PeopleFee = " + lwTownPriceSummaryDto.getPeopleFee() + ", ");
            debugBuffer.append("SumPeopleFee = " + lwTownPriceSummaryDto.getSumPeopleFee() + ", ");
            debugBuffer.append("PeopleDianJin = " + lwTownPriceSummaryDto.getPeopleDianJin() + ", ");
            debugBuffer.append("PeopleFeeSanXia = " + lwTownPriceSummaryDto.getPeopleFeeSanXia() + ", ");
            debugBuffer.append("PeopleJiJin = " + lwTownPriceSummaryDto.getPeopleJiJin() + ", ");
            debugBuffer.append("PeopleKuQu = " + lwTownPriceSummaryDto.getPeopleKuQu() + ", ");
            debugBuffer.append("NotPeopleQuantity = " + lwTownPriceSummaryDto.getNotPeopleQuantity() + ", ");
            debugBuffer.append("NotPeopleScale = " + lwTownPriceSummaryDto.getNotPeopleScale() + ", ");
            debugBuffer.append("NotPeoplePrice = " + lwTownPriceSummaryDto.getNotPeoplePrice() + ", ");
            debugBuffer.append("NotPeopleFee = " + lwTownPriceSummaryDto.getNotPeopleFee() + ", ");
            debugBuffer.append("SumNotPeopleFee = " + lwTownPriceSummaryDto.getSumNotPeopleFee() + ", ");
            debugBuffer.append("NotPeopleDianJin = " + lwTownPriceSummaryDto.getNotPeopleDianJin() + ", ");
            debugBuffer.append("NotPeopleFeeSanXia = " + lwTownPriceSummaryDto.getNotPeopleFeeSanXia() + ", ");
            debugBuffer.append("NotPeopleJiJin = " + lwTownPriceSummaryDto.getNotPeopleJiJin() + ", ");
            debugBuffer.append("NotPeopleKuQu = " + lwTownPriceSummaryDto.getNotPeopleKuQu() + ", ");
            debugBuffer.append("FarmQuantity = " + lwTownPriceSummaryDto.getFarmQuantity() + ", ");
            debugBuffer.append("FarmScale = " + lwTownPriceSummaryDto.getFarmScale() + ", ");
            debugBuffer.append("FarmPrice = " + lwTownPriceSummaryDto.getFarmPrice() + ", ");
            debugBuffer.append("FarmFee = " + lwTownPriceSummaryDto.getFarmFee() + ", ");
            debugBuffer.append("SumFarmFee = " + lwTownPriceSummaryDto.getSumFarmFee() + ", ");
            debugBuffer.append("FarmDianJin = " + lwTownPriceSummaryDto.getFarmDianJin() + ", ");
            debugBuffer.append("FarmSanXia = " + lwTownPriceSummaryDto.getFarmSanXia() + ", ");
            debugBuffer.append("FarmJiJin = " + lwTownPriceSummaryDto.getFarmJiJin() + ", ");
            debugBuffer.append("FarmKuQu = " + lwTownPriceSummaryDto.getFarmKuQu() + ", ");
            debugBuffer.append("ProduceQuantity = " + lwTownPriceSummaryDto.getProduceQuantity() + ", ");
            debugBuffer.append("ProduceScale = " + lwTownPriceSummaryDto.getProduceScale() + ", ");
            debugBuffer.append("ProducePrice = " + lwTownPriceSummaryDto.getProducePrice() + ", ");
            debugBuffer.append("ProduceFee = " + lwTownPriceSummaryDto.getProduceFee() + ", ");
            debugBuffer.append("SumProduceFee = " + lwTownPriceSummaryDto.getSumProduceFee() + ", ");
            debugBuffer.append("ProduceDianJin = " + lwTownPriceSummaryDto.getProduceDianJin() + ", ");
            debugBuffer.append("ProduceSanXia = " + lwTownPriceSummaryDto.getProduceSanXia() + ", ");
            debugBuffer.append("ProduceKuQu = " + lwTownPriceSummaryDto.getProduceKuQu() + ", ");
            debugBuffer.append("ProduceJiJin = " + lwTownPriceSummaryDto.getProduceJiJin() + ", ");
            debugBuffer.append("BizQuantity = " + lwTownPriceSummaryDto.getBizQuantity() + ", ");
            debugBuffer.append("BizScale = " + lwTownPriceSummaryDto.getBizScale() + ", ");
            debugBuffer.append("BizPrice = " + lwTownPriceSummaryDto.getBizPrice() + ", ");
            debugBuffer.append("BizFee = " + lwTownPriceSummaryDto.getBizFee() + ", ");
            debugBuffer.append("SumBizFee = " + lwTownPriceSummaryDto.getSumBizFee() + ", ");
            debugBuffer.append("BizDianJin = " + lwTownPriceSummaryDto.getBizDianJin() + ", ");
            debugBuffer.append("BizSanXia = " + lwTownPriceSummaryDto.getBizSanXia() + ", ");
            debugBuffer.append("BizKuQu = " + lwTownPriceSummaryDto.getBizKuQu() + ", ");
            debugBuffer.append("BizJiJin = " + lwTownPriceSummaryDto.getBizJiJin() + ", ");
            debugBuffer.append("IndustryQuantity = " + lwTownPriceSummaryDto.getIndustryQuantity() + ", ");
            debugBuffer.append("IndustryScale = " + lwTownPriceSummaryDto.getIndustryScale() + ", ");
            debugBuffer.append("IndustryPrice = " + lwTownPriceSummaryDto.getIndustryPrice() + ", ");
            debugBuffer.append("IndustryFee = " + lwTownPriceSummaryDto.getIndustryFee() + ", ");
            debugBuffer.append("SumIndustryFee = " + lwTownPriceSummaryDto.getSumIndustryFee() + ", ");
            debugBuffer.append("IndustryDianJin = " + lwTownPriceSummaryDto.getIndustryDianJin() + ", ");
            debugBuffer.append("IndustrySanXia = " + lwTownPriceSummaryDto.getIndustrySanXia() + ", ");
            debugBuffer.append("IndustryKuQu = " + lwTownPriceSummaryDto.getIndustryKuQu() + ", ");
            debugBuffer.append("IndustryJiJin = " + lwTownPriceSummaryDto.getIndustryJiJin() + ", ");
            debugBuffer.append("TranferLossQuantity = " + lwTownPriceSummaryDto.getTranferLossQuantity() + ", ");
            debugBuffer.append("RateCode = " + lwTownPriceSummaryDto.getRateCode() + ", ");
            debugBuffer.append("AdjustValue = " + lwTownPriceSummaryDto.getAdjustValue() + ", ");
            debugBuffer.append("RateFee = " + lwTownPriceSummaryDto.getRateFee() + ", ");
            debugBuffer.append("Loan = " + lwTownPriceSummaryDto.getLoan() + ", ");
            debugBuffer.append("SanXiaFee = " + lwTownPriceSummaryDto.getSanXiaFee() + ", ");
            debugBuffer.append("Surcharge = " + lwTownPriceSummaryDto.getSurcharge() + ", ");
            debugBuffer.append("MigrationFee = " + lwTownPriceSummaryDto.getMigrationFee() + ", ");
            debugBuffer.append("SumQuantity = " + lwTownPriceSummaryDto.getSumQuantity() + ", ");
            debugBuffer.append("SumFee = " + lwTownPriceSummaryDto.getSumFee() + ", ");
            debugBuffer.append("SumDianJin = " + lwTownPriceSummaryDto.getSumDianJin() + ", ");
            debugBuffer.append("SumSanXia = " + lwTownPriceSummaryDto.getSumSanXia() + ", ");
            debugBuffer.append("SumJiJin = " + lwTownPriceSummaryDto.getSumJiJin() + ", ");
            debugBuffer.append("ValidStatus = '" + lwTownPriceSummaryDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwTownPriceSummaryDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwTownPriceSummaryDto.getRemark() + "', ");
            debugBuffer.append("SumKuQu = " + lwTownPriceSummaryDto.getSumKuQu() + ", ");
            debugBuffer.append("InputDate = '" + lwTownPriceSummaryDto.getInputDate() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwTownPriceSummaryDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwTownPriceSummaryDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwTownPriceSummaryDto.getLineCode());
        dbManager.setDouble(2,lwTownPriceSummaryDto.getElectricFee());
        dbManager.setDouble(3,lwTownPriceSummaryDto.getPeopleQuantity());
        dbManager.setDouble(4,lwTownPriceSummaryDto.getPeopleScale());
        dbManager.setDouble(5,lwTownPriceSummaryDto.getPeoplePrice());
        dbManager.setDouble(6,lwTownPriceSummaryDto.getPeopleFee());
        dbManager.setDouble(7,lwTownPriceSummaryDto.getSumPeopleFee());
        dbManager.setDouble(8,lwTownPriceSummaryDto.getPeopleDianJin());
        dbManager.setDouble(9,lwTownPriceSummaryDto.getPeopleFeeSanXia());
        dbManager.setDouble(10,lwTownPriceSummaryDto.getPeopleJiJin());
        dbManager.setDouble(11,lwTownPriceSummaryDto.getPeopleKuQu());
        dbManager.setDouble(12,lwTownPriceSummaryDto.getNotPeopleQuantity());
        dbManager.setDouble(13,lwTownPriceSummaryDto.getNotPeopleScale());
        dbManager.setDouble(14,lwTownPriceSummaryDto.getNotPeoplePrice());
        dbManager.setDouble(15,lwTownPriceSummaryDto.getNotPeopleFee());
        dbManager.setDouble(16,lwTownPriceSummaryDto.getSumNotPeopleFee());
        dbManager.setDouble(17,lwTownPriceSummaryDto.getNotPeopleDianJin());
        dbManager.setDouble(18,lwTownPriceSummaryDto.getNotPeopleFeeSanXia());
        dbManager.setDouble(19,lwTownPriceSummaryDto.getNotPeopleJiJin());
        dbManager.setDouble(20,lwTownPriceSummaryDto.getNotPeopleKuQu());
        dbManager.setDouble(21,lwTownPriceSummaryDto.getFarmQuantity());
        dbManager.setDouble(22,lwTownPriceSummaryDto.getFarmScale());
        dbManager.setDouble(23,lwTownPriceSummaryDto.getFarmPrice());
        dbManager.setDouble(24,lwTownPriceSummaryDto.getFarmFee());
        dbManager.setDouble(25,lwTownPriceSummaryDto.getSumFarmFee());
        dbManager.setDouble(26,lwTownPriceSummaryDto.getFarmDianJin());
        dbManager.setDouble(27,lwTownPriceSummaryDto.getFarmSanXia());
        dbManager.setDouble(28,lwTownPriceSummaryDto.getFarmJiJin());
        dbManager.setDouble(29,lwTownPriceSummaryDto.getFarmKuQu());
        dbManager.setDouble(30,lwTownPriceSummaryDto.getProduceQuantity());
        dbManager.setDouble(31,lwTownPriceSummaryDto.getProduceScale());
        dbManager.setDouble(32,lwTownPriceSummaryDto.getProducePrice());
        dbManager.setDouble(33,lwTownPriceSummaryDto.getProduceFee());
        dbManager.setDouble(34,lwTownPriceSummaryDto.getSumProduceFee());
        dbManager.setDouble(35,lwTownPriceSummaryDto.getProduceDianJin());
        dbManager.setDouble(36,lwTownPriceSummaryDto.getProduceSanXia());
        dbManager.setDouble(37,lwTownPriceSummaryDto.getProduceKuQu());
        dbManager.setDouble(38,lwTownPriceSummaryDto.getProduceJiJin());
        dbManager.setDouble(39,lwTownPriceSummaryDto.getBizQuantity());
        dbManager.setDouble(40,lwTownPriceSummaryDto.getBizScale());
        dbManager.setDouble(41,lwTownPriceSummaryDto.getBizPrice());
        dbManager.setDouble(42,lwTownPriceSummaryDto.getBizFee());
        dbManager.setDouble(43,lwTownPriceSummaryDto.getSumBizFee());
        dbManager.setDouble(44,lwTownPriceSummaryDto.getBizDianJin());
        dbManager.setDouble(45,lwTownPriceSummaryDto.getBizSanXia());
        dbManager.setDouble(46,lwTownPriceSummaryDto.getBizKuQu());
        dbManager.setDouble(47,lwTownPriceSummaryDto.getBizJiJin());
        dbManager.setDouble(48,lwTownPriceSummaryDto.getIndustryQuantity());
        dbManager.setDouble(49,lwTownPriceSummaryDto.getIndustryScale());
        dbManager.setDouble(50,lwTownPriceSummaryDto.getIndustryPrice());
        dbManager.setDouble(51,lwTownPriceSummaryDto.getIndustryFee());
        dbManager.setDouble(52,lwTownPriceSummaryDto.getSumIndustryFee());
        dbManager.setDouble(53,lwTownPriceSummaryDto.getIndustryDianJin());
        dbManager.setDouble(54,lwTownPriceSummaryDto.getIndustrySanXia());
        dbManager.setDouble(55,lwTownPriceSummaryDto.getIndustryKuQu());
        dbManager.setDouble(56,lwTownPriceSummaryDto.getIndustryJiJin());
        dbManager.setLong(57,lwTownPriceSummaryDto.getTranferLossQuantity());
        dbManager.setDouble(58,lwTownPriceSummaryDto.getRateCode());
        dbManager.setDouble(59,lwTownPriceSummaryDto.getAdjustValue());
        dbManager.setDouble(60,lwTownPriceSummaryDto.getRateFee());
        dbManager.setDouble(61,lwTownPriceSummaryDto.getLoan());
        dbManager.setDouble(62,lwTownPriceSummaryDto.getSanXiaFee());
        dbManager.setDouble(63,lwTownPriceSummaryDto.getSurcharge());
        dbManager.setDouble(64,lwTownPriceSummaryDto.getMigrationFee());
        dbManager.setDouble(65,lwTownPriceSummaryDto.getSumQuantity());
        dbManager.setDouble(66,lwTownPriceSummaryDto.getSumFee());
        dbManager.setDouble(67,lwTownPriceSummaryDto.getSumDianJin());
        dbManager.setDouble(68,lwTownPriceSummaryDto.getSumSanXia());
        dbManager.setDouble(69,lwTownPriceSummaryDto.getSumJiJin());
        dbManager.setString(70,lwTownPriceSummaryDto.getValidStatus());
        dbManager.setString(71,lwTownPriceSummaryDto.getFlag());
        dbManager.setString(72,lwTownPriceSummaryDto.getRemark());
        dbManager.setDouble(73,lwTownPriceSummaryDto.getSumKuQu());
        dbManager.setString(74,lwTownPriceSummaryDto.getInputDate());
        //设置条件字段;
        dbManager.setString(75,lwTownPriceSummaryDto.getUserNo());
        dbManager.setString(76,lwTownPriceSummaryDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 统计年月
     * @return LwTownPriceSummaryDto
     * @throws Exception
     */
    public LwTownPriceSummaryDto findByPrimaryKey(String userNo,String statMonth)
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
        buffer.append("FROM LwTownPriceSummary ");
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
        LwTownPriceSummaryDto lwTownPriceSummaryDto = null;
        if(resultSet.next()){
            lwTownPriceSummaryDto = new LwTownPriceSummaryDto();
            lwTownPriceSummaryDto.setUserNo(dbManager.getString(resultSet,1));
            lwTownPriceSummaryDto.setLineCode(dbManager.getString(resultSet,2));
            lwTownPriceSummaryDto.setStatMonth(dbManager.getString(resultSet,3));
            lwTownPriceSummaryDto.setElectricFee(dbManager.getDouble(resultSet,4));
            lwTownPriceSummaryDto.setPeopleQuantity(dbManager.getDouble(resultSet,5));
            lwTownPriceSummaryDto.setPeopleScale(dbManager.getDouble(resultSet,6));
            lwTownPriceSummaryDto.setPeoplePrice(dbManager.getDouble(resultSet,7));
            lwTownPriceSummaryDto.setPeopleFee(dbManager.getDouble(resultSet,8));
            lwTownPriceSummaryDto.setSumPeopleFee(dbManager.getDouble(resultSet,9));
            lwTownPriceSummaryDto.setPeopleDianJin(dbManager.getDouble(resultSet,10));
            lwTownPriceSummaryDto.setPeopleFeeSanXia(dbManager.getDouble(resultSet,11));
            lwTownPriceSummaryDto.setPeopleJiJin(dbManager.getDouble(resultSet,12));
            lwTownPriceSummaryDto.setPeopleKuQu(dbManager.getDouble(resultSet,13));
            lwTownPriceSummaryDto.setNotPeopleQuantity(dbManager.getDouble(resultSet,14));
            lwTownPriceSummaryDto.setNotPeopleScale(dbManager.getDouble(resultSet,15));
            lwTownPriceSummaryDto.setNotPeoplePrice(dbManager.getDouble(resultSet,16));
            lwTownPriceSummaryDto.setNotPeopleFee(dbManager.getDouble(resultSet,17));
            lwTownPriceSummaryDto.setSumNotPeopleFee(dbManager.getDouble(resultSet,18));
            lwTownPriceSummaryDto.setNotPeopleDianJin(dbManager.getDouble(resultSet,19));
            lwTownPriceSummaryDto.setNotPeopleFeeSanXia(dbManager.getDouble(resultSet,20));
            lwTownPriceSummaryDto.setNotPeopleJiJin(dbManager.getDouble(resultSet,21));
            lwTownPriceSummaryDto.setNotPeopleKuQu(dbManager.getDouble(resultSet,22));
            lwTownPriceSummaryDto.setFarmQuantity(dbManager.getDouble(resultSet,23));
            lwTownPriceSummaryDto.setFarmScale(dbManager.getDouble(resultSet,24));
            lwTownPriceSummaryDto.setFarmPrice(dbManager.getDouble(resultSet,25));
            lwTownPriceSummaryDto.setFarmFee(dbManager.getDouble(resultSet,26));
            lwTownPriceSummaryDto.setSumFarmFee(dbManager.getDouble(resultSet,27));
            lwTownPriceSummaryDto.setFarmDianJin(dbManager.getDouble(resultSet,28));
            lwTownPriceSummaryDto.setFarmSanXia(dbManager.getDouble(resultSet,29));
            lwTownPriceSummaryDto.setFarmJiJin(dbManager.getDouble(resultSet,30));
            lwTownPriceSummaryDto.setFarmKuQu(dbManager.getDouble(resultSet,31));
            lwTownPriceSummaryDto.setProduceQuantity(dbManager.getDouble(resultSet,32));
            lwTownPriceSummaryDto.setProduceScale(dbManager.getDouble(resultSet,33));
            lwTownPriceSummaryDto.setProducePrice(dbManager.getDouble(resultSet,34));
            lwTownPriceSummaryDto.setProduceFee(dbManager.getDouble(resultSet,35));
            lwTownPriceSummaryDto.setSumProduceFee(dbManager.getDouble(resultSet,36));
            lwTownPriceSummaryDto.setProduceDianJin(dbManager.getDouble(resultSet,37));
            lwTownPriceSummaryDto.setProduceSanXia(dbManager.getDouble(resultSet,38));
            lwTownPriceSummaryDto.setProduceKuQu(dbManager.getDouble(resultSet,39));
            lwTownPriceSummaryDto.setProduceJiJin(dbManager.getDouble(resultSet,40));
            lwTownPriceSummaryDto.setBizQuantity(dbManager.getDouble(resultSet,41));
            lwTownPriceSummaryDto.setBizScale(dbManager.getDouble(resultSet,42));
            lwTownPriceSummaryDto.setBizPrice(dbManager.getDouble(resultSet,43));
            lwTownPriceSummaryDto.setBizFee(dbManager.getDouble(resultSet,44));
            lwTownPriceSummaryDto.setSumBizFee(dbManager.getDouble(resultSet,45));
            lwTownPriceSummaryDto.setBizDianJin(dbManager.getDouble(resultSet,46));
            lwTownPriceSummaryDto.setBizSanXia(dbManager.getDouble(resultSet,47));
            lwTownPriceSummaryDto.setBizKuQu(dbManager.getDouble(resultSet,48));
            lwTownPriceSummaryDto.setBizJiJin(dbManager.getDouble(resultSet,49));
            lwTownPriceSummaryDto.setIndustryQuantity(dbManager.getDouble(resultSet,50));
            lwTownPriceSummaryDto.setIndustryScale(dbManager.getDouble(resultSet,51));
            lwTownPriceSummaryDto.setIndustryPrice(dbManager.getDouble(resultSet,52));
            lwTownPriceSummaryDto.setIndustryFee(dbManager.getDouble(resultSet,53));
            lwTownPriceSummaryDto.setSumIndustryFee(dbManager.getDouble(resultSet,54));
            lwTownPriceSummaryDto.setIndustryDianJin(dbManager.getDouble(resultSet,55));
            lwTownPriceSummaryDto.setIndustrySanXia(dbManager.getDouble(resultSet,56));
            lwTownPriceSummaryDto.setIndustryKuQu(dbManager.getDouble(resultSet,57));
            lwTownPriceSummaryDto.setIndustryJiJin(dbManager.getDouble(resultSet,58));
            lwTownPriceSummaryDto.setTranferLossQuantity(dbManager.getLong(resultSet,59));
            lwTownPriceSummaryDto.setRateCode(dbManager.getDouble(resultSet,60));
            lwTownPriceSummaryDto.setAdjustValue(dbManager.getDouble(resultSet,61));
            lwTownPriceSummaryDto.setRateFee(dbManager.getDouble(resultSet,62));
            lwTownPriceSummaryDto.setLoan(dbManager.getDouble(resultSet,63));
            lwTownPriceSummaryDto.setSanXiaFee(dbManager.getDouble(resultSet,64));
            lwTownPriceSummaryDto.setSurcharge(dbManager.getDouble(resultSet,65));
            lwTownPriceSummaryDto.setMigrationFee(dbManager.getDouble(resultSet,66));
            lwTownPriceSummaryDto.setSumQuantity(dbManager.getDouble(resultSet,67));
            lwTownPriceSummaryDto.setSumFee(dbManager.getDouble(resultSet,68));
            lwTownPriceSummaryDto.setSumDianJin(dbManager.getDouble(resultSet,69));
            lwTownPriceSummaryDto.setSumSanXia(dbManager.getDouble(resultSet,70));
            lwTownPriceSummaryDto.setSumJiJin(dbManager.getDouble(resultSet,71));
            lwTownPriceSummaryDto.setValidStatus(dbManager.getString(resultSet,72));
            lwTownPriceSummaryDto.setFlag(dbManager.getString(resultSet,73));
            lwTownPriceSummaryDto.setRemark(dbManager.getString(resultSet,74));
            lwTownPriceSummaryDto.setSumKuQu(dbManager.getDouble(resultSet,75));
            lwTownPriceSummaryDto.setInputDate(dbManager.getString(resultSet,76));
        }
        resultSet.close();
        return lwTownPriceSummaryDto;
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
        buffer.append("FROM LwTownPriceSummary WHERE ");
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
        LwTownPriceSummaryDto lwTownPriceSummaryDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwTownPriceSummaryDto = new LwTownPriceSummaryDto();
            lwTownPriceSummaryDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwTownPriceSummaryDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwTownPriceSummaryDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwTownPriceSummaryDto.setElectricFee(dbManager.getDouble(resultSet,"ElectricFee"));
            lwTownPriceSummaryDto.setPeopleQuantity(dbManager.getDouble(resultSet,"PeopleQuantity"));
            lwTownPriceSummaryDto.setPeopleScale(dbManager.getDouble(resultSet,"PeopleScale"));
            lwTownPriceSummaryDto.setPeoplePrice(dbManager.getDouble(resultSet,"PeoplePrice"));
            lwTownPriceSummaryDto.setPeopleFee(dbManager.getDouble(resultSet,"PeopleFee"));
            lwTownPriceSummaryDto.setSumPeopleFee(dbManager.getDouble(resultSet,"SumPeopleFee"));
            lwTownPriceSummaryDto.setPeopleDianJin(dbManager.getDouble(resultSet,"PeopleDianJin"));
            lwTownPriceSummaryDto.setPeopleFeeSanXia(dbManager.getDouble(resultSet,"PeopleFeeSanXia"));
            lwTownPriceSummaryDto.setPeopleJiJin(dbManager.getDouble(resultSet,"PeopleJiJin"));
            lwTownPriceSummaryDto.setPeopleKuQu(dbManager.getDouble(resultSet,"PeopleKuQu"));
            lwTownPriceSummaryDto.setNotPeopleQuantity(dbManager.getDouble(resultSet,"NotPeopleQuantity"));
            lwTownPriceSummaryDto.setNotPeopleScale(dbManager.getDouble(resultSet,"NotPeopleScale"));
            lwTownPriceSummaryDto.setNotPeoplePrice(dbManager.getDouble(resultSet,"NotPeoplePrice"));
            lwTownPriceSummaryDto.setNotPeopleFee(dbManager.getDouble(resultSet,"NotPeopleFee"));
            lwTownPriceSummaryDto.setSumNotPeopleFee(dbManager.getDouble(resultSet,"SumNotPeopleFee"));
            lwTownPriceSummaryDto.setNotPeopleDianJin(dbManager.getDouble(resultSet,"NotPeopleDianJin"));
            lwTownPriceSummaryDto.setNotPeopleFeeSanXia(dbManager.getDouble(resultSet,"NotPeopleFeeSanXia"));
            lwTownPriceSummaryDto.setNotPeopleJiJin(dbManager.getDouble(resultSet,"NotPeopleJiJin"));
            lwTownPriceSummaryDto.setNotPeopleKuQu(dbManager.getDouble(resultSet,"NotPeopleKuQu"));
            lwTownPriceSummaryDto.setFarmQuantity(dbManager.getDouble(resultSet,"FarmQuantity"));
            lwTownPriceSummaryDto.setFarmScale(dbManager.getDouble(resultSet,"FarmScale"));
            lwTownPriceSummaryDto.setFarmPrice(dbManager.getDouble(resultSet,"FarmPrice"));
            lwTownPriceSummaryDto.setFarmFee(dbManager.getDouble(resultSet,"FarmFee"));
            lwTownPriceSummaryDto.setSumFarmFee(dbManager.getDouble(resultSet,"SumFarmFee"));
            lwTownPriceSummaryDto.setFarmDianJin(dbManager.getDouble(resultSet,"FarmDianJin"));
            lwTownPriceSummaryDto.setFarmSanXia(dbManager.getDouble(resultSet,"FarmSanXia"));
            lwTownPriceSummaryDto.setFarmJiJin(dbManager.getDouble(resultSet,"FarmJiJin"));
            lwTownPriceSummaryDto.setFarmKuQu(dbManager.getDouble(resultSet,"FarmKuQu"));
            lwTownPriceSummaryDto.setProduceQuantity(dbManager.getDouble(resultSet,"ProduceQuantity"));
            lwTownPriceSummaryDto.setProduceScale(dbManager.getDouble(resultSet,"ProduceScale"));
            lwTownPriceSummaryDto.setProducePrice(dbManager.getDouble(resultSet,"ProducePrice"));
            lwTownPriceSummaryDto.setProduceFee(dbManager.getDouble(resultSet,"ProduceFee"));
            lwTownPriceSummaryDto.setSumProduceFee(dbManager.getDouble(resultSet,"SumProduceFee"));
            lwTownPriceSummaryDto.setProduceDianJin(dbManager.getDouble(resultSet,"ProduceDianJin"));
            lwTownPriceSummaryDto.setProduceSanXia(dbManager.getDouble(resultSet,"ProduceSanXia"));
            lwTownPriceSummaryDto.setProduceKuQu(dbManager.getDouble(resultSet,"ProduceKuQu"));
            lwTownPriceSummaryDto.setProduceJiJin(dbManager.getDouble(resultSet,"ProduceJiJin"));
            lwTownPriceSummaryDto.setBizQuantity(dbManager.getDouble(resultSet,"BizQuantity"));
            lwTownPriceSummaryDto.setBizScale(dbManager.getDouble(resultSet,"BizScale"));
            lwTownPriceSummaryDto.setBizPrice(dbManager.getDouble(resultSet,"BizPrice"));
            lwTownPriceSummaryDto.setBizFee(dbManager.getDouble(resultSet,"BizFee"));
            lwTownPriceSummaryDto.setSumBizFee(dbManager.getDouble(resultSet,"SumBizFee"));
            lwTownPriceSummaryDto.setBizDianJin(dbManager.getDouble(resultSet,"BizDianJin"));
            lwTownPriceSummaryDto.setBizSanXia(dbManager.getDouble(resultSet,"BizSanXia"));
            lwTownPriceSummaryDto.setBizKuQu(dbManager.getDouble(resultSet,"BizKuQu"));
            lwTownPriceSummaryDto.setBizJiJin(dbManager.getDouble(resultSet,"BizJiJin"));
            lwTownPriceSummaryDto.setIndustryQuantity(dbManager.getDouble(resultSet,"IndustryQuantity"));
            lwTownPriceSummaryDto.setIndustryScale(dbManager.getDouble(resultSet,"IndustryScale"));
            lwTownPriceSummaryDto.setIndustryPrice(dbManager.getDouble(resultSet,"IndustryPrice"));
            lwTownPriceSummaryDto.setIndustryFee(dbManager.getDouble(resultSet,"IndustryFee"));
            lwTownPriceSummaryDto.setSumIndustryFee(dbManager.getDouble(resultSet,"SumIndustryFee"));
            lwTownPriceSummaryDto.setIndustryDianJin(dbManager.getDouble(resultSet,"IndustryDianJin"));
            lwTownPriceSummaryDto.setIndustrySanXia(dbManager.getDouble(resultSet,"IndustrySanXia"));
            lwTownPriceSummaryDto.setIndustryKuQu(dbManager.getDouble(resultSet,"IndustryKuQu"));
            lwTownPriceSummaryDto.setIndustryJiJin(dbManager.getDouble(resultSet,"IndustryJiJin"));
            lwTownPriceSummaryDto.setTranferLossQuantity(dbManager.getLong(resultSet,"TranferLossQuantity"));
            lwTownPriceSummaryDto.setRateCode(dbManager.getDouble(resultSet,"RateCode"));
            lwTownPriceSummaryDto.setAdjustValue(dbManager.getDouble(resultSet,"AdjustValue"));
            lwTownPriceSummaryDto.setRateFee(dbManager.getDouble(resultSet,"RateFee"));
            lwTownPriceSummaryDto.setLoan(dbManager.getDouble(resultSet,"Loan"));
            lwTownPriceSummaryDto.setSanXiaFee(dbManager.getDouble(resultSet,"SanXiaFee"));
            lwTownPriceSummaryDto.setSurcharge(dbManager.getDouble(resultSet,"Surcharge"));
            lwTownPriceSummaryDto.setMigrationFee(dbManager.getDouble(resultSet,"MigrationFee"));
            lwTownPriceSummaryDto.setSumQuantity(dbManager.getDouble(resultSet,"SumQuantity"));
            lwTownPriceSummaryDto.setSumFee(dbManager.getDouble(resultSet,"SumFee"));
            lwTownPriceSummaryDto.setSumDianJin(dbManager.getDouble(resultSet,"SumDianJin"));
            lwTownPriceSummaryDto.setSumSanXia(dbManager.getDouble(resultSet,"SumSanXia"));
            lwTownPriceSummaryDto.setSumJiJin(dbManager.getDouble(resultSet,"SumJiJin"));
            lwTownPriceSummaryDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwTownPriceSummaryDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwTownPriceSummaryDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwTownPriceSummaryDto.setSumKuQu(dbManager.getDouble(resultSet,"SumKuQu"));
            lwTownPriceSummaryDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            collection.add(lwTownPriceSummaryDto);
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
        buffer.append("DELETE FROM LwTownPriceSummary WHERE ");
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
        buffer.append("SELECT count(*) FROM LwTownPriceSummary WHERE ");
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
