package com.elongway.pss.resource.dtofactory.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.DateTime;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IASysUserDto;

/**
 * ����IASysUser�����ݷ��ʶ�����<br>
 * ������ 2006-09-08 15:52:53.608<br>
 * JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class DBIASysUser extends DBIASysUserBase{
    private static Logger logger = Logger.getLogger(DBIASysUser.class);

    /**
     * ���캯��
     * @param dbManager ��Դ������
     */
    public DBIASysUser(DBManager dbManager){
        super(dbManager);
    }
}
