package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummaryProratAppend;

/**
 * ����LWTownPriceSummaryProrateAppend-ֱ����׷�ӵ�Ѽ����ܱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownPriceSummaryProratAppendAction extends BLLwTownPriceSummaryProratAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryProratAppendAction.class);

    /**
     * ���캯��
     */
    public BLLwTownPriceSummaryProratAppendAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto,String mode)
            throws Exception{
    }
}
