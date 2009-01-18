package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LineLossDto;
import com.elongway.pss.resource.dtofactory.domain.DBLineLoss;

/**
 * 这是LineLoss-线损信息表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLineLossAction extends BLLineLossActionBase{
    private static Logger logger = Logger.getLogger(BLLineLossAction.class);

    /**
     * 构造函数
     */
    public BLLineLossAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lineLossDto lineLossDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LineLossDto lineLossDto,String mode)
            throws Exception{
    }
}
