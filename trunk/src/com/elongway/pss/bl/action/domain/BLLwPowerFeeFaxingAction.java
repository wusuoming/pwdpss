package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerFeeFaxing;

/**
 * ����LWPowerFeeFaxing-��ѵ������б��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwPowerFeeFaxingAction extends BLLwPowerFeeFaxingActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerFeeFaxingAction.class);

    /**
     * ���캯��
     */
    public BLLwPowerFeeFaxingAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwPowerFeeFaxingDto lwPowerFeeFaxingDto,String mode)
            throws Exception{
    }
    
    /**
     * �����������
     * @param dbManager DB������
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void insertAll(DBManager dbManager,Collection<LwPowerFeeFaxingDto>collection)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //�����¼
        dbLwPowerFeeFaxing.insertAll(collection);
    }
}
