package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterIndicatorDto;

/**
 * ����LWAmmeterIndicator-�����¼������ݷ��ʶ�����<br>
 * ������ 2008-10-26 10:31:59.718<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwAmmeterIndicator extends DBLwAmmeterIndicatorBase{
    private static Logger logger = Logger.getLogger(DBLwAmmeterIndicator.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwAmmeterIndicator(DBManager dbManager){
        super(dbManager);
    }
}
