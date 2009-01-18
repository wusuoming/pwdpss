package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IAContactDto;
import com.elongway.pss.resource.dtofactory.domain.DBIAContact;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IAContact的业务逻辑对象类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIAContactActionBase{
    private static Logger logger = Logger.getLogger(BLIAContactActionBase.class);

    /**
     * 构造函数
     */
    public BLIAContactActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IAContactDto iAContactDto)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //插入记录
        dbIAContact.insert(iAContactDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param contactNo ContactNo
     * @throws Exception
     */
    public void delete(DBManager dbManager,String contactNo)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //删除记录
        dbIAContact.delete(contactNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //按条件删除记录
        dbIAContact.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IAContactDto iAContactDto)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //更新记录
        dbIAContact.update(iAContactDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param contactNo ContactNo
     * @return iAContactDto iAContactDto
     * @throws Exception
     */
    public IAContactDto findByPrimaryKey(DBManager dbManager,String contactNo)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //声明DTO
        IAContactDto iAContactDto = null;
        //查询数据,赋值给DTO
        iAContactDto = dbIAContact.findByPrimaryKey(contactNo);
        return iAContactDto;
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
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIAContact.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIAContact.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含iAContactDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIAContact.findByConditions(conditions);
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
        DBIAContact dbIAContact = new DBIAContact(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIAContact.getCount(conditions);
        return count;
    }
}
