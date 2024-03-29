package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADFileDto;

/**
 * 这是IADFile的数据访问对象类<br>
 * 创建于 2007-11-06 10:57:34.687<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIADFile extends DBIADFileBase{
    private static Logger logger = Logger.getLogger(DBIADFile.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBIADFile(DBManager dbManager){
        super(dbManager);
    }
}
