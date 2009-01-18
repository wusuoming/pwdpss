package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownIndicatorBak;

/**
 * 这是LWTownIndicatorBak-直供乡电表指针记录备份表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwTownIndicatorBakAction extends BLLwTownIndicatorBakActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorBakAction.class);

    /**
     * 构造函数
     */
    public BLLwTownIndicatorBakAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwTownIndicatorBakDto lwTownIndicatorBakDto,String mode)
            throws Exception{
    }
    public void insertAll(DBManager dbManager,Collection collection) throws Exception{
      	DBLwTownIndicatorBak dbLwTownIndicatorBak = new DBLwTownIndicatorBak(dbManager);
        //插入记录
        dbLwTownIndicatorBak.insertAll(collection);
    }
}
