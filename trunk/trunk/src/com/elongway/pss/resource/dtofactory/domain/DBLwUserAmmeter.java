package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;

/**
 * ����LWUserAmmeter-�û������ձ�����ݷ��ʶ�����<br>
 * ������ 2008-11-07 01:46:05.875<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwUserAmmeter extends DBLwUserAmmeterBase{
    private static Logger logger = Logger.getLogger(DBLwUserAmmeter.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwUserAmmeter(DBManager dbManager){
        super(dbManager);
    }
}
