package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwLineCTDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ������·�������������ձ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwLineCTAction extends BLLwLineCTActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineCTAction.class);

    /**
     * ���캯��
     */
    public BLLwLineCTAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwLineCTDto lwLineCTDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwLineCTDto lwLineCTDto,String mode)
            throws Exception{
    }
}
