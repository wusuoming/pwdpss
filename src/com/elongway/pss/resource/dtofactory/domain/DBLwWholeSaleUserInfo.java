package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;

/**
 * ����LWWholeSaleUserInfo-�����û���Ϣ������ݷ��ʶ�����<br>
 * ������ 2008-12-06 11:44:08.687<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleUserInfo extends DBLwWholeSaleUserInfoBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleUserInfo.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSaleUserInfo(DBManager dbManager){
        super(dbManager);
    }
}
