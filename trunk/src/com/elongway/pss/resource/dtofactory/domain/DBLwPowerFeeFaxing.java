package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;

/**
 * 这是LWPowerFeeFaxing-电费电量发行表的数据访问对象类<br>
 * 创建于 2009-03-17 11:31:56.406<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwPowerFeeFaxing extends DBLwPowerFeeFaxingBase{
    private static Logger logger = Logger.getLogger(DBLwPowerFeeFaxing.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwPowerFeeFaxing(DBManager dbManager){
        super(dbManager);
    }
}
