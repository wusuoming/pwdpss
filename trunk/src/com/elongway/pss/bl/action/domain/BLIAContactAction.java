package com.elongway.pss.bl.action.domain;


import java.sql.*;
import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IAContactDto;
import com.elongway.pss.resource.dtofactory.domain.DBIAContact;

/**
 * 这是IAContact的业务对象扩展类<br>
 * 创建于 JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIAContactAction extends BLIAContactActionBase{
    private static Logger logger = Logger.getLogger(BLIAContactAction.class);

    /**
     * 构造函数
     */
    public BLIAContactAction(){
        super();
    }

    /**
     * 转换Dto
     * @param dbManager dbManager
     * @param iAContactDto iAContactDto
     * @param mode 模式
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,IAContactDto iAContactDto,String mode)
            throws Exception{
    }
    /**
     * 按主键更新一条数据(主键本身无法变更)
     * @param dbManager DB管理器
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void updateStatus(DBManager dbManager,IAContactDto iAContactDto)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //更新记录
        dbIAContact.updateStatus(iAContactDto);
    }
}
