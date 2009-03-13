package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.bl.action.domain.BLLwTownIndicatorAction;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownIndicator-直供乡电表指针记录表的业务逻辑对象Facade基类<br>
 */
public class BLLwTownIndicatorFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorFacadeBase.class);

    /**
     * 构造函数
     */
    public BLLwTownIndicatorFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public void insert(LwTownIndicatorDto lwTownIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwTownIndicatorAction.insert(dbManager,lwTownIndicatorDto);
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
     * @param userNo 户号
     * @param statMonth 账期
     * @throws Exception
     */
    public void delete(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blLwTownIndicatorAction.delete(dbManager,userNo, statMonth);
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
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blLwTownIndicatorAction.deleteByConditions(dbManager,conditions);
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
     * @param lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public void update(LwTownIndicatorDto lwTownIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blLwTownIndicatorAction.update(dbManager,lwTownIndicatorDto);
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
     * @param userNo 户号
     * @param statMonth 账期
     * @return lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public LwTownIndicatorDto findByPrimaryKey(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        //声明DTO
        LwTownIndicatorDto lwTownIndicatorDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            lwTownIndicatorDto = blLwTownIndicatorAction.findByPrimaryKey(dbManager,userNo, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwTownIndicatorDto;
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
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwTownIndicatorAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含lwTownIndicatorDto的集合
     * @throws Exception
     */
    public Collection <LwTownIndicatorDto>findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwTownIndicatorAction.findByConditions(dbManager,conditions);
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
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwTownIndicatorAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
