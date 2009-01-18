package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;

import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorBakDto;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwFactoryIndicatorBak;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicator;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicatorBak;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorBak;

/**
 * ����LWFactoryIndicatorBak-��ҵ���ָ���¼���ݱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwFactoryIndicatorBakAction extends BLLwFactoryIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwFactoryIndicatorBakAction.class);

    /**
     * ���캯��
     */
    public BLLwFactoryIndicatorBakAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto,String mode)
            throws Exception{
    }
    /**
     * ��������
     * @param dbManager
     * @param collection
     * @throws Exception
     */
    public void insertAll(DBManager dbManager,Collection<LwNewFactoryIndicatorBakDto> collection)throws Exception{
    	DBLwNewFactoryIndicatorBak dbLwFactoryIndicatorBak = new DBLwNewFactoryIndicatorBak(dbManager);
    	dbLwFactoryIndicatorBak.insertAll(collection);
    }
}
