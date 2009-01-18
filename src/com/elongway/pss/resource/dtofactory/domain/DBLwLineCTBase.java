package com.elongway.pss.resource.dtofactory.domain;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.elongway.pss.dto.domain.LwLineCTDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是线路电流互感器对照表的数据访问对象基类<br>
 */
public class DBLwLineCTBase{
	 /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwLineCTBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwLineCTBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwLineCTDto lwLineCTDto
     * @throws Exception
     */
    public void insert(LwLineCTDto lwLineCTDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwLineCT (");
        buffer.append("LineCode,");
        buffer.append("CtModus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwLineCTDto.getLineCode()).append("',");
            debugBuffer.append("'").append(lwLineCTDto.getCtModus()).append("',");
            debugBuffer.append("'").append(lwLineCTDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwLineCTDto.getInputDate()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwLineCTDto.getLineCode());
        dbManager.setString(2,lwLineCTDto.getCtModus());
        dbManager.setString(3,lwLineCTDto.getFlag());
        dbManager.setString(4,lwLineCTDto.getInputDate());
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
        buffer.append("INSERT INTO LwLineCT (");
        buffer.append("LineCode,");
        buffer.append("CtModus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwLineCTDto lwLineCTDto = (LwLineCTDto)i.next();
            dbManager.setString(1,lwLineCTDto.getLineCode());
            dbManager.setString(2,lwLineCTDto.getCtModus());
            dbManager.setString(3,lwLineCTDto.getFlag());
            dbManager.setString(4,lwLineCTDto.getInputDate());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param lineCode 线路代码
     * @param ctModus 电流互感器型式
     * @throws Exception
     */
    public void delete(String lineCode,String ctModus)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwLineCT ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("CtModus=").append("'").append(ctModus).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("CtModus = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,ctModus);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwLineCTDto lwLineCTDto
     * @throws Exception
     */
    public void update(LwLineCTDto lwLineCTDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwLineCT SET ");
        buffer.append("Flag = ?, ");
        buffer.append("InputDate = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwLineCT SET ");
            debugBuffer.append("Flag = '" + lwLineCTDto.getFlag() + "', ");
            debugBuffer.append("InputDate = '" + lwLineCTDto.getInputDate() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lwLineCTDto.getLineCode()).append("' AND ");
            debugBuffer.append("CtModus=").append("'").append(lwLineCTDto.getCtModus()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("CtModus = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwLineCTDto.getFlag());
        dbManager.setString(2,lwLineCTDto.getInputDate());
        //设置条件字段;
        dbManager.setString(3,lwLineCTDto.getLineCode());
        dbManager.setString(4,lwLineCTDto.getCtModus());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param lineCode 线路代码
     * @param ctModus 电流互感器型式
     * @return LwLineCTDto
     * @throws Exception
     */
    public LwLineCTDto findByPrimaryKey(String lineCode,String ctModus)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("LineCode,");
        buffer.append("CtModus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append("FROM LwLineCT ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("LineCode=").append("'").append(lineCode).append("' AND ");
            debugBuffer.append("CtModus=").append("'").append(ctModus).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("LineCode = ? And ");
        buffer.append("CtModus = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,lineCode);
        dbManager.setString(2,ctModus);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwLineCTDto lwLineCTDto = null;
        if(resultSet.next()){
            lwLineCTDto = new LwLineCTDto();
            lwLineCTDto.setLineCode(dbManager.getString(resultSet,1));
            lwLineCTDto.setCtModus(dbManager.getString(resultSet,2));
            lwLineCTDto.setFlag(dbManager.getString(resultSet,3));
            lwLineCTDto.setInputDate(dbManager.getString(resultSet,4));
        }
        resultSet.close();
        return lwLineCTDto;
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
        buffer.append("CtModus,");
        buffer.append("Flag,");
        buffer.append("InputDate ");
        buffer.append("FROM LwLineCT WHERE ");
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
        LwLineCTDto lwLineCTDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwLineCTDto = new LwLineCTDto();
            lwLineCTDto.setLineCode(dbManager.getString(resultSet,"LineCode"));
            lwLineCTDto.setCtModus(dbManager.getString(resultSet,"CtModus"));
            lwLineCTDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwLineCTDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            collection.add(lwLineCTDto);
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
        buffer.append("DELETE FROM LwLineCT WHERE ");
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
        buffer.append("SELECT count(*) FROM LwLineCT WHERE ");
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
