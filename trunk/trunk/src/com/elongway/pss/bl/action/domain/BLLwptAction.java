package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwptDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ���ǵ�ѹ��������ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwptAction extends BLLwptActionBase{
    private static Logger logger = Logger.getLogger(BLLwptAction.class);

    /**
     * ���캯��
     */
    public BLLwptAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwptDto lwptDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwptDto lwptDto,String mode)
            throws Exception{
    }
}
