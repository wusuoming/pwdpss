package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwProrateDto;

/**
 * ����LWProrate-������̯������ݷ��ʶ�����<br>
 * ������ 2008-10-07 11:15:29.718<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwProrate extends DBLwProrateBase{
    private static Logger logger = Logger.getLogger(DBLwProrate.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwProrate(DBManager dbManager){
        super(dbManager);
    }
}
