package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleDetail-趸售费用明细表的数据访问对象基类<br>
 */
public class DBLwWholeSaleDetailBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwWholeSaleDetailBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleDetailBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public void insert(LwWholeSaleDetailDto lwWholeSaleDetailDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwWholeSaleDetail (");
        buffer.append("CompanyName,");
        buffer.append("InputDate,");
        buffer.append("UnDenizenQuantity10kv,");
        buffer.append("UnDenizenMoney10kv,");
        buffer.append("DenizenQuantity10kv,");
        buffer.append("DenizenMoney10kv,");
        buffer.append("ProductQuantity10kv,");
        buffer.append("ProductMoney10kv,");
        buffer.append("UnIndustryQuantity10kv,");
        buffer.append("UnIndustryMoney10kv,");
        buffer.append("FarmUseQuantity10kv,");
        buffer.append("FarmUseMoney10kv,");
        buffer.append("BizQuantity10kv,");
        buffer.append("BizMoney10kv,");
        buffer.append("UnDenizenQuantity35kv,");
        buffer.append("UnDenizenMoney35kv,");
        buffer.append("DenizenQuantity35kv,");
        buffer.append("DenizenMoney35kv,");
        buffer.append("ProductQuantity35kv,");
        buffer.append("ProductMoney35kv,");
        buffer.append("UnIndustryQuantity35kv,");
        buffer.append("UnIndustryMoney35kv,");
        buffer.append("FarmUseQuantity35kv,");
        buffer.append("FarmUseMoney35kv,");
        buffer.append("BizQuantity35kv,");
        buffer.append("BizMoney35kv ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwWholeSaleDetailDto.getCompanyName()).append("',");
            debugBuffer.append("'").append(lwWholeSaleDetailDto.getInputDate()).append("',");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getUnDenizenQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getUnDenizenMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getDenizenQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getDenizenMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getProductQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getProductMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getUnIndustryQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getUnIndustryMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getFarmUseQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getFarmUseMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getBizQuantity10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getBizMoney10kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getUnDenizenQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getUnDenizenMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getDenizenQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getDenizenMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getProductQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getProductMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getUnIndustryQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getUnIndustryMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getFarmUseQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getFarmUseMoney35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getBizQuantity35kv()).append(",");
            debugBuffer.append("").append(lwWholeSaleDetailDto.getBizMoney35kv()).append(")");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwWholeSaleDetailDto.getCompanyName());
        dbManager.setString(2,lwWholeSaleDetailDto.getInputDate());
        dbManager.setDouble(3,lwWholeSaleDetailDto.getUnDenizenQuantity10kv());
        dbManager.setDouble(4,lwWholeSaleDetailDto.getUnDenizenMoney10kv());
        dbManager.setDouble(5,lwWholeSaleDetailDto.getDenizenQuantity10kv());
        dbManager.setDouble(6,lwWholeSaleDetailDto.getDenizenMoney10kv());
        dbManager.setDouble(7,lwWholeSaleDetailDto.getProductQuantity10kv());
        dbManager.setDouble(8,lwWholeSaleDetailDto.getProductMoney10kv());
        dbManager.setDouble(9,lwWholeSaleDetailDto.getUnIndustryQuantity10kv());
        dbManager.setDouble(10,lwWholeSaleDetailDto.getUnIndustryMoney10kv());
        dbManager.setDouble(11,lwWholeSaleDetailDto.getFarmUseQuantity10kv());
        dbManager.setDouble(12,lwWholeSaleDetailDto.getFarmUseMoney10kv());
        dbManager.setDouble(13,lwWholeSaleDetailDto.getBizQuantity10kv());
        dbManager.setDouble(14,lwWholeSaleDetailDto.getBizMoney10kv());
        dbManager.setDouble(15,lwWholeSaleDetailDto.getUnDenizenQuantity35kv());
        dbManager.setDouble(16,lwWholeSaleDetailDto.getUnDenizenMoney35kv());
        dbManager.setDouble(17,lwWholeSaleDetailDto.getDenizenQuantity35kv());
        dbManager.setDouble(18,lwWholeSaleDetailDto.getDenizenMoney35kv());
        dbManager.setDouble(19,lwWholeSaleDetailDto.getProductQuantity35kv());
        dbManager.setDouble(20,lwWholeSaleDetailDto.getProductMoney35kv());
        dbManager.setDouble(21,lwWholeSaleDetailDto.getUnIndustryQuantity35kv());
        dbManager.setDouble(22,lwWholeSaleDetailDto.getUnIndustryMoney35kv());
        dbManager.setDouble(23,lwWholeSaleDetailDto.getFarmUseQuantity35kv());
        dbManager.setDouble(24,lwWholeSaleDetailDto.getFarmUseMoney35kv());
        dbManager.setDouble(25,lwWholeSaleDetailDto.getBizQuantity35kv());
        dbManager.setDouble(26,lwWholeSaleDetailDto.getBizMoney35kv());
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
        buffer.append("INSERT INTO LwWholeSaleDetail (");
        buffer.append("CompanyName,");
        buffer.append("InputDate,");
        buffer.append("UnDenizenQuantity10kv,");
        buffer.append("UnDenizenMoney10kv,");
        buffer.append("DenizenQuantity10kv,");
        buffer.append("DenizenMoney10kv,");
        buffer.append("ProductQuantity10kv,");
        buffer.append("ProductMoney10kv,");
        buffer.append("UnIndustryQuantity10kv,");
        buffer.append("UnIndustryMoney10kv,");
        buffer.append("FarmUseQuantity10kv,");
        buffer.append("FarmUseMoney10kv,");
        buffer.append("BizQuantity10kv,");
        buffer.append("BizMoney10kv,");
        buffer.append("UnDenizenQuantity35kv,");
        buffer.append("UnDenizenMoney35kv,");
        buffer.append("DenizenQuantity35kv,");
        buffer.append("DenizenMoney35kv,");
        buffer.append("ProductQuantity35kv,");
        buffer.append("ProductMoney35kv,");
        buffer.append("UnIndustryQuantity35kv,");
        buffer.append("UnIndustryMoney35kv,");
        buffer.append("FarmUseQuantity35kv,");
        buffer.append("FarmUseMoney35kv,");
        buffer.append("BizQuantity35kv,");
        buffer.append("BizMoney35kv ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwWholeSaleDetailDto lwWholeSaleDetailDto = (LwWholeSaleDetailDto)i.next();
            dbManager.setString(1,lwWholeSaleDetailDto.getCompanyName());
            dbManager.setString(2,lwWholeSaleDetailDto.getInputDate());
            dbManager.setDouble(3,lwWholeSaleDetailDto.getUnDenizenQuantity10kv());
            dbManager.setDouble(4,lwWholeSaleDetailDto.getUnDenizenMoney10kv());
            dbManager.setDouble(5,lwWholeSaleDetailDto.getDenizenQuantity10kv());
            dbManager.setDouble(6,lwWholeSaleDetailDto.getDenizenMoney10kv());
            dbManager.setDouble(7,lwWholeSaleDetailDto.getProductQuantity10kv());
            dbManager.setDouble(8,lwWholeSaleDetailDto.getProductMoney10kv());
            dbManager.setDouble(9,lwWholeSaleDetailDto.getUnIndustryQuantity10kv());
            dbManager.setDouble(10,lwWholeSaleDetailDto.getUnIndustryMoney10kv());
            dbManager.setDouble(11,lwWholeSaleDetailDto.getFarmUseQuantity10kv());
            dbManager.setDouble(12,lwWholeSaleDetailDto.getFarmUseMoney10kv());
            dbManager.setDouble(13,lwWholeSaleDetailDto.getBizQuantity10kv());
            dbManager.setDouble(14,lwWholeSaleDetailDto.getBizMoney10kv());
            dbManager.setDouble(15,lwWholeSaleDetailDto.getUnDenizenQuantity35kv());
            dbManager.setDouble(16,lwWholeSaleDetailDto.getUnDenizenMoney35kv());
            dbManager.setDouble(17,lwWholeSaleDetailDto.getDenizenQuantity35kv());
            dbManager.setDouble(18,lwWholeSaleDetailDto.getDenizenMoney35kv());
            dbManager.setDouble(19,lwWholeSaleDetailDto.getProductQuantity35kv());
            dbManager.setDouble(20,lwWholeSaleDetailDto.getProductMoney35kv());
            dbManager.setDouble(21,lwWholeSaleDetailDto.getUnIndustryQuantity35kv());
            dbManager.setDouble(22,lwWholeSaleDetailDto.getUnIndustryMoney35kv());
            dbManager.setDouble(23,lwWholeSaleDetailDto.getFarmUseQuantity35kv());
            dbManager.setDouble(24,lwWholeSaleDetailDto.getFarmUseMoney35kv());
            dbManager.setDouble(25,lwWholeSaleDetailDto.getBizQuantity35kv());
            dbManager.setDouble(26,lwWholeSaleDetailDto.getBizMoney35kv());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param companyName 公司名称
     * @param inputDate 统计日期
     * @throws Exception
     */
    public void delete(String companyName,String inputDate)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwWholeSaleDetail ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CompanyName=").append("'").append(companyName).append("' AND ");
            debugBuffer.append("InputDate=").append("'").append(inputDate).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CompanyName = ? And ");
        buffer.append("InputDate = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,companyName);
        dbManager.setString(2,inputDate);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public void update(LwWholeSaleDetailDto lwWholeSaleDetailDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwWholeSaleDetail SET ");
        buffer.append("UnDenizenQuantity10kv = ?, ");
        buffer.append("UnDenizenMoney10kv = ?, ");
        buffer.append("DenizenQuantity10kv = ?, ");
        buffer.append("DenizenMoney10kv = ?, ");
        buffer.append("ProductQuantity10kv = ?, ");
        buffer.append("ProductMoney10kv = ?, ");
        buffer.append("UnIndustryQuantity10kv = ?, ");
        buffer.append("UnIndustryMoney10kv = ?, ");
        buffer.append("FarmUseQuantity10kv = ?, ");
        buffer.append("FarmUseMoney10kv = ?, ");
        buffer.append("BizQuantity10kv = ?, ");
        buffer.append("BizMoney10kv = ?, ");
        buffer.append("UnDenizenQuantity35kv = ?, ");
        buffer.append("UnDenizenMoney35kv = ?, ");
        buffer.append("DenizenQuantity35kv = ?, ");
        buffer.append("DenizenMoney35kv = ?, ");
        buffer.append("ProductQuantity35kv = ?, ");
        buffer.append("ProductMoney35kv = ?, ");
        buffer.append("UnIndustryQuantity35kv = ?, ");
        buffer.append("UnIndustryMoney35kv = ?, ");
        buffer.append("FarmUseQuantity35kv = ?, ");
        buffer.append("FarmUseMoney35kv = ?, ");
        buffer.append("BizQuantity35kv = ?, ");
        buffer.append("BizMoney35kv = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwWholeSaleDetail SET ");
            debugBuffer.append("UnDenizenQuantity10kv = " + lwWholeSaleDetailDto.getUnDenizenQuantity10kv() + ", ");
            debugBuffer.append("UnDenizenMoney10kv = " + lwWholeSaleDetailDto.getUnDenizenMoney10kv() + ", ");
            debugBuffer.append("DenizenQuantity10kv = " + lwWholeSaleDetailDto.getDenizenQuantity10kv() + ", ");
            debugBuffer.append("DenizenMoney10kv = " + lwWholeSaleDetailDto.getDenizenMoney10kv() + ", ");
            debugBuffer.append("ProductQuantity10kv = " + lwWholeSaleDetailDto.getProductQuantity10kv() + ", ");
            debugBuffer.append("ProductMoney10kv = " + lwWholeSaleDetailDto.getProductMoney10kv() + ", ");
            debugBuffer.append("UnIndustryQuantity10kv = " + lwWholeSaleDetailDto.getUnIndustryQuantity10kv() + ", ");
            debugBuffer.append("UnIndustryMoney10kv = " + lwWholeSaleDetailDto.getUnIndustryMoney10kv() + ", ");
            debugBuffer.append("FarmUseQuantity10kv = " + lwWholeSaleDetailDto.getFarmUseQuantity10kv() + ", ");
            debugBuffer.append("FarmUseMoney10kv = " + lwWholeSaleDetailDto.getFarmUseMoney10kv() + ", ");
            debugBuffer.append("BizQuantity10kv = " + lwWholeSaleDetailDto.getBizQuantity10kv() + ", ");
            debugBuffer.append("BizMoney10kv = " + lwWholeSaleDetailDto.getBizMoney10kv() + ", ");
            debugBuffer.append("UnDenizenQuantity35kv = " + lwWholeSaleDetailDto.getUnDenizenQuantity35kv() + ", ");
            debugBuffer.append("UnDenizenMoney35kv = " + lwWholeSaleDetailDto.getUnDenizenMoney35kv() + ", ");
            debugBuffer.append("DenizenQuantity35kv = " + lwWholeSaleDetailDto.getDenizenQuantity35kv() + ", ");
            debugBuffer.append("DenizenMoney35kv = " + lwWholeSaleDetailDto.getDenizenMoney35kv() + ", ");
            debugBuffer.append("ProductQuantity35kv = " + lwWholeSaleDetailDto.getProductQuantity35kv() + ", ");
            debugBuffer.append("ProductMoney35kv = " + lwWholeSaleDetailDto.getProductMoney35kv() + ", ");
            debugBuffer.append("UnIndustryQuantity35kv = " + lwWholeSaleDetailDto.getUnIndustryQuantity35kv() + ", ");
            debugBuffer.append("UnIndustryMoney35kv = " + lwWholeSaleDetailDto.getUnIndustryMoney35kv() + ", ");
            debugBuffer.append("FarmUseQuantity35kv = " + lwWholeSaleDetailDto.getFarmUseQuantity35kv() + ", ");
            debugBuffer.append("FarmUseMoney35kv = " + lwWholeSaleDetailDto.getFarmUseMoney35kv() + ", ");
            debugBuffer.append("BizQuantity35kv = " + lwWholeSaleDetailDto.getBizQuantity35kv() + ", ");
            debugBuffer.append("BizMoney35kv = " + lwWholeSaleDetailDto.getBizMoney35kv() + " ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("CompanyName=").append("'").append(lwWholeSaleDetailDto.getCompanyName()).append("' AND ");
            debugBuffer.append("InputDate=").append("'").append(lwWholeSaleDetailDto.getInputDate()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CompanyName = ? And ");
        buffer.append("InputDate = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setDouble(1,lwWholeSaleDetailDto.getUnDenizenQuantity10kv());
        dbManager.setDouble(2,lwWholeSaleDetailDto.getUnDenizenMoney10kv());
        dbManager.setDouble(3,lwWholeSaleDetailDto.getDenizenQuantity10kv());
        dbManager.setDouble(4,lwWholeSaleDetailDto.getDenizenMoney10kv());
        dbManager.setDouble(5,lwWholeSaleDetailDto.getProductQuantity10kv());
        dbManager.setDouble(6,lwWholeSaleDetailDto.getProductMoney10kv());
        dbManager.setDouble(7,lwWholeSaleDetailDto.getUnIndustryQuantity10kv());
        dbManager.setDouble(8,lwWholeSaleDetailDto.getUnIndustryMoney10kv());
        dbManager.setDouble(9,lwWholeSaleDetailDto.getFarmUseQuantity10kv());
        dbManager.setDouble(10,lwWholeSaleDetailDto.getFarmUseMoney10kv());
        dbManager.setDouble(11,lwWholeSaleDetailDto.getBizQuantity10kv());
        dbManager.setDouble(12,lwWholeSaleDetailDto.getBizMoney10kv());
        dbManager.setDouble(13,lwWholeSaleDetailDto.getUnDenizenQuantity35kv());
        dbManager.setDouble(14,lwWholeSaleDetailDto.getUnDenizenMoney35kv());
        dbManager.setDouble(15,lwWholeSaleDetailDto.getDenizenQuantity35kv());
        dbManager.setDouble(16,lwWholeSaleDetailDto.getDenizenMoney35kv());
        dbManager.setDouble(17,lwWholeSaleDetailDto.getProductQuantity35kv());
        dbManager.setDouble(18,lwWholeSaleDetailDto.getProductMoney35kv());
        dbManager.setDouble(19,lwWholeSaleDetailDto.getUnIndustryQuantity35kv());
        dbManager.setDouble(20,lwWholeSaleDetailDto.getUnIndustryMoney35kv());
        dbManager.setDouble(21,lwWholeSaleDetailDto.getFarmUseQuantity35kv());
        dbManager.setDouble(22,lwWholeSaleDetailDto.getFarmUseMoney35kv());
        dbManager.setDouble(23,lwWholeSaleDetailDto.getBizQuantity35kv());
        dbManager.setDouble(24,lwWholeSaleDetailDto.getBizMoney35kv());
        //设置条件字段;
        dbManager.setString(25,lwWholeSaleDetailDto.getCompanyName());
        dbManager.setString(26,lwWholeSaleDetailDto.getInputDate());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param companyName 公司名称
     * @param inputDate 统计日期
     * @return LwWholeSaleDetailDto
     * @throws Exception
     */
    public LwWholeSaleDetailDto findByPrimaryKey(String companyName,String inputDate)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("CompanyName,");
        buffer.append("InputDate,");
        buffer.append("UnDenizenQuantity10kv,");
        buffer.append("UnDenizenMoney10kv,");
        buffer.append("DenizenQuantity10kv,");
        buffer.append("DenizenMoney10kv,");
        buffer.append("ProductQuantity10kv,");
        buffer.append("ProductMoney10kv,");
        buffer.append("UnIndustryQuantity10kv,");
        buffer.append("UnIndustryMoney10kv,");
        buffer.append("FarmUseQuantity10kv,");
        buffer.append("FarmUseMoney10kv,");
        buffer.append("BizQuantity10kv,");
        buffer.append("BizMoney10kv,");
        buffer.append("UnDenizenQuantity35kv,");
        buffer.append("UnDenizenMoney35kv,");
        buffer.append("DenizenQuantity35kv,");
        buffer.append("DenizenMoney35kv,");
        buffer.append("ProductQuantity35kv,");
        buffer.append("ProductMoney35kv,");
        buffer.append("UnIndustryQuantity35kv,");
        buffer.append("UnIndustryMoney35kv,");
        buffer.append("FarmUseQuantity35kv,");
        buffer.append("FarmUseMoney35kv,");
        buffer.append("BizQuantity35kv,");
        buffer.append("BizMoney35kv ");
        buffer.append("FROM LwWholeSaleDetail ");
        if(true){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("CompanyName=").append("'").append(companyName).append("' AND ");
             debugBuffer.append("InputDate=").append("'").append(inputDate).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("CompanyName = ? And ");
        buffer.append("InputDate = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,companyName);
        dbManager.setString(2,inputDate);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwWholeSaleDetailDto   lwWholeSaleDetailDto = new LwWholeSaleDetailDto();
        if(resultSet.next()){
            lwWholeSaleDetailDto.setCompanyName(dbManager.getString(resultSet,1));
            lwWholeSaleDetailDto.setInputDate(dbManager.getString(resultSet,2));
            lwWholeSaleDetailDto.setUnDenizenQuantity10kv(dbManager.getDouble(resultSet,3));
            lwWholeSaleDetailDto.setUnDenizenMoney10kv(dbManager.getDouble(resultSet,4));
            lwWholeSaleDetailDto.setDenizenQuantity10kv(dbManager.getDouble(resultSet,5));
            lwWholeSaleDetailDto.setDenizenMoney10kv(dbManager.getDouble(resultSet,6));
            lwWholeSaleDetailDto.setProductQuantity10kv(dbManager.getDouble(resultSet,7));
            lwWholeSaleDetailDto.setProductMoney10kv(dbManager.getDouble(resultSet,8));
            lwWholeSaleDetailDto.setUnIndustryQuantity10kv(dbManager.getDouble(resultSet,9));
            lwWholeSaleDetailDto.setUnIndustryMoney10kv(dbManager.getDouble(resultSet,10));
            lwWholeSaleDetailDto.setFarmUseQuantity10kv(dbManager.getDouble(resultSet,11));
            lwWholeSaleDetailDto.setFarmUseMoney10kv(dbManager.getDouble(resultSet,12));
            lwWholeSaleDetailDto.setBizQuantity10kv(dbManager.getDouble(resultSet,13));
            lwWholeSaleDetailDto.setBizMoney10kv(dbManager.getDouble(resultSet,14));
            lwWholeSaleDetailDto.setUnDenizenQuantity35kv(dbManager.getDouble(resultSet,15));
            lwWholeSaleDetailDto.setUnDenizenMoney35kv(dbManager.getDouble(resultSet,16));
            lwWholeSaleDetailDto.setDenizenQuantity35kv(dbManager.getDouble(resultSet,17));
            lwWholeSaleDetailDto.setDenizenMoney35kv(dbManager.getDouble(resultSet,18));
            lwWholeSaleDetailDto.setProductQuantity35kv(dbManager.getDouble(resultSet,19));
            lwWholeSaleDetailDto.setProductMoney35kv(dbManager.getDouble(resultSet,20));
            lwWholeSaleDetailDto.setUnIndustryQuantity35kv(dbManager.getDouble(resultSet,21));
            lwWholeSaleDetailDto.setUnIndustryMoney35kv(dbManager.getDouble(resultSet,22));
            lwWholeSaleDetailDto.setFarmUseQuantity35kv(dbManager.getDouble(resultSet,23));
            lwWholeSaleDetailDto.setFarmUseMoney35kv(dbManager.getDouble(resultSet,24));
            lwWholeSaleDetailDto.setBizQuantity35kv(dbManager.getDouble(resultSet,25));
            lwWholeSaleDetailDto.setBizMoney35kv(dbManager.getDouble(resultSet,26));
        }
        resultSet.close();
        return lwWholeSaleDetailDto;
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
        buffer.append("CompanyName,");
        buffer.append("InputDate,");
        buffer.append("UnDenizenQuantity10kv,");
        buffer.append("UnDenizenMoney10kv,");
        buffer.append("DenizenQuantity10kv,");
        buffer.append("DenizenMoney10kv,");
        buffer.append("ProductQuantity10kv,");
        buffer.append("ProductMoney10kv,");
        buffer.append("UnIndustryQuantity10kv,");
        buffer.append("UnIndustryMoney10kv,");
        buffer.append("FarmUseQuantity10kv,");
        buffer.append("FarmUseMoney10kv,");
        buffer.append("BizQuantity10kv,");
        buffer.append("BizMoney10kv,");
        buffer.append("UnDenizenQuantity35kv,");
        buffer.append("UnDenizenMoney35kv,");
        buffer.append("DenizenQuantity35kv,");
        buffer.append("DenizenMoney35kv,");
        buffer.append("ProductQuantity35kv,");
        buffer.append("ProductMoney35kv,");
        buffer.append("UnIndustryQuantity35kv,");
        buffer.append("UnIndustryMoney35kv,");
        buffer.append("FarmUseQuantity35kv,");
        buffer.append("FarmUseMoney35kv,");
        buffer.append("BizQuantity35kv,");
        buffer.append("BizMoney35kv ");
        buffer.append("FROM LwWholeSaleDetail WHERE ");
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
        LwWholeSaleDetailDto lwWholeSaleDetailDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwWholeSaleDetailDto = new LwWholeSaleDetailDto();
            lwWholeSaleDetailDto.setCompanyName(dbManager.getString(resultSet,"CompanyName"));
            lwWholeSaleDetailDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwWholeSaleDetailDto.setUnDenizenQuantity10kv(dbManager.getDouble(resultSet,"UnDenizenQuantity10kv"));
            lwWholeSaleDetailDto.setUnDenizenMoney10kv(dbManager.getDouble(resultSet,"UnDenizenMoney10kv"));
            lwWholeSaleDetailDto.setDenizenQuantity10kv(dbManager.getDouble(resultSet,"DenizenQuantity10kv"));
            lwWholeSaleDetailDto.setDenizenMoney10kv(dbManager.getDouble(resultSet,"DenizenMoney10kv"));
            lwWholeSaleDetailDto.setProductQuantity10kv(dbManager.getDouble(resultSet,"ProductQuantity10kv"));
            lwWholeSaleDetailDto.setProductMoney10kv(dbManager.getDouble(resultSet,"ProductMoney10kv"));
            lwWholeSaleDetailDto.setUnIndustryQuantity10kv(dbManager.getDouble(resultSet,"UnIndustryQuantity10kv"));
            lwWholeSaleDetailDto.setUnIndustryMoney10kv(dbManager.getDouble(resultSet,"UnIndustryMoney10kv"));
            lwWholeSaleDetailDto.setFarmUseQuantity10kv(dbManager.getDouble(resultSet,"FarmUseQuantity10kv"));
            lwWholeSaleDetailDto.setFarmUseMoney10kv(dbManager.getDouble(resultSet,"FarmUseMoney10kv"));
            lwWholeSaleDetailDto.setBizQuantity10kv(dbManager.getDouble(resultSet,"BizQuantity10kv"));
            lwWholeSaleDetailDto.setBizMoney10kv(dbManager.getDouble(resultSet,"BizMoney10kv"));
            lwWholeSaleDetailDto.setUnDenizenQuantity35kv(dbManager.getDouble(resultSet,"UnDenizenQuantity35kv"));
            lwWholeSaleDetailDto.setUnDenizenMoney35kv(dbManager.getDouble(resultSet,"UnDenizenMoney35kv"));
            lwWholeSaleDetailDto.setDenizenQuantity35kv(dbManager.getDouble(resultSet,"DenizenQuantity35kv"));
            lwWholeSaleDetailDto.setDenizenMoney35kv(dbManager.getDouble(resultSet,"DenizenMoney35kv"));
            lwWholeSaleDetailDto.setProductQuantity35kv(dbManager.getDouble(resultSet,"ProductQuantity35kv"));
            lwWholeSaleDetailDto.setProductMoney35kv(dbManager.getDouble(resultSet,"ProductMoney35kv"));
            lwWholeSaleDetailDto.setUnIndustryQuantity35kv(dbManager.getDouble(resultSet,"UnIndustryQuantity35kv"));
            lwWholeSaleDetailDto.setUnIndustryMoney35kv(dbManager.getDouble(resultSet,"UnIndustryMoney35kv"));
            lwWholeSaleDetailDto.setFarmUseQuantity35kv(dbManager.getDouble(resultSet,"FarmUseQuantity35kv"));
            lwWholeSaleDetailDto.setFarmUseMoney35kv(dbManager.getDouble(resultSet,"FarmUseMoney35kv"));
            lwWholeSaleDetailDto.setBizQuantity35kv(dbManager.getDouble(resultSet,"BizQuantity35kv"));
            lwWholeSaleDetailDto.setBizMoney35kv(dbManager.getDouble(resultSet,"BizMoney35kv"));
            collection.add(lwWholeSaleDetailDto);
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
        buffer.append("DELETE FROM LwWholeSaleDetail WHERE ");
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
        buffer.append("SELECT count(*) FROM LwWholeSaleDetail WHERE ");
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
