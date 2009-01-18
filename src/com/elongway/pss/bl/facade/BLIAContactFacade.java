package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.bl.action.domain.BLIAContactAction;
import com.elongway.pss.dto.domain.IAContactDto;

/**
 * 这是IAContact的业务对象Facade类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIAContactFacade extends BLIAContactFacadeBase{
    private static Logger logger = Logger.getLogger(BLIAContactFacade.class);

    /**
     * 构造函数
     */
    public BLIAContactFacade(){
        super();
    }
    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void updateStatus(IAContactDto iAContactDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //更新记录
            blIAContactAction.updateStatus(dbManager,iAContactDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }
}
