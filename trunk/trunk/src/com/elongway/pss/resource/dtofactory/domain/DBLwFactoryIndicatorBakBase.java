package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorBakDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWFactoryIndicatorBak-大工业电表指针记录备份表的数据访问对象基类<br>
 */
public class DBLwFactoryIndicatorBakBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwFactoryIndicatorBakBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwFactoryIndicatorBakBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public void insert(LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwFactoryIndicatorBak (");
        buffer.append("UserNo,");
        buffer.append("InputDate,");
        buffer.append("ReadDate,");
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
        buffer.append("PeopleThisWorkNum,");
        buffer.append("PeopleLastWorkNum,");
        buffer.append("PeopleThisIdleNum,");
        buffer.append("PeopleLastIdleNum,");
        buffer.append("PeopleRate,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("PeopleQuantity,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("PepoleUnChgAmmeterQuantity,");
        buffer.append("UserName ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getReadDate()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getThisIdleNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getLastIdleNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getRate()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getReadQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getExcepQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getChgAmmeterQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getLineLossQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getTransLossQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getNeedQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getRongliangQuantity()).append(",");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getValidStatus()).append("',");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getPeopleThisWorkNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getPeopleLastWorkNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getPeopleThisIdleNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getPeopleLastIdleNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getPeopleRate()).append(",");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getRemark()).append("',");
            debugBuffer.append("").append(lwFactoryIndicatorBakDto.getPeopleQuantity()).append(",");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getUnChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorBakDto.getUserName()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwFactoryIndicatorBakDto.getUserNo());
        dbManager.setString(2,lwFactoryIndicatorBakDto.getInputDate());
        dbManager.setString(3,lwFactoryIndicatorBakDto.getReadDate());
        dbManager.setString(4,lwFactoryIndicatorBakDto.getStatMonth());
        dbManager.setDouble(5,lwFactoryIndicatorBakDto.getThisWorkNum());
        dbManager.setDouble(6,lwFactoryIndicatorBakDto.getLastWorkNum());
        dbManager.setDouble(7,lwFactoryIndicatorBakDto.getThisIdleNum());
        dbManager.setDouble(8,lwFactoryIndicatorBakDto.getLastIdleNum());
        dbManager.setDouble(9,lwFactoryIndicatorBakDto.getRate());
        dbManager.setDouble(10,lwFactoryIndicatorBakDto.getReadQuantity());
        dbManager.setDouble(11,lwFactoryIndicatorBakDto.getExcepQuantity());
        dbManager.setDouble(12,lwFactoryIndicatorBakDto.getChgAmmeterQuantity());
        dbManager.setDouble(13,lwFactoryIndicatorBakDto.getCompensateQuantity());
        dbManager.setDouble(14,lwFactoryIndicatorBakDto.getLineLossQuantity());
        dbManager.setDouble(15,lwFactoryIndicatorBakDto.getTransLossQuantity());
        dbManager.setDouble(16,lwFactoryIndicatorBakDto.getNeedQuantity());
        dbManager.setDouble(17,lwFactoryIndicatorBakDto.getRongliangQuantity());
        dbManager.setString(18,lwFactoryIndicatorBakDto.getValidStatus());
        dbManager.setDouble(19,lwFactoryIndicatorBakDto.getPeopleThisWorkNum());
        dbManager.setDouble(20,lwFactoryIndicatorBakDto.getPeopleLastWorkNum());
        dbManager.setDouble(21,lwFactoryIndicatorBakDto.getPeopleThisIdleNum());
        dbManager.setDouble(22,lwFactoryIndicatorBakDto.getPeopleLastIdleNum());
        dbManager.setDouble(23,lwFactoryIndicatorBakDto.getPeopleRate());
        dbManager.setString(24,lwFactoryIndicatorBakDto.getFlag());
        dbManager.setString(25,lwFactoryIndicatorBakDto.getRemark());
        dbManager.setDouble(26,lwFactoryIndicatorBakDto.getPeopleQuantity());
        dbManager.setString(27,lwFactoryIndicatorBakDto.getUnChgAmmeterQuantity());
        dbManager.setString(28,lwFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity());
        dbManager.setString(29,lwFactoryIndicatorBakDto.getUserName());
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
        buffer.append("INSERT INTO LwFactoryIndicatorBak (");
        buffer.append("UserNo,");
        buffer.append("InputDate,");
        buffer.append("ReadDate,");
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
        buffer.append("PeopleThisWorkNum,");
        buffer.append("PeopleLastWorkNum,");
        buffer.append("PeopleThisIdleNum,");
        buffer.append("PeopleLastIdleNum,");
        buffer.append("PeopleRate,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("PeopleQuantity,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("PepoleUnChgAmmeterQuantity,");
        buffer.append("UserName ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto = (LwFactoryIndicatorBakDto)i.next();
            dbManager.setString(1,lwFactoryIndicatorBakDto.getUserNo());
            dbManager.setString(2,lwFactoryIndicatorBakDto.getInputDate());
            dbManager.setString(3,lwFactoryIndicatorBakDto.getReadDate());
            dbManager.setString(4,lwFactoryIndicatorBakDto.getStatMonth());
            dbManager.setDouble(5,lwFactoryIndicatorBakDto.getThisWorkNum());
            dbManager.setDouble(6,lwFactoryIndicatorBakDto.getLastWorkNum());
            dbManager.setDouble(7,lwFactoryIndicatorBakDto.getThisIdleNum());
            dbManager.setDouble(8,lwFactoryIndicatorBakDto.getLastIdleNum());
            dbManager.setDouble(9,lwFactoryIndicatorBakDto.getRate());
            dbManager.setDouble(10,lwFactoryIndicatorBakDto.getReadQuantity());
            dbManager.setDouble(11,lwFactoryIndicatorBakDto.getExcepQuantity());
            dbManager.setDouble(12,lwFactoryIndicatorBakDto.getChgAmmeterQuantity());
            dbManager.setDouble(13,lwFactoryIndicatorBakDto.getCompensateQuantity());
            dbManager.setDouble(14,lwFactoryIndicatorBakDto.getLineLossQuantity());
            dbManager.setDouble(15,lwFactoryIndicatorBakDto.getTransLossQuantity());
            dbManager.setDouble(16,lwFactoryIndicatorBakDto.getNeedQuantity());
            dbManager.setDouble(17,lwFactoryIndicatorBakDto.getRongliangQuantity());
            dbManager.setString(18,lwFactoryIndicatorBakDto.getValidStatus());
            dbManager.setDouble(19,lwFactoryIndicatorBakDto.getPeopleThisWorkNum());
            dbManager.setDouble(20,lwFactoryIndicatorBakDto.getPeopleLastWorkNum());
            dbManager.setDouble(21,lwFactoryIndicatorBakDto.getPeopleThisIdleNum());
            dbManager.setDouble(22,lwFactoryIndicatorBakDto.getPeopleLastIdleNum());
            dbManager.setDouble(23,lwFactoryIndicatorBakDto.getPeopleRate());
            dbManager.setString(24,lwFactoryIndicatorBakDto.getFlag());
            dbManager.setString(25,lwFactoryIndicatorBakDto.getRemark());
            dbManager.setDouble(26,lwFactoryIndicatorBakDto.getPeopleQuantity());
            dbManager.setString(27,lwFactoryIndicatorBakDto.getUnChgAmmeterQuantity());
            dbManager.setString(28,lwFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity());
            dbManager.setString(29,lwFactoryIndicatorBakDto.getUserName());
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
        buffer.append("DELETE FROM LwFactoryIndicatorBak ");
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
     * @param lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public void update(LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwFactoryIndicatorBak SET ");
        buffer.append("InputDate = ?, ");
        buffer.append("ReadDate = ?, ");
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
        buffer.append("PeopleThisWorkNum = ?, ");
        buffer.append("PeopleLastWorkNum = ?, ");
        buffer.append("PeopleThisIdleNum = ?, ");
        buffer.append("PeopleLastIdleNum = ?, ");
        buffer.append("PeopleRate = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("PeopleQuantity = ?, ");
        buffer.append("UnChgAmmeterQuantity = ?, ");
        buffer.append("PepoleUnChgAmmeterQuantity = ?, ");
        buffer.append("UserName = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwFactoryIndicatorBak SET ");
            debugBuffer.append("InputDate = '" + lwFactoryIndicatorBakDto.getInputDate() + "', ");
            debugBuffer.append("ReadDate = '" + lwFactoryIndicatorBakDto.getReadDate() + "', ");
            debugBuffer.append("ThisWorkNum = " + lwFactoryIndicatorBakDto.getThisWorkNum() + ", ");
            debugBuffer.append("LastWorkNum = " + lwFactoryIndicatorBakDto.getLastWorkNum() + ", ");
            debugBuffer.append("ThisIdleNum = " + lwFactoryIndicatorBakDto.getThisIdleNum() + ", ");
            debugBuffer.append("LastIdleNum = " + lwFactoryIndicatorBakDto.getLastIdleNum() + ", ");
            debugBuffer.append("Rate = " + lwFactoryIndicatorBakDto.getRate() + ", ");
            debugBuffer.append("ReadQuantity = " + lwFactoryIndicatorBakDto.getReadQuantity() + ", ");
            debugBuffer.append("ExcepQuantity = " + lwFactoryIndicatorBakDto.getExcepQuantity() + ", ");
            debugBuffer.append("ChgAmmeterQuantity = " + lwFactoryIndicatorBakDto.getChgAmmeterQuantity() + ", ");
            debugBuffer.append("CompensateQuantity = " + lwFactoryIndicatorBakDto.getCompensateQuantity() + ", ");
            debugBuffer.append("LineLossQuantity = " + lwFactoryIndicatorBakDto.getLineLossQuantity() + ", ");
            debugBuffer.append("TransLossQuantity = " + lwFactoryIndicatorBakDto.getTransLossQuantity() + ", ");
            debugBuffer.append("NeedQuantity = " + lwFactoryIndicatorBakDto.getNeedQuantity() + ", ");
            debugBuffer.append("RongliangQuantity = " + lwFactoryIndicatorBakDto.getRongliangQuantity() + ", ");
            debugBuffer.append("ValidStatus = '" + lwFactoryIndicatorBakDto.getValidStatus() + "', ");
            debugBuffer.append("PeopleThisWorkNum = " + lwFactoryIndicatorBakDto.getPeopleThisWorkNum() + ", ");
            debugBuffer.append("PeopleLastWorkNum = " + lwFactoryIndicatorBakDto.getPeopleLastWorkNum() + ", ");
            debugBuffer.append("PeopleThisIdleNum = " + lwFactoryIndicatorBakDto.getPeopleThisIdleNum() + ", ");
            debugBuffer.append("PeopleLastIdleNum = " + lwFactoryIndicatorBakDto.getPeopleLastIdleNum() + ", ");
            debugBuffer.append("PeopleRate = " + lwFactoryIndicatorBakDto.getPeopleRate() + ", ");
            debugBuffer.append("Flag = '" + lwFactoryIndicatorBakDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwFactoryIndicatorBakDto.getRemark() + "', ");
            debugBuffer.append("PeopleQuantity = " + lwFactoryIndicatorBakDto.getPeopleQuantity() + ", ");
            debugBuffer.append("UnChgAmmeterQuantity = '" + lwFactoryIndicatorBakDto.getUnChgAmmeterQuantity() + "', ");
            debugBuffer.append("PepoleUnChgAmmeterQuantity = '" + lwFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity() + "', ");
            debugBuffer.append("UserName = '" + lwFactoryIndicatorBakDto.getUserName() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwFactoryIndicatorBakDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwFactoryIndicatorBakDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwFactoryIndicatorBakDto.getInputDate());
        dbManager.setString(2,lwFactoryIndicatorBakDto.getReadDate());
        dbManager.setDouble(3,lwFactoryIndicatorBakDto.getThisWorkNum());
        dbManager.setDouble(4,lwFactoryIndicatorBakDto.getLastWorkNum());
        dbManager.setDouble(5,lwFactoryIndicatorBakDto.getThisIdleNum());
        dbManager.setDouble(6,lwFactoryIndicatorBakDto.getLastIdleNum());
        dbManager.setDouble(7,lwFactoryIndicatorBakDto.getRate());
        dbManager.setDouble(8,lwFactoryIndicatorBakDto.getReadQuantity());
        dbManager.setDouble(9,lwFactoryIndicatorBakDto.getExcepQuantity());
        dbManager.setDouble(10,lwFactoryIndicatorBakDto.getChgAmmeterQuantity());
        dbManager.setDouble(11,lwFactoryIndicatorBakDto.getCompensateQuantity());
        dbManager.setDouble(12,lwFactoryIndicatorBakDto.getLineLossQuantity());
        dbManager.setDouble(13,lwFactoryIndicatorBakDto.getTransLossQuantity());
        dbManager.setDouble(14,lwFactoryIndicatorBakDto.getNeedQuantity());
        dbManager.setDouble(15,lwFactoryIndicatorBakDto.getRongliangQuantity());
        dbManager.setString(16,lwFactoryIndicatorBakDto.getValidStatus());
        dbManager.setDouble(17,lwFactoryIndicatorBakDto.getPeopleThisWorkNum());
        dbManager.setDouble(18,lwFactoryIndicatorBakDto.getPeopleLastWorkNum());
        dbManager.setDouble(19,lwFactoryIndicatorBakDto.getPeopleThisIdleNum());
        dbManager.setDouble(20,lwFactoryIndicatorBakDto.getPeopleLastIdleNum());
        dbManager.setDouble(21,lwFactoryIndicatorBakDto.getPeopleRate());
        dbManager.setString(22,lwFactoryIndicatorBakDto.getFlag());
        dbManager.setString(23,lwFactoryIndicatorBakDto.getRemark());
        dbManager.setDouble(24,lwFactoryIndicatorBakDto.getPeopleQuantity());
        dbManager.setString(25,lwFactoryIndicatorBakDto.getUnChgAmmeterQuantity());
        dbManager.setString(26,lwFactoryIndicatorBakDto.getPepoleUnChgAmmeterQuantity());
        dbManager.setString(27,lwFactoryIndicatorBakDto.getUserName());
        //设置条件字段;
        dbManager.setString(28,lwFactoryIndicatorBakDto.getUserNo());
        dbManager.setString(29,lwFactoryIndicatorBakDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 帐期
     * @return LwFactoryIndicatorBakDto
     * @throws Exception
     */
    public LwFactoryIndicatorBakDto findByPrimaryKey(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("InputDate,");
        buffer.append("ReadDate,");
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
        buffer.append("PeopleThisWorkNum,");
        buffer.append("PeopleLastWorkNum,");
        buffer.append("PeopleThisIdleNum,");
        buffer.append("PeopleLastIdleNum,");
        buffer.append("PeopleRate,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("PeopleQuantity,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("PepoleUnChgAmmeterQuantity,");
        buffer.append("UserName ");
        buffer.append("FROM LwFactoryIndicatorBak ");
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
        LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto = null;
        if(resultSet.next()){
            lwFactoryIndicatorBakDto = new LwFactoryIndicatorBakDto();
            lwFactoryIndicatorBakDto.setUserNo(dbManager.getString(resultSet,1));
            lwFactoryIndicatorBakDto.setInputDate(dbManager.getString(resultSet,2));
            lwFactoryIndicatorBakDto.setReadDate(dbManager.getString(resultSet,3));
            lwFactoryIndicatorBakDto.setStatMonth(dbManager.getString(resultSet,4));
            lwFactoryIndicatorBakDto.setThisWorkNum(dbManager.getDouble(resultSet,5));
            lwFactoryIndicatorBakDto.setLastWorkNum(dbManager.getDouble(resultSet,6));
            lwFactoryIndicatorBakDto.setThisIdleNum(dbManager.getDouble(resultSet,7));
            lwFactoryIndicatorBakDto.setLastIdleNum(dbManager.getDouble(resultSet,8));
            lwFactoryIndicatorBakDto.setRate(dbManager.getDouble(resultSet,9));
            lwFactoryIndicatorBakDto.setReadQuantity(dbManager.getDouble(resultSet,10));
            lwFactoryIndicatorBakDto.setExcepQuantity(dbManager.getDouble(resultSet,11));
            lwFactoryIndicatorBakDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,12));
            lwFactoryIndicatorBakDto.setCompensateQuantity(dbManager.getDouble(resultSet,13));
            lwFactoryIndicatorBakDto.setLineLossQuantity(dbManager.getDouble(resultSet,14));
            lwFactoryIndicatorBakDto.setTransLossQuantity(dbManager.getDouble(resultSet,15));
            lwFactoryIndicatorBakDto.setNeedQuantity(dbManager.getDouble(resultSet,16));
            lwFactoryIndicatorBakDto.setRongliangQuantity(dbManager.getDouble(resultSet,17));
            lwFactoryIndicatorBakDto.setValidStatus(dbManager.getString(resultSet,18));
            lwFactoryIndicatorBakDto.setPeopleThisWorkNum(dbManager.getDouble(resultSet,19));
            lwFactoryIndicatorBakDto.setPeopleLastWorkNum(dbManager.getDouble(resultSet,20));
            lwFactoryIndicatorBakDto.setPeopleThisIdleNum(dbManager.getDouble(resultSet,21));
            lwFactoryIndicatorBakDto.setPeopleLastIdleNum(dbManager.getDouble(resultSet,22));
            lwFactoryIndicatorBakDto.setPeopleRate(dbManager.getDouble(resultSet,23));
            lwFactoryIndicatorBakDto.setFlag(dbManager.getString(resultSet,24));
            lwFactoryIndicatorBakDto.setRemark(dbManager.getString(resultSet,25));
            lwFactoryIndicatorBakDto.setPeopleQuantity(dbManager.getDouble(resultSet,26));
            lwFactoryIndicatorBakDto.setUnChgAmmeterQuantity(dbManager.getString(resultSet,27));
            lwFactoryIndicatorBakDto.setPepoleUnChgAmmeterQuantity(dbManager.getString(resultSet,28));
            lwFactoryIndicatorBakDto.setUserName(dbManager.getString(resultSet,29));
        }
        resultSet.close();
        return lwFactoryIndicatorBakDto;
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
        buffer.append("InputDate,");
        buffer.append("ReadDate,");
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
        buffer.append("PeopleThisWorkNum,");
        buffer.append("PeopleLastWorkNum,");
        buffer.append("PeopleThisIdleNum,");
        buffer.append("PeopleLastIdleNum,");
        buffer.append("PeopleRate,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("PeopleQuantity,");
        buffer.append("UnChgAmmeterQuantity,");
        buffer.append("PepoleUnChgAmmeterQuantity,");
        buffer.append("UserName ");
        buffer.append("FROM LwFactoryIndicatorBak WHERE ");
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
        LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwFactoryIndicatorBakDto = new LwFactoryIndicatorBakDto();
            lwFactoryIndicatorBakDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwFactoryIndicatorBakDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwFactoryIndicatorBakDto.setReadDate(dbManager.getString(resultSet,"ReadDate"));
            lwFactoryIndicatorBakDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwFactoryIndicatorBakDto.setThisWorkNum(dbManager.getDouble(resultSet,"ThisWorkNum"));
            lwFactoryIndicatorBakDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwFactoryIndicatorBakDto.setThisIdleNum(dbManager.getDouble(resultSet,"ThisIdleNum"));
            lwFactoryIndicatorBakDto.setLastIdleNum(dbManager.getDouble(resultSet,"LastIdleNum"));
            lwFactoryIndicatorBakDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwFactoryIndicatorBakDto.setReadQuantity(dbManager.getDouble(resultSet,"ReadQuantity"));
            lwFactoryIndicatorBakDto.setExcepQuantity(dbManager.getDouble(resultSet,"ExcepQuantity"));
            lwFactoryIndicatorBakDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,"ChgAmmeterQuantity"));
            lwFactoryIndicatorBakDto.setCompensateQuantity(dbManager.getDouble(resultSet,"CompensateQuantity"));
            lwFactoryIndicatorBakDto.setLineLossQuantity(dbManager.getDouble(resultSet,"LineLossQuantity"));
            lwFactoryIndicatorBakDto.setTransLossQuantity(dbManager.getDouble(resultSet,"TransLossQuantity"));
            lwFactoryIndicatorBakDto.setNeedQuantity(dbManager.getDouble(resultSet,"NeedQuantity"));
            lwFactoryIndicatorBakDto.setRongliangQuantity(dbManager.getDouble(resultSet,"RongliangQuantity"));
            lwFactoryIndicatorBakDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwFactoryIndicatorBakDto.setPeopleThisWorkNum(dbManager.getDouble(resultSet,"PeopleThisWorkNum"));
            lwFactoryIndicatorBakDto.setPeopleLastWorkNum(dbManager.getDouble(resultSet,"PeopleLastWorkNum"));
            lwFactoryIndicatorBakDto.setPeopleThisIdleNum(dbManager.getDouble(resultSet,"PeopleThisIdleNum"));
            lwFactoryIndicatorBakDto.setPeopleLastIdleNum(dbManager.getDouble(resultSet,"PeopleLastIdleNum"));
            lwFactoryIndicatorBakDto.setPeopleRate(dbManager.getDouble(resultSet,"PeopleRate"));
            lwFactoryIndicatorBakDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwFactoryIndicatorBakDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwFactoryIndicatorBakDto.setPeopleQuantity(dbManager.getDouble(resultSet,"PeopleQuantity"));
            lwFactoryIndicatorBakDto.setUnChgAmmeterQuantity(dbManager.getString(resultSet,"UnChgAmmeterQuantity"));
            lwFactoryIndicatorBakDto.setPepoleUnChgAmmeterQuantity(dbManager.getString(resultSet,"PepoleUnChgAmmeterQuantity"));
            lwFactoryIndicatorBakDto.setUserName(dbManager.getString(resultSet,"UserName"));
            collection.add(lwFactoryIndicatorBakDto);
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
        buffer.append("DELETE FROM LwFactoryIndicatorBak WHERE ");
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
        buffer.append("SELECT count(*) FROM LwFactoryIndicatorBak WHERE ");
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
