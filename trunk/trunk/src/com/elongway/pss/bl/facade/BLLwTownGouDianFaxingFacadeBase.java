package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownGouDianFaxingDto;
import com.elongway.pss.bl.action.domain.BLLwTownGouDianFaxingAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownGouDianFaxing-ֱ���繺����㵥��ҵ���߼�����Facade����<br>
 */
public class BLLwTownGouDianFaxingFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownGouDianFaxingFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwTownGouDianFaxingFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public void insert(LwTownGouDianFaxingDto lwTownGouDianFaxingDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownGouDianFaxingAction blLwTownGouDianFaxingAction = new BLLwTownGouDianFaxingAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwTownGouDianFaxingAction.insert(dbManager,lwTownGouDianFaxingDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ������ɾ��һ������
     * @param townCode �������
     * @param statMonth ��������
     * @throws Exception
     */
    public void delete(String townCode,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownGouDianFaxingAction blLwTownGouDianFaxingAction = new BLLwTownGouDianFaxingAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwTownGouDianFaxingAction.delete(dbManager,townCode, statMonth);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ������ɾ������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(String conditions)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownGouDianFaxingAction blLwTownGouDianFaxingAction = new BLLwTownGouDianFaxingAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwTownGouDianFaxingAction.deleteByConditions(dbManager,conditions);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ����������һ������(���������޷����)
     * @param lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public void update(LwTownGouDianFaxingDto lwTownGouDianFaxingDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownGouDianFaxingAction blLwTownGouDianFaxingAction = new BLLwTownGouDianFaxingAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwTownGouDianFaxingAction.update(dbManager,lwTownGouDianFaxingDto);
            dbManager.commitTransaction();
        }catch(Exception exception){
            dbManager.rollbackTransaction();
            throw exception;
        }finally{
            dbManager.close();
        }
    }

    /**
     * ����������һ������
     * @param townCode �������
     * @param statMonth ��������
     * @return lwTownGouDianFaxingDto lwTownGouDianFaxingDto
     * @throws Exception
     */
    public LwTownGouDianFaxingDto findByPrimaryKey(String townCode,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownGouDianFaxingAction blLwTownGouDianFaxingAction = new BLLwTownGouDianFaxingAction();
        //����DTO
        LwTownGouDianFaxingDto lwTownGouDianFaxingDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwTownGouDianFaxingDto = blLwTownGouDianFaxingAction.findByPrimaryKey(dbManager,townCode, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwTownGouDianFaxingDto;
    }

    /**
     * ��������ѯ��������
     * @param conditions ��ѯ����
     * @param pageNo ҳ��
     * @param rowsPerPage ÿҳ������
     * @return PageRecord ��ѯ��һҳ�Ľ��
     * @throws Exception
     */
    public PageRecord findByConditions(String conditions,int pageNo,int rowsPerPage)
        throws Exception{
        PageRecord pageRecord = new PageRecord(0,pageNo,1,rowsPerPage,new ArrayList());

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownGouDianFaxingAction blLwTownGouDianFaxingAction = new BLLwTownGouDianFaxingAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwTownGouDianFaxingAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param conditions ��ѯ����
     * @return Collection ����lwTownGouDianFaxingDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownGouDianFaxingAction blLwTownGouDianFaxingAction = new BLLwTownGouDianFaxingAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwTownGouDianFaxingAction.findByConditions(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return collection;
    }

    /**
     * ��ѯ����ģ����ѯ�����ļ�¼��
     * @param conditions conditions
     * @return ����ģ����ѯ�����ļ�¼��
     * @throws Exception
     */
    public int getCount(String conditions) 
        throws Exception{
        int rowCount=0;
        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownGouDianFaxingAction blLwTownGouDianFaxingAction = new BLLwTownGouDianFaxingAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwTownGouDianFaxingAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
