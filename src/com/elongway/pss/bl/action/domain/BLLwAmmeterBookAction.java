package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterBook;

/**
 * ����LwAmmeterBook-����Ϣ���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwAmmeterBookAction extends BLLwAmmeterBookActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterBookAction.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterBookAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwAmmeterBookDto lwAmmeterBookDto,String mode)
            throws Exception{
    }
}
