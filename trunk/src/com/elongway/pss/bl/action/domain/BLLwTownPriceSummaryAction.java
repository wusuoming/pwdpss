package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummary;

/**
 * ����LWTownPriceSummary-ֱ�����Ѽ����ܱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownPriceSummaryAction extends BLLwTownPriceSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryAction.class);

    /**
     * ���캯��
     */
    public BLLwTownPriceSummaryAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownPriceSummaryDto lwTownPriceSummaryDto,String mode)
            throws Exception{
    }
}
