package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwShouShuTableDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwShouShuTable;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwShouShuTable-手输费用表的业务逻辑对象类<br>
 */
public class BLLwShouShuTableActionBase{
    private static Logger logger = Logger.getLogger(BLLwShouShuTableActionBase.class);

    /**
     * 构造函数
     */
    public BLLwShouShuTableActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwShouShuTableDto lwShouShuTableDto)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //插入记录
        dbLwShouShuTable.insert(lwShouShuTableDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param month 月份
     * @param feeType 费用类别
     * @throws Exception
     */
    public void delete(DBManager dbManager,String month,String feeType)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //删除记录
        dbLwShouShuTable.delete(month, feeType);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //按条件删除记录
        dbLwShouShuTable.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwShouShuTableDto lwShouShuTableDto)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //更新记录
        dbLwShouShuTable.update(lwShouShuTableDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param month 月份
     * @param feeType 费用类别
     * @return lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public LwShouShuTableDto findByPrimaryKey(DBManager dbManager,String month,String feeType)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        //声明DTO
        LwShouShuTableDto lwShouShuTableDto = null;
        //查询数据,赋值给DTO
        lwShouShuTableDto = dbLwShouShuTable.findByPrimaryKey(month, feeType);
        return lwShouShuTableDto;
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
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwShouShuTable.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwShouShuTable.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwShouShuTableDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwShouShuTable.findByConditions(conditions);
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
        DBLwShouShuTable dbLwShouShuTable = new DBLwShouShuTable(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwShouShuTable.getCount(conditions);
        return count;
    }
}
