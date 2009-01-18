package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是线路电流电压互感器电表关系表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwLineCTPTAmmeterAction extends BLLwLineCTPTAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineCTPTAmmeterAction.class);

    /**
     * 构造函数
     */
    public BLLwLineCTPTAmmeterAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto,String mode)
            throws Exception{
    }
}
