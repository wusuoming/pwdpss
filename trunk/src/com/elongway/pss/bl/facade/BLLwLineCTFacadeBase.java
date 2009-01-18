package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwLineCTAction;
import com.elongway.pss.dto.domain.LwLineCTDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是线路电流互感器对照表的业务逻辑对象Facade基类<br>
 */
public class BLLwLineCTFacadeBase{
	private static Logger logger = Logger.getLogger(BLLwLineCTFacadeBase.class);

    /**
     * 构造函数
     */
    public BLLwLineCTFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param lwLineCTDto lwLineCTDto
     * @throws Exception
     */
    public void insert(LwLineCTDto lwLineCTDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwLineCTAction.insert(dbManager,lwLineCTDto);
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
     * @param ctModus 电流互感器型式
     * @throws Exception
     */
    public void delete(String lineCode,String ctModus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blLwLineCTAction.delete(dbManager,lineCode, ctModus);
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
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blLwLineCTAction.deleteByConditions(dbManager,conditions);
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
     * @param lwLineCTDto lwLineCTDto
     * @throws Exception
     */
    public void update(LwLineCTDto lwLineCTDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blLwLineCTAction.update(dbManager,lwLineCTDto);
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
     * @param ctModus 电流互感器型式
     * @return lwLineCTDto lwLineCTDto
     * @throws Exception
     */
    public LwLineCTDto findByPrimaryKey(String lineCode,String ctModus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        //声明DTO
        LwLineCTDto lwLineCTDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            lwLineCTDto = blLwLineCTAction.findByPrimaryKey(dbManager,lineCode, ctModus);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwLineCTDto;
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
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwLineCTAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含lwLineCTDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwLineCTAction.findByConditions(dbManager,conditions);
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
        BLLwLineCTAction blLwLineCTAction = new BLLwLineCTAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwLineCTAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
