package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSalePurePrice-趸售纯电价表的数据访问对象基类<br>
 */
public class DBLwWholeSalePurePriceBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwWholeSalePurePriceBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSalePurePriceBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public void insert(LwWholeSalePurePriceDto lwWholeSalePurePriceDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwWholeSalePurePrice (");
        buffer.append("VoltLevel,");
        buffer.append("ComCode,");
        buffer.append("ComName,");
        buffer.append("PeoplePrice,");
        buffer.append("NotPeoplePrice,");
        buffer.append("FarmPrice,");
        buffer.append("ProducePrice,");
        buffer.append("BusinessPrice,");
        buffer.append("IndustryPrice,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwWholeSalePurePriceDto.getVoltLevel()).append("',");
            debugBuffer.append("'").append(lwWholeSalePurePriceDto.getComCode()).append("',");
            debugBuffer.append("'").append(lwWholeSalePurePriceDto.getComName()).append("',");
            debugBuffer.append("").append(lwWholeSalePurePriceDto.getPeoplePrice()).append(",");
            debugBuffer.append("").append(lwWholeSalePurePriceDto.getNotPeoplePrice()).append(",");
            debugBuffer.append("").append(lwWholeSalePurePriceDto.getFarmPrice()).append(",");
            debugBuffer.append("").append(lwWholeSalePurePriceDto.getProducePrice()).append(",");
            debugBuffer.append("").append(lwWholeSalePurePriceDto.getBusinessPrice()).append(",");
            debugBuffer.append("").append(lwWholeSalePurePriceDto.getIndustryPrice()).append(",");
            debugBuffer.append("'").append(lwWholeSalePurePriceDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwWholeSalePurePriceDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwWholeSalePurePriceDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwWholeSalePurePriceDto.getVoltLevel());
        dbManager.setString(2,lwWholeSalePurePriceDto.getComCode());
        dbManager.setString(3,lwWholeSalePurePriceDto.getComName());
        dbManager.setDouble(4,lwWholeSalePurePriceDto.getPeoplePrice());
        dbManager.setDouble(5,lwWholeSalePurePriceDto.getNotPeoplePrice());
        dbManager.setDouble(6,lwWholeSalePurePriceDto.getFarmPrice());
        dbManager.setDouble(7,lwWholeSalePurePriceDto.getProducePrice());
        dbManager.setDouble(8,lwWholeSalePurePriceDto.getBusinessPrice());
        dbManager.setDouble(9,lwWholeSalePurePriceDto.getIndustryPrice());
        dbManager.setString(10,lwWholeSalePurePriceDto.getValidStatus());
        dbManager.setString(11,lwWholeSalePurePriceDto.getFlag());
        dbManager.setString(12,lwWholeSalePurePriceDto.getRemark());
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
        buffer.append("INSERT INTO LwWholeSalePurePrice (");
        buffer.append("VoltLevel,");
        buffer.append("ComCode,");
        buffer.append("ComName,");
        buffer.append("PeoplePrice,");
        buffer.append("NotPeoplePrice,");
        buffer.append("FarmPrice,");
        buffer.append("ProducePrice,");
        buffer.append("BusinessPrice,");
        buffer.append("IndustryPrice,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwWholeSalePurePriceDto lwWholeSalePurePriceDto = (LwWholeSalePurePriceDto)i.next();
            dbManager.setString(1,lwWholeSalePurePriceDto.getVoltLevel());
            dbManager.setString(2,lwWholeSalePurePriceDto.getComCode());
            dbManager.setString(3,lwWholeSalePurePriceDto.getComName());
            dbManager.setDouble(4,lwWholeSalePurePriceDto.getPeoplePrice());
            dbManager.setDouble(5,lwWholeSalePurePriceDto.getNotPeoplePrice());
            dbManager.setDouble(6,lwWholeSalePurePriceDto.getFarmPrice());
            dbManager.setDouble(7,lwWholeSalePurePriceDto.getProducePrice());
            dbManager.setDouble(8,lwWholeSalePurePriceDto.getBusinessPrice());
            dbManager.setDouble(9,lwWholeSalePurePriceDto.getIndustryPrice());
            dbManager.setString(10,lwWholeSalePurePriceDto.getValidStatus());
            dbManager.setString(11,lwWholeSalePurePriceDto.getFlag());
            dbManager.setString(12,lwWholeSalePurePriceDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param voltLevel 电压等级
     * @param comCode 公司代码
     * @throws Exception
     */
    public void delete(String voltLevel,String comCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwWholeSalePurePrice ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("VoltLevel=").append("'").append(voltLevel).append("' AND ");
            debugBuffer.append("ComCode=").append("'").append(comCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("VoltLevel = ? And ");
        buffer.append("ComCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,voltLevel);
        dbManager.setString(2,comCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public void update(LwWholeSalePurePriceDto lwWholeSalePurePriceDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwWholeSalePurePrice SET ");
        buffer.append("ComName = ?, ");
        buffer.append("PeoplePrice = ?, ");
        buffer.append("NotPeoplePrice = ?, ");
        buffer.append("FarmPrice = ?, ");
        buffer.append("ProducePrice = ?, ");
        buffer.append("BusinessPrice = ?, ");
        buffer.append("IndustryPrice = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwWholeSalePurePrice SET ");
            debugBuffer.append("ComName = '" + lwWholeSalePurePriceDto.getComName() + "', ");
            debugBuffer.append("PeoplePrice = " + lwWholeSalePurePriceDto.getPeoplePrice() + ", ");
            debugBuffer.append("NotPeoplePrice = " + lwWholeSalePurePriceDto.getNotPeoplePrice() + ", ");
            debugBuffer.append("FarmPrice = " + lwWholeSalePurePriceDto.getFarmPrice() + ", ");
            debugBuffer.append("ProducePrice = " + lwWholeSalePurePriceDto.getProducePrice() + ", ");
            debugBuffer.append("BusinessPrice = " + lwWholeSalePurePriceDto.getBusinessPrice() + ", ");
            debugBuffer.append("IndustryPrice = " + lwWholeSalePurePriceDto.getIndustryPrice() + ", ");
            debugBuffer.append("ValidStatus = '" + lwWholeSalePurePriceDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwWholeSalePurePriceDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwWholeSalePurePriceDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("VoltLevel=").append("'").append(lwWholeSalePurePriceDto.getVoltLevel()).append("' AND ");
            debugBuffer.append("ComCode=").append("'").append(lwWholeSalePurePriceDto.getComCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("VoltLevel = ? And ");
        buffer.append("ComCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwWholeSalePurePriceDto.getComName());
        dbManager.setDouble(2,lwWholeSalePurePriceDto.getPeoplePrice());
        dbManager.setDouble(3,lwWholeSalePurePriceDto.getNotPeoplePrice());
        dbManager.setDouble(4,lwWholeSalePurePriceDto.getFarmPrice());
        dbManager.setDouble(5,lwWholeSalePurePriceDto.getProducePrice());
        dbManager.setDouble(6,lwWholeSalePurePriceDto.getBusinessPrice());
        dbManager.setDouble(7,lwWholeSalePurePriceDto.getIndustryPrice());
        dbManager.setString(8,lwWholeSalePurePriceDto.getValidStatus());
        dbManager.setString(9,lwWholeSalePurePriceDto.getFlag());
        dbManager.setString(10,lwWholeSalePurePriceDto.getRemark());
        //设置条件字段;
        dbManager.setString(11,lwWholeSalePurePriceDto.getVoltLevel());
        dbManager.setString(12,lwWholeSalePurePriceDto.getComCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param voltLevel 电压等级
     * @param comCode 公司代码
     * @return LwWholeSalePurePriceDto
     * @throws Exception
     */
    public LwWholeSalePurePriceDto findByPrimaryKey(String voltLevel,String comCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("VoltLevel,");
        buffer.append("ComCode,");
        buffer.append("ComName,");
        buffer.append("PeoplePrice,");
        buffer.append("NotPeoplePrice,");
        buffer.append("FarmPrice,");
        buffer.append("ProducePrice,");
        buffer.append("BusinessPrice,");
        buffer.append("IndustryPrice,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwWholeSalePurePrice ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("VoltLevel=").append("'").append(voltLevel).append("' AND ");
            debugBuffer.append("ComCode=").append("'").append(comCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("VoltLevel = ? And ");
        buffer.append("ComCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,voltLevel);
        dbManager.setString(2,comCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwWholeSalePurePriceDto lwWholeSalePurePriceDto = null;
        if(resultSet.next()){
            lwWholeSalePurePriceDto = new LwWholeSalePurePriceDto();
            lwWholeSalePurePriceDto.setVoltLevel(dbManager.getString(resultSet,1));
            lwWholeSalePurePriceDto.setComCode(dbManager.getString(resultSet,2));
            lwWholeSalePurePriceDto.setComName(dbManager.getString(resultSet,3));
            lwWholeSalePurePriceDto.setPeoplePrice(dbManager.getDouble(resultSet,4));
            lwWholeSalePurePriceDto.setNotPeoplePrice(dbManager.getDouble(resultSet,5));
            lwWholeSalePurePriceDto.setFarmPrice(dbManager.getDouble(resultSet,6));
            lwWholeSalePurePriceDto.setProducePrice(dbManager.getDouble(resultSet,7));
            lwWholeSalePurePriceDto.setBusinessPrice(dbManager.getDouble(resultSet,8));
            lwWholeSalePurePriceDto.setIndustryPrice(dbManager.getDouble(resultSet,9));
            lwWholeSalePurePriceDto.setValidStatus(dbManager.getString(resultSet,10));
            lwWholeSalePurePriceDto.setFlag(dbManager.getString(resultSet,11));
            lwWholeSalePurePriceDto.setRemark(dbManager.getString(resultSet,12));
        }
        resultSet.close();
        return lwWholeSalePurePriceDto;
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
        buffer.append("VoltLevel,");
        buffer.append("ComCode,");
        buffer.append("ComName,");
        buffer.append("PeoplePrice,");
        buffer.append("NotPeoplePrice,");
        buffer.append("FarmPrice,");
        buffer.append("ProducePrice,");
        buffer.append("BusinessPrice,");
        buffer.append("IndustryPrice,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwWholeSalePurePrice WHERE ");
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
        LwWholeSalePurePriceDto lwWholeSalePurePriceDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwWholeSalePurePriceDto = new LwWholeSalePurePriceDto();
            lwWholeSalePurePriceDto.setVoltLevel(dbManager.getString(resultSet,"VoltLevel"));
            lwWholeSalePurePriceDto.setComCode(dbManager.getString(resultSet,"ComCode"));
            lwWholeSalePurePriceDto.setComName(dbManager.getString(resultSet,"ComName"));
            lwWholeSalePurePriceDto.setPeoplePrice(dbManager.getDouble(resultSet,"PeoplePrice"));
            lwWholeSalePurePriceDto.setNotPeoplePrice(dbManager.getDouble(resultSet,"NotPeoplePrice"));
            lwWholeSalePurePriceDto.setFarmPrice(dbManager.getDouble(resultSet,"FarmPrice"));
            lwWholeSalePurePriceDto.setProducePrice(dbManager.getDouble(resultSet,"ProducePrice"));
            lwWholeSalePurePriceDto.setBusinessPrice(dbManager.getDouble(resultSet,"BusinessPrice"));
            lwWholeSalePurePriceDto.setIndustryPrice(dbManager.getDouble(resultSet,"IndustryPrice"));
            lwWholeSalePurePriceDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwWholeSalePurePriceDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwWholeSalePurePriceDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwWholeSalePurePriceDto);
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
        buffer.append("DELETE FROM LwWholeSalePurePrice WHERE ");
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
        buffer.append("SELECT count(*) FROM LwWholeSalePurePrice WHERE ");
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
