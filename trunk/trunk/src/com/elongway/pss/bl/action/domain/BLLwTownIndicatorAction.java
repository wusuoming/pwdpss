package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;

import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicator;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorBak;

/**
 * 这是LWTownIndicator-直供乡电表指针记录表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownIndicatorAction extends BLLwTownIndicatorActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorAction.class);

    /**
     * 构造函数
     */
    public BLLwTownIndicatorAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwTownIndicatorDto lwTownIndicatorDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownIndicatorDto lwTownIndicatorDto,String mode)
            throws Exception{
    }
    public void insertAll(DBManager dbManager,Collection collection) throws Exception{
      	DBLwTownIndicator dbLwTownIndicator = new DBLwTownIndicator(dbManager);
        //插入记录
        dbLwTownIndicator.insertAll(collection);
    }
}
