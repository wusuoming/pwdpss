package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;

/**
 * ����LWPowerFeeFaxing-��ѵ������б�����ݷ��ʶ�����<br>
 * ������ 2009-03-17 11:31:56.406<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwPowerFeeFaxing extends DBLwPowerFeeFaxingBase{
    private static Logger logger = Logger.getLogger(DBLwPowerFeeFaxing.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwPowerFeeFaxing(DBManager dbManager){
        super(dbManager);
    }
}
