package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWCoporationUserInfo-大工业用户信息表的数据访问对象基类<br>
 */
public class DBLwCoporationUserInfoBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBLwCoporationUserInfoBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwCoporationUserInfoBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public void insert(LwCoporationUserInfoDto lwCoporationUserInfoDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO LwCoporationUserInfo (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("AccountBank,");
        buffer.append("TaxNo,");
        buffer.append("AccountNo,");
        buffer.append("IndustryType,");
        buffer.append("Voltage,");
        buffer.append("LineNo,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("RongliangPower,");
        buffer.append("NeedRate,");
        buffer.append("DianJinPower,");
        buffer.append("PepoleFlag,");
        buffer.append("ShengChanPrice,");
        buffer.append("TingChanPrice,");
        buffer.append("ShengChanrongLiangPrice,");
        buffer.append("ShengChandianJinPrice,");
        buffer.append("TingChandianJinPrice,");
        buffer.append("TingChanrongLiangPrice,");
        buffer.append("ShengChanKV,");
        buffer.append("TingChanKV,");
        buffer.append("PepolePower,");
        buffer.append("LineLossScale ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getUserNo()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getUserName()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getAddress()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getAccountBank()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getTaxNo()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getAccountNo()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getIndustryType()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getVoltage()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getLineNo()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getValidStatus()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getFlag()).append("',");
            debugBuffer.append("").append(lwCoporationUserInfoDto.getRongliangPower()).append(",");
            debugBuffer.append("").append(lwCoporationUserInfoDto.getNeedRate()).append(",");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getDianJinPower()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getPepoleFlag()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getShengChanPrice()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getTingChanPrice()).append("',");
            debugBuffer.append("").append(lwCoporationUserInfoDto.getShengChanrongLiangPrice()).append(",");
            debugBuffer.append("").append(lwCoporationUserInfoDto.getShengChandianJinPrice()).append(",");
            debugBuffer.append("").append(lwCoporationUserInfoDto.getTingChandianJinPrice()).append(",");
            debugBuffer.append("").append(lwCoporationUserInfoDto.getTingChanrongLiangPrice()).append(",");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getShengChanKV()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getTingChanKV()).append("',");
            debugBuffer.append("'").append(lwCoporationUserInfoDto.getPepolePower()).append("',");
            debugBuffer.append("").append(lwCoporationUserInfoDto.getLineLossScale()).append(")");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,lwCoporationUserInfoDto.getUserNo());
        dbManager.setString(2,lwCoporationUserInfoDto.getUserName());
        dbManager.setString(3,lwCoporationUserInfoDto.getAddress());
        dbManager.setString(4,lwCoporationUserInfoDto.getAccountBank());
        dbManager.setString(5,lwCoporationUserInfoDto.getTaxNo());
        dbManager.setString(6,lwCoporationUserInfoDto.getAccountNo());
        dbManager.setString(7,lwCoporationUserInfoDto.getIndustryType());
        dbManager.setString(8,lwCoporationUserInfoDto.getVoltage());
        dbManager.setString(9,lwCoporationUserInfoDto.getLineNo());
        dbManager.setString(10,lwCoporationUserInfoDto.getValidStatus());
        dbManager.setString(11,lwCoporationUserInfoDto.getFlag());
        dbManager.setInt(12,lwCoporationUserInfoDto.getRongliangPower());
        dbManager.setInt(13,lwCoporationUserInfoDto.getNeedRate());
        dbManager.setString(14,lwCoporationUserInfoDto.getDianJinPower());
        dbManager.setString(15,lwCoporationUserInfoDto.getPepoleFlag());
        dbManager.setString(16,lwCoporationUserInfoDto.getShengChanPrice());
        dbManager.setString(17,lwCoporationUserInfoDto.getTingChanPrice());
        dbManager.setDouble(18,lwCoporationUserInfoDto.getShengChanrongLiangPrice());
        dbManager.setDouble(19,lwCoporationUserInfoDto.getShengChandianJinPrice());
        dbManager.setDouble(20,lwCoporationUserInfoDto.getTingChandianJinPrice());
        dbManager.setDouble(21,lwCoporationUserInfoDto.getTingChanrongLiangPrice());
        dbManager.setString(22,lwCoporationUserInfoDto.getShengChanKV());
        dbManager.setString(23,lwCoporationUserInfoDto.getTingChanKV());
        dbManager.setString(24,lwCoporationUserInfoDto.getPepolePower());
        dbManager.setDouble(25,lwCoporationUserInfoDto.getLineLossScale());
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
        buffer.append("INSERT INTO LwCoporationUserInfo (");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("AccountBank,");
        buffer.append("TaxNo,");
        buffer.append("AccountNo,");
        buffer.append("IndustryType,");
        buffer.append("Voltage,");
        buffer.append("LineNo,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("RongliangPower,");
        buffer.append("NeedRate,");
        buffer.append("DianJinPower,");
        buffer.append("PepoleFlag,");
        buffer.append("ShengChanPrice,");
        buffer.append("TingChanPrice,");
        buffer.append("ShengChanrongLiangPrice,");
        buffer.append("ShengChandianJinPrice,");
        buffer.append("TingChandianJinPrice,");
        buffer.append("TingChanrongLiangPrice,");
        buffer.append("ShengChanKV,");
        buffer.append("TingChanKV,");
        buffer.append("PepolePower,");
        buffer.append("LineLossScale ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            LwCoporationUserInfoDto lwCoporationUserInfoDto = (LwCoporationUserInfoDto)i.next();
            dbManager.setString(1,lwCoporationUserInfoDto.getUserNo());
            dbManager.setString(2,lwCoporationUserInfoDto.getUserName());
            dbManager.setString(3,lwCoporationUserInfoDto.getAddress());
            dbManager.setString(4,lwCoporationUserInfoDto.getAccountBank());
            dbManager.setString(5,lwCoporationUserInfoDto.getTaxNo());
            dbManager.setString(6,lwCoporationUserInfoDto.getAccountNo());
            dbManager.setString(7,lwCoporationUserInfoDto.getIndustryType());
            dbManager.setString(8,lwCoporationUserInfoDto.getVoltage());
            dbManager.setString(9,lwCoporationUserInfoDto.getLineNo());
            dbManager.setString(10,lwCoporationUserInfoDto.getValidStatus());
            dbManager.setString(11,lwCoporationUserInfoDto.getFlag());
            dbManager.setInt(12,lwCoporationUserInfoDto.getRongliangPower());
            dbManager.setInt(13,lwCoporationUserInfoDto.getNeedRate());
            dbManager.setString(14,lwCoporationUserInfoDto.getDianJinPower());
            dbManager.setString(15,lwCoporationUserInfoDto.getPepoleFlag());
            dbManager.setString(16,lwCoporationUserInfoDto.getShengChanPrice());
            dbManager.setString(17,lwCoporationUserInfoDto.getTingChanPrice());
            dbManager.setDouble(18,lwCoporationUserInfoDto.getShengChanrongLiangPrice());
            dbManager.setDouble(19,lwCoporationUserInfoDto.getShengChandianJinPrice());
            dbManager.setDouble(20,lwCoporationUserInfoDto.getTingChandianJinPrice());
            dbManager.setDouble(21,lwCoporationUserInfoDto.getTingChanrongLiangPrice());
            dbManager.setString(22,lwCoporationUserInfoDto.getShengChanKV());
            dbManager.setString(23,lwCoporationUserInfoDto.getTingChanKV());
            dbManager.setString(24,lwCoporationUserInfoDto.getPepolePower());
            dbManager.setDouble(25,lwCoporationUserInfoDto.getLineLossScale());
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
        buffer.append("DELETE FROM LwCoporationUserInfo ");
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
     * @param lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public void update(LwCoporationUserInfoDto lwCoporationUserInfoDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE LwCoporationUserInfo SET ");
        buffer.append("UserName = ?, ");
        buffer.append("Address = ?, ");
        buffer.append("AccountBank = ?, ");
        buffer.append("TaxNo = ?, ");
        buffer.append("AccountNo = ?, ");
        buffer.append("IndustryType = ?, ");
        buffer.append("Voltage = ?, ");
        buffer.append("LineNo = ?, ");
        buffer.append("ValidStatus = ?, ");
        buffer.append("Flag = ?, ");
        buffer.append("RongliangPower = ?, ");
        buffer.append("NeedRate = ?, ");
        buffer.append("DianJinPower = ?, ");
        buffer.append("PepoleFlag = ?, ");
        buffer.append("ShengChanPrice = ?, ");
        buffer.append("TingChanPrice = ?, ");
        buffer.append("ShengChanrongLiangPrice = ?, ");
        buffer.append("ShengChandianJinPrice = ?, ");
        buffer.append("TingChandianJinPrice = ?, ");
        buffer.append("TingChanrongLiangPrice = ?, ");
        buffer.append("ShengChanKV = ?, ");
        buffer.append("TingChanKV = ?, ");
        buffer.append("PepolePower = ?, ");
        buffer.append("LineLossScale = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE LwCoporationUserInfo SET ");
            debugBuffer.append("UserName = '" + lwCoporationUserInfoDto.getUserName() + "', ");
            debugBuffer.append("Address = '" + lwCoporationUserInfoDto.getAddress() + "', ");
            debugBuffer.append("AccountBank = '" + lwCoporationUserInfoDto.getAccountBank() + "', ");
            debugBuffer.append("TaxNo = '" + lwCoporationUserInfoDto.getTaxNo() + "', ");
            debugBuffer.append("AccountNo = '" + lwCoporationUserInfoDto.getAccountNo() + "', ");
            debugBuffer.append("IndustryType = '" + lwCoporationUserInfoDto.getIndustryType() + "', ");
            debugBuffer.append("Voltage = '" + lwCoporationUserInfoDto.getVoltage() + "', ");
            debugBuffer.append("LineNo = '" + lwCoporationUserInfoDto.getLineNo() + "', ");
            debugBuffer.append("ValidStatus = '" + lwCoporationUserInfoDto.getValidStatus() + "', ");
            debugBuffer.append("Flag = '" + lwCoporationUserInfoDto.getFlag() + "', ");
            debugBuffer.append("RongliangPower = " + lwCoporationUserInfoDto.getRongliangPower() + ", ");
            debugBuffer.append("NeedRate = " + lwCoporationUserInfoDto.getNeedRate() + ", ");
            debugBuffer.append("DianJinPower = '" + lwCoporationUserInfoDto.getDianJinPower() + "', ");
            debugBuffer.append("PepoleFlag = '" + lwCoporationUserInfoDto.getPepoleFlag() + "', ");
            debugBuffer.append("ShengChanPrice = '" + lwCoporationUserInfoDto.getShengChanPrice() + "', ");
            debugBuffer.append("TingChanPrice = '" + lwCoporationUserInfoDto.getTingChanPrice() + "', ");
            debugBuffer.append("ShengChanrongLiangPrice = " + lwCoporationUserInfoDto.getShengChanrongLiangPrice() + ", ");
            debugBuffer.append("ShengChandianJinPrice = " + lwCoporationUserInfoDto.getShengChandianJinPrice() + ", ");
            debugBuffer.append("TingChandianJinPrice = " + lwCoporationUserInfoDto.getTingChandianJinPrice() + ", ");
            debugBuffer.append("TingChanrongLiangPrice = " + lwCoporationUserInfoDto.getTingChanrongLiangPrice() + ", ");
            debugBuffer.append("ShengChanKV = '" + lwCoporationUserInfoDto.getShengChanKV() + "', ");
            debugBuffer.append("TingChanKV = '" + lwCoporationUserInfoDto.getTingChanKV() + "', ");
            debugBuffer.append("PepolePower = '" + lwCoporationUserInfoDto.getPepolePower() + "', ");
            debugBuffer.append("LineLossScale = " + lwCoporationUserInfoDto.getLineLossScale() + " ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("UserNo=").append("'").append(lwCoporationUserInfoDto.getUserNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("UserNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,lwCoporationUserInfoDto.getUserName());
        dbManager.setString(2,lwCoporationUserInfoDto.getAddress());
        dbManager.setString(3,lwCoporationUserInfoDto.getAccountBank());
        dbManager.setString(4,lwCoporationUserInfoDto.getTaxNo());
        dbManager.setString(5,lwCoporationUserInfoDto.getAccountNo());
        dbManager.setString(6,lwCoporationUserInfoDto.getIndustryType());
        dbManager.setString(7,lwCoporationUserInfoDto.getVoltage());
        dbManager.setString(8,lwCoporationUserInfoDto.getLineNo());
        dbManager.setString(9,lwCoporationUserInfoDto.getValidStatus());
        dbManager.setString(10,lwCoporationUserInfoDto.getFlag());
        dbManager.setInt(11,lwCoporationUserInfoDto.getRongliangPower());
        dbManager.setInt(12,lwCoporationUserInfoDto.getNeedRate());
        dbManager.setString(13,lwCoporationUserInfoDto.getDianJinPower());
        dbManager.setString(14,lwCoporationUserInfoDto.getPepoleFlag());
        dbManager.setString(15,lwCoporationUserInfoDto.getShengChanPrice());
        dbManager.setString(16,lwCoporationUserInfoDto.getTingChanPrice());
        dbManager.setDouble(17,lwCoporationUserInfoDto.getShengChanrongLiangPrice());
        dbManager.setDouble(18,lwCoporationUserInfoDto.getShengChandianJinPrice());
        dbManager.setDouble(19,lwCoporationUserInfoDto.getTingChandianJinPrice());
        dbManager.setDouble(20,lwCoporationUserInfoDto.getTingChanrongLiangPrice());
        dbManager.setString(21,lwCoporationUserInfoDto.getShengChanKV());
        dbManager.setString(22,lwCoporationUserInfoDto.getTingChanKV());
        dbManager.setString(23,lwCoporationUserInfoDto.getPepolePower());
        dbManager.setDouble(24,lwCoporationUserInfoDto.getLineLossScale());
        //设置条件字段;
        dbManager.setString(25,lwCoporationUserInfoDto.getUserNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param userNo 户号
     * @return LwCoporationUserInfoDto
     * @throws Exception
     */
    public LwCoporationUserInfoDto findByPrimaryKey(String userNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("UserNo,");
        buffer.append("UserName,");
        buffer.append("Address,");
        buffer.append("AccountBank,");
        buffer.append("TaxNo,");
        buffer.append("AccountNo,");
        buffer.append("IndustryType,");
        buffer.append("Voltage,");
        buffer.append("LineNo,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("RongliangPower,");
        buffer.append("NeedRate,");
        buffer.append("DianJinPower,");
        buffer.append("PepoleFlag,");
        buffer.append("ShengChanPrice,");
        buffer.append("TingChanPrice,");
        buffer.append("ShengChanrongLiangPrice,");
        buffer.append("ShengChandianJinPrice,");
        buffer.append("TingChandianJinPrice,");
        buffer.append("TingChanrongLiangPrice,");
        buffer.append("ShengChanKV,");
        buffer.append("TingChanKV,");
        buffer.append("PepolePower,");
        buffer.append("LineLossScale ");
        buffer.append("FROM LwCoporationUserInfo ");
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
        LwCoporationUserInfoDto lwCoporationUserInfoDto = null;
        if(resultSet.next()){
            lwCoporationUserInfoDto = new LwCoporationUserInfoDto();
            lwCoporationUserInfoDto.setUserNo(dbManager.getString(resultSet,1));
            lwCoporationUserInfoDto.setUserName(dbManager.getString(resultSet,2));
            lwCoporationUserInfoDto.setAddress(dbManager.getString(resultSet,3));
            lwCoporationUserInfoDto.setAccountBank(dbManager.getString(resultSet,4));
            lwCoporationUserInfoDto.setTaxNo(dbManager.getString(resultSet,5));
            lwCoporationUserInfoDto.setAccountNo(dbManager.getString(resultSet,6));
            lwCoporationUserInfoDto.setIndustryType(dbManager.getString(resultSet,7));
            lwCoporationUserInfoDto.setVoltage(dbManager.getString(resultSet,8));
            lwCoporationUserInfoDto.setLineNo(dbManager.getString(resultSet,9));
            lwCoporationUserInfoDto.setValidStatus(dbManager.getString(resultSet,10));
            lwCoporationUserInfoDto.setFlag(dbManager.getString(resultSet,11));
            lwCoporationUserInfoDto.setRongliangPower(dbManager.getInt(resultSet,12));
            lwCoporationUserInfoDto.setNeedRate(dbManager.getInt(resultSet,13));
            lwCoporationUserInfoDto.setDianJinPower(dbManager.getString(resultSet,14));
            lwCoporationUserInfoDto.setPepoleFlag(dbManager.getString(resultSet,15));
            lwCoporationUserInfoDto.setShengChanPrice(dbManager.getString(resultSet,16));
            lwCoporationUserInfoDto.setTingChanPrice(dbManager.getString(resultSet,17));
            lwCoporationUserInfoDto.setShengChanrongLiangPrice(dbManager.getDouble(resultSet,18));
            lwCoporationUserInfoDto.setShengChandianJinPrice(dbManager.getDouble(resultSet,19));
            lwCoporationUserInfoDto.setTingChandianJinPrice(dbManager.getDouble(resultSet,20));
            lwCoporationUserInfoDto.setTingChanrongLiangPrice(dbManager.getDouble(resultSet,21));
            lwCoporationUserInfoDto.setShengChanKV(dbManager.getString(resultSet,22));
            lwCoporationUserInfoDto.setTingChanKV(dbManager.getString(resultSet,23));
            lwCoporationUserInfoDto.setPepolePower(dbManager.getString(resultSet,24));
            lwCoporationUserInfoDto.setLineLossScale(dbManager.getDouble(resultSet,25));
        }
        resultSet.close();
        return lwCoporationUserInfoDto;
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
        buffer.append("Address,");
        buffer.append("AccountBank,");
        buffer.append("TaxNo,");
        buffer.append("AccountNo,");
        buffer.append("IndustryType,");
        buffer.append("Voltage,");
        buffer.append("LineNo,");
        buffer.append("ValidStatus,");
        buffer.append("Flag,");
        buffer.append("RongliangPower,");
        buffer.append("NeedRate,");
        buffer.append("DianJinPower,");
        buffer.append("PepoleFlag,");
        buffer.append("ShengChanPrice,");
        buffer.append("TingChanPrice,");
        buffer.append("ShengChanrongLiangPrice,");
        buffer.append("ShengChandianJinPrice,");
        buffer.append("TingChandianJinPrice,");
        buffer.append("TingChanrongLiangPrice,");
        buffer.append("ShengChanKV,");
        buffer.append("TingChanKV,");
        buffer.append("PepolePower,");
        buffer.append("LineLossScale ");
        buffer.append("FROM LwCoporationUserInfo WHERE ");
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
        LwCoporationUserInfoDto lwCoporationUserInfoDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            lwCoporationUserInfoDto = new LwCoporationUserInfoDto();
            lwCoporationUserInfoDto.setUserNo(dbManager.getString(resultSet,"UserNo"));
            lwCoporationUserInfoDto.setUserName(dbManager.getString(resultSet,"UserName"));
            lwCoporationUserInfoDto.setAddress(dbManager.getString(resultSet,"Address"));
            lwCoporationUserInfoDto.setAccountBank(dbManager.getString(resultSet,"AccountBank"));
            lwCoporationUserInfoDto.setTaxNo(dbManager.getString(resultSet,"TaxNo"));
            lwCoporationUserInfoDto.setAccountNo(dbManager.getString(resultSet,"AccountNo"));
            lwCoporationUserInfoDto.setIndustryType(dbManager.getString(resultSet,"IndustryType"));
            lwCoporationUserInfoDto.setVoltage(dbManager.getString(resultSet,"Voltage"));
            lwCoporationUserInfoDto.setLineNo(dbManager.getString(resultSet,"LineNo"));
            lwCoporationUserInfoDto.setValidStatus(dbManager.getString(resultSet,"ValidStatus"));
            lwCoporationUserInfoDto.setFlag(dbManager.getString(resultSet,"Flag"));
            lwCoporationUserInfoDto.setRongliangPower(dbManager.getInt(resultSet,"RongliangPower"));
            lwCoporationUserInfoDto.setNeedRate(dbManager.getInt(resultSet,"NeedRate"));
            lwCoporationUserInfoDto.setDianJinPower(dbManager.getString(resultSet,"DianJinPower"));
            lwCoporationUserInfoDto.setPepoleFlag(dbManager.getString(resultSet,"PepoleFlag"));
            lwCoporationUserInfoDto.setShengChanPrice(dbManager.getString(resultSet,"ShengChanPrice"));
            lwCoporationUserInfoDto.setTingChanPrice(dbManager.getString(resultSet,"TingChanPrice"));
            lwCoporationUserInfoDto.setShengChanrongLiangPrice(dbManager.getDouble(resultSet,"ShengChanrongLiangPrice"));
            lwCoporationUserInfoDto.setShengChandianJinPrice(dbManager.getDouble(resultSet,"ShengChandianJinPrice"));
            lwCoporationUserInfoDto.setTingChandianJinPrice(dbManager.getDouble(resultSet,"TingChandianJinPrice"));
            lwCoporationUserInfoDto.setTingChanrongLiangPrice(dbManager.getDouble(resultSet,"TingChanrongLiangPrice"));
            lwCoporationUserInfoDto.setShengChanKV(dbManager.getString(resultSet,"ShengChanKV"));
            lwCoporationUserInfoDto.setTingChanKV(dbManager.getString(resultSet,"TingChanKV"));
            lwCoporationUserInfoDto.setPepolePower(dbManager.getString(resultSet,"PepolePower"));
            lwCoporationUserInfoDto.setLineLossScale(dbManager.getDouble(resultSet,"LineLossScale"));
            collection.add(lwCoporationUserInfoDto);
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
        buffer.append("DELETE FROM LwCoporationUserInfo WHERE ");
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
        buffer.append("SELECT count(*) FROM LwCoporationUserInfo WHERE ");
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
