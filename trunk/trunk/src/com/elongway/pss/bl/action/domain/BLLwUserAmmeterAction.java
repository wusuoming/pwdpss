package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwUserAmmeter;

/**
 * ����LWUserAmmeter-�û������ձ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwUserAmmeterAction extends BLLwUserAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwUserAmmeterAction.class);

    /**
     * ���캯��
     */
    public BLLwUserAmmeterAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwUserAmmeterDto lwUserAmmeterDto,String mode)
            throws Exception{
    }
}
