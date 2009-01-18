package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerUser;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWPowerUser-用电用户信息表的业务逻辑对象类<br>
 */
public class BLLwPowerUserActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerUserActionBase.class);

    /**
     * 构造函数
     */
    public BLLwPowerUserActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwPowerUserDto lwPowerUserDto)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //插入记录
        dbLwPowerUser.insert(lwPowerUserDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //删除记录
        dbLwPowerUser.delete(userNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //按条件删除记录
        dbLwPowerUser.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwPowerUserDto lwPowerUserDto)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //更新记录
        dbLwPowerUser.update(lwPowerUserDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @return lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public LwPowerUserDto findByPrimaryKey(DBManager dbManager,String userNo)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        //声明DTO
        LwPowerUserDto lwPowerUserDto = null;
        //查询数据,赋值给DTO
        lwPowerUserDto = dbLwPowerUser.findByPrimaryKey(userNo);
        return lwPowerUserDto;
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
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwPowerUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwPowerUserDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwPowerUser.findByConditions(conditions);
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
        DBLwPowerUser dbLwPowerUser = new DBLwPowerUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerUser.getCount(conditions);
        return count;
    }
}
