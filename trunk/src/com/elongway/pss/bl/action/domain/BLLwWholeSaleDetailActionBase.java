package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleDetail;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleDetail-趸售费用明细表的业务逻辑对象类<br>
 */
public class BLLwWholeSaleDetailActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleDetailActionBase.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleDetailActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleDetailDto lwWholeSaleDetailDto)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //插入记录
        dbLwWholeSaleDetail.insert(lwWholeSaleDetailDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param companyName 公司名称
     * @param inputDate 统计日期
     * @throws Exception
     */
    public void delete(DBManager dbManager,String companyName,String inputDate)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //删除记录
        dbLwWholeSaleDetail.delete(companyName, inputDate);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //按条件删除记录
        dbLwWholeSaleDetail.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleDetailDto lwWholeSaleDetailDto)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //更新记录
        dbLwWholeSaleDetail.update(lwWholeSaleDetailDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param companyName 公司名称
     * @param inputDate 统计日期
     * @return lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public LwWholeSaleDetailDto findByPrimaryKey(DBManager dbManager,String companyName,String inputDate)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        //声明DTO
        LwWholeSaleDetailDto lwWholeSaleDetailDto = null;
        //查询数据,赋值给DTO
        lwWholeSaleDetailDto = dbLwWholeSaleDetail.findByPrimaryKey(companyName, inputDate);
        return lwWholeSaleDetailDto;
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
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleDetail.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleDetail.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwWholeSaleDetailDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleDetail.findByConditions(conditions);
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
        DBLwWholeSaleDetail dbLwWholeSaleDetail = new DBLwWholeSaleDetail(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleDetail.getCount(conditions);
        return count;
    }
}
