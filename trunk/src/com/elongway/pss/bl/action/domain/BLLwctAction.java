package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwctDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是电流互感器的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwctAction extends BLLwctActionBase{
    private static Logger logger = Logger.getLogger(BLLwctAction.class);

    /**
     * 构造函数
     */
    public BLLwctAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwctDto lwctDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwctDto lwctDto,String mode)
            throws Exception{
    }
}
