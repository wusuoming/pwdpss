package com.elongway.pss.resource.dtofactory.domain;

import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是电流互感器的数据访问对象类<br>
 * 创建于 2008-10-24 11:59:02.828<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwct extends DBLwctBase{
    private static Logger logger = Logger.getLogger(DBLwct.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwct(DBManager dbManager){
        super(dbManager);
    }
}
