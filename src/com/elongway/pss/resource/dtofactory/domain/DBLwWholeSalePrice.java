package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;

/**
 * ����LWWholeSalePrice-���ۼ۸������ݷ��ʶ�����<br>
 * ������ 2008-10-07 11:16:43.953<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSalePrice extends DBLwWholeSalePriceBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSalePrice.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwWholeSalePrice(DBManager dbManager){
        super(dbManager);
    }
}
