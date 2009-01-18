package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IAContactDto;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IAContact的数据访问对象基类<br>
 * 创建于 2006-09-08 15:52:31.626<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIAContactBase{
    /**
     * 资源管理类的实例，处理数据库操作.
     */
    protected DBManager dbManager = null;
    private static Logger logger = Logger.getLogger(DBIAContactBase.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBIAContactBase(DBManager dbManager){
        this.dbManager = dbManager;
    }

    /**
     * 插入一条数据
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void insert(IAContactDto iAContactDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("INSERT INTO IAContact (");
        buffer.append("ContactNo,");
        buffer.append("CompanyCode,");
        buffer.append("MakeCode,");
        buffer.append("AreaCode,");
        buffer.append("UserCode,");
        buffer.append("Creator,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("ApplyDate,");
        buffer.append("Amount,");
        buffer.append("Content,");
        buffer.append("DealType,");
        buffer.append("ConfirmName,");
        buffer.append("ConfirmDate,");
        buffer.append("ConfirmContent,");
        buffer.append("DealConfirmName,");
        buffer.append("DealConfirmDate,");
        buffer.append("DealConfirmContent,");
        buffer.append("DealName,");
        buffer.append("DealDate,");
        buffer.append("DealContent,");
        buffer.append("Status,");
        buffer.append("Remark,");
        buffer.append("QuestionType,");
        buffer.append("EditData,");
        buffer.append("AppearType,");
        buffer.append("EditRequirement ");
        buffer.append(") ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("VALUES(");
            debugBuffer.append("'").append(iAContactDto.getContactNo()).append("',");
            debugBuffer.append("'").append(iAContactDto.getCompanyCode()).append("',");
            debugBuffer.append("'").append(iAContactDto.getMakeCode()).append("',");
            debugBuffer.append("'").append(iAContactDto.getAreaCode()).append("',");
            debugBuffer.append("'").append(iAContactDto.getUserCode()).append("',");
            debugBuffer.append("'").append(iAContactDto.getCreator()).append("',");
            debugBuffer.append("'").append(iAContactDto.getPhoneNumber()).append("',");
            debugBuffer.append("'").append(iAContactDto.getEmail()).append("',");
            debugBuffer.append("'").append(iAContactDto.getApplyDate()).append("',");
            debugBuffer.append("").append(iAContactDto.getAmount()).append(",");
            debugBuffer.append("'").append(iAContactDto.getContent()).append("',");
            debugBuffer.append("'").append(iAContactDto.getDealType()).append("',");
            debugBuffer.append("'").append(iAContactDto.getConfirmName()).append("',");
            debugBuffer.append("'").append(iAContactDto.getConfirmDate()).append("',");
            debugBuffer.append("'").append(iAContactDto.getConfirmContent()).append("',");
            debugBuffer.append("'").append(iAContactDto.getDealConfirmName()).append("',");
            debugBuffer.append("'").append(iAContactDto.getDealConfirmDate()).append("',");
            debugBuffer.append("'").append(iAContactDto.getDealConfirmContent()).append("',");
            debugBuffer.append("'").append(iAContactDto.getDealName()).append("',");
            debugBuffer.append("'").append(iAContactDto.getDealDate()).append("',");
            debugBuffer.append("'").append(iAContactDto.getDealContent()).append("',");
            debugBuffer.append("'").append(iAContactDto.getStatus()).append("',");
            debugBuffer.append("'").append(iAContactDto.getRemark()).append("',");
            debugBuffer.append("'").append(iAContactDto.getQuestionType()).append("')");
            debugBuffer.append("'").append(iAContactDto.getEditData()).append("')");
            debugBuffer.append("'").append(iAContactDto.getAppearType()).append("')");
            debugBuffer.append("'").append(iAContactDto.getEditRequirement()).append("')");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        dbManager.prepareStatement(buffer.toString());
        dbManager.setString(1,iAContactDto.getContactNo());
        dbManager.setString(2,iAContactDto.getCompanyCode());
        dbManager.setString(3,iAContactDto.getMakeCode());
        dbManager.setString(4,iAContactDto.getAreaCode());
        dbManager.setString(5,iAContactDto.getUserCode());
        dbManager.setString(6,iAContactDto.getCreator());
        dbManager.setString(7,iAContactDto.getPhoneNumber());
        dbManager.setString(8,iAContactDto.getEmail());
        dbManager.setDateTime(9,iAContactDto.getApplyDate());
        dbManager.setInt(10,iAContactDto.getAmount());
        dbManager.setString(11,iAContactDto.getContent());
        dbManager.setString(12,iAContactDto.getDealType());
        dbManager.setString(13,iAContactDto.getConfirmName());
        dbManager.setDateTime(14,iAContactDto.getConfirmDate());
        dbManager.setString(15,iAContactDto.getConfirmContent());
        dbManager.setString(16,iAContactDto.getConfirmName());
        dbManager.setDateTime(17,iAContactDto.getConfirmDate());
        dbManager.setString(18,iAContactDto.getConfirmContent());
        dbManager.setString(19,iAContactDto.getDealName());
        dbManager.setDateTime(20,iAContactDto.getDealDate());
        dbManager.setString(21,iAContactDto.getDealContent());
        dbManager.setString(22,iAContactDto.getStatus());
        dbManager.setString(23,iAContactDto.getRemark());
        dbManager.setString(24,iAContactDto.getQuestionType());
        dbManager.setString(25,iAContactDto.getEditData());
        dbManager.setString(26,iAContactDto.getAppearType());
        dbManager.setString(27,iAContactDto.getEditRequirement());
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
        buffer.append("INSERT INTO IAContact (");
        buffer.append("ContactNo,");
        buffer.append("CompanyCode,");
        buffer.append("MakeCode,");
        buffer.append("AreaCode,");
        buffer.append("UserCode,");
        buffer.append("Creator,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("ApplyDate,");
        buffer.append("Amount,");
        buffer.append("Content,");
        buffer.append("DealType,");
        buffer.append("ConfirmName,");
        buffer.append("ConfirmDate,");
        buffer.append("ConfirmContent,");
        buffer.append("DealConfirmName,");
        buffer.append("DealConfirmDate,");
        buffer.append("DealConfirmContent,");
        buffer.append("DealName,");
        buffer.append("DealDate,");
        buffer.append("DealContent,");
        buffer.append("Status,");
        buffer.append("Remark,");
        buffer.append("QuestionType,");
        buffer.append("EditData,");
        buffer.append("AppearType,");
        buffer.append("EditRequirement ");
        buffer.append(") ");
        buffer.append("VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        if(logger.isDebugEnabled()){
            logger.debug(buffer.toString());
        }
        dbManager.prepareStatement(buffer.toString());
        for (Iterator i = collection.iterator(); i.hasNext();) {
            IAContactDto iAContactDto = (IAContactDto)i.next();
            dbManager.setString(1,iAContactDto.getContactNo());
            dbManager.setString(2,iAContactDto.getCompanyCode());
            dbManager.setString(3,iAContactDto.getMakeCode());
            dbManager.setString(4,iAContactDto.getAreaCode());
            dbManager.setString(5,iAContactDto.getUserCode());
            dbManager.setString(6,iAContactDto.getCreator());
            dbManager.setString(7,iAContactDto.getPhoneNumber());
            dbManager.setString(8,iAContactDto.getEmail());
            dbManager.setDateTime(9,iAContactDto.getApplyDate());
            dbManager.setInt(10,iAContactDto.getAmount());
            dbManager.setString(11,iAContactDto.getContent());
            dbManager.setString(12,iAContactDto.getDealType());
            dbManager.setString(13,iAContactDto.getConfirmName());
            dbManager.setDateTime(14,iAContactDto.getConfirmDate());
            dbManager.setString(15,iAContactDto.getConfirmContent());
            dbManager.setString(16,iAContactDto.getConfirmName());
            dbManager.setDateTime(17,iAContactDto.getConfirmDate());
            dbManager.setString(18,iAContactDto.getConfirmContent());
            dbManager.setString(19,iAContactDto.getDealName());
            dbManager.setDateTime(20,iAContactDto.getDealDate());
            dbManager.setString(21,iAContactDto.getDealContent());
            dbManager.setString(22,iAContactDto.getStatus());
            dbManager.setString(23,iAContactDto.getRemark());
            dbManager.setString(24,iAContactDto.getQuestionType());
            dbManager.setString(25,iAContactDto.getEditData());
            dbManager.setString(26,iAContactDto.getAppearType());
            dbManager.setString(27,iAContactDto.getEditRequirement());
            dbManager.addBatch();
        }
        dbManager.executePreparedUpdateBatch();
    }

    /**
     * 按主键删除一条数据
     * @param contactNo ContactNo
     * @throws Exception
     */
    public void delete(String contactNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("DELETE FROM IAContact ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(contactNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ContactNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,contactNo);
        dbManager.executePreparedUpdate();
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void update(IAContactDto iAContactDto)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        buffer.append("UPDATE IAContact SET ");
        buffer.append("CompanyCode = ?, ");
        buffer.append("MakeCode = ?, ");
        buffer.append("AreaCode = ?, ");
        buffer.append("UserCode = ?, ");
        buffer.append("Creator = ?, ");
        buffer.append("PhoneNumber = ?, ");
        buffer.append("Email = ?, ");
        buffer.append("ApplyDate = ?, ");
        buffer.append("Amount = ?, ");
        buffer.append("Content = ?, ");
        buffer.append("DealType = ?, ");
        buffer.append("ConfirmName = ?, ");
        buffer.append("ConfirmDate = ?, ");
        buffer.append("ConfirmContent = ?, ");
        buffer.append("DealConfirmName = ?, ");
        buffer.append("DealConfirmDate = ?, ");
        buffer.append("DealConfirmContent = ?, ");
        buffer.append("DealName = ?, ");
        buffer.append("DealDate = ?, ");
        buffer.append("DealContent = ?, ");
        buffer.append("Status = ?, ");
        buffer.append("Remark = ?, ");
        buffer.append("QuestionType = ?, ");
        buffer.append("EditData = ?, ");
        buffer.append("AppearType = ?, ");
        buffer.append("EditRequirement = ? ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append("UPDATE IAContact SET ");
            debugBuffer.append("CompanyCode = '" + iAContactDto.getCompanyCode() + "', ");
            debugBuffer.append("MakeCode = '" + iAContactDto.getMakeCode() + "', ");
            debugBuffer.append("AreaCode = '" + iAContactDto.getAreaCode() + "', ");
            debugBuffer.append("UserCode = '" + iAContactDto.getUserCode() + "', ");
            debugBuffer.append("Creator = '" + iAContactDto.getCreator() + "', ");
            debugBuffer.append("PhoneNumber = '" + iAContactDto.getPhoneNumber() + "', ");
            debugBuffer.append("Email = '" + iAContactDto.getEmail() + "', ");
            debugBuffer.append("ApplyDate = '" + iAContactDto.getApplyDate() + "', ");
            debugBuffer.append("Amount = " + iAContactDto.getAmount() + ", ");
            debugBuffer.append("Content = '" + iAContactDto.getContent() + "', ");
            debugBuffer.append("DealType = '" + iAContactDto.getDealType() + "', ");
            debugBuffer.append("ConfirmName = '" + iAContactDto.getConfirmName() + "', ");
            debugBuffer.append("ConfirmDate = '" + iAContactDto.getConfirmDate() + "', ");
            debugBuffer.append("ConfirmContent = '" + iAContactDto.getConfirmContent() + "', ");
            debugBuffer.append("DealConfirmName = '" + iAContactDto.getDealConfirmName() + "', ");
            debugBuffer.append("DealConfirmDate = '" + iAContactDto.getDealConfirmDate() + "', ");
            debugBuffer.append("DealConfirmContent = '" + iAContactDto.getDealConfirmContent() + "', ");
            debugBuffer.append("DealName = '" + iAContactDto.getDealName() + "', ");
            debugBuffer.append("DealDate = '" + iAContactDto.getDealDate() + "', ");
            debugBuffer.append("DealContent = '" + iAContactDto.getDealContent() + "', ");
            debugBuffer.append("Status = '" + iAContactDto.getStatus() + "', ");
            debugBuffer.append("Remark = '" + iAContactDto.getRemark() + "', ");
            debugBuffer.append("QuestionType = '" + iAContactDto.getQuestionType() + "', ");
            debugBuffer.append("EditData  = '" + iAContactDto.getEditData() + "', ");
            debugBuffer.append("AppearType  = '" + iAContactDto.getAppearType() + "', ");
            debugBuffer.append("EditRequirement  = '" + iAContactDto.getEditRequirement() + "' ");
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(iAContactDto.getContactNo()).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ContactNo = ?");
        dbManager.prepareStatement(buffer.toString());
        //设置更新字段;
        dbManager.setString(1,iAContactDto.getCompanyCode());
        dbManager.setString(2,iAContactDto.getMakeCode());
        dbManager.setString(3,iAContactDto.getAreaCode());
        dbManager.setString(4,iAContactDto.getUserCode());
        dbManager.setString(5,iAContactDto.getCreator());
        dbManager.setString(6,iAContactDto.getPhoneNumber());
        dbManager.setString(7,iAContactDto.getEmail());
        dbManager.setDateTime(8,iAContactDto.getApplyDate());
        dbManager.setInt(9,iAContactDto.getAmount());
        dbManager.setString(10,iAContactDto.getContent());
        dbManager.setString(11,iAContactDto.getDealType());
        dbManager.setString(12,iAContactDto.getConfirmName());
        dbManager.setDateTime(13,iAContactDto.getConfirmDate());
        dbManager.setString(14,iAContactDto.getConfirmContent());
        dbManager.setString(15,iAContactDto.getDealConfirmName());
        dbManager.setDateTime(16,iAContactDto.getDealConfirmDate());
        dbManager.setString(17,iAContactDto.getDealConfirmContent());
        dbManager.setString(18,iAContactDto.getDealName());
        dbManager.setDateTime(19,iAContactDto.getDealDate());
        dbManager.setString(20,iAContactDto.getDealContent());
        dbManager.setString(21,iAContactDto.getStatus());
        dbManager.setString(22,iAContactDto.getRemark());
        dbManager.setString(23,iAContactDto.getQuestionType());
        dbManager.setString(24,iAContactDto.getEditData());
        dbManager.setString(25,iAContactDto.getAppearType());
        dbManager.setString(26,iAContactDto.getEditRequirement());
        //设置条件字段;
        dbManager.setString(27,iAContactDto.getContactNo());
        dbManager.executePreparedUpdate();

    }

    /**
     * 按主键查找一条数据
     * @param contactNo ContactNo
     * @return IAContactDto
     * @throws Exception
     */
    public IAContactDto findByPrimaryKey(String contactNo)
            throws Exception{
        StringBuffer buffer = new StringBuffer(200);
        //拼SQL语句
        buffer.append("SELECT ");
        buffer.append("ContactNo,");
        buffer.append("CompanyCode,");
        buffer.append("MakeCode,");
        buffer.append("AreaCode,");
        buffer.append("UserCode,");
        buffer.append("Creator,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("ApplyDate,");
        buffer.append("Amount,");
        buffer.append("Content,");
        buffer.append("DealType,");
        buffer.append("ConfirmName,");
        buffer.append("ConfirmDate,");
        buffer.append("ConfirmContent,");
        buffer.append("DealConfirmName,");
        buffer.append("DealConfirmDate,");
        buffer.append("DealConfirmContent,");
        buffer.append("DealName,");
        buffer.append("DealDate,");
        buffer.append("DealContent,");
        buffer.append("Status,");
        buffer.append("Remark,");
        buffer.append("QuestionType,");
        buffer.append("EditData,");
        buffer.append("AppearType,");
        buffer.append("EditRequirement ");
        buffer.append("FROM IAContact ");
        if(logger.isDebugEnabled()){
            StringBuffer debugBuffer =  new StringBuffer(buffer.length()*4);
            debugBuffer.append(buffer.toString());
            debugBuffer.append("WHERE ");
            debugBuffer.append("ContactNo=").append("'").append(contactNo).append("'");
            logger.debug(debugBuffer.toString());
        }

        buffer.append("WHERE ");
        buffer.append("ContactNo = ?");

        dbManager.prepareStatement(buffer.toString());
        //设置条件字段;
        dbManager.setString(1,contactNo);
         ResultSet resultSet = dbManager.executePreparedQuery();
        IAContactDto iAContactDto = null;
        if(resultSet.next()){
            iAContactDto = new IAContactDto();
            iAContactDto.setContactNo(dbManager.getString(resultSet,1));
            iAContactDto.setCompanyCode(dbManager.getString(resultSet,2));
            iAContactDto.setMakeCode(dbManager.getString(resultSet,3));
            iAContactDto.setAreaCode(dbManager.getString(resultSet,4));
            iAContactDto.setUserCode(dbManager.getString(resultSet,5));
            iAContactDto.setCreator(dbManager.getString(resultSet,6));
            iAContactDto.setPhoneNumber(dbManager.getString(resultSet,7));
            iAContactDto.setEmail(dbManager.getString(resultSet,8));
            iAContactDto.setApplyDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_MINUTE,9));
            iAContactDto.setAmount(dbManager.getInt(resultSet,10));
            iAContactDto.setContent(dbManager.getString(resultSet,11));
            iAContactDto.setDealType(dbManager.getString(resultSet,12));
            iAContactDto.setConfirmName(dbManager.getString(resultSet,13));
            iAContactDto.setConfirmDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_MINUTE,14));
            iAContactDto.setConfirmContent(dbManager.getString(resultSet,15));
            iAContactDto.setDealConfirmName(dbManager.getString(resultSet,16));
            iAContactDto.setDealConfirmDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_MINUTE,17));
            iAContactDto.setDealConfirmContent(dbManager.getString(resultSet,18));
            iAContactDto.setDealName(dbManager.getString(resultSet,19));
            iAContactDto.setDealDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_MINUTE,20));
            iAContactDto.setDealContent(dbManager.getString(resultSet,21));
            iAContactDto.setStatus(dbManager.getString(resultSet,22));
            iAContactDto.setRemark(dbManager.getString(resultSet,23));
            iAContactDto.setQuestionType(dbManager.getString(resultSet,24));
            iAContactDto.setEditData(dbManager.getString(resultSet,25));
            iAContactDto.setAppearType(dbManager.getString(resultSet,26));
            iAContactDto.setEditRequirement(dbManager.getString(resultSet,27));
        }
        resultSet.close();
        return iAContactDto;
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
        buffer.append("ContactNo,");
        buffer.append("CompanyCode,");
        buffer.append("MakeCode,");
        buffer.append("AreaCode,");
        buffer.append("UserCode,");
        buffer.append("Creator,");
        buffer.append("PhoneNumber,");
        buffer.append("Email,");
        buffer.append("ApplyDate,");
        buffer.append("Amount,");
        buffer.append("Content,");
        buffer.append("DealType,");
        buffer.append("ConfirmName,");
        buffer.append("ConfirmDate,");
        buffer.append("ConfirmContent,");
        buffer.append("DealConfirmName,");
        buffer.append("DealConfirmDate,");
        buffer.append("DealConfirmContent,");
        buffer.append("DealName,");
        buffer.append("DealDate,");
        buffer.append("DealContent,");
        buffer.append("Status,");
        buffer.append("Remark,");
        buffer.append("QuestionType,");
        buffer.append("EditData,");
        buffer.append("AppearType,");
        buffer.append("EditRequirement ");
        buffer.append("FROM IAContact WHERE ");
        buffer.append(conditions);
        boolean supportPaging = false;//数据库是否支持分页
        if (pageNo > 0){
            //目前只对Oracle优化
            if(dbManager.getConnection().getMetaData().getDatabaseProductName().equalsIgnoreCase("Oracle")){
                buffer.insert(0,"SELECT * FROM ( SELECT row_.*, rownum rownum_ FROM (");
                buffer.append(") row_ WHERE rownum <= "+rowsPerPage * pageNo+") WHERE rownum_ > "+rowsPerPage * (pageNo - 1));
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
        IAContactDto iAContactDto = null;
        while(resultSet.next()){
            if (supportPaging == false && pageNo>0) {
                count++;
                if(count > rowsPerPage){
                    break;
                }
            }

            iAContactDto = new IAContactDto();
            iAContactDto.setContactNo(dbManager.getString(resultSet,1));
            iAContactDto.setCompanyCode(dbManager.getString(resultSet,2));
            iAContactDto.setMakeCode(dbManager.getString(resultSet,3));
            iAContactDto.setAreaCode(dbManager.getString(resultSet,4));
            iAContactDto.setUserCode(dbManager.getString(resultSet,5));
            iAContactDto.setCreator(dbManager.getString(resultSet,6));
            iAContactDto.setPhoneNumber(dbManager.getString(resultSet,7));
            iAContactDto.setEmail(dbManager.getString(resultSet,8));
            iAContactDto.setApplyDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_MINUTE,9));
            iAContactDto.setAmount(dbManager.getInt(resultSet,10));
            iAContactDto.setContent(dbManager.getString(resultSet,11));
            iAContactDto.setDealType(dbManager.getString(resultSet,12));
            iAContactDto.setConfirmName(dbManager.getString(resultSet,13));
            iAContactDto.setConfirmDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_MINUTE,14));
            iAContactDto.setConfirmContent(dbManager.getString(resultSet,15));
            iAContactDto.setDealConfirmName(dbManager.getString(resultSet,16));
            iAContactDto.setDealConfirmDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_MINUTE,17));
            iAContactDto.setDealConfirmContent(dbManager.getString(resultSet,18));
            iAContactDto.setDealName(dbManager.getString(resultSet,19));
            iAContactDto.setDealDate(dbManager.getDateTime(resultSet,DateTime.YEAR_TO_MINUTE,20));
            iAContactDto.setDealContent(dbManager.getString(resultSet,21));
            iAContactDto.setStatus(dbManager.getString(resultSet,22));
            iAContactDto.setRemark(dbManager.getString(resultSet,23));
            iAContactDto.setQuestionType(dbManager.getString(resultSet,24));
            iAContactDto.setEditData(dbManager.getString(resultSet,25));
            iAContactDto.setAppearType(dbManager.getString(resultSet,26));
            iAContactDto.setEditRequirement(dbManager.getString(resultSet,27));
            collection.add(iAContactDto);
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
        buffer.append("DELETE FROM IAContact WHERE ");
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
        buffer.append("SELECT count(*) FROM IAContact WHERE ");
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
