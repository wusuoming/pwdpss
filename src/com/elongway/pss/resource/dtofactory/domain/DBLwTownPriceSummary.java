package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;

/**
 * ����LWTownPriceSummary-ֱ�����Ѽ����ܱ�����ݷ��ʶ�����<br>
 * ������ 2008-10-07 11:16:16.640<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownPriceSummary extends DBLwTownPriceSummaryBase{
    private static Logger logger = Logger.getLogger(DBLwTownPriceSummary.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwTownPriceSummary(DBManager dbManager){
        super(dbManager);
    }
}
