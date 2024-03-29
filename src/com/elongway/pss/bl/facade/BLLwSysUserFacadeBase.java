package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.bl.action.domain.BLLwSysUserAction;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWSysUser-登录用户表的业务逻辑对象Facade基类<br>
 */
public class BLLwSysUserFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwSysUserFacadeBase.class);

    /**
     * 构造函数
     */
    public BLLwSysUserFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void insert(LwSysUserDto lwSysUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwSysUserAction.insert(dbManager,lwSysUserDto);
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
     * @param userCode 用户代码
     * @throws Exception
     */
    public void delete(String userCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blLwSysUserAction.delete(dbManager,userCode);
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
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blLwSysUserAction.deleteByConditions(dbManager,conditions);
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
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void update(LwSysUserDto lwSysUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blLwSysUserAction.update(dbManager,lwSysUserDto);
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
     * @param userCode 用户代码
     * @return lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public LwSysUserDto findByPrimaryKey(String userCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        //声明DTO
        LwSysUserDto lwSysUserDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            lwSysUserDto = blLwSysUserAction.findByPrimaryKey(dbManager,userCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwSysUserDto;
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
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwSysUserAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含lwSysUserDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwSysUserAction.findByConditions(dbManager,conditions);
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
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwSysUserAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
