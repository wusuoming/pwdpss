package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCodeDto;

/**
 * 这是IADCode的数据访问对象类<br>
 * 创建于 2006-09-08 15:52:38.426<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADCode extends DBIADCodeBase{
    private static Logger logger = Logger.getLogger(DBIADCode.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBIADCode(DBManager dbManager){
        super(dbManager);
    }
}
