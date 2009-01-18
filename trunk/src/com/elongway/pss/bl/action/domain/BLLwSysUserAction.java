package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwSysUser;

/**
 * 这是LWSysUser-登录用户表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwSysUserAction extends BLLwSysUserActionBase{
    private static Logger logger = Logger.getLogger(BLLwSysUserAction.class);

    /**
     * 构造函数
     */
    public BLLwSysUserAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwSysUserDto lwSysUserDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwSysUserDto lwSysUserDto,String mode)
            throws Exception{
    }
}
