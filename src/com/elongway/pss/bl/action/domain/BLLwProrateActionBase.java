package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwProrate;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LWProrate-比例分摊表的业务逻辑对象类<br>
 */
public class BLLwProrateActionBase{
  private static Logger logger = Logger.getLogger(BLLwProrateActionBase.class);

    /**
     * 构造函数
     */
    public BLLwProrateActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwProrateDto lwProrateDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwProrateDto lwProrateDto)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //插入记录
        dbLwProrate.insert(lwProrateDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String userNo)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //删除记录
        dbLwProrate.delete(userNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //按条件删除记录
        dbLwProrate.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwProrateDto lwProrateDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwProrateDto lwProrateDto)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //更新记录
        dbLwProrate.update(lwProrateDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param userNo 户号
     * @return lwProrateDto lwProrateDto
     * @throws Exception
     */
    public LwProrateDto findByPrimaryKey(DBManager dbManager,String userNo)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        //声明DTO
        LwProrateDto lwProrateDto = null;
        //查询数据,赋值给DTO
        lwProrateDto = dbLwProrate.findByPrimaryKey(userNo);
        return lwProrateDto;
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
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwProrate.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwProrate.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwProrateDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwProrate.findByConditions(conditions);
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
        DBLwProrate dbLwProrate = new DBLwProrate(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwProrate.getCount(conditions);
        return count;
    }

}
