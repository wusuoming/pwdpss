package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;

/**
 * ����LwAmmeterBook-����Ϣ������ݷ��ʶ�����<br>
 * ������ 2008-11-03 16:08:54.140<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwAmmeterBook extends DBLwAmmeterBookBase{
    private static Logger logger = Logger.getLogger(DBLwAmmeterBook.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwAmmeterBook(DBManager dbManager){
        super(dbManager);
    }
}
