package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwCorporationSummary;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWCorporationSummary-大工业销售计算总表的业务逻辑对象类<br>
 */
public class BLLwCorporationSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwCorporationSummaryActionBase.class);

    /**
     * 构造函数
     */
    public BLLwCorporationSummaryActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwCorporationSummaryDto lwCorporationSummaryDto)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //插入记录
        dbLwCorporationSummary.insert(lwCorporationSummaryDto);
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
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //删除记录
        dbLwCorporationSummary.delete(lineCode, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //按条件删除记录
        dbLwCorporationSummary.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwCorporationSummaryDto lwCorporationSummaryDto)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //更新记录
        dbLwCorporationSummary.update(lwCorporationSummaryDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @param statMonth 统计年月
     * @return lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public LwCorporationSummaryDto findByPrimaryKey(DBManager dbManager,String lineCode,String statMonth)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        //声明DTO
        LwCorporationSummaryDto lwCorporationSummaryDto = null;
        //查询数据,赋值给DTO
        lwCorporationSummaryDto = dbLwCorporationSummary.findByPrimaryKey(lineCode, statMonth);
        return lwCorporationSummaryDto;
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
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwCorporationSummary.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwCorporationSummary.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwCorporationSummaryDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwCorporationSummary.findByConditions(conditions);
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
        DBLwCorporationSummary dbLwCorporationSummary = new DBLwCorporationSummary(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwCorporationSummary.getCount(conditions);
        return count;
    }
}
