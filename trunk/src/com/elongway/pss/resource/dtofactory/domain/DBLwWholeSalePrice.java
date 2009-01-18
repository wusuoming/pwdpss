package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;

/**
 * 这是LWWholeSalePrice-趸售价格表的数据访问对象类<br>
 * 创建于 2008-10-07 11:16:43.953<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSalePrice extends DBLwWholeSalePriceBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSalePrice.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSalePrice(DBManager dbManager){
        super(dbManager);
    }
}
