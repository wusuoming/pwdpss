package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwDcompanyDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ����LWDcompany-����������ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwDcompanyAction extends BLLwDcompanyActionBase{
    private static Logger logger = Logger.getLogger(BLLwDcompanyAction.class);

    /**
     * ���캯��
     */
    public BLLwDcompanyAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwDcompanyDto lwDcompanyDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwDcompanyDto lwDcompanyDto,String mode)
            throws Exception{
    }
}
