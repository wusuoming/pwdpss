package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IAContactDto;
import com.elongway.pss.bl.action.domain.BLIAContactAction;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IAContact的业务逻辑对象Facade基类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIAContactFacadeBase{
    private static Logger logger = Logger.getLogger(BLIAContactFacadeBase.class);

    /**
     * 构造函数
     */
    public BLIAContactFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void insert(IAContactDto iAContactDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blIAContactAction.insert(dbManager,iAContactDto);
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
     * @param contactNo ContactNo
     * @throws Exception
     */
    public void delete(String contactNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blIAContactAction.delete(dbManager,contactNo);
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
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blIAContactAction.deleteByConditions(dbManager,conditions);
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
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void update(IAContactDto iAContactDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blIAContactAction.update(dbManager,iAContactDto);
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
     * @param contactNo ContactNo
     * @return iAContactDto iAContactDto
     * @throws Exception
     */
    public IAContactDto findByPrimaryKey(String contactNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        //声明DTO
        IAContactDto iAContactDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            iAContactDto = blIAContactAction.findByPrimaryKey(dbManager,contactNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return iAContactDto;
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
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blIAContactAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含iAContactDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            collection = blIAContactAction.findByConditions(dbManager,conditions);
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
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blIAContactAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
