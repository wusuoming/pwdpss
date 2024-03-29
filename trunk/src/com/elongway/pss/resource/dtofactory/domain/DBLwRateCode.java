package com.elongway.pss.resource.dtofactory.domain;


import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwRateCodeDto;

/**
 * 这是LWRateCode-调整率维护表的数据访问对象类<br>
 * 创建于 2008-10-10 11:15:25.765<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwRateCode extends DBLwRateCodeBase{
    private static Logger logger = Logger.getLogger(DBLwRateCode.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwRateCode(DBManager dbManager){
        super(dbManager);
    }
}
