package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwindicatorDto;

/**
 * ����LWindicator-���ָ���¼������ݷ��ʶ�����<br>
 * ������ 2008-10-07 11:14:11.671<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwindicator extends DBLwindicatorBase{
    private static Logger logger = Logger.getLogger(DBLwindicator.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwindicator(DBManager dbManager){
        super(dbManager);
    }
}
