package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwBookUserDto;

/**
 * ����LwBookUser-���û����ձ�����ݷ��ʶ�����<br>
 * ������ 2008-11-04 15:56:13.030<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwBookUser extends DBLwBookUserBase{
    private static Logger logger = Logger.getLogger(DBLwBookUser.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwBookUser(DBManager dbManager){
        super(dbManager);
    }
}
