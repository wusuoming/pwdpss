package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerLine;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWPowerLine-线路信息表的业务逻辑对象类<br>
 */
public class BLLwPowerLineActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerLineActionBase.class);

    /**
     * 构造函数
     */
    public BLLwPowerLineActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwPowerLineDto lwPowerLineDto)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //插入记录
        dbLwPowerLine.insert(lwPowerLineDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //删除记录
        dbLwPowerLine.delete(lineCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //按条件删除记录
        dbLwPowerLine.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwPowerLineDto lwPowerLineDto)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //更新记录
        dbLwPowerLine.update(lwPowerLineDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @return lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public LwPowerLineDto findByPrimaryKey(DBManager dbManager,String lineCode)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        //声明DTO
        LwPowerLineDto lwPowerLineDto = null;
        //查询数据,赋值给DTO
        lwPowerLineDto = dbLwPowerLine.findByPrimaryKey(lineCode);
        return lwPowerLineDto;
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
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerLine.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwPowerLine.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwPowerLineDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwPowerLine.findByConditions(conditions);
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
        DBLwPowerLine dbLwPowerLine = new DBLwPowerLine(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwPowerLine.getCount(conditions);
        return count;
    }
}
