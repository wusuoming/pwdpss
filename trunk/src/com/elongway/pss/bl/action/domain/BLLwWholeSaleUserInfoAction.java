package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleUserInfo;

/**
 * 这是LWWholeSaleUserInfo-趸售用户信息表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSaleUserInfoAction extends BLLwWholeSaleUserInfoActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleUserInfoAction.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleUserInfoAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwWholeSaleUserInfoDto lwWholeSaleUserInfoDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto,String mode)
            throws Exception{
    }
}
