package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;

/**
 * ����LWCoporationUserInfo-��ҵ�û���Ϣ������ݷ��ʶ�����<br>
 * ������ 2008-12-10 10:13:45.000<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwCoporationUserInfo extends DBLwCoporationUserInfoBase{
    private static Logger logger = Logger.getLogger(DBLwCoporationUserInfo.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwCoporationUserInfo(DBManager dbManager){
        super(dbManager);
    }
}
