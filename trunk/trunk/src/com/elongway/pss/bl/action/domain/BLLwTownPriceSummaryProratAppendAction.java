package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownPriceSummaryProratAppend;

/**
 * 这是LWTownPriceSummaryProrateAppend-直供乡追加电费计算总表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownPriceSummaryProratAppendAction extends BLLwTownPriceSummaryProratAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryProratAppendAction.class);

    /**
     * 构造函数
     */
    public BLLwTownPriceSummaryProratAppendAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto,String mode)
            throws Exception{
    }
}
