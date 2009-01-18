package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwBookUserDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwBookUser-表本用户对照表的数据访问对象基类<br>
 */
public class DBLwBookUserBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwBookUserBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwBookUserBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public void insert(LwBookUserDto lwBookUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwBookUser (");
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("UserNo,");
        buffer.append("SerialNo,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwBookUserDto.getBookNo()).append("',");
            debugBuffer.append("'").append(lwBookUserDto.getBookName()).append("',");
            debugBuffer.append("'").append(lwBookUserDto.getUserNo()).append("',");
            debugBuffer.append("").append(lwBookUserDto.getSerialNo()).append(",");
            debugBuffer.append("'").append(lwBookUserDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwBookUserDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwBookUserDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwBookUserDto.getBookNo());
        dbManager.setString(2,lwBookUserDto.getBookName());
        dbManager.setString(3,lwBookUserDto.getUserNo());
        dbManager.setInt(4,lwBookUserDto.getSerialNo());
        dbManager.setString(5,lwBookUserDto.getRemark());
        dbManager.setString(6,lwBookUserDto.getValidStatus());
        dbManager.setString(7,lwBookUserDto.getFlag());
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
        buffer.append("INSERT INTO LwBookUser (");
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("UserNo,");
        buffer.append("SerialNo,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwBookUserDto lwBookUserDto = (LwBookUserDto)i.next();
            dbManager.setString(1,lwBookUserDto.getBookNo());
            dbManager.setString(2,lwBookUserDto.getBookName());
            dbManager.setString(3,lwBookUserDto.getUserNo());
            dbManager.setInt(4,lwBookUserDto.getSerialNo());
            dbManager.setString(5,lwBookUserDto.getRemark());
            dbManager.setString(6,lwBookUserDto.getValidStatus());
            dbManager.setString(7,lwBookUserDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param bookNo 表本号
     * @param userNo 用户代码
     * @throws Exception
     */
    public void delete(String bookNo,String userNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwBookUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("BookNo=").append("'").append(bookNo).append("' AND ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("BookNo = ? And ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,bookNo);
        dbManager.setString(2,userNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public void update(LwBookUserDto lwBookUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwBookUser SET ");
        buffer.append("BookName = ?, ");
        buffer.append("SerialNo = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwBookUser SET ");
            debugBuffer.append("BookName = '" + lwBookUserDto.getBookName() + "', ");
            debugBuffer.append("SerialNo = " + lwBookUserDto.getSerialNo() + ", ");
            debugBuffer.append("Remark = '" + lwBookUserDto.getRemark() + "', ");
            debugBuffer.append("ValidStatus = '" + lwBookUserDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwBookUserDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("BookNo=").append("'").append(lwBookUserDto.getBookNo()).append("' AND ");
            debugBuffer.append("UserNo=").append("'").append(lwBookUserDto.getUserNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("BookNo = ? And ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwBookUserDto.getBookName());
        dbManager.setInt(2,lwBookUserDto.getSerialNo());
        dbManager.setString(3,lwBookUserDto.getRemark());
        dbManager.setString(4,lwBookUserDto.getValidStatus());
        dbManager.setString(5,lwBookUserDto.getFlag());
        //设置条件字段;
        dbManager.setString(6,lwBookUserDto.getBookNo());
        dbManager.setString(7,lwBookUserDto.getUserNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param bookNo 表本号
     * @param userNo 用户代码
     * @return LwBookUserDto
     * @throws Exception
     */
    public LwBookUserDto findByPrimaryKey(String bookNo,String userNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("UserNo,");
        buffer.append("SerialNo,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM LwBookUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("BookNo=").append("'").append(bookNo).append("' AND ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("BookNo = ? And ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,bookNo);
        dbManager.setString(2,userNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwBookUserDto lwBookUserDto = null;
        if(resultSet.next()){
            lwBookUserDto = new LwBookUserDto();
            lwBookUserDto.setBookNo(dbManager.getString(resultSet,1));
            lwBookUserDto.setBookName(dbManager.getString(resultSet,2));
            lwBookUserDto.setUserNo(dbManager.getString(resultSet,3));
            lwBookUserDto.setSerialNo(dbManager.getInt(resultSet,4));
            lwBookUserDto.setRemark(dbManager.getString(resultSet,5));
            lwBookUserDto.setValidStatus(dbManager.getString(resultSet,6));
            lwBookUserDto.setFlag(dbManager.getString(resultSet,7));
        }
        resultSet.close();
        return lwBookUserDto;
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
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("UserNo,");
        buffer.append("SerialNo,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM LwBookUser WHERE ");
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
        LwBookUserDto lwBookUserDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwBookUserDto = new LwBookUserDto();
            lwBookUserDto.setBookNo(dbManager.getString(resultSet,"BookNo"));
            lwBookUserDto.setBookName(dbManager.getString(resultSet,"BookName"));
            lwBookUserDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwBookUserDto.setSerialNo(dbManager.getInt(resultSet,"SerialNo"));
            lwBookUserDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwBookUserDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwBookUserDto.setFlag(dbManager.getString(resultSet,"Flag"));
            collection.add(lwBookUserDto);
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
        buffer.append("DELETE FROM LwBookUser WHERE ");
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
        buffer.append("SELECT count(*) FROM LwBookUser WHERE ");
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
