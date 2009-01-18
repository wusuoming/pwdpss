package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleSummary-趸售电费计算总表的数据访问对象基类<br>
 */
public class DBLwWholeSaleSummaryBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwWholeSaleSummaryBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleSummaryBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public void insert(LwWholeSaleSummaryDto lwWholeSaleSummaryDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwWholeSaleSummary (");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("PointerQuantity,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("TransLoss,");
        buffer.append("LineLoss,");
        buffer.append("UnPointerQuantity,");
        buffer.append("RateCode,");
        buffer.append("AdjustRate,");
        buffer.append("FarmUseScale,");
        buffer.append("FarmUsePrice,");
        buffer.append("FarmUseQuantity,");
        buffer.append("FarmUseFee,");
        buffer.append("ProductScale,");
        buffer.append("ProductPrice,");
        buffer.append("ProductQuantity,");
        buffer.append("ProductFee,");
        buffer.append("DenizenScale,");
        buffer.append("DenizenPrice,");
        buffer.append("DenizenQuantity,");
        buffer.append("DenizenFee,");
        buffer.append("UnDenizenScale,");
        buffer.append("UnDenizenPrice,");
        buffer.append("UnDenizenQuantity,");
        buffer.append("UnDenizenFee,");
        buffer.append("IndustryScale,");
        buffer.append("IndustryPrice,");
        buffer.append("IndustryQuantity,");
        buffer.append("IndustryFee,");
        buffer.append("BizScale,");
        buffer.append("BizPrice,");
        buffer.append("BizQuantity,");
        buffer.append("BizFee,");
        buffer.append("PowerRateFee,");
        buffer.append("UpCompany,");
        buffer.append("PowerFee,");
        buffer.append("InputDate,");
        buffer.append("Kv,");
        buffer.append("Wholesaletype,");
        buffer.append("WorkNum,");
        buffer.append("UnWorkNum,");
        buffer.append("OtherSurcharge,");
        buffer.append("DifferenceQuantity,");
        buffer.append("UnTransLoss,");
        buffer.append("UnLineLoss ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getStatMonth()).append("',");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getPowerClass()).append("',");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getElectricQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getPointerQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getSanXiaFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getSurcharge()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getSumFee()).append(",");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getRemark()).append("',");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getTransLoss()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getLineLoss()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getUnPointerQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getRateCode()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getAdjustRate()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getFarmUseScale()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getFarmUsePrice()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getFarmUseQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getFarmUseFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getProductScale()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getProductPrice()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getProductQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getProductFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getDenizenScale()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getDenizenPrice()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getDenizenQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getDenizenFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getUnDenizenScale()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getUnDenizenPrice()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getUnDenizenQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getUnDenizenFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getIndustryScale()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getIndustryPrice()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getIndustryQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getIndustryFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getBizScale()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getBizPrice()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getBizQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getBizFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getPowerRateFee()).append(",");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getUpCompany()).append("',");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getPowerFee()).append(",");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getKv()).append("',");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getWholesaletype()).append("',");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getWorkNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getUnWorkNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getOtherSurcharge()).append(",");
            debugBuffer.append("'").append(lwWholeSaleSummaryDto.getDifferenceQuantity()).append("',");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getUnTransLoss()).append(",");
            debugBuffer.append("").append(lwWholeSaleSummaryDto.getUnLineLoss()).append(")");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwWholeSaleSummaryDto.getLineCode());
        dbManager.setString(2,lwWholeSaleSummaryDto.getStatMonth());
        dbManager.setString(3,lwWholeSaleSummaryDto.getPowerClass());
        dbManager.setDouble(4,lwWholeSaleSummaryDto.getElectricQuantity());
        dbManager.setDouble(5,lwWholeSaleSummaryDto.getPointerQuantity());
        dbManager.setDouble(6,lwWholeSaleSummaryDto.getSanXiaFee());
        dbManager.setDouble(7,lwWholeSaleSummaryDto.getSurcharge());
        dbManager.setDouble(8,lwWholeSaleSummaryDto.getSumFee());
        dbManager.setString(9,lwWholeSaleSummaryDto.getValidStatus());
        dbManager.setString(10,lwWholeSaleSummaryDto.getFlag());
        dbManager.setString(11,lwWholeSaleSummaryDto.getRemark());
        dbManager.setDouble(12,lwWholeSaleSummaryDto.getTransLoss());
        dbManager.setDouble(13,lwWholeSaleSummaryDto.getLineLoss());
        dbManager.setDouble(14,lwWholeSaleSummaryDto.getUnPointerQuantity());
        dbManager.setDouble(15,lwWholeSaleSummaryDto.getRateCode());
        dbManager.setDouble(16,lwWholeSaleSummaryDto.getAdjustRate());
        dbManager.setDouble(17,lwWholeSaleSummaryDto.getFarmUseScale());
        dbManager.setDouble(18,lwWholeSaleSummaryDto.getFarmUsePrice());
        dbManager.setDouble(19,lwWholeSaleSummaryDto.getFarmUseQuantity());
        dbManager.setDouble(20,lwWholeSaleSummaryDto.getFarmUseFee());
        dbManager.setDouble(21,lwWholeSaleSummaryDto.getProductScale());
        dbManager.setDouble(22,lwWholeSaleSummaryDto.getProductPrice());
        dbManager.setDouble(23,lwWholeSaleSummaryDto.getProductQuantity());
        dbManager.setDouble(24,lwWholeSaleSummaryDto.getProductFee());
        dbManager.setDouble(25,lwWholeSaleSummaryDto.getDenizenScale());
        dbManager.setDouble(26,lwWholeSaleSummaryDto.getDenizenPrice());
        dbManager.setDouble(27,lwWholeSaleSummaryDto.getDenizenQuantity());
        dbManager.setDouble(28,lwWholeSaleSummaryDto.getDenizenFee());
        dbManager.setDouble(29,lwWholeSaleSummaryDto.getUnDenizenScale());
        dbManager.setDouble(30,lwWholeSaleSummaryDto.getUnDenizenPrice());
        dbManager.setDouble(31,lwWholeSaleSummaryDto.getUnDenizenQuantity());
        dbManager.setDouble(32,lwWholeSaleSummaryDto.getUnDenizenFee());
        dbManager.setDouble(33,lwWholeSaleSummaryDto.getIndustryScale());
        dbManager.setDouble(34,lwWholeSaleSummaryDto.getIndustryPrice());
        dbManager.setDouble(35,lwWholeSaleSummaryDto.getIndustryQuantity());
        dbManager.setDouble(36,lwWholeSaleSummaryDto.getIndustryFee());
        dbManager.setDouble(37,lwWholeSaleSummaryDto.getBizScale());
        dbManager.setDouble(38,lwWholeSaleSummaryDto.getBizPrice());
        dbManager.setDouble(39,lwWholeSaleSummaryDto.getBizQuantity());
        dbManager.setDouble(40,lwWholeSaleSummaryDto.getBizFee());
        dbManager.setDouble(41,lwWholeSaleSummaryDto.getPowerRateFee());
        dbManager.setString(42,lwWholeSaleSummaryDto.getUpCompany());
        dbManager.setDouble(43,lwWholeSaleSummaryDto.getPowerFee());
        dbManager.setString(44,lwWholeSaleSummaryDto.getInputDate());
        dbManager.setString(45,lwWholeSaleSummaryDto.getKv());
        dbManager.setString(46,lwWholeSaleSummaryDto.getWholesaletype());
        dbManager.setDouble(47,lwWholeSaleSummaryDto.getWorkNum());
        dbManager.setDouble(48,lwWholeSaleSummaryDto.getUnWorkNum());
        dbManager.setDouble(49,lwWholeSaleSummaryDto.getOtherSurcharge());
        dbManager.setString(50,lwWholeSaleSummaryDto.getDifferenceQuantity());
        dbManager.setDouble(51,lwWholeSaleSummaryDto.getUnTransLoss());
        dbManager.setDouble(52,lwWholeSaleSummaryDto.getUnLineLoss());
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
        buffer.append("INSERT INTO LwWholeSaleSummary (");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("PointerQuantity,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("TransLoss,");
        buffer.append("LineLoss,");
        buffer.append("UnPointerQuantity,");
        buffer.append("RateCode,");
        buffer.append("AdjustRate,");
        buffer.append("FarmUseScale,");
        buffer.append("FarmUsePrice,");
        buffer.append("FarmUseQuantity,");
        buffer.append("FarmUseFee,");
        buffer.append("ProductScale,");
        buffer.append("ProductPrice,");
        buffer.append("ProductQuantity,");
        buffer.append("ProductFee,");
        buffer.append("DenizenScale,");
        buffer.append("DenizenPrice,");
        buffer.append("DenizenQuantity,");
        buffer.append("DenizenFee,");
        buffer.append("UnDenizenScale,");
        buffer.append("UnDenizenPrice,");
        buffer.append("UnDenizenQuantity,");
        buffer.append("UnDenizenFee,");
        buffer.append("IndustryScale,");
        buffer.append("IndustryPrice,");
        buffer.append("IndustryQuantity,");
        buffer.append("IndustryFee,");
        buffer.append("BizScale,");
        buffer.append("BizPrice,");
        buffer.append("BizQuantity,");
        buffer.append("BizFee,");
        buffer.append("PowerRateFee,");
        buffer.append("UpCompany,");
        buffer.append("PowerFee,");
        buffer.append("InputDate,");
        buffer.append("Kv,");
        buffer.append("Wholesaletype,");
        buffer.append("WorkNum,");
        buffer.append("UnWorkNum,");
        buffer.append("OtherSurcharge,");
        buffer.append("DifferenceQuantity,");
        buffer.append("UnTransLoss,");
        buffer.append("UnLineLoss ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwWholeSaleSummaryDto lwWholeSaleSummaryDto = (LwWholeSaleSummaryDto)i.next();
            dbManager.setString(1,lwWholeSaleSummaryDto.getLineCode());
            dbManager.setString(2,lwWholeSaleSummaryDto.getStatMonth());
            dbManager.setString(3,lwWholeSaleSummaryDto.getPowerClass());
            dbManager.setDouble(4,lwWholeSaleSummaryDto.getElectricQuantity());
            dbManager.setDouble(5,lwWholeSaleSummaryDto.getPointerQuantity());
            dbManager.setDouble(6,lwWholeSaleSummaryDto.getSanXiaFee());
            dbManager.setDouble(7,lwWholeSaleSummaryDto.getSurcharge());
            dbManager.setDouble(8,lwWholeSaleSummaryDto.getSumFee());
            dbManager.setString(9,lwWholeSaleSummaryDto.getValidStatus());
            dbManager.setString(10,lwWholeSaleSummaryDto.getFlag());
            dbManager.setString(11,lwWholeSaleSummaryDto.getRemark());
            dbManager.setDouble(12,lwWholeSaleSummaryDto.getTransLoss());
            dbManager.setDouble(13,lwWholeSaleSummaryDto.getLineLoss());
            dbManager.setDouble(14,lwWholeSaleSummaryDto.getUnPointerQuantity());
            dbManager.setDouble(15,lwWholeSaleSummaryDto.getRateCode());
            dbManager.setDouble(16,lwWholeSaleSummaryDto.getAdjustRate());
            dbManager.setDouble(17,lwWholeSaleSummaryDto.getFarmUseScale());
            dbManager.setDouble(18,lwWholeSaleSummaryDto.getFarmUsePrice());
            dbManager.setDouble(19,lwWholeSaleSummaryDto.getFarmUseQuantity());
            dbManager.setDouble(20,lwWholeSaleSummaryDto.getFarmUseFee());
            dbManager.setDouble(21,lwWholeSaleSummaryDto.getProductScale());
            dbManager.setDouble(22,lwWholeSaleSummaryDto.getProductPrice());
            dbManager.setDouble(23,lwWholeSaleSummaryDto.getProductQuantity());
            dbManager.setDouble(24,lwWholeSaleSummaryDto.getProductFee());
            dbManager.setDouble(25,lwWholeSaleSummaryDto.getDenizenScale());
            dbManager.setDouble(26,lwWholeSaleSummaryDto.getDenizenPrice());
            dbManager.setDouble(27,lwWholeSaleSummaryDto.getDenizenQuantity());
            dbManager.setDouble(28,lwWholeSaleSummaryDto.getDenizenFee());
            dbManager.setDouble(29,lwWholeSaleSummaryDto.getUnDenizenScale());
            dbManager.setDouble(30,lwWholeSaleSummaryDto.getUnDenizenPrice());
            dbManager.setDouble(31,lwWholeSaleSummaryDto.getUnDenizenQuantity());
            dbManager.setDouble(32,lwWholeSaleSummaryDto.getUnDenizenFee());
            dbManager.setDouble(33,lwWholeSaleSummaryDto.getIndustryScale());
            dbManager.setDouble(34,lwWholeSaleSummaryDto.getIndustryPrice());
            dbManager.setDouble(35,lwWholeSaleSummaryDto.getIndustryQuantity());
            dbManager.setDouble(36,lwWholeSaleSummaryDto.getIndustryFee());
            dbManager.setDouble(37,lwWholeSaleSummaryDto.getBizScale());
            dbManager.setDouble(38,lwWholeSaleSummaryDto.getBizPrice());
            dbManager.setDouble(39,lwWholeSaleSummaryDto.getBizQuantity());
            dbManager.setDouble(40,lwWholeSaleSummaryDto.getBizFee());
            dbManager.setDouble(41,lwWholeSaleSummaryDto.getPowerRateFee());
            dbManager.setString(42,lwWholeSaleSummaryDto.getUpCompany());
            dbManager.setDouble(43,lwWholeSaleSummaryDto.getPowerFee());
            dbManager.setString(44,lwWholeSaleSummaryDto.getInputDate());
            dbManager.setString(45,lwWholeSaleSummaryDto.getKv());
            dbManager.setString(46,lwWholeSaleSummaryDto.getWholesaletype());
            dbManager.setDouble(47,lwWholeSaleSummaryDto.getWorkNum());
            dbManager.setDouble(48,lwWholeSaleSummaryDto.getUnWorkNum());
            dbManager.setDouble(49,lwWholeSaleSummaryDto.getOtherSurcharge());
            dbManager.setString(50,lwWholeSaleSummaryDto.getDifferenceQuantity());
            dbManager.setDouble(51,lwWholeSaleSummaryDto.getUnTransLoss());
            dbManager.setDouble(52,lwWholeSaleSummaryDto.getUnLineLoss());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param lineCode 线路代码
     * @param statMonth 统计年月
     * @throws Exception
     */
    public void delete(String lineCode,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwWholeSaleSummary ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,statMonth);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public void update(LwWholeSaleSummaryDto lwWholeSaleSummaryDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwWholeSaleSummary SET ");
        buffer.append("PowerClass = ?, ");
        buffer.append("ElectricQuantity = ?, ");
        buffer.append("PointerQuantity = ?, ");
        buffer.append("SanXiaFee = ?, ");
        buffer.append("Surcharge = ?, ");
        buffer.append("SumFee = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("TransLoss = ?, ");
        buffer.append("LineLoss = ?, ");
        buffer.append("UnPointerQuantity = ?, ");
        buffer.append("RateCode = ?, ");
        buffer.append("AdjustRate = ?, ");
        buffer.append("FarmUseScale = ?, ");
        buffer.append("FarmUsePrice = ?, ");
        buffer.append("FarmUseQuantity = ?, ");
        buffer.append("FarmUseFee = ?, ");
        buffer.append("ProductScale = ?, ");
        buffer.append("ProductPrice = ?, ");
        buffer.append("ProductQuantity = ?, ");
        buffer.append("ProductFee = ?, ");
        buffer.append("DenizenScale = ?, ");
        buffer.append("DenizenPrice = ?, ");
        buffer.append("DenizenQuantity = ?, ");
        buffer.append("DenizenFee = ?, ");
        buffer.append("UnDenizenScale = ?, ");
        buffer.append("UnDenizenPrice = ?, ");
        buffer.append("UnDenizenQuantity = ?, ");
        buffer.append("UnDenizenFee = ?, ");
        buffer.append("IndustryScale = ?, ");
        buffer.append("IndustryPrice = ?, ");
        buffer.append("IndustryQuantity = ?, ");
        buffer.append("IndustryFee = ?, ");
        buffer.append("BizScale = ?, ");
        buffer.append("BizPrice = ?, ");
        buffer.append("BizQuantity = ?, ");
        buffer.append("BizFee = ?, ");
        buffer.append("PowerRateFee = ?, ");
        buffer.append("UpCompany = ?, ");
        buffer.append("PowerFee = ?, ");
        buffer.append("InputDate = ?, ");
        buffer.append("Kv = ?, ");
        buffer.append("Wholesaletype = ?, ");
        buffer.append("WorkNum = ?, ");
        buffer.append("UnWorkNum = ?, ");
        buffer.append("OtherSurcharge = ?, ");
        buffer.append("DifferenceQuantity = ?, ");
        buffer.append("UnTransLoss = ?, ");
        buffer.append("UnLineLoss = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwWholeSaleSummary SET ");
            debugBuffer.append("PowerClass = '" + lwWholeSaleSummaryDto.getPowerClass() + "', ");
            debugBuffer.append("ElectricQuantity = " + lwWholeSaleSummaryDto.getElectricQuantity() + ", ");
            debugBuffer.append("PointerQuantity = " + lwWholeSaleSummaryDto.getPointerQuantity() + ", ");
            debugBuffer.append("SanXiaFee = " + lwWholeSaleSummaryDto.getSanXiaFee() + ", ");
            debugBuffer.append("Surcharge = " + lwWholeSaleSummaryDto.getSurcharge() + ", ");
            debugBuffer.append("SumFee = " + lwWholeSaleSummaryDto.getSumFee() + ", ");
            debugBuffer.append("ValidStatus = '" + lwWholeSaleSummaryDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwWholeSaleSummaryDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwWholeSaleSummaryDto.getRemark() + "', ");
            debugBuffer.append("TransLoss = " + lwWholeSaleSummaryDto.getTransLoss() + ", ");
            debugBuffer.append("LineLoss = " + lwWholeSaleSummaryDto.getLineLoss() + ", ");
            debugBuffer.append("UnPointerQuantity = " + lwWholeSaleSummaryDto.getUnPointerQuantity() + ", ");
            debugBuffer.append("RateCode = " + lwWholeSaleSummaryDto.getRateCode() + ", ");
            debugBuffer.append("AdjustRate = " + lwWholeSaleSummaryDto.getAdjustRate() + ", ");
            debugBuffer.append("FarmUseScale = " + lwWholeSaleSummaryDto.getFarmUseScale() + ", ");
            debugBuffer.append("FarmUsePrice = " + lwWholeSaleSummaryDto.getFarmUsePrice() + ", ");
            debugBuffer.append("FarmUseQuantity = " + lwWholeSaleSummaryDto.getFarmUseQuantity() + ", ");
            debugBuffer.append("FarmUseFee = " + lwWholeSaleSummaryDto.getFarmUseFee() + ", ");
            debugBuffer.append("ProductScale = " + lwWholeSaleSummaryDto.getProductScale() + ", ");
            debugBuffer.append("ProductPrice = " + lwWholeSaleSummaryDto.getProductPrice() + ", ");
            debugBuffer.append("ProductQuantity = " + lwWholeSaleSummaryDto.getProductQuantity() + ", ");
            debugBuffer.append("ProductFee = " + lwWholeSaleSummaryDto.getProductFee() + ", ");
            debugBuffer.append("DenizenScale = " + lwWholeSaleSummaryDto.getDenizenScale() + ", ");
            debugBuffer.append("DenizenPrice = " + lwWholeSaleSummaryDto.getDenizenPrice() + ", ");
            debugBuffer.append("DenizenQuantity = " + lwWholeSaleSummaryDto.getDenizenQuantity() + ", ");
            debugBuffer.append("DenizenFee = " + lwWholeSaleSummaryDto.getDenizenFee() + ", ");
            debugBuffer.append("UnDenizenScale = " + lwWholeSaleSummaryDto.getUnDenizenScale() + ", ");
            debugBuffer.append("UnDenizenPrice = " + lwWholeSaleSummaryDto.getUnDenizenPrice() + ", ");
            debugBuffer.append("UnDenizenQuantity = " + lwWholeSaleSummaryDto.getUnDenizenQuantity() + ", ");
            debugBuffer.append("UnDenizenFee = " + lwWholeSaleSummaryDto.getUnDenizenFee() + ", ");
            debugBuffer.append("IndustryScale = " + lwWholeSaleSummaryDto.getIndustryScale() + ", ");
            debugBuffer.append("IndustryPrice = " + lwWholeSaleSummaryDto.getIndustryPrice() + ", ");
            debugBuffer.append("IndustryQuantity = " + lwWholeSaleSummaryDto.getIndustryQuantity() + ", ");
            debugBuffer.append("IndustryFee = " + lwWholeSaleSummaryDto.getIndustryFee() + ", ");
            debugBuffer.append("BizScale = " + lwWholeSaleSummaryDto.getBizScale() + ", ");
            debugBuffer.append("BizPrice = " + lwWholeSaleSummaryDto.getBizPrice() + ", ");
            debugBuffer.append("BizQuantity = " + lwWholeSaleSummaryDto.getBizQuantity() + ", ");
            debugBuffer.append("BizFee = " + lwWholeSaleSummaryDto.getBizFee() + ", ");
            debugBuffer.append("PowerRateFee = " + lwWholeSaleSummaryDto.getPowerRateFee() + ", ");
            debugBuffer.append("UpCompany = '" + lwWholeSaleSummaryDto.getUpCompany() + "', ");
            debugBuffer.append("PowerFee = " + lwWholeSaleSummaryDto.getPowerFee() + ", ");
            debugBuffer.append("InputDate = '" + lwWholeSaleSummaryDto.getInputDate() + "', ");
            debugBuffer.append("Kv = '" + lwWholeSaleSummaryDto.getKv() + "', ");
            debugBuffer.append("Wholesaletype = '" + lwWholeSaleSummaryDto.getWholesaletype() + "', ");
            debugBuffer.append("WorkNum = " + lwWholeSaleSummaryDto.getWorkNum() + ", ");
            debugBuffer.append("UnWorkNum = " + lwWholeSaleSummaryDto.getUnWorkNum() + ", ");
            debugBuffer.append("OtherSurcharge = " + lwWholeSaleSummaryDto.getOtherSurcharge() + ", ");
            debugBuffer.append("DifferenceQuantity = '" + lwWholeSaleSummaryDto.getDifferenceQuantity() + "', ");
            debugBuffer.append("UnTransLoss = " + lwWholeSaleSummaryDto.getUnTransLoss() + ", ");
            debugBuffer.append("UnLineLoss = " + lwWholeSaleSummaryDto.getUnLineLoss() + " ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lwWholeSaleSummaryDto.getLineCode()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwWholeSaleSummaryDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwWholeSaleSummaryDto.getPowerClass());
        dbManager.setDouble(2,lwWholeSaleSummaryDto.getElectricQuantity());
        dbManager.setDouble(3,lwWholeSaleSummaryDto.getPointerQuantity());
        dbManager.setDouble(4,lwWholeSaleSummaryDto.getSanXiaFee());
        dbManager.setDouble(5,lwWholeSaleSummaryDto.getSurcharge());
        dbManager.setDouble(6,lwWholeSaleSummaryDto.getSumFee());
        dbManager.setString(7,lwWholeSaleSummaryDto.getValidStatus());
        dbManager.setString(8,lwWholeSaleSummaryDto.getFlag());
        dbManager.setString(9,lwWholeSaleSummaryDto.getRemark());
        dbManager.setDouble(10,lwWholeSaleSummaryDto.getTransLoss());
        dbManager.setDouble(11,lwWholeSaleSummaryDto.getLineLoss());
        dbManager.setDouble(12,lwWholeSaleSummaryDto.getUnPointerQuantity());
        dbManager.setDouble(13,lwWholeSaleSummaryDto.getRateCode());
        dbManager.setDouble(14,lwWholeSaleSummaryDto.getAdjustRate());
        dbManager.setDouble(15,lwWholeSaleSummaryDto.getFarmUseScale());
        dbManager.setDouble(16,lwWholeSaleSummaryDto.getFarmUsePrice());
        dbManager.setDouble(17,lwWholeSaleSummaryDto.getFarmUseQuantity());
        dbManager.setDouble(18,lwWholeSaleSummaryDto.getFarmUseFee());
        dbManager.setDouble(19,lwWholeSaleSummaryDto.getProductScale());
        dbManager.setDouble(20,lwWholeSaleSummaryDto.getProductPrice());
        dbManager.setDouble(21,lwWholeSaleSummaryDto.getProductQuantity());
        dbManager.setDouble(22,lwWholeSaleSummaryDto.getProductFee());
        dbManager.setDouble(23,lwWholeSaleSummaryDto.getDenizenScale());
        dbManager.setDouble(24,lwWholeSaleSummaryDto.getDenizenPrice());
        dbManager.setDouble(25,lwWholeSaleSummaryDto.getDenizenQuantity());
        dbManager.setDouble(26,lwWholeSaleSummaryDto.getDenizenFee());
        dbManager.setDouble(27,lwWholeSaleSummaryDto.getUnDenizenScale());
        dbManager.setDouble(28,lwWholeSaleSummaryDto.getUnDenizenPrice());
        dbManager.setDouble(29,lwWholeSaleSummaryDto.getUnDenizenQuantity());
        dbManager.setDouble(30,lwWholeSaleSummaryDto.getUnDenizenFee());
        dbManager.setDouble(31,lwWholeSaleSummaryDto.getIndustryScale());
        dbManager.setDouble(32,lwWholeSaleSummaryDto.getIndustryPrice());
        dbManager.setDouble(33,lwWholeSaleSummaryDto.getIndustryQuantity());
        dbManager.setDouble(34,lwWholeSaleSummaryDto.getIndustryFee());
        dbManager.setDouble(35,lwWholeSaleSummaryDto.getBizScale());
        dbManager.setDouble(36,lwWholeSaleSummaryDto.getBizPrice());
        dbManager.setDouble(37,lwWholeSaleSummaryDto.getBizQuantity());
        dbManager.setDouble(38,lwWholeSaleSummaryDto.getBizFee());
        dbManager.setDouble(39,lwWholeSaleSummaryDto.getPowerRateFee());
        dbManager.setString(40,lwWholeSaleSummaryDto.getUpCompany());
        dbManager.setDouble(41,lwWholeSaleSummaryDto.getPowerFee());
        dbManager.setString(42,lwWholeSaleSummaryDto.getInputDate());
        dbManager.setString(43,lwWholeSaleSummaryDto.getKv());
        dbManager.setString(44,lwWholeSaleSummaryDto.getWholesaletype());
        dbManager.setDouble(45,lwWholeSaleSummaryDto.getWorkNum());
        dbManager.setDouble(46,lwWholeSaleSummaryDto.getUnWorkNum());
        dbManager.setDouble(47,lwWholeSaleSummaryDto.getOtherSurcharge());
        dbManager.setString(48,lwWholeSaleSummaryDto.getDifferenceQuantity());
        dbManager.setDouble(49,lwWholeSaleSummaryDto.getUnTransLoss());
        dbManager.setDouble(50,lwWholeSaleSummaryDto.getUnLineLoss());
        //设置条件字段;
        dbManager.setString(51,lwWholeSaleSummaryDto.getLineCode());
        dbManager.setString(52,lwWholeSaleSummaryDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param lineCode 线路代码
     * @param statMonth 统计年月
     * @return LwWholeSaleSummaryDto
     * @throws Exception
     */
    public LwWholeSaleSummaryDto findByPrimaryKey(String lineCode,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("PointerQuantity,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("TransLoss,");
        buffer.append("LineLoss,");
        buffer.append("UnPointerQuantity,");
        buffer.append("RateCode,");
        buffer.append("AdjustRate,");
        buffer.append("FarmUseScale,");
        buffer.append("FarmUsePrice,");
        buffer.append("FarmUseQuantity,");
        buffer.append("FarmUseFee,");
        buffer.append("ProductScale,");
        buffer.append("ProductPrice,");
        buffer.append("ProductQuantity,");
        buffer.append("ProductFee,");
        buffer.append("DenizenScale,");
        buffer.append("DenizenPrice,");
        buffer.append("DenizenQuantity,");
        buffer.append("DenizenFee,");
        buffer.append("UnDenizenScale,");
        buffer.append("UnDenizenPrice,");
        buffer.append("UnDenizenQuantity,");
        buffer.append("UnDenizenFee,");
        buffer.append("IndustryScale,");
        buffer.append("IndustryPrice,");
        buffer.append("IndustryQuantity,");
        buffer.append("IndustryFee,");
        buffer.append("BizScale,");
        buffer.append("BizPrice,");
        buffer.append("BizQuantity,");
        buffer.append("BizFee,");
        buffer.append("PowerRateFee,");
        buffer.append("UpCompany,");
        buffer.append("PowerFee,");
        buffer.append("InputDate,");
        buffer.append("Kv,");
        buffer.append("Wholesaletype,");
        buffer.append("WorkNum,");
        buffer.append("UnWorkNum,");
        buffer.append("OtherSurcharge,");
        buffer.append("DifferenceQuantity,");
        buffer.append("UnTransLoss,");
        buffer.append("UnLineLoss ");
        buffer.append("FROM LwWholeSaleSummary ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,statMonth);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwWholeSaleSummaryDto lwWholeSaleSummaryDto = null;
        if(resultSet.next()){
            lwWholeSaleSummaryDto = new LwWholeSaleSummaryDto();
            lwWholeSaleSummaryDto.setLineCode(dbManager.getString(resultSet,1));
            lwWholeSaleSummaryDto.setStatMonth(dbManager.getString(resultSet,2));
            lwWholeSaleSummaryDto.setPowerClass(dbManager.getString(resultSet,3));
            lwWholeSaleSummaryDto.setElectricQuantity(dbManager.getDouble(resultSet,4));
            lwWholeSaleSummaryDto.setPointerQuantity(dbManager.getDouble(resultSet,5));
            lwWholeSaleSummaryDto.setSanXiaFee(dbManager.getDouble(resultSet,6));
            lwWholeSaleSummaryDto.setSurcharge(dbManager.getDouble(resultSet,7));
            lwWholeSaleSummaryDto.setSumFee(dbManager.getDouble(resultSet,8));
            lwWholeSaleSummaryDto.setValidStatus(dbManager.getString(resultSet,9));
            lwWholeSaleSummaryDto.setFlag(dbManager.getString(resultSet,10));
            lwWholeSaleSummaryDto.setRemark(dbManager.getString(resultSet,11));
            lwWholeSaleSummaryDto.setTransLoss(dbManager.getDouble(resultSet,12));
            lwWholeSaleSummaryDto.setLineLoss(dbManager.getDouble(resultSet,13));
            lwWholeSaleSummaryDto.setUnPointerQuantity(dbManager.getDouble(resultSet,14));
            lwWholeSaleSummaryDto.setRateCode(dbManager.getDouble(resultSet,15));
            lwWholeSaleSummaryDto.setAdjustRate(dbManager.getDouble(resultSet,16));
            lwWholeSaleSummaryDto.setFarmUseScale(dbManager.getDouble(resultSet,17));
            lwWholeSaleSummaryDto.setFarmUsePrice(dbManager.getDouble(resultSet,18));
            lwWholeSaleSummaryDto.setFarmUseQuantity(dbManager.getDouble(resultSet,19));
            lwWholeSaleSummaryDto.setFarmUseFee(dbManager.getDouble(resultSet,20));
            lwWholeSaleSummaryDto.setProductScale(dbManager.getDouble(resultSet,21));
            lwWholeSaleSummaryDto.setProductPrice(dbManager.getDouble(resultSet,22));
            lwWholeSaleSummaryDto.setProductQuantity(dbManager.getDouble(resultSet,23));
            lwWholeSaleSummaryDto.setProductFee(dbManager.getDouble(resultSet,24));
            lwWholeSaleSummaryDto.setDenizenScale(dbManager.getDouble(resultSet,25));
            lwWholeSaleSummaryDto.setDenizenPrice(dbManager.getDouble(resultSet,26));
            lwWholeSaleSummaryDto.setDenizenQuantity(dbManager.getDouble(resultSet,27));
            lwWholeSaleSummaryDto.setDenizenFee(dbManager.getDouble(resultSet,28));
            lwWholeSaleSummaryDto.setUnDenizenScale(dbManager.getDouble(resultSet,29));
            lwWholeSaleSummaryDto.setUnDenizenPrice(dbManager.getDouble(resultSet,30));
            lwWholeSaleSummaryDto.setUnDenizenQuantity(dbManager.getDouble(resultSet,31));
            lwWholeSaleSummaryDto.setUnDenizenFee(dbManager.getDouble(resultSet,32));
            lwWholeSaleSummaryDto.setIndustryScale(dbManager.getDouble(resultSet,33));
            lwWholeSaleSummaryDto.setIndustryPrice(dbManager.getDouble(resultSet,34));
            lwWholeSaleSummaryDto.setIndustryQuantity(dbManager.getDouble(resultSet,35));
            lwWholeSaleSummaryDto.setIndustryFee(dbManager.getDouble(resultSet,36));
            lwWholeSaleSummaryDto.setBizScale(dbManager.getDouble(resultSet,37));
            lwWholeSaleSummaryDto.setBizPrice(dbManager.getDouble(resultSet,38));
            lwWholeSaleSummaryDto.setBizQuantity(dbManager.getDouble(resultSet,39));
            lwWholeSaleSummaryDto.setBizFee(dbManager.getDouble(resultSet,40));
            lwWholeSaleSummaryDto.setPowerRateFee(dbManager.getDouble(resultSet,41));
            lwWholeSaleSummaryDto.setUpCompany(dbManager.getString(resultSet,42));
            lwWholeSaleSummaryDto.setPowerFee(dbManager.getDouble(resultSet,43));
            lwWholeSaleSummaryDto.setInputDate(dbManager.getString(resultSet,44));
            lwWholeSaleSummaryDto.setKv(dbManager.getString(resultSet,45));
            lwWholeSaleSummaryDto.setWholesaletype(dbManager.getString(resultSet,46));
            lwWholeSaleSummaryDto.setWorkNum(dbManager.getDouble(resultSet,47));
            lwWholeSaleSummaryDto.setUnWorkNum(dbManager.getDouble(resultSet,48));
            lwWholeSaleSummaryDto.setOtherSurcharge(dbManager.getDouble(resultSet,49));
            lwWholeSaleSummaryDto.setDifferenceQuantity(dbManager.getString(resultSet,50));
            lwWholeSaleSummaryDto.setUnTransLoss(dbManager.getDouble(resultSet,51));
            lwWholeSaleSummaryDto.setUnLineLoss(dbManager.getDouble(resultSet,52));
        }
        resultSet.close();
        return lwWholeSaleSummaryDto;
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
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("PointerQuantity,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("TransLoss,");
        buffer.append("LineLoss,");
        buffer.append("UnPointerQuantity,");
        buffer.append("RateCode,");
        buffer.append("AdjustRate,");
        buffer.append("FarmUseScale,");
        buffer.append("FarmUsePrice,");
        buffer.append("FarmUseQuantity,");
        buffer.append("FarmUseFee,");
        buffer.append("ProductScale,");
        buffer.append("ProductPrice,");
        buffer.append("ProductQuantity,");
        buffer.append("ProductFee,");
        buffer.append("DenizenScale,");
        buffer.append("DenizenPrice,");
        buffer.append("DenizenQuantity,");
        buffer.append("DenizenFee,");
        buffer.append("UnDenizenScale,");
        buffer.append("UnDenizenPrice,");
        buffer.append("UnDenizenQuantity,");
        buffer.append("UnDenizenFee,");
        buffer.append("IndustryScale,");
        buffer.append("IndustryPrice,");
        buffer.append("IndustryQuantity,");
        buffer.append("IndustryFee,");
        buffer.append("BizScale,");
        buffer.append("BizPrice,");
        buffer.append("BizQuantity,");
        buffer.append("BizFee,");
        buffer.append("PowerRateFee,");
        buffer.append("UpCompany,");
        buffer.append("PowerFee,");
        buffer.append("InputDate,");
        buffer.append("Kv,");
        buffer.append("Wholesaletype,");
        buffer.append("WorkNum,");
        buffer.append("UnWorkNum,");
        buffer.append("OtherSurcharge,");
        buffer.append("DifferenceQuantity,");
        buffer.append("UnTransLoss,");
        buffer.append("UnLineLoss ");
        buffer.append("FROM LwWholeSaleSummary WHERE ");
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
        LwWholeSaleSummaryDto lwWholeSaleSummaryDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwWholeSaleSummaryDto = new LwWholeSaleSummaryDto();
            lwWholeSaleSummaryDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwWholeSaleSummaryDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwWholeSaleSummaryDto.setPowerClass(dbManager.getString(resultSet,"PowerClass"));
            lwWholeSaleSummaryDto.setElectricQuantity(dbManager.getDouble(resultSet,"ElectricQuantity"));
            lwWholeSaleSummaryDto.setPointerQuantity(dbManager.getDouble(resultSet,"PointerQuantity"));
            lwWholeSaleSummaryDto.setSanXiaFee(dbManager.getDouble(resultSet,"SanXiaFee"));
            lwWholeSaleSummaryDto.setSurcharge(dbManager.getDouble(resultSet,"Surcharge"));
            lwWholeSaleSummaryDto.setSumFee(dbManager.getDouble(resultSet,"SumFee"));
            lwWholeSaleSummaryDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwWholeSaleSummaryDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwWholeSaleSummaryDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwWholeSaleSummaryDto.setTransLoss(dbManager.getDouble(resultSet,"TransLoss"));
            lwWholeSaleSummaryDto.setLineLoss(dbManager.getDouble(resultSet,"LineLoss"));
            lwWholeSaleSummaryDto.setUnPointerQuantity(dbManager.getDouble(resultSet,"UnPointerQuantity"));
            lwWholeSaleSummaryDto.setRateCode(dbManager.getDouble(resultSet,"RateCode"));
            lwWholeSaleSummaryDto.setAdjustRate(dbManager.getDouble(resultSet,"AdjustRate"));
            lwWholeSaleSummaryDto.setFarmUseScale(dbManager.getDouble(resultSet,"FarmUseScale"));
            lwWholeSaleSummaryDto.setFarmUsePrice(dbManager.getDouble(resultSet,"FarmUsePrice"));
            lwWholeSaleSummaryDto.setFarmUseQuantity(dbManager.getDouble(resultSet,"FarmUseQuantity"));
            lwWholeSaleSummaryDto.setFarmUseFee(dbManager.getDouble(resultSet,"FarmUseFee"));
            lwWholeSaleSummaryDto.setProductScale(dbManager.getDouble(resultSet,"ProductScale"));
            lwWholeSaleSummaryDto.setProductPrice(dbManager.getDouble(resultSet,"ProductPrice"));
            lwWholeSaleSummaryDto.setProductQuantity(dbManager.getDouble(resultSet,"ProductQuantity"));
            lwWholeSaleSummaryDto.setProductFee(dbManager.getDouble(resultSet,"ProductFee"));
            lwWholeSaleSummaryDto.setDenizenScale(dbManager.getDouble(resultSet,"DenizenScale"));
            lwWholeSaleSummaryDto.setDenizenPrice(dbManager.getDouble(resultSet,"DenizenPrice"));
            lwWholeSaleSummaryDto.setDenizenQuantity(dbManager.getDouble(resultSet,"DenizenQuantity"));
            lwWholeSaleSummaryDto.setDenizenFee(dbManager.getDouble(resultSet,"DenizenFee"));
            lwWholeSaleSummaryDto.setUnDenizenScale(dbManager.getDouble(resultSet,"UnDenizenScale"));
            lwWholeSaleSummaryDto.setUnDenizenPrice(dbManager.getDouble(resultSet,"UnDenizenPrice"));
            lwWholeSaleSummaryDto.setUnDenizenQuantity(dbManager.getDouble(resultSet,"UnDenizenQuantity"));
            lwWholeSaleSummaryDto.setUnDenizenFee(dbManager.getDouble(resultSet,"UnDenizenFee"));
            lwWholeSaleSummaryDto.setIndustryScale(dbManager.getDouble(resultSet,"IndustryScale"));
            lwWholeSaleSummaryDto.setIndustryPrice(dbManager.getDouble(resultSet,"IndustryPrice"));
            lwWholeSaleSummaryDto.setIndustryQuantity(dbManager.getDouble(resultSet,"IndustryQuantity"));
            lwWholeSaleSummaryDto.setIndustryFee(dbManager.getDouble(resultSet,"IndustryFee"));
            lwWholeSaleSummaryDto.setBizScale(dbManager.getDouble(resultSet,"BizScale"));
            lwWholeSaleSummaryDto.setBizPrice(dbManager.getDouble(resultSet,"BizPrice"));
            lwWholeSaleSummaryDto.setBizQuantity(dbManager.getDouble(resultSet,"BizQuantity"));
            lwWholeSaleSummaryDto.setBizFee(dbManager.getDouble(resultSet,"BizFee"));
            lwWholeSaleSummaryDto.setPowerRateFee(dbManager.getDouble(resultSet,"PowerRateFee"));
            lwWholeSaleSummaryDto.setUpCompany(dbManager.getString(resultSet,"UpCompany"));
            lwWholeSaleSummaryDto.setPowerFee(dbManager.getDouble(resultSet,"PowerFee"));
            lwWholeSaleSummaryDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwWholeSaleSummaryDto.setKv(dbManager.getString(resultSet,"Kv"));
            lwWholeSaleSummaryDto.setWholesaletype(dbManager.getString(resultSet,"Wholesaletype"));
            lwWholeSaleSummaryDto.setWorkNum(dbManager.getDouble(resultSet,"WorkNum"));
            lwWholeSaleSummaryDto.setUnWorkNum(dbManager.getDouble(resultSet,"UnWorkNum"));
            lwWholeSaleSummaryDto.setOtherSurcharge(dbManager.getDouble(resultSet,"OtherSurcharge"));
            lwWholeSaleSummaryDto.setDifferenceQuantity(dbManager.getString(resultSet,"DifferenceQuantity"));
            lwWholeSaleSummaryDto.setUnTransLoss(dbManager.getDouble(resultSet,"UnTransLoss"));
            lwWholeSaleSummaryDto.setUnLineLoss(dbManager.getDouble(resultSet,"UnLineLoss"));
            collection.add(lwWholeSaleSummaryDto);
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
        buffer.append("DELETE FROM LwWholeSaleSummary WHERE ");
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
        buffer.append("SELECT count(*) FROM LwWholeSaleSummary WHERE ");
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
