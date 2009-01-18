package com.elongway.pss.bl.action.domain;



import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * 这是LWSalePrice-销售电价表的业务对象扩展类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwSalePriceAction extends BLLwSalePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwSalePriceAction.class);

    /**
     * 构造函数
     */
    public BLLwSalePriceAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param lwSalePriceDto lwSalePriceDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwSalePriceDto lwSalePriceDto,String mode)
            throws Exception{
    }
}
