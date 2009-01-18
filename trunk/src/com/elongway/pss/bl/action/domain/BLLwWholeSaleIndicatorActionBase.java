package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleIndicator;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleIndicator-趸售电表指针记录表的业务逻辑对象类<br>
 */
public class BLLwWholeSaleIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleIndicatorActionBase.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleIndicatorActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //插入记录
        dbLwWholeSaleIndicator.insert(lwWholeSaleIndicatorDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 帐期
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //删除记录
        dbLwWholeSaleIndicator.delete(userNo, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //按条件删除记录
        dbLwWholeSaleIndicator.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //更新记录
        dbLwWholeSaleIndicator.update(lwWholeSaleIndicatorDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 帐期
     * @return lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public LwWholeSaleIndicatorDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //声明DTO
        LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = null;
        //查询数据,赋值给DTO
        lwWholeSaleIndicatorDto = dbLwWholeSaleIndicator.findByPrimaryKey(userNo, statMonth);
        return lwWholeSaleIndicatorDto;
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
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleIndicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleIndicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwWholeSaleIndicatorDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleIndicator.findByConditions(conditions);
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
        DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleIndicator.getCount(conditions);
        return count;
    }
}
