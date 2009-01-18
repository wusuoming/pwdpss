package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWLineAmmeter-线路电表对照表的数据访问对象基类<br>
 */
public class DBLwLineAmmeterBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwLineAmmeterBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwLineAmmeterBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public void insert(LwLineAmmeterDto lwLineAmmeterDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwLineAmmeter (");
        buffer.append("LineCode,");
        buffer.append("AmmeterNo,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwLineAmmeterDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwLineAmmeterDto.getAmmeterNo()).append("',");
            debugBuffer.append("'").append(lwLineAmmeterDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwLineAmmeterDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwLineAmmeterDto.getInputDate()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwLineAmmeterDto.getLineCode());
        dbManager.setString(2,lwLineAmmeterDto.getAmmeterNo());
        dbManager.setString(3,lwLineAmmeterDto.getValidStatus());
        dbManager.setString(4,lwLineAmmeterDto.getFlag());
        dbManager.setString(5,lwLineAmmeterDto.getInputDate());
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
        buffer.append("INSERT INTO LwLineAmmeter (");
        buffer.append("LineCode,");
        buffer.append("AmmeterNo,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwLineAmmeterDto lwLineAmmeterDto = (LwLineAmmeterDto)i.next();
            dbManager.setString(1,lwLineAmmeterDto.getLineCode());
            dbManager.setString(2,lwLineAmmeterDto.getAmmeterNo());
            dbManager.setString(3,lwLineAmmeterDto.getValidStatus());
            dbManager.setString(4,lwLineAmmeterDto.getFlag());
            dbManager.setString(5,lwLineAmmeterDto.getInputDate());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param lineCode 线路代码
     * @param ammeterNo 表号
     * @throws Exception
     */
    public void delete(String lineCode,String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwLineAmmeter ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,ammeterNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public void update(LwLineAmmeterDto lwLineAmmeterDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwLineAmmeter SET ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("InputDate = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwLineAmmeter SET ");
            debugBuffer.append("ValidStatus = '" + lwLineAmmeterDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwLineAmmeterDto.getFlag() + "', ");
            debugBuffer.append("InputDate = '" + lwLineAmmeterDto.getInputDate()  + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lwLineAmmeterDto.getLineCode()).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(lwLineAmmeterDto.getAmmeterNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwLineAmmeterDto.getValidStatus());
        dbManager.setString(2,lwLineAmmeterDto.getFlag());
        dbManager.setString(3,lwLineAmmeterDto.getInputDate() );
        //设置条件字段;
        dbManager.setString(4,lwLineAmmeterDto.getLineCode());
        dbManager.setString(5,lwLineAmmeterDto.getAmmeterNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param lineCode 线路代码
     * @param ammeterNo 表号
     * @return LwLineAmmeterDto
     * @throws Exception
     */
    public LwLineAmmeterDto findByPrimaryKey(String lineCode,String ammeterNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("AmmeterNo,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append("FROM LwLineAmmeter ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("AmmeterNo=").append("'").append(ammeterNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("AmmeterNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,ammeterNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwLineAmmeterDto lwLineAmmeterDto = null;
        if(resultSet.next()){
            lwLineAmmeterDto = new LwLineAmmeterDto();
            lwLineAmmeterDto.setLineCode(dbManager.getString(resultSet,1));
            lwLineAmmeterDto.setAmmeterNo(dbManager.getString(resultSet,2));
            lwLineAmmeterDto.setValidStatus(dbManager.getString(resultSet,3));
            lwLineAmmeterDto.setFlag(dbManager.getString(resultSet,4));
            lwLineAmmeterDto.setInputDate(dbManager.getString(resultSet,5));
        }
        resultSet.close();
        return lwLineAmmeterDto;
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
        buffer.append("LineCode,");
        buffer.append("AmmeterNo,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append("FROM LwLineAmmeter WHERE ");
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
        	System.out.println(buffer.toString());
            logger.debug(buffer.toString());
        }
        ResultSet resultSet = dbManager.executeQuery(buffer.toString());
        int count=0;
        if(supportPaging==false && pageNo>1){
            dbManager.locate(resultSet,rowsPerPage * (pageNo - 1));
        }

        //定义返回结果集合
        Collection collection = new ArrayList(rowsPerPage);
        LwLineAmmeterDto lwLineAmmeterDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwLineAmmeterDto = new LwLineAmmeterDto();
            lwLineAmmeterDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwLineAmmeterDto.setAmmeterNo(dbManager.getString(resultSet,"AmmeterNo"));
            lwLineAmmeterDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwLineAmmeterDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwLineAmmeterDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            collection.add(lwLineAmmeterDto);
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
        buffer.append("DELETE FROM LwLineAmmeter WHERE ");
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
        buffer.append("SELECT count(*) FROM LwLineAmmeter WHERE ");
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
