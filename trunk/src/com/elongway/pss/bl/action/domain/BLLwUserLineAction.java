package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwUserLine;

/**
 * 这是LWUserLine-用户线路对照表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwUserLineAction extends BLLwUserLineActionBase{
    private static Logger logger = Logger.getLogger(BLLwUserLineAction.class);

    /**
     * 构造函数
     */
    public BLLwUserLineAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwUserLineDto lwUserLineDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwUserLineDto lwUserLineDto,String mode)
            throws Exception{
    }
}
