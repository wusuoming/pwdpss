package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCodeDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADCode的数据访问对象基类<br>
 * 创建于 2006-09-08 15:52:39.037<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADCodeBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBIADCodeBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBIADCodeBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void insert(IADCodeDto iADCodeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IADCode (");
        buffer.append("CodeType,");
        buffer.append("CodeCode,");
        buffer.append("CodeCName,");
        buffer.append("CodeEName,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(iADCodeDto.getCodeType()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getCodeCode()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getCodeCName()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getCodeEName()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(iADCodeDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,iADCodeDto.getCodeType());
        dbManager.setString(2,iADCodeDto.getCodeCode());
        dbManager.setString(3,iADCodeDto.getCodeCName());
        dbManager.setString(4,iADCodeDto.getCodeEName());
        dbManager.setString(5,iADCodeDto.getValidStatus());
        dbManager.setString(6,iADCodeDto.getFlag());
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
        buffer.append("INSERT INTO IADCode (");
        buffer.append("CodeType,");
        buffer.append("CodeCode,");
        buffer.append("CodeCName,");
        buffer.append("CodeEName,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            IADCodeDto iADCodeDto = (IADCodeDto)i.next();
            dbManager.setString(1,iADCodeDto.getCodeType());
            dbManager.setString(2,iADCodeDto.getCodeCode());
            dbManager.setString(3,iADCodeDto.getCodeCName());
            dbManager.setString(4,iADCodeDto.getCodeEName());
            dbManager.setString(5,iADCodeDto.getValidStatus());
            dbManager.setString(6,iADCodeDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @throws Exception
     */
    public void delete(String codeType,String codeCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IADCode ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CodeType=").append("'").append(codeType).append("' AND ");
            debugBuffer.append("CodeCode=").append("'").append(codeCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CodeType = ? And ");
        buffer.append("CodeCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,codeType);
        dbManager.setString(2,codeCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void update(IADCodeDto iADCodeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IADCode SET ");
        buffer.append("CodeCName = ?, ");
        buffer.append("CodeEName = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IADCode SET ");
            debugBuffer.append("CodeCName = '" + iADCodeDto.getCodeCName() + "', ");
            debugBuffer.append("CodeEName = '" + iADCodeDto.getCodeEName() + "', ");
            debugBuffer.append("ValidStatus = '" + iADCodeDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + iADCodeDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("CodeType=").append("'").append(iADCodeDto.getCodeType()).append("' AND ");
            debugBuffer.append("CodeCode=").append("'").append(iADCodeDto.getCodeCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CodeType = ? And ");
        buffer.append("CodeCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,iADCodeDto.getCodeCName());
        dbManager.setString(2,iADCodeDto.getCodeEName());
        dbManager.setString(3,iADCodeDto.getValidStatus());
        dbManager.setString(4,iADCodeDto.getFlag());
        //设置条件字段;
        dbManager.setString(5,iADCodeDto.getCodeType());
        dbManager.setString(6,iADCodeDto.getCodeCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @return IADCodeDto
     * @throws Exception
     */
    public IADCodeDto findByPrimaryKey(String codeType,String codeCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("CodeType,");
        buffer.append("CodeCode,");
        buffer.append("CodeCName,");
        buffer.append("CodeEName,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IADCode ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CodeType=").append("'").append(codeType).append("' AND ");
            debugBuffer.append("CodeCode=").append("'").append(codeCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CodeType = ? And ");
        buffer.append("CodeCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,codeType);
        dbManager.setString(2,codeCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        IADCodeDto iADCodeDto = null;
        if(resultSet.next()){
            iADCodeDto = new IADCodeDto();
            iADCodeDto.setCodeType(dbManager.getString(resultSet,1));
            iADCodeDto.setCodeCode(dbManager.getString(resultSet,2));
            iADCodeDto.setCodeCName(dbManager.getString(resultSet,3));
            iADCodeDto.setCodeEName(dbManager.getString(resultSet,4));
            iADCodeDto.setValidStatus(dbManager.getString(resultSet,5));
            iADCodeDto.setFlag(dbManager.getString(resultSet,6));
        }
        resultSet.close();
        return iADCodeDto;
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
        buffer.append("CodeType,");
        buffer.append("CodeCode,");
        buffer.append("CodeCName,");
        buffer.append("CodeEName,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IADCode WHERE ");
        buffer.append(conditions);
        boolean supportPaging = false;//数据库是否支持分页
        if (pageNo > 0){
            //目前只对Oracle优化
            if(dbManager.getConnection().getMetaData().getDatabaseProductName().equalsIgnoreCase("Oracle")){
                buffer.insert(0,"SELECT * FROM ( SELECT row_.*, rownum rownum_ FROM (");
                buffer.append(") row_ WHERE rownum <= "+rowsPerPage * pageNo+") WHERE rownum_ > "+rowsPerPage * (pageNo - 1));
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
        IADCodeDto iADCodeDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            iADCodeDto = new IADCodeDto();
            iADCodeDto.setCodeType(dbManager.getString(resultSet,1));
            iADCodeDto.setCodeCode(dbManager.getString(resultSet,2));
            iADCodeDto.setCodeCName(dbManager.getString(resultSet,3));
            iADCodeDto.setCodeEName(dbManager.getString(resultSet,4));
            iADCodeDto.setValidStatus(dbManager.getString(resultSet,5));
            iADCodeDto.setFlag(dbManager.getString(resultSet,6));
            collection.add(iADCodeDto);
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
        buffer.append("DELETE FROM IADCode WHERE ");
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
        buffer.append("SELECT count(*) FROM IADCode WHERE ");
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
