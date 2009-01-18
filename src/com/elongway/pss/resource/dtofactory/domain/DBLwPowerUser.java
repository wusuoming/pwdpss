package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerUserDto;

/**
 * 这是LWPowerUser-用电用户信息表的数据访问对象类<br>
 * 创建于 2008-11-12 22:53:31.968<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwPowerUser extends DBLwPowerUserBase{
    private static Logger logger = Logger.getLogger(DBLwPowerUser.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwPowerUser(DBManager dbManager){
        super(dbManager);
    }
}
