package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwindicatorDto;

/**
 * 这是LWindicator-电表指针记录表的数据访问对象类<br>
 * 创建于 2008-10-07 11:14:11.671<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwindicator extends DBLwindicatorBase{
    private static Logger logger = Logger.getLogger(DBLwindicator.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwindicator(DBManager dbManager){
        super(dbManager);
    }
}
