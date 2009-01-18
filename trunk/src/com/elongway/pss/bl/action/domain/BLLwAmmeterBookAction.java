package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterBookDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwAmmeterBook;

/**
 * 这是LwAmmeterBook-表本信息表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwAmmeterBookAction extends BLLwAmmeterBookActionBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterBookAction.class);

    /**
     * 构造函数
     */
    public BLLwAmmeterBookAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwAmmeterBookDto lwAmmeterBookDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwAmmeterBookDto lwAmmeterBookDto,String mode)
            throws Exception{
    }
}
