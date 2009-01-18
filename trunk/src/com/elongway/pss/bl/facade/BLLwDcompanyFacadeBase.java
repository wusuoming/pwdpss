package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwDcompanyAction;
import com.elongway.pss.dto.domain.LwDcompanyDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWDcompany-机构代码表的业务逻辑对象Facade基类<br>
 */
public class BLLwDcompanyFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwDcompanyFacadeBase.class);

    /**
     * 构造函数
     */
    public BLLwDcompanyFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void insert(LwDcompanyDto lwDcompanyDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwDcompanyAction.insert(dbManager,lwDcompanyDto);
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
     * @param comCode 机构代码
     * @throws Exception
     */
    public void delete(String comCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blLwDcompanyAction.delete(dbManager,comCode);
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
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blLwDcompanyAction.deleteByConditions(dbManager,conditions);
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
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void update(LwDcompanyDto lwDcompanyDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blLwDcompanyAction.update(dbManager,lwDcompanyDto);
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
     * @param comCode 机构代码
     * @return lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public LwDcompanyDto findByPrimaryKey(String comCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        //声明DTO
        LwDcompanyDto lwDcompanyDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            lwDcompanyDto = blLwDcompanyAction.findByPrimaryKey(dbManager,comCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwDcompanyDto;
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
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwDcompanyAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含lwDcompanyDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwDcompanyAction.findByConditions(dbManager,conditions);
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
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwDcompanyAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
