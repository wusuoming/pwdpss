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
 * ����LwBookUser-���û����ձ��ҵ�����Facade��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwBookUserFacade extends BLLwBookUserFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwBookUserFacade.class);

    /**
     * ���캯��
     */
    public BLLwBookUserFacade(){
        super();
    }
    /**
     * �������в���
     * @param collection ��������Ϣ����
     * @throws Exception
     */
    public void insertAll(Collection collection)throws Exception{
    	 DBManager dbManager = new DBManager();
         DBLwBookUser dbLwBookUser = new DBLwBookUser(dbManager);
         try{
             dbManager.open("pssDataSource");
             dbManager.beginTransaction();
             //�����¼
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
