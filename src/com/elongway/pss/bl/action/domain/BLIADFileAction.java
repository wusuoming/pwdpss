package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADFileDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADFile;

/**
 * ����IADFile��ҵ�������չ��<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADFileAction extends BLIADFileActionBase{
    private static Logger logger = Logger.getLogger(BLIADFileAction.class);

    /**
     * ���캯��
     */
    public BLIADFileAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param iADFileDto iADFileDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,IADFileDto iADFileDto,String mode)
            throws Exception{
    }
}
