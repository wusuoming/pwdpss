package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwLineAmmeter;

/**
 * 这是LWLineAmmeter-线路电表对照表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwLineAmmeterAction extends BLLwLineAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineAmmeterAction.class);

    /**
     * 构造函数
     */
    public BLLwLineAmmeterAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwLineAmmeterDto lwLineAmmeterDto,String mode)
            throws Exception{
    }
}
