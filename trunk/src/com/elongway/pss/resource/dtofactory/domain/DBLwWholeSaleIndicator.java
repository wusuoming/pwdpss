package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;

/**
 * 这是LWWholeSaleIndicator-趸售电表指针记录表的数据访问对象类<br>
 * 创建于 2008-12-24 01:17:36.328<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleIndicator extends DBLwWholeSaleIndicatorBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleIndicator.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleIndicator(DBManager dbManager){
        super(dbManager);
    }
}
