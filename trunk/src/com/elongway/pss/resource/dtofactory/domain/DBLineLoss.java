package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LineLossDto;

/**
 * 这是LineLoss-线损信息表的数据访问对象类<br>
 * 创建于 2008-12-16 16:09:53.562<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLineLoss extends DBLineLossBase{
    private static Logger logger = Logger.getLogger(DBLineLoss.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLineLoss(DBManager dbManager){
        super(dbManager);
    }
}
