package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwUserLine;

/**
 * ����LWUserLine-�û���·���ձ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwUserLineAction extends BLLwUserLineActionBase{
    private static Logger logger = Logger.getLogger(BLLwUserLineAction.class);

    /**
     * ���캯��
     */
    public BLLwUserLineAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwUserLineDto lwUserLineDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwUserLineDto lwUserLineDto,String mode)
            throws Exception{
    }
}
