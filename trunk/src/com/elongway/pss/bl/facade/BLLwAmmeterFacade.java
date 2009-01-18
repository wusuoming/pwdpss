package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.ui.view.maintenance.UIGetAmmeterForm;

/**
 * 这是LWAmmeter-电表信息表的业务对象Facade类<br>
 * 创建于 JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class BLLwAmmeterFacade extends BLLwAmmeterFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterFacade.class);

    /**
     * 构造函数
     */
    public BLLwAmmeterFacade(){
        super();
    }
    /**
     * 定义有参构造函数
     * @param uiAmmeterForm
     */
    public BLLwAmmeterFacade(UIGetAmmeterForm uiAmmeterForm){
    	
    }
    
}
