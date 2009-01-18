package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwWholeSaleProrate;

/**
 * 这是LWWholeSaleProrate-趸售比例分摊表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwWholeSaleProrateAction extends BLLwWholeSaleProrateActionBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleProrateAction.class);

    /**
     * 构造函数
     */
    public BLLwWholeSaleProrateAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwWholeSaleProrateDto lwWholeSaleProrateDto,String mode)
            throws Exception{
    }
}
