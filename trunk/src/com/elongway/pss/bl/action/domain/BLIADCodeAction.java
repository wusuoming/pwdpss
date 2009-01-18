package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADCode;

/**
 * 这是IADCode的业务对象扩展类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADCodeAction extends BLIADCodeActionBase{
    private static Logger logger = Logger.getLogger(BLIADCodeAction.class);

    /**
     * 构造函数
     */
    public BLIADCodeAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param iADCodeDto iADCodeDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,IADCodeDto iADCodeDto,String mode)
            throws Exception{
    }
}
