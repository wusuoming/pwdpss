package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;

/**
 * ����LwAllWholeFee-�����ܷ��ñ�����ݷ��ʶ�����<br>
 * ������ 2009-01-03 00:49:34.343<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwAllWholeFee extends DBLwAllWholeFeeBase{
    private static Logger logger = Logger.getLogger(DBLwAllWholeFee.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwAllWholeFee(DBManager dbManager){
        super(dbManager);
    }
}
