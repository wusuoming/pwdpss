package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSysUserDto;

/**
 * ����LWSysUser-��¼�û�������ݷ��ʶ�����<br>
 * ������ 2008-11-12 09:08:48.734<br>
 * JToolpad(1.6.0) Vendor:zhouxianli1978@msn.com
 */
public class DBLwSysUser extends DBLwSysUserBase{
    private static Logger logger = Logger.getLogger(DBLwSysUser.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBLwSysUser(DBManager dbManager){
        super(dbManager);
    }
}
