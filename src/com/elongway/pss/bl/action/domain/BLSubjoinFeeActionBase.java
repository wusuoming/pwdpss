package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.SubjoinFeeDto;
import com.elongway.pss.resource.dtofactory.domain.DBSubjoinFee;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是subjoinFee-附加费用表的业务逻辑对象类<br>
 */
public class BLSubjoinFeeActionBase{
    private static Logger logger = Logger.getLogger(BLSubjoinFeeActionBase.class);

    /**
     * 构造函数
     */
    public BLSubjoinFeeActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,SubjoinFeeDto subjoinFeeDto)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //插入记录
        dbSubjoinFee.insert(subjoinFeeDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param powerType 用电类别
     * @throws Exception
     */
    public void delete(DBManager dbManager,String powerType)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //删除记录
        dbSubjoinFee.delete(powerType);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //按条件删除记录
        dbSubjoinFee.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,SubjoinFeeDto subjoinFeeDto)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //更新记录
        dbSubjoinFee.update(subjoinFeeDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param powerType 用电类别
     * @return subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public SubjoinFeeDto findByPrimaryKey(DBManager dbManager,String powerType)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        //声明DTO
        SubjoinFeeDto subjoinFeeDto = null;
        //查询数据,赋值给DTO
        subjoinFeeDto = dbSubjoinFee.findByPrimaryKey(powerType);
        return subjoinFeeDto;
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
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbSubjoinFee.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbSubjoinFee.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含subjoinFeeDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbSubjoinFee.findByConditions(conditions);
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
        DBSubjoinFee dbSubjoinFee = new DBSubjoinFee(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbSubjoinFee.getCount(conditions);
        return count;
    }
}
