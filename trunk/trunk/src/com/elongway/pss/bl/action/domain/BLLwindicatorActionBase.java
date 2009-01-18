package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwindicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwindicator;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWindicator-电表指针记录表的业务逻辑对象类<br>
 */
public class BLLwindicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwindicatorActionBase.class);

    /**
     * 构造函数
     */
    public BLLwindicatorActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwindicatorDto lwindicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwindicatorDto lwindicatorDto)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //插入记录
        dbLwindicator.insert(lwindicatorDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @param statMonth 统计年月
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode,String statMonth)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //删除记录
        dbLwindicator.delete(lineCode, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //按条件删除记录
        dbLwindicator.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwindicatorDto lwindicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwindicatorDto lwindicatorDto)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //更新记录
        dbLwindicator.update(lwindicatorDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @param statMonth 统计年月
     * @return lwindicatorDto lwindicatorDto
     * @throws Exception
     */
    public LwindicatorDto findByPrimaryKey(DBManager dbManager,String lineCode,String statMonth)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        //声明DTO
        LwindicatorDto lwindicatorDto = null;
        //查询数据,赋值给DTO
        lwindicatorDto = dbLwindicator.findByPrimaryKey(lineCode, statMonth);
        return lwindicatorDto;
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
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwindicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwindicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwindicatorDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwindicator.findByConditions(conditions);
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
        DBLwindicator dbLwindicator = new DBLwindicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwindicator.getCount(conditions);
        return count;
    }
}
