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
 * ����IAContact��ҵ�������չ��<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIAContactAction extends BLIAContactActionBase{
    private static Logger logger = Logger.getLogger(BLIAContactAction.class);

    /**
     * ���캯��
     */
    public BLIAContactAction(){
        super();
    }

    /**
     * ת��Dto
     * @param dbManager dbManager
     * @param iAContactDto iAContactDto
     * @param mode ģʽ
     * @throws Exception
     */
    public void convertDto(DBManager dbManager,IAContactDto iAContactDto,String mode)
            throws Exception{
    }
    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void updateStatus(DBManager dbManager,IAContactDto iAContactDto)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //���¼�¼
        dbIAContact.updateStatus(iAContactDto);
    }
}
