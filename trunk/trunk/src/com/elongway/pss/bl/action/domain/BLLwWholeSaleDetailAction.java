package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleDetail;

/**
 * 这是LWWholeSaleDetail-趸售费用明细表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSaleDetailAction extends BLLwWholeSaleDetailActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleDetailAction.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleDetailAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSaleDetailDto lwWholeSaleDetailDto,String mode)
            throws Exception{
    }
}
