package com.elongway.pss.resource.dtofactory.domain;


import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是线路电流互感器对照表的数据访问对象类<br>
 * 创建于 2008-10-26 19:48:22.031<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwLineCT extends DBLwLineCTBase{
    private static Logger logger = Logger.getLogger(DBLwLineCT.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwLineCT(DBManager dbManager){
        super(dbManager);
    }
}
