package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDcompanyDto;
import com.elongway.pss.resource.dtofactory.domain.DBPrpDcompany;

/**
 * ����LWDcompany-����������ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLPrpDcompanyAction extends BLPrpDcompanyActionBase{
    private static Logger logger = Logger.getLogger(BLPrpDcompanyAction.class);

    /**
     * ���캯��
     */
    public BLPrpDcompanyAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param prpDcompanyDto prpDcompanyDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,PrpDcompanyDto prpDcompanyDto,String mode)
            throws Exception{
    }
}
