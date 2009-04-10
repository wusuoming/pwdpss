package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleStatDetailDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleStatDetail-趸售按电价统计的数据访问对象基类<br>
 */
public class DBLwWholeSaleStatDetailBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwWholeSaleStatDetailBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleStatDetailBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public void insert(LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwWholeSaleStatDetail (");
        buffer.append("CompanyCode,");
        buffer.append("CompanyName,");
        buffer.append("StatStyle,");
        buffer.append("InputDate,");
        buffer.append("UnDenizenQuantity10kv,");
        buffer.append("UnDenizenMoney10kv,");
        buffer.append("DenizenQuantity10kv,");
        buffer.append("DenizenMoney10kv,");
        buffer.append("ProductQuantity10kv,");
        buffer.append("ProductMoney10kv,");
        buffer.append("UnIndustryQuantity10kv,");
        buffer.append("UnIndustryMoney10kv,");
        buffer.append("FarmUseQuantity10kv,");
        buffer.append("FarmUseMoney10kv,");
        buffer.append("BizQuantity10kv,");
        buffer.append("BizMoney10kv,");
        buffer.append("UnDenizenQuantity35kv,");
        buffer.append("UnDenizenMoney35kv,");
        buffer.append("DenizenQuantity35kv,");
        buffer.append("DenizenMoney35kv,");
        buffer.append("ProductQuantity35kv,");
        buffer.append("ProductMoney35kv,");
        buffer.append("UnIndustryQuantity35kv,");
        buffer.append("UnIndustryMoney35kv,");
        buffer.append("FarmUseQuantity35kv,");
        buffer.append("FarmUseMoney35kv,");
        buffer.append("BizQuantity35kv,");
        buffer.append("BizMoney35kv,");
        buffer.append("SumQuantity10KV,");
        buffer.append("SumQuantity35KV,");
        buffer.append("SumQuantity,");
        buffer.append("PowerFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("LilvFee,");
        buffer.append("BroadFee,");
        buffer.append("Haiminglu,");
        buffer.append("DuobianFee,");
        buffer.append("TuibuFee,");
        buffer.append("SumPowerFee ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwWholeSaleStatDetailDto.getCompanyCode()).append("',");
            debugBuffer.append("'").append(lwWholeSaleStatDetailDto.getCompanyName()).append("',");
            debugBuffer.append("'").append(lwWholeSaleStatDetailDto.getStatStyle()).append("',");
            debugBuffer.append("'").append(lwWholeSaleStatDetailDto.getInputDate()).append("',");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getUnDenizenQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getUnDenizenMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getDenizenQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getDenizenMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getProductQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getProductMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getUnIndustryQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getUnIndustryMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getFarmUseQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getFarmUseMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getBizQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getBizMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getUnDenizenQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getUnDenizenMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getDenizenQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getDenizenMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getProductQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getProductMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getUnIndustryQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getUnIndustryMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getFarmUseQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getFarmUseMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getBizQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getBizMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getSumQuantity10KV()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getSumQuantity35KV()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getSumQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getPowerFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getPowerFeeTax()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getLilvFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getBroadFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getHaiminglu()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getDuobianFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getTuibuFee()).append(",");
            debugBuffer.append("").append(lwWholeSaleStatDetailDto.getSumPowerFee()).append(")");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwWholeSaleStatDetailDto.getCompanyCode());
        dbManager.setString(2,lwWholeSaleStatDetailDto.getCompanyName());
        dbManager.setString(3,lwWholeSaleStatDetailDto.getStatStyle());
        dbManager.setString(4,lwWholeSaleStatDetailDto.getInputDate());
        dbManager.setInt(5,lwWholeSaleStatDetailDto.getUnDenizenQuantity10kv());
        dbManager.setDouble(6,lwWholeSaleStatDetailDto.getUnDenizenMoney10kv());
        dbManager.setInt(7,lwWholeSaleStatDetailDto.getDenizenQuantity10kv());
        dbManager.setDouble(8,lwWholeSaleStatDetailDto.getDenizenMoney10kv());
        dbManager.setInt(9,lwWholeSaleStatDetailDto.getProductQuantity10kv());
        dbManager.setDouble(10,lwWholeSaleStatDetailDto.getProductMoney10kv());
        dbManager.setInt(11,lwWholeSaleStatDetailDto.getUnIndustryQuantity10kv());
        dbManager.setDouble(12,lwWholeSaleStatDetailDto.getUnIndustryMoney10kv());
        dbManager.setInt(13,lwWholeSaleStatDetailDto.getFarmUseQuantity10kv());
        dbManager.setDouble(14,lwWholeSaleStatDetailDto.getFarmUseMoney10kv());
        dbManager.setInt(15,lwWholeSaleStatDetailDto.getBizQuantity10kv());
        dbManager.setDouble(16,lwWholeSaleStatDetailDto.getBizMoney10kv());
        dbManager.setInt(17,lwWholeSaleStatDetailDto.getUnDenizenQuantity35kv());
        dbManager.setDouble(18,lwWholeSaleStatDetailDto.getUnDenizenMoney35kv());
        dbManager.setInt(19,lwWholeSaleStatDetailDto.getDenizenQuantity35kv());
        dbManager.setDouble(20,lwWholeSaleStatDetailDto.getDenizenMoney35kv());
        dbManager.setInt(21,lwWholeSaleStatDetailDto.getProductQuantity35kv());
        dbManager.setDouble(22,lwWholeSaleStatDetailDto.getProductMoney35kv());
        dbManager.setInt(23,lwWholeSaleStatDetailDto.getUnIndustryQuantity35kv());
        dbManager.setDouble(24,lwWholeSaleStatDetailDto.getUnIndustryMoney35kv());
        dbManager.setInt(25,lwWholeSaleStatDetailDto.getFarmUseQuantity35kv());
        dbManager.setDouble(26,lwWholeSaleStatDetailDto.getFarmUseMoney35kv());
        dbManager.setInt(27,lwWholeSaleStatDetailDto.getBizQuantity35kv());
        dbManager.setDouble(28,lwWholeSaleStatDetailDto.getBizMoney35kv());
        dbManager.setInt(29,lwWholeSaleStatDetailDto.getSumQuantity10KV());
        dbManager.setInt(30,lwWholeSaleStatDetailDto.getSumQuantity35KV());
        dbManager.setInt(31,lwWholeSaleStatDetailDto.getSumQuantity());
        dbManager.setDouble(32,lwWholeSaleStatDetailDto.getPowerFee());
        dbManager.setDouble(33,lwWholeSaleStatDetailDto.getPowerFeeTax());
        dbManager.setDouble(34,lwWholeSaleStatDetailDto.getLilvFee());
        dbManager.setDouble(35,lwWholeSaleStatDetailDto.getBroadFee());
        dbManager.setDouble(36,lwWholeSaleStatDetailDto.getHaiminglu());
        dbManager.setDouble(37,lwWholeSaleStatDetailDto.getDuobianFee());
        dbManager.setDouble(38,lwWholeSaleStatDetailDto.getTuibuFee());
        dbManager.setDouble(39,lwWholeSaleStatDetailDto.getSumPowerFee());
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
        buffer.append("INSERT INTO LwWholeSaleStatDetail (");
        buffer.append("CompanyCode,");
        buffer.append("CompanyName,");
        buffer.append("StatStyle,");
        buffer.append("InputDate,");
        buffer.append("UnDenizenQuantity10kv,");
        buffer.append("UnDenizenMoney10kv,");
        buffer.append("DenizenQuantity10kv,");
        buffer.append("DenizenMoney10kv,");
        buffer.append("ProductQuantity10kv,");
        buffer.append("ProductMoney10kv,");
        buffer.append("UnIndustryQuantity10kv,");
        buffer.append("UnIndustryMoney10kv,");
        buffer.append("FarmUseQuantity10kv,");
        buffer.append("FarmUseMoney10kv,");
        buffer.append("BizQuantity10kv,");
        buffer.append("BizMoney10kv,");
        buffer.append("UnDenizenQuantity35kv,");
        buffer.append("UnDenizenMoney35kv,");
        buffer.append("DenizenQuantity35kv,");
        buffer.append("DenizenMoney35kv,");
        buffer.append("ProductQuantity35kv,");
        buffer.append("ProductMoney35kv,");
        buffer.append("UnIndustryQuantity35kv,");
        buffer.append("UnIndustryMoney35kv,");
        buffer.append("FarmUseQuantity35kv,");
        buffer.append("FarmUseMoney35kv,");
        buffer.append("BizQuantity35kv,");
        buffer.append("BizMoney35kv,");
        buffer.append("SumQuantity10KV,");
        buffer.append("SumQuantity35KV,");
        buffer.append("SumQuantity,");
        buffer.append("PowerFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("LilvFee,");
        buffer.append("BroadFee,");
        buffer.append("Haiminglu,");
        buffer.append("DuobianFee,");
        buffer.append("TuibuFee,");
        buffer.append("SumPowerFee ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto = (LwWholeSaleStatDetailDto)i.next();
            dbManager.setString(1,lwWholeSaleStatDetailDto.getCompanyCode());
            dbManager.setString(2,lwWholeSaleStatDetailDto.getCompanyName());
            dbManager.setString(3,lwWholeSaleStatDetailDto.getStatStyle());
            dbManager.setString(4,lwWholeSaleStatDetailDto.getInputDate());
            dbManager.setInt(5,lwWholeSaleStatDetailDto.getUnDenizenQuantity10kv());
            dbManager.setDouble(6,lwWholeSaleStatDetailDto.getUnDenizenMoney10kv());
            dbManager.setInt(7,lwWholeSaleStatDetailDto.getDenizenQuantity10kv());
            dbManager.setDouble(8,lwWholeSaleStatDetailDto.getDenizenMoney10kv());
            dbManager.setInt(9,lwWholeSaleStatDetailDto.getProductQuantity10kv());
            dbManager.setDouble(10,lwWholeSaleStatDetailDto.getProductMoney10kv());
            dbManager.setInt(11,lwWholeSaleStatDetailDto.getUnIndustryQuantity10kv());
            dbManager.setDouble(12,lwWholeSaleStatDetailDto.getUnIndustryMoney10kv());
            dbManager.setInt(13,lwWholeSaleStatDetailDto.getFarmUseQuantity10kv());
            dbManager.setDouble(14,lwWholeSaleStatDetailDto.getFarmUseMoney10kv());
            dbManager.setInt(15,lwWholeSaleStatDetailDto.getBizQuantity10kv());
            dbManager.setDouble(16,lwWholeSaleStatDetailDto.getBizMoney10kv());
            dbManager.setInt(17,lwWholeSaleStatDetailDto.getUnDenizenQuantity35kv());
            dbManager.setDouble(18,lwWholeSaleStatDetailDto.getUnDenizenMoney35kv());
            dbManager.setInt(19,lwWholeSaleStatDetailDto.getDenizenQuantity35kv());
            dbManager.setDouble(20,lwWholeSaleStatDetailDto.getDenizenMoney35kv());
            dbManager.setInt(21,lwWholeSaleStatDetailDto.getProductQuantity35kv());
            dbManager.setDouble(22,lwWholeSaleStatDetailDto.getProductMoney35kv());
            dbManager.setInt(23,lwWholeSaleStatDetailDto.getUnIndustryQuantity35kv());
            dbManager.setDouble(24,lwWholeSaleStatDetailDto.getUnIndustryMoney35kv());
            dbManager.setInt(25,lwWholeSaleStatDetailDto.getFarmUseQuantity35kv());
            dbManager.setDouble(26,lwWholeSaleStatDetailDto.getFarmUseMoney35kv());
            dbManager.setInt(27,lwWholeSaleStatDetailDto.getBizQuantity35kv());
            dbManager.setDouble(28,lwWholeSaleStatDetailDto.getBizMoney35kv());
            dbManager.setInt(29,lwWholeSaleStatDetailDto.getSumQuantity10KV());
            dbManager.setInt(30,lwWholeSaleStatDetailDto.getSumQuantity35KV());
            dbManager.setInt(31,lwWholeSaleStatDetailDto.getSumQuantity());
            dbManager.setDouble(32,lwWholeSaleStatDetailDto.getPowerFee());
            dbManager.setDouble(33,lwWholeSaleStatDetailDto.getPowerFeeTax());
            dbManager.setDouble(34,lwWholeSaleStatDetailDto.getLilvFee());
            dbManager.setDouble(35,lwWholeSaleStatDetailDto.getBroadFee());
            dbManager.setDouble(36,lwWholeSaleStatDetailDto.getHaiminglu());
            dbManager.setDouble(37,lwWholeSaleStatDetailDto.getDuobianFee());
            dbManager.setDouble(38,lwWholeSaleStatDetailDto.getTuibuFee());
            dbManager.setDouble(39,lwWholeSaleStatDetailDto.getSumPowerFee());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param companyCode 公司代码
     * @param statStyle 统计标志
     * @param inputDate 统计日期
     * @throws Exception
     */
    public void delete(String companyCode,String statStyle,String inputDate)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwWholeSaleStatDetail ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CompanyCode=").append("'").append(companyCode).append("' AND ");
            debugBuffer.append("StatStyle=").append("'").append(statStyle).append("' AND ");
            debugBuffer.append("InputDate=").append("'").append(inputDate).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CompanyCode = ? And ");
        buffer.append("StatStyle = ? And ");
        buffer.append("InputDate = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,companyCode);
        dbManager.setString(2,statStyle);
        dbManager.setString(3,inputDate);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public void update(LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwWholeSaleStatDetail SET ");
        buffer.append("CompanyName = ?, ");
        buffer.append("UnDenizenQuantity10kv = ?, ");
        buffer.append("UnDenizenMoney10kv = ?, ");
        buffer.append("DenizenQuantity10kv = ?, ");
        buffer.append("DenizenMoney10kv = ?, ");
        buffer.append("ProductQuantity10kv = ?, ");
        buffer.append("ProductMoney10kv = ?, ");
        buffer.append("UnIndustryQuantity10kv = ?, ");
        buffer.append("UnIndustryMoney10kv = ?, ");
        buffer.append("FarmUseQuantity10kv = ?, ");
        buffer.append("FarmUseMoney10kv = ?, ");
        buffer.append("BizQuantity10kv = ?, ");
        buffer.append("BizMoney10kv = ?, ");
        buffer.append("UnDenizenQuantity35kv = ?, ");
        buffer.append("UnDenizenMoney35kv = ?, ");
        buffer.append("DenizenQuantity35kv = ?, ");
        buffer.append("DenizenMoney35kv = ?, ");
        buffer.append("ProductQuantity35kv = ?, ");
        buffer.append("ProductMoney35kv = ?, ");
        buffer.append("UnIndustryQuantity35kv = ?, ");
        buffer.append("UnIndustryMoney35kv = ?, ");
        buffer.append("FarmUseQuantity35kv = ?, ");
        buffer.append("FarmUseMoney35kv = ?, ");
        buffer.append("BizQuantity35kv = ?, ");
        buffer.append("BizMoney35kv = ?, ");
        buffer.append("SumQuantity10KV = ?, ");
        buffer.append("SumQuantity35KV = ?, ");
        buffer.append("SumQuantity = ?, ");
        buffer.append("PowerFee = ?, ");
        buffer.append("PowerFeeTax = ?, ");
        buffer.append("LilvFee = ?, ");
        buffer.append("BroadFee = ?, ");
        buffer.append("Haiminglu = ?, ");
        buffer.append("DuobianFee = ?, ");
        buffer.append("TuibuFee = ?, ");
        buffer.append("SumPowerFee = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwWholeSaleStatDetail SET ");
            debugBuffer.append("CompanyName = '" + lwWholeSaleStatDetailDto.getCompanyName() + "', ");
            debugBuffer.append("UnDenizenQuantity10kv = " + lwWholeSaleStatDetailDto.getUnDenizenQuantity10kv() + ", ");
            debugBuffer.append("UnDenizenMoney10kv = " + lwWholeSaleStatDetailDto.getUnDenizenMoney10kv() + ", ");
            debugBuffer.append("DenizenQuantity10kv = " + lwWholeSaleStatDetailDto.getDenizenQuantity10kv() + ", ");
            debugBuffer.append("DenizenMoney10kv = " + lwWholeSaleStatDetailDto.getDenizenMoney10kv() + ", ");
            debugBuffer.append("ProductQuantity10kv = " + lwWholeSaleStatDetailDto.getProductQuantity10kv() + ", ");
            debugBuffer.append("ProductMoney10kv = " + lwWholeSaleStatDetailDto.getProductMoney10kv() + ", ");
            debugBuffer.append("UnIndustryQuantity10kv = " + lwWholeSaleStatDetailDto.getUnIndustryQuantity10kv() + ", ");
            debugBuffer.append("UnIndustryMoney10kv = " + lwWholeSaleStatDetailDto.getUnIndustryMoney10kv() + ", ");
            debugBuffer.append("FarmUseQuantity10kv = " + lwWholeSaleStatDetailDto.getFarmUseQuantity10kv() + ", ");
            debugBuffer.append("FarmUseMoney10kv = " + lwWholeSaleStatDetailDto.getFarmUseMoney10kv() + ", ");
            debugBuffer.append("BizQuantity10kv = " + lwWholeSaleStatDetailDto.getBizQuantity10kv() + ", ");
            debugBuffer.append("BizMoney10kv = " + lwWholeSaleStatDetailDto.getBizMoney10kv() + ", ");
            debugBuffer.append("UnDenizenQuantity35kv = " + lwWholeSaleStatDetailDto.getUnDenizenQuantity35kv() + ", ");
            debugBuffer.append("UnDenizenMoney35kv = " + lwWholeSaleStatDetailDto.getUnDenizenMoney35kv() + ", ");
            debugBuffer.append("DenizenQuantity35kv = " + lwWholeSaleStatDetailDto.getDenizenQuantity35kv() + ", ");
            debugBuffer.append("DenizenMoney35kv = " + lwWholeSaleStatDetailDto.getDenizenMoney35kv() + ", ");
            debugBuffer.append("ProductQuantity35kv = " + lwWholeSaleStatDetailDto.getProductQuantity35kv() + ", ");
            debugBuffer.append("ProductMoney35kv = " + lwWholeSaleStatDetailDto.getProductMoney35kv() + ", ");
            debugBuffer.append("UnIndustryQuantity35kv = " + lwWholeSaleStatDetailDto.getUnIndustryQuantity35kv() + ", ");
            debugBuffer.append("UnIndustryMoney35kv = " + lwWholeSaleStatDetailDto.getUnIndustryMoney35kv() + ", ");
            debugBuffer.append("FarmUseQuantity35kv = " + lwWholeSaleStatDetailDto.getFarmUseQuantity35kv() + ", ");
            debugBuffer.append("FarmUseMoney35kv = " + lwWholeSaleStatDetailDto.getFarmUseMoney35kv() + ", ");
            debugBuffer.append("BizQuantity35kv = " + lwWholeSaleStatDetailDto.getBizQuantity35kv() + ", ");
            debugBuffer.append("BizMoney35kv = " + lwWholeSaleStatDetailDto.getBizMoney35kv() + ", ");
            debugBuffer.append("SumQuantity10KV = " + lwWholeSaleStatDetailDto.getSumQuantity10KV() + ", ");
            debugBuffer.append("SumQuantity35KV = " + lwWholeSaleStatDetailDto.getSumQuantity35KV() + ", ");
            debugBuffer.append("SumQuantity = " + lwWholeSaleStatDetailDto.getSumQuantity() + ", ");
            debugBuffer.append("PowerFee = " + lwWholeSaleStatDetailDto.getPowerFee() + ", ");
            debugBuffer.append("PowerFeeTax = " + lwWholeSaleStatDetailDto.getPowerFeeTax() + ", ");
            debugBuffer.append("LilvFee = " + lwWholeSaleStatDetailDto.getLilvFee() + ", ");
            debugBuffer.append("BroadFee = " + lwWholeSaleStatDetailDto.getBroadFee() + ", ");
            debugBuffer.append("Haiminglu = " + lwWholeSaleStatDetailDto.getHaiminglu() + ", ");
            debugBuffer.append("DuobianFee = " + lwWholeSaleStatDetailDto.getDuobianFee() + ", ");
            debugBuffer.append("TuibuFee = " + lwWholeSaleStatDetailDto.getTuibuFee() + ", ");
            debugBuffer.append("SumPowerFee = " + lwWholeSaleStatDetailDto.getSumPowerFee() + " ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("CompanyCode=").append("'").append(lwWholeSaleStatDetailDto.getCompanyCode()).append("' AND ");
            debugBuffer.append("StatStyle=").append("'").append(lwWholeSaleStatDetailDto.getStatStyle()).append("' AND ");
            debugBuffer.append("InputDate=").append("'").append(lwWholeSaleStatDetailDto.getInputDate()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CompanyCode = ? And ");
        buffer.append("StatStyle = ? And ");
        buffer.append("InputDate = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwWholeSaleStatDetailDto.getCompanyName());
        dbManager.setInt(2,lwWholeSaleStatDetailDto.getUnDenizenQuantity10kv());
        dbManager.setDouble(3,lwWholeSaleStatDetailDto.getUnDenizenMoney10kv());
        dbManager.setInt(4,lwWholeSaleStatDetailDto.getDenizenQuantity10kv());
        dbManager.setDouble(5,lwWholeSaleStatDetailDto.getDenizenMoney10kv());
        dbManager.setInt(6,lwWholeSaleStatDetailDto.getProductQuantity10kv());
        dbManager.setDouble(7,lwWholeSaleStatDetailDto.getProductMoney10kv());
        dbManager.setInt(8,lwWholeSaleStatDetailDto.getUnIndustryQuantity10kv());
        dbManager.setDouble(9,lwWholeSaleStatDetailDto.getUnIndustryMoney10kv());
        dbManager.setInt(10,lwWholeSaleStatDetailDto.getFarmUseQuantity10kv());
        dbManager.setDouble(11,lwWholeSaleStatDetailDto.getFarmUseMoney10kv());
        dbManager.setInt(12,lwWholeSaleStatDetailDto.getBizQuantity10kv());
        dbManager.setDouble(13,lwWholeSaleStatDetailDto.getBizMoney10kv());
        dbManager.setInt(14,lwWholeSaleStatDetailDto.getUnDenizenQuantity35kv());
        dbManager.setDouble(15,lwWholeSaleStatDetailDto.getUnDenizenMoney35kv());
        dbManager.setInt(16,lwWholeSaleStatDetailDto.getDenizenQuantity35kv());
        dbManager.setDouble(17,lwWholeSaleStatDetailDto.getDenizenMoney35kv());
        dbManager.setInt(18,lwWholeSaleStatDetailDto.getProductQuantity35kv());
        dbManager.setDouble(19,lwWholeSaleStatDetailDto.getProductMoney35kv());
        dbManager.setInt(20,lwWholeSaleStatDetailDto.getUnIndustryQuantity35kv());
        dbManager.setDouble(21,lwWholeSaleStatDetailDto.getUnIndustryMoney35kv());
        dbManager.setInt(22,lwWholeSaleStatDetailDto.getFarmUseQuantity35kv());
        dbManager.setDouble(23,lwWholeSaleStatDetailDto.getFarmUseMoney35kv());
        dbManager.setInt(24,lwWholeSaleStatDetailDto.getBizQuantity35kv());
        dbManager.setDouble(25,lwWholeSaleStatDetailDto.getBizMoney35kv());
        dbManager.setInt(26,lwWholeSaleStatDetailDto.getSumQuantity10KV());
        dbManager.setInt(27,lwWholeSaleStatDetailDto.getSumQuantity35KV());
        dbManager.setInt(28,lwWholeSaleStatDetailDto.getSumQuantity());
        dbManager.setDouble(29,lwWholeSaleStatDetailDto.getPowerFee());
        dbManager.setDouble(30,lwWholeSaleStatDetailDto.getPowerFeeTax());
        dbManager.setDouble(31,lwWholeSaleStatDetailDto.getLilvFee());
        dbManager.setDouble(32,lwWholeSaleStatDetailDto.getBroadFee());
        dbManager.setDouble(33,lwWholeSaleStatDetailDto.getHaiminglu());
        dbManager.setDouble(34,lwWholeSaleStatDetailDto.getDuobianFee());
        dbManager.setDouble(35,lwWholeSaleStatDetailDto.getTuibuFee());
        dbManager.setDouble(36,lwWholeSaleStatDetailDto.getSumPowerFee());
        //设置条件字段;
        dbManager.setString(37,lwWholeSaleStatDetailDto.getCompanyCode());
        dbManager.setString(38,lwWholeSaleStatDetailDto.getStatStyle());
        dbManager.setString(39,lwWholeSaleStatDetailDto.getInputDate());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param companyCode 公司代码
     * @param statStyle 统计标志
     * @param inputDate 统计日期
     * @return LwWholeSaleStatDetailDto
     * @throws Exception
     */
    public LwWholeSaleStatDetailDto findByPrimaryKey(String companyCode,String statStyle,String inputDate)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("CompanyCode,");
        buffer.append("CompanyName,");
        buffer.append("StatStyle,");
        buffer.append("InputDate,");
        buffer.append("UnDenizenQuantity10kv,");
        buffer.append("UnDenizenMoney10kv,");
        buffer.append("DenizenQuantity10kv,");
        buffer.append("DenizenMoney10kv,");
        buffer.append("ProductQuantity10kv,");
        buffer.append("ProductMoney10kv,");
        buffer.append("UnIndustryQuantity10kv,");
        buffer.append("UnIndustryMoney10kv,");
        buffer.append("FarmUseQuantity10kv,");
        buffer.append("FarmUseMoney10kv,");
        buffer.append("BizQuantity10kv,");
        buffer.append("BizMoney10kv,");
        buffer.append("UnDenizenQuantity35kv,");
        buffer.append("UnDenizenMoney35kv,");
        buffer.append("DenizenQuantity35kv,");
        buffer.append("DenizenMoney35kv,");
        buffer.append("ProductQuantity35kv,");
        buffer.append("ProductMoney35kv,");
        buffer.append("UnIndustryQuantity35kv,");
        buffer.append("UnIndustryMoney35kv,");
        buffer.append("FarmUseQuantity35kv,");
        buffer.append("FarmUseMoney35kv,");
        buffer.append("BizQuantity35kv,");
        buffer.append("BizMoney35kv,");
        buffer.append("SumQuantity10KV,");
        buffer.append("SumQuantity35KV,");
        buffer.append("SumQuantity,");
        buffer.append("PowerFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("LilvFee,");
        buffer.append("BroadFee,");
        buffer.append("Haiminglu,");
        buffer.append("DuobianFee,");
        buffer.append("TuibuFee,");
        buffer.append("SumPowerFee ");
        buffer.append("FROM LwWholeSaleStatDetail ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CompanyCode=").append("'").append(companyCode).append("' AND ");
            debugBuffer.append("StatStyle=").append("'").append(statStyle).append("' AND ");
            debugBuffer.append("InputDate=").append("'").append(inputDate).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CompanyCode = ? And ");
        buffer.append("StatStyle = ? And ");
        buffer.append("InputDate = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,companyCode);
        dbManager.setString(2,statStyle);
        dbManager.setString(3,inputDate);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto = null;
        if(resultSet.next()){
            lwWholeSaleStatDetailDto = new LwWholeSaleStatDetailDto();
            lwWholeSaleStatDetailDto.setCompanyCode(dbManager.getString(resultSet,1));
            lwWholeSaleStatDetailDto.setCompanyName(dbManager.getString(resultSet,2));
            lwWholeSaleStatDetailDto.setStatStyle(dbManager.getString(resultSet,3));
            lwWholeSaleStatDetailDto.setInputDate(dbManager.getString(resultSet,4));
            lwWholeSaleStatDetailDto.setUnDenizenQuantity10kv(dbManager.getInt(resultSet,5));
            lwWholeSaleStatDetailDto.setUnDenizenMoney10kv(dbManager.getDouble(resultSet,6));
            lwWholeSaleStatDetailDto.setDenizenQuantity10kv(dbManager.getInt(resultSet,7));
            lwWholeSaleStatDetailDto.setDenizenMoney10kv(dbManager.getDouble(resultSet,8));
            lwWholeSaleStatDetailDto.setProductQuantity10kv(dbManager.getInt(resultSet,9));
            lwWholeSaleStatDetailDto.setProductMoney10kv(dbManager.getDouble(resultSet,10));
            lwWholeSaleStatDetailDto.setUnIndustryQuantity10kv(dbManager.getInt(resultSet,11));
            lwWholeSaleStatDetailDto.setUnIndustryMoney10kv(dbManager.getDouble(resultSet,12));
            lwWholeSaleStatDetailDto.setFarmUseQuantity10kv(dbManager.getInt(resultSet,13));
            lwWholeSaleStatDetailDto.setFarmUseMoney10kv(dbManager.getDouble(resultSet,14));
            lwWholeSaleStatDetailDto.setBizQuantity10kv(dbManager.getInt(resultSet,15));
            lwWholeSaleStatDetailDto.setBizMoney10kv(dbManager.getDouble(resultSet,16));
            lwWholeSaleStatDetailDto.setUnDenizenQuantity35kv(dbManager.getInt(resultSet,17));
            lwWholeSaleStatDetailDto.setUnDenizenMoney35kv(dbManager.getDouble(resultSet,18));
            lwWholeSaleStatDetailDto.setDenizenQuantity35kv(dbManager.getInt(resultSet,19));
            lwWholeSaleStatDetailDto.setDenizenMoney35kv(dbManager.getDouble(resultSet,20));
            lwWholeSaleStatDetailDto.setProductQuantity35kv(dbManager.getInt(resultSet,21));
            lwWholeSaleStatDetailDto.setProductMoney35kv(dbManager.getDouble(resultSet,22));
            lwWholeSaleStatDetailDto.setUnIndustryQuantity35kv(dbManager.getInt(resultSet,23));
            lwWholeSaleStatDetailDto.setUnIndustryMoney35kv(dbManager.getDouble(resultSet,24));
            lwWholeSaleStatDetailDto.setFarmUseQuantity35kv(dbManager.getInt(resultSet,25));
            lwWholeSaleStatDetailDto.setFarmUseMoney35kv(dbManager.getDouble(resultSet,26));
            lwWholeSaleStatDetailDto.setBizQuantity35kv(dbManager.getInt(resultSet,27));
            lwWholeSaleStatDetailDto.setBizMoney35kv(dbManager.getDouble(resultSet,28));
            lwWholeSaleStatDetailDto.setSumQuantity10KV(dbManager.getInt(resultSet,29));
            lwWholeSaleStatDetailDto.setSumQuantity35KV(dbManager.getInt(resultSet,30));
            lwWholeSaleStatDetailDto.setSumQuantity(dbManager.getInt(resultSet,31));
            lwWholeSaleStatDetailDto.setPowerFee(dbManager.getDouble(resultSet,32));
            lwWholeSaleStatDetailDto.setPowerFeeTax(dbManager.getDouble(resultSet,33));
            lwWholeSaleStatDetailDto.setLilvFee(dbManager.getDouble(resultSet,34));
            lwWholeSaleStatDetailDto.setBroadFee(dbManager.getDouble(resultSet,35));
            lwWholeSaleStatDetailDto.setHaiminglu(dbManager.getDouble(resultSet,36));
            lwWholeSaleStatDetailDto.setDuobianFee(dbManager.getDouble(resultSet,37));
            lwWholeSaleStatDetailDto.setTuibuFee(dbManager.getDouble(resultSet,38));
            lwWholeSaleStatDetailDto.setSumPowerFee(dbManager.getDouble(resultSet,39));
        }
        resultSet.close();
        return lwWholeSaleStatDetailDto;
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
        buffer.append("CompanyCode,");
        buffer.append("CompanyName,");
        buffer.append("StatStyle,");
        buffer.append("InputDate,");
        buffer.append("UnDenizenQuantity10kv,");
        buffer.append("UnDenizenMoney10kv,");
        buffer.append("DenizenQuantity10kv,");
        buffer.append("DenizenMoney10kv,");
        buffer.append("ProductQuantity10kv,");
        buffer.append("ProductMoney10kv,");
        buffer.append("UnIndustryQuantity10kv,");
        buffer.append("UnIndustryMoney10kv,");
        buffer.append("FarmUseQuantity10kv,");
        buffer.append("FarmUseMoney10kv,");
        buffer.append("BizQuantity10kv,");
        buffer.append("BizMoney10kv,");
        buffer.append("UnDenizenQuantity35kv,");
        buffer.append("UnDenizenMoney35kv,");
        buffer.append("DenizenQuantity35kv,");
        buffer.append("DenizenMoney35kv,");
        buffer.append("ProductQuantity35kv,");
        buffer.append("ProductMoney35kv,");
        buffer.append("UnIndustryQuantity35kv,");
        buffer.append("UnIndustryMoney35kv,");
        buffer.append("FarmUseQuantity35kv,");
        buffer.append("FarmUseMoney35kv,");
        buffer.append("BizQuantity35kv,");
        buffer.append("BizMoney35kv,");
        buffer.append("SumQuantity10KV,");
        buffer.append("SumQuantity35KV,");
        buffer.append("SumQuantity,");
        buffer.append("PowerFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("LilvFee,");
        buffer.append("BroadFee,");
        buffer.append("Haiminglu,");
        buffer.append("DuobianFee,");
        buffer.append("TuibuFee,");
        buffer.append("SumPowerFee ");
        buffer.append("FROM LwWholeSaleStatDetail WHERE ");
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
        LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwWholeSaleStatDetailDto = new LwWholeSaleStatDetailDto();
            lwWholeSaleStatDetailDto.setCompanyCode(dbManager.getString(resultSet,"CompanyCode"));
            lwWholeSaleStatDetailDto.setCompanyName(dbManager.getString(resultSet,"CompanyName"));
            lwWholeSaleStatDetailDto.setStatStyle(dbManager.getString(resultSet,"StatStyle"));
            lwWholeSaleStatDetailDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwWholeSaleStatDetailDto.setUnDenizenQuantity10kv(dbManager.getInt(resultSet,"UnDenizenQuantity10kv"));
            lwWholeSaleStatDetailDto.setUnDenizenMoney10kv(dbManager.getDouble(resultSet,"UnDenizenMoney10kv"));
            lwWholeSaleStatDetailDto.setDenizenQuantity10kv(dbManager.getInt(resultSet,"DenizenQuantity10kv"));
            lwWholeSaleStatDetailDto.setDenizenMoney10kv(dbManager.getDouble(resultSet,"DenizenMoney10kv"));
            lwWholeSaleStatDetailDto.setProductQuantity10kv(dbManager.getInt(resultSet,"ProductQuantity10kv"));
            lwWholeSaleStatDetailDto.setProductMoney10kv(dbManager.getDouble(resultSet,"ProductMoney10kv"));
            lwWholeSaleStatDetailDto.setUnIndustryQuantity10kv(dbManager.getInt(resultSet,"UnIndustryQuantity10kv"));
            lwWholeSaleStatDetailDto.setUnIndustryMoney10kv(dbManager.getDouble(resultSet,"UnIndustryMoney10kv"));
            lwWholeSaleStatDetailDto.setFarmUseQuantity10kv(dbManager.getInt(resultSet,"FarmUseQuantity10kv"));
            lwWholeSaleStatDetailDto.setFarmUseMoney10kv(dbManager.getDouble(resultSet,"FarmUseMoney10kv"));
            lwWholeSaleStatDetailDto.setBizQuantity10kv(dbManager.getInt(resultSet,"BizQuantity10kv"));
            lwWholeSaleStatDetailDto.setBizMoney10kv(dbManager.getDouble(resultSet,"BizMoney10kv"));
            lwWholeSaleStatDetailDto.setUnDenizenQuantity35kv(dbManager.getInt(resultSet,"UnDenizenQuantity35kv"));
            lwWholeSaleStatDetailDto.setUnDenizenMoney35kv(dbManager.getDouble(resultSet,"UnDenizenMoney35kv"));
            lwWholeSaleStatDetailDto.setDenizenQuantity35kv(dbManager.getInt(resultSet,"DenizenQuantity35kv"));
            lwWholeSaleStatDetailDto.setDenizenMoney35kv(dbManager.getDouble(resultSet,"DenizenMoney35kv"));
            lwWholeSaleStatDetailDto.setProductQuantity35kv(dbManager.getInt(resultSet,"ProductQuantity35kv"));
            lwWholeSaleStatDetailDto.setProductMoney35kv(dbManager.getDouble(resultSet,"ProductMoney35kv"));
            lwWholeSaleStatDetailDto.setUnIndustryQuantity35kv(dbManager.getInt(resultSet,"UnIndustryQuantity35kv"));
            lwWholeSaleStatDetailDto.setUnIndustryMoney35kv(dbManager.getDouble(resultSet,"UnIndustryMoney35kv"));
            lwWholeSaleStatDetailDto.setFarmUseQuantity35kv(dbManager.getInt(resultSet,"FarmUseQuantity35kv"));
            lwWholeSaleStatDetailDto.setFarmUseMoney35kv(dbManager.getDouble(resultSet,"FarmUseMoney35kv"));
            lwWholeSaleStatDetailDto.setBizQuantity35kv(dbManager.getInt(resultSet,"BizQuantity35kv"));
            lwWholeSaleStatDetailDto.setBizMoney35kv(dbManager.getDouble(resultSet,"BizMoney35kv"));
            lwWholeSaleStatDetailDto.setSumQuantity10KV(dbManager.getInt(resultSet,"SumQuantity10KV"));
            lwWholeSaleStatDetailDto.setSumQuantity35KV(dbManager.getInt(resultSet,"SumQuantity35KV"));
            lwWholeSaleStatDetailDto.setSumQuantity(dbManager.getInt(resultSet,"SumQuantity"));
            lwWholeSaleStatDetailDto.setPowerFee(dbManager.getDouble(resultSet,"PowerFee"));
            lwWholeSaleStatDetailDto.setPowerFeeTax(dbManager.getDouble(resultSet,"PowerFeeTax"));
            lwWholeSaleStatDetailDto.setLilvFee(dbManager.getDouble(resultSet,"LilvFee"));
            lwWholeSaleStatDetailDto.setBroadFee(dbManager.getDouble(resultSet,"BroadFee"));
            lwWholeSaleStatDetailDto.setHaiminglu(dbManager.getDouble(resultSet,"Haiminglu"));
            lwWholeSaleStatDetailDto.setDuobianFee(dbManager.getDouble(resultSet,"DuobianFee"));
            lwWholeSaleStatDetailDto.setTuibuFee(dbManager.getDouble(resultSet,"TuibuFee"));
            lwWholeSaleStatDetailDto.setSumPowerFee(dbManager.getDouble(resultSet,"SumPowerFee"));
            collection.add(lwWholeSaleStatDetailDto);
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
        buffer.append("DELETE FROM LwWholeSaleStatDetail WHERE ");
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
        buffer.append("SELECT count(*) FROM LwWholeSaleStatDetail WHERE ");
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
