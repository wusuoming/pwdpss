package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwSysUser;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWSysUser-登录用户表的业务逻辑对象类<br>
 */
public class BLLwSysUserActionBase{
    private static Logger logger = Logger.getLogger(BLLwSysUserActionBase.class);

    /**
     * 构造函数
     */
    public BLLwSysUserActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwSysUserDto lwSysUserDto)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //插入记录
        dbLwSysUser.insert(lwSysUserDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userCode 用户代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userCode)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //删除记录
        dbLwSysUser.delete(userCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //按条件删除记录
        dbLwSysUser.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwSysUserDto lwSysUserDto)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //更新记录
        dbLwSysUser.update(lwSysUserDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userCode 用户代码
     * @return lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public LwSysUserDto findByPrimaryKey(DBManager dbManager,String userCode)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        //声明DTO
        LwSysUserDto lwSysUserDto = null;
        //查询数据,赋值给DTO
        lwSysUserDto = dbLwSysUser.findByPrimaryKey(userCode);
        return lwSysUserDto;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @param pageNo 页号
     * @param rowsPerPage 每页的行数
     * @return PageRecord 查询的一页的结果
     * @throws Exception
     */
    public PageRecord findByConditions(DBManager dbManager,String conditions,int pageNo,int rowsPerPage)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwSysUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwSysUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwSysUserDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwSysUser.findByConditions(conditions);
        return collection;
    }

    /**
     * 查询满足模糊查询条件的记录数
     * @param dbManager DB管理器
     * @param conditions 模糊查询条件
     * @return 满足模糊查询条件的记录数
     * @throws Exception
     */
    public int getCount(DBManager dbManager,String conditions) 
        throws Exception{
        DBLwSysUser dbLwSysUser = new DBLwSysUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwSysUser.getCount(conditions);
        return count;
    }
}
