package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummaryAppend;

/**
 * ����LWTownPriceSummaryAppend-ֱ����׷�ӵ�Ѽ����ܱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownPriceSummaryAppendAction extends BLLwTownPriceSummaryAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryAppendAction.class);

    /**
     * ���캯��
     */
    public BLLwTownPriceSummaryAppendAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownPriceSummaryAppendDto lwTownPriceSummaryAppendDto,String mode)
            throws Exception{
    }
}
