package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleIndicatorBak;

/**
 * ����LWWholeSaleIndicatorBak-���۵��ָ���¼���ݱ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSaleIndicatorBakAction extends BLLwWholeSaleIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleIndicatorBakAction.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleIndicatorBakAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSaleIndicatorBakDto lwWholeSaleIndicatorBakDto,String mode)
            throws Exception{
    }
    public void insertAll(DBManager dbManager,Collection collection) throws Exception{
      	DBLwWholeSaleIndicatorBak dbLwWholeSaleIndicatorBak = new DBLwWholeSaleIndicatorBak(dbManager);
        //�����¼
      	dbLwWholeSaleIndicatorBak.insertAll(collection);
    }

}
