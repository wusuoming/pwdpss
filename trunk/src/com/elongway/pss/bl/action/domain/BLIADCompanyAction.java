package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCompanyDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADCompany;

/**
 * 这是IADCompany的业务对象扩展类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADCompanyAction extends BLIADCompanyActionBase{
    private static Logger logger = Logger.getLogger(BLIADCompanyAction.class);

    /**
     * 构造函数
     */
    public BLIADCompanyAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param iADCompanyDto iADCompanyDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,IADCompanyDto iADCompanyDto,String mode)
            throws Exception{
    }
}
