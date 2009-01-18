package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownIndicatorAppend-直供乡追加电费指针记录表的数据访问对象基类<br>
 */
public class DBLwTownIndicatorAppendBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwTownIndicatorAppendBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownIndicatorAppendBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public void insert(LwTownIndicatorAppendDto lwTownIndicatorAppendDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwTownIndicatorAppend (");
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
        buffer.append("AppendDate ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwTownIndicatorAppendDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorAppendDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorAppendDto.getAddress()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorAppendDto.getReadDate()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorAppendDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getMidWorkNum()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getRate()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getReadQuantity()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getNotPeoplePrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getFarmPrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getProducePrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getBusinessPrice()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getVoltlevel()).append(",");
            debugBuffer.append("").append(lwTownIndicatorAppendDto.getIndustryPrice()).append(",");
            debugBuffer.append("'").append(lwTownIndicatorAppendDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorAppendDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorAppendDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwTownIndicatorAppendDto.getAppendDate()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwTownIndicatorAppendDto.getUserNo());
        dbManager.setString(2,lwTownIndicatorAppendDto.getUserName());
        dbManager.setString(3,lwTownIndicatorAppendDto.getAddress());
        dbManager.setString(4,lwTownIndicatorAppendDto.getReadDate());
        dbManager.setString(5,lwTownIndicatorAppendDto.getStatMonth());
        dbManager.setDouble(6,lwTownIndicatorAppendDto.getThisWorkNum());
        dbManager.setDouble(7,lwTownIndicatorAppendDto.getMidWorkNum());
        dbManager.setDouble(8,lwTownIndicatorAppendDto.getLastWorkNum());
        dbManager.setDouble(9,lwTownIndicatorAppendDto.getRate());
        dbManager.setDouble(10,lwTownIndicatorAppendDto.getReadQuantity());
        dbManager.setDouble(11,lwTownIndicatorAppendDto.getPeoplePrice());
        dbManager.setDouble(12,lwTownIndicatorAppendDto.getNotPeoplePrice());
        dbManager.setDouble(13,lwTownIndicatorAppendDto.getFarmPrice());
        dbManager.setDouble(14,lwTownIndicatorAppendDto.getProducePrice());
        dbManager.setDouble(15,lwTownIndicatorAppendDto.getBusinessPrice());
        dbManager.setInt(16,lwTownIndicatorAppendDto.getVoltlevel());
        dbManager.setDouble(17,lwTownIndicatorAppendDto.getIndustryPrice());
        dbManager.setString(18,lwTownIndicatorAppendDto.getValidStatus());
        dbManager.setString(19,lwTownIndicatorAppendDto.getFlag());
        dbManager.setString(20,lwTownIndicatorAppendDto.getRemark());
        dbManager.setString(21,lwTownIndicatorAppendDto.getAppendDate());
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
        buffer.append("INSERT INTO LwTownIndicatorAppend (");
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
        buffer.append("AppendDate ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwTownIndicatorAppendDto lwTownIndicatorAppendDto = (LwTownIndicatorAppendDto)i.next();
            dbManager.setString(1,lwTownIndicatorAppendDto.getUserNo());
            dbManager.setString(2,lwTownIndicatorAppendDto.getUserName());
            dbManager.setString(3,lwTownIndicatorAppendDto.getAddress());
            dbManager.setString(4,lwTownIndicatorAppendDto.getReadDate());
            dbManager.setString(5,lwTownIndicatorAppendDto.getStatMonth());
            dbManager.setDouble(6,lwTownIndicatorAppendDto.getThisWorkNum());
            dbManager.setDouble(7,lwTownIndicatorAppendDto.getMidWorkNum());
            dbManager.setDouble(8,lwTownIndicatorAppendDto.getLastWorkNum());
            dbManager.setDouble(9,lwTownIndicatorAppendDto.getRate());
            dbManager.setDouble(10,lwTownIndicatorAppendDto.getReadQuantity());
            dbManager.setDouble(11,lwTownIndicatorAppendDto.getPeoplePrice());
            dbManager.setDouble(12,lwTownIndicatorAppendDto.getNotPeoplePrice());
            dbManager.setDouble(13,lwTownIndicatorAppendDto.getFarmPrice());
            dbManager.setDouble(14,lwTownIndicatorAppendDto.getProducePrice());
            dbManager.setDouble(15,lwTownIndicatorAppendDto.getBusinessPrice());
            dbManager.setInt(16,lwTownIndicatorAppendDto.getVoltlevel());
            dbManager.setDouble(17,lwTownIndicatorAppendDto.getIndustryPrice());
            dbManager.setString(18,lwTownIndicatorAppendDto.getValidStatus());
            dbManager.setString(19,lwTownIndicatorAppendDto.getFlag());
            dbManager.setString(20,lwTownIndicatorAppendDto.getRemark());
            dbManager.setString(21,lwTownIndicatorAppendDto.getAppendDate());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userNo 户号
     * @param statMonth 统计日期
     * @throws Exception
     */
    public void delete(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwTownIndicatorAppend ");
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
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public void update(LwTownIndicatorAppendDto lwTownIndicatorAppendDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwTownIndicatorAppend SET ");
        buffer.append("UserName = ?, ");
        buffer.append("Address = ?, ");
        buffer.append("ReadDate = ?, ");
        buffer.append("ThisWorkNum = ?, ");
        buffer.append("MidWorkNum = ?, ");
        buffer.append("LastWorkNum = ?, ");
        buffer.append("Rate = ?, ");
        buffer.append("ReadQuantity = ?, ");
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
        buffer.append("AppendDate = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwTownIndicatorAppend SET ");
            debugBuffer.append("UserName = '" + lwTownIndicatorAppendDto.getUserName() + "', ");
            debugBuffer.append("Address = '" + lwTownIndicatorAppendDto.getAddress() + "', ");
            debugBuffer.append("ReadDate = '" + lwTownIndicatorAppendDto.getReadDate() + "', ");
            debugBuffer.append("ThisWorkNum = " + lwTownIndicatorAppendDto.getThisWorkNum() + ", ");
            debugBuffer.append("MidWorkNum = " + lwTownIndicatorAppendDto.getMidWorkNum() + ", ");
            debugBuffer.append("LastWorkNum = " + lwTownIndicatorAppendDto.getLastWorkNum() + ", ");
            debugBuffer.append("Rate = " + lwTownIndicatorAppendDto.getRate() + ", ");
            debugBuffer.append("ReadQuantity = " + lwTownIndicatorAppendDto.getReadQuantity() + ", ");
            debugBuffer.append("PeoplePrice = " + lwTownIndicatorAppendDto.getPeoplePrice() + ", ");
            debugBuffer.append("NotPeoplePrice = " + lwTownIndicatorAppendDto.getNotPeoplePrice() + ", ");
            debugBuffer.append("FarmPrice = " + lwTownIndicatorAppendDto.getFarmPrice() + ", ");
            debugBuffer.append("ProducePrice = " + lwTownIndicatorAppendDto.getProducePrice() + ", ");
            debugBuffer.append("BusinessPrice = " + lwTownIndicatorAppendDto.getBusinessPrice() + ", ");
            debugBuffer.append("Voltlevel = " + lwTownIndicatorAppendDto.getVoltlevel() + ", ");
            debugBuffer.append("IndustryPrice = " + lwTownIndicatorAppendDto.getIndustryPrice() + ", ");
            debugBuffer.append("ValidStatus = '" + lwTownIndicatorAppendDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwTownIndicatorAppendDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwTownIndicatorAppendDto.getRemark() + "', ");
            debugBuffer.append("AppendDate = '" + lwTownIndicatorAppendDto.getAppendDate() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwTownIndicatorAppendDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwTownIndicatorAppendDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwTownIndicatorAppendDto.getUserName());
        dbManager.setString(2,lwTownIndicatorAppendDto.getAddress());
        dbManager.setString(3,lwTownIndicatorAppendDto.getReadDate());
        dbManager.setDouble(4,lwTownIndicatorAppendDto.getThisWorkNum());
        dbManager.setDouble(5,lwTownIndicatorAppendDto.getMidWorkNum());
        dbManager.setDouble(6,lwTownIndicatorAppendDto.getLastWorkNum());
        dbManager.setDouble(7,lwTownIndicatorAppendDto.getRate());
        dbManager.setDouble(8,lwTownIndicatorAppendDto.getReadQuantity());
        dbManager.setDouble(9,lwTownIndicatorAppendDto.getPeoplePrice());
        dbManager.setDouble(10,lwTownIndicatorAppendDto.getNotPeoplePrice());
        dbManager.setDouble(11,lwTownIndicatorAppendDto.getFarmPrice());
        dbManager.setDouble(12,lwTownIndicatorAppendDto.getProducePrice());
        dbManager.setDouble(13,lwTownIndicatorAppendDto.getBusinessPrice());
        dbManager.setInt(14,lwTownIndicatorAppendDto.getVoltlevel());
        dbManager.setDouble(15,lwTownIndicatorAppendDto.getIndustryPrice());
        dbManager.setString(16,lwTownIndicatorAppendDto.getValidStatus());
        dbManager.setString(17,lwTownIndicatorAppendDto.getFlag());
        dbManager.setString(18,lwTownIndicatorAppendDto.getRemark());
        dbManager.setString(19,lwTownIndicatorAppendDto.getAppendDate());
        //设置条件字段;
        dbManager.setString(20,lwTownIndicatorAppendDto.getUserNo());
        dbManager.setString(21,lwTownIndicatorAppendDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 统计日期
     * @return LwTownIndicatorAppendDto
     * @throws Exception
     */
    public LwTownIndicatorAppendDto findByPrimaryKey(String userNo,String statMonth)
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
        buffer.append("AppendDate ");
        buffer.append("FROM LwTownIndicatorAppend ");
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
        LwTownIndicatorAppendDto lwTownIndicatorAppendDto = null;
        if(resultSet.next()){
            lwTownIndicatorAppendDto = new LwTownIndicatorAppendDto();
            lwTownIndicatorAppendDto.setUserNo(dbManager.getString(resultSet,1));
            lwTownIndicatorAppendDto.setUserName(dbManager.getString(resultSet,2));
            lwTownIndicatorAppendDto.setAddress(dbManager.getString(resultSet,3));
            lwTownIndicatorAppendDto.setReadDate(dbManager.getString(resultSet,4));
            lwTownIndicatorAppendDto.setStatMonth(dbManager.getString(resultSet,5));
            lwTownIndicatorAppendDto.setThisWorkNum(dbManager.getDouble(resultSet,6));
            lwTownIndicatorAppendDto.setMidWorkNum(dbManager.getDouble(resultSet,7));
            lwTownIndicatorAppendDto.setLastWorkNum(dbManager.getDouble(resultSet,8));
            lwTownIndicatorAppendDto.setRate(dbManager.getDouble(resultSet,9));
            lwTownIndicatorAppendDto.setReadQuantity(dbManager.getDouble(resultSet,10));
            lwTownIndicatorAppendDto.setPeoplePrice(dbManager.getDouble(resultSet,11));
            lwTownIndicatorAppendDto.setNotPeoplePrice(dbManager.getDouble(resultSet,12));
            lwTownIndicatorAppendDto.setFarmPrice(dbManager.getDouble(resultSet,13));
            lwTownIndicatorAppendDto.setProducePrice(dbManager.getDouble(resultSet,14));
            lwTownIndicatorAppendDto.setBusinessPrice(dbManager.getDouble(resultSet,15));
            lwTownIndicatorAppendDto.setVoltlevel(dbManager.getInt(resultSet,16));
            lwTownIndicatorAppendDto.setIndustryPrice(dbManager.getDouble(resultSet,17));
            lwTownIndicatorAppendDto.setValidStatus(dbManager.getString(resultSet,18));
            lwTownIndicatorAppendDto.setFlag(dbManager.getString(resultSet,19));
            lwTownIndicatorAppendDto.setRemark(dbManager.getString(resultSet,20));
            lwTownIndicatorAppendDto.setAppendDate(dbManager.getString(resultSet,21));
        }
        resultSet.close();
        return lwTownIndicatorAppendDto;
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
        buffer.append("AppendDate ");
        buffer.append("FROM LwTownIndicatorAppend WHERE ");
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
        LwTownIndicatorAppendDto lwTownIndicatorAppendDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwTownIndicatorAppendDto = new LwTownIndicatorAppendDto();
            lwTownIndicatorAppendDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwTownIndicatorAppendDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwTownIndicatorAppendDto.setAddress(dbManager.getString(resultSet,"Address"));
            lwTownIndicatorAppendDto.setReadDate(dbManager.getString(resultSet,"ReadDate"));
            lwTownIndicatorAppendDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwTownIndicatorAppendDto.setThisWorkNum(dbManager.getDouble(resultSet,"ThisWorkNum"));
            lwTownIndicatorAppendDto.setMidWorkNum(dbManager.getDouble(resultSet,"MidWorkNum"));
            lwTownIndicatorAppendDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwTownIndicatorAppendDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwTownIndicatorAppendDto.setReadQuantity(dbManager.getDouble(resultSet,"ReadQuantity"));
            lwTownIndicatorAppendDto.setPeoplePrice(dbManager.getDouble(resultSet,"PeoplePrice"));
            lwTownIndicatorAppendDto.setNotPeoplePrice(dbManager.getDouble(resultSet,"NotPeoplePrice"));
            lwTownIndicatorAppendDto.setFarmPrice(dbManager.getDouble(resultSet,"FarmPrice"));
            lwTownIndicatorAppendDto.setProducePrice(dbManager.getDouble(resultSet,"ProducePrice"));
            lwTownIndicatorAppendDto.setBusinessPrice(dbManager.getDouble(resultSet,"BusinessPrice"));
            lwTownIndicatorAppendDto.setVoltlevel(dbManager.getInt(resultSet,"Voltlevel"));
            lwTownIndicatorAppendDto.setIndustryPrice(dbManager.getDouble(resultSet,"IndustryPrice"));
            lwTownIndicatorAppendDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwTownIndicatorAppendDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwTownIndicatorAppendDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwTownIndicatorAppendDto.setAppendDate(dbManager.getString(resultSet,"AppendDate"));
            collection.add(lwTownIndicatorAppendDto);
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
        buffer.append("DELETE FROM LwTownIndicatorAppend WHERE ");
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
        buffer.append("SELECT count(*) FROM LwTownIndicatorAppend WHERE ");
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
