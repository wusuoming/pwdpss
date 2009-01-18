package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwctDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwct;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是电流互感器的业务逻辑对象类<br>
 */
public class BLLwctActionBase{
    private static Logger logger = Logger.getLogger(BLLwctActionBase.class);

    /**
     * 构造函数
     */
    public BLLwctActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwctDto lwctDto)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //插入记录
        dbLwct.insert(lwctDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param modus 型式
     * @throws Exception
     */
    public void delete(DBManager dbManager,String modus)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //删除记录
        dbLwct.delete(modus);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //按条件删除记录
        dbLwct.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwctDto lwctDto)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //更新记录
        dbLwct.update(lwctDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param modus 型式
     * @return lwctDto lwctDto
     * @throws Exception
     */
    public LwctDto findByPrimaryKey(DBManager dbManager,String modus)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        //声明DTO
        LwctDto lwctDto = null;
        //查询数据,赋值给DTO
        lwctDto = dbLwct.findByPrimaryKey(modus);
        return lwctDto;
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
        DBLwct dbLwct = new DBLwct(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwct.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwct.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwctDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwct dbLwct = new DBLwct(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwct.findByConditions(conditions);
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
        DBLwct dbLwct = new DBLwct(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwct.getCount(conditions);
        return count;
    }
}
