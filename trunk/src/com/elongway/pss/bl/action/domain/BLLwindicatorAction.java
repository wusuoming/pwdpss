package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwindicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwindicator;

/**
 * ����LWindicator-���ָ���¼���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwindicatorAction extends BLLwindicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwindicatorAction.class);

    /**
     * ���캯��
     */
    public BLLwindicatorAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwindicatorDto lwindicatorDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwindicatorDto lwindicatorDto,String mode)
            throws Exception{
    }
}
