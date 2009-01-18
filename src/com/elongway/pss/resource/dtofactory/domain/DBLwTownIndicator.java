package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;

/**
 * 这是LWTownIndicator-直供乡电表指针记录表的数据访问对象类<br>
 * 创建于 2008-12-04 02:40:12.921<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownIndicator extends DBLwTownIndicatorBase{
    private static Logger logger = Logger.getLogger(DBLwTownIndicator.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownIndicator(DBManager dbManager){
        super(dbManager);
    }
}
