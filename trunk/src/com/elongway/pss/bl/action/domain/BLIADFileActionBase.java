package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADFileDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADFile;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADFile的业务逻辑对象类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADFileActionBase{
    private static Logger logger = Logger.getLogger(BLIADFileActionBase.class);

    /**
     * 构造函数
     */
    public BLIADFileActionBase(){
    }
    
    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IADFileDto iADFileDto)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //插入记录
        dbIADFile.insert(iADFileDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param contactNo ContactNo
     * @param fileUuid FileUuid
     * @throws Exception
     */
    public void delete(DBManager dbManager,String contactNo,String fileUuid)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //删除记录
        dbIADFile.delete(contactNo, fileUuid);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //按条件删除记录
        dbIADFile.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IADFileDto iADFileDto)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //更新记录
        dbIADFile.update(iADFileDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param contactNo ContactNo
     * @param fileUuid FileUuid
     * @return iADFileDto iADFileDto
     * @throws Exception
     */
    public IADFileDto findByPrimaryKey(DBManager dbManager,String contactNo,String fileUuid)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        //声明DTO
        IADFileDto iADFileDto = null;
        //查询数据,赋值给DTO
        iADFileDto = dbIADFile.findByPrimaryKey(contactNo, fileUuid);
        return iADFileDto;
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
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADFile.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIADFile.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含iADFileDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADFile dbIADFile = new DBIADFile(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIADFile.findByConditions(conditions);
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
        DBIADFile dbIADFile = new DBIADFile(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADFile.getCount(conditions);
        return count;
    }
}
