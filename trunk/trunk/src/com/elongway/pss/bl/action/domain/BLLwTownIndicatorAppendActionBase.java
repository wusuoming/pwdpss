package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorAppend;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownIndicatorAppend-直供乡追加电费指针记录表的业务逻辑对象类<br>
 */
public class BLLwTownIndicatorAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorAppendActionBase.class);

    /**
     * 构造函数
     */
    public BLLwTownIndicatorAppendActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownIndicatorAppendDto lwTownIndicatorAppendDto)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //插入记录
        dbLwTownIndicatorAppend.insert(lwTownIndicatorAppendDto);
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
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //删除记录
        dbLwTownIndicatorAppend.delete(userNo, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //按条件删除记录
        dbLwTownIndicatorAppend.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownIndicatorAppendDto lwTownIndicatorAppendDto)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //更新记录
        dbLwTownIndicatorAppend.update(lwTownIndicatorAppendDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 账期
     * @return lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public LwTownIndicatorAppendDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        //声明DTO
        LwTownIndicatorAppendDto lwTownIndicatorAppendDto = null;
        //查询数据,赋值给DTO
        lwTownIndicatorAppendDto = dbLwTownIndicatorAppend.findByPrimaryKey(userNo, statMonth);
        return lwTownIndicatorAppendDto;
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
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicatorAppend.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownIndicatorAppend.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwTownIndicatorAppendDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownIndicatorAppend.findByConditions(conditions);
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
        DBLwTownIndicatorAppend dbLwTownIndicatorAppend = new DBLwTownIndicatorAppend(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownIndicatorAppend.getCount(conditions);
        return count;
    }
}
