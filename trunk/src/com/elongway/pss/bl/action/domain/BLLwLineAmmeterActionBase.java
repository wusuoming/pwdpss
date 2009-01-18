package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwLineAmmeter;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWLineAmmeter-线路电表对照表的业务逻辑对象类<br>
 */
public class BLLwLineAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineAmmeterActionBase.class);

    /**
     * 构造函数
     */
    public BLLwLineAmmeterActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwLineAmmeterDto lwLineAmmeterDto)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //插入记录
        dbLwLineAmmeter.insert(lwLineAmmeterDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @param ammeterNo 表号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode,String ammeterNo)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //删除记录
        dbLwLineAmmeter.delete(lineCode, ammeterNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //按条件删除记录
        dbLwLineAmmeter.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwLineAmmeterDto lwLineAmmeterDto)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //更新记录
        dbLwLineAmmeter.update(lwLineAmmeterDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @param ammeterNo 表号
     * @return lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public LwLineAmmeterDto findByPrimaryKey(DBManager dbManager,String lineCode,String ammeterNo)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        //声明DTO
        LwLineAmmeterDto lwLineAmmeterDto = null;
        //查询数据,赋值给DTO
        lwLineAmmeterDto = dbLwLineAmmeter.findByPrimaryKey(lineCode, ammeterNo);
        return lwLineAmmeterDto;
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
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLineAmmeter.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwLineAmmeter.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwLineAmmeterDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwLineAmmeter.findByConditions(conditions);
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
        DBLwLineAmmeter dbLwLineAmmeter = new DBLwLineAmmeter(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLineAmmeter.getCount(conditions);
        return count;
    }
}
