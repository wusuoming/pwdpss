package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleSummary;

/**
 * ����LWWholeSaleSummary-���۵�Ѽ����ܱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSaleSummaryAction extends BLLwWholeSaleSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleSummaryAction.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleSummaryAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSaleSummaryDto lwWholeSaleSummaryDto,String mode)
            throws Exception{
    }
}
