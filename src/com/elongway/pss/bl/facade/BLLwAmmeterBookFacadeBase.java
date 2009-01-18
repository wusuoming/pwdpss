package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.bl.action.domain.BLLwAmmeterBookAction;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwAmmeterBook-表本信息表的业务逻辑对象Facade基类<br>
 */
public class BLLwAmmeterBookFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterBookFacadeBase.class);

    /**
     * 构造函数
     */
    public BLLwAmmeterBookFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void insert(LwAmmeterBookDto lwAmmeterBookDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterBookAction blLwAmmeterBookAction = new BLLwAmmeterBookAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwAmmeterBookAction.insert(dbManager,lwAmmeterBookDto);
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
     * @param bookNo 表本号
     * @throws Exception
     */
    public void delete(String bookNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterBookAction blLwAmmeterBookAction = new BLLwAmmeterBookAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blLwAmmeterBookAction.delete(dbManager,bookNo);
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
        BLLwAmmeterBookAction blLwAmmeterBookAction = new BLLwAmmeterBookAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blLwAmmeterBookAction.deleteByConditions(dbManager,conditions);
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
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void update(LwAmmeterBookDto lwAmmeterBookDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterBookAction blLwAmmeterBookAction = new BLLwAmmeterBookAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blLwAmmeterBookAction.update(dbManager,lwAmmeterBookDto);
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
     * @param bookNo 表本号
     * @return lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public LwAmmeterBookDto findByPrimaryKey(String bookNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterBookAction blLwAmmeterBookAction = new BLLwAmmeterBookAction();
        //声明DTO
        LwAmmeterBookDto lwAmmeterBookDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            lwAmmeterBookDto = blLwAmmeterBookAction.findByPrimaryKey(dbManager,bookNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwAmmeterBookDto;
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
        BLLwAmmeterBookAction blLwAmmeterBookAction = new BLLwAmmeterBookAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwAmmeterBookAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含lwAmmeterBookDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwAmmeterBookAction blLwAmmeterBookAction = new BLLwAmmeterBookAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwAmmeterBookAction.findByConditions(dbManager,conditions);
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
        BLLwAmmeterBookAction blLwAmmeterBookAction = new BLLwAmmeterBookAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwAmmeterBookAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
