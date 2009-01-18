package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorBakDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleIndicatorBak-趸售电表指针记录备份表的数据访问对象基类<br>
 */
public class DBLwWholeSaleIndicatorBakBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwWholeSaleIndicatorBakBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleIndicatorBakBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto
     * @throws Exception
     */
    public void insert(LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwWholeSaleIndicatorBak (");
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
        buffer.append("InputDate,");
        buffer.append("ReadDate,");
        buffer.append("LossRate,");
        buffer.append("PowerCode,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("IfCal,");
        buffer.append("DifferenceQuantity ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getLastIdleNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getThisIdleNum()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getRate()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getReadQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getExcepQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getChgAmmeterQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getUnCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getUnLineLossQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getLineLossQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getUnTransLossQuantity()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getTransLossQuantity()).append(",");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getWorkQuantity()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getUnworkQuantity()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getReadDate()).append("',");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getLossRate()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getPowerCode()).append(",");
            debugBuffer.append("").append(lwWholeSaleIndicatorBakDto.getUnChgAmmeterQuantity()).append(",");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getIfCal()).append("',");
            debugBuffer.append("'").append(lwWholeSaleIndicatorBakDto.getDifferenceQuantity()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwWholeSaleIndicatorBakDto.getUserNo());
        dbManager.setString(2,lwWholeSaleIndicatorBakDto.getStatMonth());
        dbManager.setDouble(3,lwWholeSaleIndicatorBakDto.getLastWorkNum());
        dbManager.setDouble(4,lwWholeSaleIndicatorBakDto.getThisWorkNum());
        dbManager.setDouble(5,lwWholeSaleIndicatorBakDto.getLastIdleNum());
        dbManager.setDouble(6,lwWholeSaleIndicatorBakDto.getThisIdleNum());
        dbManager.setDouble(7,lwWholeSaleIndicatorBakDto.getRate());
        dbManager.setDouble(8,lwWholeSaleIndicatorBakDto.getReadQuantity());
        dbManager.setDouble(9,lwWholeSaleIndicatorBakDto.getExcepQuantity());
        dbManager.setDouble(10,lwWholeSaleIndicatorBakDto.getChgAmmeterQuantity());
        dbManager.setDouble(11,lwWholeSaleIndicatorBakDto.getUnCompensateQuantity());
        dbManager.setDouble(12,lwWholeSaleIndicatorBakDto.getCompensateQuantity());
        dbManager.setDouble(13,lwWholeSaleIndicatorBakDto.getUnLineLossQuantity());
        dbManager.setDouble(14,lwWholeSaleIndicatorBakDto.getLineLossQuantity());
        dbManager.setDouble(15,lwWholeSaleIndicatorBakDto.getUnTransLossQuantity());
        dbManager.setDouble(16,lwWholeSaleIndicatorBakDto.getTransLossQuantity());
        dbManager.setString(17,lwWholeSaleIndicatorBakDto.getWorkQuantity());
        dbManager.setString(18,lwWholeSaleIndicatorBakDto.getUnworkQuantity());
        dbManager.setString(19,lwWholeSaleIndicatorBakDto.getValidStatus());
        dbManager.setString(20,lwWholeSaleIndicatorBakDto.getFlag());
        dbManager.setString(21,lwWholeSaleIndicatorBakDto.getRemark());
        dbManager.setString(22,lwWholeSaleIndicatorBakDto.getInputDate());
        dbManager.setString(23,lwWholeSaleIndicatorBakDto.getReadDate());
        dbManager.setDouble(24,lwWholeSaleIndicatorBakDto.getLossRate());
        dbManager.setDouble(25,lwWholeSaleIndicatorBakDto.getPowerCode());
        dbManager.setDouble(26,lwWholeSaleIndicatorBakDto.getUnChgAmmeterQuantity());
        dbManager.setString(27,lwWholeSaleIndicatorBakDto.getIfCal());
        dbManager.setString(28,lwWholeSaleIndicatorBakDto.getDifferenceQuantity());
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
        buffer.append("INSERT INTO LwWholeSaleIndicatorBak (");
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
        buffer.append("InputDate,");
        buffer.append("ReadDate,");
        buffer.append("LossRate,");
        buffer.append("PowerCode,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("IfCal,");
        buffer.append("DifferenceQuantity ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto = (LwWholeSaleIndicatorBakDto)i.next();
            dbManager.setString(1,lwWholeSaleIndicatorBakDto.getUserNo());
            dbManager.setString(2,lwWholeSaleIndicatorBakDto.getStatMonth());
            dbManager.setDouble(3,lwWholeSaleIndicatorBakDto.getLastWorkNum());
            dbManager.setDouble(4,lwWholeSaleIndicatorBakDto.getThisWorkNum());
            dbManager.setDouble(5,lwWholeSaleIndicatorBakDto.getLastIdleNum());
            dbManager.setDouble(6,lwWholeSaleIndicatorBakDto.getThisIdleNum());
            dbManager.setDouble(7,lwWholeSaleIndicatorBakDto.getRate());
            dbManager.setDouble(8,lwWholeSaleIndicatorBakDto.getReadQuantity());
            dbManager.setDouble(9,lwWholeSaleIndicatorBakDto.getExcepQuantity());
            dbManager.setDouble(10,lwWholeSaleIndicatorBakDto.getChgAmmeterQuantity());
            dbManager.setDouble(11,lwWholeSaleIndicatorBakDto.getUnCompensateQuantity());
            dbManager.setDouble(12,lwWholeSaleIndicatorBakDto.getCompensateQuantity());
            dbManager.setDouble(13,lwWholeSaleIndicatorBakDto.getUnLineLossQuantity());
            dbManager.setDouble(14,lwWholeSaleIndicatorBakDto.getLineLossQuantity());
            dbManager.setDouble(15,lwWholeSaleIndicatorBakDto.getUnTransLossQuantity());
            dbManager.setDouble(16,lwWholeSaleIndicatorBakDto.getTransLossQuantity());
            dbManager.setString(17,lwWholeSaleIndicatorBakDto.getWorkQuantity());
            dbManager.setString(18,lwWholeSaleIndicatorBakDto.getUnworkQuantity());
            dbManager.setString(19,lwWholeSaleIndicatorBakDto.getValidStatus());
            dbManager.setString(20,lwWholeSaleIndicatorBakDto.getFlag());
            dbManager.setString(21,lwWholeSaleIndicatorBakDto.getRemark());
            dbManager.setString(22,lwWholeSaleIndicatorBakDto.getInputDate());
            dbManager.setString(23,lwWholeSaleIndicatorBakDto.getReadDate());
            dbManager.setDouble(24,lwWholeSaleIndicatorBakDto.getLossRate());
            dbManager.setDouble(25,lwWholeSaleIndicatorBakDto.getPowerCode());
            dbManager.setDouble(26,lwWholeSaleIndicatorBakDto.getUnChgAmmeterQuantity());
            dbManager.setString(27,lwWholeSaleIndicatorBakDto.getIfCal());
            dbManager.setString(28,lwWholeSaleIndicatorBakDto.getDifferenceQuantity());
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
        buffer.append("DELETE FROM LwWholeSaleIndicatorBak ");
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
     * @param lwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto
     * @throws Exception
     */
    public void update(LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwWholeSaleIndicatorBak SET ");
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
        buffer.append("InputDate = ?, ");
        buffer.append("ReadDate = ?, ");
        buffer.append("LossRate = ?, ");
        buffer.append("PowerCode = ?, ");
        buffer.append("UnChgAmmeterQuantity = ?, ");
        buffer.append("IfCal = ?, ");
        buffer.append("DifferenceQuantity = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwWholeSaleIndicatorBak SET ");
            debugBuffer.append("LastWorkNum = " + lwWholeSaleIndicatorBakDto.getLastWorkNum() + ", ");
            debugBuffer.append("ThisWorkNum = " + lwWholeSaleIndicatorBakDto.getThisWorkNum() + ", ");
            debugBuffer.append("LastIdleNum = " + lwWholeSaleIndicatorBakDto.getLastIdleNum() + ", ");
            debugBuffer.append("ThisIdleNum = " + lwWholeSaleIndicatorBakDto.getThisIdleNum() + ", ");
            debugBuffer.append("Rate = " + lwWholeSaleIndicatorBakDto.getRate() + ", ");
            debugBuffer.append("ReadQuantity = " + lwWholeSaleIndicatorBakDto.getReadQuantity() + ", ");
            debugBuffer.append("ExcepQuantity = " + lwWholeSaleIndicatorBakDto.getExcepQuantity() + ", ");
            debugBuffer.append("ChgAmmeterQuantity = " + lwWholeSaleIndicatorBakDto.getChgAmmeterQuantity() + ", ");
            debugBuffer.append("UnCompensateQuantity = " + lwWholeSaleIndicatorBakDto.getUnCompensateQuantity() + ", ");
            debugBuffer.append("CompensateQuantity = " + lwWholeSaleIndicatorBakDto.getCompensateQuantity() + ", ");
            debugBuffer.append("UnLineLossQuantity = " + lwWholeSaleIndicatorBakDto.getUnLineLossQuantity() + ", ");
            debugBuffer.append("LineLossQuantity = " + lwWholeSaleIndicatorBakDto.getLineLossQuantity() + ", ");
            debugBuffer.append("UnTransLossQuantity = " + lwWholeSaleIndicatorBakDto.getUnTransLossQuantity() + ", ");
            debugBuffer.append("TransLossQuantity = " + lwWholeSaleIndicatorBakDto.getTransLossQuantity() + ", ");
            debugBuffer.append("WorkQuantity = '" + lwWholeSaleIndicatorBakDto.getWorkQuantity() + "', ");
            debugBuffer.append("UnworkQuantity = '" + lwWholeSaleIndicatorBakDto.getUnworkQuantity() + "', ");
            debugBuffer.append("ValidStatus = '" + lwWholeSaleIndicatorBakDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwWholeSaleIndicatorBakDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwWholeSaleIndicatorBakDto.getRemark() + "', ");
            debugBuffer.append("InputDate = '" + lwWholeSaleIndicatorBakDto.getInputDate() + "', ");
            debugBuffer.append("ReadDate = '" + lwWholeSaleIndicatorBakDto.getReadDate() + "', ");
            debugBuffer.append("LossRate = " + lwWholeSaleIndicatorBakDto.getLossRate() + ", ");
            debugBuffer.append("PowerCode = " + lwWholeSaleIndicatorBakDto.getPowerCode() + ", ");
            debugBuffer.append("UnChgAmmeterQuantity = " + lwWholeSaleIndicatorBakDto.getUnChgAmmeterQuantity() + ", ");
            debugBuffer.append("IfCal = '" + lwWholeSaleIndicatorBakDto.getIfCal() + "', ");
            debugBuffer.append("DifferenceQuantity = '" + lwWholeSaleIndicatorBakDto.getDifferenceQuantity() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwWholeSaleIndicatorBakDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwWholeSaleIndicatorBakDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setDouble(1,lwWholeSaleIndicatorBakDto.getLastWorkNum());
        dbManager.setDouble(2,lwWholeSaleIndicatorBakDto.getThisWorkNum());
        dbManager.setDouble(3,lwWholeSaleIndicatorBakDto.getLastIdleNum());
        dbManager.setDouble(4,lwWholeSaleIndicatorBakDto.getThisIdleNum());
        dbManager.setDouble(5,lwWholeSaleIndicatorBakDto.getRate());
        dbManager.setDouble(6,lwWholeSaleIndicatorBakDto.getReadQuantity());
        dbManager.setDouble(7,lwWholeSaleIndicatorBakDto.getExcepQuantity());
        dbManager.setDouble(8,lwWholeSaleIndicatorBakDto.getChgAmmeterQuantity());
        dbManager.setDouble(9,lwWholeSaleIndicatorBakDto.getUnCompensateQuantity());
        dbManager.setDouble(10,lwWholeSaleIndicatorBakDto.getCompensateQuantity());
        dbManager.setDouble(11,lwWholeSaleIndicatorBakDto.getUnLineLossQuantity());
        dbManager.setDouble(12,lwWholeSaleIndicatorBakDto.getLineLossQuantity());
        dbManager.setDouble(13,lwWholeSaleIndicatorBakDto.getUnTransLossQuantity());
        dbManager.setDouble(14,lwWholeSaleIndicatorBakDto.getTransLossQuantity());
        dbManager.setString(15,lwWholeSaleIndicatorBakDto.getWorkQuantity());
        dbManager.setString(16,lwWholeSaleIndicatorBakDto.getUnworkQuantity());
        dbManager.setString(17,lwWholeSaleIndicatorBakDto.getValidStatus());
        dbManager.setString(18,lwWholeSaleIndicatorBakDto.getFlag());
        dbManager.setString(19,lwWholeSaleIndicatorBakDto.getRemark());
        dbManager.setString(20,lwWholeSaleIndicatorBakDto.getInputDate());
        dbManager.setString(21,lwWholeSaleIndicatorBakDto.getReadDate());
        dbManager.setDouble(22,lwWholeSaleIndicatorBakDto.getLossRate());
        dbManager.setDouble(23,lwWholeSaleIndicatorBakDto.getPowerCode());
        dbManager.setDouble(24,lwWholeSaleIndicatorBakDto.getUnChgAmmeterQuantity());
        dbManager.setString(25,lwWholeSaleIndicatorBakDto.getIfCal());
        dbManager.setString(26,lwWholeSaleIndicatorBakDto.getDifferenceQuantity());
        //设置条件字段;
        dbManager.setString(27,lwWholeSaleIndicatorBakDto.getUserNo());
        dbManager.setString(28,lwWholeSaleIndicatorBakDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 帐期
     * @return LwWholeSaleIndicatorBakDto
     * @throws Exception
     */
    public LwWholeSaleIndicatorBakDto findByPrimaryKey(String userNo,String statMonth)
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
        buffer.append("InputDate,");
        buffer.append("ReadDate,");
        buffer.append("LossRate,");
        buffer.append("PowerCode,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("IfCal,");
        buffer.append("DifferenceQuantity ");
        buffer.append("FROM LwWholeSaleIndicatorBak ");
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
        LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto = null;
        if(resultSet.next()){
            lwWholeSaleIndicatorBakDto = new LwWholeSaleIndicatorBakDto();
            lwWholeSaleIndicatorBakDto.setUserNo(dbManager.getString(resultSet,1));
            lwWholeSaleIndicatorBakDto.setStatMonth(dbManager.getString(resultSet,2));
            lwWholeSaleIndicatorBakDto.setLastWorkNum(dbManager.getDouble(resultSet,3));
            lwWholeSaleIndicatorBakDto.setThisWorkNum(dbManager.getDouble(resultSet,4));
            lwWholeSaleIndicatorBakDto.setLastIdleNum(dbManager.getDouble(resultSet,5));
            lwWholeSaleIndicatorBakDto.setThisIdleNum(dbManager.getDouble(resultSet,6));
            lwWholeSaleIndicatorBakDto.setRate(dbManager.getDouble(resultSet,7));
            lwWholeSaleIndicatorBakDto.setReadQuantity(dbManager.getDouble(resultSet,8));
            lwWholeSaleIndicatorBakDto.setExcepQuantity(dbManager.getDouble(resultSet,9));
            lwWholeSaleIndicatorBakDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,10));
            lwWholeSaleIndicatorBakDto.setUnCompensateQuantity(dbManager.getDouble(resultSet,11));
            lwWholeSaleIndicatorBakDto.setCompensateQuantity(dbManager.getDouble(resultSet,12));
            lwWholeSaleIndicatorBakDto.setUnLineLossQuantity(dbManager.getDouble(resultSet,13));
            lwWholeSaleIndicatorBakDto.setLineLossQuantity(dbManager.getDouble(resultSet,14));
            lwWholeSaleIndicatorBakDto.setUnTransLossQuantity(dbManager.getDouble(resultSet,15));
            lwWholeSaleIndicatorBakDto.setTransLossQuantity(dbManager.getDouble(resultSet,16));
            lwWholeSaleIndicatorBakDto.setWorkQuantity(dbManager.getString(resultSet,17));
            lwWholeSaleIndicatorBakDto.setUnworkQuantity(dbManager.getString(resultSet,18));
            lwWholeSaleIndicatorBakDto.setValidStatus(dbManager.getString(resultSet,19));
            lwWholeSaleIndicatorBakDto.setFlag(dbManager.getString(resultSet,20));
            lwWholeSaleIndicatorBakDto.setRemark(dbManager.getString(resultSet,21));
            lwWholeSaleIndicatorBakDto.setInputDate(dbManager.getString(resultSet,22));
            lwWholeSaleIndicatorBakDto.setReadDate(dbManager.getString(resultSet,23));
            lwWholeSaleIndicatorBakDto.setLossRate(dbManager.getDouble(resultSet,24));
            lwWholeSaleIndicatorBakDto.setPowerCode(dbManager.getDouble(resultSet,25));
            lwWholeSaleIndicatorBakDto.setUnChgAmmeterQuantity(dbManager.getDouble(resultSet,26));
            lwWholeSaleIndicatorBakDto.setIfCal(dbManager.getString(resultSet,27));
            lwWholeSaleIndicatorBakDto.setDifferenceQuantity(dbManager.getString(resultSet,28));
        }
        resultSet.close();
        return lwWholeSaleIndicatorBakDto;
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
        buffer.append("InputDate,");
        buffer.append("ReadDate,");
        buffer.append("LossRate,");
        buffer.append("PowerCode,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("IfCal,");
        buffer.append("DifferenceQuantity ");
        buffer.append("FROM LwWholeSaleIndicatorBak WHERE ");
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
        LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwWholeSaleIndicatorBakDto = new LwWholeSaleIndicatorBakDto();
            lwWholeSaleIndicatorBakDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwWholeSaleIndicatorBakDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwWholeSaleIndicatorBakDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwWholeSaleIndicatorBakDto.setThisWorkNum(dbManager.getDouble(resultSet,"ThisWorkNum"));
            lwWholeSaleIndicatorBakDto.setLastIdleNum(dbManager.getDouble(resultSet,"LastIdleNum"));
            lwWholeSaleIndicatorBakDto.setThisIdleNum(dbManager.getDouble(resultSet,"ThisIdleNum"));
            lwWholeSaleIndicatorBakDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwWholeSaleIndicatorBakDto.setReadQuantity(dbManager.getDouble(resultSet,"ReadQuantity"));
            lwWholeSaleIndicatorBakDto.setExcepQuantity(dbManager.getDouble(resultSet,"ExcepQuantity"));
            lwWholeSaleIndicatorBakDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,"ChgAmmeterQuantity"));
            lwWholeSaleIndicatorBakDto.setUnCompensateQuantity(dbManager.getDouble(resultSet,"UnCompensateQuantity"));
            lwWholeSaleIndicatorBakDto.setCompensateQuantity(dbManager.getDouble(resultSet,"CompensateQuantity"));
            lwWholeSaleIndicatorBakDto.setUnLineLossQuantity(dbManager.getDouble(resultSet,"UnLineLossQuantity"));
            lwWholeSaleIndicatorBakDto.setLineLossQuantity(dbManager.getDouble(resultSet,"LineLossQuantity"));
            lwWholeSaleIndicatorBakDto.setUnTransLossQuantity(dbManager.getDouble(resultSet,"UnTransLossQuantity"));
            lwWholeSaleIndicatorBakDto.setTransLossQuantity(dbManager.getDouble(resultSet,"TransLossQuantity"));
            lwWholeSaleIndicatorBakDto.setWorkQuantity(dbManager.getString(resultSet,"WorkQuantity"));
            lwWholeSaleIndicatorBakDto.setUnworkQuantity(dbManager.getString(resultSet,"UnworkQuantity"));
            lwWholeSaleIndicatorBakDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwWholeSaleIndicatorBakDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwWholeSaleIndicatorBakDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwWholeSaleIndicatorBakDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwWholeSaleIndicatorBakDto.setReadDate(dbManager.getString(resultSet,"ReadDate"));
            lwWholeSaleIndicatorBakDto.setLossRate(dbManager.getDouble(resultSet,"LossRate"));
            lwWholeSaleIndicatorBakDto.setPowerCode(dbManager.getDouble(resultSet,"PowerCode"));
            lwWholeSaleIndicatorBakDto.setUnChgAmmeterQuantity(dbManager.getDouble(resultSet,"UnChgAmmeterQuantity"));
            lwWholeSaleIndicatorBakDto.setIfCal(dbManager.getString(resultSet,"IfCal"));
            lwWholeSaleIndicatorBakDto.setDifferenceQuantity(dbManager.getString(resultSet,"DifferenceQuantity"));
            collection.add(lwWholeSaleIndicatorBakDto);
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
        buffer.append("DELETE FROM LwWholeSaleIndicatorBak WHERE ");
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
        buffer.append("SELECT count(*) FROM LwWholeSaleIndicatorBak WHERE ");
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
