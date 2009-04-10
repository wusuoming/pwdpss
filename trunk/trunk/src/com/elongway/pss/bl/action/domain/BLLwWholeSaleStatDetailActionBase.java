package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleStatDetailDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleStatDetail;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWWholeSaleStatDetail-趸售按电价统计的业务逻辑对象类<br>
 */
public class BLLwWholeSaleStatDetailActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleStatDetailActionBase.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleStatDetailActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //插入记录
        dbLwWholeSaleStatDetail.insert(lwWholeSaleStatDetailDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param companyName 公司名称
     * @param statStyle 统计标志
     * @param inputDate 统计日期
     * @throws Exception
     */
    public void delete(DBManager dbManager,String companyName,String statStyle,String inputDate)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //删除记录
        dbLwWholeSaleStatDetail.delete(companyName, statStyle, inputDate);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //按条件删除记录
        dbLwWholeSaleStatDetail.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //更新记录
        dbLwWholeSaleStatDetail.update(lwWholeSaleStatDetailDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param companyName 公司名称
     * @param statStyle 统计标志
     * @param inputDate 统计日期
     * @return lwWholeSaleStatDetailDto lwWholeSaleStatDetailDto
     * @throws Exception
     */
    public LwWholeSaleStatDetailDto findByPrimaryKey(DBManager dbManager,String companyName,String statStyle,String inputDate)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        //声明DTO
        LwWholeSaleStatDetailDto lwWholeSaleStatDetailDto = null;
        //查询数据,赋值给DTO
        lwWholeSaleStatDetailDto = dbLwWholeSaleStatDetail.findByPrimaryKey(companyName, statStyle, inputDate);
        return lwWholeSaleStatDetailDto;
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
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleStatDetail.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwWholeSaleStatDetail.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwWholeSaleStatDetailDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwWholeSaleStatDetail.findByConditions(conditions);
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
        DBLwWholeSaleStatDetail dbLwWholeSaleStatDetail = new DBLwWholeSaleStatDetail(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwWholeSaleStatDetail.getCount(conditions);
        return count;
    }
}
