package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.TransforDto;
import com.elongway.pss.resource.dtofactory.domain.DBTransfor;

/**
 * 这是Transfor-变压器信息的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLTransforAction extends BLTransforActionBase{
    private static Logger logger = Logger.getLogger(BLTransforAction.class);

    /**
     * 构造函数
     */
    public BLTransforAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param transforDto transforDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,TransforDto transforDto,String mode)
            throws Exception{
    }
}
