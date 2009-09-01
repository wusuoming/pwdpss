package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWNewFactoryIndicator-大工业新电表指针记录表的数据访问对象基类<br>
 */
public class DBLwNewFactoryIndicatorBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwNewFactoryIndicatorBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwNewFactoryIndicatorBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public void insert(LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwNewFactoryIndicator (");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("UserNo,");
        buffer.append("ReadDate,");
        buffer.append("InputDate,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("LastIdleNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("LineLossQuantity,");
        buffer.append("TransLossQuantity,");
        buffer.append("NeedQuantity,");
        buffer.append("RongliangQuantity,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("PepoleUnChgAmmeterQuantity,");
        buffer.append("Username,");
        buffer.append("UnCompensateQuantity,");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterStyle,");
        buffer.append("WorkQuantity,");
        buffer.append("UnworkQuantity,");
        buffer.append("IfChange,");
        buffer.append("ChangeBefore,");
        buffer.append("ChangeAfter,");
        buffer.append("Day,");
        buffer.append("Changeday,");
        buffer.append("ChangeDate,");
        buffer.append("ChangeUnworkQuantity,");
        buffer.append("ChangeworkQuantity,");
        buffer.append("ChangeWorkPointer,");
        buffer.append("ChangeunWorkPointer,");
        buffer.append("ChageChgAmmeterQuantity,");
        buffer.append("ChangeunChgAmmeterQuantity,");
        buffer.append("ChangeCompensateQuantity,");
        buffer.append("ChangeunCompensateQuantity,");
        buffer.append("Rlquantityafbefore,");
        buffer.append("Rlquantityaf,");
        buffer.append("Rlpriceaf,");
        buffer.append("Chgpriceafflag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getReadDate()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getThisIdleNum()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getLastIdleNum()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getRate()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getReadQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getExcepQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getChgAmmeterQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getLineLossQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getTransLossQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getNeedQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getRongliangQuantity()).append(",");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getUsername()).append("',");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getUnCompensateQuantity()).append(",");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getAmmeterNo()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getAmmeterStyle()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getWorkQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getUnworkQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getIfChange()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChangeBefore()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChangeAfter()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getDay()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChangeday()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChangeDate()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChangeUnworkQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChangeworkQuantity()).append("',");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getChangeWorkPointer()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getChangeunWorkPointer()).append(",");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChageChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChangeunChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChangeCompensateQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChangeunCompensateQuantity()).append("',");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getRlquantityafbefore()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getRlquantityaf()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorDto.getRlpriceaf()).append(",");
            debugBuffer.append("'").append(lwNewFactoryIndicatorDto.getChgpriceafflag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity());
        dbManager.setString(2,lwNewFactoryIndicatorDto.getUserNo());
        dbManager.setString(3,lwNewFactoryIndicatorDto.getReadDate());
        dbManager.setString(4,lwNewFactoryIndicatorDto.getInputDate());
        dbManager.setString(5,lwNewFactoryIndicatorDto.getStatMonth());
        dbManager.setDouble(6,lwNewFactoryIndicatorDto.getThisWorkNum());
        dbManager.setDouble(7,lwNewFactoryIndicatorDto.getLastWorkNum());
        dbManager.setDouble(8,lwNewFactoryIndicatorDto.getThisIdleNum());
        dbManager.setDouble(9,lwNewFactoryIndicatorDto.getLastIdleNum());
        dbManager.setDouble(10,lwNewFactoryIndicatorDto.getRate());
        dbManager.setDouble(11,lwNewFactoryIndicatorDto.getReadQuantity());
        dbManager.setDouble(12,lwNewFactoryIndicatorDto.getExcepQuantity());
        dbManager.setDouble(13,lwNewFactoryIndicatorDto.getChgAmmeterQuantity());
        dbManager.setDouble(14,lwNewFactoryIndicatorDto.getCompensateQuantity());
        dbManager.setDouble(15,lwNewFactoryIndicatorDto.getLineLossQuantity());
        dbManager.setDouble(16,lwNewFactoryIndicatorDto.getTransLossQuantity());
        dbManager.setDouble(17,lwNewFactoryIndicatorDto.getNeedQuantity());
        dbManager.setDouble(18,lwNewFactoryIndicatorDto.getRongliangQuantity());
        dbManager.setString(19,lwNewFactoryIndicatorDto.getValidStatus());
        dbManager.setString(20,lwNewFactoryIndicatorDto.getFlag());
        dbManager.setString(21,lwNewFactoryIndicatorDto.getRemark());
        dbManager.setString(22,lwNewFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity());
        dbManager.setString(23,lwNewFactoryIndicatorDto.getUsername());
        dbManager.setDouble(24,lwNewFactoryIndicatorDto.getUnCompensateQuantity());
        dbManager.setString(25,lwNewFactoryIndicatorDto.getAmmeterNo());
        dbManager.setString(26,lwNewFactoryIndicatorDto.getAmmeterStyle());
        dbManager.setString(27,lwNewFactoryIndicatorDto.getWorkQuantity());
        dbManager.setString(28,lwNewFactoryIndicatorDto.getUnworkQuantity());
        dbManager.setString(29,lwNewFactoryIndicatorDto.getIfChange());
        dbManager.setString(30,lwNewFactoryIndicatorDto.getChangeBefore());
        dbManager.setString(31,lwNewFactoryIndicatorDto.getChangeAfter());
        dbManager.setString(32,lwNewFactoryIndicatorDto.getDay());
        dbManager.setString(33,lwNewFactoryIndicatorDto.getChangeday());
        dbManager.setString(34,lwNewFactoryIndicatorDto.getChangeDate());
        dbManager.setString(35,lwNewFactoryIndicatorDto.getChangeUnworkQuantity());
        dbManager.setString(36,lwNewFactoryIndicatorDto.getChangeworkQuantity());
        dbManager.setDouble(37,lwNewFactoryIndicatorDto.getChangeWorkPointer());
        dbManager.setDouble(38,lwNewFactoryIndicatorDto.getChangeunWorkPointer());
        dbManager.setString(39,lwNewFactoryIndicatorDto.getChageChgAmmeterQuantity());
        dbManager.setString(40,lwNewFactoryIndicatorDto.getChangeunChgAmmeterQuantity());
        dbManager.setString(41,lwNewFactoryIndicatorDto.getChangeCompensateQuantity());
        dbManager.setString(42,lwNewFactoryIndicatorDto.getChangeunCompensateQuantity());
        dbManager.setDouble(43,lwNewFactoryIndicatorDto.getRlquantityafbefore());
        dbManager.setDouble(44,lwNewFactoryIndicatorDto.getRlquantityaf());
        dbManager.setDouble(45,lwNewFactoryIndicatorDto.getRlpriceaf());
        dbManager.setString(46,lwNewFactoryIndicatorDto.getChgpriceafflag());
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
        buffer.append("INSERT INTO LwNewFactoryIndicator (");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("UserNo,");
        buffer.append("ReadDate,");
        buffer.append("InputDate,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("LastIdleNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("LineLossQuantity,");
        buffer.append("TransLossQuantity,");
        buffer.append("NeedQuantity,");
        buffer.append("RongliangQuantity,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("PepoleUnChgAmmeterQuantity,");
        buffer.append("Username,");
        buffer.append("UnCompensateQuantity,");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterStyle,");
        buffer.append("WorkQuantity,");
        buffer.append("UnworkQuantity,");
        buffer.append("IfChange,");
        buffer.append("ChangeBefore,");
        buffer.append("ChangeAfter,");
        buffer.append("Day,");
        buffer.append("Changeday,");
        buffer.append("ChangeDate,");
        buffer.append("ChangeUnworkQuantity,");
        buffer.append("ChangeworkQuantity,");
        buffer.append("ChangeWorkPointer,");
        buffer.append("ChangeunWorkPointer,");
        buffer.append("ChageChgAmmeterQuantity,");
        buffer.append("ChangeunChgAmmeterQuantity,");
        buffer.append("ChangeCompensateQuantity,");
        buffer.append("ChangeunCompensateQuantity,");
        buffer.append("Rlquantityafbefore,");
        buffer.append("Rlquantityaf,");
        buffer.append("Rlpriceaf,");
        buffer.append("Chgpriceafflag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = (LwNewFactoryIndicatorDto)i.next();
            dbManager.setString(1,lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity());
            dbManager.setString(2,lwNewFactoryIndicatorDto.getUserNo());
            dbManager.setString(3,lwNewFactoryIndicatorDto.getReadDate());
            dbManager.setString(4,lwNewFactoryIndicatorDto.getInputDate());
            dbManager.setString(5,lwNewFactoryIndicatorDto.getStatMonth());
            dbManager.setDouble(6,lwNewFactoryIndicatorDto.getThisWorkNum());
            dbManager.setDouble(7,lwNewFactoryIndicatorDto.getLastWorkNum());
            dbManager.setDouble(8,lwNewFactoryIndicatorDto.getThisIdleNum());
            dbManager.setDouble(9,lwNewFactoryIndicatorDto.getLastIdleNum());
            dbManager.setDouble(10,lwNewFactoryIndicatorDto.getRate());
            dbManager.setDouble(11,lwNewFactoryIndicatorDto.getReadQuantity());
            dbManager.setDouble(12,lwNewFactoryIndicatorDto.getExcepQuantity());
            dbManager.setDouble(13,lwNewFactoryIndicatorDto.getChgAmmeterQuantity());
            dbManager.setDouble(14,lwNewFactoryIndicatorDto.getCompensateQuantity());
            dbManager.setDouble(15,lwNewFactoryIndicatorDto.getLineLossQuantity());
            dbManager.setDouble(16,lwNewFactoryIndicatorDto.getTransLossQuantity());
            dbManager.setDouble(17,lwNewFactoryIndicatorDto.getNeedQuantity());
            dbManager.setDouble(18,lwNewFactoryIndicatorDto.getRongliangQuantity());
            dbManager.setString(19,lwNewFactoryIndicatorDto.getValidStatus());
            dbManager.setString(20,lwNewFactoryIndicatorDto.getFlag());
            dbManager.setString(21,lwNewFactoryIndicatorDto.getRemark());
            dbManager.setString(22,lwNewFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity());
            dbManager.setString(23,lwNewFactoryIndicatorDto.getUsername());
            dbManager.setDouble(24,lwNewFactoryIndicatorDto.getUnCompensateQuantity());
            dbManager.setString(25,lwNewFactoryIndicatorDto.getAmmeterNo());
            dbManager.setString(26,lwNewFactoryIndicatorDto.getAmmeterStyle());
            dbManager.setString(27,lwNewFactoryIndicatorDto.getWorkQuantity());
            dbManager.setString(28,lwNewFactoryIndicatorDto.getUnworkQuantity());
            dbManager.setString(29,lwNewFactoryIndicatorDto.getIfChange());
            dbManager.setString(30,lwNewFactoryIndicatorDto.getChangeBefore());
            dbManager.setString(31,lwNewFactoryIndicatorDto.getChangeAfter());
            dbManager.setString(32,lwNewFactoryIndicatorDto.getDay());
            dbManager.setString(33,lwNewFactoryIndicatorDto.getChangeday());
            dbManager.setString(34,lwNewFactoryIndicatorDto.getChangeDate());
            dbManager.setString(35,lwNewFactoryIndicatorDto.getChangeUnworkQuantity());
            dbManager.setString(36,lwNewFactoryIndicatorDto.getChangeworkQuantity());
            dbManager.setDouble(37,lwNewFactoryIndicatorDto.getChangeWorkPointer());
            dbManager.setDouble(38,lwNewFactoryIndicatorDto.getChangeunWorkPointer());
            dbManager.setString(39,lwNewFactoryIndicatorDto.getChageChgAmmeterQuantity());
            dbManager.setString(40,lwNewFactoryIndicatorDto.getChangeunChgAmmeterQuantity());
            dbManager.setString(41,lwNewFactoryIndicatorDto.getChangeCompensateQuantity());
            dbManager.setString(42,lwNewFactoryIndicatorDto.getChangeunCompensateQuantity());
            dbManager.setDouble(43,lwNewFactoryIndicatorDto.getRlquantityafbefore());
            dbManager.setDouble(44,lwNewFactoryIndicatorDto.getRlquantityaf());
            dbManager.setDouble(45,lwNewFactoryIndicatorDto.getRlpriceaf());
            dbManager.setString(46,lwNewFactoryIndicatorDto.getChgpriceafflag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userNo 户号
     * @param statMonth 帐期
     * @param ammeterNo 表号
     * @throws Exception
     */
    public void delete(String userNo,String statMonth,String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwNewFactoryIndicator ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        dbManager.setString(2,statMonth);
        dbManager.setString(3,ammeterNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public void update(LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwNewFactoryIndicator SET ");
        buffer.append("UnChgAmmeterQuantity = ?, ");
        buffer.append("ReadDate = ?, ");
        buffer.append("InputDate = ?, ");
        buffer.append("ThisWorkNum = ?, ");
        buffer.append("LastWorkNum = ?, ");
        buffer.append("ThisIdleNum = ?, ");
        buffer.append("LastIdleNum = ?, ");
        buffer.append("Rate = ?, ");
        buffer.append("ReadQuantity = ?, ");
        buffer.append("ExcepQuantity = ?, ");
        buffer.append("ChgAmmeterQuantity = ?, ");
        buffer.append("CompensateQuantity = ?, ");
        buffer.append("LineLossQuantity = ?, ");
        buffer.append("TransLossQuantity = ?, ");
        buffer.append("NeedQuantity = ?, ");
        buffer.append("RongliangQuantity = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("PepoleUnChgAmmeterQuantity = ?, ");
        buffer.append("Username = ?, ");
        buffer.append("UnCompensateQuantity = ?, ");
        buffer.append("AmmeterStyle = ?, ");
        buffer.append("WorkQuantity = ?, ");
        buffer.append("UnworkQuantity = ?, ");
        buffer.append("IfChange = ?, ");
        buffer.append("ChangeBefore = ?, ");
        buffer.append("ChangeAfter = ?, ");
        buffer.append("Day = ?, ");
        buffer.append("Changeday = ?, ");
        buffer.append("ChangeDate = ?, ");
        buffer.append("ChangeUnworkQuantity = ?, ");
        buffer.append("ChangeworkQuantity = ?, ");
        buffer.append("ChangeWorkPointer = ?, ");
        buffer.append("ChangeunWorkPointer = ?, ");
        buffer.append("ChageChgAmmeterQuantity = ?, ");
        buffer.append("ChangeunChgAmmeterQuantity = ?, ");
        buffer.append("ChangeCompensateQuantity = ?, ");
        buffer.append("ChangeunCompensateQuantity = ?, ");
        buffer.append("Rlquantityafbefore = ?, ");
        buffer.append("Rlquantityaf = ?, ");
        buffer.append("Rlpriceaf = ?, ");
        buffer.append("Chgpriceafflag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwNewFactoryIndicator SET ");
            debugBuffer.append("UnChgAmmeterQuantity = '" + lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity() + "', ");
            debugBuffer.append("ReadDate = '" + lwNewFactoryIndicatorDto.getReadDate() + "', ");
            debugBuffer.append("InputDate = '" + lwNewFactoryIndicatorDto.getInputDate() + "', ");
            debugBuffer.append("ThisWorkNum = " + lwNewFactoryIndicatorDto.getThisWorkNum() + ", ");
            debugBuffer.append("LastWorkNum = " + lwNewFactoryIndicatorDto.getLastWorkNum() + ", ");
            debugBuffer.append("ThisIdleNum = " + lwNewFactoryIndicatorDto.getThisIdleNum() + ", ");
            debugBuffer.append("LastIdleNum = " + lwNewFactoryIndicatorDto.getLastIdleNum() + ", ");
            debugBuffer.append("Rate = " + lwNewFactoryIndicatorDto.getRate() + ", ");
            debugBuffer.append("ReadQuantity = " + lwNewFactoryIndicatorDto.getReadQuantity() + ", ");
            debugBuffer.append("ExcepQuantity = " + lwNewFactoryIndicatorDto.getExcepQuantity() + ", ");
            debugBuffer.append("ChgAmmeterQuantity = " + lwNewFactoryIndicatorDto.getChgAmmeterQuantity() + ", ");
            debugBuffer.append("CompensateQuantity = " + lwNewFactoryIndicatorDto.getCompensateQuantity() + ", ");
            debugBuffer.append("LineLossQuantity = " + lwNewFactoryIndicatorDto.getLineLossQuantity() + ", ");
            debugBuffer.append("TransLossQuantity = " + lwNewFactoryIndicatorDto.getTransLossQuantity() + ", ");
            debugBuffer.append("NeedQuantity = " + lwNewFactoryIndicatorDto.getNeedQuantity() + ", ");
            debugBuffer.append("RongliangQuantity = " + lwNewFactoryIndicatorDto.getRongliangQuantity() + ", ");
            debugBuffer.append("ValidStatus = '" + lwNewFactoryIndicatorDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwNewFactoryIndicatorDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwNewFactoryIndicatorDto.getRemark() + "', ");
            debugBuffer.append("PepoleUnChgAmmeterQuantity = '" + lwNewFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity() + "', ");
            debugBuffer.append("Username = '" + lwNewFactoryIndicatorDto.getUsername() + "', ");
            debugBuffer.append("UnCompensateQuantity = " + lwNewFactoryIndicatorDto.getUnCompensateQuantity() + ", ");
            debugBuffer.append("AmmeterStyle = '" + lwNewFactoryIndicatorDto.getAmmeterStyle() + "', ");
            debugBuffer.append("WorkQuantity = '" + lwNewFactoryIndicatorDto.getWorkQuantity() + "', ");
            debugBuffer.append("UnworkQuantity = '" + lwNewFactoryIndicatorDto.getUnworkQuantity() + "', ");
            debugBuffer.append("IfChange = '" + lwNewFactoryIndicatorDto.getIfChange() + "', ");
            debugBuffer.append("ChangeBefore = '" + lwNewFactoryIndicatorDto.getChangeBefore() + "', ");
            debugBuffer.append("ChangeAfter = '" + lwNewFactoryIndicatorDto.getChangeAfter() + "', ");
            debugBuffer.append("Day = '" + lwNewFactoryIndicatorDto.getDay() + "', ");
            debugBuffer.append("Changeday = '" + lwNewFactoryIndicatorDto.getChangeday() + "', ");
            debugBuffer.append("ChangeDate = '" + lwNewFactoryIndicatorDto.getChangeDate() + "', ");
            debugBuffer.append("ChangeUnworkQuantity = '" + lwNewFactoryIndicatorDto.getChangeUnworkQuantity() + "', ");
            debugBuffer.append("ChangeworkQuantity = '" + lwNewFactoryIndicatorDto.getChangeworkQuantity() + "', ");
            debugBuffer.append("ChangeWorkPointer = " + lwNewFactoryIndicatorDto.getChangeWorkPointer() + ", ");
            debugBuffer.append("ChangeunWorkPointer = " + lwNewFactoryIndicatorDto.getChangeunWorkPointer() + ", ");
            debugBuffer.append("ChageChgAmmeterQuantity = '" + lwNewFactoryIndicatorDto.getChageChgAmmeterQuantity() + "', ");
            debugBuffer.append("ChangeunChgAmmeterQuantity = '" + lwNewFactoryIndicatorDto.getChangeunChgAmmeterQuantity() + "', ");
            debugBuffer.append("ChangeCompensateQuantity = '" + lwNewFactoryIndicatorDto.getChangeCompensateQuantity() + "', ");
            debugBuffer.append("ChangeunCompensateQuantity = '" + lwNewFactoryIndicatorDto.getChangeunCompensateQuantity() + "', ");
            debugBuffer.append("Rlquantityafbefore = " + lwNewFactoryIndicatorDto.getRlquantityafbefore() + ", ");
            debugBuffer.append("Rlquantityaf = " + lwNewFactoryIndicatorDto.getRlquantityaf() + ", ");
            debugBuffer.append("Rlpriceaf = " + lwNewFactoryIndicatorDto.getRlpriceaf() + ", ");
            debugBuffer.append("Chgpriceafflag = '" + lwNewFactoryIndicatorDto.getChgpriceafflag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwNewFactoryIndicatorDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwNewFactoryIndicatorDto.getStatMonth()).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(lwNewFactoryIndicatorDto.getAmmeterNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwNewFactoryIndicatorDto.getUnChgAmmeterQuantity());
        dbManager.setString(2,lwNewFactoryIndicatorDto.getReadDate());
        dbManager.setString(3,lwNewFactoryIndicatorDto.getInputDate());
        dbManager.setDouble(4,lwNewFactoryIndicatorDto.getThisWorkNum());
        dbManager.setDouble(5,lwNewFactoryIndicatorDto.getLastWorkNum());
        dbManager.setDouble(6,lwNewFactoryIndicatorDto.getThisIdleNum());
        dbManager.setDouble(7,lwNewFactoryIndicatorDto.getLastIdleNum());
        dbManager.setDouble(8,lwNewFactoryIndicatorDto.getRate());
        dbManager.setDouble(9,lwNewFactoryIndicatorDto.getReadQuantity());
        dbManager.setDouble(10,lwNewFactoryIndicatorDto.getExcepQuantity());
        dbManager.setDouble(11,lwNewFactoryIndicatorDto.getChgAmmeterQuantity());
        dbManager.setDouble(12,lwNewFactoryIndicatorDto.getCompensateQuantity());
        dbManager.setDouble(13,lwNewFactoryIndicatorDto.getLineLossQuantity());
        dbManager.setDouble(14,lwNewFactoryIndicatorDto.getTransLossQuantity());
        dbManager.setDouble(15,lwNewFactoryIndicatorDto.getNeedQuantity());
        dbManager.setDouble(16,lwNewFactoryIndicatorDto.getRongliangQuantity());
        dbManager.setString(17,lwNewFactoryIndicatorDto.getValidStatus());
        dbManager.setString(18,lwNewFactoryIndicatorDto.getFlag());
        dbManager.setString(19,lwNewFactoryIndicatorDto.getRemark());
        dbManager.setString(20,lwNewFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity());
        dbManager.setString(21,lwNewFactoryIndicatorDto.getUsername());
        dbManager.setDouble(22,lwNewFactoryIndicatorDto.getUnCompensateQuantity());
        dbManager.setString(23,lwNewFactoryIndicatorDto.getAmmeterStyle());
        dbManager.setString(24,lwNewFactoryIndicatorDto.getWorkQuantity());
        dbManager.setString(25,lwNewFactoryIndicatorDto.getUnworkQuantity());
        dbManager.setString(26,lwNewFactoryIndicatorDto.getIfChange());
        dbManager.setString(27,lwNewFactoryIndicatorDto.getChangeBefore());
        dbManager.setString(28,lwNewFactoryIndicatorDto.getChangeAfter());
        dbManager.setString(29,lwNewFactoryIndicatorDto.getDay());
        dbManager.setString(30,lwNewFactoryIndicatorDto.getChangeday());
        dbManager.setString(31,lwNewFactoryIndicatorDto.getChangeDate());
        dbManager.setString(32,lwNewFactoryIndicatorDto.getChangeUnworkQuantity());
        dbManager.setString(33,lwNewFactoryIndicatorDto.getChangeworkQuantity());
        dbManager.setDouble(34,lwNewFactoryIndicatorDto.getChangeWorkPointer());
        dbManager.setDouble(35,lwNewFactoryIndicatorDto.getChangeunWorkPointer());
        dbManager.setString(36,lwNewFactoryIndicatorDto.getChageChgAmmeterQuantity());
        dbManager.setString(37,lwNewFactoryIndicatorDto.getChangeunChgAmmeterQuantity());
        dbManager.setString(38,lwNewFactoryIndicatorDto.getChangeCompensateQuantity());
        dbManager.setString(39,lwNewFactoryIndicatorDto.getChangeunCompensateQuantity());
        dbManager.setDouble(40,lwNewFactoryIndicatorDto.getRlquantityafbefore());
        dbManager.setDouble(41,lwNewFactoryIndicatorDto.getRlquantityaf());
        dbManager.setDouble(42,lwNewFactoryIndicatorDto.getRlpriceaf());
        dbManager.setString(43,lwNewFactoryIndicatorDto.getChgpriceafflag());
        //设置条件字段;
        dbManager.setString(44,lwNewFactoryIndicatorDto.getUserNo());
        dbManager.setString(45,lwNewFactoryIndicatorDto.getStatMonth());
        dbManager.setString(46,lwNewFactoryIndicatorDto.getAmmeterNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 帐期
     * @param ammeterNo 表号
     * @return LwNewFactoryIndicatorDto
     * @throws Exception
     */
    public LwNewFactoryIndicatorDto findByPrimaryKey(String userNo,String statMonth,String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("UserNo,");
        buffer.append("ReadDate,");
        buffer.append("InputDate,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("LastIdleNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("LineLossQuantity,");
        buffer.append("TransLossQuantity,");
        buffer.append("NeedQuantity,");
        buffer.append("RongliangQuantity,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("PepoleUnChgAmmeterQuantity,");
        buffer.append("Username,");
        buffer.append("UnCompensateQuantity,");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterStyle,");
        buffer.append("WorkQuantity,");
        buffer.append("UnworkQuantity,");
        buffer.append("IfChange,");
        buffer.append("ChangeBefore,");
        buffer.append("ChangeAfter,");
        buffer.append("Day,");
        buffer.append("Changeday,");
        buffer.append("ChangeDate,");
        buffer.append("ChangeUnworkQuantity,");
        buffer.append("ChangeworkQuantity,");
        buffer.append("ChangeWorkPointer,");
        buffer.append("ChangeunWorkPointer,");
        buffer.append("ChageChgAmmeterQuantity,");
        buffer.append("ChangeunChgAmmeterQuantity,");
        buffer.append("ChangeCompensateQuantity,");
        buffer.append("ChangeunCompensateQuantity,");
        buffer.append("Rlquantityafbefore,");
        buffer.append("Rlquantityaf,");
        buffer.append("Rlpriceaf,");
        buffer.append("Chgpriceafflag ");
        buffer.append("FROM LwNewFactoryIndicator ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        dbManager.setString(2,statMonth);
        dbManager.setString(3,ammeterNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = null;
        if(resultSet.next()){
            lwNewFactoryIndicatorDto = new LwNewFactoryIndicatorDto();
            lwNewFactoryIndicatorDto.setUnChgAmmeterQuantity(dbManager.getString(resultSet,1));
            lwNewFactoryIndicatorDto.setUserNo(dbManager.getString(resultSet,2));
            lwNewFactoryIndicatorDto.setReadDate(dbManager.getString(resultSet,3));
            lwNewFactoryIndicatorDto.setInputDate(dbManager.getString(resultSet,4));
            lwNewFactoryIndicatorDto.setStatMonth(dbManager.getString(resultSet,5));
            lwNewFactoryIndicatorDto.setThisWorkNum(dbManager.getDouble(resultSet,6));
            lwNewFactoryIndicatorDto.setLastWorkNum(dbManager.getDouble(resultSet,7));
            lwNewFactoryIndicatorDto.setThisIdleNum(dbManager.getDouble(resultSet,8));
            lwNewFactoryIndicatorDto.setLastIdleNum(dbManager.getDouble(resultSet,9));
            lwNewFactoryIndicatorDto.setRate(dbManager.getDouble(resultSet,10));
            lwNewFactoryIndicatorDto.setReadQuantity(dbManager.getDouble(resultSet,11));
            lwNewFactoryIndicatorDto.setExcepQuantity(dbManager.getDouble(resultSet,12));
            lwNewFactoryIndicatorDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,13));
            lwNewFactoryIndicatorDto.setCompensateQuantity(dbManager.getDouble(resultSet,14));
            lwNewFactoryIndicatorDto.setLineLossQuantity(dbManager.getDouble(resultSet,15));
            lwNewFactoryIndicatorDto.setTransLossQuantity(dbManager.getDouble(resultSet,16));
            lwNewFactoryIndicatorDto.setNeedQuantity(dbManager.getDouble(resultSet,17));
            lwNewFactoryIndicatorDto.setRongliangQuantity(dbManager.getDouble(resultSet,18));
            lwNewFactoryIndicatorDto.setValidStatus(dbManager.getString(resultSet,19));
            lwNewFactoryIndicatorDto.setFlag(dbManager.getString(resultSet,20));
            lwNewFactoryIndicatorDto.setRemark(dbManager.getString(resultSet,21));
            lwNewFactoryIndicatorDto.setPepoleUnChgAmmeterQuantity(dbManager.getString(resultSet,22));
            lwNewFactoryIndicatorDto.setUsername(dbManager.getString(resultSet,23));
            lwNewFactoryIndicatorDto.setUnCompensateQuantity(dbManager.getDouble(resultSet,24));
            lwNewFactoryIndicatorDto.setAmmeterNo(dbManager.getString(resultSet,25));
            lwNewFactoryIndicatorDto.setAmmeterStyle(dbManager.getString(resultSet,26));
            lwNewFactoryIndicatorDto.setWorkQuantity(dbManager.getString(resultSet,27));
            lwNewFactoryIndicatorDto.setUnworkQuantity(dbManager.getString(resultSet,28));
            lwNewFactoryIndicatorDto.setIfChange(dbManager.getString(resultSet,29));
            lwNewFactoryIndicatorDto.setChangeBefore(dbManager.getString(resultSet,30));
            lwNewFactoryIndicatorDto.setChangeAfter(dbManager.getString(resultSet,31));
            lwNewFactoryIndicatorDto.setDay(dbManager.getString(resultSet,32));
            lwNewFactoryIndicatorDto.setChangeday(dbManager.getString(resultSet,33));
            lwNewFactoryIndicatorDto.setChangeDate(dbManager.getString(resultSet,34));
            lwNewFactoryIndicatorDto.setChangeUnworkQuantity(dbManager.getString(resultSet,35));
            lwNewFactoryIndicatorDto.setChangeworkQuantity(dbManager.getString(resultSet,36));
            lwNewFactoryIndicatorDto.setChangeWorkPointer(dbManager.getDouble(resultSet,37));
            lwNewFactoryIndicatorDto.setChangeunWorkPointer(dbManager.getDouble(resultSet,38));
            lwNewFactoryIndicatorDto.setChageChgAmmeterQuantity(dbManager.getString(resultSet,39));
            lwNewFactoryIndicatorDto.setChangeunChgAmmeterQuantity(dbManager.getString(resultSet,40));
            lwNewFactoryIndicatorDto.setChangeCompensateQuantity(dbManager.getString(resultSet,41));
            lwNewFactoryIndicatorDto.setChangeunCompensateQuantity(dbManager.getString(resultSet,42));
            lwNewFactoryIndicatorDto.setRlquantityafbefore(dbManager.getDouble(resultSet,43));
            lwNewFactoryIndicatorDto.setRlquantityaf(dbManager.getDouble(resultSet,44));
            lwNewFactoryIndicatorDto.setRlpriceaf(dbManager.getDouble(resultSet,45));
            lwNewFactoryIndicatorDto.setChgpriceafflag(dbManager.getString(resultSet,46));
        }
        resultSet.close();
        return lwNewFactoryIndicatorDto;
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
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("UserNo,");
        buffer.append("ReadDate,");
        buffer.append("InputDate,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("LastIdleNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("LineLossQuantity,");
        buffer.append("TransLossQuantity,");
        buffer.append("NeedQuantity,");
        buffer.append("RongliangQuantity,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("PepoleUnChgAmmeterQuantity,");
        buffer.append("Username,");
        buffer.append("UnCompensateQuantity,");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterStyle,");
        buffer.append("WorkQuantity,");
        buffer.append("UnworkQuantity,");
        buffer.append("IfChange,");
        buffer.append("ChangeBefore,");
        buffer.append("ChangeAfter,");
        buffer.append("Day,");
        buffer.append("Changeday,");
        buffer.append("ChangeDate,");
        buffer.append("ChangeUnworkQuantity,");
        buffer.append("ChangeworkQuantity,");
        buffer.append("ChangeWorkPointer,");
        buffer.append("ChangeunWorkPointer,");
        buffer.append("ChageChgAmmeterQuantity,");
        buffer.append("ChangeunChgAmmeterQuantity,");
        buffer.append("ChangeCompensateQuantity,");
        buffer.append("ChangeunCompensateQuantity,");
        buffer.append("Rlquantityafbefore,");
        buffer.append("Rlquantityaf,");
        buffer.append("Rlpriceaf,");
        buffer.append("Chgpriceafflag ");
        buffer.append("FROM LwNewFactoryIndicator WHERE ");
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
        LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwNewFactoryIndicatorDto = new LwNewFactoryIndicatorDto();
            lwNewFactoryIndicatorDto.setUnChgAmmeterQuantity(dbManager.getString(resultSet,"UnChgAmmeterQuantity"));
            lwNewFactoryIndicatorDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwNewFactoryIndicatorDto.setReadDate(dbManager.getString(resultSet,"ReadDate"));
            lwNewFactoryIndicatorDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwNewFactoryIndicatorDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwNewFactoryIndicatorDto.setThisWorkNum(dbManager.getDouble(resultSet,"ThisWorkNum"));
            lwNewFactoryIndicatorDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwNewFactoryIndicatorDto.setThisIdleNum(dbManager.getDouble(resultSet,"ThisIdleNum"));
            lwNewFactoryIndicatorDto.setLastIdleNum(dbManager.getDouble(resultSet,"LastIdleNum"));
            lwNewFactoryIndicatorDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwNewFactoryIndicatorDto.setReadQuantity(dbManager.getDouble(resultSet,"ReadQuantity"));
            lwNewFactoryIndicatorDto.setExcepQuantity(dbManager.getDouble(resultSet,"ExcepQuantity"));
            lwNewFactoryIndicatorDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,"ChgAmmeterQuantity"));
            lwNewFactoryIndicatorDto.setCompensateQuantity(dbManager.getDouble(resultSet,"CompensateQuantity"));
            lwNewFactoryIndicatorDto.setLineLossQuantity(dbManager.getDouble(resultSet,"LineLossQuantity"));
            lwNewFactoryIndicatorDto.setTransLossQuantity(dbManager.getDouble(resultSet,"TransLossQuantity"));
            lwNewFactoryIndicatorDto.setNeedQuantity(dbManager.getDouble(resultSet,"NeedQuantity"));
            lwNewFactoryIndicatorDto.setRongliangQuantity(dbManager.getDouble(resultSet,"RongliangQuantity"));
            lwNewFactoryIndicatorDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwNewFactoryIndicatorDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwNewFactoryIndicatorDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwNewFactoryIndicatorDto.setPepoleUnChgAmmeterQuantity(dbManager.getString(resultSet,"PepoleUnChgAmmeterQuantity"));
            lwNewFactoryIndicatorDto.setUsername(dbManager.getString(resultSet,"Username"));
            lwNewFactoryIndicatorDto.setUnCompensateQuantity(dbManager.getDouble(resultSet,"UnCompensateQuantity"));
            lwNewFactoryIndicatorDto.setAmmeterNo(dbManager.getString(resultSet,"AmmeterNo"));
            lwNewFactoryIndicatorDto.setAmmeterStyle(dbManager.getString(resultSet,"AmmeterStyle"));
            lwNewFactoryIndicatorDto.setWorkQuantity(dbManager.getString(resultSet,"WorkQuantity"));
            lwNewFactoryIndicatorDto.setUnworkQuantity(dbManager.getString(resultSet,"UnworkQuantity"));
            lwNewFactoryIndicatorDto.setIfChange(dbManager.getString(resultSet,"IfChange"));
            lwNewFactoryIndicatorDto.setChangeBefore(dbManager.getString(resultSet,"ChangeBefore"));
            lwNewFactoryIndicatorDto.setChangeAfter(dbManager.getString(resultSet,"ChangeAfter"));
            lwNewFactoryIndicatorDto.setDay(dbManager.getString(resultSet,"Day"));
            lwNewFactoryIndicatorDto.setChangeday(dbManager.getString(resultSet,"Changeday"));
            lwNewFactoryIndicatorDto.setChangeDate(dbManager.getString(resultSet,"ChangeDate"));
            lwNewFactoryIndicatorDto.setChangeUnworkQuantity(dbManager.getString(resultSet,"ChangeUnworkQuantity"));
            lwNewFactoryIndicatorDto.setChangeworkQuantity(dbManager.getString(resultSet,"ChangeworkQuantity"));
            lwNewFactoryIndicatorDto.setChangeWorkPointer(dbManager.getDouble(resultSet,"ChangeWorkPointer"));
            lwNewFactoryIndicatorDto.setChangeunWorkPointer(dbManager.getDouble(resultSet,"ChangeunWorkPointer"));
            lwNewFactoryIndicatorDto.setChageChgAmmeterQuantity(dbManager.getString(resultSet,"ChageChgAmmeterQuantity"));
            lwNewFactoryIndicatorDto.setChangeunChgAmmeterQuantity(dbManager.getString(resultSet,"ChangeunChgAmmeterQuantity"));
            lwNewFactoryIndicatorDto.setChangeCompensateQuantity(dbManager.getString(resultSet,"ChangeCompensateQuantity"));
            lwNewFactoryIndicatorDto.setChangeunCompensateQuantity(dbManager.getString(resultSet,"ChangeunCompensateQuantity"));
            lwNewFactoryIndicatorDto.setRlquantityafbefore(dbManager.getDouble(resultSet,"Rlquantityafbefore"));
            lwNewFactoryIndicatorDto.setRlquantityaf(dbManager.getDouble(resultSet,"Rlquantityaf"));
            lwNewFactoryIndicatorDto.setRlpriceaf(dbManager.getDouble(resultSet,"Rlpriceaf"));
            lwNewFactoryIndicatorDto.setChgpriceafflag(dbManager.getString(resultSet,"Chgpriceafflag"));
            collection.add(lwNewFactoryIndicatorDto);
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
        buffer.append("DELETE FROM LwNewFactoryIndicator WHERE ");
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
        buffer.append("SELECT count(*) FROM LwNewFactoryIndicator WHERE ");
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
