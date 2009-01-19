package com.elongway.pss.bl.action.custom;

import java.util.*;

import com.elongway.pss.resource.dtofactory.custom.DBSelectOptionsNameValue;
import com.sinosoft.sysframework.reference.DBManager;

/**
 *  ������ �޸ģ�ȥ��������롣
 *  yangfuqiang �޸Ĳ��ִ���
 * SelectOptions��BL��
 * <p>Title: PICCAUDIT</p>
 * <p>Description: PICC������������ϵͳ����</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>@createdate: 2003-06-14</p>
 * @author renyiqun
 * @version 1.0.0
 */
public class BLSelectOptionsNameValueAction{
    public BLSelectOptionsNameValueAction(){
        ;
    }

    /**
     * ������
     * @param auTableCode ����
     * @param auFieldCode �����ֶ���
     * @param auFieldNameCode �����ֶ���
     * @param conditions ����
     * @return Collection �����
     * @throws Exception
     */
    public Collection getSelectOptionsNameValue(String auTableCode,String auFieldCode,String auFieldNameCode,
                                                String conditions) throws Exception{
        DBManager dbManager = new DBManager();
        DBSelectOptionsNameValue dbSelectOptionsNameValue = new DBSelectOptionsNameValue(dbManager);
        
        if(conditions.trim().equals("")){
            conditions = "1=1";
        }
        
        Collection collection = new ArrayList();
        Collection selectOptions = new ArrayList();
        try{
            collection = dbSelectOptionsNameValue.getSelectOptionsNameValue(auTableCode,auFieldCode,auFieldNameCode,conditions);
            selectOptions = collection;
        }
        /*
        catch(Exception e){
        }
        */
        finally
        {
            dbManager.close();
        }
        return selectOptions;
    }
}