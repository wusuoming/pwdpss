package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownProrateAppend;

/**
 * ����LWTownProrateAppend-������̯׷�ӱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownProrateAppendAction extends BLLwTownProrateAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownProrateAppendAction.class);

    /**
     * ���캯��
     */
    public BLLwTownProrateAppendAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownProrateAppendDto lwTownProrateAppendDto,String mode)
            throws Exception{
    }
}
