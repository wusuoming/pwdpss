package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwSalePrice;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWSalePrice-销售电价表的业务逻辑对象类<br>
 */
public class BLLwSalePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwSalePriceActionBase.class);

    /**
     * 构造函数
     */
    public BLLwSalePriceActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwSalePriceDto lwSalePriceDto)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //插入记录
        dbLwSalePrice.insert(lwSalePriceDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param powerClass 用电分类
     * @param priceCategory 电价分类
     * @param voltageBegin 起始电压
     * @param voltageEnd 终止电压
     * @param materialsType 原料类型
     * @throws Exception
     */
    public void delete(DBManager dbManager,String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //删除记录
        dbLwSalePrice.delete(powerClass, priceCategory, voltageBegin, voltageEnd, materialsType);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //按条件删除记录
        dbLwSalePrice.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwSalePriceDto lwSalePriceDto)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //更新记录
        dbLwSalePrice.update(lwSalePriceDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param powerClass 用电分类
     * @param priceCategory 电价分类
     * @param voltageBegin 起始电压
     * @param voltageEnd 终止电压
     * @param materialsType 原料类型
     * @return lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public LwSalePriceDto findByPrimaryKey(DBManager dbManager,String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        //声明DTO
        LwSalePriceDto lwSalePriceDto = null;
        //查询数据,赋值给DTO
        lwSalePriceDto = dbLwSalePrice.findByPrimaryKey(powerClass, priceCategory, voltageBegin, voltageEnd, materialsType);
        return lwSalePriceDto;
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
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwSalePrice.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwSalePrice.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwSalePriceDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwSalePrice.findByConditions(conditions);
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
        DBLwSalePrice dbLwSalePrice = new DBLwSalePrice(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwSalePrice.getCount(conditions);
        return count;
    }
}
