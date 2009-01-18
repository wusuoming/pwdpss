package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwAmmeterBook-表本信息表的数据访问对象基类<br>
 */
public class DBLwAmmeterBookBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwAmmeterBookBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwAmmeterBookBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void insert(LwAmmeterBookDto lwAmmeterBookDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwAmmeterBook (");
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("BookType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwAmmeterBookDto.getBookNo()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getBookName()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getBookType()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwAmmeterBookDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwAmmeterBookDto.getBookNo());
        dbManager.setString(2,lwAmmeterBookDto.getBookName());
        dbManager.setString(3,lwAmmeterBookDto.getBookType());
        dbManager.setString(4,lwAmmeterBookDto.getRemark());
        dbManager.setString(5,lwAmmeterBookDto.getValidStatus());
        dbManager.setString(6,lwAmmeterBookDto.getFlag());
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
        buffer.append("INSERT INTO LwAmmeterBook (");
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("BookType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwAmmeterBookDto lwAmmeterBookDto = (LwAmmeterBookDto)i.next();
            dbManager.setString(1,lwAmmeterBookDto.getBookNo());
            dbManager.setString(2,lwAmmeterBookDto.getBookName());
            dbManager.setString(3,lwAmmeterBookDto.getBookType());
            dbManager.setString(4,lwAmmeterBookDto.getRemark());
            dbManager.setString(5,lwAmmeterBookDto.getValidStatus());
            dbManager.setString(6,lwAmmeterBookDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param bookNo 表本号
     * @throws Exception
     */
    public void delete(String bookNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwAmmeterBook ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("BookNo=").append("'").append(bookNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("BookNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,bookNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void update(LwAmmeterBookDto lwAmmeterBookDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwAmmeterBook SET ");
        buffer.append("BookName = ?, ");
        buffer.append("BookType = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwAmmeterBook SET ");
            debugBuffer.append("BookName = '" + lwAmmeterBookDto.getBookName() + "', ");
            debugBuffer.append("BookType = '" + lwAmmeterBookDto.getBookType() + "', ");
            debugBuffer.append("Remark = '" + lwAmmeterBookDto.getRemark() + "', ");
            debugBuffer.append("ValidStatus = '" + lwAmmeterBookDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwAmmeterBookDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("BookNo=").append("'").append(lwAmmeterBookDto.getBookNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("BookNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwAmmeterBookDto.getBookName());
        dbManager.setString(2,lwAmmeterBookDto.getBookType());
        dbManager.setString(3,lwAmmeterBookDto.getRemark());
        dbManager.setString(4,lwAmmeterBookDto.getValidStatus());
        dbManager.setString(5,lwAmmeterBookDto.getFlag());
        //设置条件字段;
        dbManager.setString(6,lwAmmeterBookDto.getBookNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param bookNo 表本号
     * @return LwAmmeterBookDto
     * @throws Exception
     */
    public LwAmmeterBookDto findByPrimaryKey(String bookNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("BookNo,");
        buffer.append("BookName,");
        buffer.append("BookType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM LwAmmeterBook ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("BookNo=").append("'").append(bookNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("BookNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,bookNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwAmmeterBookDto lwAmmeterBookDto = null;
        if(resultSet.next()){
            lwAmmeterBookDto = new LwAmmeterBookDto();
            lwAmmeterBookDto.setBookNo(dbManager.getString(resultSet,1));
            lwAmmeterBookDto.setBookName(dbManager.getString(resultSet,2));
            lwAmmeterBookDto.setBookType(dbManager.getString(resultSet,3));
            lwAmmeterBookDto.setRemark(dbManager.getString(resultSet,4));
            lwAmmeterBookDto.setValidStatus(dbManager.getString(resultSet,5));
            lwAmmeterBookDto.setFlag(dbManager.getString(resultSet,6));
        }
        resultSet.close();
        return lwAmmeterBookDto;
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
        buffer.append("BookType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM LwAmmeterBook WHERE ");
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
        LwAmmeterBookDto lwAmmeterBookDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwAmmeterBookDto = new LwAmmeterBookDto();
            lwAmmeterBookDto.setBookNo(dbManager.getString(resultSet,"BookNo"));
            lwAmmeterBookDto.setBookName(dbManager.getString(resultSet,"BookName"));
            lwAmmeterBookDto.setBookType(dbManager.getString(resultSet,"BookType"));
            lwAmmeterBookDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwAmmeterBookDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwAmmeterBookDto.setFlag(dbManager.getString(resultSet,"Flag"));
            collection.add(lwAmmeterBookDto);
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
        buffer.append("DELETE FROM LwAmmeterBook WHERE ");
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
        buffer.append("SELECT count(*) FROM LwAmmeterBook WHERE ");
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
