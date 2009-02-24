package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownGouDianFaxingDto;
import com.elongway.pss.resource.dtofactory.domain.DBLwTownGouDianFaxing;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownGouDianFaxing-ֱ���繺����㵥��ҵ���߼�������<br>
 */
public class BLLwTownGouDianFaxingActionBase{
    private static Logger logger = Logger.getLogger(BLLwTownGouDianFaxingActionBase.class);

    /**
     * ���캯��
     */
    public BLLwTownGouDianFaxingActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,LwTownGouDianFaxingDto lwTownGouDianFaxingDto)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //�����¼
        dbLwTownGouDianFaxing.insert(lwTownGouDianFaxingDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param townCode �������
     * @param statMonth ��������
     * @throws Exception
     */
    public void delete(DBManager dbManager,String townCode,String statMonth)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //ɾ����¼
        dbLwTownGouDianFaxing.delete(townCode, statMonth);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //������ɾ����¼
        dbLwTownGouDianFaxing.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public void update(DBManager dbManager,LwTownGouDianFaxingDto lwTownGouDianFaxingDto)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //���¼�¼
        dbLwTownGouDianFaxing.update(lwTownGouDianFaxingDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param townCode �������
     * @param statMonth ��������
     * @return lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public LwTownGouDianFaxingDto findByPrimaryKey(DBManager dbManager,String townCode,String statMonth)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        //����DTO
        LwTownGouDianFaxingDto lwTownGouDianFaxingDto = null;
        //��ѯ����,��ֵ��DTO
        lwTownGouDianFaxingDto = dbLwTownGouDianFaxing.findByPrimaryKey(townCode, statMonth);
        return lwTownGouDianFaxingDto;
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
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownGouDianFaxing.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbLwTownGouDianFaxing.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����lwTownGouDianFaxingDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbLwTownGouDianFaxing.findByConditions(conditions);
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
        DBLwTownGouDianFaxing dbLwTownGouDianFaxing = new DBLwTownGouDianFaxing(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbLwTownGouDianFaxing.getCount(conditions);
        return count;
    }
}
