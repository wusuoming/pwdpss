package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;

/**
 * 这是LWTownProrateAppend-比例分摊追加表的数据访问对象类<br>
 * 创建于 2009-03-04 11:17:30.436<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownProrateAppend extends DBLwTownProrateAppendBase{
    private static Logger logger = Logger.getLogger(DBLwTownProrateAppend.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownProrateAppend(DBManager dbManager){
        super(dbManager);
    }
}
