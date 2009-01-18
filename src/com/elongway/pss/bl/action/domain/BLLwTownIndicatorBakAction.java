package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorBak;

/**
 * ����LWTownIndicatorBak-ֱ������ָ���¼���ݱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownIndicatorBakAction extends BLLwTownIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorBakAction.class);

    /**
     * ���캯��
     */
    public BLLwTownIndicatorBakAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownIndicatorBakDto lwTownIndicatorBakDto,String mode)
            throws Exception{
    }
    public void insertAll(DBManager dbManager,Collection collection) throws Exception{
      	DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //�����¼
        dbLwTownIndicatorBak.insertAll(collection);
    }
}
