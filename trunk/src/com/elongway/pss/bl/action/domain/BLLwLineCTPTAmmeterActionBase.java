package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwLineCTPTAmmeter;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是线路电流电压互感器电表关系表的业务逻辑对象类<br>
 */
public class BLLwLineCTPTAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineCTPTAmmeterActionBase.class);

    /**
     * 构造函数
     */
    public BLLwLineCTPTAmmeterActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //插入记录
        dbLwLineCTPTAmmeter.insert(lwLineCTPTAmmeterDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @param ctModus 电流互感器型式
     * @param ptModus 电压互感器型式
     * @param ammeterNo 表号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String lineCode,String ctModus,String ptModus,String ammeterNo)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //删除记录
        dbLwLineCTPTAmmeter.delete(lineCode, ctModus, ptModus, ammeterNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //按条件删除记录
        dbLwLineCTPTAmmeter.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //更新记录
        dbLwLineCTPTAmmeter.update(lwLineCTPTAmmeterDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param lineCode 线路代码
     * @param ctModus 电流互感器型式
     * @param ptModus 电压互感器型式
     * @param ammeterNo 表号
     * @return lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @throws Exception
     */
    public LwLineCTPTAmmeterDto findByPrimaryKey(DBManager dbManager,String lineCode,String ctModus,String ptModus,String ammeterNo)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        //声明DTO
        LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto = null;
        //查询数据,赋值给DTO
        lwLineCTPTAmmeterDto = dbLwLineCTPTAmmeter.findByPrimaryKey(lineCode, ctModus, ptModus, ammeterNo);
        return lwLineCTPTAmmeterDto;
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
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLineCTPTAmmeter.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwLineCTPTAmmeter.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwLineCTPTAmmeterDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwLineCTPTAmmeter.findByConditions(conditions);
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
        DBLwLineCTPTAmmeter dbLwLineCTPTAmmeter = new DBLwLineCTPTAmmeter(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwLineCTPTAmmeter.getCount(conditions);
        return count;
    }
}
