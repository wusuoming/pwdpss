package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwRateCodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwRateCode;

/**
 * ����LWRateCode-������ά�����ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwRateCodeAction extends BLLwRateCodeActionBase{
    private static Logger logger = Logger.getLogger(BLLwRateCodeAction.class);

    /**
     * ���캯��
     */
    public BLLwRateCodeAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwRateCodeDto lwRateCodeDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwRateCodeDto lwRateCodeDto,String mode)
            throws Exception{
    }
}
