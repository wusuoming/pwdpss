package com.elongway.pss.bl.action.custom;

import java.util.Collection;

import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.util.Encrypt;
import com.sinosoft.sysframework.log.Logger;

/**
 * 这是IADcode的业务对象扩展类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLPwdEncodeAction{
    private static Logger logger = Logger.getLogger(BLPwdEncodeAction.class);

    /**
     * 构造函数
     */
    public BLPwdEncodeAction(){
    }

    /**
     * 密码处理
     * @param pass 密码
     * @return pass 密码
     * @throws Exception
     */
    public String fenCode(String pass) throws Exception{
        Encrypt m = new Encrypt();
        pass = m.getMD5ofStr(pass);
        return pass;
    }
 
}
