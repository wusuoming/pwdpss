package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWNewFactoryIndicatorBak-大工业新电表指针备份表的数据访问对象基类<br>
 */
public class DBLwNewFactoryIndicatorBakBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwNewFactoryIndicatorBakBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwNewFactoryIndicatorBakBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public void insert(LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwNewFactoryIndicatorBak (");
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
        buffer.append("ChangeWorkPointer,");
        buffer.append("ChangeBefore,");
        buffer.append("ChangeAfter,");
        buffer.append("Day,");
        buffer.append("Changeday,");
        buffer.append("ChangeDate,");
        buffer.append("ChangeUnworkQuantity,");
        buffer.append("ChangeworkQuantity,");
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
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getUnChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getReadDate()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getThisIdleNum()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getLastIdleNum()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getRate()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getReadQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getExcepQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getChgAmmeterQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getLineLossQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getTransLossQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getNeedQuantity()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getRongliangQuantity()).append(",");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getUsername()).append("',");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getUnCompensateQuantity()).append(",");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getAmmeterNo()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getAmmeterStyle()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getWorkQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getUnworkQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getIfChange()).append("',");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getChangeWorkPointer()).append(",");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChangeBefore()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChangeAfter()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getDay()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChangeday()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChangeDate()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChangeUnworkQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChangeworkQuantity()).append("',");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getChangeunWorkPointer()).append(",");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChageChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChangeunChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChangeCompensateQuantity()).append("',");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChangeunCompensateQuantity()).append("',");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getRlquantityafbefore()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getRlquantityaf()).append(",");
            debugBuffer.append("").append(lwNewFactoryIndicatorBakDto.getRlpriceaf()).append(",");
            debugBuffer.append("'").append(lwNewFactoryIndicatorBakDto.getChgpriceafflag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwNewFactoryIndicatorBakDto.getUnChgAmmeterQuantity());
        dbManager.setString(2,lwNewFactoryIndicatorBakDto.getUserNo());
        dbManager.setString(3,lwNewFactoryIndicatorBakDto.getReadDate());
        dbManager.setString(4,lwNewFactoryIndicatorBakDto.getInputDate());
        dbManager.setString(5,lwNewFactoryIndicatorBakDto.getStatMonth());
        dbManager.setDouble(6,lwNewFactoryIndicatorBakDto.getThisWorkNum());
        dbManager.setDouble(7,lwNewFactoryIndicatorBakDto.getLastWorkNum());
        dbManager.setDouble(8,lwNewFactoryIndicatorBakDto.getThisIdleNum());
        dbManager.setDouble(9,lwNewFactoryIndicatorBakDto.getLastIdleNum());
        dbManager.setDouble(10,lwNewFactoryIndicatorBakDto.getRate());
        dbManager.setDouble(11,lwNewFactoryIndicatorBakDto.getReadQuantity());
        dbManager.setDouble(12,lwNewFactoryIndicatorBakDto.getExcepQuantity());
        dbManager.setDouble(13,lwNewFactoryIndicatorBakDto.getChgAmmeterQuantity());
        dbManager.setDouble(14,lwNewFactoryIndicatorBakDto.getCompensateQuantity());
        dbManager.setDouble(15,lwNewFactoryIndicatorBakDto.getLineLossQuantity());
        dbManager.setDouble(16,lwNewFactoryIndicatorBakDto.getTransLossQuantity());
        dbManager.setDouble(17,lwNewFactoryIndicatorBakDto.getNeedQuantity());
        dbManager.setDouble(18,lwNewFactoryIndicatorBakDto.getRongliangQuantity());
        dbManager.setString(19,lwNewFactoryIndicatorBakDto.getValidStatus());
        dbManager.setString(20,lwNewFactoryIndicatorBakDto.getFlag());
        dbManager.setString(21,lwNewFactoryIndicatorBakDto.getRemark());
        dbManager.setString(22,lwNewFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity());
        dbManager.setString(23,lwNewFactoryIndicatorBakDto.getUsername());
        dbManager.setDouble(24,lwNewFactoryIndicatorBakDto.getUnCompensateQuantity());
        dbManager.setString(25,lwNewFactoryIndicatorBakDto.getAmmeterNo());
        dbManager.setString(26,lwNewFactoryIndicatorBakDto.getAmmeterStyle());
        dbManager.setString(27,lwNewFactoryIndicatorBakDto.getWorkQuantity());
        dbManager.setString(28,lwNewFactoryIndicatorBakDto.getUnworkQuantity());
        dbManager.setString(29,lwNewFactoryIndicatorBakDto.getIfChange());
        dbManager.setDouble(30,lwNewFactoryIndicatorBakDto.getChangeWorkPointer());
        dbManager.setString(31,lwNewFactoryIndicatorBakDto.getChangeBefore());
        dbManager.setString(32,lwNewFactoryIndicatorBakDto.getChangeAfter());
        dbManager.setString(33,lwNewFactoryIndicatorBakDto.getDay());
        dbManager.setString(34,lwNewFactoryIndicatorBakDto.getChangeday());
        dbManager.setString(35,lwNewFactoryIndicatorBakDto.getChangeDate());
        dbManager.setString(36,lwNewFactoryIndicatorBakDto.getChangeUnworkQuantity());
        dbManager.setString(37,lwNewFactoryIndicatorBakDto.getChangeworkQuantity());
        dbManager.setDouble(38,lwNewFactoryIndicatorBakDto.getChangeunWorkPointer());
        dbManager.setString(39,lwNewFactoryIndicatorBakDto.getChageChgAmmeterQuantity());
        dbManager.setString(40,lwNewFactoryIndicatorBakDto.getChangeunChgAmmeterQuantity());
        dbManager.setString(41,lwNewFactoryIndicatorBakDto.getChangeCompensateQuantity());
        dbManager.setString(42,lwNewFactoryIndicatorBakDto.getChangeunCompensateQuantity());
        dbManager.setDouble(43,lwNewFactoryIndicatorBakDto.getRlquantityafbefore());
        dbManager.setDouble(44,lwNewFactoryIndicatorBakDto.getRlquantityaf());
        dbManager.setDouble(45,lwNewFactoryIndicatorBakDto.getRlpriceaf());
        dbManager.setString(46,lwNewFactoryIndicatorBakDto.getChgpriceafflag());
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
        buffer.append("INSERT INTO LwNewFactoryIndicatorBak (");
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
        buffer.append("ChangeWorkPointer,");
        buffer.append("ChangeBefore,");
        buffer.append("ChangeAfter,");
        buffer.append("Day,");
        buffer.append("Changeday,");
        buffer.append("ChangeDate,");
        buffer.append("ChangeUnworkQuantity,");
        buffer.append("ChangeworkQuantity,");
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
            LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto = (LwNewFactoryIndicatorBakDto)i.next();
            dbManager.setString(1,lwNewFactoryIndicatorBakDto.getUnChgAmmeterQuantity());
            dbManager.setString(2,lwNewFactoryIndicatorBakDto.getUserNo());
            dbManager.setString(3,lwNewFactoryIndicatorBakDto.getReadDate());
            dbManager.setString(4,lwNewFactoryIndicatorBakDto.getInputDate());
            dbManager.setString(5,lwNewFactoryIndicatorBakDto.getStatMonth());
            dbManager.setDouble(6,lwNewFactoryIndicatorBakDto.getThisWorkNum());
            dbManager.setDouble(7,lwNewFactoryIndicatorBakDto.getLastWorkNum());
            dbManager.setDouble(8,lwNewFactoryIndicatorBakDto.getThisIdleNum());
            dbManager.setDouble(9,lwNewFactoryIndicatorBakDto.getLastIdleNum());
            dbManager.setDouble(10,lwNewFactoryIndicatorBakDto.getRate());
            dbManager.setDouble(11,lwNewFactoryIndicatorBakDto.getReadQuantity());
            dbManager.setDouble(12,lwNewFactoryIndicatorBakDto.getExcepQuantity());
            dbManager.setDouble(13,lwNewFactoryIndicatorBakDto.getChgAmmeterQuantity());
            dbManager.setDouble(14,lwNewFactoryIndicatorBakDto.getCompensateQuantity());
            dbManager.setDouble(15,lwNewFactoryIndicatorBakDto.getLineLossQuantity());
            dbManager.setDouble(16,lwNewFactoryIndicatorBakDto.getTransLossQuantity());
            dbManager.setDouble(17,lwNewFactoryIndicatorBakDto.getNeedQuantity());
            dbManager.setDouble(18,lwNewFactoryIndicatorBakDto.getRongliangQuantity());
            dbManager.setString(19,lwNewFactoryIndicatorBakDto.getValidStatus());
            dbManager.setString(20,lwNewFactoryIndicatorBakDto.getFlag());
            dbManager.setString(21,lwNewFactoryIndicatorBakDto.getRemark());
            dbManager.setString(22,lwNewFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity());
            dbManager.setString(23,lwNewFactoryIndicatorBakDto.getUsername());
            dbManager.setDouble(24,lwNewFactoryIndicatorBakDto.getUnCompensateQuantity());
            dbManager.setString(25,lwNewFactoryIndicatorBakDto.getAmmeterNo());
            dbManager.setString(26,lwNewFactoryIndicatorBakDto.getAmmeterStyle());
            dbManager.setString(27,lwNewFactoryIndicatorBakDto.getWorkQuantity());
            dbManager.setString(28,lwNewFactoryIndicatorBakDto.getUnworkQuantity());
            dbManager.setString(29,lwNewFactoryIndicatorBakDto.getIfChange());
            dbManager.setDouble(30,lwNewFactoryIndicatorBakDto.getChangeWorkPointer());
            dbManager.setString(31,lwNewFactoryIndicatorBakDto.getChangeBefore());
            dbManager.setString(32,lwNewFactoryIndicatorBakDto.getChangeAfter());
            dbManager.setString(33,lwNewFactoryIndicatorBakDto.getDay());
            dbManager.setString(34,lwNewFactoryIndicatorBakDto.getChangeday());
            dbManager.setString(35,lwNewFactoryIndicatorBakDto.getChangeDate());
            dbManager.setString(36,lwNewFactoryIndicatorBakDto.getChangeUnworkQuantity());
            dbManager.setString(37,lwNewFactoryIndicatorBakDto.getChangeworkQuantity());
            dbManager.setDouble(38,lwNewFactoryIndicatorBakDto.getChangeunWorkPointer());
            dbManager.setString(39,lwNewFactoryIndicatorBakDto.getChageChgAmmeterQuantity());
            dbManager.setString(40,lwNewFactoryIndicatorBakDto.getChangeunChgAmmeterQuantity());
            dbManager.setString(41,lwNewFactoryIndicatorBakDto.getChangeCompensateQuantity());
            dbManager.setString(42,lwNewFactoryIndicatorBakDto.getChangeunCompensateQuantity());
            dbManager.setDouble(43,lwNewFactoryIndicatorBakDto.getRlquantityafbefore());
            dbManager.setDouble(44,lwNewFactoryIndicatorBakDto.getRlquantityaf());
            dbManager.setDouble(45,lwNewFactoryIndicatorBakDto.getRlpriceaf());
            dbManager.setString(46,lwNewFactoryIndicatorBakDto.getChgpriceafflag());
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
        buffer.append("DELETE FROM LwNewFactoryIndicatorBak ");
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
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public void update(LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwNewFactoryIndicatorBak SET ");
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
        buffer.append("ChangeWorkPointer = ?, ");
        buffer.append("ChangeBefore = ?, ");
        buffer.append("ChangeAfter = ?, ");
        buffer.append("Day = ?, ");
        buffer.append("Changeday = ?, ");
        buffer.append("ChangeDate = ?, ");
        buffer.append("ChangeUnworkQuantity = ?, ");
        buffer.append("ChangeworkQuantity = ?, ");
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
            debugBuffer.append("UPDATE LwNewFactoryIndicatorBak SET ");
            debugBuffer.append("UnChgAmmeterQuantity = '" + lwNewFactoryIndicatorBakDto.getUnChgAmmeterQuantity() + "', ");
            debugBuffer.append("ReadDate = '" + lwNewFactoryIndicatorBakDto.getReadDate() + "', ");
            debugBuffer.append("InputDate = '" + lwNewFactoryIndicatorBakDto.getInputDate() + "', ");
            debugBuffer.append("ThisWorkNum = " + lwNewFactoryIndicatorBakDto.getThisWorkNum() + ", ");
            debugBuffer.append("LastWorkNum = " + lwNewFactoryIndicatorBakDto.getLastWorkNum() + ", ");
            debugBuffer.append("ThisIdleNum = " + lwNewFactoryIndicatorBakDto.getThisIdleNum() + ", ");
            debugBuffer.append("LastIdleNum = " + lwNewFactoryIndicatorBakDto.getLastIdleNum() + ", ");
            debugBuffer.append("Rate = " + lwNewFactoryIndicatorBakDto.getRate() + ", ");
            debugBuffer.append("ReadQuantity = " + lwNewFactoryIndicatorBakDto.getReadQuantity() + ", ");
            debugBuffer.append("ExcepQuantity = " + lwNewFactoryIndicatorBakDto.getExcepQuantity() + ", ");
            debugBuffer.append("ChgAmmeterQuantity = " + lwNewFactoryIndicatorBakDto.getChgAmmeterQuantity() + ", ");
            debugBuffer.append("CompensateQuantity = " + lwNewFactoryIndicatorBakDto.getCompensateQuantity() + ", ");
            debugBuffer.append("LineLossQuantity = " + lwNewFactoryIndicatorBakDto.getLineLossQuantity() + ", ");
            debugBuffer.append("TransLossQuantity = " + lwNewFactoryIndicatorBakDto.getTransLossQuantity() + ", ");
            debugBuffer.append("NeedQuantity = " + lwNewFactoryIndicatorBakDto.getNeedQuantity() + ", ");
            debugBuffer.append("RongliangQuantity = " + lwNewFactoryIndicatorBakDto.getRongliangQuantity() + ", ");
            debugBuffer.append("ValidStatus = '" + lwNewFactoryIndicatorBakDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwNewFactoryIndicatorBakDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwNewFactoryIndicatorBakDto.getRemark() + "', ");
            debugBuffer.append("PepoleUnChgAmmeterQuantity = '" + lwNewFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity() + "', ");
            debugBuffer.append("Username = '" + lwNewFactoryIndicatorBakDto.getUsername() + "', ");
            debugBuffer.append("UnCompensateQuantity = " + lwNewFactoryIndicatorBakDto.getUnCompensateQuantity() + ", ");
            debugBuffer.append("AmmeterStyle = '" + lwNewFactoryIndicatorBakDto.getAmmeterStyle() + "', ");
            debugBuffer.append("WorkQuantity = '" + lwNewFactoryIndicatorBakDto.getWorkQuantity() + "', ");
            debugBuffer.append("UnworkQuantity = '" + lwNewFactoryIndicatorBakDto.getUnworkQuantity() + "', ");
            debugBuffer.append("IfChange = '" + lwNewFactoryIndicatorBakDto.getIfChange() + "', ");
            debugBuffer.append("ChangeWorkPointer = " + lwNewFactoryIndicatorBakDto.getChangeWorkPointer() + ", ");
            debugBuffer.append("ChangeBefore = '" + lwNewFactoryIndicatorBakDto.getChangeBefore() + "', ");
            debugBuffer.append("ChangeAfter = '" + lwNewFactoryIndicatorBakDto.getChangeAfter() + "', ");
            debugBuffer.append("Day = '" + lwNewFactoryIndicatorBakDto.getDay() + "', ");
            debugBuffer.append("Changeday = '" + lwNewFactoryIndicatorBakDto.getChangeday() + "', ");
            debugBuffer.append("ChangeDate = '" + lwNewFactoryIndicatorBakDto.getChangeDate() + "', ");
            debugBuffer.append("ChangeUnworkQuantity = '" + lwNewFactoryIndicatorBakDto.getChangeUnworkQuantity() + "', ");
            debugBuffer.append("ChangeworkQuantity = '" + lwNewFactoryIndicatorBakDto.getChangeworkQuantity() + "', ");
            debugBuffer.append("ChangeunWorkPointer = " + lwNewFactoryIndicatorBakDto.getChangeunWorkPointer() + ", ");
            debugBuffer.append("ChageChgAmmeterQuantity = '" + lwNewFactoryIndicatorBakDto.getChageChgAmmeterQuantity() + "', ");
            debugBuffer.append("ChangeunChgAmmeterQuantity = '" + lwNewFactoryIndicatorBakDto.getChangeunChgAmmeterQuantity() + "', ");
            debugBuffer.append("ChangeCompensateQuantity = '" + lwNewFactoryIndicatorBakDto.getChangeCompensateQuantity() + "', ");
            debugBuffer.append("ChangeunCompensateQuantity = '" + lwNewFactoryIndicatorBakDto.getChangeunCompensateQuantity() + "', ");
            debugBuffer.append("Rlquantityafbefore = " + lwNewFactoryIndicatorBakDto.getRlquantityafbefore() + ", ");
            debugBuffer.append("Rlquantityaf = " + lwNewFactoryIndicatorBakDto.getRlquantityaf() + ", ");
            debugBuffer.append("Rlpriceaf = " + lwNewFactoryIndicatorBakDto.getRlpriceaf() + ", ");
            debugBuffer.append("Chgpriceafflag = '" + lwNewFactoryIndicatorBakDto.getChgpriceafflag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwNewFactoryIndicatorBakDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwNewFactoryIndicatorBakDto.getStatMonth()).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(lwNewFactoryIndicatorBakDto.getAmmeterNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwNewFactoryIndicatorBakDto.getUnChgAmmeterQuantity());
        dbManager.setString(2,lwNewFactoryIndicatorBakDto.getReadDate());
        dbManager.setString(3,lwNewFactoryIndicatorBakDto.getInputDate());
        dbManager.setDouble(4,lwNewFactoryIndicatorBakDto.getThisWorkNum());
        dbManager.setDouble(5,lwNewFactoryIndicatorBakDto.getLastWorkNum());
        dbManager.setDouble(6,lwNewFactoryIndicatorBakDto.getThisIdleNum());
        dbManager.setDouble(7,lwNewFactoryIndicatorBakDto.getLastIdleNum());
        dbManager.setDouble(8,lwNewFactoryIndicatorBakDto.getRate());
        dbManager.setDouble(9,lwNewFactoryIndicatorBakDto.getReadQuantity());
        dbManager.setDouble(10,lwNewFactoryIndicatorBakDto.getExcepQuantity());
        dbManager.setDouble(11,lwNewFactoryIndicatorBakDto.getChgAmmeterQuantity());
        dbManager.setDouble(12,lwNewFactoryIndicatorBakDto.getCompensateQuantity());
        dbManager.setDouble(13,lwNewFactoryIndicatorBakDto.getLineLossQuantity());
        dbManager.setDouble(14,lwNewFactoryIndicatorBakDto.getTransLossQuantity());
        dbManager.setDouble(15,lwNewFactoryIndicatorBakDto.getNeedQuantity());
        dbManager.setDouble(16,lwNewFactoryIndicatorBakDto.getRongliangQuantity());
        dbManager.setString(17,lwNewFactoryIndicatorBakDto.getValidStatus());
        dbManager.setString(18,lwNewFactoryIndicatorBakDto.getFlag());
        dbManager.setString(19,lwNewFactoryIndicatorBakDto.getRemark());
        dbManager.setString(20,lwNewFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity());
        dbManager.setString(21,lwNewFactoryIndicatorBakDto.getUsername());
        dbManager.setDouble(22,lwNewFactoryIndicatorBakDto.getUnCompensateQuantity());
        dbManager.setString(23,lwNewFactoryIndicatorBakDto.getAmmeterStyle());
        dbManager.setString(24,lwNewFactoryIndicatorBakDto.getWorkQuantity());
        dbManager.setString(25,lwNewFactoryIndicatorBakDto.getUnworkQuantity());
        dbManager.setString(26,lwNewFactoryIndicatorBakDto.getIfChange());
        dbManager.setDouble(27,lwNewFactoryIndicatorBakDto.getChangeWorkPointer());
        dbManager.setString(28,lwNewFactoryIndicatorBakDto.getChangeBefore());
        dbManager.setString(29,lwNewFactoryIndicatorBakDto.getChangeAfter());
        dbManager.setString(30,lwNewFactoryIndicatorBakDto.getDay());
        dbManager.setString(31,lwNewFactoryIndicatorBakDto.getChangeday());
        dbManager.setString(32,lwNewFactoryIndicatorBakDto.getChangeDate());
        dbManager.setString(33,lwNewFactoryIndicatorBakDto.getChangeUnworkQuantity());
        dbManager.setString(34,lwNewFactoryIndicatorBakDto.getChangeworkQuantity());
        dbManager.setDouble(35,lwNewFactoryIndicatorBakDto.getChangeunWorkPointer());
        dbManager.setString(36,lwNewFactoryIndicatorBakDto.getChageChgAmmeterQuantity());
        dbManager.setString(37,lwNewFactoryIndicatorBakDto.getChangeunChgAmmeterQuantity());
        dbManager.setString(38,lwNewFactoryIndicatorBakDto.getChangeCompensateQuantity());
        dbManager.setString(39,lwNewFactoryIndicatorBakDto.getChangeunCompensateQuantity());
        dbManager.setDouble(40,lwNewFactoryIndicatorBakDto.getRlquantityafbefore());
        dbManager.setDouble(41,lwNewFactoryIndicatorBakDto.getRlquantityaf());
        dbManager.setDouble(42,lwNewFactoryIndicatorBakDto.getRlpriceaf());
        dbManager.setString(43,lwNewFactoryIndicatorBakDto.getChgpriceafflag());
        //设置条件字段;
        dbManager.setString(44,lwNewFactoryIndicatorBakDto.getUserNo());
        dbManager.setString(45,lwNewFactoryIndicatorBakDto.getStatMonth());
        dbManager.setString(46,lwNewFactoryIndicatorBakDto.getAmmeterNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 帐期
     * @param ammeterNo 表号
     * @return LwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public LwNewFactoryIndicatorBakDto findByPrimaryKey(String userNo,String statMonth,String ammeterNo)
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
        buffer.append("ChangeWorkPointer,");
        buffer.append("ChangeBefore,");
        buffer.append("ChangeAfter,");
        buffer.append("Day,");
        buffer.append("Changeday,");
        buffer.append("ChangeDate,");
        buffer.append("ChangeUnworkQuantity,");
        buffer.append("ChangeworkQuantity,");
        buffer.append("ChangeunWorkPointer,");
        buffer.append("ChageChgAmmeterQuantity,");
        buffer.append("ChangeunChgAmmeterQuantity,");
        buffer.append("ChangeCompensateQuantity,");
        buffer.append("ChangeunCompensateQuantity,");
        buffer.append("Rlquantityafbefore,");
        buffer.append("Rlquantityaf,");
        buffer.append("Rlpriceaf,");
        buffer.append("Chgpriceafflag ");
        buffer.append("FROM LwNewFactoryIndicatorBak ");
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
        LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto = null;
        if(resultSet.next()){
            lwNewFactoryIndicatorBakDto = new LwNewFactoryIndicatorBakDto();
            lwNewFactoryIndicatorBakDto.setUnChgAmmeterQuantity(dbManager.getString(resultSet,1));
            lwNewFactoryIndicatorBakDto.setUserNo(dbManager.getString(resultSet,2));
            lwNewFactoryIndicatorBakDto.setReadDate(dbManager.getString(resultSet,3));
            lwNewFactoryIndicatorBakDto.setInputDate(dbManager.getString(resultSet,4));
            lwNewFactoryIndicatorBakDto.setStatMonth(dbManager.getString(resultSet,5));
            lwNewFactoryIndicatorBakDto.setThisWorkNum(dbManager.getDouble(resultSet,6));
            lwNewFactoryIndicatorBakDto.setLastWorkNum(dbManager.getDouble(resultSet,7));
            lwNewFactoryIndicatorBakDto.setThisIdleNum(dbManager.getDouble(resultSet,8));
            lwNewFactoryIndicatorBakDto.setLastIdleNum(dbManager.getDouble(resultSet,9));
            lwNewFactoryIndicatorBakDto.setRate(dbManager.getDouble(resultSet,10));
            lwNewFactoryIndicatorBakDto.setReadQuantity(dbManager.getDouble(resultSet,11));
            lwNewFactoryIndicatorBakDto.setExcepQuantity(dbManager.getDouble(resultSet,12));
            lwNewFactoryIndicatorBakDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,13));
            lwNewFactoryIndicatorBakDto.setCompensateQuantity(dbManager.getDouble(resultSet,14));
            lwNewFactoryIndicatorBakDto.setLineLossQuantity(dbManager.getDouble(resultSet,15));
            lwNewFactoryIndicatorBakDto.setTransLossQuantity(dbManager.getDouble(resultSet,16));
            lwNewFactoryIndicatorBakDto.setNeedQuantity(dbManager.getDouble(resultSet,17));
            lwNewFactoryIndicatorBakDto.setRongliangQuantity(dbManager.getDouble(resultSet,18));
            lwNewFactoryIndicatorBakDto.setValidStatus(dbManager.getString(resultSet,19));
            lwNewFactoryIndicatorBakDto.setFlag(dbManager.getString(resultSet,20));
            lwNewFactoryIndicatorBakDto.setRemark(dbManager.getString(resultSet,21));
            lwNewFactoryIndicatorBakDto.setPepoleUnChgAmmeterQuantity(dbManager.getString(resultSet,22));
            lwNewFactoryIndicatorBakDto.setUsername(dbManager.getString(resultSet,23));
            lwNewFactoryIndicatorBakDto.setUnCompensateQuantity(dbManager.getDouble(resultSet,24));
            lwNewFactoryIndicatorBakDto.setAmmeterNo(dbManager.getString(resultSet,25));
            lwNewFactoryIndicatorBakDto.setAmmeterStyle(dbManager.getString(resultSet,26));
            lwNewFactoryIndicatorBakDto.setWorkQuantity(dbManager.getString(resultSet,27));
            lwNewFactoryIndicatorBakDto.setUnworkQuantity(dbManager.getString(resultSet,28));
            lwNewFactoryIndicatorBakDto.setIfChange(dbManager.getString(resultSet,29));
            lwNewFactoryIndicatorBakDto.setChangeWorkPointer(dbManager.getDouble(resultSet,30));
            lwNewFactoryIndicatorBakDto.setChangeBefore(dbManager.getString(resultSet,31));
            lwNewFactoryIndicatorBakDto.setChangeAfter(dbManager.getString(resultSet,32));
            lwNewFactoryIndicatorBakDto.setDay(dbManager.getString(resultSet,33));
            lwNewFactoryIndicatorBakDto.setChangeday(dbManager.getString(resultSet,34));
            lwNewFactoryIndicatorBakDto.setChangeDate(dbManager.getString(resultSet,35));
            lwNewFactoryIndicatorBakDto.setChangeUnworkQuantity(dbManager.getString(resultSet,36));
            lwNewFactoryIndicatorBakDto.setChangeworkQuantity(dbManager.getString(resultSet,37));
            lwNewFactoryIndicatorBakDto.setChangeunWorkPointer(dbManager.getDouble(resultSet,38));
            lwNewFactoryIndicatorBakDto.setChageChgAmmeterQuantity(dbManager.getString(resultSet,39));
            lwNewFactoryIndicatorBakDto.setChangeunChgAmmeterQuantity(dbManager.getString(resultSet,40));
            lwNewFactoryIndicatorBakDto.setChangeCompensateQuantity(dbManager.getString(resultSet,41));
            lwNewFactoryIndicatorBakDto.setChangeunCompensateQuantity(dbManager.getString(resultSet,42));
            lwNewFactoryIndicatorBakDto.setRlquantityafbefore(dbManager.getDouble(resultSet,43));
            lwNewFactoryIndicatorBakDto.setRlquantityaf(dbManager.getDouble(resultSet,44));
            lwNewFactoryIndicatorBakDto.setRlpriceaf(dbManager.getDouble(resultSet,45));
            lwNewFactoryIndicatorBakDto.setChgpriceafflag(dbManager.getString(resultSet,46));
        }
        resultSet.close();
        return lwNewFactoryIndicatorBakDto;
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
        buffer.append("ChangeWorkPointer,");
        buffer.append("ChangeBefore,");
        buffer.append("ChangeAfter,");
        buffer.append("Day,");
        buffer.append("Changeday,");
        buffer.append("ChangeDate,");
        buffer.append("ChangeUnworkQuantity,");
        buffer.append("ChangeworkQuantity,");
        buffer.append("ChangeunWorkPointer,");
        buffer.append("ChageChgAmmeterQuantity,");
        buffer.append("ChangeunChgAmmeterQuantity,");
        buffer.append("ChangeCompensateQuantity,");
        buffer.append("ChangeunCompensateQuantity,");
        buffer.append("Rlquantityafbefore,");
        buffer.append("Rlquantityaf,");
        buffer.append("Rlpriceaf,");
        buffer.append("Chgpriceafflag ");
        buffer.append("FROM LwNewFactoryIndicatorBak WHERE ");
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
        LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwNewFactoryIndicatorBakDto = new LwNewFactoryIndicatorBakDto();
            lwNewFactoryIndicatorBakDto.setUnChgAmmeterQuantity(dbManager.getString(resultSet,"UnChgAmmeterQuantity"));
            lwNewFactoryIndicatorBakDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwNewFactoryIndicatorBakDto.setReadDate(dbManager.getString(resultSet,"ReadDate"));
            lwNewFactoryIndicatorBakDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwNewFactoryIndicatorBakDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwNewFactoryIndicatorBakDto.setThisWorkNum(dbManager.getDouble(resultSet,"ThisWorkNum"));
            lwNewFactoryIndicatorBakDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwNewFactoryIndicatorBakDto.setThisIdleNum(dbManager.getDouble(resultSet,"ThisIdleNum"));
            lwNewFactoryIndicatorBakDto.setLastIdleNum(dbManager.getDouble(resultSet,"LastIdleNum"));
            lwNewFactoryIndicatorBakDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwNewFactoryIndicatorBakDto.setReadQuantity(dbManager.getDouble(resultSet,"ReadQuantity"));
            lwNewFactoryIndicatorBakDto.setExcepQuantity(dbManager.getDouble(resultSet,"ExcepQuantity"));
            lwNewFactoryIndicatorBakDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,"ChgAmmeterQuantity"));
            lwNewFactoryIndicatorBakDto.setCompensateQuantity(dbManager.getDouble(resultSet,"CompensateQuantity"));
            lwNewFactoryIndicatorBakDto.setLineLossQuantity(dbManager.getDouble(resultSet,"LineLossQuantity"));
            lwNewFactoryIndicatorBakDto.setTransLossQuantity(dbManager.getDouble(resultSet,"TransLossQuantity"));
            lwNewFactoryIndicatorBakDto.setNeedQuantity(dbManager.getDouble(resultSet,"NeedQuantity"));
            lwNewFactoryIndicatorBakDto.setRongliangQuantity(dbManager.getDouble(resultSet,"RongliangQuantity"));
            lwNewFactoryIndicatorBakDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwNewFactoryIndicatorBakDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwNewFactoryIndicatorBakDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwNewFactoryIndicatorBakDto.setPepoleUnChgAmmeterQuantity(dbManager.getString(resultSet,"PepoleUnChgAmmeterQuantity"));
            lwNewFactoryIndicatorBakDto.setUsername(dbManager.getString(resultSet,"Username"));
            lwNewFactoryIndicatorBakDto.setUnCompensateQuantity(dbManager.getDouble(resultSet,"UnCompensateQuantity"));
            lwNewFactoryIndicatorBakDto.setAmmeterNo(dbManager.getString(resultSet,"AmmeterNo"));
            lwNewFactoryIndicatorBakDto.setAmmeterStyle(dbManager.getString(resultSet,"AmmeterStyle"));
            lwNewFactoryIndicatorBakDto.setWorkQuantity(dbManager.getString(resultSet,"WorkQuantity"));
            lwNewFactoryIndicatorBakDto.setUnworkQuantity(dbManager.getString(resultSet,"UnworkQuantity"));
            lwNewFactoryIndicatorBakDto.setIfChange(dbManager.getString(resultSet,"IfChange"));
            lwNewFactoryIndicatorBakDto.setChangeWorkPointer(dbManager.getDouble(resultSet,"ChangeWorkPointer"));
            lwNewFactoryIndicatorBakDto.setChangeBefore(dbManager.getString(resultSet,"ChangeBefore"));
            lwNewFactoryIndicatorBakDto.setChangeAfter(dbManager.getString(resultSet,"ChangeAfter"));
            lwNewFactoryIndicatorBakDto.setDay(dbManager.getString(resultSet,"Day"));
            lwNewFactoryIndicatorBakDto.setChangeday(dbManager.getString(resultSet,"Changeday"));
            lwNewFactoryIndicatorBakDto.setChangeDate(dbManager.getString(resultSet,"ChangeDate"));
            lwNewFactoryIndicatorBakDto.setChangeUnworkQuantity(dbManager.getString(resultSet,"ChangeUnworkQuantity"));
            lwNewFactoryIndicatorBakDto.setChangeworkQuantity(dbManager.getString(resultSet,"ChangeworkQuantity"));
            lwNewFactoryIndicatorBakDto.setChangeunWorkPointer(dbManager.getDouble(resultSet,"ChangeunWorkPointer"));
            lwNewFactoryIndicatorBakDto.setChageChgAmmeterQuantity(dbManager.getString(resultSet,"ChageChgAmmeterQuantity"));
            lwNewFactoryIndicatorBakDto.setChangeunChgAmmeterQuantity(dbManager.getString(resultSet,"ChangeunChgAmmeterQuantity"));
            lwNewFactoryIndicatorBakDto.setChangeCompensateQuantity(dbManager.getString(resultSet,"ChangeCompensateQuantity"));
            lwNewFactoryIndicatorBakDto.setChangeunCompensateQuantity(dbManager.getString(resultSet,"ChangeunCompensateQuantity"));
            lwNewFactoryIndicatorBakDto.setRlquantityafbefore(dbManager.getDouble(resultSet,"Rlquantityafbefore"));
            lwNewFactoryIndicatorBakDto.setRlquantityaf(dbManager.getDouble(resultSet,"Rlquantityaf"));
            lwNewFactoryIndicatorBakDto.setRlpriceaf(dbManager.getDouble(resultSet,"Rlpriceaf"));
            lwNewFactoryIndicatorBakDto.setChgpriceafflag(dbManager.getString(resultSet,"Chgpriceafflag"));
            collection.add(lwNewFactoryIndicatorBakDto);
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
        buffer.append("DELETE FROM LwNewFactoryIndicatorBak WHERE ");
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
        buffer.append("SELECT count(*) FROM LwNewFactoryIndicatorBak WHERE ");
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
