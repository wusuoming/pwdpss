package com.elongway.pss.bl.action.custom;

import java.util.Collection;

import com.elongway.pss.bl.facade.BLLwAmmeterFacade;
import com.elongway.pss.util.Encrypt;
import com.sinosoft.sysframework.log.Logger;

/**
 * ����IADcode��ҵ�������չ��<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLPwdEncodeAction{
    private static Logger logger = Logger.getLogger(BLPwdEncodeAction.class);

    /**
     * ���캯��
     */
    public BLPwdEncodeAction(){
    }

    /**
     * ���봦��
     * @param pass ����
     * @return pass ����
     * @throws Exception
     */
    public String fenCode(String pass) throws Exception{
        Encrypt m = new Encrypt();
        pass = m.getMD5ofStr(pass);
        return pass;
    }
 
}
