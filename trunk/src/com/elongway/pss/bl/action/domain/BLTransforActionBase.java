package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.TransforDto;
import com.elongway.pss.resource.dtofactory.domain.DBTransfor;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是Transfor-变压器信息的业务逻辑对象类<br>
 */
public class BLTransforActionBase{
    private static Logger logger = Logger.getLogger(BLTransforActionBase.class);

    /**
     * 构造函数
     */
    public BLTransforActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param transforDto transforDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,TransforDto transforDto)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //插入记录
        dbTransfor.insert(transforDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param transforName 变压器名称
     * @throws Exception
     */
    public void delete(DBManager dbManager,String transforName)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //删除记录
        dbTransfor.delete(transforName);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //按条件删除记录
        dbTransfor.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param transforDto transforDto
     * @throws Exception
     */
    public void update(DBManager dbManager,TransforDto transforDto)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //更新记录
        dbTransfor.update(transforDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param transforName 变压器名称
     * @return transforDto transforDto
     * @throws Exception
     */
    public TransforDto findByPrimaryKey(DBManager dbManager,String transforName)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        //声明DTO
        TransforDto transforDto = null;
        //查询数据,赋值给DTO
        transforDto = dbTransfor.findByPrimaryKey(transforName);
        return transforDto;
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
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbTransfor.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbTransfor.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含transforDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBTransfor dbTransfor = new DBTransfor(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbTransfor.findByConditions(conditions);
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
        DBTransfor dbTransfor = new DBTransfor(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbTransfor.getCount(conditions);
        return count;
    }
}
