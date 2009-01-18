package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LineLossDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LineLoss-线损信息表的数据访问对象基类<br>
 */
public class DBLineLossBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLineLossBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLineLossBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lineLossDto lineLossDto
     * @throws Exception
     */
    public void insert(LineLossDto lineLossDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LineLoss (");
        buffer.append("LineCode,");
        buffer.append("R,");
        buffer.append("LineLong,");
        buffer.append("Volt,");
        buffer.append("T,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lineLossDto.getLineCode()).append("',");
            debugBuffer.append("").append(lineLossDto.getR()).append(",");
            debugBuffer.append("").append(lineLossDto.getLineLong()).append(",");
            debugBuffer.append("").append(lineLossDto.getVolt()).append(",");
            debugBuffer.append("").append(lineLossDto.getT()).append(",");
            debugBuffer.append("'").append(lineLossDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lineLossDto.getFlag()).append("',");
            debugBuffer.append("'").append(lineLossDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lineLossDto.getLineCode());
        dbManager.setDouble(2,lineLossDto.getR());
        dbManager.setDouble(3,lineLossDto.getLineLong());
        dbManager.setDouble(4,lineLossDto.getVolt());
        dbManager.setDouble(5,lineLossDto.getT());
        dbManager.setString(6,lineLossDto.getValidStatus());
        dbManager.setString(7,lineLossDto.getFlag());
        dbManager.setString(8,lineLossDto.getRemark());
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
        buffer.append("INSERT INTO LineLoss (");
        buffer.append("LineCode,");
        buffer.append("R,");
        buffer.append("LineLong,");
        buffer.append("Volt,");
        buffer.append("T,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LineLossDto lineLossDto = (LineLossDto)i.next();
            dbManager.setString(1,lineLossDto.getLineCode());
            dbManager.setDouble(2,lineLossDto.getR());
            dbManager.setDouble(3,lineLossDto.getLineLong());
            dbManager.setDouble(4,lineLossDto.getVolt());
            dbManager.setDouble(5,lineLossDto.getT());
            dbManager.setString(6,lineLossDto.getValidStatus());
            dbManager.setString(7,lineLossDto.getFlag());
            dbManager.setString(8,lineLossDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param lineCode 线路名称
     * @throws Exception
     */
    public void delete(String lineCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LineLoss ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lineLossDto lineLossDto
     * @throws Exception
     */
    public void update(LineLossDto lineLossDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LineLoss SET ");
        buffer.append("R = ?, ");
        buffer.append("LineLong = ?, ");
        buffer.append("Volt = ?, ");
        buffer.append("T = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LineLoss SET ");
            debugBuffer.append("R = " + lineLossDto.getR() + ", ");
            debugBuffer.append("LineLong = " + lineLossDto.getLineLong() + ", ");
            debugBuffer.append("Volt = " + lineLossDto.getVolt() + ", ");
            debugBuffer.append("T = " + lineLossDto.getT() + ", ");
            debugBuffer.append("ValidStatus = '" + lineLossDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lineLossDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lineLossDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineLossDto.getLineCode()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setDouble(1,lineLossDto.getR());
        dbManager.setDouble(2,lineLossDto.getLineLong());
        dbManager.setDouble(3,lineLossDto.getVolt());
        dbManager.setDouble(4,lineLossDto.getT());
        dbManager.setString(5,lineLossDto.getValidStatus());
        dbManager.setString(6,lineLossDto.getFlag());
        dbManager.setString(7,lineLossDto.getRemark());
        //设置条件字段;
        dbManager.setString(8,lineLossDto.getLineCode());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param lineCode 线路名称
     * @return LineLossDto
     * @throws Exception
     */
    public LineLossDto findByPrimaryKey(String lineCode)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("R,");
        buffer.append("LineLong,");
        buffer.append("Volt,");
        buffer.append("T,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LineLoss ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LineLossDto lineLossDto = null;
        if(resultSet.next()){
            lineLossDto = new LineLossDto();
            lineLossDto.setLineCode(dbManager.getString(resultSet,1));
            lineLossDto.setR(dbManager.getDouble(resultSet,2));
            lineLossDto.setLineLong(dbManager.getDouble(resultSet,3));
            lineLossDto.setVolt(dbManager.getDouble(resultSet,4));
            lineLossDto.setT(dbManager.getDouble(resultSet,5));
            lineLossDto.setValidStatus(dbManager.getString(resultSet,6));
            lineLossDto.setFlag(dbManager.getString(resultSet,7));
            lineLossDto.setRemark(dbManager.getString(resultSet,8));
        }
        resultSet.close();
        return lineLossDto;
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
        buffer.append("R,");
        buffer.append("LineLong,");
        buffer.append("Volt,");
        buffer.append("T,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LineLoss WHERE ");
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
        LineLossDto lineLossDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lineLossDto = new LineLossDto();
            lineLossDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lineLossDto.setR(dbManager.getDouble(resultSet,"R"));
            lineLossDto.setLineLong(dbManager.getDouble(resultSet,"LineLong"));
            lineLossDto.setVolt(dbManager.getDouble(resultSet,"Volt"));
            lineLossDto.setT(dbManager.getDouble(resultSet,"T"));
            lineLossDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lineLossDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lineLossDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lineLossDto);
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
        buffer.append("DELETE FROM LineLoss WHERE ");
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
        buffer.append("SELECT count(*) FROM LineLoss WHERE ");
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
