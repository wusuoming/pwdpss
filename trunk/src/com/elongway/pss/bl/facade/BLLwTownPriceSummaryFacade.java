package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.bl.action.domain.BLLwTownPriceSummaryAction;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;

/**
 * ����LWTownPriceSummary-ֱ�����Ѽ����ܱ��ҵ�����Facade��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownPriceSummaryFacade extends BLLwTownPriceSummaryFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryFacade.class);

    /**
     * ���캯��
     */
    public BLLwTownPriceSummaryFacade(){
        super();
    }
    /**
     * ��ɾ�������
     * @author qiaoyouliang 2008-10-22
     * @param lwTownPriceSummaryDto
     * @throws Exception
     */
    public void deleteAndInsert(LwTownPriceSummaryDto lwTownPriceSummaryDto)throws Exception{
    	DBManager dbManager = new DBManager();
    	String userNo = lwTownPriceSummaryDto.getUserNo();
    	String statMonth = lwTownPriceSummaryDto.getStatMonth();
        BLLwTownPriceSummaryAction blLwTownPriceSummaryAction = new BLLwTownPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwTownPriceSummaryAction.delete(dbManager,userNo, statMonth);
            blLwTownPriceSummaryAction.insert(dbManager, lwTownPriceSummaryDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }
}
