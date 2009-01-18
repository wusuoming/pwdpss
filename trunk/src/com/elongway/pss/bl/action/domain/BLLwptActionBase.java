package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwptDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwpt;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是电压互感器的业务逻辑对象类<br>
 */
public class BLLwptActionBase{
    private static Logger logger = Logger.getLogger(BLLwptActionBase.class);

    /**
     * 构造函数
     */
    public BLLwptActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwptDto lwptDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwptDto lwptDto)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //插入记录
        dbLwpt.insert(lwptDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param modus 型式
     * @throws Exception
     */
    public void delete(DBManager dbManager,String modus)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //删除记录
        dbLwpt.delete(modus);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //按条件删除记录
        dbLwpt.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwptDto lwptDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwptDto lwptDto)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //更新记录
        dbLwpt.update(lwptDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param modus 型式
     * @return lwptDto lwptDto
     * @throws Exception
     */
    public LwptDto findByPrimaryKey(DBManager dbManager,String modus)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        //声明DTO
        LwptDto lwptDto = null;
        //查询数据,赋值给DTO
        lwptDto = dbLwpt.findByPrimaryKey(modus);
        return lwptDto;
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
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwpt.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwpt.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwptDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwpt dbLwpt = new DBLwpt(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwpt.findByConditions(conditions);
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
        DBLwpt dbLwpt = new DBLwpt(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwpt.getCount(conditions);
        return count;
    }
}
