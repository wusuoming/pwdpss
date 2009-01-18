package com.elongway.pss.bl.facade;
import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwctAction;
import com.elongway.pss.dto.domain.LwctDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是电流互感器的业务逻辑对象Facade基类<br>
 */
public class BLLwctFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwctFacadeBase.class);

    /**
     * 构造函数
     */
    public BLLwctFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void insert(LwctDto lwctDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwctAction.insert(dbManager,lwctDto);
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
     * @param modus 型式
     * @throws Exception
     */
    public void delete(String modus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blLwctAction.delete(dbManager,modus);
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
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blLwctAction.deleteByConditions(dbManager,conditions);
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
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void update(LwctDto lwctDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blLwctAction.update(dbManager,lwctDto);
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
     * @param modus 型式
     * @return lwctDto lwctDto
     * @throws Exception
     */
    public LwctDto findByPrimaryKey(String modus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        //声明DTO
        LwctDto lwctDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            lwctDto = blLwctAction.findByPrimaryKey(dbManager,modus);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwctDto;
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
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwctAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含lwctDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwctAction.findByConditions(dbManager,conditions);
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
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwctAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
