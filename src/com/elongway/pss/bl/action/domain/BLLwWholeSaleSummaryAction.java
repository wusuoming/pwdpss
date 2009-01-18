package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleSummary;

/**
 * 这是LWWholeSaleSummary-趸售电费计算总表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSaleSummaryAction extends BLLwWholeSaleSummaryActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleSummaryAction.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleSummaryAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSaleSummaryDto lwWholeSaleSummaryDto,String mode)
            throws Exception{
    }
}
