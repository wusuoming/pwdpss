package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleSummary;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleSummary-趸售电费计算总表的业务逻辑对象类<br>
 */
public class BLLwWholeSaleSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleSummaryActionBase.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleSummaryActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleSummaryDto lwWholeSaleSummaryDto)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //插入记录
        dbLwWholeSaleSummary.insert(lwWholeSaleSummaryDto);
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
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //删除记录
        dbLwWholeSaleSummary.delete(lineCode, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //按条件删除记录
        dbLwWholeSaleSummary.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleSummaryDto lwWholeSaleSummaryDto)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //更新记录
        dbLwWholeSaleSummary.update(lwWholeSaleSummaryDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @param statMonth 统计年月
     * @return lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public LwWholeSaleSummaryDto findByPrimaryKey(DBManager dbManager,String lineCode,String statMonth)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        //声明DTO
        LwWholeSaleSummaryDto lwWholeSaleSummaryDto = null;
        //查询数据,赋值给DTO
        lwWholeSaleSummaryDto = dbLwWholeSaleSummary.findByPrimaryKey(lineCode, statMonth);
        return lwWholeSaleSummaryDto;
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
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleSummary.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleSummary.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwWholeSaleSummaryDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleSummary.findByConditions(conditions);
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
        DBLwWholeSaleSummary dbLwWholeSaleSummary = new DBLwWholeSaleSummary(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleSummary.getCount(conditions);
        return count;
    }
}
