package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;

import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * ����IADsysConfig�����ݷ��ʶ�����<br>
 * ������ 2006-08-10 01:35:07.873<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADsysConfig extends DBIADsysConfigBase{
    private static Logger logger = Logger.getLogger(DBIADsysConfig.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBIADsysConfig(DBManager dbManager){
        super(dbManager);
    }
}
