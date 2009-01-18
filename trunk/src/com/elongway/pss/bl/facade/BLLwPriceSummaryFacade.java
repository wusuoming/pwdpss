package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPriceSummaryDto;

/**
 * 这是LWPriceSummary-电费计算总表的业务对象Facade类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwPriceSummaryFacade extends BLLwPriceSummaryFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwPriceSummaryFacade.class);

    /**
     * 构造函数
     */
    public BLLwPriceSummaryFacade(){
        super();
    }
}
