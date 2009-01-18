package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;

import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADsysConfig;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * 这是IADsysConfig的业务对象扩展类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADsysConfigAction extends BLIADsysConfigActionBase{
    private static Logger logger = Logger.getLogger(BLIADsysConfigAction.class);

    /**
     * 构造函数
     */
    public BLIADsysConfigAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param iADsysConfigDto iADsysConfigDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,IADsysConfigDto iADsysConfigDto,String mode)
            throws Exception{
    }
}
