package com.elongway.pss.resource.dtofactory.domain;

import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是电压互感器的数据访问对象类<br>
 * 创建于 2008-10-24 11:59:26.312<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwpt extends DBLwptBase{
    private static Logger logger = Logger.getLogger(DBLwpt.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwpt(DBManager dbManager){
        super(dbManager);
    }
}
