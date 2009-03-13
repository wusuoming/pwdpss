package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownProrateAppend;

/**
 * 这是LWTownProrateAppend-比例分摊追加表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownProrateAppendAction extends BLLwTownProrateAppendActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownProrateAppendAction.class);

    /**
     * 构造函数
     */
    public BLLwTownProrateAppendAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownProrateAppendDto lwTownProrateAppendDto,String mode)
            throws Exception{
    }
}
