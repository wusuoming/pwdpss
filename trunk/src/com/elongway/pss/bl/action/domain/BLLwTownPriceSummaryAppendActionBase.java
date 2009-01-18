package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummaryAppend;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownPriceSummaryAppend-直供乡追加电费计算总表的业务逻辑对象类<br>
 */
public class BLLwTownPriceSummaryAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryAppendActionBase.class);

    /**
     * 构造函数
     */
    public BLLwTownPriceSummaryAppendActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //插入记录
        dbLwTownPriceSummaryAppend.insert(lwTownPriceSummaryAppendDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 统计年月
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //删除记录
        dbLwTownPriceSummaryAppend.delete(userNo, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //按条件删除记录
        dbLwTownPriceSummaryAppend.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //更新记录
        dbLwTownPriceSummaryAppend.update(lwTownPriceSummaryAppendDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 统计年月
     * @return lwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto
     * @throws Exception
     */
    public LwTownPriceSummaryAppendDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        //声明DTO
        LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto = null;
        //查询数据,赋值给DTO
        lwTownPriceSummaryAppendDto = dbLwTownPriceSummaryAppend.findByPrimaryKey(userNo, statMonth);
        return lwTownPriceSummaryAppendDto;
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
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummaryAppend.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownPriceSummaryAppend.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwTownPriceSummaryAppendDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownPriceSummaryAppend.findByConditions(conditions);
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
        DBLwTownPriceSummaryAppend dbLwTownPriceSummaryAppend = new DBLwTownPriceSummaryAppend(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummaryAppend.getCount(conditions);
        return count;
    }
}
