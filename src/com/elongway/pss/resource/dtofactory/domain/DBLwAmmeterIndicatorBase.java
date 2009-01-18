package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterIndicatorDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWAmmeterIndicator-换表记录表的数据访问对象基类<br>
 */
public class DBLwAmmeterIndicatorBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwAmmeterIndicatorBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwAmmeterIndicatorBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public void insert(LwAmmeterIndicatorDto lwAmmeterIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwAmmeterIndicator (");
        buffer.append("SerialNo,");
        buffer.append("AmmeterNo,");
        buffer.append("CurrentNum,");
        buffer.append("StartNum,");
        buffer.append("ReadAmmeterDate,");
        buffer.append("OperateDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwAmmeterIndicatorDto.getSerialNo()).append("',");
            debugBuffer.append("'").append(lwAmmeterIndicatorDto.getAmmeterNo()).append("',");
            debugBuffer.append("").append(lwAmmeterIndicatorDto.getCurrentNum()).append(",");
            debugBuffer.append("").append(lwAmmeterIndicatorDto.getStartNum()).append(",");
            debugBuffer.append("'").append(lwAmmeterIndicatorDto.getReadAmmeterDate()).append("',");
            debugBuffer.append("'").append(lwAmmeterIndicatorDto.getOperateDate()).append("',");
            debugBuffer.append("'").append(lwAmmeterIndicatorDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwAmmeterIndicatorDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwAmmeterIndicatorDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwAmmeterIndicatorDto.getSerialNo());
        dbManager.setString(2,lwAmmeterIndicatorDto.getAmmeterNo());
        dbManager.setInt(3,lwAmmeterIndicatorDto.getCurrentNum());
        dbManager.setInt(4,lwAmmeterIndicatorDto.getStartNum());
        dbManager.setString(5,lwAmmeterIndicatorDto.getReadAmmeterDate());
        dbManager.setString(6,lwAmmeterIndicatorDto.getOperateDate());
        dbManager.setString(7,lwAmmeterIndicatorDto.getValidStatus());
        dbManager.setString(8,lwAmmeterIndicatorDto.getFlag());
        dbManager.setString(9,lwAmmeterIndicatorDto.getRemark());
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
        buffer.append("INSERT INTO LwAmmeterIndicator (");
        buffer.append("SerialNo,");
        buffer.append("AmmeterNo,");
        buffer.append("CurrentNum,");
        buffer.append("StartNum,");
        buffer.append("ReadAmmeterDate,");
        buffer.append("OperateDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwAmmeterIndicatorDto lwAmmeterIndicatorDto = (LwAmmeterIndicatorDto)i.next();
            dbManager.setString(1,lwAmmeterIndicatorDto.getSerialNo());
            dbManager.setString(2,lwAmmeterIndicatorDto.getAmmeterNo());
            dbManager.setInt(3,lwAmmeterIndicatorDto.getCurrentNum());
            dbManager.setInt(4,lwAmmeterIndicatorDto.getStartNum());
            dbManager.setString(5,lwAmmeterIndicatorDto.getReadAmmeterDate());
            dbManager.setString(6,lwAmmeterIndicatorDto.getOperateDate());
            dbManager.setString(7,lwAmmeterIndicatorDto.getValidStatus());
            dbManager.setString(8,lwAmmeterIndicatorDto.getFlag());
            dbManager.setString(9,lwAmmeterIndicatorDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param serialNo 序号
     * @throws Exception
     */
    public void delete(String serialNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwAmmeterIndicator ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("SerialNo=").append("'").append(serialNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("SerialNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,serialNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public void update(LwAmmeterIndicatorDto lwAmmeterIndicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwAmmeterIndicator SET ");
        buffer.append("AmmeterNo = ?, ");
        buffer.append("CurrentNum = ?, ");
        buffer.append("StartNum = ?, ");
        buffer.append("ReadAmmeterDate = ?, ");
        buffer.append("OperateDate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwAmmeterIndicator SET ");
            debugBuffer.append("AmmeterNo = '" + lwAmmeterIndicatorDto.getAmmeterNo() + "', ");
            debugBuffer.append("CurrentNum = " + lwAmmeterIndicatorDto.getCurrentNum() + ", ");
            debugBuffer.append("StartNum = " + lwAmmeterIndicatorDto.getStartNum() + ", ");
            debugBuffer.append("ReadAmmeterDate = '" + lwAmmeterIndicatorDto.getReadAmmeterDate() + "', ");
            debugBuffer.append("OperateDate = '" + lwAmmeterIndicatorDto.getOperateDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwAmmeterIndicatorDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwAmmeterIndicatorDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwAmmeterIndicatorDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("SerialNo=").append("'").append(lwAmmeterIndicatorDto.getSerialNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("SerialNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwAmmeterIndicatorDto.getAmmeterNo());
        dbManager.setInt(2,lwAmmeterIndicatorDto.getCurrentNum());
        dbManager.setInt(3,lwAmmeterIndicatorDto.getStartNum());
        dbManager.setString(4,lwAmmeterIndicatorDto.getReadAmmeterDate());
        dbManager.setString(5,lwAmmeterIndicatorDto.getOperateDate());
        dbManager.setString(6,lwAmmeterIndicatorDto.getValidStatus());
        dbManager.setString(7,lwAmmeterIndicatorDto.getFlag());
        dbManager.setString(8,lwAmmeterIndicatorDto.getRemark());
        //设置条件字段;
        dbManager.setString(9,lwAmmeterIndicatorDto.getSerialNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param serialNo 序号
     * @return LwAmmeterIndicatorDto
     * @throws Exception
     */
    public LwAmmeterIndicatorDto findByPrimaryKey(String serialNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("SerialNo,");
        buffer.append("AmmeterNo,");
        buffer.append("CurrentNum,");
        buffer.append("StartNum,");
        buffer.append("ReadAmmeterDate,");
        buffer.append("OperateDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwAmmeterIndicator ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("SerialNo=").append("'").append(serialNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("SerialNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,serialNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwAmmeterIndicatorDto lwAmmeterIndicatorDto = null;
        if(resultSet.next()){
            lwAmmeterIndicatorDto = new LwAmmeterIndicatorDto();
            lwAmmeterIndicatorDto.setSerialNo(dbManager.getString(resultSet,1));
            lwAmmeterIndicatorDto.setAmmeterNo(dbManager.getString(resultSet,2));
            lwAmmeterIndicatorDto.setCurrentNum(dbManager.getInt(resultSet,3));
            lwAmmeterIndicatorDto.setStartNum(dbManager.getInt(resultSet,4));
            lwAmmeterIndicatorDto.setReadAmmeterDate(dbManager.getString(resultSet,5));
            lwAmmeterIndicatorDto.setOperateDate(dbManager.getString(resultSet,6));
            lwAmmeterIndicatorDto.setValidStatus(dbManager.getString(resultSet,7));
            lwAmmeterIndicatorDto.setFlag(dbManager.getString(resultSet,8));
            lwAmmeterIndicatorDto.setRemark(dbManager.getString(resultSet,9));
        }
        resultSet.close();
        return lwAmmeterIndicatorDto;
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
        buffer.append("SerialNo,");
        buffer.append("AmmeterNo,");
        buffer.append("CurrentNum,");
        buffer.append("StartNum,");
        buffer.append("ReadAmmeterDate,");
        buffer.append("OperateDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwAmmeterIndicator WHERE ");
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
        LwAmmeterIndicatorDto lwAmmeterIndicatorDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwAmmeterIndicatorDto = new LwAmmeterIndicatorDto();
            lwAmmeterIndicatorDto.setSerialNo(dbManager.getString(resultSet,"SerialNo"));
            lwAmmeterIndicatorDto.setAmmeterNo(dbManager.getString(resultSet,"AmmeterNo"));
            lwAmmeterIndicatorDto.setCurrentNum(dbManager.getInt(resultSet,"CurrentNum"));
            lwAmmeterIndicatorDto.setStartNum(dbManager.getInt(resultSet,"StartNum"));
            lwAmmeterIndicatorDto.setReadAmmeterDate(dbManager.getString(resultSet,"ReadAmmeterDate"));
            lwAmmeterIndicatorDto.setOperateDate(dbManager.getString(resultSet,"OperateDate"));
            lwAmmeterIndicatorDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwAmmeterIndicatorDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwAmmeterIndicatorDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwAmmeterIndicatorDto);
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
        buffer.append("DELETE FROM LwAmmeterIndicator WHERE ");
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
        buffer.append("SELECT count(*) FROM LwAmmeterIndicator WHERE ");
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
