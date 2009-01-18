package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwLinePTAction;
import com.elongway.pss.dto.domain.LwLinePTDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是线路电压互感器对照表的业务逻辑对象Facade基类<br>
 */
public class BLLwLinePTFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwLinePTFacadeBase.class);

    /**
     * 构造函数
     */
    public BLLwLinePTFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public void insert(LwLinePTDto lwLinePTDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwLinePTAction.insert(dbManager,lwLinePTDto);
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
     * @param lineCode 线路代码
     * @param ptModus 电压互感器型式
     * @throws Exception
     */
    public void delete(String lineCode,String ptModus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blLwLinePTAction.delete(dbManager,lineCode, ptModus);
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
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blLwLinePTAction.deleteByConditions(dbManager,conditions);
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
     * @param lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public void update(LwLinePTDto lwLinePTDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blLwLinePTAction.update(dbManager,lwLinePTDto);
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
     * @param lineCode 线路代码
     * @param ptModus 电压互感器型式
     * @return lwLinePTDto lwLinePTDto
     * @throws Exception
     */
    public LwLinePTDto findByPrimaryKey(String lineCode,String ptModus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        //声明DTO
        LwLinePTDto lwLinePTDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            lwLinePTDto = blLwLinePTAction.findByPrimaryKey(dbManager,lineCode, ptModus);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwLinePTDto;
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
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwLinePTAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含lwLinePTDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwLinePTAction.findByConditions(dbManager,conditions);
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
        BLLwLinePTAction blLwLinePTAction = new BLLwLinePTAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwLinePTAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
