package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;

/**
 * ����LWWholeSalePurePrice-���۴���۱�����ݷ��ʶ�����<br>
 * ������ 2007-12-01 20:46:33.750<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSalePurePrice extends DBLwWholeSalePurePriceBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSalePurePrice.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSalePurePrice(DBManager dbManager){
        super(dbManager);
    }
}
