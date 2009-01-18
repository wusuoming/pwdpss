package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import java.util.Date;

import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeter;

/**
 * 这是LWAmmeter-电表信息表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwAmmeterAction extends BLLwAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterAction.class);

    /**
     * 构造函数
     */
    public BLLwAmmeterAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwAmmeterDto lwAmmeterDto
     * @param mode 模式
     * @throws Exception
     */
   
    public void convertDto(DBManager dbManager,LwAmmeterDto lwAmmeterDto,String mode)
            throws Exception{
    }
 
}
