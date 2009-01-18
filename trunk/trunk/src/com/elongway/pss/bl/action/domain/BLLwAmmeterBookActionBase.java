package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterBook;

/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是LwAmmeterBook-表本信息表的业务逻辑对象类<br>
 */
public class BLLwAmmeterBookActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterBookActionBase.class);

    /**
     * 构造函数
     */
    public BLLwAmmeterBookActionBase(){
    }

    /**
     * 插入一条数据
     * @param dbManager DB管理器
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwAmmeterBookDto lwAmmeterBookDto)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //插入记录
        dbLwAmmeterBook.insert(lwAmmeterBookDto);
    }

    /**
     * 按主键删除一条数据
     * @param dbManager DB管理器
     * @param bookNo 表本号
     * @throws Exception
     */
    public void delete(DBManager dbManager,String bookNo)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //删除记录
        dbLwAmmeterBook.delete(bookNo);
    }

    /**
     * 按条件删除数据
     * @param dbManager DB管理器
     * @param conditions 删除条件
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //按条件删除记录
        dbLwAmmeterBook.deleteByConditions(conditions);
    }

    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwAmmeterBookDto lwAmmeterBookDto)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //更新记录
        dbLwAmmeterBook.update(lwAmmeterBookDto);
    }

    /**
     * 按主键查找一条数据
     * @param dbManager DB管理器
     * @param bookNo 表本号
     * @return lwAmmeterBookDto lwAmmeterBookDto
     * @throws Exception
     */
    public LwAmmeterBookDto findByPrimaryKey(DBManager dbManager,String bookNo)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        //声明DTO
        LwAmmeterBookDto lwAmmeterBookDto = null;
        //查询数据,赋值给DTO
        lwAmmeterBookDto = dbLwAmmeterBook.findByPrimaryKey(bookNo);
        return lwAmmeterBookDto;
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
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterBook.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwAmmeterBook.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * 按条件查询多条数据
     * @param dbManager DB管理器
     * @param conditions 查询条件
     * @return Collection 包含lwAmmeterBookDto的集合
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwAmmeterBook.findByConditions(conditions);
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
        DBLwAmmeterBook dbLwAmmeterBook = new DBLwAmmeterBook(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwAmmeterBook.getCount(conditions);
        return count;
    }
}
