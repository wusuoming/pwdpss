package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwctDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ���ǵ�����������ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwctAction extends BLLwctActionBase{
    private static Logger logger = Logger.getLogger(BLLwctAction.class);

    /**
     * ���캯��
     */
    public BLLwctAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwctDto lwctDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwctDto lwctDto,String mode)
            throws Exception{
    }
}
