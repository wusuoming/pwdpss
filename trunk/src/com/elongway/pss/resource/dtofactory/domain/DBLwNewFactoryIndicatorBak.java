package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;

/**
 * ����LWNewFactoryIndicatorBak-��ҵ�µ��ָ�뱸�ݱ�����ݷ��ʶ�����<br>
 * ������ 2008-12-12 13:36:42.781<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwNewFactoryIndicatorBak extends DBLwNewFactoryIndicatorBakBase{
    private static Logger logger = Logger.getLogger(DBLwNewFactoryIndicatorBak.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwNewFactoryIndicatorBak(DBManager dbManager){
        super(dbManager);
    }
}
