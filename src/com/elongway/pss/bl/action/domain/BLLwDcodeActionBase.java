package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwDcode;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwDcode-基础代码表的业务逻辑对象类<br>
 */
public class BLLwDcodeActionBase{
    private static Logger logger = Logger.getLogger(BLLwDcodeActionBase.class);

    /**
     * 构造函数
     */
    public BLLwDcodeActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwDcodeDto lwDcodeDto)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //插入记录
        dbLwDcode.insert(lwDcodeDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param codeType 接口代码类型
     * @param codeCode 代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String codeType,String codeCode)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //删除记录
        dbLwDcode.delete(codeType, codeCode);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //按条件删除记录
        dbLwDcode.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwDcodeDto lwDcodeDto)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //更新记录
        dbLwDcode.update(lwDcodeDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param codeType 接口代码类型
     * @param codeCode 代码
     * @return lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public LwDcodeDto findByPrimaryKey(DBManager dbManager,String codeType,String codeCode)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        //声明DTO
        LwDcodeDto lwDcodeDto = null;
        //查询数据,赋值给DTO
        lwDcodeDto = dbLwDcode.findByPrimaryKey(codeType, codeCode);
        return lwDcodeDto;
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
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwDcode.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwDcode.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwDcodeDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwDcode.findByConditions(conditions);
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
        DBLwDcode dbLwDcode = new DBLwDcode(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwDcode.getCount(conditions);
        return count;
    }
}
