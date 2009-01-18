package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IAContactDto;
import com.elongway.pss.resource.dtofactory.domain.DBIAContact;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IAContact��ҵ���߼�������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIAContactActionBase{
    private static Logger logger = Logger.getLogger(BLIAContactActionBase.class);

    /**
     * ���캯��
     */
    public BLIAContactActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IAContactDto iAContactDto)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //�����¼
        dbIAContact.insert(iAContactDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param contactNo ContactNo
     * @throws Exception
     */
    public void delete(DBManager dbManager,String contactNo)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //ɾ����¼
        dbIAContact.delete(contactNo);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //������ɾ����¼
        dbIAContact.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IAContactDto iAContactDto)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //���¼�¼
        dbIAContact.update(iAContactDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param contactNo ContactNo
     * @return iAContactDto iAContactDto
     * @throws Exception
     */
    public IAContactDto findByPrimaryKey(DBManager dbManager,String contactNo)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        //����DTO
        IAContactDto iAContactDto = null;
        //��ѯ����,��ֵ��DTO
        iAContactDto = dbIAContact.findByPrimaryKey(contactNo);
        return iAContactDto;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @param pageNo ҳ��
     * @param rowsPerPage ÿҳ������
     * @return PageRecord ��ѯ��һҳ�Ľ��
     * @throws Exception
     */
    public PageRecord findByConditions(DBManager dbManager,String conditions,int pageNo,int rowsPerPage)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIAContact.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIAContact.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����iAContactDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIAContact.findByConditions(conditions);
        return collection;
    }

    /**
     * ��ѯ����ģ����ѯ�����ļ�¼��
     * @param dbManager DB������
     * @param conditions ģ����ѯ����
     * @return ����ģ����ѯ�����ļ�¼��
     * @throws Exception
     */
    public int getCount(DBManager dbManager,String conditions) 
        throws Exception{
        DBIAContact dbIAContact = new DBIAContact(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIAContact.getCount(conditions);
        return count;
    }
}
