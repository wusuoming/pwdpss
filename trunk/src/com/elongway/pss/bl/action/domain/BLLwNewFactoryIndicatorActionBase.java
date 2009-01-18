package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicator;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWNewFactoryIndicator-大工业新电表指针记录表的业务逻辑对象类<br>
 */
public class BLLwNewFactoryIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorActionBase.class);

    /**
     * 构造函数
     */
    public BLLwNewFactoryIndicatorActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //插入记录
        dbLwNewFactoryIndicator.insert(lwNewFactoryIndicatorDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 帐期
     * @param ammeterNo 表号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String statMonth,String ammeterNo)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //删除记录
        dbLwNewFactoryIndicator.delete(userNo, statMonth, ammeterNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //按条件删除记录
        dbLwNewFactoryIndicator.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //更新记录
        dbLwNewFactoryIndicator.update(lwNewFactoryIndicatorDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 帐期
     * @param ammeterNo 表号
     * @return lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public LwNewFactoryIndicatorDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth,String ammeterNo)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        //声明DTO
        LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = null;
        //查询数据,赋值给DTO
        lwNewFactoryIndicatorDto = dbLwNewFactoryIndicator.findByPrimaryKey(userNo, statMonth, ammeterNo);
        return lwNewFactoryIndicatorDto;
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
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwNewFactoryIndicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwNewFactoryIndicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwNewFactoryIndicatorDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwNewFactoryIndicator.findByConditions(conditions);
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
        DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwNewFactoryIndicator.getCount(conditions);
        return count;
    }
}
