package com.elongway.pss.bl.facade;

import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwTownIndicatorAction;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicator;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * ����LWTownIndicator-ֱ������ָ���¼���ҵ�����Facade��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownIndicatorFacade extends BLLwTownIndicatorFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorFacade.class);

    /**
     * ���캯��
     */
    public BLLwTownIndicatorFacade(){
        super();
    }
    public void insertAll(Collection collection)throws Exception{
    	/**
         * �����������
         * @param lwTownIndicatorDto lwTownIndicatorDto
         * @throws Exception
         */
            
            DBManager dbManager = new DBManager();
            DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);
            try{
                dbManager.open("pssDataSource");
                dbManager.beginTransaction();
                //�����¼
                dbLwTownIndicator.insertAll(collection);
                dbManager.commitTransaction();
            }catch(Exception exception){
                dbManager.rollbackTransaction();
                throw exception;
            }finally{
                dbManager.close();
            }
        
    }
}
