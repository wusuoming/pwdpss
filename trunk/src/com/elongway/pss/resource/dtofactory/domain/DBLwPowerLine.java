package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerLineDto;

/**
 * 这是LWPowerLine-线路信息表的数据访问对象类<br>
 * 创建于 2008-10-30 14:36:39.609<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwPowerLine extends DBLwPowerLineBase{
    private static Logger logger = Logger.getLogger(DBLwPowerLine.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwPowerLine(DBManager dbManager){
        super(dbManager);
    }
}
