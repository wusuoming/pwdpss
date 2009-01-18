package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorAppend;

/**
 * 这是LWTownIndicatorAppend-直供乡追加电费指针记录表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownIndicatorAppendAction extends BLLwTownIndicatorAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorAppendAction.class);

    /**
     * 构造函数
     */
    public BLLwTownIndicatorAppendAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownIndicatorAppendDto lwTownIndicatorAppendDto,String mode)
            throws Exception{
    }
}
