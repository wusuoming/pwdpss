package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPriceSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPriceSummary;

/**
 * ����LWPriceSummary-��Ѽ����ܱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwPriceSummaryAction extends BLLwPriceSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwPriceSummaryAction.class);

    /**
     * ���캯��
     */
    public BLLwPriceSummaryAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwPriceSummaryDto lwPriceSummaryDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwPriceSummaryDto lwPriceSummaryDto,String mode)
            throws Exception{
    }
}
