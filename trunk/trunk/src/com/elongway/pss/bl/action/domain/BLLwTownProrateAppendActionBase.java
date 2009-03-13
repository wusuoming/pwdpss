package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownProrateAppend;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownProrateAppend-比例分摊追加表的业务逻辑对象类<br>
 */
public class BLLwTownProrateAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownProrateAppendActionBase.class);

    /**
     * 构造函数
     */
    public BLLwTownProrateAppendActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownProrateAppendDto lwTownProrateAppendDto)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //插入记录
        dbLwTownProrateAppend.insert(lwTownProrateAppendDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param flag 标志
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String flag)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //删除记录
        dbLwTownProrateAppend.delete(userNo, flag);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //按条件删除记录
        dbLwTownProrateAppend.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownProrateAppendDto lwTownProrateAppendDto)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //更新记录
        dbLwTownProrateAppend.update(lwTownProrateAppendDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param flag 标志
     * @return lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public LwTownProrateAppendDto findByPrimaryKey(DBManager dbManager,String userNo,String flag)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        //声明DTO
        LwTownProrateAppendDto lwTownProrateAppendDto = null;
        //查询数据,赋值给DTO
        lwTownProrateAppendDto = dbLwTownProrateAppend.findByPrimaryKey(userNo, flag);
        return lwTownProrateAppendDto;
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
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownProrateAppend.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownProrateAppend.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwTownProrateAppendDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownProrateAppend.findByConditions(conditions);
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
        DBLwTownProrateAppend dbLwTownProrateAppend = new DBLwTownProrateAppend(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownProrateAppend.getCount(conditions);
        return count;
    }
}
