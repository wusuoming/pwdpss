package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPriceSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPriceSummary;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWPriceSummary-电费计算总表的业务逻辑对象类<br>
 */
public class BLLwPriceSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwPriceSummaryActionBase.class);

    /**
     * 构造函数
     */
    public BLLwPriceSummaryActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwPriceSummaryDto lwPriceSummaryDto)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //插入记录
        dbLwPriceSummary.insert(lwPriceSummaryDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //删除记录
        dbLwPriceSummary.delete(lineCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //按条件删除记录
        dbLwPriceSummary.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwPriceSummaryDto lwPriceSummaryDto)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //更新记录
        dbLwPriceSummary.update(lwPriceSummaryDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @return lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public LwPriceSummaryDto findByPrimaryKey(DBManager dbManager,String lineCode)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        //声明DTO
        LwPriceSummaryDto lwPriceSummaryDto = null;
        //查询数据,赋值给DTO
        lwPriceSummaryDto = dbLwPriceSummary.findByPrimaryKey(lineCode);
        return lwPriceSummaryDto;
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
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPriceSummary.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwPriceSummary.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwPriceSummaryDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwPriceSummary.findByConditions(conditions);
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
        DBLwPriceSummary dbLwPriceSummary = new DBLwPriceSummary(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPriceSummary.getCount(conditions);
        return count;
    }
}
