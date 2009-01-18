package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleProrate;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleProrate-趸售比例分摊表的业务逻辑对象类<br>
 */
public class BLLwWholeSaleProrateActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleProrateActionBase.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleProrateActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleProrateDto lwWholeSaleProrateDto)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //插入记录
        dbLwWholeSaleProrate.insert(lwWholeSaleProrateDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param comCode 机构代码
     * @param voltLevel 电压等级
     * @throws Exception
     */
    public void delete(DBManager dbManager,String comCode,String voltLevel)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //删除记录
        dbLwWholeSaleProrate.delete(comCode, voltLevel);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //按条件删除记录
        dbLwWholeSaleProrate.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleProrateDto lwWholeSaleProrateDto)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //更新记录
        dbLwWholeSaleProrate.update(lwWholeSaleProrateDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param comCode 机构代码
     * @param voltLevel 电压等级
     * @return lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public LwWholeSaleProrateDto findByPrimaryKey(DBManager dbManager,String comCode,String voltLevel)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        //声明DTO
        LwWholeSaleProrateDto lwWholeSaleProrateDto = null;
        //查询数据,赋值给DTO
        lwWholeSaleProrateDto = dbLwWholeSaleProrate.findByPrimaryKey(comCode, voltLevel);
        return lwWholeSaleProrateDto;
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
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleProrate.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleProrate.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwWholeSaleProrateDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleProrate.findByConditions(conditions);
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
        DBLwWholeSaleProrate dbLwWholeSaleProrate = new DBLwWholeSaleProrate(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleProrate.getCount(conditions);
        return count;
    }
}
