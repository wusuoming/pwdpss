package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwLineAmmeter;

/**
 * ����LWLineAmmeter-��·�����ձ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwLineAmmeterAction extends BLLwLineAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineAmmeterAction.class);

    /**
     * ���캯��
     */
    public BLLwLineAmmeterAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwLineAmmeterDto lwLineAmmeterDto,String mode)
            throws Exception{
    }
}
