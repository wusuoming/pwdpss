package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;

/**
 * ����LWTownIndicator-ֱ������ָ���¼������ݷ��ʶ�����<br>
 * ������ 2008-12-04 02:40:12.921<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownIndicator extends DBLwTownIndicatorBase{
    private static Logger logger = Logger.getLogger(DBLwTownIndicator.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwTownIndicator(DBManager dbManager){
        super(dbManager);
    }
}
