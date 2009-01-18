package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownIndicatorBak-直供乡电表指针记录备份表的数据访问对象基类<br>
 */
public class DBLwTownIndicatorBakBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwTownIndicatorBakBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownIndicatorBakBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public void insert(LwTownIndicatorBakDto lwTownIndicatorBakDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwTownIndicatorBak (");
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
            debugBuffer.append("'").append(lwTownIndicatorBakDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorBakDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorBakDto.getAddress()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorBakDto.getReadDate()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorBakDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getMidWorkNum()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getRate()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getReadQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getExcepQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getChgAmmeterQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getCompensateQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getAppendCalQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getTranferLossQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getNotPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getFarmPrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getProducePrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getBusinessPrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getVoltlevel()).append(",");
            debugBuffer.append("").append(lwTownIndicatorBakDto.getIndustryPrice()).append(",");
            debugBuffer.append("'").append(lwTownIndicatorBakDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorBakDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorBakDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorBakDto.getInputDate()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwTownIndicatorBakDto.getUserNo());
        dbManager.setString(2,lwTownIndicatorBakDto.getUserName());
        dbManager.setString(3,lwTownIndicatorBakDto.getAddress());
        dbManager.setString(4,lwTownIndicatorBakDto.getReadDate());
        dbManager.setString(5,lwTownIndicatorBakDto.getStatMonth());
        dbManager.setDouble(6,lwTownIndicatorBakDto.getThisWorkNum());
        dbManager.setDouble(7,lwTownIndicatorBakDto.getMidWorkNum());
        dbManager.setDouble(8,lwTownIndicatorBakDto.getLastWorkNum());
        dbManager.setDouble(9,lwTownIndicatorBakDto.getRate());
        dbManager.setDouble(10,lwTownIndicatorBakDto.getReadQuantity());
        dbManager.setDouble(11,lwTownIndicatorBakDto.getExcepQuantity());
        dbManager.setDouble(12,lwTownIndicatorBakDto.getChgAmmeterQuantity());
        dbManager.setDouble(13,lwTownIndicatorBakDto.getCompensateQuantity());
        dbManager.setLong(14,lwTownIndicatorBakDto.getAppendCalQuantity());
        dbManager.setLong(15,lwTownIndicatorBakDto.getTranferLossQuantity());
        dbManager.setDouble(16,lwTownIndicatorBakDto.getPeoplePrice());
        dbManager.setDouble(17,lwTownIndicatorBakDto.getNotPeoplePrice());
        dbManager.setDouble(18,lwTownIndicatorBakDto.getFarmPrice());
        dbManager.setDouble(19,lwTownIndicatorBakDto.getProducePrice());
        dbManager.setDouble(20,lwTownIndicatorBakDto.getBusinessPrice());
        dbManager.setInt(21,lwTownIndicatorBakDto.getVoltlevel());
        dbManager.setDouble(22,lwTownIndicatorBakDto.getIndustryPrice());
        dbManager.setString(23,lwTownIndicatorBakDto.getValidStatus());
        dbManager.setString(24,lwTownIndicatorBakDto.getFlag());
        dbManager.setString(25,lwTownIndicatorBakDto.getRemark());
        dbManager.setString(26,lwTownIndicatorBakDto.getInputDate());
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
        buffer.append("INSERT INTO LwTownIndicatorBak (");
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
            LwTownIndicatorBakDto lwTownIndicatorBakDto = (LwTownIndicatorBakDto)i.next();
            dbManager.setString(1,lwTownIndicatorBakDto.getUserNo());
            dbManager.setString(2,lwTownIndicatorBakDto.getUserName());
            dbManager.setString(3,lwTownIndicatorBakDto.getAddress());
            dbManager.setString(4,lwTownIndicatorBakDto.getReadDate());
            dbManager.setString(5,lwTownIndicatorBakDto.getStatMonth());
            dbManager.setDouble(6,lwTownIndicatorBakDto.getThisWorkNum());
            dbManager.setDouble(7,lwTownIndicatorBakDto.getMidWorkNum());
            dbManager.setDouble(8,lwTownIndicatorBakDto.getLastWorkNum());
            dbManager.setDouble(9,lwTownIndicatorBakDto.getRate());
            dbManager.setDouble(10,lwTownIndicatorBakDto.getReadQuantity());
            dbManager.setDouble(11,lwTownIndicatorBakDto.getExcepQuantity());
            dbManager.setDouble(12,lwTownIndicatorBakDto.getChgAmmeterQuantity());
            dbManager.setDouble(13,lwTownIndicatorBakDto.getCompensateQuantity());
            dbManager.setLong(14,lwTownIndicatorBakDto.getAppendCalQuantity());
            dbManager.setLong(15,lwTownIndicatorBakDto.getTranferLossQuantity());
            dbManager.setDouble(16,lwTownIndicatorBakDto.getPeoplePrice());
            dbManager.setDouble(17,lwTownIndicatorBakDto.getNotPeoplePrice());
            dbManager.setDouble(18,lwTownIndicatorBakDto.getFarmPrice());
            dbManager.setDouble(19,lwTownIndicatorBakDto.getProducePrice());
            dbManager.setDouble(20,lwTownIndicatorBakDto.getBusinessPrice());
            dbManager.setInt(21,lwTownIndicatorBakDto.getVoltlevel());
            dbManager.setDouble(22,lwTownIndicatorBakDto.getIndustryPrice());
            dbManager.setString(23,lwTownIndicatorBakDto.getValidStatus());
            dbManager.setString(24,lwTownIndicatorBakDto.getFlag());
            dbManager.setString(25,lwTownIndicatorBakDto.getRemark());
            dbManager.setString(26,lwTownIndicatorBakDto.getInputDate());
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
        buffer.append("DELETE FROM LwTownIndicatorBak ");
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
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public void update(LwTownIndicatorBakDto lwTownIndicatorBakDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwTownIndicatorBak SET ");
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
            debugBuffer.append("UPDATE LwTownIndicatorBak SET ");
            debugBuffer.append("UserName = '" + lwTownIndicatorBakDto.getUserName() + "', ");
            debugBuffer.append("Address = '" + lwTownIndicatorBakDto.getAddress() + "', ");
            debugBuffer.append("ReadDate = '" + lwTownIndicatorBakDto.getReadDate() + "', ");
            debugBuffer.append("ThisWorkNum = " + lwTownIndicatorBakDto.getThisWorkNum() + ", ");
            debugBuffer.append("MidWorkNum = " + lwTownIndicatorBakDto.getMidWorkNum() + ", ");
            debugBuffer.append("LastWorkNum = " + lwTownIndicatorBakDto.getLastWorkNum() + ", ");
            debugBuffer.append("Rate = " + lwTownIndicatorBakDto.getRate() + ", ");
            debugBuffer.append("ReadQuantity = " + lwTownIndicatorBakDto.getReadQuantity() + ", ");
            debugBuffer.append("ExcepQuantity = " + lwTownIndicatorBakDto.getExcepQuantity() + ", ");
            debugBuffer.append("ChgAmmeterQuantity = " + lwTownIndicatorBakDto.getChgAmmeterQuantity() + ", ");
            debugBuffer.append("CompensateQuantity = " + lwTownIndicatorBakDto.getCompensateQuantity() + ", ");
            debugBuffer.append("AppendCalQuantity = " + lwTownIndicatorBakDto.getAppendCalQuantity() + ", ");
            debugBuffer.append("TranferLossQuantity = " + lwTownIndicatorBakDto.getTranferLossQuantity() + ", ");
            debugBuffer.append("PeoplePrice = " + lwTownIndicatorBakDto.getPeoplePrice() + ", ");
            debugBuffer.append("NotPeoplePrice = " + lwTownIndicatorBakDto.getNotPeoplePrice() + ", ");
            debugBuffer.append("FarmPrice = " + lwTownIndicatorBakDto.getFarmPrice() + ", ");
            debugBuffer.append("ProducePrice = " + lwTownIndicatorBakDto.getProducePrice() + ", ");
            debugBuffer.append("BusinessPrice = " + lwTownIndicatorBakDto.getBusinessPrice() + ", ");
            debugBuffer.append("Voltlevel = " + lwTownIndicatorBakDto.getVoltlevel() + ", ");
            debugBuffer.append("IndustryPrice = " + lwTownIndicatorBakDto.getIndustryPrice() + ", ");
            debugBuffer.append("ValidStatus = '" + lwTownIndicatorBakDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwTownIndicatorBakDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwTownIndicatorBakDto.getRemark() + "', ");
            debugBuffer.append("InputDate = '" + lwTownIndicatorBakDto.getInputDate() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwTownIndicatorBakDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwTownIndicatorBakDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwTownIndicatorBakDto.getUserName());
        dbManager.setString(2,lwTownIndicatorBakDto.getAddress());
        dbManager.setString(3,lwTownIndicatorBakDto.getReadDate());
        dbManager.setDouble(4,lwTownIndicatorBakDto.getThisWorkNum());
        dbManager.setDouble(5,lwTownIndicatorBakDto.getMidWorkNum());
        dbManager.setDouble(6,lwTownIndicatorBakDto.getLastWorkNum());
        dbManager.setDouble(7,lwTownIndicatorBakDto.getRate());
        dbManager.setDouble(8,lwTownIndicatorBakDto.getReadQuantity());
        dbManager.setDouble(9,lwTownIndicatorBakDto.getExcepQuantity());
        dbManager.setDouble(10,lwTownIndicatorBakDto.getChgAmmeterQuantity());
        dbManager.setDouble(11,lwTownIndicatorBakDto.getCompensateQuantity());
        dbManager.setLong(12,lwTownIndicatorBakDto.getAppendCalQuantity());
        dbManager.setLong(13,lwTownIndicatorBakDto.getTranferLossQuantity());
        dbManager.setDouble(14,lwTownIndicatorBakDto.getPeoplePrice());
        dbManager.setDouble(15,lwTownIndicatorBakDto.getNotPeoplePrice());
        dbManager.setDouble(16,lwTownIndicatorBakDto.getFarmPrice());
        dbManager.setDouble(17,lwTownIndicatorBakDto.getProducePrice());
        dbManager.setDouble(18,lwTownIndicatorBakDto.getBusinessPrice());
        dbManager.setInt(19,lwTownIndicatorBakDto.getVoltlevel());
        dbManager.setDouble(20,lwTownIndicatorBakDto.getIndustryPrice());
        dbManager.setString(21,lwTownIndicatorBakDto.getValidStatus());
        dbManager.setString(22,lwTownIndicatorBakDto.getFlag());
        dbManager.setString(23,lwTownIndicatorBakDto.getRemark());
        dbManager.setString(24,lwTownIndicatorBakDto.getInputDate());
        //设置条件字段;
        dbManager.setString(25,lwTownIndicatorBakDto.getUserNo());
        dbManager.setString(26,lwTownIndicatorBakDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 账期
     * @return LwTownIndicatorBakDto
     * @throws Exception
     */
    public LwTownIndicatorBakDto findByPrimaryKey(String userNo,String statMonth)
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
        buffer.append("FROM LwTownIndicatorBak ");
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
        LwTownIndicatorBakDto lwTownIndicatorBakDto = null;
        if(resultSet.next()){
            lwTownIndicatorBakDto = new LwTownIndicatorBakDto();
            lwTownIndicatorBakDto.setUserNo(dbManager.getString(resultSet,1));
            lwTownIndicatorBakDto.setUserName(dbManager.getString(resultSet,2));
            lwTownIndicatorBakDto.setAddress(dbManager.getString(resultSet,3));
            lwTownIndicatorBakDto.setReadDate(dbManager.getString(resultSet,4));
            lwTownIndicatorBakDto.setStatMonth(dbManager.getString(resultSet,5));
            lwTownIndicatorBakDto.setThisWorkNum(dbManager.getDouble(resultSet,6));
            lwTownIndicatorBakDto.setMidWorkNum(dbManager.getDouble(resultSet,7));
            lwTownIndicatorBakDto.setLastWorkNum(dbManager.getDouble(resultSet,8));
            lwTownIndicatorBakDto.setRate(dbManager.getDouble(resultSet,9));
            lwTownIndicatorBakDto.setReadQuantity(dbManager.getDouble(resultSet,10));
            lwTownIndicatorBakDto.setExcepQuantity(dbManager.getDouble(resultSet,11));
            lwTownIndicatorBakDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,12));
            lwTownIndicatorBakDto.setCompensateQuantity(dbManager.getDouble(resultSet,13));
            lwTownIndicatorBakDto.setAppendCalQuantity(dbManager.getLong(resultSet,14));
            lwTownIndicatorBakDto.setTranferLossQuantity(dbManager.getLong(resultSet,15));
            lwTownIndicatorBakDto.setPeoplePrice(dbManager.getDouble(resultSet,16));
            lwTownIndicatorBakDto.setNotPeoplePrice(dbManager.getDouble(resultSet,17));
            lwTownIndicatorBakDto.setFarmPrice(dbManager.getDouble(resultSet,18));
            lwTownIndicatorBakDto.setProducePrice(dbManager.getDouble(resultSet,19));
            lwTownIndicatorBakDto.setBusinessPrice(dbManager.getDouble(resultSet,20));
            lwTownIndicatorBakDto.setVoltlevel(dbManager.getInt(resultSet,21));
            lwTownIndicatorBakDto.setIndustryPrice(dbManager.getDouble(resultSet,22));
            lwTownIndicatorBakDto.setValidStatus(dbManager.getString(resultSet,23));
            lwTownIndicatorBakDto.setFlag(dbManager.getString(resultSet,24));
            lwTownIndicatorBakDto.setRemark(dbManager.getString(resultSet,25));
            lwTownIndicatorBakDto.setInputDate(dbManager.getString(resultSet,26));
        }
        resultSet.close();
        return lwTownIndicatorBakDto;
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
        buffer.append("FROM LwTownIndicatorBak WHERE ");
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
        LwTownIndicatorBakDto lwTownIndicatorBakDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwTownIndicatorBakDto = new LwTownIndicatorBakDto();
            lwTownIndicatorBakDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwTownIndicatorBakDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwTownIndicatorBakDto.setAddress(dbManager.getString(resultSet,"Address"));
            lwTownIndicatorBakDto.setReadDate(dbManager.getString(resultSet,"ReadDate"));
            lwTownIndicatorBakDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwTownIndicatorBakDto.setThisWorkNum(dbManager.getDouble(resultSet,"ThisWorkNum"));
            lwTownIndicatorBakDto.setMidWorkNum(dbManager.getDouble(resultSet,"MidWorkNum"));
            lwTownIndicatorBakDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwTownIndicatorBakDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwTownIndicatorBakDto.setReadQuantity(dbManager.getDouble(resultSet,"ReadQuantity"));
            lwTownIndicatorBakDto.setExcepQuantity(dbManager.getDouble(resultSet,"ExcepQuantity"));
            lwTownIndicatorBakDto.setChgAmmeterQuantity(dbManager.getDouble(resultSet,"ChgAmmeterQuantity"));
            lwTownIndicatorBakDto.setCompensateQuantity(dbManager.getDouble(resultSet,"CompensateQuantity"));
            lwTownIndicatorBakDto.setAppendCalQuantity(dbManager.getLong(resultSet,"AppendCalQuantity"));
            lwTownIndicatorBakDto.setTranferLossQuantity(dbManager.getLong(resultSet,"TranferLossQuantity"));
            lwTownIndicatorBakDto.setPeoplePrice(dbManager.getDouble(resultSet,"PeoplePrice"));
            lwTownIndicatorBakDto.setNotPeoplePrice(dbManager.getDouble(resultSet,"NotPeoplePrice"));
            lwTownIndicatorBakDto.setFarmPrice(dbManager.getDouble(resultSet,"FarmPrice"));
            lwTownIndicatorBakDto.setProducePrice(dbManager.getDouble(resultSet,"ProducePrice"));
            lwTownIndicatorBakDto.setBusinessPrice(dbManager.getDouble(resultSet,"BusinessPrice"));
            lwTownIndicatorBakDto.setVoltlevel(dbManager.getInt(resultSet,"Voltlevel"));
            lwTownIndicatorBakDto.setIndustryPrice(dbManager.getDouble(resultSet,"IndustryPrice"));
            lwTownIndicatorBakDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwTownIndicatorBakDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwTownIndicatorBakDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwTownIndicatorBakDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            collection.add(lwTownIndicatorBakDto);
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
        buffer.append("DELETE FROM LwTownIndicatorBak WHERE ");
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
        buffer.append("SELECT count(*) FROM LwTownIndicatorBak WHERE ");
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
