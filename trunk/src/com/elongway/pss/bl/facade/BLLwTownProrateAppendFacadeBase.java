package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;
import com.elongway.pss.bl.action.domain.BLLwTownProrateAppendAction;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownProrateAppend-比例分摊追加表的业务逻辑对象Facade基类<br>
 */
public class BLLwTownProrateAppendFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownProrateAppendFacadeBase.class);

    /**
     * 构造函数
     */
    public BLLwTownProrateAppendFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void insert(LwTownProrateAppendDto lwTownProrateAppendDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwTownProrateAppendAction.insert(dbManager,lwTownProrateAppendDto);
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
     * @param flag 标志
     * @throws Exception
     */
    public void delete(String userNo,String flag)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blLwTownProrateAppendAction.delete(dbManager,userNo, flag);
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
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blLwTownProrateAppendAction.deleteByConditions(dbManager,conditions);
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
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void update(LwTownProrateAppendDto lwTownProrateAppendDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blLwTownProrateAppendAction.update(dbManager,lwTownProrateAppendDto);
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
     * @param flag 标志
     * @return lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public LwTownProrateAppendDto findByPrimaryKey(String userNo,String flag)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        //声明DTO
        LwTownProrateAppendDto lwTownProrateAppendDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            lwTownProrateAppendDto = blLwTownProrateAppendAction.findByPrimaryKey(dbManager,userNo, flag);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwTownProrateAppendDto;
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
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwTownProrateAppendAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含lwTownProrateAppendDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwTownProrateAppendAction.findByConditions(dbManager,conditions);
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
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwTownProrateAppendAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
