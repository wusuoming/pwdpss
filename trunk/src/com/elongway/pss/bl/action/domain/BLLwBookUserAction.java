package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwBookUser;

/**
 * ����LwBookUser-���û����ձ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwBookUserAction extends BLLwBookUserActionBase{
    private static Logger logger = Logger.getLogger(BLLwBookUserAction.class);

    /**
     * ���캯��
     */
    public BLLwBookUserAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwBookUserDto lwBookUserDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwBookUserDto lwBookUserDto,String mode)
            throws Exception{
    }
}
