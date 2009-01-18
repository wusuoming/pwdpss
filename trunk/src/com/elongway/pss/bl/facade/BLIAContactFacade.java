package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.bl.action.domain.BLIAContactAction;
import com.elongway.pss.dto.domain.IAContactDto;

/**
 * ����IAContact��ҵ�����Facade��<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIAContactFacade extends BLIAContactFacadeBase{
    private static Logger logger = Logger.getLogger(BLIAContactFacade.class);

    /**
     * ���캯��
     */
    public BLIAContactFacade(){
        super();
    }
    /**
     * ����������һ������(���������޷����)
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
            //���¼�¼
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
