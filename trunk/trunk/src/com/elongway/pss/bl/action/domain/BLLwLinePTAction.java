package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwLinePTDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是线路电压互感器对照表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwLinePTAction extends BLLwLinePTActionBase{
    private static Logger logger = Logger.getLogger(BLLwLinePTAction.class);

    /**
     * 构造函数
     */
    public BLLwLinePTAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwLinePTDto lwLinePTDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwLinePTDto lwLinePTDto,String mode)
            throws Exception{
    }
}
