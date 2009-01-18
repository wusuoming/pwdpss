package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwUserAmmeter;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWUserAmmeter-用户电表对照表的业务逻辑对象类<br>
 */
public class BLLwUserAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwUserAmmeterActionBase.class);

    /**
     * 构造函数
     */
    public BLLwUserAmmeterActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwUserAmmeterDto lwUserAmmeterDto)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //插入记录
        dbLwUserAmmeter.insert(lwUserAmmeterDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param ammeterNo 表号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String ammeterNo)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //删除记录
        dbLwUserAmmeter.delete(userNo, ammeterNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //按条件删除记录
        dbLwUserAmmeter.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwUserAmmeterDto lwUserAmmeterDto)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //更新记录
        dbLwUserAmmeter.update(lwUserAmmeterDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param ammeterNo 表号
     * @return lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public LwUserAmmeterDto findByPrimaryKey(DBManager dbManager,String userNo,String ammeterNo)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        //声明DTO
        LwUserAmmeterDto lwUserAmmeterDto = null;
        //查询数据,赋值给DTO
        lwUserAmmeterDto = dbLwUserAmmeter.findByPrimaryKey(userNo, ammeterNo);
        return lwUserAmmeterDto;
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
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwUserAmmeter.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwUserAmmeter.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwUserAmmeterDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwUserAmmeter.findByConditions(conditions);
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
        DBLwUserAmmeter dbLwUserAmmeter = new DBLwUserAmmeter(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwUserAmmeter.getCount(conditions);
        return count;
    }
}
