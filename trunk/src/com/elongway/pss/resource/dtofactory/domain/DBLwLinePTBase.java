package com.elongway.pss.resource.dtofactory.domain;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.elongway.pss.dto.domain.LwLinePTDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是线路电压互感器对照表的数据访问对象基类<br>
 */
public class DBLwLinePTBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwLinePTBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwLinePTBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public void insert(LwLinePTDto lwLinePTDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwLinePT (");
        buffer.append("LineCode,");
        buffer.append("PtModus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwLinePTDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwLinePTDto.getPtModus()).append("',");
            debugBuffer.append("'").append(lwLinePTDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwLinePTDto.getInputDate()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwLinePTDto.getLineCode());
        dbManager.setString(2,lwLinePTDto.getPtModus());
        dbManager.setString(3,lwLinePTDto.getFlag());
        dbManager.setString(4,lwLinePTDto.getInputDate());
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
        buffer.append("INSERT INTO LwLinePT (");
        buffer.append("LineCode,");
        buffer.append("PtModus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwLinePTDto lwLinePTDto = (LwLinePTDto)i.next();
            dbManager.setString(1,lwLinePTDto.getLineCode());
            dbManager.setString(2,lwLinePTDto.getPtModus());
            dbManager.setString(3,lwLinePTDto.getFlag());
            dbManager.setString(4,lwLinePTDto.getInputDate());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param lineCode 线路代码
     * @param ptModus 电压互感器型式
     * @throws Exception
     */
    public void delete(String lineCode,String ptModus)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwLinePT ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("PtModus=").append("'").append(ptModus).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("PtModus = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,ptModus);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public void update(LwLinePTDto lwLinePTDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwLinePT SET ");
        buffer.append("Flag = ?, ");
        buffer.append("InputDate = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwLinePT SET ");
            debugBuffer.append("Flag = '" + lwLinePTDto.getFlag() + "', ");
            debugBuffer.append("InputDate = '" + lwLinePTDto.getInputDate() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lwLinePTDto.getLineCode()).append("' AND ");
            debugBuffer.append("PtModus=").append("'").append(lwLinePTDto.getPtModus()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("PtModus = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwLinePTDto.getFlag());
        dbManager.setString(2,lwLinePTDto.getInputDate());
        //设置条件字段;
        dbManager.setString(3,lwLinePTDto.getLineCode());
        dbManager.setString(4,lwLinePTDto.getPtModus());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param lineCode 线路代码
     * @param ptModus 电压互感器型式
     * @return LwLinePTDto
     * @throws Exception
     */
    public LwLinePTDto findByPrimaryKey(String lineCode,String ptModus)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("PtModus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append("FROM LwLinePT ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("PtModus=").append("'").append(ptModus).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("PtModus = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,ptModus);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwLinePTDto lwLinePTDto = null;
        if(resultSet.next()){
            lwLinePTDto = new LwLinePTDto();
            lwLinePTDto.setLineCode(dbManager.getString(resultSet,1));
            lwLinePTDto.setPtModus(dbManager.getString(resultSet,2));
            lwLinePTDto.setFlag(dbManager.getString(resultSet,3));
            lwLinePTDto.setInputDate(dbManager.getString(resultSet,4));
        }
        resultSet.close();
        return lwLinePTDto;
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
        buffer.append("PtModus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append("FROM LwLinePT WHERE ");
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
        LwLinePTDto lwLinePTDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwLinePTDto = new LwLinePTDto();
            lwLinePTDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwLinePTDto.setPtModus(dbManager.getString(resultSet,"PtModus"));
            lwLinePTDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwLinePTDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            collection.add(lwLinePTDto);
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
        buffer.append("DELETE FROM LwLinePT WHERE ");
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
        buffer.append("SELECT count(*) FROM LwLinePT WHERE ");
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
