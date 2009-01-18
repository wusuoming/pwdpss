package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWAmmeterChange-电表换表信息的数据访问对象基类<br>
 */
public class DBLwAmmeterChangeBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwAmmeterChangeBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwAmmeterChangeBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public void insert(LwAmmeterChangeDto lwAmmeterChangeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwAmmeterChange (");
        buffer.append("Id,");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterX,");
        buffer.append("AmmeterV,");
        buffer.append("AmmeterA,");
        buffer.append("AmmeterType,");
        buffer.append("FactoryName,");
        buffer.append("Coust,");
        buffer.append("Pt,");
        buffer.append("Ct,");
        buffer.append("Precision1,");
        buffer.append("Rate,");
        buffer.append("Maxnum,");
        buffer.append("AllowYear,");
        buffer.append("InstallWorkNum,");
        buffer.append("InstallIdleNum,");
        buffer.append("ErrorWorkNum,");
        buffer.append("ErrorIdleNum,");
        buffer.append("ChgIdleQuantity,");
        buffer.append("ChgWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("LastIdleNum,");
        buffer.append("Signature,");
        buffer.append("InstallDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("UseStyle,");
        buffer.append("FactoryCcode ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getId()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getAmmeterNo()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getAmmeterX()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getAmmeterV()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getAmmeterA()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getAmmeterType()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getFactoryName()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getCoust()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getPt()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getCt()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getPrecision()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getRate()).append("',");
            debugBuffer.append("").append(lwAmmeterChangeDto.getMaxnum()).append(",");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getAllowYear()).append("',");
            debugBuffer.append("").append(lwAmmeterChangeDto.getInstallWorkNum()).append(",");
            debugBuffer.append("").append(lwAmmeterChangeDto.getInstallIdleNum()).append(",");
            debugBuffer.append("").append(lwAmmeterChangeDto.getErrorWorkNum()).append(",");
            debugBuffer.append("").append(lwAmmeterChangeDto.getErrorIdleNum()).append(",");
            debugBuffer.append("").append(lwAmmeterChangeDto.getChgIdleQuantity()).append(",");
            debugBuffer.append("").append(lwAmmeterChangeDto.getChgWorkNum()).append(",");
            debugBuffer.append("").append(lwAmmeterChangeDto.getLastWorkNum()).append(",");
            debugBuffer.append("").append(lwAmmeterChangeDto.getLastIdleNum()).append(",");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getSignature()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getInstallDate()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getFlag()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getRemark()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getUseStyle()).append("',");
            debugBuffer.append("'").append(lwAmmeterChangeDto.getFactoryCcode()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwAmmeterChangeDto.getId());
        dbManager.setString(2,lwAmmeterChangeDto.getUserNo());
        dbManager.setString(3,lwAmmeterChangeDto.getUserName());
        dbManager.setString(4,lwAmmeterChangeDto.getAmmeterNo());
        dbManager.setString(5,lwAmmeterChangeDto.getAmmeterX());
        dbManager.setString(6,lwAmmeterChangeDto.getAmmeterV());
        dbManager.setString(7,lwAmmeterChangeDto.getAmmeterA());
        dbManager.setString(8,lwAmmeterChangeDto.getAmmeterType());
        dbManager.setString(9,lwAmmeterChangeDto.getFactoryName());
        dbManager.setString(10,lwAmmeterChangeDto.getCoust());
        dbManager.setString(11,lwAmmeterChangeDto.getPt());
        dbManager.setString(12,lwAmmeterChangeDto.getCt());
        dbManager.setString(13,lwAmmeterChangeDto.getPrecision());
        dbManager.setString(14,lwAmmeterChangeDto.getRate());
        dbManager.setInt(15,lwAmmeterChangeDto.getMaxnum());
        dbManager.setString(16,lwAmmeterChangeDto.getAllowYear());
        dbManager.setDouble(17,lwAmmeterChangeDto.getInstallWorkNum());
        dbManager.setDouble(18,lwAmmeterChangeDto.getInstallIdleNum());
        dbManager.setDouble(19,lwAmmeterChangeDto.getErrorWorkNum());
        dbManager.setDouble(20,lwAmmeterChangeDto.getErrorIdleNum());
        dbManager.setDouble(21,lwAmmeterChangeDto.getChgIdleQuantity());
        dbManager.setDouble(22,lwAmmeterChangeDto.getChgWorkNum());
        dbManager.setDouble(23,lwAmmeterChangeDto.getLastWorkNum());
        dbManager.setDouble(24,lwAmmeterChangeDto.getLastIdleNum());
        dbManager.setString(25,lwAmmeterChangeDto.getSignature());
        dbManager.setString(26,lwAmmeterChangeDto.getInstallDate());
        dbManager.setString(27,lwAmmeterChangeDto.getValidStatus());
        dbManager.setString(28,lwAmmeterChangeDto.getFlag());
        dbManager.setString(29,lwAmmeterChangeDto.getRemark());
        dbManager.setString(30,lwAmmeterChangeDto.getUseStyle());
        dbManager.setString(31,lwAmmeterChangeDto.getFactoryCcode());
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
        buffer.append("INSERT INTO LwAmmeterChange (");
        buffer.append("Id,");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterX,");
        buffer.append("AmmeterV,");
        buffer.append("AmmeterA,");
        buffer.append("AmmeterType,");
        buffer.append("FactoryName,");
        buffer.append("Coust,");
        buffer.append("Pt,");
        buffer.append("Ct,");
        buffer.append("Precision1,");
        buffer.append("Rate,");
        buffer.append("Maxnum,");
        buffer.append("AllowYear,");
        buffer.append("InstallWorkNum,");
        buffer.append("InstallIdleNum,");
        buffer.append("ErrorWorkNum,");
        buffer.append("ErrorIdleNum,");
        buffer.append("ChgIdleQuantity,");
        buffer.append("ChgWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("LastIdleNum,");
        buffer.append("Signature,");
        buffer.append("InstallDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("UseStyle,");
        buffer.append("FactoryCcode ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwAmmeterChangeDto lwAmmeterChangeDto = (LwAmmeterChangeDto)i.next();
            dbManager.setString(1,lwAmmeterChangeDto.getId());
            dbManager.setString(2,lwAmmeterChangeDto.getUserNo());
            dbManager.setString(3,lwAmmeterChangeDto.getUserName());
            dbManager.setString(4,lwAmmeterChangeDto.getAmmeterNo());
            dbManager.setString(5,lwAmmeterChangeDto.getAmmeterX());
            dbManager.setString(6,lwAmmeterChangeDto.getAmmeterV());
            dbManager.setString(7,lwAmmeterChangeDto.getAmmeterA());
            dbManager.setString(8,lwAmmeterChangeDto.getAmmeterType());
            dbManager.setString(9,lwAmmeterChangeDto.getFactoryName());
            dbManager.setString(10,lwAmmeterChangeDto.getCoust());
            dbManager.setString(11,lwAmmeterChangeDto.getPt());
            dbManager.setString(12,lwAmmeterChangeDto.getCt());
            dbManager.setString(13,lwAmmeterChangeDto.getPrecision());
            dbManager.setString(14,lwAmmeterChangeDto.getRate());
            dbManager.setInt(15,lwAmmeterChangeDto.getMaxnum());
            dbManager.setString(16,lwAmmeterChangeDto.getAllowYear());
            dbManager.setDouble(17,lwAmmeterChangeDto.getInstallWorkNum());
            dbManager.setDouble(18,lwAmmeterChangeDto.getInstallIdleNum());
            dbManager.setDouble(19,lwAmmeterChangeDto.getErrorWorkNum());
            dbManager.setDouble(20,lwAmmeterChangeDto.getErrorIdleNum());
            dbManager.setDouble(21,lwAmmeterChangeDto.getChgIdleQuantity());
            dbManager.setDouble(22,lwAmmeterChangeDto.getChgWorkNum());
            dbManager.setDouble(23,lwAmmeterChangeDto.getLastWorkNum());
            dbManager.setDouble(24,lwAmmeterChangeDto.getLastIdleNum());
            dbManager.setString(25,lwAmmeterChangeDto.getSignature());
            dbManager.setString(26,lwAmmeterChangeDto.getInstallDate());
            dbManager.setString(27,lwAmmeterChangeDto.getValidStatus());
            dbManager.setString(28,lwAmmeterChangeDto.getFlag());
            dbManager.setString(29,lwAmmeterChangeDto.getRemark());
            dbManager.setString(30,lwAmmeterChangeDto.getUseStyle());
            dbManager.setString(31,lwAmmeterChangeDto.getFactoryCcode());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param id 序号
     * @throws Exception
     */
    public void delete(String id)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM LwAmmeterChange ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("Id=").append("'").append(id).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Id = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,id);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public void update(LwAmmeterChangeDto lwAmmeterChangeDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwAmmeterChange SET ");
        buffer.append("UserNo = ?, ");
        buffer.append("UserName = ?, ");
        buffer.append("AmmeterNo = ?, ");
        buffer.append("AmmeterX = ?, ");
        buffer.append("AmmeterV = ?, ");
        buffer.append("AmmeterA = ?, ");
        buffer.append("AmmeterType = ?, ");
        buffer.append("FactoryName = ?, ");
        buffer.append("Coust = ?, ");
        buffer.append("Pt = ?, ");
        buffer.append("Ct = ?, ");
        buffer.append("Precision1 = ?, ");
        buffer.append("Rate = ?, ");
        buffer.append("Maxnum = ?, ");
        buffer.append("AllowYear = ?, ");
        buffer.append("InstallWorkNum = ?, ");
        buffer.append("InstallIdleNum = ?, ");
        buffer.append("ErrorWorkNum = ?, ");
        buffer.append("ErrorIdleNum = ?, ");
        buffer.append("ChgIdleQuantity = ?, ");
        buffer.append("ChgWorkNum = ?, ");
        buffer.append("LastWorkNum = ?, ");
        buffer.append("LastIdleNum = ?, ");
        buffer.append("Signature = ?, ");
        buffer.append("InstallDate = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("UseStyle = ?, ");
        buffer.append("FactoryCcode = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwAmmeterChange SET ");
            debugBuffer.append("UserNo = '" + lwAmmeterChangeDto.getUserNo() + "', ");
            debugBuffer.append("UserName = '" + lwAmmeterChangeDto.getUserName() + "', ");
            debugBuffer.append("AmmeterNo = '" + lwAmmeterChangeDto.getAmmeterNo() + "', ");
            debugBuffer.append("AmmeterX = '" + lwAmmeterChangeDto.getAmmeterX() + "', ");
            debugBuffer.append("AmmeterV = '" + lwAmmeterChangeDto.getAmmeterV() + "', ");
            debugBuffer.append("AmmeterA = '" + lwAmmeterChangeDto.getAmmeterA() + "', ");
            debugBuffer.append("AmmeterType = '" + lwAmmeterChangeDto.getAmmeterType() + "', ");
            debugBuffer.append("FactoryName = '" + lwAmmeterChangeDto.getFactoryName() + "', ");
            debugBuffer.append("Coust = '" + lwAmmeterChangeDto.getCoust() + "', ");
            debugBuffer.append("Pt = '" + lwAmmeterChangeDto.getPt() + "', ");
            debugBuffer.append("Ct = '" + lwAmmeterChangeDto.getCt() + "', ");
            debugBuffer.append("Precision1 = '" + lwAmmeterChangeDto.getPrecision() + "', ");
            debugBuffer.append("Rate = '" + lwAmmeterChangeDto.getRate() + "', ");
            debugBuffer.append("Maxnum = " + lwAmmeterChangeDto.getMaxnum() + ", ");
            debugBuffer.append("AllowYear = '" + lwAmmeterChangeDto.getAllowYear() + "', ");
            debugBuffer.append("InstallWorkNum = " + lwAmmeterChangeDto.getInstallWorkNum() + ", ");
            debugBuffer.append("InstallIdleNum = " + lwAmmeterChangeDto.getInstallIdleNum() + ", ");
            debugBuffer.append("ErrorWorkNum = " + lwAmmeterChangeDto.getErrorWorkNum() + ", ");
            debugBuffer.append("ErrorIdleNum = " + lwAmmeterChangeDto.getErrorIdleNum() + ", ");
            debugBuffer.append("ChgIdleQuantity = " + lwAmmeterChangeDto.getChgIdleQuantity() + ", ");
            debugBuffer.append("ChgWorkNum = " + lwAmmeterChangeDto.getChgWorkNum() + ", ");
            debugBuffer.append("LastWorkNum = " + lwAmmeterChangeDto.getLastWorkNum() + ", ");
            debugBuffer.append("LastIdleNum = " + lwAmmeterChangeDto.getLastIdleNum() + ", ");
            debugBuffer.append("Signature = '" + lwAmmeterChangeDto.getSignature() + "', ");
            debugBuffer.append("InstallDate = '" + lwAmmeterChangeDto.getInstallDate() + "', ");
            debugBuffer.append("ValidStatus = '" + lwAmmeterChangeDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwAmmeterChangeDto.getFlag() + "', ");
            debugBuffer.append("Remark = '" + lwAmmeterChangeDto.getRemark() + "', ");
            debugBuffer.append("UseStyle = '" + lwAmmeterChangeDto.getUseStyle() + "', ");
            debugBuffer.append("FactoryCcode = '" + lwAmmeterChangeDto.getFactoryCcode() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("Id=").append("'").append(lwAmmeterChangeDto.getId()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Id = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwAmmeterChangeDto.getUserNo());
        dbManager.setString(2,lwAmmeterChangeDto.getUserName());
        dbManager.setString(3,lwAmmeterChangeDto.getAmmeterNo());
        dbManager.setString(4,lwAmmeterChangeDto.getAmmeterX());
        dbManager.setString(5,lwAmmeterChangeDto.getAmmeterV());
        dbManager.setString(6,lwAmmeterChangeDto.getAmmeterA());
        dbManager.setString(7,lwAmmeterChangeDto.getAmmeterType());
        dbManager.setString(8,lwAmmeterChangeDto.getFactoryName());
        dbManager.setString(9,lwAmmeterChangeDto.getCoust());
        dbManager.setString(10,lwAmmeterChangeDto.getPt());
        dbManager.setString(11,lwAmmeterChangeDto.getCt());
        dbManager.setString(12,lwAmmeterChangeDto.getPrecision());
        dbManager.setString(13,lwAmmeterChangeDto.getRate());
        dbManager.setInt(14,lwAmmeterChangeDto.getMaxnum());
        dbManager.setString(15,lwAmmeterChangeDto.getAllowYear());
        dbManager.setDouble(16,lwAmmeterChangeDto.getInstallWorkNum());
        dbManager.setDouble(17,lwAmmeterChangeDto.getInstallIdleNum());
        dbManager.setDouble(18,lwAmmeterChangeDto.getErrorWorkNum());
        dbManager.setDouble(19,lwAmmeterChangeDto.getErrorIdleNum());
        dbManager.setDouble(20,lwAmmeterChangeDto.getChgIdleQuantity());
        dbManager.setDouble(21,lwAmmeterChangeDto.getChgWorkNum());
        dbManager.setDouble(22,lwAmmeterChangeDto.getLastWorkNum());
        dbManager.setDouble(23,lwAmmeterChangeDto.getLastIdleNum());
        dbManager.setString(24,lwAmmeterChangeDto.getSignature());
        dbManager.setString(25,lwAmmeterChangeDto.getInstallDate());
        dbManager.setString(26,lwAmmeterChangeDto.getValidStatus());
        dbManager.setString(27,lwAmmeterChangeDto.getFlag());
        dbManager.setString(28,lwAmmeterChangeDto.getRemark());
        dbManager.setString(29,lwAmmeterChangeDto.getUseStyle());
        dbManager.setString(30,lwAmmeterChangeDto.getFactoryCcode());
        //设置条件字段;
        dbManager.setString(31,lwAmmeterChangeDto.getId());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param id 序号
     * @return LwAmmeterChangeDto
     * @throws Exception
     */
    public LwAmmeterChangeDto findByPrimaryKey(String id)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("Id,");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterX,");
        buffer.append("AmmeterV,");
        buffer.append("AmmeterA,");
        buffer.append("AmmeterType,");
        buffer.append("FactoryName,");
        buffer.append("Coust,");
        buffer.append("Pt,");
        buffer.append("Ct,");
        buffer.append("Precision1,");
        buffer.append("Rate,");
        buffer.append("Maxnum,");
        buffer.append("AllowYear,");
        buffer.append("InstallWorkNum,");
        buffer.append("InstallIdleNum,");
        buffer.append("ErrorWorkNum,");
        buffer.append("ErrorIdleNum,");
        buffer.append("ChgIdleQuantity,");
        buffer.append("ChgWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("LastIdleNum,");
        buffer.append("Signature,");
        buffer.append("InstallDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("UseStyle,");
        buffer.append("FactoryCcode ");
        buffer.append("FROM LwAmmeterChange ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("Id=").append("'").append(id).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("Id = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,id);
        ResultSet resultSet = dbManager.executePreparedQuery();
        LwAmmeterChangeDto lwAmmeterChangeDto = null;
        if(resultSet.next()){
            lwAmmeterChangeDto = new LwAmmeterChangeDto();
            lwAmmeterChangeDto.setId(dbManager.getString(resultSet,1));
            lwAmmeterChangeDto.setUserNo(dbManager.getString(resultSet,2));
            lwAmmeterChangeDto.setUserName(dbManager.getString(resultSet,3));
            lwAmmeterChangeDto.setAmmeterNo(dbManager.getString(resultSet,4));
            lwAmmeterChangeDto.setAmmeterX(dbManager.getString(resultSet,5));
            lwAmmeterChangeDto.setAmmeterV(dbManager.getString(resultSet,6));
            lwAmmeterChangeDto.setAmmeterA(dbManager.getString(resultSet,7));
            lwAmmeterChangeDto.setAmmeterType(dbManager.getString(resultSet,8));
            lwAmmeterChangeDto.setFactoryName(dbManager.getString(resultSet,9));
            lwAmmeterChangeDto.setCoust(dbManager.getString(resultSet,10));
            lwAmmeterChangeDto.setPt(dbManager.getString(resultSet,11));
            lwAmmeterChangeDto.setCt(dbManager.getString(resultSet,12));
            lwAmmeterChangeDto.setPrecision(dbManager.getString(resultSet,13));
            lwAmmeterChangeDto.setRate(dbManager.getString(resultSet,14));
            lwAmmeterChangeDto.setMaxnum(dbManager.getInt(resultSet,15));
            lwAmmeterChangeDto.setAllowYear(dbManager.getString(resultSet,16));
            lwAmmeterChangeDto.setInstallWorkNum(dbManager.getDouble(resultSet,17));
            lwAmmeterChangeDto.setInstallIdleNum(dbManager.getDouble(resultSet,18));
            lwAmmeterChangeDto.setErrorWorkNum(dbManager.getDouble(resultSet,19));
            lwAmmeterChangeDto.setErrorIdleNum(dbManager.getDouble(resultSet,20));
            lwAmmeterChangeDto.setChgIdleQuantity(dbManager.getDouble(resultSet,21));
            lwAmmeterChangeDto.setChgWorkNum(dbManager.getDouble(resultSet,22));
            lwAmmeterChangeDto.setLastWorkNum(dbManager.getDouble(resultSet,23));
            lwAmmeterChangeDto.setLastIdleNum(dbManager.getDouble(resultSet,24));
            lwAmmeterChangeDto.setSignature(dbManager.getString(resultSet,25));
            lwAmmeterChangeDto.setInstallDate(dbManager.getString(resultSet,26));
            lwAmmeterChangeDto.setValidStatus(dbManager.getString(resultSet,27));
            lwAmmeterChangeDto.setFlag(dbManager.getString(resultSet,28));
            lwAmmeterChangeDto.setRemark(dbManager.getString(resultSet,29));
            lwAmmeterChangeDto.setUseStyle(dbManager.getString(resultSet,30));
            lwAmmeterChangeDto.setFactoryCcode(dbManager.getString(resultSet,31));
        }
        resultSet.close();
        return lwAmmeterChangeDto;
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
        buffer.append("Id,");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("AmmeterNo,");
        buffer.append("AmmeterX,");
        buffer.append("AmmeterV,");
        buffer.append("AmmeterA,");
        buffer.append("AmmeterType,");
        buffer.append("FactoryName,");
        buffer.append("Coust,");
        buffer.append("Pt,");
        buffer.append("Ct,");
        buffer.append("Precision1,");
        buffer.append("Rate,");
        buffer.append("Maxnum,");
        buffer.append("AllowYear,");
        buffer.append("InstallWorkNum,");
        buffer.append("InstallIdleNum,");
        buffer.append("ErrorWorkNum,");
        buffer.append("ErrorIdleNum,");
        buffer.append("ChgIdleQuantity,");
        buffer.append("ChgWorkNum,");
        buffer.append("LastWorkNum,");
        buffer.append("LastIdleNum,");
        buffer.append("Signature,");
        buffer.append("InstallDate,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("Remark,");
        buffer.append("UseStyle,");
        buffer.append("FactoryCcode ");
        buffer.append("FROM LwAmmeterChange WHERE ");
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
        if(true){
            logger.debug(buffer.toString());
        }
        ResultSet resultSet = dbManager.executeQuery(buffer.toString());
        int count=0;
        if(supportPaging==false && pageNo>1){
            dbManager.locate(resultSet,rowsPerPage * (pageNo - 1));
        }

        //定义返回结果集合
        Collection collection = new ArrayList(rowsPerPage);
        LwAmmeterChangeDto lwAmmeterChangeDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwAmmeterChangeDto = new LwAmmeterChangeDto();
            lwAmmeterChangeDto.setId(dbManager.getString(resultSet,"Id"));
            lwAmmeterChangeDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwAmmeterChangeDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwAmmeterChangeDto.setAmmeterNo(dbManager.getString(resultSet,"AmmeterNo"));
            lwAmmeterChangeDto.setAmmeterX(dbManager.getString(resultSet,"AmmeterX"));
            lwAmmeterChangeDto.setAmmeterV(dbManager.getString(resultSet,"AmmeterV"));
            lwAmmeterChangeDto.setAmmeterA(dbManager.getString(resultSet,"AmmeterA"));
            lwAmmeterChangeDto.setAmmeterType(dbManager.getString(resultSet,"AmmeterType"));
            lwAmmeterChangeDto.setFactoryName(dbManager.getString(resultSet,"FactoryName"));
            lwAmmeterChangeDto.setCoust(dbManager.getString(resultSet,"Coust"));
            lwAmmeterChangeDto.setPt(dbManager.getString(resultSet,"Pt"));
            lwAmmeterChangeDto.setCt(dbManager.getString(resultSet,"Ct"));
            lwAmmeterChangeDto.setPrecision(dbManager.getString(resultSet,"Precision1"));
            lwAmmeterChangeDto.setRate(dbManager.getString(resultSet,"Rate"));
            lwAmmeterChangeDto.setMaxnum(dbManager.getInt(resultSet,"Maxnum"));
            lwAmmeterChangeDto.setAllowYear(dbManager.getString(resultSet,"AllowYear"));
            lwAmmeterChangeDto.setInstallWorkNum(dbManager.getDouble(resultSet,"InstallWorkNum"));
            lwAmmeterChangeDto.setInstallIdleNum(dbManager.getDouble(resultSet,"InstallIdleNum"));
            lwAmmeterChangeDto.setErrorWorkNum(dbManager.getDouble(resultSet,"ErrorWorkNum"));
            lwAmmeterChangeDto.setErrorIdleNum(dbManager.getDouble(resultSet,"ErrorIdleNum"));
            lwAmmeterChangeDto.setChgIdleQuantity(dbManager.getDouble(resultSet,"ChgIdleQuantity"));
            lwAmmeterChangeDto.setChgWorkNum(dbManager.getDouble(resultSet,"ChgWorkNum"));
            lwAmmeterChangeDto.setLastWorkNum(dbManager.getDouble(resultSet,"LastWorkNum"));
            lwAmmeterChangeDto.setLastIdleNum(dbManager.getDouble(resultSet,"LastIdleNum"));
            lwAmmeterChangeDto.setSignature(dbManager.getString(resultSet,"Signature"));
            lwAmmeterChangeDto.setInstallDate(dbManager.getString(resultSet,"InstallDate"));
            lwAmmeterChangeDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwAmmeterChangeDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwAmmeterChangeDto.setRemark(dbManager.getString(resultSet,"Remark"));
            lwAmmeterChangeDto.setUseStyle(dbManager.getString(resultSet,"UseStyle"));
            lwAmmeterChangeDto.setFactoryCcode(dbManager.getString(resultSet,"FactoryCcode"));
            collection.add(lwAmmeterChangeDto);
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
        buffer.append("DELETE FROM LwAmmeterChange WHERE ");
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
        buffer.append("SELECT count(*) FROM LwAmmeterChange WHERE ");
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
