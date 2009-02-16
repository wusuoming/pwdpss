package com.elongway.pss.bl.facade;

import java.util.*;

import com.elongway.pss.bl.action.domain.BLIADsysConfigAction;
import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.util.*;
/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADsysConfig的业务逻辑对象Facade基类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADsysConfigFacadeBase{
    private static Logger logger = Logger.getLogger(BLIADsysConfigFacadeBase.class);

    /**
     * 构造函数
     */
    public BLIADsysConfigFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void insert(IADsysConfigDto iADsysConfigDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blIADsysConfigAction.insert(dbManager,iADsysConfigDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * 按主键删除一条数据
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @throws Exception
     */
    public void delete(String parameterCode,String parameterType,String companyCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blIADsysConfigAction.delete(dbManager,parameterCode,parameterType,companyCode);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * 按条件删除数据
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(String conditions)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blIADsysConfigAction.deleteByConditions(dbManager,conditions);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void update(IADsysConfigDto iADsysConfigDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blIADsysConfigAction.update(dbManager,iADsysConfigDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * 按主键查找一条数据
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @return iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public IADsysConfigDto findByPrimaryKey(String parameterCode,String parameterType,String companyCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        //声明DTO
        IADsysConfigDto iADsysConfigDto = null;
        try{
        	dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            iADsysConfigDto = blIADsysConfigAction.findByPrimaryKey(dbManager,parameterCode, parameterType, companyCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return iADsysConfigDto;
    }

    /**
     * 按条件查询多条数据
     * @param conditions 查询条件
     * @param pageNo 页号
     * @param rowsPerPage 每页的行数
     * @return PageRecord 查询的一页的结果
     * @throws Exception
     */
    public PageRecord findByConditions(String conditions,int pageNo,int rowsPerPage)
        throws Exception{
        PageRecord pageRecord = new PageRecord(0,pageNo,1,rowsPerPage,new ArrayList());

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            pageRecord = blIADsysConfigAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param conditions 查询条件
     * @return Collection 包含iADsysConfigDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            collection = blIADsysConfigAction.findByConditions(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return collection;
    }

    /**
     * 查询满足模糊查询条件的记录数
     * @param conditions conditions
     * @return 满足模糊查询条件的记录数
     * @throws Exception
     */
    public int getCount(String conditions) 
        throws Exception{
        int rowCount=0;
        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            rowCount = blIADsysConfigAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
