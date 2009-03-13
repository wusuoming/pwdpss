package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;

/**
 * 这是LWTownPriceSummaryProrateAppend-直供乡追加电费计算总表的数据访问对象类<br>
 * 创建于 2009-03-09 11:59:11.921<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownPriceSummaryProratAppend extends DBLwTownPriceSummaryProratAppendBase{
    private static Logger logger = Logger.getLogger(DBLwTownPriceSummaryProratAppend.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownPriceSummaryProratAppend(DBManager dbManager){
        super(dbManager);
    }
}
