package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerLine;

/**
 * ����LWPowerLine-��·��Ϣ���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwPowerLineAction extends BLLwPowerLineActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerLineAction.class);

    /**
     * ���캯��
     */
    public BLLwPowerLineAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwPowerLineDto lwPowerLineDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwPowerLineDto lwPowerLineDto,String mode)
            throws Exception{
    }
}
