package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwDcode;

/**
 * ����LwDcode-����������ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwDcodeAction extends BLLwDcodeActionBase{
    private static Logger logger = Logger.getLogger(BLLwDcodeAction.class);

    /**
     * ���캯��
     */
    public BLLwDcodeAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwDcodeDto lwDcodeDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwDcodeDto lwDcodeDto,String mode)
            throws Exception{
    }
}
