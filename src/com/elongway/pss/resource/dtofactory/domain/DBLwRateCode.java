package com.elongway.pss.resource.dtofactory.domain;


import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwRateCodeDto;

/**
 * ����LWRateCode-������ά��������ݷ��ʶ�����<br>
 * ������ 2008-10-10 11:15:25.765<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwRateCode extends DBLwRateCodeBase{
    private static Logger logger = Logger.getLogger(DBLwRateCode.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwRateCode(DBManager dbManager){
        super(dbManager);
    }
}
