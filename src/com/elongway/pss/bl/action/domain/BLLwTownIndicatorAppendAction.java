package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorAppend;

/**
 * ����LWTownIndicatorAppend-ֱ����׷�ӵ��ָ���¼���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownIndicatorAppendAction extends BLLwTownIndicatorAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorAppendAction.class);

    /**
     * ���캯��
     */
    public BLLwTownIndicatorAppendAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownIndicatorAppendDto lwTownIndicatorAppendDto,String mode)
            throws Exception{
    }
}
