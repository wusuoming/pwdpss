package com.elongway.pss.bl.action.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.dto.domain.LwLineCTDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwLineCT;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.common.util.SqlUtils;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ★★★★★警告：本文件不允许手工修改！！！请使用JToolpad生成！<br>
 * 这是线路电流互感器对照表的业务逻辑对象类<br>
 */
public class BLLwLineCTActionBase{
	 private static Logger logger = Logger.getLogger(BLLwLineCTActionBase.class);

	    /**
	     * 构造函数
	     */
	    public BLLwLineCTActionBase(){
	    }

	    /**
	     * 插入一条数据
	     * @param dbManager DB管理器
	     * @param lwLineCTDto lwLineCTDto
	     * @throws Exception
	     */
	    public void insert(DBManager dbManager,LwLineCTDto lwLineCTDto)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //插入记录
	        dbLwLineCT.insert(lwLineCTDto);
	    }

	    /**
	     * 按主键删除一条数据
	     * @param dbManager DB管理器
	     * @param lineCode 线路代码
	     * @param ctModus 电流互感器型式
	     * @throws Exception
	     */
	    public void delete(DBManager dbManager,String lineCode,String ctModus)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //删除记录
	        dbLwLineCT.delete(lineCode, ctModus);
	    }

	    /**
	     * 按条件删除数据
	     * @param dbManager DB管理器
	     * @param conditions 删除条件
	     * @throws Exception
	     */
	    public void deleteByConditions(DBManager dbManager,String conditions)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //按条件删除记录
	        dbLwLineCT.deleteByConditions(conditions);
	    }

	    /**
	     * 按主键更新一条数据(主键本身无法变更)
	     * @param dbManager DB管理器
	     * @param lwLineCTDto lwLineCTDto
	     * @throws Exception
	     */
	    public void update(DBManager dbManager,LwLineCTDto lwLineCTDto)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //更新记录
	        dbLwLineCT.update(lwLineCTDto);
	    }

	    /**
	     * 按主键查找一条数据
	     * @param dbManager DB管理器
	     * @param lineCode 线路代码
	     * @param ctModus 电流互感器型式
	     * @return lwLineCTDto lwLineCTDto
	     * @throws Exception
	     */
	    public LwLineCTDto findByPrimaryKey(DBManager dbManager,String lineCode,String ctModus)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        //声明DTO
	        LwLineCTDto lwLineCTDto = null;
	        //查询数据,赋值给DTO
	        lwLineCTDto = dbLwLineCT.findByPrimaryKey(lineCode, ctModus);
	        return lwLineCTDto;
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
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        Collection collection = new ArrayList();

	        if(conditions.trim().length()==0){
	            conditions = "1=1";
	        }

	        int count = dbLwLineCT.getCount(SqlUtils.getWherePartForGetCount(conditions));
	        collection = dbLwLineCT.findByConditions(conditions,pageNo,rowsPerPage);
	        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
	        return pageRecord;
	    }

	    /**
	     * 按条件查询多条数据
	     * @param dbManager DB管理器
	     * @param conditions 查询条件
	     * @return Collection 包含lwLineCTDto的集合
	     * @throws Exception
	     */
	    public Collection findByConditions(DBManager dbManager,String conditions)
	            throws Exception{
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);
	        Collection collection = new ArrayList();

	        if(conditions.trim().length()==0){
	            conditions = "1=1";
	        }

	        collection = dbLwLineCT.findByConditions(conditions);
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
	        DBLwLineCT dbLwLineCT = new DBLwLineCT(dbManager);

	        if(conditions.trim().length()==0){
	            conditions = "1=1";
	        }

	        int count = dbLwLineCT.getCount(conditions);
	        return count;
	    }
}
