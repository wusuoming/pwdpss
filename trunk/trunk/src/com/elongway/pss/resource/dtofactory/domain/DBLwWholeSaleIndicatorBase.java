package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleIndicator-趸售电表指针记录表的数据访问对象基类<br>
 */
public class DBLwWholeSaleIndicatorBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwWholeSaleIndicatorBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleIndicatorBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public void insert(LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwWholeSaleIndicator (");
        buffer.append("UserNo,");
        buffer.append("StatMonth,");
        buffer.append("LastWorkNum,");
        buffer.append("ThisWorkNum,");
        buffer.append("LastIdleNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("UnCompensateQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("UnLineLossQuantity,");
        buffer.append("LineLossQuantity,");
        buffer.append("UnTransLossQuantity,");
        buffer.append("TransLossQuantity,");
        buffer.append("WorkQuantity,");
        buffer.append("UnworkQuantity,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("ReadDate,");
        buffer.append("InputDate,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("LossRate,");
        buffer.append("PowerCode,");
        buffer.append("IfCal,");
        buffer.append("DifferenceQuantity ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getLastIdleNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getThisIdleNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getRate()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getReadQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getExcepQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getChgAmmeterQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getUnCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getUnLineLossQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getLineLossQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getUnTransLossQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getTransLossQuantity()).append(",");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getWorkQuantity()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getUnworkQuantity()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getReadDate()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getInputDate()).append("',");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getLossRate()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorDto.getPowerCode()).append(",");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getIfCal()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorDto.getDifferenceQuantity()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwWholeSaleIndicatorDto.getUserNo());
        dbManager.setString(2,lwWholeSaleIndicatorDto.getStatMonth());
        dbManager.setDouble(3,lwWholeSaleIndicatorDto.getLastWorkNum());
        dbManager.setDouble(4,lwWholeSaleIndicatorDto.getThisWorkNum());
        dbManager.setDouble(5,lwWholeSaleIndicatorDto.getLastIdleNum());
        dbManager.setDouble(6,lwWholeSaleIndicatorDto.getThisIdleNum());
        dbManager.setDouble(7,lwWholeSaleIndicatorDto.getRate());
        dbManager.setDouble(8,lwWholeSaleIndicatorDto.getReadQuantity());
        dbManager.setDouble(9,lwWholeSaleIndicatorDto.getExcepQuantity());
        dbManager.setDouble(10,lwWholeSaleIndicatorDto.getChgAmmeterQuantity());
        dbManager.setDouble(11,lwWholeSaleIndicatorDto.getUnCompensateQuantity());
        dbManager.setDouble(12,lwWholeSaleIndicatorDto.getCompensateQuantity());
        dbManager.setDouble(13,lwWholeSaleIndicatorDto.getUnLineLossQuantity());
        dbManager.setDouble(14,lwWholeSaleIndicatorDto.getLineLossQuantity());
        dbManager.setDouble(15,lwWholeSaleIndicatorDto.getUnTransLossQuantity());
        dbManager.setDouble(16,lwWholeSaleIndicatorDto.getTransLossQuantity());
        dbManager.setString(17,lwWholeSaleIndicatorDto.getWorkQuantity());
        dbManager.setString(18,lwWholeSaleIndicatorDto.getUnworkQuantity());
        dbManager.setString(19,lwWholeSaleIndicatorDto.getValidStatus());
        dbManager.setString(20,lwWholeSaleIndicatorDto.getFlag());
        dbManager.setString(21,lwWholeSaleIndicatorDto.getRemark());
        dbManager.setString(22,lwWholeSaleIndicatorDto.getReadDate());
        dbManager.setString(23,lwWholeSaleIndicatorDto.getInputDate());
        dbManager.setDouble(24,lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity());
        dbManager.setDouble(25,lwWholeSaleIndicatorDto.getLossRate());
        dbManager.setDouble(26,lwWholeSaleIndicatorDto.getPowerCode());
        dbManager.setString(27,lwWholeSaleIndicatorDto.getIfCal());
        dbManager.setString(28,lwWholeSaleIndicatorDto.getDifferenceQuantity());
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
        buffer.append("INSERT INTO LwWholeSaleIndicator (");
        buffer.append("UserNo,");
        buffer.append("StatMonth,");
        buffer.append("LastWorkNum,");
        buffer.append("ThisWorkNum,");
        buffer.append("LastIdleNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("UnCompensateQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("UnLineLossQuantity,");
        buffer.append("LineLossQuantity,");
        buffer.append("UnTransLossQuantity,");
        buffer.append("TransLossQuantity,");
        buffer.append("WorkQuantity,");
        buffer.append("UnworkQuantity,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("ReadDate,");
        buffer.append("InputDate,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("LossRate,");
        buffer.append("PowerCode,");
        buffer.append("IfCal,");
        buffer.append("DifferenceQuantity ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = (LwWholeSaleIndicatorDto)i.next();
            dbManager.setString(1,lwWholeSaleIndicatorDto.getUserNo());
            dbManager.setString(2,lwWholeSaleIndicatorDto.getStatMonth());
            dbManager.setDouble(3,lwWholeSaleIndicatorDto.getLastWorkNum());
            dbManager.setDouble(4,lwWholeSaleIndicatorDto.getThisWorkNum());
            dbManager.setDouble(5,lwWholeSaleIndicatorDto.getLastIdleNum());
            dbManager.setDouble(6,lwWholeSaleIndicatorDto.getThisIdleNum());
            dbManager.setDouble(7,lwWholeSaleIndicatorDto.getRate());
            dbManager.setDouble(8,lwWholeSaleIndicatorDto.getReadQuantity());
            dbManager.setDouble(9,lwWholeSaleIndicatorDto.getExcepQuantity());
            dbManager.setDouble(10,lwWholeSaleIndicatorDto.getChgAmmeterQuantity());
            dbManager.setDouble(11,lwWholeSaleIndicatorDto.getUnCompensateQuantity());
            dbManager.setDouble(12,lwWholeSaleIndicatorDto.getCompensateQuantity());
            dbManager.setDouble(13,lwWholeSaleIndicatorDto.getUnLineLossQuantity());
            dbManager.setDouble(14,lwWholeSaleIndicatorDto.getLineLossQuantity());
            dbManager.setDouble(15,lwWholeSaleIndicatorDto.getUnTransLossQuantity());
            dbManager.setDouble(16,lwWholeSaleIndicatorDto.getTransLossQuantity());
            dbManager.setString(17,lwWholeSaleIndicatorDto.getWorkQuantity());
            dbManager.setString(18,lwWholeSaleIndicatorDto.getUnworkQuantity());
            dbManager.setString(19,lwWholeSaleIndicatorDto.getValidStatus());
            dbManager.setString(20,lwWholeSaleIndicatorDto.getFlag());
            dbManager.setString(21,lwWholeSaleIndicatorDto.getRemark());
            dbManager.setString(22,lwWholeSaleIndicatorDto.getReadDate());
            dbManager.setString(23,lwWholeSaleIndicatorDto.getInputDate());
            dbManager.setDouble(24,lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity());
            dbManager.setDouble(25,lwWholeSaleIndicatorDto.getLossRate());
            dbManager.setDouble(26,lwWholeSaleIndicatorDto.getPowerCode());
            dbManager.setString(27,lwWholeSaleIndicatorDto.getIfCal());
            dbManager.setString(28,lwWholeSaleIndicatorDto.getDifferenceQuantity());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userNo 户号
     * @param statMonth 帐期
     * @throws Exception
     */
    public void delete(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwWholeSaleIndicator ");
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
     * @param lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public void update(LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwWholeSaleIndicator SET ");
        buffer.append("LastWorkNum = ?, ");
        buffer.append("ThisWorkNum = ?, ");
        buffer.append("LastIdleNum = ?, ");
        buffer.append("ThisIdleNum = ?, ");
        buffer.append("Rate = ?, ");
        buffer.append("ReadQuantity = ?, ");
        buffer.append("ExcepQuantity = ?, ");
        buffer.append("ChgAmmeterQuantity = ?, ");
        buffer.append("UnCompensateQuantity = ?, ");
        buffer.append("CompensateQuantity = ?, ");
        buffer.append("UnLineLossQuantity = ?, ");
        buffer.append("LineLossQuantity = ?, ");
        buffer.append("UnTransLossQuantity = ?, ");
        buffer.append("TransLossQuantity = ?, ");
        buffer.append("WorkQuantity = ?, ");
        buffer.append("UnworkQuantity = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("ReadDate = ?, ");
        buffer.append("InputDate = ?, ");
        buffer.append("UnChgAmmeterQuantity = ?, ");
        buffer.append("LossRate = ?, ");
        buffer.append("PowerCode = ?, ");
        buffer.append("IfCal = ?, ");
        buffer.append("DifferenceQuantity = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwWholeSaleIndicator SET ");
            debugBuffer.append("LastWorkNum = " + lwWholeSaleIndicatorDto.getLastWorkNum() + ", ");
            debugBuffer.append("ThisWorkNum = " + lwWholeSaleIndicatorDto.getThisWorkNum() + ", ");
            debugBuffer.append("LastIdleNum = " + lwWholeSaleIndicatorDto.getLastIdleNum() + ", ");
            debugBuffer.append("ThisIdleNum = " + lwWholeSaleIndicatorDto.getThisIdleNum() + ", ");
            debugBuffer.append("Rate = " + lwWholeSaleIndicatorDto.getRate() + ", ");
            debugBuffer.append("ReadQuantity = " + lwWholeSaleIndicatorDto.getReadQuantity() + ", ");
            debugBuffer.append("ExcepQuantity = " + lwWholeSaleIndicatorDto.getExcepQuantity() + ", ");
            debugBuffer.append("ChgAmmeterQuantity = " + lwWholeSaleIndicatorDto.getChgAmmeterQuantity() + ", ");
            debugBuffer.append("UnCompensateQuantity = " + lwWholeSaleIndicatorDto.getUnCompensateQuantity() + ", ");
            debugBuffer.append("CompensateQuantity = " + lwWholeSaleIndicatorDto.getCompensateQuantity() + ", ");
            debugBuffer.append("UnLineLossQuantity = " + lwWholeSaleIndicatorDto.getUnLineLossQuantity() + ", ");
            debugBuffer.append("LineLossQuantity = " + lwWholeSaleIndicatorDto.getLineLossQuantity() + ", ");
            debugBuffer.append("UnTransLossQuantity = " + lwWholeSaleIndicatorDto.getUnTransLossQuantity() + ", ");
            debugBuffer.append("TransLossQuantity = " + lwWholeSaleIndicatorDto.getTransLossQuantity() + ", ");
            debugBuffer.append("WorkQuantity = '" + lwWholeSaleIndicatorDto.getWorkQuantity() + "', ");
            debugBuffer.append("UnworkQuantity = '" + lwWholeSaleIndicatorDto.getUnworkQuantity() + "', ");
            debugBuffer.append("ValidStatus = '" + lwWholeSaleIndicatorDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwWholeSaleIndicatorDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwWholeSaleIndicatorDto.getRemark() + "', ");
            debugBuffer.append("ReadDate = '" + lwWholeSaleIndicatorDto.getReadDate() + "', ");
            debugBuffer.append("InputDate = '" + lwWholeSaleIndicatorDto.getInputDate() + "', ");
            debugBuffer.append("UnChgAmmeterQuantity = " + lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity() + ", ");
            debugBuffer.append("LossRate = " + lwWholeSaleIndicatorDto.getLossRate() + ", ");
            debugBuffer.append("PowerCode = " + lwWholeSaleIndicatorDto.getPowerCode() + ", ");
            debugBuffer.append("IfCal = '" + lwWholeSaleIndicatorDto.getIfCal() + "', ");
            debugBuffer.append("DifferenceQuantity = '" + lwWholeSaleIndicatorDto.getDifferenceQuantity() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwWholeSaleIndicatorDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwWholeSaleIndicatorDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setDouble(1,lwWholeSaleIndicatorDto.getLastWorkNum());
        dbManager.setDouble(2,lwWholeSaleIndicatorDto.getThisWorkNum());
        dbManager.setDouble(3,lwWholeSaleIndicatorDto.getLastIdleNum());
        dbManager.setDouble(4,lwWholeSaleIndicatorDto.getThisIdleNum());
        dbManager.setDouble(5,lwWholeSaleIndicatorDto.getRate());
        dbManager.setDouble(6,lwWholeSaleIndicatorDto.getReadQuantity());
        dbManager.setDouble(7,lwWholeSaleIndicatorDto.getExcepQuantity());
        dbManager.setDouble(8,lwWholeSaleIndicatorDto.getChgAmmeterQuantity());
        dbManager.setDouble(9,lwWholeSaleIndicatorDto.getUnCompensateQuantity());
        dbManager.setDouble(10,lwWholeSaleIndicatorDto.getCompensateQuantity());
        dbManager.setDouble(11,lwWholeSaleIndicatorDto.getUnLineLossQuantity());
        dbManager.setDouble(12,lwWholeSaleIndicatorDto.getLineLossQuantity());
        dbManager.setDouble(13,lwWholeSaleIndicatorDto.getUnTransLossQuantity());
        dbManager.setDouble(14,lwWholeSaleIndicatorDto.getTransLossQuantity());
        dbManager.setString(15,lwWholeSaleIndicatorDto.getWorkQuantity());
        dbManager.setString(16,lwWholeSaleIndicatorDto.getUnworkQuantity());
        dbManager.setString(17,lwWholeSaleIndicatorDto.getValidStatus());
        dbManager.setString(18,lwWholeSaleIndicatorDto.getFlag());
        dbManager.setString(19,lwWholeSaleIndicatorDto.getRemark());
        dbManager.setString(20,lwWholeSaleIndicatorDto.getReadDate());
        dbManager.setString(21,lwWholeSaleIndicatorDto.getInputDate());
        dbManager.setDouble(22,lwWholeSaleIndicatorDto.getUnChgAmmeterQuantity());
        dbManager.setDouble(23,lwWholeSaleIndicatorDto.getLossRate());
        dbManager.setDouble(24,lwWholeSaleIndicatorDto.getPowerCode());
        dbManager.setString(25,lwWholeSaleIndicatorDto.getIfCal());
        dbManager.setString(26,lwWholeSaleIndicatorDto.getDifferenceQuantity());
        //设置条件字段;
        dbManager.setString(27,lwWholeSaleIndicatorDto.getUserNo());
        dbManager.setString(28,lwWholeSaleIndicatorDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 帐期
     * @return LwWholeSaleIndicatorDto
     * @throws Exception
     */
    public LwWholeSaleIndicatorDto findByPrimaryKey(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("StatMonth,");
        buffer.append("LastWorkNum,");
        buffer.append("ThisWorkNum,");
        buffer.append("LastIdleNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("UnCompensateQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("UnLineLossQuantity,");
        buffer.append("LineLossQuantity,");
        buffer.append("UnTransLossQuantity,");
        buffer.append("TransLossQuantity,");
        buffer.append("WorkQuantity,");
        buffer.append("UnworkQuantity,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("ReadDate,");
        buffer.append("InputDate,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("LossRate,");
        buffer.append("PowerCode,");
        buffer.append("IfCal,");
        buffer.append("DifferenceQuantity ");
        buffer.append("FROM LwWholeSaleIndicator ");
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
        LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = null;
        if(resultSet.next()){
            lwWholeSaleIndicatorDto = new LwWholeSaleIndicatorDto();
            lwWholeSaleIndicatorDto.setUserNo(dbManager.getString(resultSet,1));
            lwWholeSaleIndicatorDto.setStatMonth(dbManager.getString(resultSet,2));
            lwWholeSaleIndicatorDto.setLastWorkNum(dbManager.getDouble(resultSet,3));
            lwWholeSaleIndicatorDto.setThisWorkNum(dbManager.getDouble(resultSet,4));
            lwWholeSaleIndicatorDto.setLastIdleNum(dbManager.getDouble(resultSet,5));
            lwWholeSaleIndicatorDto.setThisIdleNum(dbManager.getDouble(resultSet,6));
            lwWholeSaleIndicatorDto.setRate(dbManager.getDouble(resultSet,7));
            lwWholeSaleIndicatorDto.setReadQuantity(dbManager.getDouble(resultSet,8));
            lwWholeSaleIndicatorDto.setExcepQuantity(dbManager.getDouble(resultSet,9));
            lwWholeSaleIndicatorDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,10));
            lwWholeSaleIndicatorDto.setUnCompensateQuantity(dbManager.getDouble(resultSet,11));
            lwWholeSaleIndicatorDto.setCompensateQuantity(dbManager.getDouble(resultSet,12));
            lwWholeSaleIndicatorDto.setUnLineLossQuantity(dbManager.getDouble(resultSet,13));
            lwWholeSaleIndicatorDto.setLineLossQuantity(dbManager.getDouble(resultSet,14));
            lwWholeSaleIndicatorDto.setUnTransLossQuantity(dbManager.getDouble(resultSet,15));
            lwWholeSaleIndicatorDto.setTransLossQuantity(dbManager.getDouble(resultSet,16));
            lwWholeSaleIndicatorDto.setWorkQuantity(dbManager.getString(resultSet,17));
            lwWholeSaleIndicatorDto.setUnworkQuantity(dbManager.getString(resultSet,18));
            lwWholeSaleIndicatorDto.setValidStatus(dbManager.getString(resultSet,19));
            lwWholeSaleIndicatorDto.setFlag(dbManager.getString(resultSet,20));
            lwWholeSaleIndicatorDto.setRemark(dbManager.getString(resultSet,21));
            lwWholeSaleIndicatorDto.setReadDate(dbManager.getString(resultSet,22));
            lwWholeSaleIndicatorDto.setInputDate(dbManager.getString(resultSet,23));
            lwWholeSaleIndicatorDto.setUnChgAmmeterQuantity(dbManager.getDouble(resultSet,24));
            lwWholeSaleIndicatorDto.setLossRate(dbManager.getDouble(resultSet,25));
            lwWholeSaleIndicatorDto.setPowerCode(dbManager.getDouble(resultSet,26));
            lwWholeSaleIndicatorDto.setIfCal(dbManager.getString(resultSet,27));
            lwWholeSaleIndicatorDto.setDifferenceQuantity(dbManager.getString(resultSet,28));
        }
        resultSet.close();
        return lwWholeSaleIndicatorDto;
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
        buffer.append("StatMonth,");
        buffer.append("LastWorkNum,");
        buffer.append("ThisWorkNum,");
        buffer.append("LastIdleNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("UnCompensateQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("UnLineLossQuantity,");
        buffer.append("LineLossQuantity,");
        buffer.append("UnTransLossQuantity,");
        buffer.append("TransLossQuantity,");
        buffer.append("WorkQuantity,");
        buffer.append("UnworkQuantity,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("ReadDate,");
        buffer.append("InputDate,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("LossRate,");
        buffer.append("PowerCode,");
        buffer.append("IfCal,");
        buffer.append("DifferenceQuantity ");
        buffer.append("FROM LwWholeSaleIndicator WHERE ");
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
        LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwWholeSaleIndicatorDto = new LwWholeSaleIndicatorDto();
            lwWholeSaleIndicatorDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwWholeSaleIndicatorDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwWholeSaleIndicatorDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwWholeSaleIndicatorDto.setThisWorkNum(dbManager.getDouble(resultSet,"ThisWorkNum"));
            lwWholeSaleIndicatorDto.setLastIdleNum(dbManager.getDouble(resultSet,"LastIdleNum"));
            lwWholeSaleIndicatorDto.setThisIdleNum(dbManager.getDouble(resultSet,"ThisIdleNum"));
            lwWholeSaleIndicatorDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwWholeSaleIndicatorDto.setReadQuantity(dbManager.getDouble(resultSet,"ReadQuantity"));
            lwWholeSaleIndicatorDto.setExcepQuantity(dbManager.getDouble(resultSet,"ExcepQuantity"));
            lwWholeSaleIndicatorDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,"ChgAmmeterQuantity"));
            lwWholeSaleIndicatorDto.setUnCompensateQuantity(dbManager.getDouble(resultSet,"UnCompensateQuantity"));
            lwWholeSaleIndicatorDto.setCompensateQuantity(dbManager.getDouble(resultSet,"CompensateQuantity"));
            lwWholeSaleIndicatorDto.setUnLineLossQuantity(dbManager.getDouble(resultSet,"UnLineLossQuantity"));
            lwWholeSaleIndicatorDto.setLineLossQuantity(dbManager.getDouble(resultSet,"LineLossQuantity"));
            lwWholeSaleIndicatorDto.setUnTransLossQuantity(dbManager.getDouble(resultSet,"UnTransLossQuantity"));
            lwWholeSaleIndicatorDto.setTransLossQuantity(dbManager.getDouble(resultSet,"TransLossQuantity"));
            lwWholeSaleIndicatorDto.setWorkQuantity(dbManager.getString(resultSet,"WorkQuantity"));
            lwWholeSaleIndicatorDto.setUnworkQuantity(dbManager.getString(resultSet,"UnworkQuantity"));
            lwWholeSaleIndicatorDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwWholeSaleIndicatorDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwWholeSaleIndicatorDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwWholeSaleIndicatorDto.setReadDate(dbManager.getString(resultSet,"ReadDate"));
            lwWholeSaleIndicatorDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwWholeSaleIndicatorDto.setUnChgAmmeterQuantity(dbManager.getDouble(resultSet,"UnChgAmmeterQuantity"));
            lwWholeSaleIndicatorDto.setLossRate(dbManager.getDouble(resultSet,"LossRate"));
            lwWholeSaleIndicatorDto.setPowerCode(dbManager.getDouble(resultSet,"PowerCode"));
            lwWholeSaleIndicatorDto.setIfCal(dbManager.getString(resultSet,"IfCal"));
            lwWholeSaleIndicatorDto.setDifferenceQuantity(dbManager.getString(resultSet,"DifferenceQuantity"));
            collection.add(lwWholeSaleIndicatorDto);
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
        buffer.append("DELETE FROM LwWholeSaleIndicator WHERE ");
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
        buffer.append("SELECT count(*) FROM LwWholeSaleIndicator WHERE ");
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
