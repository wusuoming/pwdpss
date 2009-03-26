package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.bl.action.domain.BLLwPowerFeeFaxingAction;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;

/**
 * ����LWPowerFeeFaxing-��ѵ������б��ҵ�����Facade��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwPowerFeeFaxingFacade extends BLLwPowerFeeFaxingFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwPowerFeeFaxingFacade.class);

    /**
     * ���캯��
     */
    public BLLwPowerFeeFaxingFacade(){
        super();
    }
    
    /**
     * �����������
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
            //�����¼
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
