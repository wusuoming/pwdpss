package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwBookUser;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwBookUser-表本用户对照表的业务逻辑对象类<br>
 */
public class BLLwBookUserActionBase{
    private static Logger logger = Logger.getLogger(BLLwBookUserActionBase.class);

    /**
     * 构造函数
     */
    public BLLwBookUserActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwBookUserDto lwBookUserDto)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //插入记录
        dbLwBookUser.insert(lwBookUserDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param bookNo 表本号
     * @param userNo 用户代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String bookNo,String userNo)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //删除记录
        dbLwBookUser.delete(bookNo, userNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //按条件删除记录
        dbLwBookUser.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwBookUserDto lwBookUserDto)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //更新记录
        dbLwBookUser.update(lwBookUserDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param bookNo 表本号
     * @param userNo 用户代码
     * @return lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public LwBookUserDto findByPrimaryKey(DBManager dbManager,String bookNo,String userNo)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        //声明DTO
        LwBookUserDto lwBookUserDto = null;
        //查询数据,赋值给DTO
        lwBookUserDto = dbLwBookUser.findByPrimaryKey(bookNo, userNo);
        return lwBookUserDto;
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
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwBookUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwBookUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwBookUserDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwBookUser.findByConditions(conditions);
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
        DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwBookUser.getCount(conditions);
        return count;
    }
}
