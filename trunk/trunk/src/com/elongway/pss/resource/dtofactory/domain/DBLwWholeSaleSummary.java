package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;

/**
 * 这是LWWholeSaleSummary-趸售电费计算总表的数据访问对象类<br>
 * 创建于 2008-12-24 00:49:28.796<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleSummary extends DBLwWholeSaleSummaryBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleSummary.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleSummary(DBManager dbManager){
        super(dbManager);
    }
}
