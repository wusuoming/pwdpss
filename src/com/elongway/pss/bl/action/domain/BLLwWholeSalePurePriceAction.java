package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSalePurePrice;

/**
 * ����LWWholeSalePurePrice-���۴���۱��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSalePurePriceAction extends BLLwWholeSalePurePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePurePriceAction.class);

    /**
     * ���캯��
     */
    public BLLwWholeSalePurePriceAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSalePurePriceDto lwWholeSalePurePriceDto,String mode)
            throws Exception{
    }
}
