package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterChange;

/**
 * ����LWAmmeterChange-�������Ϣ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwAmmeterChangeAction extends BLLwAmmeterChangeActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterChangeAction.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterChangeAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwAmmeterChangeDto lwAmmeterChangeDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwAmmeterChangeDto lwAmmeterChangeDto,String mode)
            throws Exception{
    }
}
