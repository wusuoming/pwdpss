package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPriceSummaryDto;

/**
 * ����LWPriceSummary-��Ѽ����ܱ�����ݷ��ʶ�����<br>
 * ������ 2008-10-07 11:15:02.656<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwPriceSummary extends DBLwPriceSummaryBase{
    private static Logger logger = Logger.getLogger(DBLwPriceSummary.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwPriceSummary(DBManager dbManager){
        super(dbManager);
    }
}
