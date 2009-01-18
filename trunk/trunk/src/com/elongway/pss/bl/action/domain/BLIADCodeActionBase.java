package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADCode;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是IADCode的业务逻辑对象类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADCodeActionBase{
    private static Logger logger = Logger.getLogger(BLIADCodeActionBase.class);

    /**
     * 构造函数
     */
    public BLIADCodeActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IADCodeDto iADCodeDto)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //插入记录
        dbIADCode.insert(iADCodeDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @throws Exception
     */
    public void delete(DBManager dbManager,String codeType,String codeCode)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //删除记录
        dbIADCode.delete(codeType, codeCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //按条件删除记录
        dbIADCode.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IADCodeDto iADCodeDto)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //更新记录
        dbIADCode.update(iADCodeDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @return iADCodeDto iADCodeDto
     * @throws Exception
     */
    public IADCodeDto findByPrimaryKey(DBManager dbManager,String codeType,String codeCode)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //声明DTO
        IADCodeDto iADCodeDto = null;
        //查询数据,赋值给DTO
        iADCodeDto = dbIADCode.findByPrimaryKey(codeType, codeCode);
        return iADCodeDto;
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
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADCode.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIADCode.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含iADCodeDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIADCode.findByConditions(conditions);
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
        DBIADCode dbIADCode = new DBIADCode(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADCode.getCount(conditions);
        return count;
    }
}
