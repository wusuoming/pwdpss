package com.elongway.pss.resource.dtofactory.domain;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.elongway.pss.dto.domain.LwProrateDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWProrate-比例分摊表的数据访问对象基类<br>
 */
public class DBLwProrateBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwProrateBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwProrateBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwProrateDto lwProrateDto
     * @throws Exception
     */
    public void insert(LwProrateDto lwProrateDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwProrate (");
        buffer.append("UserNo,");
        buffer.append("Agricultural,");
        buffer.append("Produce,");
        buffer.append("Resident,");
        buffer.append("Indecisive,");
        buffer.append("Industry,");
        buffer.append("Business,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwProrateDto.getUserNo()).append("',");
            debugBuffer.append("").append(lwProrateDto.getAgricultural()).append(",");
            debugBuffer.append("").append(lwProrateDto.getProduce()).append(",");
            debugBuffer.append("").append(lwProrateDto.getResident()).append(",");
            debugBuffer.append("").append(lwProrateDto.getIndecisive()).append(",");
            debugBuffer.append("").append(lwProrateDto.getIndustry()).append(",");
            debugBuffer.append("").append(lwProrateDto.getBusiness()).append(",");
            debugBuffer.append("'").append(lwProrateDto.getInputDate()).append("',");
            debugBuffer.append("'").append(lwProrateDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwProrateDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwProrateDto.getFlag()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwProrateDto.getUserNo());
        dbManager.setDouble(2,lwProrateDto.getAgricultural());
        dbManager.setDouble(3,lwProrateDto.getProduce());
        dbManager.setDouble(4,lwProrateDto.getResident());
        dbManager.setDouble(5,lwProrateDto.getIndecisive());
        dbManager.setDouble(6,lwProrateDto.getIndustry());
        dbManager.setDouble(7,lwProrateDto.getBusiness());
        dbManager.setString(8,lwProrateDto.getInputDate());
        dbManager.setString(9,lwProrateDto.getValidStatus());
        dbManager.setString(10,lwProrateDto.getRemark());
        dbManager.setString(11,lwProrateDto.getFlag());
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
        buffer.append("INSERT INTO LwProrate (");
        buffer.append("UserNo,");
        buffer.append("Agricultural,");
        buffer.append("Produce,");
        buffer.append("Resident,");
        buffer.append("Indecisive,");
        buffer.append("Industry,");
        buffer.append("Business,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwProrateDto lwProrateDto = (LwProrateDto)i.next();
            dbManager.setString(1,lwProrateDto.getUserNo());
            dbManager.setDouble(2,lwProrateDto.getAgricultural());
            dbManager.setDouble(3,lwProrateDto.getProduce());
            dbManager.setDouble(4,lwProrateDto.getResident());
            dbManager.setDouble(5,lwProrateDto.getIndecisive());
            dbManager.setDouble(6,lwProrateDto.getIndustry());
            dbManager.setDouble(7,lwProrateDto.getBusiness());
            dbManager.setString(8,lwProrateDto.getInputDate());
            dbManager.setString(9,lwProrateDto.getValidStatus());
            dbManager.setString(10,lwProrateDto.getRemark());
            dbManager.setString(11,lwProrateDto.getFlag());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userNo 户号
     * @throws Exception
     */
    public void delete(String userNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwProrate ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwProrateDto lwProrateDto
     * @throws Exception
     */
    public void update(LwProrateDto lwProrateDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwProrate SET ");
        buffer.append("Agricultural = ?, ");
        buffer.append("Produce = ?, ");
        buffer.append("Resident = ?, ");
        buffer.append("Indecisive = ?, ");
        buffer.append("Industry = ?, ");
        buffer.append("Business = ?, ");
        buffer.append("InputDate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("Flag = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwProrate SET ");
            debugBuffer.append("Agricultural = " + lwProrateDto.getAgricultural() + ", ");
            debugBuffer.append("Produce = " + lwProrateDto.getProduce() + ", ");
            debugBuffer.append("Resident = " + lwProrateDto.getResident() + ", ");
            debugBuffer.append("Indecisive = " + lwProrateDto.getIndecisive() + ", ");
            debugBuffer.append("Industry = " + lwProrateDto.getIndustry() + ", ");
            debugBuffer.append("Business = " + lwProrateDto.getBusiness() + ", ");
            debugBuffer.append("InputDate = '" + lwProrateDto.getInputDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwProrateDto.getValidStatus() + "', ");
            debugBuffer.append("Remark = '" + lwProrateDto.getRemark() + "', ");
            debugBuffer.append("Flag = '" + lwProrateDto.getFlag() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwProrateDto.getUserNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setDouble(1,lwProrateDto.getAgricultural());
        dbManager.setDouble(2,lwProrateDto.getProduce());
        dbManager.setDouble(3,lwProrateDto.getResident());
        dbManager.setDouble(4,lwProrateDto.getIndecisive());
        dbManager.setDouble(5,lwProrateDto.getIndustry());
        dbManager.setDouble(6,lwProrateDto.getBusiness());
        dbManager.setString(7,lwProrateDto.getInputDate());
        dbManager.setString(8,lwProrateDto.getValidStatus());
        dbManager.setString(9,lwProrateDto.getRemark());
        dbManager.setString(10,lwProrateDto.getFlag());
        //设置条件字段;
        dbManager.setString(11,lwProrateDto.getUserNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @return LwProrateDto
     * @throws Exception
     */
    public LwProrateDto findByPrimaryKey(String userNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("Agricultural,");
        buffer.append("Produce,");
        buffer.append("Resident,");
        buffer.append("Indecisive,");
        buffer.append("Industry,");
        buffer.append("Business,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append("FROM LwProrate ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwProrateDto lwProrateDto = null;
        if(resultSet.next()){
            lwProrateDto = new LwProrateDto();
            lwProrateDto.setUserNo(dbManager.getString(resultSet,1));
            lwProrateDto.setAgricultural(dbManager.getDouble(resultSet,2));
            lwProrateDto.setProduce(dbManager.getDouble(resultSet,3));
            lwProrateDto.setResident(dbManager.getDouble(resultSet,4));
            lwProrateDto.setIndecisive(dbManager.getDouble(resultSet,5));
            lwProrateDto.setIndustry(dbManager.getDouble(resultSet,6));
            lwProrateDto.setBusiness(dbManager.getDouble(resultSet,7));
            lwProrateDto.setInputDate(dbManager.getString(resultSet,8));
            lwProrateDto.setValidStatus(dbManager.getString(resultSet,9));
            lwProrateDto.setRemark(dbManager.getString(resultSet,10));
            lwProrateDto.setFlag(dbManager.getString(resultSet,11));
        }
        resultSet.close();
        return lwProrateDto;
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
        buffer.append("UserNo,");
        buffer.append("Agricultural,");
        buffer.append("Produce,");
        buffer.append("Resident,");
        buffer.append("Indecisive,");
        buffer.append("Industry,");
        buffer.append("Business,");
        buffer.append("InputDate,");
        buffer.append("ValidStatus,");
        buffer.append("Remark,");
        buffer.append("Flag ");
        buffer.append("FROM LwProrate WHERE ");
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
        LwProrateDto lwProrateDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwProrateDto = new LwProrateDto();
            lwProrateDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwProrateDto.setAgricultural(dbManager.getDouble(resultSet,"Agricultural"));
            lwProrateDto.setProduce(dbManager.getDouble(resultSet,"Produce"));
            lwProrateDto.setResident(dbManager.getDouble(resultSet,"Resident"));
            lwProrateDto.setIndecisive(dbManager.getDouble(resultSet,"Indecisive"));
            lwProrateDto.setIndustry(dbManager.getDouble(resultSet,"Industry"));
            lwProrateDto.setBusiness(dbManager.getDouble(resultSet,"Business"));
            lwProrateDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwProrateDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwProrateDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwProrateDto.setFlag(dbManager.getString(resultSet,"Flag"));
            collection.add(lwProrateDto);
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
        buffer.append("DELETE FROM LwProrate WHERE ");
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
        buffer.append("SELECT count(*) FROM LwProrate WHERE ");
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
