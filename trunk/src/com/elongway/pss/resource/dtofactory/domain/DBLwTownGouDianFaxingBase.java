package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownGouDianFaxingDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownGouDianFaxing-直供乡购电结算单的数据访问对象基类<br>
 */
public class DBLwTownGouDianFaxingBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwTownGouDianFaxingBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownGouDianFaxingBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public void insert(LwTownGouDianFaxingDto lwTownGouDianFaxingDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwTownGouDianFaxing (");
        buffer.append("TownCode,");
        buffer.append("TownName,");
        buffer.append("StatMonth,");
        buffer.append("PowerQuantity,");
        buffer.append("PureFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("PureDianJin,");
        buffer.append("DianJinTax,");
        buffer.append("PureSanXia,");
        buffer.append("SanXiaTax,");
        buffer.append("PureJiJin,");
        buffer.append("JiJinTax,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwTownGouDianFaxingDto.getTownCode()).append("',");
            debugBuffer.append("'").append(lwTownGouDianFaxingDto.getTownName()).append("',");
            debugBuffer.append("'").append(lwTownGouDianFaxingDto.getStatMonth()).append("',");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getPowerQuantity()).append(",");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getPureFee()).append(",");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getPowerFeeTax()).append(",");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getPureDianJin()).append(",");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getDianJinTax()).append(",");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getPureSanXia()).append(",");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getSanXiaTax()).append(",");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getPureJiJin()).append(",");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getJiJinTax()).append(",");
            debugBuffer.append("").append(lwTownGouDianFaxingDto.getSumFee()).append(",");
            debugBuffer.append("'").append(lwTownGouDianFaxingDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwTownGouDianFaxingDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwTownGouDianFaxingDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwTownGouDianFaxingDto.getTownCode());
        dbManager.setString(2,lwTownGouDianFaxingDto.getTownName());
        dbManager.setString(3,lwTownGouDianFaxingDto.getStatMonth());
        dbManager.setDouble(4,lwTownGouDianFaxingDto.getPowerQuantity());
        dbManager.setDouble(5,lwTownGouDianFaxingDto.getPureFee());
        dbManager.setDouble(6,lwTownGouDianFaxingDto.getPowerFeeTax());
        dbManager.setDouble(7,lwTownGouDianFaxingDto.getPureDianJin());
        dbManager.setDouble(8,lwTownGouDianFaxingDto.getDianJinTax());
        dbManager.setDouble(9,lwTownGouDianFaxingDto.getPureSanXia());
        dbManager.setDouble(10,lwTownGouDianFaxingDto.getSanXiaTax());
        dbManager.setDouble(11,lwTownGouDianFaxingDto.getPureJiJin());
        dbManager.setDouble(12,lwTownGouDianFaxingDto.getJiJinTax());
        dbManager.setDouble(13,lwTownGouDianFaxingDto.getSumFee());
        dbManager.setString(14,lwTownGouDianFaxingDto.getValidStatus());
        dbManager.setString(15,lwTownGouDianFaxingDto.getFlag());
        dbManager.setString(16,lwTownGouDianFaxingDto.getRemark());
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
        buffer.append("INSERT INTO LwTownGouDianFaxing (");
        buffer.append("TownCode,");
        buffer.append("TownName,");
        buffer.append("StatMonth,");
        buffer.append("PowerQuantity,");
        buffer.append("PureFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("PureDianJin,");
        buffer.append("DianJinTax,");
        buffer.append("PureSanXia,");
        buffer.append("SanXiaTax,");
        buffer.append("PureJiJin,");
        buffer.append("JiJinTax,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwTownGouDianFaxingDto lwTownGouDianFaxingDto = (LwTownGouDianFaxingDto)i.next();
            dbManager.setString(1,lwTownGouDianFaxingDto.getTownCode());
            dbManager.setString(2,lwTownGouDianFaxingDto.getTownName());
            dbManager.setString(3,lwTownGouDianFaxingDto.getStatMonth());
            dbManager.setDouble(4,lwTownGouDianFaxingDto.getPowerQuantity());
            dbManager.setDouble(5,lwTownGouDianFaxingDto.getPureFee());
            dbManager.setDouble(6,lwTownGouDianFaxingDto.getPowerFeeTax());
            dbManager.setDouble(7,lwTownGouDianFaxingDto.getPureDianJin());
            dbManager.setDouble(8,lwTownGouDianFaxingDto.getDianJinTax());
            dbManager.setDouble(9,lwTownGouDianFaxingDto.getPureSanXia());
            dbManager.setDouble(10,lwTownGouDianFaxingDto.getSanXiaTax());
            dbManager.setDouble(11,lwTownGouDianFaxingDto.getPureJiJin());
            dbManager.setDouble(12,lwTownGouDianFaxingDto.getJiJinTax());
            dbManager.setDouble(13,lwTownGouDianFaxingDto.getSumFee());
            dbManager.setString(14,lwTownGouDianFaxingDto.getValidStatus());
            dbManager.setString(15,lwTownGouDianFaxingDto.getFlag());
            dbManager.setString(16,lwTownGouDianFaxingDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param townCode 乡镇代码
     * @param statMonth 发行年月
     * @throws Exception
     */
    public void delete(String townCode,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwTownGouDianFaxing ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("TownCode=").append("'").append(townCode).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("TownCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,townCode);
        dbManager.setString(2,statMonth);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public void update(LwTownGouDianFaxingDto lwTownGouDianFaxingDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwTownGouDianFaxing SET ");
        buffer.append("TownName = ?, ");
        buffer.append("PowerQuantity = ?, ");
        buffer.append("PureFee = ?, ");
        buffer.append("PowerFeeTax = ?, ");
        buffer.append("PureDianJin = ?, ");
        buffer.append("DianJinTax = ?, ");
        buffer.append("PureSanXia = ?, ");
        buffer.append("SanXiaTax = ?, ");
        buffer.append("PureJiJin = ?, ");
        buffer.append("JiJinTax = ?, ");
        buffer.append("SumFee = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwTownGouDianFaxing SET ");
            debugBuffer.append("TownName = '" + lwTownGouDianFaxingDto.getTownName() + "', ");
            debugBuffer.append("PowerQuantity = " + lwTownGouDianFaxingDto.getPowerQuantity() + ", ");
            debugBuffer.append("PureFee = " + lwTownGouDianFaxingDto.getPureFee() + ", ");
            debugBuffer.append("PowerFeeTax = " + lwTownGouDianFaxingDto.getPowerFeeTax() + ", ");
            debugBuffer.append("PureDianJin = " + lwTownGouDianFaxingDto.getPureDianJin() + ", ");
            debugBuffer.append("DianJinTax = " + lwTownGouDianFaxingDto.getDianJinTax() + ", ");
            debugBuffer.append("PureSanXia = " + lwTownGouDianFaxingDto.getPureSanXia() + ", ");
            debugBuffer.append("SanXiaTax = " + lwTownGouDianFaxingDto.getSanXiaTax() + ", ");
            debugBuffer.append("PureJiJin = " + lwTownGouDianFaxingDto.getPureJiJin() + ", ");
            debugBuffer.append("JiJinTax = " + lwTownGouDianFaxingDto.getJiJinTax() + ", ");
            debugBuffer.append("SumFee = " + lwTownGouDianFaxingDto.getSumFee() + ", ");
            debugBuffer.append("ValidStatus = '" + lwTownGouDianFaxingDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwTownGouDianFaxingDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwTownGouDianFaxingDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("TownCode=").append("'").append(lwTownGouDianFaxingDto.getTownCode()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwTownGouDianFaxingDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("TownCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwTownGouDianFaxingDto.getTownName());
        dbManager.setDouble(2,lwTownGouDianFaxingDto.getPowerQuantity());
        dbManager.setDouble(3,lwTownGouDianFaxingDto.getPureFee());
        dbManager.setDouble(4,lwTownGouDianFaxingDto.getPowerFeeTax());
        dbManager.setDouble(5,lwTownGouDianFaxingDto.getPureDianJin());
        dbManager.setDouble(6,lwTownGouDianFaxingDto.getDianJinTax());
        dbManager.setDouble(7,lwTownGouDianFaxingDto.getPureSanXia());
        dbManager.setDouble(8,lwTownGouDianFaxingDto.getSanXiaTax());
        dbManager.setDouble(9,lwTownGouDianFaxingDto.getPureJiJin());
        dbManager.setDouble(10,lwTownGouDianFaxingDto.getJiJinTax());
        dbManager.setDouble(11,lwTownGouDianFaxingDto.getSumFee());
        dbManager.setString(12,lwTownGouDianFaxingDto.getValidStatus());
        dbManager.setString(13,lwTownGouDianFaxingDto.getFlag());
        dbManager.setString(14,lwTownGouDianFaxingDto.getRemark());
        //设置条件字段;
        dbManager.setString(15,lwTownGouDianFaxingDto.getTownCode());
        dbManager.setString(16,lwTownGouDianFaxingDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param townCode 乡镇代码
     * @param statMonth 发行年月
     * @return LwTownGouDianFaxingDto
     * @throws Exception
     */
    public LwTownGouDianFaxingDto findByPrimaryKey(String townCode,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("TownCode,");
        buffer.append("TownName,");
        buffer.append("StatMonth,");
        buffer.append("PowerQuantity,");
        buffer.append("PureFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("PureDianJin,");
        buffer.append("DianJinTax,");
        buffer.append("PureSanXia,");
        buffer.append("SanXiaTax,");
        buffer.append("PureJiJin,");
        buffer.append("JiJinTax,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwTownGouDianFaxing ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("TownCode=").append("'").append(townCode).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("TownCode = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,townCode);
        dbManager.setString(2,statMonth);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwTownGouDianFaxingDto lwTownGouDianFaxingDto = null;
        if(resultSet.next()){
            lwTownGouDianFaxingDto = new LwTownGouDianFaxingDto();
            lwTownGouDianFaxingDto.setTownCode(dbManager.getString(resultSet,1));
            lwTownGouDianFaxingDto.setTownName(dbManager.getString(resultSet,2));
            lwTownGouDianFaxingDto.setStatMonth(dbManager.getString(resultSet,3));
            lwTownGouDianFaxingDto.setPowerQuantity(dbManager.getDouble(resultSet,4));
            lwTownGouDianFaxingDto.setPureFee(dbManager.getDouble(resultSet,5));
            lwTownGouDianFaxingDto.setPowerFeeTax(dbManager.getDouble(resultSet,6));
            lwTownGouDianFaxingDto.setPureDianJin(dbManager.getDouble(resultSet,7));
            lwTownGouDianFaxingDto.setDianJinTax(dbManager.getDouble(resultSet,8));
            lwTownGouDianFaxingDto.setPureSanXia(dbManager.getDouble(resultSet,9));
            lwTownGouDianFaxingDto.setSanXiaTax(dbManager.getDouble(resultSet,10));
            lwTownGouDianFaxingDto.setPureJiJin(dbManager.getDouble(resultSet,11));
            lwTownGouDianFaxingDto.setJiJinTax(dbManager.getDouble(resultSet,12));
            lwTownGouDianFaxingDto.setSumFee(dbManager.getDouble(resultSet,13));
            lwTownGouDianFaxingDto.setValidStatus(dbManager.getString(resultSet,14));
            lwTownGouDianFaxingDto.setFlag(dbManager.getString(resultSet,15));
            lwTownGouDianFaxingDto.setRemark(dbManager.getString(resultSet,16));
        }
        resultSet.close();
        return lwTownGouDianFaxingDto;
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
        buffer.append("TownCode,");
        buffer.append("TownName,");
        buffer.append("StatMonth,");
        buffer.append("PowerQuantity,");
        buffer.append("PureFee,");
        buffer.append("PowerFeeTax,");
        buffer.append("PureDianJin,");
        buffer.append("DianJinTax,");
        buffer.append("PureSanXia,");
        buffer.append("SanXiaTax,");
        buffer.append("PureJiJin,");
        buffer.append("JiJinTax,");
        buffer.append("SumFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwTownGouDianFaxing WHERE ");
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
        LwTownGouDianFaxingDto lwTownGouDianFaxingDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwTownGouDianFaxingDto = new LwTownGouDianFaxingDto();
            lwTownGouDianFaxingDto.setTownCode(dbManager.getString(resultSet,"TownCode"));
            lwTownGouDianFaxingDto.setTownName(dbManager.getString(resultSet,"TownName"));
            lwTownGouDianFaxingDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwTownGouDianFaxingDto.setPowerQuantity(dbManager.getDouble(resultSet,"PowerQuantity"));
            lwTownGouDianFaxingDto.setPureFee(dbManager.getDouble(resultSet,"PureFee"));
            lwTownGouDianFaxingDto.setPowerFeeTax(dbManager.getDouble(resultSet,"PowerFeeTax"));
            lwTownGouDianFaxingDto.setPureDianJin(dbManager.getDouble(resultSet,"PureDianJin"));
            lwTownGouDianFaxingDto.setDianJinTax(dbManager.getDouble(resultSet,"DianJinTax"));
            lwTownGouDianFaxingDto.setPureSanXia(dbManager.getDouble(resultSet,"PureSanXia"));
            lwTownGouDianFaxingDto.setSanXiaTax(dbManager.getDouble(resultSet,"SanXiaTax"));
            lwTownGouDianFaxingDto.setPureJiJin(dbManager.getDouble(resultSet,"PureJiJin"));
            lwTownGouDianFaxingDto.setJiJinTax(dbManager.getDouble(resultSet,"JiJinTax"));
            lwTownGouDianFaxingDto.setSumFee(dbManager.getDouble(resultSet,"SumFee"));
            lwTownGouDianFaxingDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwTownGouDianFaxingDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwTownGouDianFaxingDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwTownGouDianFaxingDto);
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
        buffer.append("DELETE FROM LwTownGouDianFaxing WHERE ");
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
        buffer.append("SELECT count(*) FROM LwTownGouDianFaxing WHERE ");
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
