package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.bl.action.domain.BLLwPowerFeeFaxingAction;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;

/**
 * 这是LWPowerFeeFaxing-电费电量发行表的业务对象Facade类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwPowerFeeFaxingFacade extends BLLwPowerFeeFaxingFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwPowerFeeFaxingFacade.class);

    /**
     * 构造函数
     */
    public BLLwPowerFeeFaxingFacade(){
        super();
    }
    
    /**
     * 插入多条数据
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void insertAll(Collection<LwPowerFeeFaxingDto>collection)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerFeeFaxingAction blLwPowerFeeFaxingAction = new BLLwPowerFeeFaxingAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //插入记录
            blLwPowerFeeFaxingAction.insertAll(dbManager, collection);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }
}
