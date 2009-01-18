package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBPrpDUser;

/**
 * 这是LWDUser-操作员代码表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLPrpDUserAction extends BLPrpDUserActionBase{
    private static Logger logger = Logger.getLogger(BLPrpDUserAction.class);

    /**
     * 构造函数
     */
    public BLPrpDUserAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param prpDUserDto prpDUserDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,PrpDUserDto prpDUserDto,String mode)
            throws Exception{
    }
}
