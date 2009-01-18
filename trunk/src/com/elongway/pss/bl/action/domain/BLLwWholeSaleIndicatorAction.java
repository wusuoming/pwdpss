package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;

import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleIndicator;

/**
 * 这是LWWholeSaleIndicator-趸售电表指针记录表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSaleIndicatorAction extends BLLwWholeSaleIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleIndicatorAction.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleIndicatorAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto,String mode)
            throws Exception{
    }
    public void insertAll(DBManager dbManager,Collection collection) throws Exception{
      	DBLwWholeSaleIndicator dbLwWholeSaleIndicator = new DBLwWholeSaleIndicator(dbManager);
        //插入记录
      	dbLwWholeSaleIndicator.insertAll(collection);
    }
}
