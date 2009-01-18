package com.elongway.pss.bl.action.domain;

import java.util.*;

import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADsysConfig;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADsysConfig的业务逻辑对象类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADsysConfigActionBase{
    private static Logger logger = Logger.getLogger(BLIADsysConfigActionBase.class);

    /**
     * 构造函数
     */
    public BLIADsysConfigActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IADsysConfigDto iADsysConfigDto)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //插入记录
        dbIADsysConfig.insert(iADsysConfigDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @throws Exception
     */
    public void delete(DBManager dbManager,String parameterCode,String parameterType,String companyCode)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //删除记录
        dbIADsysConfig.delete(parameterCode, parameterType, companyCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //按条件删除记录
        dbIADsysConfig.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IADsysConfigDto iADsysConfigDto)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //更新记录
        dbIADsysConfig.update(iADsysConfigDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @return iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public IADsysConfigDto findByPrimaryKey(DBManager dbManager,String parameterCode,String parameterType,String companyCode)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //声明DTO
        IADsysConfigDto iADsysConfigDto = null;
        //查询数据,赋值给DTO
        iADsysConfigDto = dbIADsysConfig.findByPrimaryKey(parameterCode, parameterType, companyCode);
        return iADsysConfigDto;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @param pageNo 页号
     * @param rowsPerPage 每页的行数
     * @return PageRecord 查询的一页的结果
     * @throws Exception
     */
    public PageRecord findByConditions(DBManager dbManager,String conditions,int pageNo,int rowsPerPage)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADsysConfig.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIADsysConfig.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含iADsysConfigDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIADsysConfig.findByConditions(conditions);
        return collection;
    }

    /**
     * 查询满足模糊查询条件的记录数
     * @param dbManager DB管理器
     * @param conditions 模糊查询条件
     * @return 满足模糊查询条件的记录数
     * @throws Exception
     */
    public int getCount(DBManager dbManager,String conditions) 
        throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADsysConfig.getCount(conditions);
        return count;
    }
}
