package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummary;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownPriceSummary-直供乡电费计算总表的业务逻辑对象类<br>
 */
public class BLLwTownPriceSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryActionBase.class);

    /**
     * 构造函数
     */
    public BLLwTownPriceSummaryActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownPriceSummaryDto lwTownPriceSummaryDto)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //插入记录
        dbLwTownPriceSummary.insert(lwTownPriceSummaryDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param lineCode 线路代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String lineCode)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //删除记录
        dbLwTownPriceSummary.delete(userNo, lineCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //按条件删除记录
        dbLwTownPriceSummary.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownPriceSummaryDto lwTownPriceSummaryDto)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //更新记录
        dbLwTownPriceSummary.update(lwTownPriceSummaryDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param lineCode 线路代码
     * @return lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public LwTownPriceSummaryDto findByPrimaryKey(DBManager dbManager,String userNo,String lineCode)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        //声明DTO
        LwTownPriceSummaryDto lwTownPriceSummaryDto = null;
        //查询数据,赋值给DTO
        lwTownPriceSummaryDto = dbLwTownPriceSummary.findByPrimaryKey(userNo, lineCode);
        return lwTownPriceSummaryDto;
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
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummary.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownPriceSummary.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwTownPriceSummaryDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownPriceSummary.findByConditions(conditions);
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
        DBLwTownPriceSummary dbLwTownPriceSummary = new DBLwTownPriceSummary(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownPriceSummary.getCount(conditions);
        return count;
    }
}
