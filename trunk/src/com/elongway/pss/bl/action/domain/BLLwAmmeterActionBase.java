package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeter;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWAmmeter-电表信息表的业务逻辑对象类<br>
 */
public class BLLwAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterActionBase.class);

    /**
     * 构造函数
     */
    public BLLwAmmeterActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAmmeterDto lwAmmeterDto)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //插入记录
        dbLwAmmeter.insert(lwAmmeterDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param ammeterNo 表号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String ammeterNo)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //删除记录
        dbLwAmmeter.delete(ammeterNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //按条件删除记录
        dbLwAmmeter.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAmmeterDto lwAmmeterDto)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //更新记录
        dbLwAmmeter.update(lwAmmeterDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param ammeterNo 表号
     * @return lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public LwAmmeterDto findByPrimaryKey(DBManager dbManager,String ammeterNo)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        //声明DTO
        LwAmmeterDto lwAmmeterDto = null;
        //查询数据,赋值给DTO
        lwAmmeterDto = dbLwAmmeter.findByPrimaryKey(ammeterNo);
        return lwAmmeterDto;
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
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeter.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAmmeter.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwAmmeterDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAmmeter.findByConditions(conditions);
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
        DBLwAmmeter dbLwAmmeter = new DBLwAmmeter(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeter.getCount(conditions);
        return count;
    }
}
