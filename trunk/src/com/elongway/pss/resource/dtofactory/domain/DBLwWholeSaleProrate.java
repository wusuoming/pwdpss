package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;

/**
 * ����LWWholeSaleProrate-���۱�����̯������ݷ��ʶ�����<br>
 * ������ 2008-11-27 22:45:35.764<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleProrate extends DBLwWholeSaleProrateBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleProrate.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSaleProrate(DBManager dbManager){
        super(dbManager);
    }
}
