package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWPowerFeeFaxing-电费电量发行表的数据访问对象基类<br>
 */
public class DBLwPowerFeeFaxingBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwPowerFeeFaxingBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwPowerFeeFaxingBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void insert(LwPowerFeeFaxingDto lwPowerFeeFaxingDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwPowerFeeFaxing (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("StatMonth,");
        buffer.append("StatStyle,");
        buffer.append("InputDate,");
        buffer.append("Quantity,");
        buffer.append("PurePowerFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("SanXiaFee,");
        buffer.append("SanXiaTax,");
        buffer.append("PureDianJin,");
        buffer.append("DianJinTax,");
        buffer.append("PureJiJin,");
        buffer.append("JiJinTax,");
        buffer.append("ChaBieFee,");
        buffer.append("ChaBieTax,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwPowerFeeFaxingDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwPowerFeeFaxingDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwPowerFeeFaxingDto.getStatMonth()).append("',");
            debugBuffer.append("'").append(lwPowerFeeFaxingDto.getStatStyle()).append("',");
            debugBuffer.append("'").append(lwPowerFeeFaxingDto.getInputDate()).append("',");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getQuantity()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getPurePowerFee()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getPowerFeeTax()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getSanXiaFee()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getSanXiaTax()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getPureDianJin()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getDianJinTax()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getPureJiJin()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getJiJinTax()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getChaBieFee()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getChaBieTax()).append(",");
            debugBuffer.append("").append(lwPowerFeeFaxingDto.getSumFee()).append(",");
            debugBuffer.append("'").append(lwPowerFeeFaxingDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwPowerFeeFaxingDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwPowerFeeFaxingDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwPowerFeeFaxingDto.getUserNo());
        dbManager.setString(2,lwPowerFeeFaxingDto.getUserName());
        dbManager.setString(3,lwPowerFeeFaxingDto.getStatMonth());
        dbManager.setString(4,lwPowerFeeFaxingDto.getStatStyle());
        dbManager.setString(5,lwPowerFeeFaxingDto.getInputDate());
        dbManager.setLong(6,lwPowerFeeFaxingDto.getQuantity());
        dbManager.setDouble(7,lwPowerFeeFaxingDto.getPurePowerFee());
        dbManager.setDouble(8,lwPowerFeeFaxingDto.getPowerFeeTax());
        dbManager.setDouble(9,lwPowerFeeFaxingDto.getSanXiaFee());
        dbManager.setDouble(10,lwPowerFeeFaxingDto.getSanXiaTax());
        dbManager.setDouble(11,lwPowerFeeFaxingDto.getPureDianJin());
        dbManager.setDouble(12,lwPowerFeeFaxingDto.getDianJinTax());
        dbManager.setDouble(13,lwPowerFeeFaxingDto.getPureJiJin());
        dbManager.setDouble(14,lwPowerFeeFaxingDto.getJiJinTax());
        dbManager.setDouble(15,lwPowerFeeFaxingDto.getChaBieFee());
        dbManager.setDouble(16,lwPowerFeeFaxingDto.getChaBieTax());
        dbManager.setDouble(17,lwPowerFeeFaxingDto.getSumFee());
        dbManager.setString(18,lwPowerFeeFaxingDto.getValidStatus());
        dbManager.setString(19,lwPowerFeeFaxingDto.getFlag());
        dbManager.setString(20,lwPowerFeeFaxingDto.getRemark());
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
        buffer.append("INSERT INTO LwPowerFeeFaxing (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("StatMonth,");
        buffer.append("StatStyle,");
        buffer.append("InputDate,");
        buffer.append("Quantity,");
        buffer.append("PurePowerFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("SanXiaFee,");
        buffer.append("SanXiaTax,");
        buffer.append("PureDianJin,");
        buffer.append("DianJinTax,");
        buffer.append("PureJiJin,");
        buffer.append("JiJinTax,");
        buffer.append("ChaBieFee,");
        buffer.append("ChaBieTax,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwPowerFeeFaxingDto lwPowerFeeFaxingDto = (LwPowerFeeFaxingDto)i.next();
            dbManager.setString(1,lwPowerFeeFaxingDto.getUserNo());
            dbManager.setString(2,lwPowerFeeFaxingDto.getUserName());
            dbManager.setString(3,lwPowerFeeFaxingDto.getStatMonth());
            dbManager.setString(4,lwPowerFeeFaxingDto.getStatStyle());
            dbManager.setString(5,lwPowerFeeFaxingDto.getInputDate());
            dbManager.setLong(6,lwPowerFeeFaxingDto.getQuantity());
            dbManager.setDouble(7,lwPowerFeeFaxingDto.getPurePowerFee());
            dbManager.setDouble(8,lwPowerFeeFaxingDto.getPowerFeeTax());
            dbManager.setDouble(9,lwPowerFeeFaxingDto.getSanXiaFee());
            dbManager.setDouble(10,lwPowerFeeFaxingDto.getSanXiaTax());
            dbManager.setDouble(11,lwPowerFeeFaxingDto.getPureDianJin());
            dbManager.setDouble(12,lwPowerFeeFaxingDto.getDianJinTax());
            dbManager.setDouble(13,lwPowerFeeFaxingDto.getPureJiJin());
            dbManager.setDouble(14,lwPowerFeeFaxingDto.getJiJinTax());
            dbManager.setDouble(15,lwPowerFeeFaxingDto.getChaBieFee());
            dbManager.setDouble(16,lwPowerFeeFaxingDto.getChaBieTax());
            dbManager.setDouble(17,lwPowerFeeFaxingDto.getSumFee());
            dbManager.setString(18,lwPowerFeeFaxingDto.getValidStatus());
            dbManager.setString(19,lwPowerFeeFaxingDto.getFlag());
            dbManager.setString(20,lwPowerFeeFaxingDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userNo 户号
     * @param statMonth 统计年月
     * @param statStyle 统计方式
     * @throws Exception
     */
    public void delete(String userNo,String statMonth,String statStyle)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwPowerFeeFaxing ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("' AND ");
            debugBuffer.append("StatStyle=").append("'").append(statStyle).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ? And ");
        buffer.append("StatStyle = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        dbManager.setString(2,statMonth);
        dbManager.setString(3,statStyle);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void update(LwPowerFeeFaxingDto lwPowerFeeFaxingDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwPowerFeeFaxing SET ");
        buffer.append("UserName = ?, ");
        buffer.append("InputDate = ?, ");
        buffer.append("Quantity = ?, ");
        buffer.append("PurePowerFee = ?, ");
        buffer.append("PowerFeeTax = ?, ");
        buffer.append("SanXiaFee = ?, ");
        buffer.append("SanXiaTax = ?, ");
        buffer.append("PureDianJin = ?, ");
        buffer.append("DianJinTax = ?, ");
        buffer.append("PureJiJin = ?, ");
        buffer.append("JiJinTax = ?, ");
        buffer.append("ChaBieFee = ?, ");
        buffer.append("ChaBieTax = ?, ");
        buffer.append("SumFee = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwPowerFeeFaxing SET ");
            debugBuffer.append("UserName = '" + lwPowerFeeFaxingDto.getUserName() + "', ");
            debugBuffer.append("InputDate = '" + lwPowerFeeFaxingDto.getInputDate() + "', ");
            debugBuffer.append("Quantity = " + lwPowerFeeFaxingDto.getQuantity() + ", ");
            debugBuffer.append("PurePowerFee = " + lwPowerFeeFaxingDto.getPurePowerFee() + ", ");
            debugBuffer.append("PowerFeeTax = " + lwPowerFeeFaxingDto.getPowerFeeTax() + ", ");
            debugBuffer.append("SanXiaFee = " + lwPowerFeeFaxingDto.getSanXiaFee() + ", ");
            debugBuffer.append("SanXiaTax = " + lwPowerFeeFaxingDto.getSanXiaTax() + ", ");
            debugBuffer.append("PureDianJin = " + lwPowerFeeFaxingDto.getPureDianJin() + ", ");
            debugBuffer.append("DianJinTax = " + lwPowerFeeFaxingDto.getDianJinTax() + ", ");
            debugBuffer.append("PureJiJin = " + lwPowerFeeFaxingDto.getPureJiJin() + ", ");
            debugBuffer.append("JiJinTax = " + lwPowerFeeFaxingDto.getJiJinTax() + ", ");
            debugBuffer.append("ChaBieFee = " + lwPowerFeeFaxingDto.getChaBieFee() + ", ");
            debugBuffer.append("ChaBieTax = " + lwPowerFeeFaxingDto.getChaBieTax() + ", ");
            debugBuffer.append("SumFee = " + lwPowerFeeFaxingDto.getSumFee() + ", ");
            debugBuffer.append("ValidStatus = '" + lwPowerFeeFaxingDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwPowerFeeFaxingDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwPowerFeeFaxingDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwPowerFeeFaxingDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwPowerFeeFaxingDto.getStatMonth()).append("' AND ");
            debugBuffer.append("StatStyle=").append("'").append(lwPowerFeeFaxingDto.getStatStyle()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ? And ");
        buffer.append("StatStyle = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwPowerFeeFaxingDto.getUserName());
        dbManager.setString(2,lwPowerFeeFaxingDto.getInputDate());
        dbManager.setLong(3,lwPowerFeeFaxingDto.getQuantity());
        dbManager.setDouble(4,lwPowerFeeFaxingDto.getPurePowerFee());
        dbManager.setDouble(5,lwPowerFeeFaxingDto.getPowerFeeTax());
        dbManager.setDouble(6,lwPowerFeeFaxingDto.getSanXiaFee());
        dbManager.setDouble(7,lwPowerFeeFaxingDto.getSanXiaTax());
        dbManager.setDouble(8,lwPowerFeeFaxingDto.getPureDianJin());
        dbManager.setDouble(9,lwPowerFeeFaxingDto.getDianJinTax());
        dbManager.setDouble(10,lwPowerFeeFaxingDto.getPureJiJin());
        dbManager.setDouble(11,lwPowerFeeFaxingDto.getJiJinTax());
        dbManager.setDouble(12,lwPowerFeeFaxingDto.getChaBieFee());
        dbManager.setDouble(13,lwPowerFeeFaxingDto.getChaBieTax());
        dbManager.setDouble(14,lwPowerFeeFaxingDto.getSumFee());
        dbManager.setString(15,lwPowerFeeFaxingDto.getValidStatus());
        dbManager.setString(16,lwPowerFeeFaxingDto.getFlag());
        dbManager.setString(17,lwPowerFeeFaxingDto.getRemark());
        //设置条件字段;
        dbManager.setString(18,lwPowerFeeFaxingDto.getUserNo());
        dbManager.setString(19,lwPowerFeeFaxingDto.getStatMonth());
        dbManager.setString(20,lwPowerFeeFaxingDto.getStatStyle());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 统计年月
     * @param statStyle 统计方式
     * @return LwPowerFeeFaxingDto
     * @throws Exception
     */
    public LwPowerFeeFaxingDto findByPrimaryKey(String userNo,String statMonth,String statStyle)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("StatMonth,");
        buffer.append("StatStyle,");
        buffer.append("InputDate,");
        buffer.append("Quantity,");
        buffer.append("PurePowerFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("SanXiaFee,");
        buffer.append("SanXiaTax,");
        buffer.append("PureDianJin,");
        buffer.append("DianJinTax,");
        buffer.append("PureJiJin,");
        buffer.append("JiJinTax,");
        buffer.append("ChaBieFee,");
        buffer.append("ChaBieTax,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwPowerFeeFaxing ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("' AND ");
            debugBuffer.append("StatStyle=").append("'").append(statStyle).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ? And ");
        buffer.append("StatStyle = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        dbManager.setString(2,statMonth);
        dbManager.setString(3,statStyle);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwPowerFeeFaxingDto lwPowerFeeFaxingDto = null;
        if(resultSet.next()){
            lwPowerFeeFaxingDto = new LwPowerFeeFaxingDto();
            lwPowerFeeFaxingDto.setUserNo(dbManager.getString(resultSet,1));
            lwPowerFeeFaxingDto.setUserName(dbManager.getString(resultSet,2));
            lwPowerFeeFaxingDto.setStatMonth(dbManager.getString(resultSet,3));
            lwPowerFeeFaxingDto.setStatStyle(dbManager.getString(resultSet,4));
            lwPowerFeeFaxingDto.setInputDate(dbManager.getString(resultSet,5));
            lwPowerFeeFaxingDto.setQuantity(dbManager.getLong(resultSet,6));
            lwPowerFeeFaxingDto.setPurePowerFee(dbManager.getDouble(resultSet,7));
            lwPowerFeeFaxingDto.setPowerFeeTax(dbManager.getDouble(resultSet,8));
            lwPowerFeeFaxingDto.setSanXiaFee(dbManager.getDouble(resultSet,9));
            lwPowerFeeFaxingDto.setSanXiaTax(dbManager.getDouble(resultSet,10));
            lwPowerFeeFaxingDto.setPureDianJin(dbManager.getDouble(resultSet,11));
            lwPowerFeeFaxingDto.setDianJinTax(dbManager.getDouble(resultSet,12));
            lwPowerFeeFaxingDto.setPureJiJin(dbManager.getDouble(resultSet,13));
            lwPowerFeeFaxingDto.setJiJinTax(dbManager.getDouble(resultSet,14));
            lwPowerFeeFaxingDto.setChaBieFee(dbManager.getDouble(resultSet,15));
            lwPowerFeeFaxingDto.setChaBieTax(dbManager.getDouble(resultSet,16));
            lwPowerFeeFaxingDto.setSumFee(dbManager.getDouble(resultSet,17));
            lwPowerFeeFaxingDto.setValidStatus(dbManager.getString(resultSet,18));
            lwPowerFeeFaxingDto.setFlag(dbManager.getString(resultSet,19));
            lwPowerFeeFaxingDto.setRemark(dbManager.getString(resultSet,20));
        }
        resultSet.close();
        return lwPowerFeeFaxingDto;
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
        buffer.append("UserName,");
        buffer.append("StatMonth,");
        buffer.append("StatStyle,");
        buffer.append("InputDate,");
        buffer.append("Quantity,");
        buffer.append("PurePowerFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("SanXiaFee,");
        buffer.append("SanXiaTax,");
        buffer.append("PureDianJin,");
        buffer.append("DianJinTax,");
        buffer.append("PureJiJin,");
        buffer.append("JiJinTax,");
        buffer.append("ChaBieFee,");
        buffer.append("ChaBieTax,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwPowerFeeFaxing WHERE ");
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
        LwPowerFeeFaxingDto lwPowerFeeFaxingDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwPowerFeeFaxingDto = new LwPowerFeeFaxingDto();
            lwPowerFeeFaxingDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwPowerFeeFaxingDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwPowerFeeFaxingDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwPowerFeeFaxingDto.setStatStyle(dbManager.getString(resultSet,"StatStyle"));
            lwPowerFeeFaxingDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwPowerFeeFaxingDto.setQuantity(dbManager.getLong(resultSet,"Quantity"));
            lwPowerFeeFaxingDto.setPurePowerFee(dbManager.getDouble(resultSet,"PurePowerFee"));
            lwPowerFeeFaxingDto.setPowerFeeTax(dbManager.getDouble(resultSet,"PowerFeeTax"));
            lwPowerFeeFaxingDto.setSanXiaFee(dbManager.getDouble(resultSet,"SanXiaFee"));
            lwPowerFeeFaxingDto.setSanXiaTax(dbManager.getDouble(resultSet,"SanXiaTax"));
            lwPowerFeeFaxingDto.setPureDianJin(dbManager.getDouble(resultSet,"PureDianJin"));
            lwPowerFeeFaxingDto.setDianJinTax(dbManager.getDouble(resultSet,"DianJinTax"));
            lwPowerFeeFaxingDto.setPureJiJin(dbManager.getDouble(resultSet,"PureJiJin"));
            lwPowerFeeFaxingDto.setJiJinTax(dbManager.getDouble(resultSet,"JiJinTax"));
            lwPowerFeeFaxingDto.setChaBieFee(dbManager.getDouble(resultSet,"ChaBieFee"));
            lwPowerFeeFaxingDto.setChaBieTax(dbManager.getDouble(resultSet,"ChaBieTax"));
            lwPowerFeeFaxingDto.setSumFee(dbManager.getDouble(resultSet,"SumFee"));
            lwPowerFeeFaxingDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwPowerFeeFaxingDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwPowerFeeFaxingDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwPowerFeeFaxingDto);
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
        buffer.append("DELETE FROM LwPowerFeeFaxing WHERE ");
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
        buffer.append("SELECT count(*) FROM LwPowerFeeFaxing WHERE ");
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
