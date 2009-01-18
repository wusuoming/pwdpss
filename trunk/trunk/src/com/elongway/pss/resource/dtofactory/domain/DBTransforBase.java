package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.TransforDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是Transfor-变压器信息的数据访问对象基类<br>
 */
public class DBTransforBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBTransforBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBTransforBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param transforDto transforDto
     * @throws Exception
     */
    public void insert(TransforDto transforDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO Transfor (");
        buffer.append("TransforName,");
        buffer.append("Phone,");
        buffer.append("KongzaiLoss,");
        buffer.append("SuplyHour,");
        buffer.append("DuanluLoss,");
        buffer.append("ContentPower,");
        buffer.append("UseHour,");
        buffer.append("KongzaiCT,");
        buffer.append("DuanluPT,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(transforDto.getTransforName()).append("',");
            debugBuffer.append("'").append(transforDto.getPhone()).append("',");
            debugBuffer.append("").append(transforDto.getKongzaiLoss()).append(",");
            debugBuffer.append("").append(transforDto.getSuplyHour()).append(",");
            debugBuffer.append("").append(transforDto.getDuanluLoss()).append(",");
            debugBuffer.append("").append(transforDto.getContentPower()).append(",");
            debugBuffer.append("").append(transforDto.getUseHour()).append(",");
            debugBuffer.append("").append(transforDto.getKongzaiCT()).append(",");
            debugBuffer.append("").append(transforDto.getDuanluPT()).append(",");
            debugBuffer.append("'").append(transforDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(transforDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,transforDto.getTransforName());
        dbManager.setString(2,transforDto.getPhone());
        dbManager.setDouble(3,transforDto.getKongzaiLoss());
        dbManager.setDouble(4,transforDto.getSuplyHour());
        dbManager.setDouble(5,transforDto.getDuanluLoss());
        dbManager.setDouble(6,transforDto.getContentPower());
        dbManager.setDouble(7,transforDto.getUseHour());
        dbManager.setDouble(8,transforDto.getKongzaiCT());
        dbManager.setDouble(9,transforDto.getDuanluPT());
        dbManager.setString(10,transforDto.getValidStatus());
        dbManager.setString(11,transforDto.getFlag());
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
        buffer.append("INSERT INTO Transfor (");
        buffer.append("TransforName,");
        buffer.append("Phone,");
        buffer.append("KongzaiLoss,");
        buffer.append("SuplyHour,");
        buffer.append("DuanluLoss,");
        buffer.append("ContentPower,");
        buffer.append("UseHour,");
        buffer.append("KongzaiCT,");
        buffer.append("DuanluPT,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            TransforDto transforDto = (TransforDto)i.next();
            dbManager.setString(1,transforDto.getTransforName());
            dbManager.setString(2,transforDto.getPhone());
            dbManager.setDouble(3,transforDto.getKongzaiLoss());
            dbManager.setDouble(4,transforDto.getSuplyHour());
            dbManager.setDouble(5,transforDto.getDuanluLoss());
            dbManager.setDouble(6,transforDto.getContentPower());
            dbManager.setDouble(7,transforDto.getUseHour());
            dbManager.setDouble(8,transforDto.getKongzaiCT());
            dbManager.setDouble(9,transforDto.getDuanluPT());
            dbManager.setString(10,transforDto.getValidStatus());
            dbManager.setString(11,transforDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param transforName 变压器名称
     * @throws Exception
     */
    public void delete(String transforName)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM Transfor ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("TransforName=").append("'").append(transforName).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("TransforName = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,transforName);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param transforDto transforDto
     * @throws Exception
     */
    public void update(TransforDto transforDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE Transfor SET ");
        buffer.append("Phone = ?, ");
        buffer.append("KongzaiLoss = ?, ");
        buffer.append("SuplyHour = ?, ");
        buffer.append("DuanluLoss = ?, ");
        buffer.append("ContentPower = ?, ");
        buffer.append("UseHour = ?, ");
        buffer.append("KongzaiCT = ?, ");
        buffer.append("DuanluPT = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE Transfor SET ");
            debugBuffer.append("Phone = '" + transforDto.getPhone() + "', ");
            debugBuffer.append("KongzaiLoss = " + transforDto.getKongzaiLoss() + ", ");
            debugBuffer.append("SuplyHour = " + transforDto.getSuplyHour() + ", ");
            debugBuffer.append("DuanluLoss = " + transforDto.getDuanluLoss() + ", ");
            debugBuffer.append("ContentPower = " + transforDto.getContentPower() + ", ");
            debugBuffer.append("UseHour = " + transforDto.getUseHour() + ", ");
            debugBuffer.append("KongzaiCT = " + transforDto.getKongzaiCT() + ", ");
            debugBuffer.append("DuanluPT = " + transforDto.getDuanluPT() + ", ");
            debugBuffer.append("ValidStatus = '" + transforDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + transforDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("TransforName=").append("'").append(transforDto.getTransforName()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("TransforName = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,transforDto.getPhone());
        dbManager.setDouble(2,transforDto.getKongzaiLoss());
        dbManager.setDouble(3,transforDto.getSuplyHour());
        dbManager.setDouble(4,transforDto.getDuanluLoss());
        dbManager.setDouble(5,transforDto.getContentPower());
        dbManager.setDouble(6,transforDto.getUseHour());
        dbManager.setDouble(7,transforDto.getKongzaiCT());
        dbManager.setDouble(8,transforDto.getDuanluPT());
        dbManager.setString(9,transforDto.getValidStatus());
        dbManager.setString(10,transforDto.getFlag());
        //设置条件字段;
        dbManager.setString(11,transforDto.getTransforName());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param transforName 变压器名称
     * @return TransforDto
     * @throws Exception
     */
    public TransforDto findByPrimaryKey(String transforName)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("TransforName,");
        buffer.append("Phone,");
        buffer.append("KongzaiLoss,");
        buffer.append("SuplyHour,");
        buffer.append("DuanluLoss,");
        buffer.append("ContentPower,");
        buffer.append("UseHour,");
        buffer.append("KongzaiCT,");
        buffer.append("DuanluPT,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM Transfor ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("TransforName=").append("'").append(transforName).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("TransforName = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,transforName);
        ResultSet resultSet = dbManager.executePreparedQuery();
        TransforDto transforDto = null;
        if(resultSet.next()){
            transforDto = new TransforDto();
            transforDto.setTransforName(dbManager.getString(resultSet,1));
            transforDto.setPhone(dbManager.getString(resultSet,2));
            transforDto.setKongzaiLoss(dbManager.getDouble(resultSet,3));
            transforDto.setSuplyHour(dbManager.getDouble(resultSet,4));
            transforDto.setDuanluLoss(dbManager.getDouble(resultSet,5));
            transforDto.setContentPower(dbManager.getDouble(resultSet,6));
            transforDto.setUseHour(dbManager.getDouble(resultSet,7));
            transforDto.setKongzaiCT(dbManager.getDouble(resultSet,8));
            transforDto.setDuanluPT(dbManager.getDouble(resultSet,9));
            transforDto.setValidStatus(dbManager.getString(resultSet,10));
            transforDto.setFlag(dbManager.getString(resultSet,11));
        }
        resultSet.close();
        return transforDto;
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
        buffer.append("TransforName,");
        buffer.append("Phone,");
        buffer.append("KongzaiLoss,");
        buffer.append("SuplyHour,");
        buffer.append("DuanluLoss,");
        buffer.append("ContentPower,");
        buffer.append("UseHour,");
        buffer.append("KongzaiCT,");
        buffer.append("DuanluPT,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM Transfor WHERE ");
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
        TransforDto transforDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            transforDto = new TransforDto();
            transforDto.setTransforName(dbManager.getString(resultSet,"TransforName"));
            transforDto.setPhone(dbManager.getString(resultSet,"Phone"));
            transforDto.setKongzaiLoss(dbManager.getDouble(resultSet,"KongzaiLoss"));
            transforDto.setSuplyHour(dbManager.getDouble(resultSet,"SuplyHour"));
            transforDto.setDuanluLoss(dbManager.getDouble(resultSet,"DuanluLoss"));
            transforDto.setContentPower(dbManager.getDouble(resultSet,"ContentPower"));
            transforDto.setUseHour(dbManager.getDouble(resultSet,"UseHour"));
            transforDto.setKongzaiCT(dbManager.getDouble(resultSet,"KongzaiCT"));
            transforDto.setDuanluPT(dbManager.getDouble(resultSet,"DuanluPT"));
            transforDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            transforDto.setFlag(dbManager.getString(resultSet,"Flag"));
            collection.add(transforDto);
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
        buffer.append("DELETE FROM Transfor WHERE ");
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
        buffer.append("SELECT count(*) FROM Transfor WHERE ");
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
