package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwDcodeDto;

/**
 * 这是LwDcode-基础代码表的数据访问对象类<br>
 * 创建于 2008-10-07 11:13:57.703<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwDcode extends DBLwDcodeBase{
    private static Logger logger = Logger.getLogger(DBLwDcode.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwDcode(DBManager dbManager){
        super(dbManager);
    }
}
