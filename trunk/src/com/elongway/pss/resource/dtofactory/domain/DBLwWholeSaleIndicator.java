package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;

/**
 * ����LWWholeSaleIndicator-���۵��ָ���¼������ݷ��ʶ�����<br>
 * ������ 2008-12-24 01:17:36.328<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleIndicator extends DBLwWholeSaleIndicatorBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleIndicator.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSaleIndicator(DBManager dbManager){
        super(dbManager);
    }
}
