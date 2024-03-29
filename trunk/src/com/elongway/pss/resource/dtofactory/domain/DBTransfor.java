package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.TransforDto;

/**
 * 这是Transfor-变压器信息的数据访问对象类<br>
 * 创建于 2008-11-28 00:20:25.609<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBTransfor extends DBTransforBase{
    private static Logger logger = Logger.getLogger(DBTransfor.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBTransfor(DBManager dbManager){
        super(dbManager);
    }
}
