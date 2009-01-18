package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwFactoryIndicatorBak;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWFactoryIndicatorBak-大工业电表指针记录备份表的业务逻辑对象类<br>
 */
public class BLLwFactoryIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwFactoryIndicatorBakActionBase.class);

    /**
     * 构造函数
     */
    public BLLwFactoryIndicatorBakActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //插入记录
        dbLwFactoryIndicatorBak.insert(lwFactoryIndicatorBakDto);
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
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //删除记录
        dbLwFactoryIndicatorBak.delete(userNo, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //按条件删除记录
        dbLwFactoryIndicatorBak.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //更新记录
        dbLwFactoryIndicatorBak.update(lwFactoryIndicatorBakDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 帐期
     * @return lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public LwFactoryIndicatorBakDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        //声明DTO
        LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto = null;
        //查询数据,赋值给DTO
        lwFactoryIndicatorBakDto = dbLwFactoryIndicatorBak.findByPrimaryKey(userNo, statMonth);
        return lwFactoryIndicatorBakDto;
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
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwFactoryIndicatorBak.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwFactoryIndicatorBak.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwFactoryIndicatorBakDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwFactoryIndicatorBak.findByConditions(conditions);
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
        DBLwFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwFactoryIndicatorBak(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwFactoryIndicatorBak.getCount(conditions);
        return count;
    }
}
