package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryAppendDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownPriceSummaryAppend-直供乡追加电费计算总表的数据访问对象基类<br>
 */
public class DBLwTownPriceSummaryAppendBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwTownPriceSummaryAppendBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownPriceSummaryAppendBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto
     * @throws Exception
     */
    public void insert(LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwTownPriceSummaryAppend (");
        buffer.append("UserNo,");
        buffer.append("StatMonth,");
        buffer.append("InputDate,");
        buffer.append("AppendFarmFee,");
        buffer.append("AppendIndustryFee,");
        buffer.append("AppendProduceFee,");
        buffer.append("AppendBizFee,");
        buffer.append("AppendNotPeopleFee,");
        buffer.append("AppendPeopleFee,");
        buffer.append("AppendCalPowerFee,");
        buffer.append("AppendCalQuantity,");
        buffer.append("AppendLoan,");
        buffer.append("AppendSanXia,");
        buffer.append("AppendKZS,");
        buffer.append("AppendKuQu,");
        buffer.append("AppendJiJin,");
        buffer.append("SumAppendFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwTownPriceSummaryAppendDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryAppendDto.getStatMonth()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryAppendDto.getInputDate()).append("',");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendFarmFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendIndustryFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendProduceFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendBizFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendNotPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendPeopleFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendCalPowerFee()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendCalQuantity()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendLoan()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendSanXia()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendKZS()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendKuQu()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getAppendJiJin()).append(",");
            debugBuffer.append("").append(lwTownPriceSummaryAppendDto.getSumAppendFee()).append(",");
            debugBuffer.append("'").append(lwTownPriceSummaryAppendDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryAppendDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwTownPriceSummaryAppendDto.getRemark()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwTownPriceSummaryAppendDto.getUserNo());
        dbManager.setString(2,lwTownPriceSummaryAppendDto.getStatMonth());
        dbManager.setString(3,lwTownPriceSummaryAppendDto.getInputDate());
        dbManager.setDouble(4,lwTownPriceSummaryAppendDto.getAppendFarmFee());
        dbManager.setDouble(5,lwTownPriceSummaryAppendDto.getAppendIndustryFee());
        dbManager.setDouble(6,lwTownPriceSummaryAppendDto.getAppendProduceFee());
        dbManager.setDouble(7,lwTownPriceSummaryAppendDto.getAppendBizFee());
        dbManager.setDouble(8,lwTownPriceSummaryAppendDto.getAppendNotPeopleFee());
        dbManager.setDouble(9,lwTownPriceSummaryAppendDto.getAppendPeopleFee());
        dbManager.setDouble(10,lwTownPriceSummaryAppendDto.getAppendCalPowerFee());
        dbManager.setDouble(11,lwTownPriceSummaryAppendDto.getAppendCalQuantity());
        dbManager.setDouble(12,lwTownPriceSummaryAppendDto.getAppendLoan());
        dbManager.setDouble(13,lwTownPriceSummaryAppendDto.getAppendSanXia());
        dbManager.setDouble(14,lwTownPriceSummaryAppendDto.getAppendKZS());
        dbManager.setDouble(15,lwTownPriceSummaryAppendDto.getAppendKuQu());
        dbManager.setDouble(16,lwTownPriceSummaryAppendDto.getAppendJiJin());
        dbManager.setDouble(17,lwTownPriceSummaryAppendDto.getSumAppendFee());
        dbManager.setString(18,lwTownPriceSummaryAppendDto.getValidStatus());
        dbManager.setString(19,lwTownPriceSummaryAppendDto.getFlag());
        dbManager.setString(20,lwTownPriceSummaryAppendDto.getRemark());
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
        buffer.append("INSERT INTO LwTownPriceSummaryAppend (");
        buffer.append("UserNo,");
        buffer.append("StatMonth,");
        buffer.append("InputDate,");
        buffer.append("AppendFarmFee,");
        buffer.append("AppendIndustryFee,");
        buffer.append("AppendProduceFee,");
        buffer.append("AppendBizFee,");
        buffer.append("AppendNotPeopleFee,");
        buffer.append("AppendPeopleFee,");
        buffer.append("AppendCalPowerFee,");
        buffer.append("AppendCalQuantity,");
        buffer.append("AppendLoan,");
        buffer.append("AppendSanXia,");
        buffer.append("AppendKZS,");
        buffer.append("AppendKuQu,");
        buffer.append("AppendJiJin,");
        buffer.append("SumAppendFee,");
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
            LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto = (LwTownPriceSummaryAppendDto)i.next();
            dbManager.setString(1,lwTownPriceSummaryAppendDto.getUserNo());
            dbManager.setString(2,lwTownPriceSummaryAppendDto.getStatMonth());
            dbManager.setString(3,lwTownPriceSummaryAppendDto.getInputDate());
            dbManager.setDouble(4,lwTownPriceSummaryAppendDto.getAppendFarmFee());
            dbManager.setDouble(5,lwTownPriceSummaryAppendDto.getAppendIndustryFee());
            dbManager.setDouble(6,lwTownPriceSummaryAppendDto.getAppendProduceFee());
            dbManager.setDouble(7,lwTownPriceSummaryAppendDto.getAppendBizFee());
            dbManager.setDouble(8,lwTownPriceSummaryAppendDto.getAppendNotPeopleFee());
            dbManager.setDouble(9,lwTownPriceSummaryAppendDto.getAppendPeopleFee());
            dbManager.setDouble(10,lwTownPriceSummaryAppendDto.getAppendCalPowerFee());
            dbManager.setDouble(11,lwTownPriceSummaryAppendDto.getAppendCalQuantity());
            dbManager.setDouble(12,lwTownPriceSummaryAppendDto.getAppendLoan());
            dbManager.setDouble(13,lwTownPriceSummaryAppendDto.getAppendSanXia());
            dbManager.setDouble(14,lwTownPriceSummaryAppendDto.getAppendKZS());
            dbManager.setDouble(15,lwTownPriceSummaryAppendDto.getAppendKuQu());
            dbManager.setDouble(16,lwTownPriceSummaryAppendDto.getAppendJiJin());
            dbManager.setDouble(17,lwTownPriceSummaryAppendDto.getSumAppendFee());
            dbManager.setString(18,lwTownPriceSummaryAppendDto.getValidStatus());
            dbManager.setString(19,lwTownPriceSummaryAppendDto.getFlag());
            dbManager.setString(20,lwTownPriceSummaryAppendDto.getRemark());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param userNo 户号
     * @param statMonth 统计年月
     * @throws Exception
     */
    public void delete(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwTownPriceSummaryAppend ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        dbManager.setString(2,statMonth);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto
     * @throws Exception
     */
    public void update(LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwTownPriceSummaryAppend SET ");
        buffer.append("InputDate = ?, ");
        buffer.append("AppendFarmFee = ?, ");
        buffer.append("AppendIndustryFee = ?, ");
        buffer.append("AppendProduceFee = ?, ");
        buffer.append("AppendBizFee = ?, ");
        buffer.append("AppendNotPeopleFee = ?, ");
        buffer.append("AppendPeopleFee = ?, ");
        buffer.append("AppendCalPowerFee = ?, ");
        buffer.append("AppendCalQuantity = ?, ");
        buffer.append("AppendLoan = ?, ");
        buffer.append("AppendSanXia = ?, ");
        buffer.append("AppendKZS = ?, ");
        buffer.append("AppendKuQu = ?, ");
        buffer.append("AppendJiJin = ?, ");
        buffer.append("SumAppendFee = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwTownPriceSummaryAppend SET ");
            debugBuffer.append("InputDate = '" + lwTownPriceSummaryAppendDto.getInputDate() + "', ");
            debugBuffer.append("AppendFarmFee = " + lwTownPriceSummaryAppendDto.getAppendFarmFee() + ", ");
            debugBuffer.append("AppendIndustryFee = " + lwTownPriceSummaryAppendDto.getAppendIndustryFee() + ", ");
            debugBuffer.append("AppendProduceFee = " + lwTownPriceSummaryAppendDto.getAppendProduceFee() + ", ");
            debugBuffer.append("AppendBizFee = " + lwTownPriceSummaryAppendDto.getAppendBizFee() + ", ");
            debugBuffer.append("AppendNotPeopleFee = " + lwTownPriceSummaryAppendDto.getAppendNotPeopleFee() + ", ");
            debugBuffer.append("AppendPeopleFee = " + lwTownPriceSummaryAppendDto.getAppendPeopleFee() + ", ");
            debugBuffer.append("AppendCalPowerFee = " + lwTownPriceSummaryAppendDto.getAppendCalPowerFee() + ", ");
            debugBuffer.append("AppendCalQuantity = " + lwTownPriceSummaryAppendDto.getAppendCalQuantity() + ", ");
            debugBuffer.append("AppendLoan = " + lwTownPriceSummaryAppendDto.getAppendLoan() + ", ");
            debugBuffer.append("AppendSanXia = " + lwTownPriceSummaryAppendDto.getAppendSanXia() + ", ");
            debugBuffer.append("AppendKZS = " + lwTownPriceSummaryAppendDto.getAppendKZS() + ", ");
            debugBuffer.append("AppendKuQu = " + lwTownPriceSummaryAppendDto.getAppendKuQu() + ", ");
            debugBuffer.append("AppendJiJin = " + lwTownPriceSummaryAppendDto.getAppendJiJin() + ", ");
            debugBuffer.append("SumAppendFee = " + lwTownPriceSummaryAppendDto.getSumAppendFee() + ", ");
            debugBuffer.append("ValidStatus = '" + lwTownPriceSummaryAppendDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwTownPriceSummaryAppendDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwTownPriceSummaryAppendDto.getRemark() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwTownPriceSummaryAppendDto.getUserNo()).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(lwTownPriceSummaryAppendDto.getStatMonth()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwTownPriceSummaryAppendDto.getInputDate());
        dbManager.setDouble(2,lwTownPriceSummaryAppendDto.getAppendFarmFee());
        dbManager.setDouble(3,lwTownPriceSummaryAppendDto.getAppendIndustryFee());
        dbManager.setDouble(4,lwTownPriceSummaryAppendDto.getAppendProduceFee());
        dbManager.setDouble(5,lwTownPriceSummaryAppendDto.getAppendBizFee());
        dbManager.setDouble(6,lwTownPriceSummaryAppendDto.getAppendNotPeopleFee());
        dbManager.setDouble(7,lwTownPriceSummaryAppendDto.getAppendPeopleFee());
        dbManager.setDouble(8,lwTownPriceSummaryAppendDto.getAppendCalPowerFee());
        dbManager.setDouble(9,lwTownPriceSummaryAppendDto.getAppendCalQuantity());
        dbManager.setDouble(10,lwTownPriceSummaryAppendDto.getAppendLoan());
        dbManager.setDouble(11,lwTownPriceSummaryAppendDto.getAppendSanXia());
        dbManager.setDouble(12,lwTownPriceSummaryAppendDto.getAppendKZS());
        dbManager.setDouble(13,lwTownPriceSummaryAppendDto.getAppendKuQu());
        dbManager.setDouble(14,lwTownPriceSummaryAppendDto.getAppendJiJin());
        dbManager.setDouble(15,lwTownPriceSummaryAppendDto.getSumAppendFee());
        dbManager.setString(16,lwTownPriceSummaryAppendDto.getValidStatus());
        dbManager.setString(17,lwTownPriceSummaryAppendDto.getFlag());
        dbManager.setString(18,lwTownPriceSummaryAppendDto.getRemark());
        //设置条件字段;
        dbManager.setString(19,lwTownPriceSummaryAppendDto.getUserNo());
        dbManager.setString(20,lwTownPriceSummaryAppendDto.getStatMonth());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @param statMonth 统计年月
     * @return LwTownPriceSummaryAppendDto
     * @throws Exception
     */
    public LwTownPriceSummaryAppendDto findByPrimaryKey(String userNo,String statMonth)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("StatMonth,");
        buffer.append("InputDate,");
        buffer.append("AppendFarmFee,");
        buffer.append("AppendIndustryFee,");
        buffer.append("AppendProduceFee,");
        buffer.append("AppendBizFee,");
        buffer.append("AppendNotPeopleFee,");
        buffer.append("AppendPeopleFee,");
        buffer.append("AppendCalPowerFee,");
        buffer.append("AppendCalQuantity,");
        buffer.append("AppendLoan,");
        buffer.append("AppendSanXia,");
        buffer.append("AppendKZS,");
        buffer.append("AppendKuQu,");
        buffer.append("AppendJiJin,");
        buffer.append("SumAppendFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwTownPriceSummaryAppend ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(userNo).append("' AND ");
            debugBuffer.append("StatMonth=").append("'").append(statMonth).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ? And ");
        buffer.append("StatMonth = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,userNo);
        dbManager.setString(2,statMonth);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto = null;
        if(resultSet.next()){
            lwTownPriceSummaryAppendDto = new LwTownPriceSummaryAppendDto();
            lwTownPriceSummaryAppendDto.setUserNo(dbManager.getString(resultSet,1));
            lwTownPriceSummaryAppendDto.setStatMonth(dbManager.getString(resultSet,2));
            lwTownPriceSummaryAppendDto.setInputDate(dbManager.getString(resultSet,3));
            lwTownPriceSummaryAppendDto.setAppendFarmFee(dbManager.getDouble(resultSet,4));
            lwTownPriceSummaryAppendDto.setAppendIndustryFee(dbManager.getDouble(resultSet,5));
            lwTownPriceSummaryAppendDto.setAppendProduceFee(dbManager.getDouble(resultSet,6));
            lwTownPriceSummaryAppendDto.setAppendBizFee(dbManager.getDouble(resultSet,7));
            lwTownPriceSummaryAppendDto.setAppendNotPeopleFee(dbManager.getDouble(resultSet,8));
            lwTownPriceSummaryAppendDto.setAppendPeopleFee(dbManager.getDouble(resultSet,9));
            lwTownPriceSummaryAppendDto.setAppendCalPowerFee(dbManager.getDouble(resultSet,10));
            lwTownPriceSummaryAppendDto.setAppendCalQuantity(dbManager.getDouble(resultSet,11));
            lwTownPriceSummaryAppendDto.setAppendLoan(dbManager.getDouble(resultSet,12));
            lwTownPriceSummaryAppendDto.setAppendSanXia(dbManager.getDouble(resultSet,13));
            lwTownPriceSummaryAppendDto.setAppendKZS(dbManager.getDouble(resultSet,14));
            lwTownPriceSummaryAppendDto.setAppendKuQu(dbManager.getDouble(resultSet,15));
            lwTownPriceSummaryAppendDto.setAppendJiJin(dbManager.getDouble(resultSet,16));
            lwTownPriceSummaryAppendDto.setSumAppendFee(dbManager.getDouble(resultSet,17));
            lwTownPriceSummaryAppendDto.setValidStatus(dbManager.getString(resultSet,18));
            lwTownPriceSummaryAppendDto.setFlag(dbManager.getString(resultSet,19));
            lwTownPriceSummaryAppendDto.setRemark(dbManager.getString(resultSet,20));
        }
        resultSet.close();
        return lwTownPriceSummaryAppendDto;
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
        buffer.append("StatMonth,");
        buffer.append("InputDate,");
        buffer.append("AppendFarmFee,");
        buffer.append("AppendIndustryFee,");
        buffer.append("AppendProduceFee,");
        buffer.append("AppendBizFee,");
        buffer.append("AppendNotPeopleFee,");
        buffer.append("AppendPeopleFee,");
        buffer.append("AppendCalPowerFee,");
        buffer.append("AppendCalQuantity,");
        buffer.append("AppendLoan,");
        buffer.append("AppendSanXia,");
        buffer.append("AppendKZS,");
        buffer.append("AppendKuQu,");
        buffer.append("AppendJiJin,");
        buffer.append("SumAppendFee,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark ");
        buffer.append("FROM LwTownPriceSummaryAppend WHERE ");
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
        LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwTownPriceSummaryAppendDto = new LwTownPriceSummaryAppendDto();
            lwTownPriceSummaryAppendDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwTownPriceSummaryAppendDto.setStatMonth(dbManager.getString(resultSet,"StatMonth"));
            lwTownPriceSummaryAppendDto.setInputDate(dbManager.getString(resultSet,"InputDate"));
            lwTownPriceSummaryAppendDto.setAppendFarmFee(dbManager.getDouble(resultSet,"AppendFarmFee"));
            lwTownPriceSummaryAppendDto.setAppendIndustryFee(dbManager.getDouble(resultSet,"AppendIndustryFee"));
            lwTownPriceSummaryAppendDto.setAppendProduceFee(dbManager.getDouble(resultSet,"AppendProduceFee"));
            lwTownPriceSummaryAppendDto.setAppendBizFee(dbManager.getDouble(resultSet,"AppendBizFee"));
            lwTownPriceSummaryAppendDto.setAppendNotPeopleFee(dbManager.getDouble(resultSet,"AppendNotPeopleFee"));
            lwTownPriceSummaryAppendDto.setAppendPeopleFee(dbManager.getDouble(resultSet,"AppendPeopleFee"));
            lwTownPriceSummaryAppendDto.setAppendCalPowerFee(dbManager.getDouble(resultSet,"AppendCalPowerFee"));
            lwTownPriceSummaryAppendDto.setAppendCalQuantity(dbManager.getDouble(resultSet,"AppendCalQuantity"));
            lwTownPriceSummaryAppendDto.setAppendLoan(dbManager.getDouble(resultSet,"AppendLoan"));
            lwTownPriceSummaryAppendDto.setAppendSanXia(dbManager.getDouble(resultSet,"AppendSanXia"));
            lwTownPriceSummaryAppendDto.setAppendKZS(dbManager.getDouble(resultSet,"AppendKZS"));
            lwTownPriceSummaryAppendDto.setAppendKuQu(dbManager.getDouble(resultSet,"AppendKuQu"));
            lwTownPriceSummaryAppendDto.setAppendJiJin(dbManager.getDouble(resultSet,"AppendJiJin"));
            lwTownPriceSummaryAppendDto.setSumAppendFee(dbManager.getDouble(resultSet,"SumAppendFee"));
            lwTownPriceSummaryAppendDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwTownPriceSummaryAppendDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwTownPriceSummaryAppendDto.setRemark(dbManager.getString(resultSet,"Remark"));
            collection.add(lwTownPriceSummaryAppendDto);
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
        buffer.append("DELETE FROM LwTownPriceSummaryAppend WHERE ");
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
        buffer.append("SELECT count(*) FROM LwTownPriceSummaryAppend WHERE ");
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
