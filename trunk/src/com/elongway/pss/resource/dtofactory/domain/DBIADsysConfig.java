package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;

import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * 这是IADsysConfig的数据访问对象类<br>
 * 创建于 2006-08-10 01:35:07.873<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADsysConfig extends DBIADsysConfigBase{
    private static Logger logger = Logger.getLogger(DBIADsysConfig.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBIADsysConfig(DBManager dbManager){
        super(dbManager);
    }
}
