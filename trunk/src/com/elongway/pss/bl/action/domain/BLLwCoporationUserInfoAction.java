package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwCoporationUserInfo;

/**
 * 这是LWCoporationUserInfo-大工业用户信息表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwCoporationUserInfoAction extends BLLwCoporationUserInfoActionBase{
    private static Logger logger = Logger.getLogger(BLLwCoporationUserInfoAction.class);

    /**
     * 构造函数
     */
    public BLLwCoporationUserInfoAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwCoporationUserInfoDto lwCoporationUserInfoDto,String mode)
            throws Exception{
    }
}
