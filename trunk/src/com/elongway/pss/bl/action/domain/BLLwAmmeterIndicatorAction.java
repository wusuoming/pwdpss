package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterIndicator;

/**
 * 这是LWAmmeterIndicator-换表记录表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwAmmeterIndicatorAction extends BLLwAmmeterIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterIndicatorAction.class);

    /**
     * 构造函数
     */
    public BLLwAmmeterIndicatorAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwAmmeterIndicatorDto lwAmmeterIndicatorDto,String mode)
            throws Exception{
    }
}
