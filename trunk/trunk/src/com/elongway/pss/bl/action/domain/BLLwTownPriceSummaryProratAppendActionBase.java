package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummaryProratAppend;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownPriceSummaryProrateAppend-直供乡追加电费计算总表的业务逻辑对象类<br>
 */
public class BLLwTownPriceSummaryProratAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryProratAppendActionBase.class);

    /**
     * 构造函数
     */
    public BLLwTownPriceSummaryProratAppendActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //插入记录
        dbLwTownPriceSummaryProratAppend.insert(lwTownPriceSummaryProratAppendDto);
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
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //删除记录
        dbLwTownPriceSummaryProratAppend.delete(userNo, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //按条件删除记录
        dbLwTownPriceSummaryProratAppend.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //更新记录
        dbLwTownPriceSummaryProratAppend.update(lwTownPriceSummaryProratAppendDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 统计年月
     * @return lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public LwTownPriceSummaryProratAppendDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        //声明DTO
        LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto = null;
        //查询数据,赋值给DTO
        lwTownPriceSummaryProratAppendDto = dbLwTownPriceSummaryProratAppend.findByPrimaryKey(userNo, statMonth);
        return lwTownPriceSummaryProratAppendDto;
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
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummaryProratAppend.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownPriceSummaryProratAppend.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwTownPriceSummaryProratAppendDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownPriceSummaryProratAppend.findByConditions(conditions);
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
        DBLwTownPriceSummaryProratAppend dbLwTownPriceSummaryProratAppend = new DBLwTownPriceSummaryProratAppend(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummaryProratAppend.getCount(conditions);
        return count;
    }
}
