package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownIndicator-直供乡电表指针记录表的数据访问对象基类<br>
 */
public class DBLwTownIndicatorBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwTownIndicatorBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownIndicatorBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public void insert(LwTownIndicatorDto lwTownIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwTownIndicator (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("ReadDate,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("MidWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("AppendCalQuantity,");
        buffer.append("TranferLossQuantity,");
        buffer.append("PeoplePrice,");
        buffer.append("NotPeoplePrice,");
        buffer.append("FarmPrice,");
        buffer.append("ProducePrice,");
        buffer.append("BusinessPrice,");
        buffer.append("Voltlevel,");
        buffer.append("IndustryPrice,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("InputDate ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwTownIndicatorDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorDto.getAddress()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorDto.getReadDate()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwTownIndicatorDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getMidWorkNum()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getRate()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getReadQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getExcepQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getChgAmmeterQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getAppendCalQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getTranferLossQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getNotPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getFarmPrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getProducePrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getBusinessPrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getVoltlevel()).append(",");
            debugBuffer.append("").append(lwTownIndicatorDto.getIndustryPrice()).append(",");
            debugBuffer.append("'").append(lwTownIndicatorDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorDto.getInputDate()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwTownIndicatorDto.getUserNo());
        dbManager.setString(2,lwTownIndicatorDto.getUserName());
        dbManager.setString(3,lwTownIndicatorDto.getAddress());
        dbManager.setString(4,lwTownIndicatorDto.getReadDate());
        dbManager.setString(5,lwTownIndicatorDto.getStatMonth());
        dbManager.setDouble(6,lwTownIndicatorDto.getThisWorkNum());
        dbManager.setDouble(7,lwTownIndicatorDto.getMidWorkNum());
        dbManager.setDouble(8,lwTownIndicatorDto.getLastWorkNum());
        dbManager.setDouble(9,lwTownIndicatorDto.getRate());
        dbManager.setDouble(10,lwTownIndicatorDto.getReadQuantity());
        dbManager.setDouble(11,lwTownIndicatorDto.getExcepQuantity());
        dbManager.setDouble(12,lwTownIndicatorDto.getChgAmmeterQuantity());
        dbManager.setDouble(13,lwTownIndicatorDto.getCompensateQuantity());
        dbManager.setLong(14,lwTownIndicatorDto.getAppendCalQuantity());
        dbManager.setLong(15,lwTownIndicatorDto.getTranferLossQuantity());
        dbManager.setDouble(16,lwTownIndicatorDto.getPeoplePrice());
        dbManager.setDouble(17,lwTownIndicatorDto.getNotPeoplePrice());
        dbManager.setDouble(18,lwTownIndicatorDto.getFarmPrice());
        dbManager.setDouble(19,lwTownIndicatorDto.getProducePrice());
        dbManager.setDouble(20,lwTownIndicatorDto.getBusinessPrice());
        dbManager.setInt(21,lwTownIndicatorDto.getVoltlevel());
        dbManager.setDouble(22,lwTownIndicatorDto.getIndustryPrice());
        dbManager.setString(23,lwTownIndicatorDto.getValidStatus());
        dbManager.setString(24,lwTownIndicatorDto.getFlag());
        dbManager.setString(25,lwTownIndicatorDto.getRemark());
        dbManager.setString(26,lwTownIndicatorDto.getInputDate());
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
        buffer.append("INSERT INTO LwTownIndicator (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("ReadDate,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("MidWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("AppendCalQuantity,");
        buffer.append("TranferLossQuantity,");
        buffer.append("PeoplePrice,");
        buffer.append("NotPeoplePrice,");
        buffer.append("FarmPrice,");
        buffer.append("ProducePrice,");
        buffer.append("BusinessPrice,");
        buffer.append("Voltlevel,");
        buffer.append("IndustryPrice,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("InputDate ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwTownIndicatorDto lwTownIndicatorDto = (LwTownIndicatorDto)i.next();
            dbManager.setString(1,lwTownIndicatorDto.getUserNo());
            dbManager.setString(2,lwTownIndicatorDto.getUserName());
            dbManager.setString(3,lwTownIndicatorDto.getAddress());
            dbManager.setString(4,lwTownIndicatorDto.getReadDate());
            dbManager.setString(5,lwTownIndicatorDto.getStatMonth());
            dbManager.setDouble(6,lwTownIndicatorDto.getThisWorkNum());
            dbManager.setDouble(7,lwTownIndicatorDto.getMidWorkNum());
            dbManager.setDouble(8,lwTownIndicatorDto.getLastWorkNum());
            dbManager.setDouble(9,lwTownIndicatorDto.getRate());
            dbManager.setDouble(10,lwTownIndicatorDto.getReadQuantity());
            dbManager.setDouble(11,lwTownIndicatorDto.getExcepQuantity());
            dbManager.setDouble(12,lwTownIndicatorDto.getChgAmmeterQuantity());
            dbManager.setDouble(13,lwTownIndicatorDto.getCompensateQuantity());
            dbManager.setLong(14,lwTownIndicatorDto.getAppendCalQuantity());
            dbManager.setLong(15,lwTownIndicatorDto.getTranferLossQuantity());
            dbManager.setDouble(16,lwTownIndicatorDto.getPeoplePrice());
            dbManager.setDouble(17,lwTownIndicatorDto.getNotPeoplePrice());
            dbManager.setDouble(18,lwTownIndicatorDto.getFarmPrice());
            dbManager.setDouble(19,lwTownIndicatorDto.getProducePrice());
            dbManager.setDouble(20,lwTownIndicatorDto.getBusinessPrice());
            dbManager.setInt(21,lwTownIndicatorDto.getVoltlevel());
            dbManager.setDouble(22,lwTownIndicatorDto.getIndustryPrice());
            dbManager.setString(23,lwTownIndicatorDto.getValidStatus());
            dbManager.setString(24,lwTownIndicatorDto.getFlag());
            dbManager.setString(25,lwTownIndicatorDto.getRemark());
            dbManager.setString(26,lwTownIndicatorDto.getInputDate());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userNo 户号
     * @param statMonth 账期
     * @throws Exception
     */
    public void delete(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwTownIndicator ");
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
     * @param lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public void update(LwTownIndicatorDto lwTownIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwTownIndicator SET ");
        buffer.append("UserName = ?, ");
        buffer.append("Address = ?, ");
        buffer.append("ReadDate = ?, ");
        buffer.append("ThisWorkNum = ?, ");
        buffer.append("MidWorkNum = ?, ");
        buffer.append("LastWorkNum = ?, ");
        buffer.append("Rate = ?, ");
        buffer.append("ReadQuantity = ?, ");
        buffer.append("ExcepQuantity = ?, ");
        buffer.append("ChgAmmeterQuantity = ?, ");
        buffer.append("CompensateQuantity = ?, ");
        buffer.append("AppendCalQuantity = ?, ");
        buffer.append("TranferLossQuantity = ?, ");
        buffer.append("PeoplePrice = ?, ");
        buffer.append("NotPeoplePrice = ?, ");
        buffer.append("FarmPrice = ?, ");
        buffer.append("ProducePrice = ?, ");
        buffer.append("BusinessPrice = ?, ");
        buffer.append("Voltlevel = ?, ");
        buffer.append("IndustryPrice = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("InputDate = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwTownIndicator SET ");
            debugBuffer.append("UserName = '" + lwTownIndicatorDto.getUserName() + "', ");
            debugBuffer.append("Address = '" + lwTownIndicatorDto.getAddress() + "', ");
            debugBuffer.append("ReadDate = '" + lwTownIndicatorDto.getReadDate() + "', ");
            debugBuffer.append("ThisWorkNum = " + lwTownIndicatorDto.getThisWorkNum() + ", ");
            debugBuffer.append("MidWorkNum = " + lwTownIndicatorDto.getMidWorkNum() + ", ");
            debugBuffer.append("LastWorkNum = " + lwTownIndicatorDto.getLastWorkNum() + ", ");
            debugBuffer.append("Rate = " + lwTownIndicatorDto.getRate() + ", ");
            debugBuffer.append("ReadQuantity = " + lwTownIndicatorDto.getReadQuantity() + ", ");
            debugBuffer.append("ExcepQuantity = " + lwTownIndicatorDto.getExcepQuantity() + ", ");
            debugBuffer.append("ChgAmmeterQuantity = " + lwTownIndicatorDto.getChgAmmeterQuantity() + ", ");
            debugBuffer.append("CompensateQuantity = " + lwTownIndicatorDto.getCompensateQuantity() + ", ");
            debugBuffer.append("AppendCalQuantity = " + lwTownIndicatorDto.getAppendCalQuantity() + ", ");
            debugBuffer.append("TranferLossQuantity = " + lwTownIndicatorDto.getTranferLossQuantity() + ", ");
            debugBuffer.append("PeoplePrice = " + lwTownIndicatorDto.getPeoplePrice() + ", ");
            debugBuffer.append("NotPeoplePrice = " + lwTownIndicatorDto.getNotPeoplePrice() + ", ");
            debugBuffer.append("FarmPrice = " + lwTownIndicatorDto.getFarmPrice() + ", ");
            debugBuffer.append("ProducePrice = " + lwTownIndicatorDto.getProducePrice() + ", ");
            debugBuffer.append("BusinessPrice = " + lwTownIndicatorDto.getBusinessPrice() + ", ");
            debugBuffer.append("Voltlevel = " + lwTownIndicatorDto.getVoltlevel() + ", ");
            debugBuffer.append("IndustryPrice = " + lwTownIndicatorDto.getIndustryPrice() + ", ");
            debugBuffer.append("ValidStatus = '" + lwTownIndicatorDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwTownIndicatorDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwTownIndicatorDto.getRemark() + "', ");
            debugBuffer.append("InputDate = '" + lwTownIndicatorDto.getInputDate() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwTownIndicatorDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwTownIndicatorDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwTownIndicatorDto.getUserName());
        dbManager.setString(2,lwTownIndicatorDto.getAddress());
        dbManager.setString(3,lwTownIndicatorDto.getReadDate());
        dbManager.setDouble(4,lwTownIndicatorDto.getThisWorkNum());
        dbManager.setDouble(5,lwTownIndicatorDto.getMidWorkNum());
        dbManager.setDouble(6,lwTownIndicatorDto.getLastWorkNum());
        dbManager.setDouble(7,lwTownIndicatorDto.getRate());
        dbManager.setDouble(8,lwTownIndicatorDto.getReadQuantity());
        dbManager.setDouble(9,lwTownIndicatorDto.getExcepQuantity());
        dbManager.setDouble(10,lwTownIndicatorDto.getChgAmmeterQuantity());
        dbManager.setDouble(11,lwTownIndicatorDto.getCompensateQuantity());
        dbManager.setLong(12,lwTownIndicatorDto.getAppendCalQuantity());
        dbManager.setLong(13,lwTownIndicatorDto.getTranferLossQuantity());
        dbManager.setDouble(14,lwTownIndicatorDto.getPeoplePrice());
        dbManager.setDouble(15,lwTownIndicatorDto.getNotPeoplePrice());
        dbManager.setDouble(16,lwTownIndicatorDto.getFarmPrice());
        dbManager.setDouble(17,lwTownIndicatorDto.getProducePrice());
        dbManager.setDouble(18,lwTownIndicatorDto.getBusinessPrice());
        dbManager.setInt(19,lwTownIndicatorDto.getVoltlevel());
        dbManager.setDouble(20,lwTownIndicatorDto.getIndustryPrice());
        dbManager.setString(21,lwTownIndicatorDto.getValidStatus());
        dbManager.setString(22,lwTownIndicatorDto.getFlag());
        dbManager.setString(23,lwTownIndicatorDto.getRemark());
        dbManager.setString(24,lwTownIndicatorDto.getInputDate());
        //设置条件字段;
        dbManager.setString(25,lwTownIndicatorDto.getUserNo());
        dbManager.setString(26,lwTownIndicatorDto.getStatMonth());
        dbManager.executePreparedUpdate();
        

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 账期
     * @return LwTownIndicatorDto
     * @throws Exception
     */
    public LwTownIndicatorDto findByPrimaryKey(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("ReadDate,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("MidWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("AppendCalQuantity,");
        buffer.append("TranferLossQuantity,");
        buffer.append("PeoplePrice,");
        buffer.append("NotPeoplePrice,");
        buffer.append("FarmPrice,");
        buffer.append("ProducePrice,");
        buffer.append("BusinessPrice,");
        buffer.append("Voltlevel,");
        buffer.append("IndustryPrice,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("InputDate ");
        buffer.append("FROM LwTownIndicator ");
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
        LwTownIndicatorDto lwTownIndicatorDto = null;
        if(resultSet.next()){
            lwTownIndicatorDto = new LwTownIndicatorDto();
            lwTownIndicatorDto.setUserNo(dbManager.getString(resultSet,1));
            lwTownIndicatorDto.setUserName(dbManager.getString(resultSet,2));
            lwTownIndicatorDto.setAddress(dbManager.getString(resultSet,3));
            lwTownIndicatorDto.setReadDate(dbManager.getString(resultSet,4));
            lwTownIndicatorDto.setStatMonth(dbManager.getString(resultSet,5));
            lwTownIndicatorDto.setThisWorkNum(dbManager.getDouble(resultSet,6));
            lwTownIndicatorDto.setMidWorkNum(dbManager.getDouble(resultSet,7));
            lwTownIndicatorDto.setLastWorkNum(dbManager.getDouble(resultSet,8));
            lwTownIndicatorDto.setRate(dbManager.getDouble(resultSet,9));
            lwTownIndicatorDto.setReadQuantity(dbManager.getDouble(resultSet,10));
            lwTownIndicatorDto.setExcepQuantity(dbManager.getDouble(resultSet,11));
            lwTownIndicatorDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,12));
            lwTownIndicatorDto.setCompensateQuantity(dbManager.getDouble(resultSet,13));
            lwTownIndicatorDto.setAppendCalQuantity(dbManager.getLong(resultSet,14));
            lwTownIndicatorDto.setTranferLossQuantity(dbManager.getLong(resultSet,15));
            lwTownIndicatorDto.setPeoplePrice(dbManager.getDouble(resultSet,16));
            lwTownIndicatorDto.setNotPeoplePrice(dbManager.getDouble(resultSet,17));
            lwTownIndicatorDto.setFarmPrice(dbManager.getDouble(resultSet,18));
            lwTownIndicatorDto.setProducePrice(dbManager.getDouble(resultSet,19));
            lwTownIndicatorDto.setBusinessPrice(dbManager.getDouble(resultSet,20));
            lwTownIndicatorDto.setVoltlevel(dbManager.getInt(resultSet,21));
            lwTownIndicatorDto.setIndustryPrice(dbManager.getDouble(resultSet,22));
            lwTownIndicatorDto.setValidStatus(dbManager.getString(resultSet,23));
            lwTownIndicatorDto.setFlag(dbManager.getString(resultSet,24));
            lwTownIndicatorDto.setRemark(dbManager.getString(resultSet,25));
            lwTownIndicatorDto.setInputDate(dbManager.getString(resultSet,26));
        }
        resultSet.close();
        return lwTownIndicatorDto;
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
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("ReadDate,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("MidWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("Rate,");
        buffer.append("ReadQuantity,");
        buffer.append("ExcepQuantity,");
        buffer.append("ChgAmmeterQuantity,");
        buffer.append("CompensateQuantity,");
        buffer.append("AppendCalQuantity,");
        buffer.append("TranferLossQuantity,");
        buffer.append("PeoplePrice,");
        buffer.append("NotPeoplePrice,");
        buffer.append("FarmPrice,");
        buffer.append("ProducePrice,");
        buffer.append("BusinessPrice,");
        buffer.append("Voltlevel,");
        buffer.append("IndustryPrice,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("InputDate ");
        buffer.append("FROM LwTownIndicator WHERE ");
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
        if(true){
            logger.debug(buffer.toString());
        }
        ResultSet resultSet = dbManager.executeQuery(buffer.toString());
        int count=0;
        if(supportPaging==false && pageNo>1){
            dbManager.locate(resultSet,rowsPerPage * (pageNo - 1));
        }

        //定义返回结果集合
        Collection collection = new ArrayList(rowsPerPage);
        LwTownIndicatorDto lwTownIndicatorDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwTownIndicatorDto = new LwTownIndicatorDto();
            lwTownIndicatorDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwTownIndicatorDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwTownIndicatorDto.setAddress(dbManager.getString(resultSet,"Address"));
            lwTownIndicatorDto.setReadDate(dbManager.getString(resultSet,"ReadDate"));
            lwTownIndicatorDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwTownIndicatorDto.setThisWorkNum(dbManager.getDouble(resultSet,"ThisWorkNum"));
            lwTownIndicatorDto.setMidWorkNum(dbManager.getDouble(resultSet,"MidWorkNum"));
            lwTownIndicatorDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwTownIndicatorDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwTownIndicatorDto.setReadQuantity(dbManager.getDouble(resultSet,"ReadQuantity"));
            lwTownIndicatorDto.setExcepQuantity(dbManager.getDouble(resultSet,"ExcepQuantity"));
            lwTownIndicatorDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,"ChgAmmeterQuantity"));
            lwTownIndicatorDto.setCompensateQuantity(dbManager.getDouble(resultSet,"CompensateQuantity"));
            lwTownIndicatorDto.setAppendCalQuantity(dbManager.getLong(resultSet,"AppendCalQuantity"));
            lwTownIndicatorDto.setTranferLossQuantity(dbManager.getLong(resultSet,"TranferLossQuantity"));
            lwTownIndicatorDto.setPeoplePrice(dbManager.getDouble(resultSet,"PeoplePrice"));
            lwTownIndicatorDto.setNotPeoplePrice(dbManager.getDouble(resultSet,"NotPeoplePrice"));
            lwTownIndicatorDto.setFarmPrice(dbManager.getDouble(resultSet,"FarmPrice"));
            lwTownIndicatorDto.setProducePrice(dbManager.getDouble(resultSet,"ProducePrice"));
            lwTownIndicatorDto.setBusinessPrice(dbManager.getDouble(resultSet,"BusinessPrice"));
            lwTownIndicatorDto.setVoltlevel(dbManager.getInt(resultSet,"Voltlevel"));
            lwTownIndicatorDto.setIndustryPrice(dbManager.getDouble(resultSet,"IndustryPrice"));
            lwTownIndicatorDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwTownIndicatorDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwTownIndicatorDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwTownIndicatorDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            collection.add(lwTownIndicatorDto);
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
        buffer.append("DELETE FROM LwTownIndicator WHERE ");
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
        buffer.append("SELECT count(*) FROM LwTownIndicator WHERE ");
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
