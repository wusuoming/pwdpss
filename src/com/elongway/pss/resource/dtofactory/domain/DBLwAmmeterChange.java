package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;

/**
 * ����LWAmmeterChange-���������Ϣ�����ݷ��ʶ�����<br>
 * ������ 2008-12-02 15:29:14.562<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwAmmeterChange extends DBLwAmmeterChangeBase{
    private static Logger logger = Logger.getLogger(DBLwAmmeterChange.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwAmmeterChange(DBManager dbManager){
        super(dbManager);
    }
}