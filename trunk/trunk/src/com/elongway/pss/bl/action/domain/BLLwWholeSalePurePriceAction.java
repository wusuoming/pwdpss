package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSalePurePrice;

/**
 * 这是LWWholeSalePurePrice-趸售纯电价表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSalePurePriceAction extends BLLwWholeSalePurePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePurePriceAction.class);

    /**
     * 构造函数
     */
    public BLLwWholeSalePurePriceAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSalePurePriceDto lwWholeSalePurePriceDto,String mode)
            throws Exception{
    }
}
