package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerUser;

/**
 * ����LWPowerUser-�õ��û���Ϣ���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwPowerUserAction extends BLLwPowerUserActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerUserAction.class);

    /**
     * ���캯��
     */
    public BLLwPowerUserAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwPowerUserDto lwPowerUserDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwPowerUserDto lwPowerUserDto,String mode)
            throws Exception{
    }
}
