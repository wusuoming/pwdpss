package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;

/**
 * 这是LWWholeSalePurePrice-趸售纯电价表的数据访问对象类<br>
 * 创建于 2007-12-01 20:46:33.750<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSalePurePrice extends DBLwWholeSalePurePriceBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSalePurePrice.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSalePurePrice(DBManager dbManager){
        super(dbManager);
    }
}
