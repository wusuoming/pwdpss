package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicatorBak;

/**
 * ����LWNewFactoryIndicatorBak-��ҵ�µ��ָ�뱸�ݱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwNewFactoryIndicatorBakAction extends BLLwNewFactoryIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorBakAction.class);

    /**
     * ���캯��
     */
    public BLLwNewFactoryIndicatorBakAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto,String mode)
            throws Exception{
    }
}
