package com.elongway.pss.resource.dtofactory.domain;

import java.util.Collection;

import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * ����LWTownIndicatorBak-ֱ������ָ���¼���ݱ�����ݷ��ʶ�����<br>
 * ������ 2008-12-04 02:40:13.796<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownIndicatorBak extends DBLwTownIndicatorBakBase{
    private static Logger logger = Logger.getLogger(DBLwTownIndicatorBak.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwTownIndicatorBak(DBManager dbManager){
        super(dbManager);
    }
   
}
