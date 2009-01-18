package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleProrate-趸售比例分摊表的数据访问对象基类<br>
 */
public class DBLwWholeSaleProrateBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwWholeSaleProrateBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleProrateBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public void insert(LwWholeSaleProrateDto lwWholeSaleProrateDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwWholeSaleProrate (");
        buffer.append("ComCode,");
        buffer.append("CompanyName,");
        buffer.append("People,");
        buffer.append("NotPeople,");
        buffer.append("Farm,");
        buffer.append("Produce,");
        buffer.append("Business,");
        buffer.append("Industry,");
        buffer.append("VoltLevel,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwWholeSaleProrateDto.getComCode()).append("',");
            debugBuffer.append("'").append(lwWholeSaleProrateDto.getCompanyName()).append("',");
            debugBuffer.append("").append(lwWholeSaleProrateDto.getPeople()).append(",");
            debugBuffer.append("").append(lwWholeSaleProrateDto.getNotPeople()).append(",");
            debugBuffer.append("").append(lwWholeSaleProrateDto.getFarm()).append(",");
            debugBuffer.append("").append(lwWholeSaleProrateDto.getProduce()).append(",");
            debugBuffer.append("").append(lwWholeSaleProrateDto.getBusiness()).append(",");
            debugBuffer.append("").append(lwWholeSaleProrateDto.getIndustry()).append(",");
            debugBuffer.append("'").append(lwWholeSaleProrateDto.getVoltLevel()).append("',");
            debugBuffer.append("'").append(lwWholeSaleProrateDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwWholeSaleProrateDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwWholeSaleProrateDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwWholeSaleProrateDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwWholeSaleProrateDto.getComCode());
        dbManager.setString(2,lwWholeSaleProrateDto.getCompanyName());
        dbManager.setDouble(3,lwWholeSaleProrateDto.getPeople());
        dbManager.setDouble(4,lwWholeSaleProrateDto.getNotPeople());
        dbManager.setDouble(5,lwWholeSaleProrateDto.getFarm());
        dbManager.setDouble(6,lwWholeSaleProrateDto.getProduce());
        dbManager.setDouble(7,lwWholeSaleProrateDto.getBusiness());
        dbManager.setDouble(8,lwWholeSaleProrateDto.getIndustry());
        dbManager.setString(9,lwWholeSaleProrateDto.getVoltLevel());
        dbManager.setString(10,lwWholeSaleProrateDto.getInputDate());
        dbManager.setString(11,lwWholeSaleProrateDto.getValidStatus());
        dbManager.setString(12,lwWholeSaleProrateDto.getRemark());
        dbManager.setString(13,lwWholeSaleProrateDto.getFlag());
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
        buffer.append("INSERT INTO LwWholeSaleProrate (");
        buffer.append("ComCode,");
        buffer.append("CompanyName,");
        buffer.append("People,");
        buffer.append("NotPeople,");
        buffer.append("Farm,");
        buffer.append("Produce,");
        buffer.append("Business,");
        buffer.append("Industry,");
        buffer.append("VoltLevel,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwWholeSaleProrateDto lwWholeSaleProrateDto = (LwWholeSaleProrateDto)i.next();
            dbManager.setString(1,lwWholeSaleProrateDto.getComCode());
            dbManager.setString(2,lwWholeSaleProrateDto.getCompanyName());
            dbManager.setDouble(3,lwWholeSaleProrateDto.getPeople());
            dbManager.setDouble(4,lwWholeSaleProrateDto.getNotPeople());
            dbManager.setDouble(5,lwWholeSaleProrateDto.getFarm());
            dbManager.setDouble(6,lwWholeSaleProrateDto.getProduce());
            dbManager.setDouble(7,lwWholeSaleProrateDto.getBusiness());
            dbManager.setDouble(8,lwWholeSaleProrateDto.getIndustry());
            dbManager.setString(9,lwWholeSaleProrateDto.getVoltLevel());
            dbManager.setString(10,lwWholeSaleProrateDto.getInputDate());
            dbManager.setString(11,lwWholeSaleProrateDto.getValidStatus());
            dbManager.setString(12,lwWholeSaleProrateDto.getRemark());
            dbManager.setString(13,lwWholeSaleProrateDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param comCode 机构代码
     * @param voltLevel 电压等级
     * @throws Exception
     */
    public void delete(String comCode,String voltLevel)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwWholeSaleProrate ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ComCode=").append("'").append(comCode).append("' AND ");
            debugBuffer.append("VoltLevel=").append("'").append(voltLevel).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ComCode = ? And ");
        buffer.append("VoltLevel = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,comCode);
        dbManager.setString(2,voltLevel);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public void update(LwWholeSaleProrateDto lwWholeSaleProrateDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwWholeSaleProrate SET ");
        buffer.append("CompanyName = ?, ");
        buffer.append("People = ?, ");
        buffer.append("NotPeople = ?, ");
        buffer.append("Farm = ?, ");
        buffer.append("Produce = ?, ");
        buffer.append("Business = ?, ");
        buffer.append("Industry = ?, ");
        buffer.append("InputDate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwWholeSaleProrate SET ");
            debugBuffer.append("CompanyName = '" + lwWholeSaleProrateDto.getCompanyName() + "', ");
            debugBuffer.append("People = " + lwWholeSaleProrateDto.getPeople() + ", ");
            debugBuffer.append("NotPeople = " + lwWholeSaleProrateDto.getNotPeople() + ", ");
            debugBuffer.append("Farm = " + lwWholeSaleProrateDto.getFarm() + ", ");
            debugBuffer.append("Produce = " + lwWholeSaleProrateDto.getProduce() + ", ");
            debugBuffer.append("Business = " + lwWholeSaleProrateDto.getBusiness() + ", ");
            debugBuffer.append("Industry = " + lwWholeSaleProrateDto.getIndustry() + ", ");
            debugBuffer.append("InputDate = '" + lwWholeSaleProrateDto.getInputDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwWholeSaleProrateDto.getValidStatus() + "', ");
            debugBuffer.append("Remark = '" + lwWholeSaleProrateDto.getRemark() + "', ");
            debugBuffer.append("Flag = '" + lwWholeSaleProrateDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("ComCode=").append("'").append(lwWholeSaleProrateDto.getComCode()).append("' AND ");
            debugBuffer.append("VoltLevel=").append("'").append(lwWholeSaleProrateDto.getVoltLevel()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ComCode = ? And ");
        buffer.append("VoltLevel = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwWholeSaleProrateDto.getCompanyName());
        dbManager.setDouble(2,lwWholeSaleProrateDto.getPeople());
        dbManager.setDouble(3,lwWholeSaleProrateDto.getNotPeople());
        dbManager.setDouble(4,lwWholeSaleProrateDto.getFarm());
        dbManager.setDouble(5,lwWholeSaleProrateDto.getProduce());
        dbManager.setDouble(6,lwWholeSaleProrateDto.getBusiness());
        dbManager.setDouble(7,lwWholeSaleProrateDto.getIndustry());
        dbManager.setString(8,lwWholeSaleProrateDto.getInputDate());
        dbManager.setString(9,lwWholeSaleProrateDto.getValidStatus());
        dbManager.setString(10,lwWholeSaleProrateDto.getRemark());
        dbManager.setString(11,lwWholeSaleProrateDto.getFlag());
        //设置条件字段;
        dbManager.setString(12,lwWholeSaleProrateDto.getComCode());
        dbManager.setString(13,lwWholeSaleProrateDto.getVoltLevel());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param comCode 机构代码
     * @param voltLevel 电压等级
     * @return LwWholeSaleProrateDto
     * @throws Exception
     */
    public LwWholeSaleProrateDto findByPrimaryKey(String comCode,String voltLevel)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("ComCode,");
        buffer.append("CompanyName,");
        buffer.append("People,");
        buffer.append("NotPeople,");
        buffer.append("Farm,");
        buffer.append("Produce,");
        buffer.append("Business,");
        buffer.append("Industry,");
        buffer.append("VoltLevel,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append("FROM LwWholeSaleProrate ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ComCode=").append("'").append(comCode).append("' AND ");
            debugBuffer.append("VoltLevel=").append("'").append(voltLevel).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ComCode = ? And ");
        buffer.append("VoltLevel = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,comCode);
        dbManager.setString(2,voltLevel);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwWholeSaleProrateDto lwWholeSaleProrateDto = null;
        if(resultSet.next()){
            lwWholeSaleProrateDto = new LwWholeSaleProrateDto();
            lwWholeSaleProrateDto.setComCode(dbManager.getString(resultSet,1));
            lwWholeSaleProrateDto.setCompanyName(dbManager.getString(resultSet,2));
            lwWholeSaleProrateDto.setPeople(dbManager.getDouble(resultSet,3));
            lwWholeSaleProrateDto.setNotPeople(dbManager.getDouble(resultSet,4));
            lwWholeSaleProrateDto.setFarm(dbManager.getDouble(resultSet,5));
            lwWholeSaleProrateDto.setProduce(dbManager.getDouble(resultSet,6));
            lwWholeSaleProrateDto.setBusiness(dbManager.getDouble(resultSet,7));
            lwWholeSaleProrateDto.setIndustry(dbManager.getDouble(resultSet,8));
            lwWholeSaleProrateDto.setVoltLevel(dbManager.getString(resultSet,9));
            lwWholeSaleProrateDto.setInputDate(dbManager.getString(resultSet,10));
            lwWholeSaleProrateDto.setValidStatus(dbManager.getString(resultSet,11));
            lwWholeSaleProrateDto.setRemark(dbManager.getString(resultSet,12));
            lwWholeSaleProrateDto.setFlag(dbManager.getString(resultSet,13));
        }
        resultSet.close();
        return lwWholeSaleProrateDto;
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
        buffer.append("CompanyName,");
        buffer.append("People,");
        buffer.append("NotPeople,");
        buffer.append("Farm,");
        buffer.append("Produce,");
        buffer.append("Business,");
        buffer.append("Industry,");
        buffer.append("VoltLevel,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append("FROM LwWholeSaleProrate WHERE ");
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
        LwWholeSaleProrateDto lwWholeSaleProrateDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwWholeSaleProrateDto = new LwWholeSaleProrateDto();
            lwWholeSaleProrateDto.setComCode(dbManager.getString(resultSet,"ComCode"));
            lwWholeSaleProrateDto.setCompanyName(dbManager.getString(resultSet,"CompanyName"));
            lwWholeSaleProrateDto.setPeople(dbManager.getDouble(resultSet,"People"));
            lwWholeSaleProrateDto.setNotPeople(dbManager.getDouble(resultSet,"NotPeople"));
            lwWholeSaleProrateDto.setFarm(dbManager.getDouble(resultSet,"Farm"));
            lwWholeSaleProrateDto.setProduce(dbManager.getDouble(resultSet,"Produce"));
            lwWholeSaleProrateDto.setBusiness(dbManager.getDouble(resultSet,"Business"));
            lwWholeSaleProrateDto.setIndustry(dbManager.getDouble(resultSet,"Industry"));
            lwWholeSaleProrateDto.setVoltLevel(dbManager.getString(resultSet,"VoltLevel"));
            lwWholeSaleProrateDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwWholeSaleProrateDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwWholeSaleProrateDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwWholeSaleProrateDto.setFlag(dbManager.getString(resultSet,"Flag"));
            collection.add(lwWholeSaleProrateDto);
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
        buffer.append("DELETE FROM LwWholeSaleProrate WHERE ");
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
        buffer.append("SELECT count(*) FROM LwWholeSaleProrate WHERE ");
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
