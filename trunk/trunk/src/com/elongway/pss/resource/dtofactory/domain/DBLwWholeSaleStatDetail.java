package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleStatDetailDto;

/**
 * ����LWWholeSaleStatDetail-���۰����ͳ�Ƶ����ݷ��ʶ�����<br>
 * ������ 2009-04-08 10:44:48.483<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleStatDetail extends DBLwWholeSaleStatDetailBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleStatDetail.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSaleStatDetail(DBManager dbManager){
        super(dbManager);
    }
}
