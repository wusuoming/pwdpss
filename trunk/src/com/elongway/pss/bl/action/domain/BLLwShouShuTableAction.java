package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwShouShuTableDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwShouShuTable;

/**
 * ����LwShouShuTable-������ñ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwShouShuTableAction extends BLLwShouShuTableActionBase{
    private static Logger logger = Logger.getLogger(BLLwShouShuTableAction.class);

    /**
     * ���캯��
     */
    public BLLwShouShuTableAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwShouShuTableDto lwShouShuTableDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwShouShuTableDto lwShouShuTableDto,String mode)
            throws Exception{
    }
}
