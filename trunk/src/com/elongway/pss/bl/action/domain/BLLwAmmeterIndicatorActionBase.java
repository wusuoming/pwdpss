package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterIndicator;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWAmmeterIndicator-换表记录表的业务逻辑对象类<br>
 */
public class BLLwAmmeterIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterIndicatorActionBase.class);

    /**
     * 构造函数
     */
    public BLLwAmmeterIndicatorActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAmmeterIndicatorDto lwAmmeterIndicatorDto)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //插入记录
        dbLwAmmeterIndicator.insert(lwAmmeterIndicatorDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param serialNo 序号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String serialNo)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //删除记录
        dbLwAmmeterIndicator.delete(serialNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //按条件删除记录
        dbLwAmmeterIndicator.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAmmeterIndicatorDto lwAmmeterIndicatorDto)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //更新记录
        dbLwAmmeterIndicator.update(lwAmmeterIndicatorDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param serialNo 序号
     * @return lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public LwAmmeterIndicatorDto findByPrimaryKey(DBManager dbManager,String serialNo)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        //声明DTO
        LwAmmeterIndicatorDto lwAmmeterIndicatorDto = null;
        //查询数据,赋值给DTO
        lwAmmeterIndicatorDto = dbLwAmmeterIndicator.findByPrimaryKey(serialNo);
        return lwAmmeterIndicatorDto;
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
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterIndicator.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAmmeterIndicator.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwAmmeterIndicatorDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAmmeterIndicator.findByConditions(conditions);
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
        DBLwAmmeterIndicator dbLwAmmeterIndicator = new DBLwAmmeterIndicator(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterIndicator.getCount(conditions);
        return count;
    }
}
