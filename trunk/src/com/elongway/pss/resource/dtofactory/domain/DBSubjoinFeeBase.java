package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.SubjoinFeeDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是subjoinFee-附加费用表的数据访问对象基类<br>
 */
public class DBSubjoinFeeBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBSubjoinFeeBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBSubjoinFeeBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void insert(SubjoinFeeDto subjoinFeeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO SubjoinFee (");
        buffer.append("PowerType,");
        buffer.append("Name,");
        buffer.append("NongwanghuanDai,");
        buffer.append("SanXia,");
        buffer.append("Kuquyimin,");
        buffer.append("Kezaishengnengyuan ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(subjoinFeeDto.getPowerType()).append("',");
            debugBuffer.append("'").append(subjoinFeeDto.getName()).append("',");
            debugBuffer.append("").append(subjoinFeeDto.getNongwanghuanDai()).append(",");
            debugBuffer.append("").append(subjoinFeeDto.getSanXia()).append(",");
            debugBuffer.append("").append(subjoinFeeDto.getKuquyimin()).append(",");
            debugBuffer.append("").append(subjoinFeeDto.getKezaishengnengyuan()).append(")");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,subjoinFeeDto.getPowerType());
        dbManager.setString(2,subjoinFeeDto.getName());
        dbManager.setDouble(3,subjoinFeeDto.getNongwanghuanDai());
        dbManager.setDouble(4,subjoinFeeDto.getSanXia());
        dbManager.setDouble(5,subjoinFeeDto.getKuquyimin());
        dbManager.setDouble(6,subjoinFeeDto.getKezaishengnengyuan());
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
        buffer.append("INSERT INTO SubjoinFee (");
        buffer.append("PowerType,");
        buffer.append("Name,");
        buffer.append("NongwanghuanDai,");
        buffer.append("SanXia,");
        buffer.append("Kuquyimin,");
        buffer.append("Kezaishengnengyuan ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            SubjoinFeeDto subjoinFeeDto = (SubjoinFeeDto)i.next();
            dbManager.setString(1,subjoinFeeDto.getPowerType());
            dbManager.setString(2,subjoinFeeDto.getName());
            dbManager.setDouble(3,subjoinFeeDto.getNongwanghuanDai());
            dbManager.setDouble(4,subjoinFeeDto.getSanXia());
            dbManager.setDouble(5,subjoinFeeDto.getKuquyimin());
            dbManager.setDouble(6,subjoinFeeDto.getKezaishengnengyuan());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param powerType 用电类别
     * @throws Exception
     */
    public void delete(String powerType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM SubjoinFee ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerType=").append("'").append(powerType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerType = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,powerType);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void update(SubjoinFeeDto subjoinFeeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE SubjoinFee SET ");
        buffer.append("Name = ?, ");
        buffer.append("NongwanghuanDai = ?, ");
        buffer.append("SanXia = ?, ");
        buffer.append("Kuquyimin = ?, ");
        buffer.append("Kezaishengnengyuan = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE SubjoinFee SET ");
            debugBuffer.append("Name = '" + subjoinFeeDto.getName() + "', ");
            debugBuffer.append("NongwanghuanDai = " + subjoinFeeDto.getNongwanghuanDai() + ", ");
            debugBuffer.append("SanXia = " + subjoinFeeDto.getSanXia() + ", ");
            debugBuffer.append("Kuquyimin = " + subjoinFeeDto.getKuquyimin() + ", ");
            debugBuffer.append("Kezaishengnengyuan = " + subjoinFeeDto.getKezaishengnengyuan() + " ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerType=").append("'").append(subjoinFeeDto.getPowerType()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerType = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,subjoinFeeDto.getName());
        dbManager.setDouble(2,subjoinFeeDto.getNongwanghuanDai());
        dbManager.setDouble(3,subjoinFeeDto.getSanXia());
        dbManager.setDouble(4,subjoinFeeDto.getKuquyimin());
        dbManager.setDouble(5,subjoinFeeDto.getKezaishengnengyuan());
        //设置条件字段;
        dbManager.setString(6,subjoinFeeDto.getPowerType());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param powerType 用电类别
     * @return SubjoinFeeDto
     * @throws Exception
     */
    public SubjoinFeeDto findByPrimaryKey(String powerType)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("PowerType,");
        buffer.append("Name,");
        buffer.append("NongwanghuanDai,");
        buffer.append("SanXia,");
        buffer.append("Kuquyimin,");
        buffer.append("Kezaishengnengyuan ");
        buffer.append("FROM SubjoinFee ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("PowerType=").append("'").append(powerType).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("PowerType = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,powerType);
        ResultSet resultSet = dbManager.executePreparedQuery();
        SubjoinFeeDto subjoinFeeDto = null;
        if(resultSet.next()){
            subjoinFeeDto = new SubjoinFeeDto();
            subjoinFeeDto.setPowerType(dbManager.getString(resultSet,1));
            subjoinFeeDto.setName(dbManager.getString(resultSet,2));
            subjoinFeeDto.setNongwanghuanDai(dbManager.getDouble(resultSet,3));
            subjoinFeeDto.setSanXia(dbManager.getDouble(resultSet,4));
            subjoinFeeDto.setKuquyimin(dbManager.getDouble(resultSet,5));
            subjoinFeeDto.setKezaishengnengyuan(dbManager.getDouble(resultSet,6));
        }
        resultSet.close();
        return subjoinFeeDto;
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
        buffer.append("PowerType,");
        buffer.append("Name,");
        buffer.append("NongwanghuanDai,");
        buffer.append("SanXia,");
        buffer.append("Kuquyimin,");
        buffer.append("Kezaishengnengyuan ");
        buffer.append("FROM SubjoinFee WHERE ");
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
        SubjoinFeeDto subjoinFeeDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            subjoinFeeDto = new SubjoinFeeDto();
            subjoinFeeDto.setPowerType(dbManager.getString(resultSet,"PowerType"));
            subjoinFeeDto.setName(dbManager.getString(resultSet,"Name"));
            subjoinFeeDto.setNongwanghuanDai(dbManager.getDouble(resultSet,"NongwanghuanDai"));
            subjoinFeeDto.setSanXia(dbManager.getDouble(resultSet,"SanXia"));
            subjoinFeeDto.setKuquyimin(dbManager.getDouble(resultSet,"Kuquyimin"));
            subjoinFeeDto.setKezaishengnengyuan(dbManager.getDouble(resultSet,"Kezaishengnengyuan"));
            collection.add(subjoinFeeDto);
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
        buffer.append("DELETE FROM SubjoinFee WHERE ");
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
        buffer.append("SELECT count(*) FROM SubjoinFee WHERE ");
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
