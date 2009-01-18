package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSalePrice;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSalePrice-趸售价格表的业务逻辑对象类<br>
 */
public class BLLwWholeSalePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePriceActionBase.class);

    /**
     * 构造函数
     */
    public BLLwWholeSalePriceActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSalePriceDto lwWholeSalePriceDto)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //插入记录
        dbLwWholeSalePrice.insert(lwWholeSalePriceDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param saleArea 趸售区域
     * @param voltageBegin 起始电压
     * @throws Exception
     */
    public void delete(DBManager dbManager,String saleArea,double voltageBegin)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //删除记录
        dbLwWholeSalePrice.delete(saleArea, voltageBegin);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //按条件删除记录
        dbLwWholeSalePrice.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSalePriceDto lwWholeSalePriceDto)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //更新记录
        dbLwWholeSalePrice.update(lwWholeSalePriceDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param saleArea 趸售区域
     * @param voltageBegin 起始电压
     * @return lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public LwWholeSalePriceDto findByPrimaryKey(DBManager dbManager,String saleArea,double voltageBegin)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        //声明DTO
        LwWholeSalePriceDto lwWholeSalePriceDto = null;
        //查询数据,赋值给DTO
        lwWholeSalePriceDto = dbLwWholeSalePrice.findByPrimaryKey(saleArea, voltageBegin);
        return lwWholeSalePriceDto;
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
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSalePrice.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSalePrice.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwWholeSalePriceDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSalePrice.findByConditions(conditions);
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
        DBLwWholeSalePrice dbLwWholeSalePrice = new DBLwWholeSalePrice(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSalePrice.getCount(conditions);
        return count;
    }
}
