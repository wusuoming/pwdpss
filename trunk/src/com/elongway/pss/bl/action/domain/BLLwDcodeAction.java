package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwDcode;

/**
 * 这是LwDcode-基础代码表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwDcodeAction extends BLLwDcodeActionBase{
    private static Logger logger = Logger.getLogger(BLLwDcodeAction.class);

    /**
     * 构造函数
     */
    public BLLwDcodeAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwDcodeDto lwDcodeDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwDcodeDto lwDcodeDto,String mode)
            throws Exception{
    }
}
