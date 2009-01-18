package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSalePurePrice;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSalePurePrice-趸售纯电价表的业务逻辑对象类<br>
 */
public class BLLwWholeSalePurePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePurePriceActionBase.class);

    /**
     * 构造函数
     */
    public BLLwWholeSalePurePriceActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSalePurePriceDto lwWholeSalePurePriceDto)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //插入记录
        dbLwWholeSalePurePrice.insert(lwWholeSalePurePriceDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param voltLevel 电压等级
     * @param comcode 公司代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String voltLevel,String comcode)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //删除记录
        dbLwWholeSalePurePrice.delete(voltLevel, comcode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //按条件删除记录
        dbLwWholeSalePurePrice.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSalePurePriceDto lwWholeSalePurePriceDto)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //更新记录
        dbLwWholeSalePurePrice.update(lwWholeSalePurePriceDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param voltLevel 电压等级
     * @param comcode 公司代码
     * @return lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public LwWholeSalePurePriceDto findByPrimaryKey(DBManager dbManager,String voltLevel,String comcode)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        //声明DTO
        LwWholeSalePurePriceDto lwWholeSalePurePriceDto = null;
        //查询数据,赋值给DTO
        lwWholeSalePurePriceDto = dbLwWholeSalePurePrice.findByPrimaryKey(voltLevel, comcode);
        return lwWholeSalePurePriceDto;
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
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSalePurePrice.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSalePurePrice.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwWholeSalePurePriceDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSalePurePrice.findByConditions(conditions);
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
        DBLwWholeSalePurePrice dbLwWholeSalePurePrice = new DBLwWholeSalePurePrice(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSalePurePrice.getCount(conditions);
        return count;
    }
}
