package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IASysUserDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IASysUser的数据访问对象基类<br>
 * 创建于 2006-09-08 15:52:53.577<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIASysUserBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBIASysUserBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBIASysUserBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void insert(IASysUserDto iASysUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IASysUser (");
        buffer.append("UserCode,");
        buffer.append("AreaCode,");
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(iASysUserDto.getUserCode()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getAreaCode()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getUserName()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getPassword()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getCompanyCode()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getPhoneNumber()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getEmail()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getFax()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getUserGrade()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(iASysUserDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,iASysUserDto.getUserCode());
        dbManager.setString(2,iASysUserDto.getAreaCode());
        dbManager.setString(3,iASysUserDto.getUserName());
        dbManager.setString(4,iASysUserDto.getPassword());
        dbManager.setString(5,iASysUserDto.getCompanyCode());
        dbManager.setString(6,iASysUserDto.getPhoneNumber());
        dbManager.setString(7,iASysUserDto.getEmail());
        dbManager.setString(8,iASysUserDto.getFax());
        dbManager.setString(9,iASysUserDto.getUserGrade());
        dbManager.setString(10,iASysUserDto.getValidStatus());
        dbManager.setString(11,iASysUserDto.getFlag());
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
        buffer.append("INSERT INTO IASysUser (");
        buffer.append("UserCode,");
        buffer.append("AreaCode,");
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            IASysUserDto iASysUserDto = (IASysUserDto)i.next();
            dbManager.setString(1,iASysUserDto.getUserCode());
            dbManager.setString(2,iASysUserDto.getAreaCode());
            dbManager.setString(3,iASysUserDto.getUserName());
            dbManager.setString(4,iASysUserDto.getPassword());
            dbManager.setString(5,iASysUserDto.getCompanyCode());
            dbManager.setString(6,iASysUserDto.getPhoneNumber());
            dbManager.setString(7,iASysUserDto.getEmail());
            dbManager.setString(8,iASysUserDto.getFax());
            dbManager.setString(9,iASysUserDto.getUserGrade());
            dbManager.setString(10,iASysUserDto.getValidStatus());
            dbManager.setString(11,iASysUserDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(String userCode,String areaCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IASysUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserCode=").append("'").append(userCode).append("' AND ");
            debugBuffer.append("AreaCode=").append("'").append(areaCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserCode = ? And ");
        buffer.append("AreaCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userCode);
        dbManager.setString(2,areaCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void update(IASysUserDto iASysUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IASysUser SET ");
        buffer.append("UserName = ?, ");
        buffer.append("Password = ?, ");
        buffer.append("CompanyCode = ?, ");
        buffer.append("PhoneNumber = ?, ");
        buffer.append("Email = ?, ");
        buffer.append("Fax = ?, ");
        buffer.append("UserGrade = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IASysUser SET ");
            debugBuffer.append("UserName = '" + iASysUserDto.getUserName() + "', ");
            debugBuffer.append("Password = '" + iASysUserDto.getPassword() + "', ");
            debugBuffer.append("CompanyCode = '" + iASysUserDto.getCompanyCode() + "', ");
            debugBuffer.append("PhoneNumber = '" + iASysUserDto.getPhoneNumber() + "', ");
            debugBuffer.append("Email = '" + iASysUserDto.getEmail() + "', ");
            debugBuffer.append("Fax = '" + iASysUserDto.getFax() + "', ");
            debugBuffer.append("UserGrade = '" + iASysUserDto.getUserGrade() + "', ");
            debugBuffer.append("ValidStatus = '" + iASysUserDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + iASysUserDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserCode=").append("'").append(iASysUserDto.getUserCode()).append("' AND ");
            debugBuffer.append("AreaCode=").append("'").append(iASysUserDto.getAreaCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserCode = ? And ");
        buffer.append("AreaCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,iASysUserDto.getUserName());
        dbManager.setString(2,iASysUserDto.getPassword());
        dbManager.setString(3,iASysUserDto.getCompanyCode());
        dbManager.setString(4,iASysUserDto.getPhoneNumber());
        dbManager.setString(5,iASysUserDto.getEmail());
        dbManager.setString(6,iASysUserDto.getFax());
        dbManager.setString(7,iASysUserDto.getUserGrade());
        dbManager.setString(8,iASysUserDto.getValidStatus());
        dbManager.setString(9,iASysUserDto.getFlag());
        //设置条件字段;
        dbManager.setString(10,iASysUserDto.getUserCode());
        dbManager.setString(11,iASysUserDto.getAreaCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @return IASysUserDto
     * @throws Exception
     */
    public IASysUserDto findByPrimaryKey(String userCode,String areaCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserCode,");
        buffer.append("AreaCode,");
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IASysUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserCode=").append("'").append(userCode).append("' AND ");
            debugBuffer.append("AreaCode=").append("'").append(areaCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserCode = ? And ");
        buffer.append("AreaCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userCode);
        dbManager.setString(2,areaCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        IASysUserDto iASysUserDto = null;
        if(resultSet.next()){
            iASysUserDto = new IASysUserDto();
            iASysUserDto.setUserCode(dbManager.getString(resultSet,1));
            iASysUserDto.setAreaCode(dbManager.getString(resultSet,2));
            iASysUserDto.setUserName(dbManager.getString(resultSet,3));
            iASysUserDto.setPassword(dbManager.getString(resultSet,4));
            iASysUserDto.setCompanyCode(dbManager.getString(resultSet,5));
            iASysUserDto.setPhoneNumber(dbManager.getString(resultSet,6));
            iASysUserDto.setEmail(dbManager.getString(resultSet,7));
            iASysUserDto.setFax(dbManager.getString(resultSet,8));
            iASysUserDto.setUserGrade(dbManager.getString(resultSet,9));
            iASysUserDto.setValidStatus(dbManager.getString(resultSet,10));
            iASysUserDto.setFlag(dbManager.getString(resultSet,11));
        }
        resultSet.close();
        return iASysUserDto;
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
        buffer.append("UserCode,");
        buffer.append("AreaCode,");
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IASysUser WHERE ");
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
        IASysUserDto iASysUserDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            iASysUserDto = new IASysUserDto();
            iASysUserDto.setUserCode(dbManager.getString(resultSet,1));
            iASysUserDto.setAreaCode(dbManager.getString(resultSet,2));
            iASysUserDto.setUserName(dbManager.getString(resultSet,3));
            iASysUserDto.setPassword(dbManager.getString(resultSet,4));
            iASysUserDto.setCompanyCode(dbManager.getString(resultSet,5));
            iASysUserDto.setPhoneNumber(dbManager.getString(resultSet,6));
            iASysUserDto.setEmail(dbManager.getString(resultSet,7));
            iASysUserDto.setFax(dbManager.getString(resultSet,8));
            iASysUserDto.setUserGrade(dbManager.getString(resultSet,9));
            iASysUserDto.setValidStatus(dbManager.getString(resultSet,10));
            iASysUserDto.setFlag(dbManager.getString(resultSet,11));
            collection.add(iASysUserDto);
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
        buffer.append("DELETE FROM IASysUser WHERE ");
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
        buffer.append("SELECT count(*) FROM IASysUser WHERE ");
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
