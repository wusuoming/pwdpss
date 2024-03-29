package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;

/**
 * 这是LWWholeSaleUserInfo-趸售用户信息表的数据访问对象类<br>
 * 创建于 2008-12-06 11:44:08.687<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleUserInfo extends DBLwWholeSaleUserInfoBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleUserInfo.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleUserInfo(DBManager dbManager){
        super(dbManager);
    }
}
