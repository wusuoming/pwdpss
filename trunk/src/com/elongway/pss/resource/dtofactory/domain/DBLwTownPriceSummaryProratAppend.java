package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;

/**
 * ����LWTownPriceSummaryProrateAppend-ֱ����׷�ӵ�Ѽ����ܱ�����ݷ��ʶ�����<br>
 * ������ 2009-03-09 11:59:11.921<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownPriceSummaryProratAppend extends DBLwTownPriceSummaryProratAppendBase{
    private static Logger logger = Logger.getLogger(DBLwTownPriceSummaryProratAppend.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwTownPriceSummaryProratAppend(DBManager dbManager){
        super(dbManager);
    }
}
