package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwShouShuTableDto;

/**
 * 这是LwShouShuTable-手输费用表的数据访问对象类<br>
 * 创建于 2009-03-02 16:05:41.562<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwShouShuTable extends DBLwShouShuTableBase{
    private static Logger logger = Logger.getLogger(DBLwShouShuTable.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwShouShuTable(DBManager dbManager){
        super(dbManager);
    }
}
