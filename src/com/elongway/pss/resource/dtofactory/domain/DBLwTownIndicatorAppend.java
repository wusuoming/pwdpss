package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;

/**
 * 这是LWTownIndicatorAppend-直供乡追加电费指针记录表的数据访问对象类<br>
 * 创建于 2008-12-17 11:27:43.218<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownIndicatorAppend extends DBLwTownIndicatorAppendBase{
    private static Logger logger = Logger.getLogger(DBLwTownIndicatorAppend.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownIndicatorAppend(DBManager dbManager){
        super(dbManager);
    }
}
