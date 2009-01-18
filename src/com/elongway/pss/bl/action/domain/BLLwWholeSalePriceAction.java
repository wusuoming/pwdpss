package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSalePrice;

/**
 * 这是LWWholeSalePrice-趸售价格表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSalePriceAction extends BLLwWholeSalePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePriceAction.class);

    /**
     * 构造函数
     */
    public BLLwWholeSalePriceAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSalePriceDto lwWholeSalePriceDto,String mode)
            throws Exception{
    }
}
