package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;

/**
 * 这是LWWholeSaleProrate-趸售比例分摊表的数据访问对象类<br>
 * 创建于 2008-11-27 22:45:35.764<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwWholeSaleProrate extends DBLwWholeSaleProrateBase{
    private static Logger logger = Logger.getLogger(DBLwWholeSaleProrate.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwWholeSaleProrate(DBManager dbManager){
        super(dbManager);
    }
}
