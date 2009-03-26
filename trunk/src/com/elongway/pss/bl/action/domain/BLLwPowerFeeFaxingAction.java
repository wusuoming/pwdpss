package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwPowerFeeFaxing;

/**
 * 这是LWPowerFeeFaxing-电费电量发行表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwPowerFeeFaxingAction extends BLLwPowerFeeFaxingActionBase{
    private static Logger logger = Logger.getLogger(BLLwPowerFeeFaxingAction.class);

    /**
     * 构造函数
     */
    public BLLwPowerFeeFaxingAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwPowerFeeFaxingDto lwPowerFeeFaxingDto,String mode)
            throws Exception{
    }
    
    /**
     * 插入多条数据
     * @param dbManager DB管理器
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void insertAll(DBManager dbManager,Collection<LwPowerFeeFaxingDto>collection)
            throws Exception{
        DBLwPowerFeeFaxing dbLwPowerFeeFaxing = new DBLwPowerFeeFaxing(dbManager);
        //插入记录
        dbLwPowerFeeFaxing.insertAll(collection);
    }
}
