package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorBak;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownIndicatorBak-直供乡电表指针记录备份表的业务逻辑对象类<br>
 */
public class BLLwTownIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorBakActionBase.class);

    /**
     * 构造函数
     */
    public BLLwTownIndicatorBakActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownIndicatorBakDto lwTownIndicatorBakDto)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //插入记录
        dbLwTownIndicatorBak.insert(lwTownIndicatorBakDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 账期
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //删除记录
        dbLwTownIndicatorBak.delete(userNo, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //按条件删除记录
        dbLwTownIndicatorBak.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownIndicatorBakDto lwTownIndicatorBakDto)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //更新记录
        dbLwTownIndicatorBak.update(lwTownIndicatorBakDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 账期
     * @return lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public LwTownIndicatorBakDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //声明DTO
        LwTownIndicatorBakDto lwTownIndicatorBakDto = null;
        //查询数据,赋值给DTO
        lwTownIndicatorBakDto = dbLwTownIndicatorBak.findByPrimaryKey(userNo, statMonth);
        return lwTownIndicatorBakDto;
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
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicatorBak.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownIndicatorBak.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwTownIndicatorBakDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownIndicatorBak.findByConditions(conditions);
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
        DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicatorBak.getCount(conditions);
        return count;
    }
}
