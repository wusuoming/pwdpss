package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownGouDianFaxingDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownGouDianFaxing;

/**
 * ����LWTownGouDianFaxing-ֱ���繺����㵥��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownGouDianFaxingAction extends BLLwTownGouDianFaxingActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownGouDianFaxingAction.class);

    /**
     * ���캯��
     */
    public BLLwTownGouDianFaxingAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownGouDianFaxingDto lwTownGouDianFaxingDto,String mode)
            throws Exception{
    }
}
