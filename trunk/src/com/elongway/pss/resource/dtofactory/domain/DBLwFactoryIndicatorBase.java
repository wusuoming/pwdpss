package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWFactoryIndicator-大工业电表指针记录表的数据访问对象基类<br>
 */
public class DBLwFactoryIndicatorBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwFactoryIndicatorBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwFactoryIndicatorBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwFactoryIndicatorDto lwFactoryIndicatorDto
     * @throws Exception
     */
    public void insert(LwFactoryIndicatorDto lwFactoryIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwFactoryIndicator (");
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
        buffer.append("Username ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getReadDate()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getThisIdleNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getLastIdleNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getRate()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getReadQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getExcepQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getChgAmmeterQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getLineLossQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getTransLossQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getNeedQuantity()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getRongliangQuantity()).append(",");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getValidStatus()).append("',");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getPeopleThisWorkNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getPeopleLastWorkNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getPeopleThisIdleNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getPeopleLastIdleNum()).append(",");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getPeopleRate()).append(",");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getRemark()).append("',");
            debugBuffer.append("").append(lwFactoryIndicatorDto.getPeopleQuantity()).append(",");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getUnChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity()).append("',");
            debugBuffer.append("'").append(lwFactoryIndicatorDto.getUsername()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwFactoryIndicatorDto.getUserNo());
        dbManager.setString(2,lwFactoryIndicatorDto.getReadDate());
        dbManager.setString(3,lwFactoryIndicatorDto.getInputDate());
        dbManager.setString(4,lwFactoryIndicatorDto.getStatMonth());
        dbManager.setDouble(5,lwFactoryIndicatorDto.getThisWorkNum());
        dbManager.setDouble(6,lwFactoryIndicatorDto.getLastWorkNum());
        dbManager.setDouble(7,lwFactoryIndicatorDto.getThisIdleNum());
        dbManager.setDouble(8,lwFactoryIndicatorDto.getLastIdleNum());
        dbManager.setDouble(9,lwFactoryIndicatorDto.getRate());
        dbManager.setDouble(10,lwFactoryIndicatorDto.getReadQuantity());
        dbManager.setDouble(11,lwFactoryIndicatorDto.getExcepQuantity());
        dbManager.setDouble(12,lwFactoryIndicatorDto.getChgAmmeterQuantity());
        dbManager.setDouble(13,lwFactoryIndicatorDto.getCompensateQuantity());
        dbManager.setDouble(14,lwFactoryIndicatorDto.getLineLossQuantity());
        dbManager.setDouble(15,lwFactoryIndicatorDto.getTransLossQuantity());
        dbManager.setDouble(16,lwFactoryIndicatorDto.getNeedQuantity());
        dbManager.setDouble(17,lwFactoryIndicatorDto.getRongliangQuantity());
        dbManager.setString(18,lwFactoryIndicatorDto.getValidStatus());
        dbManager.setDouble(19,lwFactoryIndicatorDto.getPeopleThisWorkNum());
        dbManager.setDouble(20,lwFactoryIndicatorDto.getPeopleLastWorkNum());
        dbManager.setDouble(21,lwFactoryIndicatorDto.getPeopleThisIdleNum());
        dbManager.setDouble(22,lwFactoryIndicatorDto.getPeopleLastIdleNum());
        dbManager.setDouble(23,lwFactoryIndicatorDto.getPeopleRate());
        dbManager.setString(24,lwFactoryIndicatorDto.getFlag());
        dbManager.setString(25,lwFactoryIndicatorDto.getRemark());
        dbManager.setDouble(26,lwFactoryIndicatorDto.getPeopleQuantity());
        dbManager.setString(27,lwFactoryIndicatorDto.getUnChgAmmeterQuantity());
        dbManager.setString(28,lwFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity());
        dbManager.setString(29,lwFactoryIndicatorDto.getUsername());
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
        buffer.append("INSERT INTO LwFactoryIndicator (");
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
        buffer.append("Username ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwFactoryIndicatorDto lwFactoryIndicatorDto = (LwFactoryIndicatorDto)i.next();
            dbManager.setString(1,lwFactoryIndicatorDto.getUserNo());
            dbManager.setString(2,lwFactoryIndicatorDto.getReadDate());
            dbManager.setString(3,lwFactoryIndicatorDto.getInputDate());
            dbManager.setString(4,lwFactoryIndicatorDto.getStatMonth());
            dbManager.setDouble(5,lwFactoryIndicatorDto.getThisWorkNum());
            dbManager.setDouble(6,lwFactoryIndicatorDto.getLastWorkNum());
            dbManager.setDouble(7,lwFactoryIndicatorDto.getThisIdleNum());
            dbManager.setDouble(8,lwFactoryIndicatorDto.getLastIdleNum());
            dbManager.setDouble(9,lwFactoryIndicatorDto.getRate());
            dbManager.setDouble(10,lwFactoryIndicatorDto.getReadQuantity());
            dbManager.setDouble(11,lwFactoryIndicatorDto.getExcepQuantity());
            dbManager.setDouble(12,lwFactoryIndicatorDto.getChgAmmeterQuantity());
            dbManager.setDouble(13,lwFactoryIndicatorDto.getCompensateQuantity());
            dbManager.setDouble(14,lwFactoryIndicatorDto.getLineLossQuantity());
            dbManager.setDouble(15,lwFactoryIndicatorDto.getTransLossQuantity());
            dbManager.setDouble(16,lwFactoryIndicatorDto.getNeedQuantity());
            dbManager.setDouble(17,lwFactoryIndicatorDto.getRongliangQuantity());
            dbManager.setString(18,lwFactoryIndicatorDto.getValidStatus());
            dbManager.setDouble(19,lwFactoryIndicatorDto.getPeopleThisWorkNum());
            dbManager.setDouble(20,lwFactoryIndicatorDto.getPeopleLastWorkNum());
            dbManager.setDouble(21,lwFactoryIndicatorDto.getPeopleThisIdleNum());
            dbManager.setDouble(22,lwFactoryIndicatorDto.getPeopleLastIdleNum());
            dbManager.setDouble(23,lwFactoryIndicatorDto.getPeopleRate());
            dbManager.setString(24,lwFactoryIndicatorDto.getFlag());
            dbManager.setString(25,lwFactoryIndicatorDto.getRemark());
            dbManager.setDouble(26,lwFactoryIndicatorDto.getPeopleQuantity());
            dbManager.setString(27,lwFactoryIndicatorDto.getUnChgAmmeterQuantity());
            dbManager.setString(28,lwFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity());
            dbManager.setString(29,lwFactoryIndicatorDto.getUsername());
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
        buffer.append("DELETE FROM LwFactoryIndicator ");
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
     * @param lwFactoryIndicatorDto lwFactoryIndicatorDto
     * @throws Exception
     */
    public void update(LwFactoryIndicatorDto lwFactoryIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwFactoryIndicator SET ");
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
        buffer.append("Username = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwFactoryIndicator SET ");
            debugBuffer.append("ReadDate = '" + lwFactoryIndicatorDto.getReadDate() + "', ");
            debugBuffer.append("InputDate = '" + lwFactoryIndicatorDto.getInputDate() + "', ");
            debugBuffer.append("ThisWorkNum = " + lwFactoryIndicatorDto.getThisWorkNum() + ", ");
            debugBuffer.append("LastWorkNum = " + lwFactoryIndicatorDto.getLastWorkNum() + ", ");
            debugBuffer.append("ThisIdleNum = " + lwFactoryIndicatorDto.getThisIdleNum() + ", ");
            debugBuffer.append("LastIdleNum = " + lwFactoryIndicatorDto.getLastIdleNum() + ", ");
            debugBuffer.append("Rate = " + lwFactoryIndicatorDto.getRate() + ", ");
            debugBuffer.append("ReadQuantity = " + lwFactoryIndicatorDto.getReadQuantity() + ", ");
            debugBuffer.append("ExcepQuantity = " + lwFactoryIndicatorDto.getExcepQuantity() + ", ");
            debugBuffer.append("ChgAmmeterQuantity = " + lwFactoryIndicatorDto.getChgAmmeterQuantity() + ", ");
            debugBuffer.append("CompensateQuantity = " + lwFactoryIndicatorDto.getCompensateQuantity() + ", ");
            debugBuffer.append("LineLossQuantity = " + lwFactoryIndicatorDto.getLineLossQuantity() + ", ");
            debugBuffer.append("TransLossQuantity = " + lwFactoryIndicatorDto.getTransLossQuantity() + ", ");
            debugBuffer.append("NeedQuantity = " + lwFactoryIndicatorDto.getNeedQuantity() + ", ");
            debugBuffer.append("RongliangQuantity = " + lwFactoryIndicatorDto.getRongliangQuantity() + ", ");
            debugBuffer.append("ValidStatus = '" + lwFactoryIndicatorDto.getValidStatus() + "', ");
            debugBuffer.append("PeopleThisWorkNum = " + lwFactoryIndicatorDto.getPeopleThisWorkNum() + ", ");
            debugBuffer.append("PeopleLastWorkNum = " + lwFactoryIndicatorDto.getPeopleLastWorkNum() + ", ");
            debugBuffer.append("PeopleThisIdleNum = " + lwFactoryIndicatorDto.getPeopleThisIdleNum() + ", ");
            debugBuffer.append("PeopleLastIdleNum = " + lwFactoryIndicatorDto.getPeopleLastIdleNum() + ", ");
            debugBuffer.append("PeopleRate = " + lwFactoryIndicatorDto.getPeopleRate() + ", ");
            debugBuffer.append("Flag = '" + lwFactoryIndicatorDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwFactoryIndicatorDto.getRemark() + "', ");
            debugBuffer.append("PeopleQuantity = " + lwFactoryIndicatorDto.getPeopleQuantity() + ", ");
            debugBuffer.append("UnChgAmmeterQuantity = '" + lwFactoryIndicatorDto.getUnChgAmmeterQuantity() + "', ");
            debugBuffer.append("PepoleUnChgAmmeterQuantity = '" + lwFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity() + "', ");
            debugBuffer.append("Username = '" + lwFactoryIndicatorDto.getUsername() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwFactoryIndicatorDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwFactoryIndicatorDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwFactoryIndicatorDto.getReadDate());
        dbManager.setString(2,lwFactoryIndicatorDto.getInputDate());
        dbManager.setDouble(3,lwFactoryIndicatorDto.getThisWorkNum());
        dbManager.setDouble(4,lwFactoryIndicatorDto.getLastWorkNum());
        dbManager.setDouble(5,lwFactoryIndicatorDto.getThisIdleNum());
        dbManager.setDouble(6,lwFactoryIndicatorDto.getLastIdleNum());
        dbManager.setDouble(7,lwFactoryIndicatorDto.getRate());
        dbManager.setDouble(8,lwFactoryIndicatorDto.getReadQuantity());
        dbManager.setDouble(9,lwFactoryIndicatorDto.getExcepQuantity());
        dbManager.setDouble(10,lwFactoryIndicatorDto.getChgAmmeterQuantity());
        dbManager.setDouble(11,lwFactoryIndicatorDto.getCompensateQuantity());
        dbManager.setDouble(12,lwFactoryIndicatorDto.getLineLossQuantity());
        dbManager.setDouble(13,lwFactoryIndicatorDto.getTransLossQuantity());
        dbManager.setDouble(14,lwFactoryIndicatorDto.getNeedQuantity());
        dbManager.setDouble(15,lwFactoryIndicatorDto.getRongliangQuantity());
        dbManager.setString(16,lwFactoryIndicatorDto.getValidStatus());
        dbManager.setDouble(17,lwFactoryIndicatorDto.getPeopleThisWorkNum());
        dbManager.setDouble(18,lwFactoryIndicatorDto.getPeopleLastWorkNum());
        dbManager.setDouble(19,lwFactoryIndicatorDto.getPeopleThisIdleNum());
        dbManager.setDouble(20,lwFactoryIndicatorDto.getPeopleLastIdleNum());
        dbManager.setDouble(21,lwFactoryIndicatorDto.getPeopleRate());
        dbManager.setString(22,lwFactoryIndicatorDto.getFlag());
        dbManager.setString(23,lwFactoryIndicatorDto.getRemark());
        dbManager.setDouble(24,lwFactoryIndicatorDto.getPeopleQuantity());
        dbManager.setString(25,lwFactoryIndicatorDto.getUnChgAmmeterQuantity());
        dbManager.setString(26,lwFactoryIndicatorDto.getPepoleUnChgAmmeterQuantity());
        dbManager.setString(27,lwFactoryIndicatorDto.getUsername());
        //设置条件字段;
        dbManager.setString(28,lwFactoryIndicatorDto.getUserNo());
        dbManager.setString(29,lwFactoryIndicatorDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 帐期
     * @return LwFactoryIndicatorDto
     * @throws Exception
     */
    public LwFactoryIndicatorDto findByPrimaryKey(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
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
        buffer.append("Username ");
        buffer.append("FROM LwFactoryIndicator ");
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
        LwFactoryIndicatorDto lwFactoryIndicatorDto = null;
        if(resultSet.next()){
            lwFactoryIndicatorDto = new LwFactoryIndicatorDto();
            lwFactoryIndicatorDto.setUserNo(dbManager.getString(resultSet,1));
            lwFactoryIndicatorDto.setReadDate(dbManager.getString(resultSet,2));
            lwFactoryIndicatorDto.setInputDate(dbManager.getString(resultSet,3));
            lwFactoryIndicatorDto.setStatMonth(dbManager.getString(resultSet,4));
            lwFactoryIndicatorDto.setThisWorkNum(dbManager.getDouble(resultSet,5));
            lwFactoryIndicatorDto.setLastWorkNum(dbManager.getDouble(resultSet,6));
            lwFactoryIndicatorDto.setThisIdleNum(dbManager.getDouble(resultSet,7));
            lwFactoryIndicatorDto.setLastIdleNum(dbManager.getDouble(resultSet,8));
            lwFactoryIndicatorDto.setRate(dbManager.getDouble(resultSet,9));
            lwFactoryIndicatorDto.setReadQuantity(dbManager.getDouble(resultSet,10));
            lwFactoryIndicatorDto.setExcepQuantity(dbManager.getDouble(resultSet,11));
            lwFactoryIndicatorDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,12));
            lwFactoryIndicatorDto.setCompensateQuantity(dbManager.getDouble(resultSet,13));
            lwFactoryIndicatorDto.setLineLossQuantity(dbManager.getDouble(resultSet,14));
            lwFactoryIndicatorDto.setTransLossQuantity(dbManager.getDouble(resultSet,15));
            lwFactoryIndicatorDto.setNeedQuantity(dbManager.getDouble(resultSet,16));
            lwFactoryIndicatorDto.setRongliangQuantity(dbManager.getDouble(resultSet,17));
            lwFactoryIndicatorDto.setValidStatus(dbManager.getString(resultSet,18));
            lwFactoryIndicatorDto.setPeopleThisWorkNum(dbManager.getDouble(resultSet,19));
            lwFactoryIndicatorDto.setPeopleLastWorkNum(dbManager.getDouble(resultSet,20));
            lwFactoryIndicatorDto.setPeopleThisIdleNum(dbManager.getDouble(resultSet,21));
            lwFactoryIndicatorDto.setPeopleLastIdleNum(dbManager.getDouble(resultSet,22));
            lwFactoryIndicatorDto.setPeopleRate(dbManager.getDouble(resultSet,23));
            lwFactoryIndicatorDto.setFlag(dbManager.getString(resultSet,24));
            lwFactoryIndicatorDto.setRemark(dbManager.getString(resultSet,25));
            lwFactoryIndicatorDto.setPeopleQuantity(dbManager.getDouble(resultSet,26));
            lwFactoryIndicatorDto.setUnChgAmmeterQuantity(dbManager.getString(resultSet,27));
            lwFactoryIndicatorDto.setPepoleUnChgAmmeterQuantity(dbManager.getString(resultSet,28));
            lwFactoryIndicatorDto.setUsername(dbManager.getString(resultSet,29));
        }
        resultSet.close();
        return lwFactoryIndicatorDto;
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
        buffer.append("Username ");
        buffer.append("FROM LwFactoryIndicator WHERE ");
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
        LwFactoryIndicatorDto lwFactoryIndicatorDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwFactoryIndicatorDto = new LwFactoryIndicatorDto();
            lwFactoryIndicatorDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwFactoryIndicatorDto.setReadDate(dbManager.getString(resultSet,"ReadDate"));
            lwFactoryIndicatorDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwFactoryIndicatorDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwFactoryIndicatorDto.setThisWorkNum(dbManager.getDouble(resultSet,"ThisWorkNum"));
            lwFactoryIndicatorDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwFactoryIndicatorDto.setThisIdleNum(dbManager.getDouble(resultSet,"ThisIdleNum"));
            lwFactoryIndicatorDto.setLastIdleNum(dbManager.getDouble(resultSet,"LastIdleNum"));
            lwFactoryIndicatorDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwFactoryIndicatorDto.setReadQuantity(dbManager.getDouble(resultSet,"ReadQuantity"));
            lwFactoryIndicatorDto.setExcepQuantity(dbManager.getDouble(resultSet,"ExcepQuantity"));
            lwFactoryIndicatorDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,"ChgAmmeterQuantity"));
            lwFactoryIndicatorDto.setCompensateQuantity(dbManager.getDouble(resultSet,"CompensateQuantity"));
            lwFactoryIndicatorDto.setLineLossQuantity(dbManager.getDouble(resultSet,"LineLossQuantity"));
            lwFactoryIndicatorDto.setTransLossQuantity(dbManager.getDouble(resultSet,"TransLossQuantity"));
            lwFactoryIndicatorDto.setNeedQuantity(dbManager.getDouble(resultSet,"NeedQuantity"));
            lwFactoryIndicatorDto.setRongliangQuantity(dbManager.getDouble(resultSet,"RongliangQuantity"));
            lwFactoryIndicatorDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwFactoryIndicatorDto.setPeopleThisWorkNum(dbManager.getDouble(resultSet,"PeopleThisWorkNum"));
            lwFactoryIndicatorDto.setPeopleLastWorkNum(dbManager.getDouble(resultSet,"PeopleLastWorkNum"));
            lwFactoryIndicatorDto.setPeopleThisIdleNum(dbManager.getDouble(resultSet,"PeopleThisIdleNum"));
            lwFactoryIndicatorDto.setPeopleLastIdleNum(dbManager.getDouble(resultSet,"PeopleLastIdleNum"));
            lwFactoryIndicatorDto.setPeopleRate(dbManager.getDouble(resultSet,"PeopleRate"));
            lwFactoryIndicatorDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwFactoryIndicatorDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwFactoryIndicatorDto.setPeopleQuantity(dbManager.getDouble(resultSet,"PeopleQuantity"));
            lwFactoryIndicatorDto.setUnChgAmmeterQuantity(dbManager.getString(resultSet,"UnChgAmmeterQuantity"));
            lwFactoryIndicatorDto.setPepoleUnChgAmmeterQuantity(dbManager.getString(resultSet,"PepoleUnChgAmmeterQuantity"));
            lwFactoryIndicatorDto.setUsername(dbManager.getString(resultSet,"Username"));
            collection.add(lwFactoryIndicatorDto);
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
        buffer.append("DELETE FROM LwFactoryIndicator WHERE ");
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
        buffer.append("SELECT count(*) FROM LwFactoryIndicator WHERE ");
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
