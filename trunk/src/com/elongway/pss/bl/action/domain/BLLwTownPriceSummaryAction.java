package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummary;

/**
 * 这是LWTownPriceSummary-直供乡电费计算总表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownPriceSummaryAction extends BLLwTownPriceSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryAction.class);

    /**
     * 构造函数
     */
    public BLLwTownPriceSummaryAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownPriceSummaryDto lwTownPriceSummaryDto,String mode)
            throws Exception{
    }
}
