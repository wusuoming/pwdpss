package com.elongway.pss.bl.action.domain;



import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * ����LWSalePrice-���۵�۱��ҵ�������չ��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwSalePriceAction extends BLLwSalePriceActionBase{
    private static Logger logger = Logger.getLogger(BLLwSalePriceAction.class);

    /**
     * ���캯��
     */
    public BLLwSalePriceAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param lwSalePriceDto lwSalePriceDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,LwSalePriceDto lwSalePriceDto,String mode)
            throws Exception{
    }
}
