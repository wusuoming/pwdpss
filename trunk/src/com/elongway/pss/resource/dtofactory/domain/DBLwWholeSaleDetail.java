package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;

/**
 * ����LWWholeSaleDetail-���۷�����ϸ������ݷ��ʶ�����<br>
 * ������ 2009-02-13 09:37:02.453<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleDetail extends DBLwWholeSaleDetailBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleDetail.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSaleDetail(DBManager dbManager){
        super(dbManager);
    }
}
