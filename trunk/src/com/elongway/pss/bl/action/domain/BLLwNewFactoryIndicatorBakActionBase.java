package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicatorBak;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWNewFactoryIndicatorBak-大工业新电表指针备份表的业务逻辑对象类<br>
 */
public class BLLwNewFactoryIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorBakActionBase.class);

    /**
     * 构造函数
     */
    public BLLwNewFactoryIndicatorBakActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //插入记录
        dbLwNewFactoryIndicatorBak.insert(lwNewFactoryIndicatorBakDto);
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
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //删除记录
        dbLwNewFactoryIndicatorBak.delete(userNo, statMonth, ammeterNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //按条件删除记录
        dbLwNewFactoryIndicatorBak.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //更新记录
        dbLwNewFactoryIndicatorBak.update(lwNewFactoryIndicatorBakDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 帐期
     * @param ammeterNo 表号
     * @return lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public LwNewFactoryIndicatorBakDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth,String ammeterNo)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        //声明DTO
        LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto = null;
        //查询数据,赋值给DTO
        lwNewFactoryIndicatorBakDto = dbLwNewFactoryIndicatorBak.findByPrimaryKey(userNo, statMonth, ammeterNo);
        return lwNewFactoryIndicatorBakDto;
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
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwNewFactoryIndicatorBak.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwNewFactoryIndicatorBak.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwNewFactoryIndicatorBakDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwNewFactoryIndicatorBak.findByConditions(conditions);
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
        DBLwNewFactoryIndicatorBak dbLwNewFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwNewFactoryIndicatorBak.getCount(conditions);
        return count;
    }
}
