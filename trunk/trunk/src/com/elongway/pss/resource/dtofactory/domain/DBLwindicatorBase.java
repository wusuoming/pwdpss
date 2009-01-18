package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwindicatorDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWindicator-电表指针记录表的数据访问对象基类<br>
 */
public class DBLwindicatorBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwindicatorBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwindicatorBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwindicatorDto lwindicatorDto
     * @throws Exception
     */
    public void insert(LwindicatorDto lwindicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO Lwindicator (");
        buffer.append("LineCode,");
        buffer.append("AmmeterNo,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("Rate,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwindicatorDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwindicatorDto.getAmmeterNo()).append("',");
            debugBuffer.append("'").append(lwindicatorDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwindicatorDto.getThisWorkNum()).append(",");
            debugBuffer.append("").append(lwindicatorDto.getThisIdleNum()).append(",");
            debugBuffer.append("").append(lwindicatorDto.getRate()).append(",");
            debugBuffer.append("'").append(lwindicatorDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwindicatorDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwindicatorDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwindicatorDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwindicatorDto.getLineCode());
        dbManager.setString(2,lwindicatorDto.getAmmeterNo());
        dbManager.setString(3,lwindicatorDto.getStatMonth());
        dbManager.setInt(4,lwindicatorDto.getThisWorkNum());
        dbManager.setInt(5,lwindicatorDto.getThisIdleNum());
        dbManager.setDouble(6,lwindicatorDto.getRate());
        dbManager.setString(7,lwindicatorDto.getInputDate());
        dbManager.setString(8,lwindicatorDto.getValidStatus());
        dbManager.setString(9,lwindicatorDto.getFlag());
        dbManager.setString(10,lwindicatorDto.getRemark());
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
        buffer.append("INSERT INTO Lwindicator (");
        buffer.append("LineCode,");
        buffer.append("AmmeterNo,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("Rate,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwindicatorDto lwindicatorDto = (LwindicatorDto)i.next();
            dbManager.setString(1,lwindicatorDto.getLineCode());
            dbManager.setString(2,lwindicatorDto.getAmmeterNo());
            dbManager.setString(3,lwindicatorDto.getStatMonth());
            dbManager.setInt(4,lwindicatorDto.getThisWorkNum());
            dbManager.setInt(5,lwindicatorDto.getThisIdleNum());
            dbManager.setDouble(6,lwindicatorDto.getRate());
            dbManager.setString(7,lwindicatorDto.getInputDate());
            dbManager.setString(8,lwindicatorDto.getValidStatus());
            dbManager.setString(9,lwindicatorDto.getFlag());
            dbManager.setString(10,lwindicatorDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param lineCode 线路代码
     * @param statMonth 统计年月
     * @throws Exception
     */
    public void delete(String lineCode,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM Lwindicator ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,statMonth);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwindicatorDto lwindicatorDto
     * @throws Exception
     */
    public void update(LwindicatorDto lwindicatorDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE Lwindicator SET ");
        buffer.append("AmmeterNo = ?, ");
        buffer.append("ThisWorkNum = ?, ");
        buffer.append("ThisIdleNum = ?, ");
        buffer.append("Rate = ?, ");
        buffer.append("InputDate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE Lwindicator SET ");
            debugBuffer.append("AmmeterNo = '" + lwindicatorDto.getAmmeterNo() + "', ");
            debugBuffer.append("ThisWorkNum = " + lwindicatorDto.getThisWorkNum() + ", ");
            debugBuffer.append("ThisIdleNum = " + lwindicatorDto.getThisIdleNum() + ", ");
            debugBuffer.append("Rate = " + lwindicatorDto.getRate() + ", ");
            debugBuffer.append("InputDate = '" + lwindicatorDto.getInputDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwindicatorDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwindicatorDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwindicatorDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lwindicatorDto.getLineCode()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwindicatorDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwindicatorDto.getAmmeterNo());
        dbManager.setInt(2,lwindicatorDto.getThisWorkNum());
        dbManager.setInt(3,lwindicatorDto.getThisIdleNum());
        dbManager.setDouble(4,lwindicatorDto.getRate());
        dbManager.setString(5,lwindicatorDto.getInputDate());
        dbManager.setString(6,lwindicatorDto.getValidStatus());
        dbManager.setString(7,lwindicatorDto.getFlag());
        dbManager.setString(8,lwindicatorDto.getRemark());
        //设置条件字段;
        dbManager.setString(9,lwindicatorDto.getLineCode());
        dbManager.setString(10,lwindicatorDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param lineCode 线路代码
     * @param statMonth 统计年月
     * @return LwindicatorDto
     * @throws Exception
     */
    public LwindicatorDto findByPrimaryKey(String lineCode,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("AmmeterNo,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("Rate,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM Lwindicator ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,statMonth);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwindicatorDto lwindicatorDto = null;
        if(resultSet.next()){
            lwindicatorDto = new LwindicatorDto();
            lwindicatorDto.setLineCode(dbManager.getString(resultSet,1));
            lwindicatorDto.setAmmeterNo(dbManager.getString(resultSet,2));
            lwindicatorDto.setStatMonth(dbManager.getString(resultSet,3));
            lwindicatorDto.setThisWorkNum(dbManager.getInt(resultSet,4));
            lwindicatorDto.setThisIdleNum(dbManager.getInt(resultSet,5));
            lwindicatorDto.setRate(dbManager.getDouble(resultSet,6));
            lwindicatorDto.setInputDate(dbManager.getString(resultSet,7));
            lwindicatorDto.setValidStatus(dbManager.getString(resultSet,8));
            lwindicatorDto.setFlag(dbManager.getString(resultSet,9));
            lwindicatorDto.setRemark(dbManager.getString(resultSet,10));
        }
        resultSet.close();
        return lwindicatorDto;
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
        buffer.append("LineCode,");
        buffer.append("AmmeterNo,");
        buffer.append("StatMonth,");
        buffer.append("ThisWorkNum,");
        buffer.append("ThisIdleNum,");
        buffer.append("Rate,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM Lwindicator WHERE ");
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
        LwindicatorDto lwindicatorDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwindicatorDto = new LwindicatorDto();
            lwindicatorDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwindicatorDto.setAmmeterNo(dbManager.getString(resultSet,"AmmeterNo"));
            lwindicatorDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwindicatorDto.setThisWorkNum(dbManager.getInt(resultSet,"ThisWorkNum"));
            lwindicatorDto.setThisIdleNum(dbManager.getInt(resultSet,"ThisIdleNum"));
            lwindicatorDto.setRate(dbManager.getDouble(resultSet,"Rate"));
            lwindicatorDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwindicatorDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwindicatorDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwindicatorDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwindicatorDto);
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
        buffer.append("DELETE FROM Lwindicator WHERE ");
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
        buffer.append("SELECT count(*) FROM Lwindicator WHERE ");
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
