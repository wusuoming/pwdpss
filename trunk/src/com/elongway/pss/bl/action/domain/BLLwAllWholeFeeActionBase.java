package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAllWholeFee;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwAllWholeFee-趸售总费用表的业务逻辑对象类<br>
 */
public class BLLwAllWholeFeeActionBase{
    private static Logger logger = Logger.getLogger(BLLwAllWholeFeeActionBase.class);

    /**
     * 构造函数
     */
    public BLLwAllWholeFeeActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAllWholeFeeDto lwAllWholeFeeDto)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //插入记录
        dbLwAllWholeFee.insert(lwAllWholeFeeDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param company 趸售公司
     * @param inputdate 年月
     * @throws Exception
     */
    public void delete(DBManager dbManager,String company,String inputdate)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //删除记录
        dbLwAllWholeFee.delete(company, inputdate);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //按条件删除记录
        dbLwAllWholeFee.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAllWholeFeeDto lwAllWholeFeeDto)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //更新记录
        dbLwAllWholeFee.update(lwAllWholeFeeDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param company 趸售公司
     * @param inputdate 年月
     * @return lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public LwAllWholeFeeDto findByPrimaryKey(DBManager dbManager,String company,String inputdate)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        //声明DTO
        LwAllWholeFeeDto lwAllWholeFeeDto = null;
        //查询数据,赋值给DTO
        lwAllWholeFeeDto = dbLwAllWholeFee.findByPrimaryKey(company, inputdate);
        return lwAllWholeFeeDto;
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
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAllWholeFee.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAllWholeFee.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwAllWholeFeeDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAllWholeFee.findByConditions(conditions);
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
        DBLwAllWholeFee dbLwAllWholeFee = new DBLwAllWholeFee(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAllWholeFee.getCount(conditions);
        return count;
    }
}
