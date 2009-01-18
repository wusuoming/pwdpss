package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwDcompanyDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是LWDcompany-机构代码表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwDcompanyAction extends BLLwDcompanyActionBase{
    private static Logger logger = Logger.getLogger(BLLwDcompanyAction.class);

    /**
     * 构造函数
     */
    public BLLwDcompanyAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwDcompanyDto lwDcompanyDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwDcompanyDto lwDcompanyDto,String mode)
            throws Exception{
    }
}
