package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerLineDto;

/**
 * ����LWPowerLine-��·��Ϣ������ݷ��ʶ�����<br>
 * ������ 2008-10-30 14:36:39.609<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwPowerLine extends DBLwPowerLineBase{
    private static Logger logger = Logger.getLogger(DBLwPowerLine.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwPowerLine(DBManager dbManager){
        super(dbManager);
    }
}
