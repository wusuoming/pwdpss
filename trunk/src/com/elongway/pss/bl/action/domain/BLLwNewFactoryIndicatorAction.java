package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;

import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwFactoryIndicator;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicator;

/**
 * ����LWNewFactoryIndicator-��ҵ�µ��ָ���¼���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwNewFactoryIndicatorAction extends BLLwNewFactoryIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorAction.class);

    /**
     * ���캯��
     */
    public BLLwNewFactoryIndicatorAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto,String mode)
            throws Exception{
    }
    public void insertAll(DBManager dbManager,Collection<LwNewFactoryIndicatorDto> collection)throws Exception{
    	DBLwNewFactoryIndicator dbLwFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
    	dbLwFactoryIndicator.insertAll(collection);
    }
    public void deleteByConditions(DBManager dbManager,String conditions)
    throws Exception{
DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
//������ɾ����¼
dbLwNewFactoryIndicator.deleteByConditions(conditions);
}
}
