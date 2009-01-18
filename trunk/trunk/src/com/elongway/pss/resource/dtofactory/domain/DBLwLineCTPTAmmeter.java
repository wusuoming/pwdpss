package com.elongway.pss.resource.dtofactory.domain;

import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是线路电流电压互感器电表关系表的数据访问对象类<br>
 * 创建于 2008-10-24 13:56:15.468<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwLineCTPTAmmeter extends DBLwLineCTPTAmmeterBase{
    private static Logger logger = Logger.getLogger(DBLwLineCTPTAmmeter.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwLineCTPTAmmeter(DBManager dbManager){
        super(dbManager);
    }
}
