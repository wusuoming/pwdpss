package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwRateCodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwRateCode;

/**
 * 这是LWRateCode-调整率维护表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwRateCodeAction extends BLLwRateCodeActionBase{
    private static Logger logger = Logger.getLogger(BLLwRateCodeAction.class);

    /**
     * 构造函数
     */
    public BLLwRateCodeAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwRateCodeDto lwRateCodeDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwRateCodeDto lwRateCodeDto,String mode)
            throws Exception{
    }
}
