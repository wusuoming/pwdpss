package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwLinePTDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ������·��ѹ���������ձ��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwLinePTAction extends BLLwLinePTActionBase{
    private static Logger logger = Logger.getLogger(BLLwLinePTAction.class);

    /**
     * ���캯��
     */
    public BLLwLinePTAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwLinePTDto lwLinePTDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwLinePTDto lwLinePTDto,String mode)
            throws Exception{
    }
}
