package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerFeeFaxing;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWPowerFeeFaxing-电费电量发行表的业务逻辑对象类<br>
 */
public class BLLwPowerFeeFaxingActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerFeeFaxingActionBase.class);

    /**
     * 构造函数
     */
    public BLLwPowerFeeFaxingActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwPowerFeeFaxingDto lwPowerFeeFaxingDto)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //插入记录
        dbLwPowerFeeFaxing.insert(lwPowerFeeFaxingDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 统计年月
     * @param statStyle 统计方式
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String statMonth,String statStyle)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //删除记录
        dbLwPowerFeeFaxing.delete(userNo, statMonth, statStyle);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //按条件删除记录
        dbLwPowerFeeFaxing.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwPowerFeeFaxingDto lwPowerFeeFaxingDto)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //更新记录
        dbLwPowerFeeFaxing.update(lwPowerFeeFaxingDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param statMonth 统计年月
     * @param statStyle 统计方式
     * @return lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public LwPowerFeeFaxingDto findByPrimaryKey(DBManager dbManager,String userNo,String statMonth,String statStyle)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //声明DTO
        LwPowerFeeFaxingDto lwPowerFeeFaxingDto = null;
        //查询数据,赋值给DTO
        lwPowerFeeFaxingDto = dbLwPowerFeeFaxing.findByPrimaryKey(userNo, statMonth, statStyle);
        return lwPowerFeeFaxingDto;
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
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerFeeFaxing.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwPowerFeeFaxing.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwPowerFeeFaxingDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwPowerFeeFaxing.findByConditions(conditions);
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
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerFeeFaxing.getCount(conditions);
        return count;
    }
}
