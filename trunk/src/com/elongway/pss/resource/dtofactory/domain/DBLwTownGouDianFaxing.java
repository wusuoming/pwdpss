package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownGouDianFaxingDto;

/**
 * ����LWTownGouDianFaxing-ֱ���繺����㵥�����ݷ��ʶ�����<br>
 * ������ 2009-02-23 23:29:44.187<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownGouDianFaxing extends DBLwTownGouDianFaxingBase{
    private static Logger logger = Logger.getLogger(DBLwTownGouDianFaxing.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwTownGouDianFaxing(DBManager dbManager){
        super(dbManager);
    }
}
