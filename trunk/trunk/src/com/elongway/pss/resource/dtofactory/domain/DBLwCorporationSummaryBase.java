package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWCorporationSummary-大工业销售计算总表的数据访问对象基类<br>
 */
public class DBLwCorporationSummaryBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwCorporationSummaryBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwCorporationSummaryBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public void insert(LwCorporationSummaryDto lwCorporationSummaryDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwCorporationSummary (");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("PowerFee,");
        buffer.append("UnDenizenQuantity,");
        buffer.append("PointerQuantity,");
        buffer.append("PointerPrice,");
        buffer.append("PointerFee,");
        buffer.append("UnDenizenPrice,");
        buffer.append("UnDenizenFee,");
        buffer.append("AjustRate,");
        buffer.append("PowerRateFee,");
        buffer.append("RateCode,");
        buffer.append("NeedQuantity,");
        buffer.append("NeedPrice,");
        buffer.append("NeedFee,");
        buffer.append("UserNo,");
        buffer.append("ContentQuantity,");
        buffer.append("ContentPrice,");
        buffer.append("ContentFee,");
        buffer.append("UnPointerQuantity,");
        buffer.append("SurchargePrice,");
        buffer.append("SanXiaPrice,");
        buffer.append("PowerPrice,");
        buffer.append("ValleyQuantity,");
        buffer.append("PeakQuantity,");
        buffer.append("PeakPrice,");
        buffer.append("ValleyPrice,");
        buffer.append("PeakFee,");
        buffer.append("ValleyFee,");
        buffer.append("LossQuantity,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("SumFee,");
        buffer.append("InputDate,");
        buffer.append("SumPointerQuantity,");
        buffer.append("QuantityStyle,");
        buffer.append("BeforPrice,");
        buffer.append("LastPrice,");
        buffer.append("BeforPower,");
        buffer.append("LastPower,");
        buffer.append("BeforFee,");
        buffer.append("LastFee,");
        buffer.append("Ifchange,");
        buffer.append("NeedPointer,");
        buffer.append("LineLoss,");
        buffer.append("UnLineLoss,");
        buffer.append("TaobiaoQuantity,");
        buffer.append("TaobiaoPrice,");
        buffer.append("TaobiaoFee,");
        buffer.append("UnLossQuantity,");
        buffer.append("TaobiaoName,");
        buffer.append("Taobiaoflag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getStatMonth()).append("',");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getPowerClass()).append("',");
            debugBuffer.append("").append(lwCorporationSummaryDto.getElectricQuantity()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getSanXiaFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getSurcharge()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getPowerFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getUnDenizenQuantity()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getPointerQuantity()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getPointerPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getPointerFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getUnDenizenPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getUnDenizenFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getAjustRate()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getPowerRateFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getRateCode()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getNeedQuantity()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getNeedPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getNeedFee()).append(",");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getUserNo()).append("',");
            debugBuffer.append("").append(lwCorporationSummaryDto.getContentQuantity()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getContentPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getContentFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getUnPointerQuantity()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getSurchargePrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getSanXiaPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getPowerPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getValleyQuantity()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getPeakQuantity()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getPeakPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getValleyPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getPeakFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getValleyFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getLossQuantity()).append(",");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getRemark()).append("',");
            debugBuffer.append("").append(lwCorporationSummaryDto.getSumFee()).append(",");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getInputDate()).append("',");
            debugBuffer.append("").append(lwCorporationSummaryDto.getSumPointerQuantity()).append(",");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getQuantityStyle()).append("',");
            debugBuffer.append("").append(lwCorporationSummaryDto.getBeforPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getLastPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getBeforPower()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getLastPower()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getBeforFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getLastFee()).append(",");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getIfchange()).append("',");
            debugBuffer.append("").append(lwCorporationSummaryDto.getNeedPointer()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getLineLoss()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getUnLineLoss()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getTaobiaoQuantity()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getTaobiaoPrice()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getTaobiaoFee()).append(",");
            debugBuffer.append("").append(lwCorporationSummaryDto.getUnLossQuantity()).append(",");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getTaobiaoName()).append("',");
            debugBuffer.append("'").append(lwCorporationSummaryDto.getTaobiaoflag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwCorporationSummaryDto.getLineCode());
        dbManager.setString(2,lwCorporationSummaryDto.getStatMonth());
        dbManager.setString(3,lwCorporationSummaryDto.getPowerClass());
        dbManager.setDouble(4,lwCorporationSummaryDto.getElectricQuantity());
        dbManager.setDouble(5,lwCorporationSummaryDto.getSanXiaFee());
        dbManager.setDouble(6,lwCorporationSummaryDto.getSurcharge());
        dbManager.setDouble(7,lwCorporationSummaryDto.getPowerFee());
        dbManager.setDouble(8,lwCorporationSummaryDto.getUnDenizenQuantity());
        dbManager.setDouble(9,lwCorporationSummaryDto.getPointerQuantity());
        dbManager.setDouble(10,lwCorporationSummaryDto.getPointerPrice());
        dbManager.setDouble(11,lwCorporationSummaryDto.getPointerFee());
        dbManager.setDouble(12,lwCorporationSummaryDto.getUnDenizenPrice());
        dbManager.setDouble(13,lwCorporationSummaryDto.getUnDenizenFee());
        dbManager.setDouble(14,lwCorporationSummaryDto.getAjustRate());
        dbManager.setDouble(15,lwCorporationSummaryDto.getPowerRateFee());
        dbManager.setDouble(16,lwCorporationSummaryDto.getRateCode());
        dbManager.setDouble(17,lwCorporationSummaryDto.getNeedQuantity());
        dbManager.setDouble(18,lwCorporationSummaryDto.getNeedPrice());
        dbManager.setDouble(19,lwCorporationSummaryDto.getNeedFee());
        dbManager.setString(20,lwCorporationSummaryDto.getUserNo());
        dbManager.setDouble(21,lwCorporationSummaryDto.getContentQuantity());
        dbManager.setDouble(22,lwCorporationSummaryDto.getContentPrice());
        dbManager.setDouble(23,lwCorporationSummaryDto.getContentFee());
        dbManager.setDouble(24,lwCorporationSummaryDto.getUnPointerQuantity());
        dbManager.setDouble(25,lwCorporationSummaryDto.getSurchargePrice());
        dbManager.setDouble(26,lwCorporationSummaryDto.getSanXiaPrice());
        dbManager.setDouble(27,lwCorporationSummaryDto.getPowerPrice());
        dbManager.setDouble(28,lwCorporationSummaryDto.getValleyQuantity());
        dbManager.setDouble(29,lwCorporationSummaryDto.getPeakQuantity());
        dbManager.setDouble(30,lwCorporationSummaryDto.getPeakPrice());
        dbManager.setDouble(31,lwCorporationSummaryDto.getValleyPrice());
        dbManager.setDouble(32,lwCorporationSummaryDto.getPeakFee());
        dbManager.setDouble(33,lwCorporationSummaryDto.getValleyFee());
        dbManager.setDouble(34,lwCorporationSummaryDto.getLossQuantity());
        dbManager.setString(35,lwCorporationSummaryDto.getFlag());
        dbManager.setString(36,lwCorporationSummaryDto.getRemark());
        dbManager.setDouble(37,lwCorporationSummaryDto.getSumFee());
        dbManager.setString(38,lwCorporationSummaryDto.getInputDate());
        dbManager.setDouble(39,lwCorporationSummaryDto.getSumPointerQuantity());
        dbManager.setString(40,lwCorporationSummaryDto.getQuantityStyle());
        dbManager.setDouble(41,lwCorporationSummaryDto.getBeforPrice());
        dbManager.setDouble(42,lwCorporationSummaryDto.getLastPrice());
        dbManager.setDouble(43,lwCorporationSummaryDto.getBeforPower());
        dbManager.setDouble(44,lwCorporationSummaryDto.getLastPower());
        dbManager.setDouble(45,lwCorporationSummaryDto.getBeforFee());
        dbManager.setDouble(46,lwCorporationSummaryDto.getLastFee());
        dbManager.setString(47,lwCorporationSummaryDto.getIfchange());
        dbManager.setDouble(48,lwCorporationSummaryDto.getNeedPointer());
        dbManager.setDouble(49,lwCorporationSummaryDto.getLineLoss());
        dbManager.setDouble(50,lwCorporationSummaryDto.getUnLineLoss());
        dbManager.setDouble(51,lwCorporationSummaryDto.getTaobiaoQuantity());
        dbManager.setDouble(52,lwCorporationSummaryDto.getTaobiaoPrice());
        dbManager.setDouble(53,lwCorporationSummaryDto.getTaobiaoFee());
        dbManager.setDouble(54,lwCorporationSummaryDto.getUnLossQuantity());
        dbManager.setString(55,lwCorporationSummaryDto.getTaobiaoName());
        dbManager.setString(56,lwCorporationSummaryDto.getTaobiaoflag());
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
        buffer.append("INSERT INTO LwCorporationSummary (");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("PowerFee,");
        buffer.append("UnDenizenQuantity,");
        buffer.append("PointerQuantity,");
        buffer.append("PointerPrice,");
        buffer.append("PointerFee,");
        buffer.append("UnDenizenPrice,");
        buffer.append("UnDenizenFee,");
        buffer.append("AjustRate,");
        buffer.append("PowerRateFee,");
        buffer.append("RateCode,");
        buffer.append("NeedQuantity,");
        buffer.append("NeedPrice,");
        buffer.append("NeedFee,");
        buffer.append("UserNo,");
        buffer.append("ContentQuantity,");
        buffer.append("ContentPrice,");
        buffer.append("ContentFee,");
        buffer.append("UnPointerQuantity,");
        buffer.append("SurchargePrice,");
        buffer.append("SanXiaPrice,");
        buffer.append("PowerPrice,");
        buffer.append("ValleyQuantity,");
        buffer.append("PeakQuantity,");
        buffer.append("PeakPrice,");
        buffer.append("ValleyPrice,");
        buffer.append("PeakFee,");
        buffer.append("ValleyFee,");
        buffer.append("LossQuantity,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("SumFee,");
        buffer.append("InputDate,");
        buffer.append("SumPointerQuantity,");
        buffer.append("QuantityStyle,");
        buffer.append("BeforPrice,");
        buffer.append("LastPrice,");
        buffer.append("BeforPower,");
        buffer.append("LastPower,");
        buffer.append("BeforFee,");
        buffer.append("LastFee,");
        buffer.append("Ifchange,");
        buffer.append("NeedPointer,");
        buffer.append("LineLoss,");
        buffer.append("UnLineLoss,");
        buffer.append("TaobiaoQuantity,");
        buffer.append("TaobiaoPrice,");
        buffer.append("TaobiaoFee,");
        buffer.append("UnLossQuantity,");
        buffer.append("TaobiaoName,");
        buffer.append("Taobiaoflag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwCorporationSummaryDto lwCorporationSummaryDto = (LwCorporationSummaryDto)i.next();
            dbManager.setString(1,lwCorporationSummaryDto.getLineCode());
            dbManager.setString(2,lwCorporationSummaryDto.getStatMonth());
            dbManager.setString(3,lwCorporationSummaryDto.getPowerClass());
            dbManager.setDouble(4,lwCorporationSummaryDto.getElectricQuantity());
            dbManager.setDouble(5,lwCorporationSummaryDto.getSanXiaFee());
            dbManager.setDouble(6,lwCorporationSummaryDto.getSurcharge());
            dbManager.setDouble(7,lwCorporationSummaryDto.getPowerFee());
            dbManager.setDouble(8,lwCorporationSummaryDto.getUnDenizenQuantity());
            dbManager.setDouble(9,lwCorporationSummaryDto.getPointerQuantity());
            dbManager.setDouble(10,lwCorporationSummaryDto.getPointerPrice());
            dbManager.setDouble(11,lwCorporationSummaryDto.getPointerFee());
            dbManager.setDouble(12,lwCorporationSummaryDto.getUnDenizenPrice());
            dbManager.setDouble(13,lwCorporationSummaryDto.getUnDenizenFee());
            dbManager.setDouble(14,lwCorporationSummaryDto.getAjustRate());
            dbManager.setDouble(15,lwCorporationSummaryDto.getPowerRateFee());
            dbManager.setDouble(16,lwCorporationSummaryDto.getRateCode());
            dbManager.setDouble(17,lwCorporationSummaryDto.getNeedQuantity());
            dbManager.setDouble(18,lwCorporationSummaryDto.getNeedPrice());
            dbManager.setDouble(19,lwCorporationSummaryDto.getNeedFee());
            dbManager.setString(20,lwCorporationSummaryDto.getUserNo());
            dbManager.setDouble(21,lwCorporationSummaryDto.getContentQuantity());
            dbManager.setDouble(22,lwCorporationSummaryDto.getContentPrice());
            dbManager.setDouble(23,lwCorporationSummaryDto.getContentFee());
            dbManager.setDouble(24,lwCorporationSummaryDto.getUnPointerQuantity());
            dbManager.setDouble(25,lwCorporationSummaryDto.getSurchargePrice());
            dbManager.setDouble(26,lwCorporationSummaryDto.getSanXiaPrice());
            dbManager.setDouble(27,lwCorporationSummaryDto.getPowerPrice());
            dbManager.setDouble(28,lwCorporationSummaryDto.getValleyQuantity());
            dbManager.setDouble(29,lwCorporationSummaryDto.getPeakQuantity());
            dbManager.setDouble(30,lwCorporationSummaryDto.getPeakPrice());
            dbManager.setDouble(31,lwCorporationSummaryDto.getValleyPrice());
            dbManager.setDouble(32,lwCorporationSummaryDto.getPeakFee());
            dbManager.setDouble(33,lwCorporationSummaryDto.getValleyFee());
            dbManager.setDouble(34,lwCorporationSummaryDto.getLossQuantity());
            dbManager.setString(35,lwCorporationSummaryDto.getFlag());
            dbManager.setString(36,lwCorporationSummaryDto.getRemark());
            dbManager.setDouble(37,lwCorporationSummaryDto.getSumFee());
            dbManager.setString(38,lwCorporationSummaryDto.getInputDate());
            dbManager.setDouble(39,lwCorporationSummaryDto.getSumPointerQuantity());
            dbManager.setString(40,lwCorporationSummaryDto.getQuantityStyle());
            dbManager.setDouble(41,lwCorporationSummaryDto.getBeforPrice());
            dbManager.setDouble(42,lwCorporationSummaryDto.getLastPrice());
            dbManager.setDouble(43,lwCorporationSummaryDto.getBeforPower());
            dbManager.setDouble(44,lwCorporationSummaryDto.getLastPower());
            dbManager.setDouble(45,lwCorporationSummaryDto.getBeforFee());
            dbManager.setDouble(46,lwCorporationSummaryDto.getLastFee());
            dbManager.setString(47,lwCorporationSummaryDto.getIfchange());
            dbManager.setDouble(48,lwCorporationSummaryDto.getNeedPointer());
            dbManager.setDouble(49,lwCorporationSummaryDto.getLineLoss());
            dbManager.setDouble(50,lwCorporationSummaryDto.getUnLineLoss());
            dbManager.setDouble(51,lwCorporationSummaryDto.getTaobiaoQuantity());
            dbManager.setDouble(52,lwCorporationSummaryDto.getTaobiaoPrice());
            dbManager.setDouble(53,lwCorporationSummaryDto.getTaobiaoFee());
            dbManager.setDouble(54,lwCorporationSummaryDto.getUnLossQuantity());
            dbManager.setString(55,lwCorporationSummaryDto.getTaobiaoName());
            dbManager.setString(56,lwCorporationSummaryDto.getTaobiaoflag());
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
        buffer.append("DELETE FROM LwCorporationSummary ");
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
     * @param lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public void update(LwCorporationSummaryDto lwCorporationSummaryDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwCorporationSummary SET ");
        buffer.append("PowerClass = ?, ");
        buffer.append("ElectricQuantity = ?, ");
        buffer.append("SanXiaFee = ?, ");
        buffer.append("Surcharge = ?, ");
        buffer.append("PowerFee = ?, ");
        buffer.append("UnDenizenQuantity = ?, ");
        buffer.append("PointerQuantity = ?, ");
        buffer.append("PointerPrice = ?, ");
        buffer.append("PointerFee = ?, ");
        buffer.append("UnDenizenPrice = ?, ");
        buffer.append("UnDenizenFee = ?, ");
        buffer.append("AjustRate = ?, ");
        buffer.append("PowerRateFee = ?, ");
        buffer.append("RateCode = ?, ");
        buffer.append("NeedQuantity = ?, ");
        buffer.append("NeedPrice = ?, ");
        buffer.append("NeedFee = ?, ");
        buffer.append("UserNo = ?, ");
        buffer.append("ContentQuantity = ?, ");
        buffer.append("ContentPrice = ?, ");
        buffer.append("ContentFee = ?, ");
        buffer.append("UnPointerQuantity = ?, ");
        buffer.append("SurchargePrice = ?, ");
        buffer.append("SanXiaPrice = ?, ");
        buffer.append("PowerPrice = ?, ");
        buffer.append("ValleyQuantity = ?, ");
        buffer.append("PeakQuantity = ?, ");
        buffer.append("PeakPrice = ?, ");
        buffer.append("ValleyPrice = ?, ");
        buffer.append("PeakFee = ?, ");
        buffer.append("ValleyFee = ?, ");
        buffer.append("LossQuantity = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("SumFee = ?, ");
        buffer.append("InputDate = ?, ");
        buffer.append("SumPointerQuantity = ?, ");
        buffer.append("QuantityStyle = ?, ");
        buffer.append("BeforPrice = ?, ");
        buffer.append("LastPrice = ?, ");
        buffer.append("BeforPower = ?, ");
        buffer.append("LastPower = ?, ");
        buffer.append("BeforFee = ?, ");
        buffer.append("LastFee = ?, ");
        buffer.append("Ifchange = ?, ");
        buffer.append("NeedPointer = ?, ");
        buffer.append("LineLoss = ?, ");
        buffer.append("UnLineLoss = ?, ");
        buffer.append("TaobiaoQuantity = ?, ");
        buffer.append("TaobiaoPrice = ?, ");
        buffer.append("TaobiaoFee = ?, ");
        buffer.append("UnLossQuantity = ?, ");
        buffer.append("TaobiaoName = ?, ");
        buffer.append("Taobiaoflag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwCorporationSummary SET ");
            debugBuffer.append("PowerClass = '" + lwCorporationSummaryDto.getPowerClass() + "', ");
            debugBuffer.append("ElectricQuantity = " + lwCorporationSummaryDto.getElectricQuantity() + ", ");
            debugBuffer.append("SanXiaFee = " + lwCorporationSummaryDto.getSanXiaFee() + ", ");
            debugBuffer.append("Surcharge = " + lwCorporationSummaryDto.getSurcharge() + ", ");
            debugBuffer.append("PowerFee = " + lwCorporationSummaryDto.getPowerFee() + ", ");
            debugBuffer.append("UnDenizenQuantity = " + lwCorporationSummaryDto.getUnDenizenQuantity() + ", ");
            debugBuffer.append("PointerQuantity = " + lwCorporationSummaryDto.getPointerQuantity() + ", ");
            debugBuffer.append("PointerPrice = " + lwCorporationSummaryDto.getPointerPrice() + ", ");
            debugBuffer.append("PointerFee = " + lwCorporationSummaryDto.getPointerFee() + ", ");
            debugBuffer.append("UnDenizenPrice = " + lwCorporationSummaryDto.getUnDenizenPrice() + ", ");
            debugBuffer.append("UnDenizenFee = " + lwCorporationSummaryDto.getUnDenizenFee() + ", ");
            debugBuffer.append("AjustRate = " + lwCorporationSummaryDto.getAjustRate() + ", ");
            debugBuffer.append("PowerRateFee = " + lwCorporationSummaryDto.getPowerRateFee() + ", ");
            debugBuffer.append("RateCode = " + lwCorporationSummaryDto.getRateCode() + ", ");
            debugBuffer.append("NeedQuantity = " + lwCorporationSummaryDto.getNeedQuantity() + ", ");
            debugBuffer.append("NeedPrice = " + lwCorporationSummaryDto.getNeedPrice() + ", ");
            debugBuffer.append("NeedFee = " + lwCorporationSummaryDto.getNeedFee() + ", ");
            debugBuffer.append("UserNo = '" + lwCorporationSummaryDto.getUserNo() + "', ");
            debugBuffer.append("ContentQuantity = " + lwCorporationSummaryDto.getContentQuantity() + ", ");
            debugBuffer.append("ContentPrice = " + lwCorporationSummaryDto.getContentPrice() + ", ");
            debugBuffer.append("ContentFee = " + lwCorporationSummaryDto.getContentFee() + ", ");
            debugBuffer.append("UnPointerQuantity = " + lwCorporationSummaryDto.getUnPointerQuantity() + ", ");
            debugBuffer.append("SurchargePrice = " + lwCorporationSummaryDto.getSurchargePrice() + ", ");
            debugBuffer.append("SanXiaPrice = " + lwCorporationSummaryDto.getSanXiaPrice() + ", ");
            debugBuffer.append("PowerPrice = " + lwCorporationSummaryDto.getPowerPrice() + ", ");
            debugBuffer.append("ValleyQuantity = " + lwCorporationSummaryDto.getValleyQuantity() + ", ");
            debugBuffer.append("PeakQuantity = " + lwCorporationSummaryDto.getPeakQuantity() + ", ");
            debugBuffer.append("PeakPrice = " + lwCorporationSummaryDto.getPeakPrice() + ", ");
            debugBuffer.append("ValleyPrice = " + lwCorporationSummaryDto.getValleyPrice() + ", ");
            debugBuffer.append("PeakFee = " + lwCorporationSummaryDto.getPeakFee() + ", ");
            debugBuffer.append("ValleyFee = " + lwCorporationSummaryDto.getValleyFee() + ", ");
            debugBuffer.append("LossQuantity = " + lwCorporationSummaryDto.getLossQuantity() + ", ");
            debugBuffer.append("Flag = '" + lwCorporationSummaryDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwCorporationSummaryDto.getRemark() + "', ");
            debugBuffer.append("SumFee = " + lwCorporationSummaryDto.getSumFee() + ", ");
            debugBuffer.append("InputDate = '" + lwCorporationSummaryDto.getInputDate() + "', ");
            debugBuffer.append("SumPointerQuantity = " + lwCorporationSummaryDto.getSumPointerQuantity() + ", ");
            debugBuffer.append("QuantityStyle = '" + lwCorporationSummaryDto.getQuantityStyle() + "', ");
            debugBuffer.append("BeforPrice = " + lwCorporationSummaryDto.getBeforPrice() + ", ");
            debugBuffer.append("LastPrice = " + lwCorporationSummaryDto.getLastPrice() + ", ");
            debugBuffer.append("BeforPower = " + lwCorporationSummaryDto.getBeforPower() + ", ");
            debugBuffer.append("LastPower = " + lwCorporationSummaryDto.getLastPower() + ", ");
            debugBuffer.append("BeforFee = " + lwCorporationSummaryDto.getBeforFee() + ", ");
            debugBuffer.append("LastFee = " + lwCorporationSummaryDto.getLastFee() + ", ");
            debugBuffer.append("Ifchange = '" + lwCorporationSummaryDto.getIfchange() + "', ");
            debugBuffer.append("NeedPointer = " + lwCorporationSummaryDto.getNeedPointer() + ", ");
            debugBuffer.append("LineLoss = " + lwCorporationSummaryDto.getLineLoss() + ", ");
            debugBuffer.append("UnLineLoss = " + lwCorporationSummaryDto.getUnLineLoss() + ", ");
            debugBuffer.append("TaobiaoQuantity = " + lwCorporationSummaryDto.getTaobiaoQuantity() + ", ");
            debugBuffer.append("TaobiaoPrice = " + lwCorporationSummaryDto.getTaobiaoPrice() + ", ");
            debugBuffer.append("TaobiaoFee = " + lwCorporationSummaryDto.getTaobiaoFee() + ", ");
            debugBuffer.append("UnLossQuantity = " + lwCorporationSummaryDto.getUnLossQuantity() + ", ");
            debugBuffer.append("TaobiaoName = '" + lwCorporationSummaryDto.getTaobiaoName() + "', ");
            debugBuffer.append("Taobiaoflag = '" + lwCorporationSummaryDto.getTaobiaoflag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lwCorporationSummaryDto.getLineCode()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwCorporationSummaryDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwCorporationSummaryDto.getPowerClass());
        dbManager.setDouble(2,lwCorporationSummaryDto.getElectricQuantity());
        dbManager.setDouble(3,lwCorporationSummaryDto.getSanXiaFee());
        dbManager.setDouble(4,lwCorporationSummaryDto.getSurcharge());
        dbManager.setDouble(5,lwCorporationSummaryDto.getPowerFee());
        dbManager.setDouble(6,lwCorporationSummaryDto.getUnDenizenQuantity());
        dbManager.setDouble(7,lwCorporationSummaryDto.getPointerQuantity());
        dbManager.setDouble(8,lwCorporationSummaryDto.getPointerPrice());
        dbManager.setDouble(9,lwCorporationSummaryDto.getPointerFee());
        dbManager.setDouble(10,lwCorporationSummaryDto.getUnDenizenPrice());
        dbManager.setDouble(11,lwCorporationSummaryDto.getUnDenizenFee());
        dbManager.setDouble(12,lwCorporationSummaryDto.getAjustRate());
        dbManager.setDouble(13,lwCorporationSummaryDto.getPowerRateFee());
        dbManager.setDouble(14,lwCorporationSummaryDto.getRateCode());
        dbManager.setDouble(15,lwCorporationSummaryDto.getNeedQuantity());
        dbManager.setDouble(16,lwCorporationSummaryDto.getNeedPrice());
        dbManager.setDouble(17,lwCorporationSummaryDto.getNeedFee());
        dbManager.setString(18,lwCorporationSummaryDto.getUserNo());
        dbManager.setDouble(19,lwCorporationSummaryDto.getContentQuantity());
        dbManager.setDouble(20,lwCorporationSummaryDto.getContentPrice());
        dbManager.setDouble(21,lwCorporationSummaryDto.getContentFee());
        dbManager.setDouble(22,lwCorporationSummaryDto.getUnPointerQuantity());
        dbManager.setDouble(23,lwCorporationSummaryDto.getSurchargePrice());
        dbManager.setDouble(24,lwCorporationSummaryDto.getSanXiaPrice());
        dbManager.setDouble(25,lwCorporationSummaryDto.getPowerPrice());
        dbManager.setDouble(26,lwCorporationSummaryDto.getValleyQuantity());
        dbManager.setDouble(27,lwCorporationSummaryDto.getPeakQuantity());
        dbManager.setDouble(28,lwCorporationSummaryDto.getPeakPrice());
        dbManager.setDouble(29,lwCorporationSummaryDto.getValleyPrice());
        dbManager.setDouble(30,lwCorporationSummaryDto.getPeakFee());
        dbManager.setDouble(31,lwCorporationSummaryDto.getValleyFee());
        dbManager.setDouble(32,lwCorporationSummaryDto.getLossQuantity());
        dbManager.setString(33,lwCorporationSummaryDto.getFlag());
        dbManager.setString(34,lwCorporationSummaryDto.getRemark());
        dbManager.setDouble(35,lwCorporationSummaryDto.getSumFee());
        dbManager.setString(36,lwCorporationSummaryDto.getInputDate());
        dbManager.setDouble(37,lwCorporationSummaryDto.getSumPointerQuantity());
        dbManager.setString(38,lwCorporationSummaryDto.getQuantityStyle());
        dbManager.setDouble(39,lwCorporationSummaryDto.getBeforPrice());
        dbManager.setDouble(40,lwCorporationSummaryDto.getLastPrice());
        dbManager.setDouble(41,lwCorporationSummaryDto.getBeforPower());
        dbManager.setDouble(42,lwCorporationSummaryDto.getLastPower());
        dbManager.setDouble(43,lwCorporationSummaryDto.getBeforFee());
        dbManager.setDouble(44,lwCorporationSummaryDto.getLastFee());
        dbManager.setString(45,lwCorporationSummaryDto.getIfchange());
        dbManager.setDouble(46,lwCorporationSummaryDto.getNeedPointer());
        dbManager.setDouble(47,lwCorporationSummaryDto.getLineLoss());
        dbManager.setDouble(48,lwCorporationSummaryDto.getUnLineLoss());
        dbManager.setDouble(49,lwCorporationSummaryDto.getTaobiaoQuantity());
        dbManager.setDouble(50,lwCorporationSummaryDto.getTaobiaoPrice());
        dbManager.setDouble(51,lwCorporationSummaryDto.getTaobiaoFee());
        dbManager.setDouble(52,lwCorporationSummaryDto.getUnLossQuantity());
        dbManager.setString(53,lwCorporationSummaryDto.getTaobiaoName());
        dbManager.setString(54,lwCorporationSummaryDto.getTaobiaoflag());
        //设置条件字段;
        dbManager.setString(55,lwCorporationSummaryDto.getLineCode());
        dbManager.setString(56,lwCorporationSummaryDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param lineCode 线路代码
     * @param statMonth 统计年月
     * @return LwCorporationSummaryDto
     * @throws Exception
     */
    public LwCorporationSummaryDto findByPrimaryKey(String lineCode,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("StatMonth,");
        buffer.append("PowerClass,");
        buffer.append("ElectricQuantity,");
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("PowerFee,");
        buffer.append("UnDenizenQuantity,");
        buffer.append("PointerQuantity,");
        buffer.append("PointerPrice,");
        buffer.append("PointerFee,");
        buffer.append("UnDenizenPrice,");
        buffer.append("UnDenizenFee,");
        buffer.append("AjustRate,");
        buffer.append("PowerRateFee,");
        buffer.append("RateCode,");
        buffer.append("NeedQuantity,");
        buffer.append("NeedPrice,");
        buffer.append("NeedFee,");
        buffer.append("UserNo,");
        buffer.append("ContentQuantity,");
        buffer.append("ContentPrice,");
        buffer.append("ContentFee,");
        buffer.append("UnPointerQuantity,");
        buffer.append("SurchargePrice,");
        buffer.append("SanXiaPrice,");
        buffer.append("PowerPrice,");
        buffer.append("ValleyQuantity,");
        buffer.append("PeakQuantity,");
        buffer.append("PeakPrice,");
        buffer.append("ValleyPrice,");
        buffer.append("PeakFee,");
        buffer.append("ValleyFee,");
        buffer.append("LossQuantity,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("SumFee,");
        buffer.append("InputDate,");
        buffer.append("SumPointerQuantity,");
        buffer.append("QuantityStyle,");
        buffer.append("BeforPrice,");
        buffer.append("LastPrice,");
        buffer.append("BeforPower,");
        buffer.append("LastPower,");
        buffer.append("BeforFee,");
        buffer.append("LastFee,");
        buffer.append("Ifchange,");
        buffer.append("NeedPointer,");
        buffer.append("LineLoss,");
        buffer.append("UnLineLoss,");
        buffer.append("TaobiaoQuantity,");
        buffer.append("TaobiaoPrice,");
        buffer.append("TaobiaoFee,");
        buffer.append("UnLossQuantity,");
        buffer.append("TaobiaoName,");
        buffer.append("Taobiaoflag ");
        buffer.append("FROM LwCorporationSummary ");
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
        LwCorporationSummaryDto lwCorporationSummaryDto = null;
        if(resultSet.next()){
            lwCorporationSummaryDto = new LwCorporationSummaryDto();
            lwCorporationSummaryDto.setLineCode(dbManager.getString(resultSet,1));
            lwCorporationSummaryDto.setStatMonth(dbManager.getString(resultSet,2));
            lwCorporationSummaryDto.setPowerClass(dbManager.getString(resultSet,3));
            lwCorporationSummaryDto.setElectricQuantity(dbManager.getDouble(resultSet,4));
            lwCorporationSummaryDto.setSanXiaFee(dbManager.getDouble(resultSet,5));
            lwCorporationSummaryDto.setSurcharge(dbManager.getDouble(resultSet,6));
            lwCorporationSummaryDto.setPowerFee(dbManager.getDouble(resultSet,7));
            lwCorporationSummaryDto.setUnDenizenQuantity(dbManager.getDouble(resultSet,8));
            lwCorporationSummaryDto.setPointerQuantity(dbManager.getDouble(resultSet,9));
            lwCorporationSummaryDto.setPointerPrice(dbManager.getDouble(resultSet,10));
            lwCorporationSummaryDto.setPointerFee(dbManager.getDouble(resultSet,11));
            lwCorporationSummaryDto.setUnDenizenPrice(dbManager.getDouble(resultSet,12));
            lwCorporationSummaryDto.setUnDenizenFee(dbManager.getDouble(resultSet,13));
            lwCorporationSummaryDto.setAjustRate(dbManager.getDouble(resultSet,14));
            lwCorporationSummaryDto.setPowerRateFee(dbManager.getDouble(resultSet,15));
            lwCorporationSummaryDto.setRateCode(dbManager.getDouble(resultSet,16));
            lwCorporationSummaryDto.setNeedQuantity(dbManager.getDouble(resultSet,17));
            lwCorporationSummaryDto.setNeedPrice(dbManager.getDouble(resultSet,18));
            lwCorporationSummaryDto.setNeedFee(dbManager.getDouble(resultSet,19));
            lwCorporationSummaryDto.setUserNo(dbManager.getString(resultSet,20));
            lwCorporationSummaryDto.setContentQuantity(dbManager.getDouble(resultSet,21));
            lwCorporationSummaryDto.setContentPrice(dbManager.getDouble(resultSet,22));
            lwCorporationSummaryDto.setContentFee(dbManager.getDouble(resultSet,23));
            lwCorporationSummaryDto.setUnPointerQuantity(dbManager.getDouble(resultSet,24));
            lwCorporationSummaryDto.setSurchargePrice(dbManager.getDouble(resultSet,25));
            lwCorporationSummaryDto.setSanXiaPrice(dbManager.getDouble(resultSet,26));
            lwCorporationSummaryDto.setPowerPrice(dbManager.getDouble(resultSet,27));
            lwCorporationSummaryDto.setValleyQuantity(dbManager.getDouble(resultSet,28));
            lwCorporationSummaryDto.setPeakQuantity(dbManager.getDouble(resultSet,29));
            lwCorporationSummaryDto.setPeakPrice(dbManager.getDouble(resultSet,30));
            lwCorporationSummaryDto.setValleyPrice(dbManager.getDouble(resultSet,31));
            lwCorporationSummaryDto.setPeakFee(dbManager.getDouble(resultSet,32));
            lwCorporationSummaryDto.setValleyFee(dbManager.getDouble(resultSet,33));
            lwCorporationSummaryDto.setLossQuantity(dbManager.getDouble(resultSet,34));
            lwCorporationSummaryDto.setFlag(dbManager.getString(resultSet,35));
            lwCorporationSummaryDto.setRemark(dbManager.getString(resultSet,36));
            lwCorporationSummaryDto.setSumFee(dbManager.getDouble(resultSet,37));
            lwCorporationSummaryDto.setInputDate(dbManager.getString(resultSet,38));
            lwCorporationSummaryDto.setSumPointerQuantity(dbManager.getDouble(resultSet,39));
            lwCorporationSummaryDto.setQuantityStyle(dbManager.getString(resultSet,40));
            lwCorporationSummaryDto.setBeforPrice(dbManager.getDouble(resultSet,41));
            lwCorporationSummaryDto.setLastPrice(dbManager.getDouble(resultSet,42));
            lwCorporationSummaryDto.setBeforPower(dbManager.getDouble(resultSet,43));
            lwCorporationSummaryDto.setLastPower(dbManager.getDouble(resultSet,44));
            lwCorporationSummaryDto.setBeforFee(dbManager.getDouble(resultSet,45));
            lwCorporationSummaryDto.setLastFee(dbManager.getDouble(resultSet,46));
            lwCorporationSummaryDto.setIfchange(dbManager.getString(resultSet,47));
            lwCorporationSummaryDto.setNeedPointer(dbManager.getDouble(resultSet,48));
            lwCorporationSummaryDto.setLineLoss(dbManager.getDouble(resultSet,49));
            lwCorporationSummaryDto.setUnLineLoss(dbManager.getDouble(resultSet,50));
            lwCorporationSummaryDto.setTaobiaoQuantity(dbManager.getDouble(resultSet,51));
            lwCorporationSummaryDto.setTaobiaoPrice(dbManager.getDouble(resultSet,52));
            lwCorporationSummaryDto.setTaobiaoFee(dbManager.getDouble(resultSet,53));
            lwCorporationSummaryDto.setUnLossQuantity(dbManager.getDouble(resultSet,54));
            lwCorporationSummaryDto.setTaobiaoName(dbManager.getString(resultSet,55));
            lwCorporationSummaryDto.setTaobiaoflag(dbManager.getString(resultSet,56));
        }
        resultSet.close();
        return lwCorporationSummaryDto;
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
        buffer.append("SanXiaFee,");
        buffer.append("Surcharge,");
        buffer.append("PowerFee,");
        buffer.append("UnDenizenQuantity,");
        buffer.append("PointerQuantity,");
        buffer.append("PointerPrice,");
        buffer.append("PointerFee,");
        buffer.append("UnDenizenPrice,");
        buffer.append("UnDenizenFee,");
        buffer.append("AjustRate,");
        buffer.append("PowerRateFee,");
        buffer.append("RateCode,");
        buffer.append("NeedQuantity,");
        buffer.append("NeedPrice,");
        buffer.append("NeedFee,");
        buffer.append("UserNo,");
        buffer.append("ContentQuantity,");
        buffer.append("ContentPrice,");
        buffer.append("ContentFee,");
        buffer.append("UnPointerQuantity,");
        buffer.append("SurchargePrice,");
        buffer.append("SanXiaPrice,");
        buffer.append("PowerPrice,");
        buffer.append("ValleyQuantity,");
        buffer.append("PeakQuantity,");
        buffer.append("PeakPrice,");
        buffer.append("ValleyPrice,");
        buffer.append("PeakFee,");
        buffer.append("ValleyFee,");
        buffer.append("LossQuantity,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("SumFee,");
        buffer.append("InputDate,");
        buffer.append("SumPointerQuantity,");
        buffer.append("QuantityStyle,");
        buffer.append("BeforPrice,");
        buffer.append("LastPrice,");
        buffer.append("BeforPower,");
        buffer.append("LastPower,");
        buffer.append("BeforFee,");
        buffer.append("LastFee,");
        buffer.append("Ifchange,");
        buffer.append("NeedPointer,");
        buffer.append("LineLoss,");
        buffer.append("UnLineLoss,");
        buffer.append("TaobiaoQuantity,");
        buffer.append("TaobiaoPrice,");
        buffer.append("TaobiaoFee,");
        buffer.append("UnLossQuantity,");
        buffer.append("TaobiaoName,");
        buffer.append("Taobiaoflag ");
        buffer.append("FROM LwCorporationSummary WHERE ");
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
        LwCorporationSummaryDto lwCorporationSummaryDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwCorporationSummaryDto = new LwCorporationSummaryDto();
            lwCorporationSummaryDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwCorporationSummaryDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwCorporationSummaryDto.setPowerClass(dbManager.getString(resultSet,"PowerClass"));
            lwCorporationSummaryDto.setElectricQuantity(dbManager.getDouble(resultSet,"ElectricQuantity"));
            lwCorporationSummaryDto.setSanXiaFee(dbManager.getDouble(resultSet,"SanXiaFee"));
            lwCorporationSummaryDto.setSurcharge(dbManager.getDouble(resultSet,"Surcharge"));
            lwCorporationSummaryDto.setPowerFee(dbManager.getDouble(resultSet,"PowerFee"));
            lwCorporationSummaryDto.setUnDenizenQuantity(dbManager.getDouble(resultSet,"UnDenizenQuantity"));
            lwCorporationSummaryDto.setPointerQuantity(dbManager.getDouble(resultSet,"PointerQuantity"));
            lwCorporationSummaryDto.setPointerPrice(dbManager.getDouble(resultSet,"PointerPrice"));
            lwCorporationSummaryDto.setPointerFee(dbManager.getDouble(resultSet,"PointerFee"));
            lwCorporationSummaryDto.setUnDenizenPrice(dbManager.getDouble(resultSet,"UnDenizenPrice"));
            lwCorporationSummaryDto.setUnDenizenFee(dbManager.getDouble(resultSet,"UnDenizenFee"));
            lwCorporationSummaryDto.setAjustRate(dbManager.getDouble(resultSet,"AjustRate"));
            lwCorporationSummaryDto.setPowerRateFee(dbManager.getDouble(resultSet,"PowerRateFee"));
            lwCorporationSummaryDto.setRateCode(dbManager.getDouble(resultSet,"RateCode"));
            lwCorporationSummaryDto.setNeedQuantity(dbManager.getDouble(resultSet,"NeedQuantity"));
            lwCorporationSummaryDto.setNeedPrice(dbManager.getDouble(resultSet,"NeedPrice"));
            lwCorporationSummaryDto.setNeedFee(dbManager.getDouble(resultSet,"NeedFee"));
            lwCorporationSummaryDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwCorporationSummaryDto.setContentQuantity(dbManager.getDouble(resultSet,"ContentQuantity"));
            lwCorporationSummaryDto.setContentPrice(dbManager.getDouble(resultSet,"ContentPrice"));
            lwCorporationSummaryDto.setContentFee(dbManager.getDouble(resultSet,"ContentFee"));
            lwCorporationSummaryDto.setUnPointerQuantity(dbManager.getDouble(resultSet,"UnPointerQuantity"));
            lwCorporationSummaryDto.setSurchargePrice(dbManager.getDouble(resultSet,"SurchargePrice"));
            lwCorporationSummaryDto.setSanXiaPrice(dbManager.getDouble(resultSet,"SanXiaPrice"));
            lwCorporationSummaryDto.setPowerPrice(dbManager.getDouble(resultSet,"PowerPrice"));
            lwCorporationSummaryDto.setValleyQuantity(dbManager.getDouble(resultSet,"ValleyQuantity"));
            lwCorporationSummaryDto.setPeakQuantity(dbManager.getDouble(resultSet,"PeakQuantity"));
            lwCorporationSummaryDto.setPeakPrice(dbManager.getDouble(resultSet,"PeakPrice"));
            lwCorporationSummaryDto.setValleyPrice(dbManager.getDouble(resultSet,"ValleyPrice"));
            lwCorporationSummaryDto.setPeakFee(dbManager.getDouble(resultSet,"PeakFee"));
            lwCorporationSummaryDto.setValleyFee(dbManager.getDouble(resultSet,"ValleyFee"));
            lwCorporationSummaryDto.setLossQuantity(dbManager.getDouble(resultSet,"LossQuantity"));
            lwCorporationSummaryDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwCorporationSummaryDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwCorporationSummaryDto.setSumFee(dbManager.getDouble(resultSet,"SumFee"));
            lwCorporationSummaryDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwCorporationSummaryDto.setSumPointerQuantity(dbManager.getDouble(resultSet,"SumPointerQuantity"));
            lwCorporationSummaryDto.setQuantityStyle(dbManager.getString(resultSet,"QuantityStyle"));
            lwCorporationSummaryDto.setBeforPrice(dbManager.getDouble(resultSet,"BeforPrice"));
            lwCorporationSummaryDto.setLastPrice(dbManager.getDouble(resultSet,"LastPrice"));
            lwCorporationSummaryDto.setBeforPower(dbManager.getDouble(resultSet,"BeforPower"));
            lwCorporationSummaryDto.setLastPower(dbManager.getDouble(resultSet,"LastPower"));
            lwCorporationSummaryDto.setBeforFee(dbManager.getDouble(resultSet,"BeforFee"));
            lwCorporationSummaryDto.setLastFee(dbManager.getDouble(resultSet,"LastFee"));
            lwCorporationSummaryDto.setIfchange(dbManager.getString(resultSet,"Ifchange"));
            lwCorporationSummaryDto.setNeedPointer(dbManager.getDouble(resultSet,"NeedPointer"));
            lwCorporationSummaryDto.setLineLoss(dbManager.getDouble(resultSet,"LineLoss"));
            lwCorporationSummaryDto.setUnLineLoss(dbManager.getDouble(resultSet,"UnLineLoss"));
            lwCorporationSummaryDto.setTaobiaoQuantity(dbManager.getDouble(resultSet,"TaobiaoQuantity"));
            lwCorporationSummaryDto.setTaobiaoPrice(dbManager.getDouble(resultSet,"TaobiaoPrice"));
            lwCorporationSummaryDto.setTaobiaoFee(dbManager.getDouble(resultSet,"TaobiaoFee"));
            lwCorporationSummaryDto.setUnLossQuantity(dbManager.getDouble(resultSet,"UnLossQuantity"));
            lwCorporationSummaryDto.setTaobiaoName(dbManager.getString(resultSet,"TaobiaoName"));
            lwCorporationSummaryDto.setTaobiaoflag(dbManager.getString(resultSet,"Taobiaoflag"));
            collection.add(lwCorporationSummaryDto);
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
        buffer.append("DELETE FROM LwCorporationSummary WHERE ");
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
        buffer.append("SELECT count(*) FROM LwCorporationSummary WHERE ");
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
