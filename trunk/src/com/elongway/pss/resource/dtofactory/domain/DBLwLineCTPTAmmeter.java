package com.elongway.pss.resource.dtofactory.domain;

import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ������·������ѹ����������ϵ������ݷ��ʶ�����<br>
 * ������ 2008-10-24 13:56:15.468<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwLineCTPTAmmeter extends DBLwLineCTPTAmmeterBase{
    private static Logger logger = Logger.getLogger(DBLwLineCTPTAmmeter.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwLineCTPTAmmeter(DBManager dbManager){
        super(dbManager);
    }
}
