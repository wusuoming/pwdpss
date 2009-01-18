package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwLineCTDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是线路电流互感器对照表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwLineCTAction extends BLLwLineCTActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineCTAction.class);

    /**
     * 构造函数
     */
    public BLLwLineCTAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwLineCTDto lwLineCTDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwLineCTDto lwLineCTDto,String mode)
            throws Exception{
    }
}
