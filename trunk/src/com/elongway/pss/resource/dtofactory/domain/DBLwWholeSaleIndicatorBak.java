package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorBakDto;

/**
 * ����LWWholeSaleIndicatorBak-���۵��ָ���¼���ݱ�����ݷ��ʶ�����<br>
 * ������ 2008-12-24 01:17:53.484<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleIndicatorBak extends DBLwWholeSaleIndicatorBakBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleIndicatorBak.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSaleIndicatorBak(DBManager dbManager){
        super(dbManager);
    }
}
