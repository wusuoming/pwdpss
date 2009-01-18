package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADFileDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADFile的数据访问对象基类<br>
 * 创建于 2007-12-10 14:28:39.015<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADFileBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBIADFileBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBIADFileBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void insert(IADFileDto iADFileDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IADFile (");
        buffer.append("ContactNo,");
        buffer.append("FileName,");
        buffer.append("FileUuid,");
        buffer.append("UpLoadDate,");
        buffer.append("CompanyCode ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(iADFileDto.getContactNo()).append("',");
            debugBuffer.append("'").append(iADFileDto.getFileName()).append("',");
            debugBuffer.append("'").append(iADFileDto.getFileUuid()).append("',");
            debugBuffer.append("'").append(iADFileDto.getUpLoadDate()).append("',");
            debugBuffer.append("'").append(iADFileDto.getCompanyCode()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,iADFileDto.getContactNo());
        dbManager.setString(2,iADFileDto.getFileName());
        dbManager.setString(3,iADFileDto.getFileUuid());
        dbManager.setDateTime(4,iADFileDto.getUpLoadDate());
        dbManager.setString(5,iADFileDto.getCompanyCode());
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
        buffer.append("INSERT INTO IADFile (");
        buffer.append("ContactNo,");
        buffer.append("FileName,");
        buffer.append("FileUuid,");
        buffer.append("UpLoadDate,");
        buffer.append("CompanyCode ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            IADFileDto iADFileDto = (IADFileDto)i.next();
            dbManager.setString(1,iADFileDto.getContactNo());
            dbManager.setString(2,iADFileDto.getFileName());
            dbManager.setString(3,iADFileDto.getFileUuid());
            dbManager.setDateTime(4,iADFileDto.getUpLoadDate());
            dbManager.setString(5,iADFileDto.getCompanyCode());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param contactNo ContactNo
     * @param fileUuid FileUuid
     * @throws Exception
     */
    public void delete(String contactNo,String fileUuid)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IADFile ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(contactNo).append("' AND ");
            debugBuffer.append("FileUuid=").append("'").append(fileUuid).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ContactNo = ? And ");
        buffer.append("FileUuid = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,contactNo);
        dbManager.setString(2,fileUuid);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void update(IADFileDto iADFileDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IADFile SET ");
        buffer.append("FileName = ?, ");
        buffer.append("UpLoadDate = ?, ");
        buffer.append("CompanyCode = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IADFile SET ");
            debugBuffer.append("FileName = '" + iADFileDto.getFileName() + "', ");
            debugBuffer.append("UpLoadDate = '" + iADFileDto.getUpLoadDate() + "', ");
            debugBuffer.append("CompanyCode = '" + iADFileDto.getCompanyCode() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(iADFileDto.getContactNo()).append("' AND ");
            debugBuffer.append("FileUuid=").append("'").append(iADFileDto.getFileUuid()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ContactNo = ? And ");
        buffer.append("FileUuid = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,iADFileDto.getFileName());
        dbManager.setDateTime(2,iADFileDto.getUpLoadDate());
        dbManager.setString(3,iADFileDto.getCompanyCode());
        //设置条件字段;
        dbManager.setString(4,iADFileDto.getContactNo());
        dbManager.setString(5,iADFileDto.getFileUuid());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param contactNo ContactNo
     * @param fileUuid FileUuid
     * @return IADFileDto
     * @throws Exception
     */
    public IADFileDto findByPrimaryKey(String contactNo,String fileUuid)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("ContactNo,");
        buffer.append("FileName,");
        buffer.append("FileUuid,");
        buffer.append("UpLoadDate,");
        buffer.append("CompanyCode ");
        buffer.append("FROM IADFile ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(contactNo).append("' AND ");
            debugBuffer.append("FileUuid=").append("'").append(fileUuid).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ContactNo = ? And ");
        buffer.append("FileUuid = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,contactNo);
        dbManager.setString(2,fileUuid);
        ResultSet resultSet = dbManager.executePreparedQuery();
        IADFileDto iADFileDto = null;
        if(resultSet.next()){
            iADFileDto = new IADFileDto();
            iADFileDto.setContactNo(dbManager.getString(resultSet,1));
            iADFileDto.setFileName(dbManager.getString(resultSet,2));
            iADFileDto.setFileUuid(dbManager.getString(resultSet,3));
            iADFileDto.setUpLoadDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_SECOND,4));
            iADFileDto.setCompanyCode(dbManager.getString(resultSet,5));
        }
        resultSet.close();
        return iADFileDto;
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
        buffer.append("ContactNo,");
        buffer.append("FileName,");
        buffer.append("FileUuid,");
        buffer.append("UpLoadDate,");
        buffer.append("CompanyCode ");
        buffer.append("FROM IADFile WHERE ");
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
        IADFileDto iADFileDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            iADFileDto = new IADFileDto();
            iADFileDto.setContactNo(dbManager.getString(resultSet,1));
            iADFileDto.setFileName(dbManager.getString(resultSet,2));
            iADFileDto.setFileUuid(dbManager.getString(resultSet,3));
            iADFileDto.setUpLoadDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_SECOND,4));
            iADFileDto.setCompanyCode(dbManager.getString(resultSet,5));
            collection.add(iADFileDto);
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
        buffer.append("DELETE FROM IADFile WHERE ");
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
        buffer.append("SELECT count(*) FROM IADFile WHERE ");
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
