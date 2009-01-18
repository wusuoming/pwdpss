package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCompanyDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADCompany;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADCompany的业务逻辑对象类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADCompanyActionBase{
    private static Logger logger = Logger.getLogger(BLIADCompanyActionBase.class);

    /**
     * 构造函数
     */
    public BLIADCompanyActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IADCompanyDto iADCompanyDto)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //插入记录
        dbIADCompany.insert(iADCompanyDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param companyCode CompanyCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(DBManager dbManager,String companyCode,String areaCode)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //删除记录
        dbIADCompany.delete(companyCode, areaCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //按条件删除记录
        dbIADCompany.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IADCompanyDto iADCompanyDto)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //更新记录
        dbIADCompany.update(iADCompanyDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param companyCode CompanyCode
     * @param areaCode AreaCode
     * @return iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public IADCompanyDto findByPrimaryKey(DBManager dbManager,String companyCode,String areaCode)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //声明DTO
        IADCompanyDto iADCompanyDto = null;
        //查询数据,赋值给DTO
        iADCompanyDto = dbIADCompany.findByPrimaryKey(companyCode, areaCode);
        return iADCompanyDto;
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
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADCompany.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIADCompany.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含iADCompanyDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIADCompany.findByConditions(conditions);
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
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADCompany.getCount(conditions);
        return count;
    }
}
