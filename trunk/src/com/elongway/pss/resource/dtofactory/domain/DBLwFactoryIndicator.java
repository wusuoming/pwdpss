package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;

/**
 * ����LWFactoryIndicator-��ҵ���ָ���¼������ݷ��ʶ�����<br>
 * ������ 2008-11-27 11:18:22.328<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwFactoryIndicator extends DBLwFactoryIndicatorBase{
    private static Logger logger = Logger.getLogger(DBLwFactoryIndicator.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwFactoryIndicator(DBManager dbManager){
        super(dbManager);
    }
}
