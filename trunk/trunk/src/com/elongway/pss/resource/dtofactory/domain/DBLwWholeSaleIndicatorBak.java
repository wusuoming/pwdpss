package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorBakDto;

/**
 * 这是LWWholeSaleIndicatorBak-趸售电表指针记录备份表的数据访问对象类<br>
 * 创建于 2008-12-24 01:17:53.484<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleIndicatorBak extends DBLwWholeSaleIndicatorBakBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleIndicatorBak.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleIndicatorBak(DBManager dbManager){
        super(dbManager);
    }
}
