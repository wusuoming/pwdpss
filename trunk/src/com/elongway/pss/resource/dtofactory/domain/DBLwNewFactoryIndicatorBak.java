package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;

/**
 * 这是LWNewFactoryIndicatorBak-大工业新电表指针备份表的数据访问对象类<br>
 * 创建于 2008-12-12 13:36:42.781<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwNewFactoryIndicatorBak extends DBLwNewFactoryIndicatorBakBase{
    private static Logger logger = Logger.getLogger(DBLwNewFactoryIndicatorBak.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwNewFactoryIndicatorBak(DBManager dbManager){
        super(dbManager);
    }
}
