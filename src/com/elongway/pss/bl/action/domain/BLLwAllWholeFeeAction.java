package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAllWholeFee;

/**
 * ����LwAllWholeFee-�����ܷ��ñ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwAllWholeFeeAction extends BLLwAllWholeFeeActionBase{
    private static Logger logger = Logger.getLogger(BLLwAllWholeFeeAction.class);

    /**
     * ���캯��
     */
    public BLLwAllWholeFeeAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwAllWholeFeeDto lwAllWholeFeeDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwAllWholeFeeDto lwAllWholeFeeDto,String mode)
            throws Exception{
    }
}
