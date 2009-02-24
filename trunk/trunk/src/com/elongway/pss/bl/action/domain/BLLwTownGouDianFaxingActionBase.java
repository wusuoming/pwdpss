package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownGouDianFaxingDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownGouDianFaxing;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWTownGouDianFaxing-直供乡购电结算单的业务逻辑对象类<br>
 */
public class BLLwTownGouDianFaxingActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownGouDianFaxingActionBase.class);

    /**
     * 构造函数
     */
    public BLLwTownGouDianFaxingActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownGouDianFaxingDto lwTownGouDianFaxingDto)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //插入记录
        dbLwTownGouDianFaxing.insert(lwTownGouDianFaxingDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param townCode 乡镇代码
     * @param statMonth 发行年月
     * @throws Exception
     */
    public void delete(DBManager dbManager,String townCode,String statMonth)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //删除记录
        dbLwTownGouDianFaxing.delete(townCode, statMonth);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //按条件删除记录
        dbLwTownGouDianFaxing.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownGouDianFaxingDto lwTownGouDianFaxingDto)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //更新记录
        dbLwTownGouDianFaxing.update(lwTownGouDianFaxingDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param townCode 乡镇代码
     * @param statMonth 发行年月
     * @return lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public LwTownGouDianFaxingDto findByPrimaryKey(DBManager dbManager,String townCode,String statMonth)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //声明DTO
        LwTownGouDianFaxingDto lwTownGouDianFaxingDto = null;
        //查询数据,赋值给DTO
        lwTownGouDianFaxingDto = dbLwTownGouDianFaxing.findByPrimaryKey(townCode, statMonth);
        return lwTownGouDianFaxingDto;
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
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownGouDianFaxing.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownGouDianFaxing.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwTownGouDianFaxingDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownGouDianFaxing.findByConditions(conditions);
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
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownGouDianFaxing.getCount(conditions);
        return count;
    }
}
