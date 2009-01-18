package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IASysUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBIASysUser;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IASysUser的业务逻辑对象类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIASysUserActionBase{
    private static Logger logger = Logger.getLogger(BLIASysUserActionBase.class);

    /**
     * 构造函数
     */
    public BLIASysUserActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IASysUserDto iASysUserDto)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //插入记录
        dbIASysUser.insert(iASysUserDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userCode,String areaCode)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //删除记录
        dbIASysUser.delete(userCode, areaCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //按条件删除记录
        dbIASysUser.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param iASysUserDto iASysUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IASysUserDto iASysUserDto)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //更新记录
        dbIASysUser.update(iASysUserDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userCode UserCode
     * @param areaCode AreaCode
     * @return iASysUserDto iASysUserDto
     * @throws Exception
     */
    public IASysUserDto findByPrimaryKey(DBManager dbManager,String userCode,String areaCode)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        //声明DTO
        IASysUserDto iASysUserDto = null;
        //查询数据,赋值给DTO
        iASysUserDto = dbIASysUser.findByPrimaryKey(userCode, areaCode);
        return iASysUserDto;
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
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIASysUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIASysUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含iASysUserDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIASysUser.findByConditions(conditions);
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
        DBIASysUser dbIASysUser = new DBIASysUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIASysUser.getCount(conditions);
        return count;
    }
}
