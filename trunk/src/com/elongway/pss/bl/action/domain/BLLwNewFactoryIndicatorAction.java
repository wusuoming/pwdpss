package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;

import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwFactoryIndicator;
import com.elongway.pss.resource.dtofactory.domain.DBLwNewFactoryIndicator;

/**
 * 这是LWNewFactoryIndicator-大工业新电表指针记录表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwNewFactoryIndicatorAction extends BLLwNewFactoryIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorAction.class);

    /**
     * 构造函数
     */
    public BLLwNewFactoryIndicatorAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto,String mode)
            throws Exception{
    }
    public void insertAll(DBManager dbManager,Collection<LwNewFactoryIndicatorDto> collection)throws Exception{
    	DBLwNewFactoryIndicator dbLwFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
    	dbLwFactoryIndicator.insertAll(collection);
    }
    public void deleteByConditions(DBManager dbManager,String conditions)
    throws Exception{
DBLwNewFactoryIndicator dbLwNewFactoryIndicator = new DBLwNewFactoryIndicator(dbManager);
//按条件删除记录
dbLwNewFactoryIndicator.deleteByConditions(conditions);
}
}
