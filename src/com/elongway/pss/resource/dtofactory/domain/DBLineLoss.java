package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LineLossDto;

/**
 * ����LineLoss-������Ϣ������ݷ��ʶ�����<br>
 * ������ 2008-12-16 16:09:53.562<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLineLoss extends DBLineLossBase{
    private static Logger logger = Logger.getLogger(DBLineLoss.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLineLoss(DBManager dbManager){
        super(dbManager);
    }
}
