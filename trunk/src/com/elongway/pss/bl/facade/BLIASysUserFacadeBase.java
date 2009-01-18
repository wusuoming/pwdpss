package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IASysUserDto;
import com.elongway.pss.bl.action.domain.BLIASysUserAction;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IASysUser的业务逻辑对象Facade基类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIASysUserFacadeBase{
    private static Logger logger = Logger.getLogger(BLIASysUserFacadeBase.class);

    /**
     * 构造函数
     */
    public BLIASysUserFacadeBase(){
    }

    /**
     * 插入一条数据
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void insert(IASysUserDto iASysUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blIASysUserAction.insert(dbManager,iASysUserDto);
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
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(String userCode,String areaCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //删除记录
            blIASysUserAction.delete(dbManager,userCode, areaCode);
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
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //按条件删除记录
            blIASysUserAction.deleteByConditions(dbManager,conditions);
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
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void update(IASysUserDto iASysUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blIASysUserAction.update(dbManager,iASysUserDto);
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
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @return iASysUserDto iASysUserDto
     * @throws Exception
     */
    public IASysUserDto findByPrimaryKey(String userCode,String areaCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        //声明DTO
        IASysUserDto iASysUserDto = null;
        try{
            dbManager.open("pssDataSource");
            //查询数据,赋值给DTO
            iASysUserDto = blIASysUserAction.findByPrimaryKey(dbManager,userCode, areaCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return iASysUserDto;
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
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blIASysUserAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection 包含iASysUserDto的集合
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            collection = blIASysUserAction.findByConditions(dbManager,conditions);
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
        BLIASysUserAction blIASysUserAction = new BLIASysUserAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blIASysUserAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
