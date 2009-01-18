package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwRateCodeDto;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwRateCode;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWRateCode-调整率维护表的业务逻辑对象类<br>
 */
public class BLLwRateCodeActionBase{
    private static Logger logger = Logger.getLogger(BLLwRateCodeActionBase.class);

    /**
     * 构造函数
     */
    public BLLwRateCodeActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwRateCodeDto lwRateCodeDto)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //插入记录
        dbLwRateCode.insert(lwRateCodeDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param powerFactor 功率因数
     * @param suppleType 供电类型代码
     * @throws Exception
     */
    public void delete(DBManager dbManager,String powerFactor,String suppleType)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //删除记录
        dbLwRateCode.delete(powerFactor, suppleType);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //按条件删除记录
        dbLwRateCode.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwRateCodeDto lwRateCodeDto)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //更新记录
        dbLwRateCode.update(lwRateCodeDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param powerFactor 功率因数
     * @param suppleType 供电类型代码
     * @return lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public LwRateCodeDto findByPrimaryKey(DBManager dbManager,String powerFactor,String suppleType)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        //声明DTO
        LwRateCodeDto lwRateCodeDto = null;
        //查询数据,赋值给DTO
        lwRateCodeDto = dbLwRateCode.findByPrimaryKey(powerFactor, suppleType);
        return lwRateCodeDto;
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
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwRateCode.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwRateCode.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwRateCodeDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwRateCode.findByConditions(conditions);
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
        DBLwRateCode dbLwRateCode = new DBLwRateCode(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwRateCode.getCount(conditions);
        return count;
    }
}
