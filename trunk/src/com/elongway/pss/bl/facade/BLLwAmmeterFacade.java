package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;

/**
 * ����LWAmmeter-�����Ϣ���ҵ�����Facade��<br>
 * ������ JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwAmmeterFacade extends BLLwAmmeterFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterFacade.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterFacade(){
        super();
    }
    /**
     * �����вι��캯��
     * @param uiAmmeterForm
     */
    public BLLwAmmeterFacade(UIGetAmmeterForm uiAmmeterForm){
    	
    }
    
}
