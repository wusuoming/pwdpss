package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwDcompanyDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwDcompany;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWDcompany-机构代码表的业务逻辑对象类<br>
 */
public class BLLwDcompanyActionBase{
    private static Logger logger = Logger.getLogger(BLLwDcompanyActionBase.class);

    /**
     * 构造函数
     */
    public BLLwDcompanyActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwDcompanyDto lwDcompanyDto)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //插入记录
        dbLwDcompany.insert(lwDcompanyDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param comCode 机构代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String comCode)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //删除记录
        dbLwDcompany.delete(comCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //按条件删除记录
        dbLwDcompany.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwDcompanyDto lwDcompanyDto)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //更新记录
        dbLwDcompany.update(lwDcompanyDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param comCode 机构代码
     * @return lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public LwDcompanyDto findByPrimaryKey(DBManager dbManager,String comCode)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        //声明DTO
        LwDcompanyDto lwDcompanyDto = null;
        //查询数据,赋值给DTO
        lwDcompanyDto = dbLwDcompany.findByPrimaryKey(comCode);
        return lwDcompanyDto;
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
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwDcompany.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwDcompany.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwDcompanyDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwDcompany.findByConditions(conditions);
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
        DBLwDcompany dbLwDcompany = new DBLwDcompany(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwDcompany.getCount(conditions);
        return count;
    }
}
