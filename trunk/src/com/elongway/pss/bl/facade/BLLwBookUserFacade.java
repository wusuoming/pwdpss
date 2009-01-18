package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.bl.action.domain.BLLwBookUserAction;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwBookUser;

/**
 * 这是LwBookUser-表本用户对照表的业务对象Facade类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwBookUserFacade extends BLLwBookUserFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwBookUserFacade.class);

    /**
     * 构造函数
     */
    public BLLwBookUserFacade(){
        super();
    }
    /**
     * 批量进行插入
     * @param collection 表本配置信息集合
     * @throws Exception
     */
    public void insertAll(Collection collection)throws Exception{
    	 DBManager dbManager = new DBManager();
         DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
         try{
             dbManager.open("pssDataSource");
             dbManager.beginTransaction();
             //插入记录
             dbLwBookUser.insertAll(collection);
             dbManager.commitTransaction();
         }catch(Exception exception){
             dbManager.rollbackTransaction();
             throw exception;
         }finally{
             dbManager.close();
         }
    }
}
