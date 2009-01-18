package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorDto;
import com.elongway.pss.bl.action.domain.BLLwTownIndicatorAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownIndicator-ֱ������ָ���¼���ҵ���߼�����Facade����<br>
 */
public class BLLwTownIndicatorFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwTownIndicatorFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public void insert(LwTownIndicatorDto lwTownIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwTownIndicatorAction.insert(dbManager,lwTownIndicatorDto);
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
     * @param userNo ����
     * @param statMonth ����
     * @throws Exception
     */
    public void delete(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwTownIndicatorAction.delete(dbManager,userNo, statMonth);
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
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwTownIndicatorAction.deleteByConditions(dbManager,conditions);
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
     * @param lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public void update(LwTownIndicatorDto lwTownIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwTownIndicatorAction.update(dbManager,lwTownIndicatorDto);
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
     * @param userNo ����
     * @param statMonth ����
     * @return lwTownIndicatorDto lwTownIndicatorDto
     * @throws Exception
     */
    public LwTownIndicatorDto findByPrimaryKey(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        //����DTO
        LwTownIndicatorDto lwTownIndicatorDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwTownIndicatorDto = blLwTownIndicatorAction.findByPrimaryKey(dbManager,userNo, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwTownIndicatorDto;
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
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwTownIndicatorAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwTownIndicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwTownIndicatorAction.findByConditions(dbManager,conditions);
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
        BLLwTownIndicatorAction blLwTownIndicatorAction = new BLLwTownIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwTownIndicatorAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
