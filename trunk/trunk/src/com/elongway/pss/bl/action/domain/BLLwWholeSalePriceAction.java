package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSalePrice;

/**
 * ����LWWholeSalePrice-���ۼ۸���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSalePriceAction extends BLLwWholeSalePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePriceAction.class);

    /**
     * ���캯��
     */
    public BLLwWholeSalePriceAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSalePriceDto lwWholeSalePriceDto,String mode)
            throws Exception{
    }
}
