package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADCode;

/**
 * ����IADCode��ҵ�������չ��<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADCodeAction extends BLIADCodeActionBase{
    private static Logger logger = Logger.getLogger(BLIADCodeAction.class);

    /**
     * ���캯��
     */
    public BLIADCodeAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param iADCodeDto iADCodeDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,IADCodeDto iADCodeDto,String mode)
            throws Exception{
    }
}
