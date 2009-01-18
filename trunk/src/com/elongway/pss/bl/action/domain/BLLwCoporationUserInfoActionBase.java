package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwCoporationUserInfo;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWCoporationUserInfo-大工业用户信息表的业务逻辑对象类<br>
 */
public class BLLwCoporationUserInfoActionBase{
    private static Logger logger = Logger.getLogger(BLLwCoporationUserInfoActionBase.class);

    /**
     * 构造函数
     */
    public BLLwCoporationUserInfoActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwCoporationUserInfoDto lwCoporationUserInfoDto)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //插入记录
        dbLwCoporationUserInfo.insert(lwCoporationUserInfoDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //删除记录
        dbLwCoporationUserInfo.delete(userNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //按条件删除记录
        dbLwCoporationUserInfo.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwCoporationUserInfoDto lwCoporationUserInfoDto)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //更新记录
        dbLwCoporationUserInfo.update(lwCoporationUserInfoDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @return lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public LwCoporationUserInfoDto findByPrimaryKey(DBManager dbManager,String userNo)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        //声明DTO
        LwCoporationUserInfoDto lwCoporationUserInfoDto = null;
        //查询数据,赋值给DTO
        lwCoporationUserInfoDto = dbLwCoporationUserInfo.findByPrimaryKey(userNo);
        return lwCoporationUserInfoDto;
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
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwCoporationUserInfo.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwCoporationUserInfo.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwCoporationUserInfoDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwCoporationUserInfo.findByConditions(conditions);
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
        DBLwCoporationUserInfo dbLwCoporationUserInfo = new DBLwCoporationUserInfo(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwCoporationUserInfo.getCount(conditions);
        return count;
    }
}
