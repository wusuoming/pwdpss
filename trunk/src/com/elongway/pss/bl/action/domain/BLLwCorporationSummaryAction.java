package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwCorporationSummary;

/**
 * ����LWCorporationSummary-��ҵ���ۼ����ܱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwCorporationSummaryAction extends BLLwCorporationSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwCorporationSummaryAction.class);

    /**
     * ���캯��
     */
    public BLLwCorporationSummaryAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwCorporationSummaryDto lwCorporationSummaryDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwCorporationSummaryDto lwCorporationSummaryDto,String mode)
            throws Exception{
    }
}
