package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSysUserDto;

/**
 * 这是LWSysUser-登录用户表的数据访问对象类<br>
 * 创建于 2008-11-12 09:08:48.734<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwSysUser extends DBLwSysUserBase{
    private static Logger logger = Logger.getLogger(DBLwSysUser.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwSysUser(DBManager dbManager){
        super(dbManager);
    }
}
