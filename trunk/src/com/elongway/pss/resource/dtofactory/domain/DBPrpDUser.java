package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDUserDto;

/**
 * ����LWDUser-����Ա���������ݷ��ʶ�����<br>
 * ������ 2008-10-07 11:17:05.187<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBPrpDUser extends DBPrpDUserBase{
    private static Logger logger = Logger.getLogger(DBPrpDUser.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBPrpDUser(DBManager dbManager){
        super(dbManager);
    }
}
