package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryAppendDto;

/**
 * ����LWTownPriceSummaryAppend-ֱ����׷�ӵ�Ѽ����ܱ�����ݷ��ʶ�����<br>
 * ������ 2008-12-17 11:27:44.218<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownPriceSummaryAppend extends DBLwTownPriceSummaryAppendBase{
    private static Logger logger = Logger.getLogger(DBLwTownPriceSummaryAppend.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwTownPriceSummaryAppend(DBManager dbManager){
        super(dbManager);
    }
}
