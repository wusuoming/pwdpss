package com.elongway.pss.bl.action.domain;

import com.elongway.pss.dto.domain.LwLineCTPTAmmeterDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ������·������ѹ����������ϵ���ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwLineCTPTAmmeterAction extends BLLwLineCTPTAmmeterActionBase{
    private static Logger logger = Logger.getLogger(BLLwLineCTPTAmmeterAction.class);

    /**
     * ���캯��
     */
    public BLLwLineCTPTAmmeterAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwLineCTPTAmmeterDto lwLineCTPTAmmeterDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwLineCTPTAmmeterDto lwLineCTPTAmmeterDto,String mode)
            throws Exception{
    }
}
