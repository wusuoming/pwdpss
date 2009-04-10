package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleStatDetailDto;

/**
 * 这是LWWholeSaleStatDetail-趸售按电价统计的数据访问对象类<br>
 * 创建于 2009-04-08 10:44:48.483<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleStatDetail extends DBLwWholeSaleStatDetailBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleStatDetail.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleStatDetail(DBManager dbManager){
        super(dbManager);
    }
}
