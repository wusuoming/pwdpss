package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicatorBak;

/**
 * 这是LWNewFactoryIndicatorBak-大工业新电表指针备份表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwNewFactoryIndicatorBakAction extends BLLwNewFactoryIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorBakAction.class);

    /**
     * 构造函数
     */
    public BLLwNewFactoryIndicatorBakAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto,String mode)
            throws Exception{
    }
}
