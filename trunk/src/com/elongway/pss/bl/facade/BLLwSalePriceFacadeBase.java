package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.bl.action.domain.BLLwSalePriceAction;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWSalePrice-销售电价表的业务逻辑对象Facade基类<br>
 */
public class BLLwSalePriceFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwSalePriceFacadeBase.class);

    /**
     * 构造函数
     */
    public BLLwSalePriceFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void insert(LwSalePriceDto lwSalePriceDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwSalePriceAction.insert(dbManager,lwSalePriceDto);
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
     * @param powerClass 用电分类
     * @param priceCategory 电价分类
     * @param voltageBegin 起始电压
     * @param voltageEnd 终止电压
     * @param materialsType 原料类型
     * @throws Exception
     */
    public void delete(String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blLwSalePriceAction.delete(dbManager,powerClass, priceCategory, voltageBegin, voltageEnd, materialsType);
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
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blLwSalePriceAction.deleteByConditions(dbManager,conditions);
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
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void update(LwSalePriceDto lwSalePriceDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blLwSalePriceAction.update(dbManager,lwSalePriceDto);
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
     * @param powerClass 用电分类
     * @param priceCategory 电价分类
     * @param voltageBegin 起始电压
     * @param voltageEnd 终止电压
     * @param materialsType 原料类型
     * @return lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public LwSalePriceDto findByPrimaryKey(String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        //声明DTO
        LwSalePriceDto lwSalePriceDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            lwSalePriceDto = blLwSalePriceAction.findByPrimaryKey(dbManager,powerClass, priceCategory, voltageBegin, voltageEnd, materialsType);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwSalePriceDto;
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
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwSalePriceAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含lwSalePriceDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwSalePriceAction.findByConditions(dbManager,conditions);
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
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwSalePriceAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
