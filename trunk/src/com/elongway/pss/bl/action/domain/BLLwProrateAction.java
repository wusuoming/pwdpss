package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwProrate;

/**
 * ����LWProrate-������̯���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwProrateAction extends BLLwProrateActionBase{
    private static Logger logger = Logger.getLogger(BLLwProrateAction.class);

    /**
     * ���캯��
     */
    public BLLwProrateAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwProrateDto lwProrateDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwProrateDto lwProrateDto,String mode)
            throws Exception{
    }
}
