package com.elongway.pss.resource.dtofactory.domain;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.elongway.pss.dto.domain.LwDcompanyDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWDcompany-机构代码表的数据访问对象基类<br>
 */
public class DBLwDcompanyBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwDcompanyBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwDcompanyBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void insert(LwDcompanyDto lwDcompanyDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwDcompany (");
        buffer.append("ComCode,");
        buffer.append("ComCName,");
        buffer.append("ComEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("PhoneNumber,");
        buffer.append("TaxNumber,");
        buffer.append("UpperComCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwDcompanyDto.getComCode()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getComCName()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getComEName()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getAddressCName()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getAddressEName()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getPostCode()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getPhoneNumber()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getTaxNumber()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getUpperComCode()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwDcompanyDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwDcompanyDto.getComCode());
        dbManager.setString(2,lwDcompanyDto.getComCName());
        dbManager.setString(3,lwDcompanyDto.getComEName());
        dbManager.setString(4,lwDcompanyDto.getAddressCName());
        dbManager.setString(5,lwDcompanyDto.getAddressEName());
        dbManager.setString(6,lwDcompanyDto.getPostCode());
        dbManager.setString(7,lwDcompanyDto.getPhoneNumber());
        dbManager.setString(8,lwDcompanyDto.getTaxNumber());
        dbManager.setString(9,lwDcompanyDto.getUpperComCode());
        dbManager.setString(10,lwDcompanyDto.getValidStatus());
        dbManager.setString(11,lwDcompanyDto.getFlag());
        dbManager.setString(12,lwDcompanyDto.getRemark());
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
        buffer.append("INSERT INTO LwDcompany (");
        buffer.append("ComCode,");
        buffer.append("ComCName,");
        buffer.append("ComEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("PhoneNumber,");
        buffer.append("TaxNumber,");
        buffer.append("UpperComCode,");
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
            LwDcompanyDto lwDcompanyDto = (LwDcompanyDto)i.next();
            dbManager.setString(1,lwDcompanyDto.getComCode());
            dbManager.setString(2,lwDcompanyDto.getComCName());
            dbManager.setString(3,lwDcompanyDto.getComEName());
            dbManager.setString(4,lwDcompanyDto.getAddressCName());
            dbManager.setString(5,lwDcompanyDto.getAddressEName());
            dbManager.setString(6,lwDcompanyDto.getPostCode());
            dbManager.setString(7,lwDcompanyDto.getPhoneNumber());
            dbManager.setString(8,lwDcompanyDto.getTaxNumber());
            dbManager.setString(9,lwDcompanyDto.getUpperComCode());
            dbManager.setString(10,lwDcompanyDto.getValidStatus());
            dbManager.setString(11,lwDcompanyDto.getFlag());
            dbManager.setString(12,lwDcompanyDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param comCode 机构代码
     * @throws Exception
     */
    public void delete(String comCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwDcompany ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ComCode=").append("'").append(comCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ComCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,comCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void update(LwDcompanyDto lwDcompanyDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwDcompany SET ");
        buffer.append("ComCName = ?, ");
        buffer.append("ComEName = ?, ");
        buffer.append("AddressCName = ?, ");
        buffer.append("AddressEName = ?, ");
        buffer.append("PostCode = ?, ");
        buffer.append("PhoneNumber = ?, ");
        buffer.append("TaxNumber = ?, ");
        buffer.append("UpperComCode = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwDcompany SET ");
            debugBuffer.append("ComCName = '" + lwDcompanyDto.getComCName() + "', ");
            debugBuffer.append("ComEName = '" + lwDcompanyDto.getComEName() + "', ");
            debugBuffer.append("AddressCName = '" + lwDcompanyDto.getAddressCName() + "', ");
            debugBuffer.append("AddressEName = '" + lwDcompanyDto.getAddressEName() + "', ");
            debugBuffer.append("PostCode = '" + lwDcompanyDto.getPostCode() + "', ");
            debugBuffer.append("PhoneNumber = '" + lwDcompanyDto.getPhoneNumber() + "', ");
            debugBuffer.append("TaxNumber = '" + lwDcompanyDto.getTaxNumber() + "', ");
            debugBuffer.append("UpperComCode = '" + lwDcompanyDto.getUpperComCode() + "', ");
            debugBuffer.append("ValidStatus = '" + lwDcompanyDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwDcompanyDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwDcompanyDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("ComCode=").append("'").append(lwDcompanyDto.getComCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ComCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwDcompanyDto.getComCName());
        dbManager.setString(2,lwDcompanyDto.getComEName());
        dbManager.setString(3,lwDcompanyDto.getAddressCName());
        dbManager.setString(4,lwDcompanyDto.getAddressEName());
        dbManager.setString(5,lwDcompanyDto.getPostCode());
        dbManager.setString(6,lwDcompanyDto.getPhoneNumber());
        dbManager.setString(7,lwDcompanyDto.getTaxNumber());
        dbManager.setString(8,lwDcompanyDto.getUpperComCode());
        dbManager.setString(9,lwDcompanyDto.getValidStatus());
        dbManager.setString(10,lwDcompanyDto.getFlag());
        dbManager.setString(11,lwDcompanyDto.getRemark());
        //设置条件字段;
        dbManager.setString(12,lwDcompanyDto.getComCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param comCode 机构代码
     * @return LwDcompanyDto
     * @throws Exception
     */
    public LwDcompanyDto findByPrimaryKey(String comCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("ComCode,");
        buffer.append("ComCName,");
        buffer.append("ComEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("PhoneNumber,");
        buffer.append("TaxNumber,");
        buffer.append("UpperComCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwDcompany ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ComCode=").append("'").append(comCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ComCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,comCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwDcompanyDto lwDcompanyDto = null;
        if(resultSet.next()){
            lwDcompanyDto = new LwDcompanyDto();
            lwDcompanyDto.setComCode(dbManager.getString(resultSet,1));
            lwDcompanyDto.setComCName(dbManager.getString(resultSet,2));
            lwDcompanyDto.setComEName(dbManager.getString(resultSet,3));
            lwDcompanyDto.setAddressCName(dbManager.getString(resultSet,4));
            lwDcompanyDto.setAddressEName(dbManager.getString(resultSet,5));
            lwDcompanyDto.setPostCode(dbManager.getString(resultSet,6));
            lwDcompanyDto.setPhoneNumber(dbManager.getString(resultSet,7));
            lwDcompanyDto.setTaxNumber(dbManager.getString(resultSet,8));
            lwDcompanyDto.setUpperComCode(dbManager.getString(resultSet,9));
            lwDcompanyDto.setValidStatus(dbManager.getString(resultSet,10));
            lwDcompanyDto.setFlag(dbManager.getString(resultSet,11));
            lwDcompanyDto.setRemark(dbManager.getString(resultSet,12));
        }
        resultSet.close();
        return lwDcompanyDto;
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
        buffer.append("ComCode,");
        buffer.append("ComCName,");
        buffer.append("ComEName,");
        buffer.append("AddressCName,");
        buffer.append("AddressEName,");
        buffer.append("PostCode,");
        buffer.append("PhoneNumber,");
        buffer.append("TaxNumber,");
        buffer.append("UpperComCode,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwDcompany WHERE ");
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
        LwDcompanyDto lwDcompanyDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwDcompanyDto = new LwDcompanyDto();
            lwDcompanyDto.setComCode(dbManager.getString(resultSet,"ComCode"));
            lwDcompanyDto.setComCName(dbManager.getString(resultSet,"ComCName"));
            lwDcompanyDto.setComEName(dbManager.getString(resultSet,"ComEName"));
            lwDcompanyDto.setAddressCName(dbManager.getString(resultSet,"AddressCName"));
            lwDcompanyDto.setAddressEName(dbManager.getString(resultSet,"AddressEName"));
            lwDcompanyDto.setPostCode(dbManager.getString(resultSet,"PostCode"));
            lwDcompanyDto.setPhoneNumber(dbManager.getString(resultSet,"PhoneNumber"));
            lwDcompanyDto.setTaxNumber(dbManager.getString(resultSet,"TaxNumber"));
            lwDcompanyDto.setUpperComCode(dbManager.getString(resultSet,"UpperComCode"));
            lwDcompanyDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwDcompanyDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwDcompanyDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwDcompanyDto);
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
        buffer.append("DELETE FROM LwDcompany WHERE ");
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
        buffer.append("SELECT count(*) FROM LwDcompany WHERE ");
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
