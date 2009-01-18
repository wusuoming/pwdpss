package com.elongway.pss.resource.dtofactory.domain;


import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是线路电压互感器对照表的数据访问对象类<br>
 * 创建于 2008-10-26 19:48:34.984<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwLinePT extends DBLwLinePTBase{
    private static Logger logger = Logger.getLogger(DBLwLinePT.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwLinePT(DBManager dbManager){
        super(dbManager);
    }
}
