package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCompanyDto;

/**
 * ����IADCompany�����ݷ��ʶ�����<br>
 * ������ 2006-09-08 15:52:47.318<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADCompany extends DBIADCompanyBase{
    private static Logger logger = Logger.getLogger(DBIADCompany.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBIADCompany(DBManager dbManager){
        super(dbManager);
    }
}
