package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerUserDto;

/**
 * ����LWPowerUser-�õ��û���Ϣ������ݷ��ʶ�����<br>
 * ������ 2008-11-12 22:53:31.968<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwPowerUser extends DBLwPowerUserBase{
    private static Logger logger = Logger.getLogger(DBLwPowerUser.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwPowerUser(DBManager dbManager){
        super(dbManager);
    }
}
