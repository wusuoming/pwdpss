package com.elongway.pss.resource.dtofactory.domain;

import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ���ǵ�ѹ�����������ݷ��ʶ�����<br>
 * ������ 2008-10-24 11:59:26.312<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwpt extends DBLwptBase{
    private static Logger logger = Logger.getLogger(DBLwpt.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwpt(DBManager dbManager){
        super(dbManager);
    }
}
