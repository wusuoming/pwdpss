package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;

/**
 * 这是LWTownPriceSummary-直供乡电费计算总表的数据访问对象类<br>
 * 创建于 2008-10-07 11:16:16.640<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownPriceSummary extends DBLwTownPriceSummaryBase{
    private static Logger logger = Logger.getLogger(DBLwTownPriceSummary.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownPriceSummary(DBManager dbManager){
        super(dbManager);
    }
}
