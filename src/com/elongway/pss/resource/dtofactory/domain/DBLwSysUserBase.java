package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSysUserDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWSysUser-登录用户表的数据访问对象基类<br>
 */
public class DBLwSysUserBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwSysUserBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwSysUserBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void insert(LwSysUserDto lwSysUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwSysUser (");
        buffer.append("UserCode,");
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
            debugBuffer.append("'").append(lwSysUserDto.getUserCode()).append("',");
            debugBuffer.append("'").append(lwSysUserDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwSysUserDto.getPassword()).append("',");
            debugBuffer.append("'").append(lwSysUserDto.getCompanyCode()).append("',");
            debugBuffer.append("'").append(lwSysUserDto.getPhoneNumber()).append("',");
            debugBuffer.append("'").append(lwSysUserDto.getEmail()).append("',");
            debugBuffer.append("'").append(lwSysUserDto.getFax()).append("',");
            debugBuffer.append("'").append(lwSysUserDto.getUserGrade()).append("',");
            debugBuffer.append("'").append(lwSysUserDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwSysUserDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwSysUserDto.getUserCode());
        dbManager.setString(2,lwSysUserDto.getUserName());
        dbManager.setString(3,lwSysUserDto.getPassword());
        dbManager.setString(4,lwSysUserDto.getCompanyCode());
        dbManager.setString(5,lwSysUserDto.getPhoneNumber());
        dbManager.setString(6,lwSysUserDto.getEmail());
        dbManager.setString(7,lwSysUserDto.getFax());
        dbManager.setString(8,lwSysUserDto.getUserGrade());
        dbManager.setString(9,lwSysUserDto.getValidStatus());
        dbManager.setString(10,lwSysUserDto.getFlag());
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
        buffer.append("INSERT INTO LwSysUser (");
        buffer.append("UserCode,");
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
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwSysUserDto lwSysUserDto = (LwSysUserDto)i.next();
            dbManager.setString(1,lwSysUserDto.getUserCode());
            dbManager.setString(2,lwSysUserDto.getUserName());
            dbManager.setString(3,lwSysUserDto.getPassword());
            dbManager.setString(4,lwSysUserDto.getCompanyCode());
            dbManager.setString(5,lwSysUserDto.getPhoneNumber());
            dbManager.setString(6,lwSysUserDto.getEmail());
            dbManager.setString(7,lwSysUserDto.getFax());
            dbManager.setString(8,lwSysUserDto.getUserGrade());
            dbManager.setString(9,lwSysUserDto.getValidStatus());
            dbManager.setString(10,lwSysUserDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userCode 用户代码
     * @throws Exception
     */
    public void delete(String userCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwSysUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserCode=").append("'").append(userCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void update(LwSysUserDto lwSysUserDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwSysUser SET ");
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
            debugBuffer.append("UPDATE LwSysUser SET ");
            debugBuffer.append("UserName = '" + lwSysUserDto.getUserName() + "', ");
            debugBuffer.append("Password = '" + lwSysUserDto.getPassword() + "', ");
            debugBuffer.append("CompanyCode = '" + lwSysUserDto.getCompanyCode() + "', ");
            debugBuffer.append("PhoneNumber = '" + lwSysUserDto.getPhoneNumber() + "', ");
            debugBuffer.append("Email = '" + lwSysUserDto.getEmail() + "', ");
            debugBuffer.append("Fax = '" + lwSysUserDto.getFax() + "', ");
            debugBuffer.append("UserGrade = '" + lwSysUserDto.getUserGrade() + "', ");
            debugBuffer.append("ValidStatus = '" + lwSysUserDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwSysUserDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserCode=").append("'").append(lwSysUserDto.getUserCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwSysUserDto.getUserName());
        dbManager.setString(2,lwSysUserDto.getPassword());
        dbManager.setString(3,lwSysUserDto.getCompanyCode());
        dbManager.setString(4,lwSysUserDto.getPhoneNumber());
        dbManager.setString(5,lwSysUserDto.getEmail());
        dbManager.setString(6,lwSysUserDto.getFax());
        dbManager.setString(7,lwSysUserDto.getUserGrade());
        dbManager.setString(8,lwSysUserDto.getValidStatus());
        dbManager.setString(9,lwSysUserDto.getFlag());
        //设置条件字段;
        dbManager.setString(10,lwSysUserDto.getUserCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userCode 用户代码
     * @return LwSysUserDto
     * @throws Exception
     */
    public LwSysUserDto findByPrimaryKey(String userCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserCode,");
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM LwSysUser ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserCode=").append("'").append(userCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwSysUserDto lwSysUserDto = null;
        if(resultSet.next()){
            lwSysUserDto = new LwSysUserDto();
            lwSysUserDto.setUserCode(dbManager.getString(resultSet,1));
            lwSysUserDto.setUserName(dbManager.getString(resultSet,2));
            lwSysUserDto.setPassword(dbManager.getString(resultSet,3));
            lwSysUserDto.setCompanyCode(dbManager.getString(resultSet,4));
            lwSysUserDto.setPhoneNumber(dbManager.getString(resultSet,5));
            lwSysUserDto.setEmail(dbManager.getString(resultSet,6));
            lwSysUserDto.setFax(dbManager.getString(resultSet,7));
            lwSysUserDto.setUserGrade(dbManager.getString(resultSet,8));
            lwSysUserDto.setValidStatus(dbManager.getString(resultSet,9));
            lwSysUserDto.setFlag(dbManager.getString(resultSet,10));
        }
        resultSet.close();
        return lwSysUserDto;
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
        buffer.append("UserName,");
        buffer.append("Password,");
        buffer.append("CompanyCode,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("Fax,");
        buffer.append("UserGrade,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM LwSysUser WHERE ");
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
        LwSysUserDto lwSysUserDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwSysUserDto = new LwSysUserDto();
            lwSysUserDto.setUserCode(dbManager.getString(resultSet,"UserCode"));
            lwSysUserDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwSysUserDto.setPassword(dbManager.getString(resultSet,"Password"));
            lwSysUserDto.setCompanyCode(dbManager.getString(resultSet,"CompanyCode"));
            lwSysUserDto.setPhoneNumber(dbManager.getString(resultSet,"PhoneNumber"));
            lwSysUserDto.setEmail(dbManager.getString(resultSet,"Email"));
            lwSysUserDto.setFax(dbManager.getString(resultSet,"Fax"));
            lwSysUserDto.setUserGrade(dbManager.getString(resultSet,"UserGrade"));
            lwSysUserDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwSysUserDto.setFlag(dbManager.getString(resultSet,"Flag"));
            collection.add(lwSysUserDto);
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
        buffer.append("DELETE FROM LwSysUser WHERE ");
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
        buffer.append("SELECT count(*) FROM LwSysUser WHERE ");
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
