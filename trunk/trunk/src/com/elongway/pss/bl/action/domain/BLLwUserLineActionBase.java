package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwUserLine;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWUserLine-用户线路对照表的业务逻辑对象类<br>
 */
public class BLLwUserLineActionBase{
    private static Logger logger = Logger.getLogger(BLLwUserLineActionBase.class);

    /**
     * 构造函数
     */
    public BLLwUserLineActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwUserLineDto lwUserLineDto)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //插入记录
        dbLwUserLine.insert(lwUserLineDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param lineCode 线路代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo,String lineCode)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //删除记录
        dbLwUserLine.delete(userNo, lineCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //按条件删除记录
        dbLwUserLine.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwUserLineDto lwUserLineDto)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //更新记录
        dbLwUserLine.update(lwUserLineDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @param lineCode 线路代码
     * @return lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public LwUserLineDto findByPrimaryKey(DBManager dbManager,String userNo,String lineCode)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        //声明DTO
        LwUserLineDto lwUserLineDto = null;
        //查询数据,赋值给DTO
        lwUserLineDto = dbLwUserLine.findByPrimaryKey(userNo, lineCode);
        return lwUserLineDto;
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
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwUserLine.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwUserLine.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwUserLineDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwUserLine.findByConditions(conditions);
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
        DBLwUserLine dbLwUserLine = new DBLwUserLine(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwUserLine.getCount(conditions);
        return count;
    }
}
