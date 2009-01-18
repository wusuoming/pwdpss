package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBPrpDUser;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWDUser-操作员代码表的业务逻辑对象类<br>
 */
public class BLPrpDUserActionBase{
    private static Logger logger = Logger.getLogger(BLPrpDUserActionBase.class);

    /**
     * 构造函数
     */
    public BLPrpDUserActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param prpDUserDto prpDUserDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,PrpDUserDto prpDUserDto)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //插入记录
        dbPrpDUser.insert(prpDUserDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param operatorCode 操作员代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String operatorCode)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //删除记录
        dbPrpDUser.delete(operatorCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //按条件删除记录
        dbPrpDUser.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param prpDUserDto prpDUserDto
     * @throws Exception
     */
    public void update(DBManager dbManager,PrpDUserDto prpDUserDto)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //更新记录
        dbPrpDUser.update(prpDUserDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param operatorCode 操作员代码
     * @return prpDUserDto prpDUserDto
     * @throws Exception
     */
    public PrpDUserDto findByPrimaryKey(DBManager dbManager,String operatorCode)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        //声明DTO
        PrpDUserDto prpDUserDto = null;
        //查询数据,赋值给DTO
        prpDUserDto = dbPrpDUser.findByPrimaryKey(operatorCode);
        return prpDUserDto;
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
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbPrpDUser.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbPrpDUser.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含prpDUserDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbPrpDUser.findByConditions(conditions);
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
        DBPrpDUser dbPrpDUser = new DBPrpDUser(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbPrpDUser.getCount(conditions);
        return count;
    }
}
