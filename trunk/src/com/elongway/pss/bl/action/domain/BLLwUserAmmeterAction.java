package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwUserAmmeter;

/**
 * 这是LWUserAmmeter-用户电表对照表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwUserAmmeterAction extends BLLwUserAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwUserAmmeterAction.class);

    /**
     * 构造函数
     */
    public BLLwUserAmmeterAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwUserAmmeterDto lwUserAmmeterDto,String mode)
            throws Exception{
    }
}
