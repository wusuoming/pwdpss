package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorBakDto;

/**
 * ����LWFactoryIndicatorBak-��ҵ���ָ���¼���ݱ�����ݷ��ʶ�����<br>
 * ������ 2008-11-27 11:18:23.156<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwFactoryIndicatorBak extends DBLwFactoryIndicatorBakBase{
    private static Logger logger = Logger.getLogger(DBLwFactoryIndicatorBak.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwFactoryIndicatorBak(DBManager dbManager){
        super(dbManager);
    }
}
