package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleProrate;

/**
 * ����LWWholeSaleProrate-���۱�����̯���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSaleProrateAction extends BLLwWholeSaleProrateActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleProrateAction.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleProrateAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSaleProrateDto lwWholeSaleProrateDto,String mode)
            throws Exception{
    }
}
