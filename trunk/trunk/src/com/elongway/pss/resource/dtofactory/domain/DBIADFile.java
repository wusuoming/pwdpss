package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADFileDto;

/**
 * ����IADFile�����ݷ��ʶ�����<br>
 * ������ 2007-11-06 10:57:34.687<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADFile extends DBIADFileBase{
    private static Logger logger = Logger.getLogger(DBIADFile.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBIADFile(DBManager dbManager){
        super(dbManager);
    }
}
