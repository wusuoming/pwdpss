package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBPrpDUser;

/**
 * ����LWDUser-����Ա������ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLPrpDUserAction extends BLPrpDUserActionBase{
    private static Logger logger = Logger.getLogger(BLPrpDUserAction.class);

    /**
     * ���캯��
     */
    public BLPrpDUserAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param prpDUserDto prpDUserDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,PrpDUserDto prpDUserDto,String mode)
            throws Exception{
    }
}
