package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorBakDto;

/**
 * 这是LWFactoryIndicatorBak-大工业电表指针记录备份表的数据访问对象类<br>
 * 创建于 2008-11-27 11:18:23.156<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwFactoryIndicatorBak extends DBLwFactoryIndicatorBakBase{
    private static Logger logger = Logger.getLogger(DBLwFactoryIndicatorBak.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwFactoryIndicatorBak(DBManager dbManager){
        super(dbManager);
    }
}
