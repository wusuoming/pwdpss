package com.elongway.pss.resource.dtofactory.domain;

import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ���ǵ��������������ݷ��ʶ�����<br>
 * ������ 2008-10-24 11:59:02.828<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwct extends DBLwctBase{
    private static Logger logger = Logger.getLogger(DBLwct.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwct(DBManager dbManager){
        super(dbManager);
    }
}
