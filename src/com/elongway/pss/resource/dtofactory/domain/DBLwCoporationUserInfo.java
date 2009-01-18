package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;

/**
 * 这是LWCoporationUserInfo-大工业用户信息表的数据访问对象类<br>
 * 创建于 2008-12-10 10:13:45.000<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwCoporationUserInfo extends DBLwCoporationUserInfoBase{
    private static Logger logger = Logger.getLogger(DBLwCoporationUserInfo.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwCoporationUserInfo(DBManager dbManager){
        super(dbManager);
    }
}
