package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.SubjoinFeeDto;
import com.elongway.pss.resource.dtofactory.domain.DBSubjoinFee;

/**
 * ����subjoinFee-���ӷ��ñ���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLSubjoinFeeAction extends BLSubjoinFeeActionBase{
    private static Logger logger = Logger.getLogger(BLSubjoinFeeAction.class);

    /**
     * ���캯��
     */
    public BLSubjoinFeeAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param subjoinFeeDto subjoinFeeDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,SubjoinFeeDto subjoinFeeDto,String mode)
            throws Exception{
    }
}