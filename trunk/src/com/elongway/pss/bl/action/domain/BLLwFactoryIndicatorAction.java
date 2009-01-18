package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;

import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorDto;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwFactoryIndicator;
import com.elongway.pss.resource.dtofactory.domain.DBLwFactoryIndicatorBak;

/**
 * 这是LWFactoryIndicator-大工业电表指针记录表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwFactoryIndicatorAction extends BLLwFactoryIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwFactoryIndicatorAction.class);

    /**
     * 构造函数
     */
    public BLLwFactoryIndicatorAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwFactoryIndicatorDto lwFactoryIndicatorDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwFactoryIndicatorDto lwFactoryIndicatorDto,String mode)
            throws Exception{
    }
    /**
     * 批量插入
     * @param dbManager
     * @param collection
     * @throws Exception
     */
    public void insertAll(DBManager dbManager,Collection<LwFactoryIndicatorDto> collection)throws Exception{
    	DBLwFactoryIndicator dbLwFactoryIndicator = new DBLwFactoryIndicator(dbManager);
    	dbLwFactoryIndicator.insertAll(collection);
    }
}
