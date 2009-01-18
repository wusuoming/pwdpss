package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwptDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是电压互感器的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwptAction extends BLLwptActionBase{
    private static Logger logger = Logger.getLogger(BLLwptAction.class);

    /**
     * 构造函数
     */
    public BLLwptAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwptDto lwptDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwptDto lwptDto,String mode)
            throws Exception{
    }
}
