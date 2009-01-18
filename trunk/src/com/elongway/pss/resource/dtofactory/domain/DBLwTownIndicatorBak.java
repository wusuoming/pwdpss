package com.elongway.pss.resource.dtofactory.domain;

import java.util.Collection;

import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * 这是LWTownIndicatorBak-直供乡电表指针记录备份表的数据访问对象类<br>
 * 创建于 2008-12-04 02:40:13.796<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwTownIndicatorBak extends DBLwTownIndicatorBakBase{
    private static Logger logger = Logger.getLogger(DBLwTownIndicatorBak.class);

    /**
     * 构造函数
     * @param dbManager 资源管理类
     */
    public DBLwTownIndicatorBak(DBManager dbManager){
        super(dbManager);
    }
   
}
