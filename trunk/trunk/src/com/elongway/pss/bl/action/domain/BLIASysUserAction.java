package com.elongway.pss.bl.action.domain;

import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IASysUserDto;
import com.elongway.pss.resource.dtofactory.domain.DBIASysUser;

/**
 * ����IASysUser��ҵ�������չ��<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIASysUserAction extends BLIASysUserActionBase{
    private static Logger logger = Logger.getLogger(BLIASysUserAction.class);

    /**
     * ���캯��
     */
    public BLIASysUserAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param iASysUserDto iASysUserDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,IASysUserDto iASysUserDto,String mode)
            throws Exception{
    }
}
