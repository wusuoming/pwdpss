package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.SubjoinFeeDto;

/**
 * 这是subjoinFee-附加费用表的数据访问对象类<br>
 * 创建于 2008-12-14 22:58:39.156<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBSubjoinFee extends DBSubjoinFeeBase{
    private static Logger logger = Logger.getLogger(DBSubjoinFee.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBSubjoinFee(DBManager dbManager){
        super(dbManager);
    }
}
