package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.TransforDto;
import com.elongway.pss.resource.dtofactory.domain.DBTransfor;

/**
 * ����Transfor-��ѹ����Ϣ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLTransforAction extends BLTransforActionBase{
    private static Logger logger = Logger.getLogger(BLTransforAction.class);

    /**
     * ���캯��
     */
    public BLTransforAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param transforDto transforDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,TransforDto transforDto,String mode)
            throws Exception{
    }
}
