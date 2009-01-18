package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwFactoryIndicator;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWFactoryIndicator-大工业电表指针记录表的业务逻辑对象类<br>
 */
public class BLLwFactoryIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwFactoryIndicatorActionBase.class);

    /**
     * 构造函数
     */
    public BLLwFactoryIndicatorActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwFactoryIndicatorDto lwFactoryIndicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwFactoryIndicatorDto lwFactoryIndicatorDto)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //插入记录
        dbLwFactoryIndicator.insert(lwFactoryIndicatorDto);
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
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //删除记录
        dbLwFactoryIndicator.delete(userNo, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //按条件删除记录
        dbLwFactoryIndicator.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwFactoryIndicatorDto lwFactoryIndicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwFactoryIndicatorDto lwFactoryIndicatorDto)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //更新记录
        dbLwFactoryIndicator.update(lwFactoryIndicatorDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 帐期
     * @return lwFactoryIndicatorDto lwFactoryIndicatorDto
     * @throws Exception
     */
    public LwFactoryIndicatorDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        //声明DTO
        LwFactoryIndicatorDto lwFactoryIndicatorDto = null;
        //查询数据,赋值给DTO
        lwFactoryIndicatorDto = dbLwFactoryIndicator.findByPrimaryKey(userNo, statMonth);
        return lwFactoryIndicatorDto;
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
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwFactoryIndicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwFactoryIndicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwFactoryIndicatorDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwFactoryIndicator.findByConditions(conditions);
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
        DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwFactoryIndicator.getCount(conditions);
        return count;
    }
}
