package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCompanyDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADCompany的数据访问对象基类<br>
 * 创建于 2006-09-08 15:52:47.278<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADCompanyBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBIADCompanyBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBIADCompanyBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public void insert(IADCompanyDto iADCompanyDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IADCompany (");
        buffer.append("CompanyCode,");
        buffer.append("AreaCode,");
        buffer.append("CompanyCName,");
        buffer.append("CompanyEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("Phone,");
        buffer.append("Fax,");
        buffer.append("UpperCompanyCode,");
        buffer.append("InsurerName,");
        buffer.append("CompanyType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(iADCompanyDto.getCompanyCode()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getAreaCode()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getCompanyCName()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getCompanyEName()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getAddressCName()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getAddressEName()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getPostCode()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getPhone()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getFax()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getUpperCompanyCode()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getInsurerName()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getCompanyType()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getRemark()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(iADCompanyDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,iADCompanyDto.getCompanyCode());
        dbManager.setString(2,iADCompanyDto.getAreaCode());
        dbManager.setString(3,iADCompanyDto.getCompanyCName());
        dbManager.setString(4,iADCompanyDto.getCompanyEName());
        dbManager.setString(5,iADCompanyDto.getAddressCName());
        dbManager.setString(6,iADCompanyDto.getAddressEName());
        dbManager.setString(7,iADCompanyDto.getPostCode());
        dbManager.setString(8,iADCompanyDto.getPhone());
        dbManager.setString(9,iADCompanyDto.getFax());
        dbManager.setString(10,iADCompanyDto.getUpperCompanyCode());
        dbManager.setString(11,iADCompanyDto.getInsurerName());
        dbManager.setString(12,iADCompanyDto.getCompanyType());
        dbManager.setString(13,iADCompanyDto.getRemark());
        dbManager.setString(14,iADCompanyDto.getValidStatus());
        dbManager.setString(15,iADCompanyDto.getFlag());
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
        buffer.append("INSERT INTO IADCompany (");
        buffer.append("CompanyCode,");
        buffer.append("AreaCode,");
        buffer.append("CompanyCName,");
        buffer.append("CompanyEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("Phone,");
        buffer.append("Fax,");
        buffer.append("UpperCompanyCode,");
        buffer.append("InsurerName,");
        buffer.append("CompanyType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            IADCompanyDto iADCompanyDto = (IADCompanyDto)i.next();
            dbManager.setString(1,iADCompanyDto.getCompanyCode());
            dbManager.setString(2,iADCompanyDto.getAreaCode());
            dbManager.setString(3,iADCompanyDto.getCompanyCName());
            dbManager.setString(4,iADCompanyDto.getCompanyEName());
            dbManager.setString(5,iADCompanyDto.getAddressCName());
            dbManager.setString(6,iADCompanyDto.getAddressEName());
            dbManager.setString(7,iADCompanyDto.getPostCode());
            dbManager.setString(8,iADCompanyDto.getPhone());
            dbManager.setString(9,iADCompanyDto.getFax());
            dbManager.setString(10,iADCompanyDto.getUpperCompanyCode());
            dbManager.setString(11,iADCompanyDto.getInsurerName());
            dbManager.setString(12,iADCompanyDto.getCompanyType());
            dbManager.setString(13,iADCompanyDto.getRemark());
            dbManager.setString(14,iADCompanyDto.getValidStatus());
            dbManager.setString(15,iADCompanyDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param companyCode CompanyCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(String companyCode,String areaCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IADCompany ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CompanyCode=").append("'").append(companyCode).append("' AND ");
            debugBuffer.append("AreaCode=").append("'").append(areaCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CompanyCode = ? And ");
        buffer.append("AreaCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,companyCode);
        dbManager.setString(2,areaCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public void update(IADCompanyDto iADCompanyDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IADCompany SET ");
        buffer.append("CompanyCName = ?, ");
        buffer.append("CompanyEName = ?, ");
        buffer.append("AddressCName = ?, ");
        buffer.append("AddressEName = ?, ");
        buffer.append("PostCode = ?, ");
        buffer.append("Phone = ?, ");
        buffer.append("Fax = ?, ");
        buffer.append("UpperCompanyCode = ?, ");
        buffer.append("InsurerName = ?, ");
        buffer.append("CompanyType = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IADCompany SET ");
            debugBuffer.append("CompanyCName = '" + iADCompanyDto.getCompanyCName() + "', ");
            debugBuffer.append("CompanyEName = '" + iADCompanyDto.getCompanyEName() + "', ");
            debugBuffer.append("AddressCName = '" + iADCompanyDto.getAddressCName() + "', ");
            debugBuffer.append("AddressEName = '" + iADCompanyDto.getAddressEName() + "', ");
            debugBuffer.append("PostCode = '" + iADCompanyDto.getPostCode() + "', ");
            debugBuffer.append("Phone = '" + iADCompanyDto.getPhone() + "', ");
            debugBuffer.append("Fax = '" + iADCompanyDto.getFax() + "', ");
            debugBuffer.append("UpperCompanyCode = '" + iADCompanyDto.getUpperCompanyCode() + "', ");
            debugBuffer.append("InsurerName = '" + iADCompanyDto.getInsurerName() + "', ");
            debugBuffer.append("CompanyType = '" + iADCompanyDto.getCompanyType() + "', ");
            debugBuffer.append("Remark = '" + iADCompanyDto.getRemark() + "', ");
            debugBuffer.append("ValidStatus = '" + iADCompanyDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + iADCompanyDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("CompanyCode=").append("'").append(iADCompanyDto.getCompanyCode()).append("' AND ");
            debugBuffer.append("AreaCode=").append("'").append(iADCompanyDto.getAreaCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CompanyCode = ? And ");
        buffer.append("AreaCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,iADCompanyDto.getCompanyCName());
        dbManager.setString(2,iADCompanyDto.getCompanyEName());
        dbManager.setString(3,iADCompanyDto.getAddressCName());
        dbManager.setString(4,iADCompanyDto.getAddressEName());
        dbManager.setString(5,iADCompanyDto.getPostCode());
        dbManager.setString(6,iADCompanyDto.getPhone());
        dbManager.setString(7,iADCompanyDto.getFax());
        dbManager.setString(8,iADCompanyDto.getUpperCompanyCode());
        dbManager.setString(9,iADCompanyDto.getInsurerName());
        dbManager.setString(10,iADCompanyDto.getCompanyType());
        dbManager.setString(11,iADCompanyDto.getRemark());
        dbManager.setString(12,iADCompanyDto.getValidStatus());
        dbManager.setString(13,iADCompanyDto.getFlag());
        //设置条件字段;
        dbManager.setString(14,iADCompanyDto.getCompanyCode());
        dbManager.setString(15,iADCompanyDto.getAreaCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param companyCode CompanyCode
     * @param areaCode AreaCode
     * @return IADCompanyDto
     * @throws Exception
     */
    public IADCompanyDto findByPrimaryKey(String companyCode,String areaCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("CompanyCode,");
        buffer.append("AreaCode,");
        buffer.append("CompanyCName,");
        buffer.append("CompanyEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("Phone,");
        buffer.append("Fax,");
        buffer.append("UpperCompanyCode,");
        buffer.append("InsurerName,");
        buffer.append("CompanyType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IADCompany ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CompanyCode=").append("'").append(companyCode).append("' AND ");
            debugBuffer.append("AreaCode=").append("'").append(areaCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CompanyCode = ? And ");
        buffer.append("AreaCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,companyCode);
        dbManager.setString(2,areaCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        IADCompanyDto iADCompanyDto = null;
        if(resultSet.next()){
            iADCompanyDto = new IADCompanyDto();
            iADCompanyDto.setCompanyCode(dbManager.getString(resultSet,1));
            iADCompanyDto.setAreaCode(dbManager.getString(resultSet,2));
            iADCompanyDto.setCompanyCName(dbManager.getString(resultSet,3));
            iADCompanyDto.setCompanyEName(dbManager.getString(resultSet,4));
            iADCompanyDto.setAddressCName(dbManager.getString(resultSet,5));
            iADCompanyDto.setAddressEName(dbManager.getString(resultSet,6));
            iADCompanyDto.setPostCode(dbManager.getString(resultSet,7));
            iADCompanyDto.setPhone(dbManager.getString(resultSet,8));
            iADCompanyDto.setFax(dbManager.getString(resultSet,9));
            iADCompanyDto.setUpperCompanyCode(dbManager.getString(resultSet,10));
            iADCompanyDto.setInsurerName(dbManager.getString(resultSet,11));
            iADCompanyDto.setCompanyType(dbManager.getString(resultSet,12));
            iADCompanyDto.setRemark(dbManager.getString(resultSet,13));
            iADCompanyDto.setValidStatus(dbManager.getString(resultSet,14));
            iADCompanyDto.setFlag(dbManager.getString(resultSet,15));
        }
        resultSet.close();
        return iADCompanyDto;
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
        buffer.append("CompanyCode,");
        buffer.append("AreaCode,");
        buffer.append("CompanyCName,");
        buffer.append("CompanyEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("Phone,");
        buffer.append("Fax,");
        buffer.append("UpperCompanyCode,");
        buffer.append("InsurerName,");
        buffer.append("CompanyType,");
        buffer.append("Remark,");
        buffer.append("ValidStatus,");
        buffer.append("Flag ");
        buffer.append("FROM IADCompany WHERE ");
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
        IADCompanyDto iADCompanyDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            iADCompanyDto = new IADCompanyDto();
            iADCompanyDto.setCompanyCode(dbManager.getString(resultSet,1));
            iADCompanyDto.setAreaCode(dbManager.getString(resultSet,2));
            iADCompanyDto.setCompanyCName(dbManager.getString(resultSet,3));
            iADCompanyDto.setCompanyEName(dbManager.getString(resultSet,4));
            iADCompanyDto.setAddressCName(dbManager.getString(resultSet,5));
            iADCompanyDto.setAddressEName(dbManager.getString(resultSet,6));
            iADCompanyDto.setPostCode(dbManager.getString(resultSet,7));
            iADCompanyDto.setPhone(dbManager.getString(resultSet,8));
            iADCompanyDto.setFax(dbManager.getString(resultSet,9));
            iADCompanyDto.setUpperCompanyCode(dbManager.getString(resultSet,10));
            iADCompanyDto.setInsurerName(dbManager.getString(resultSet,11));
            iADCompanyDto.setCompanyType(dbManager.getString(resultSet,12));
            iADCompanyDto.setRemark(dbManager.getString(resultSet,13));
            iADCompanyDto.setValidStatus(dbManager.getString(resultSet,14));
            iADCompanyDto.setFlag(dbManager.getString(resultSet,15));
            collection.add(iADCompanyDto);
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
        buffer.append("DELETE FROM IADCompany WHERE ");
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
        buffer.append("SELECT count(*) FROM IADCompany WHERE ");
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
