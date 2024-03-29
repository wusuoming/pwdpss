package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterChange;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWAmmeterChange-电表换表信息的业务逻辑对象类<br>
 */
public class BLLwAmmeterChangeActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterChangeActionBase.class);

    /**
     * 构造函数
     */
    public BLLwAmmeterChangeActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAmmeterChangeDto lwAmmeterChangeDto)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //插入记录
        dbLwAmmeterChange.insert(lwAmmeterChangeDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param id 序号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String id)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //删除记录
        dbLwAmmeterChange.delete(id);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //按条件删除记录
        dbLwAmmeterChange.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAmmeterChangeDto lwAmmeterChangeDto)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //更新记录
        dbLwAmmeterChange.update(lwAmmeterChangeDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param id 序号
     * @return lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public LwAmmeterChangeDto findByPrimaryKey(DBManager dbManager,String id)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        //声明DTO
        LwAmmeterChangeDto lwAmmeterChangeDto = null;
        //查询数据,赋值给DTO
        lwAmmeterChangeDto = dbLwAmmeterChange.findByPrimaryKey(id);
        return lwAmmeterChangeDto;
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
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterChange.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAmmeterChange.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwAmmeterChangeDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAmmeterChange.findByConditions(conditions);
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
        DBLwAmmeterChange dbLwAmmeterChange = new DBLwAmmeterChange(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterChange.getCount(conditions);
        return count;
    }
}
