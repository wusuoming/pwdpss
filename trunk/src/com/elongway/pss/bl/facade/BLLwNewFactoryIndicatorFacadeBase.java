package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorDto;
import com.elongway.pss.bl.action.domain.BLLwNewFactoryIndicatorAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWNewFactoryIndicator-��ҵ�µ��ָ���¼���ҵ���߼�����Facade����<br>
 */
public class BLLwNewFactoryIndicatorFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwNewFactoryIndicatorFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public void insert(LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwNewFactoryIndicatorAction blLwNewFactoryIndicatorAction = new BLLwNewFactoryIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwNewFactoryIndicatorAction.insert(dbManager,lwNewFactoryIndicatorDto);
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
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(String userNo,String statMonth,String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwNewFactoryIndicatorAction blLwNewFactoryIndicatorAction = new BLLwNewFactoryIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwNewFactoryIndicatorAction.delete(dbManager,userNo, statMonth, ammeterNo);
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
        BLLwNewFactoryIndicatorAction blLwNewFactoryIndicatorAction = new BLLwNewFactoryIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwNewFactoryIndicatorAction.deleteByConditions(dbManager,conditions);
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
     * @param lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public void update(LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwNewFactoryIndicatorAction blLwNewFactoryIndicatorAction = new BLLwNewFactoryIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwNewFactoryIndicatorAction.update(dbManager,lwNewFactoryIndicatorDto);
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
     * @param ammeterNo ���
     * @return lwNewFactoryIndicatorDto lwNewFactoryIndicatorDto
     * @throws Exception
     */
    public LwNewFactoryIndicatorDto findByPrimaryKey(String userNo,String statMonth,String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwNewFactoryIndicatorAction blLwNewFactoryIndicatorAction = new BLLwNewFactoryIndicatorAction();
        //����DTO
        LwNewFactoryIndicatorDto lwNewFactoryIndicatorDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwNewFactoryIndicatorDto = blLwNewFactoryIndicatorAction.findByPrimaryKey(dbManager,userNo, statMonth, ammeterNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwNewFactoryIndicatorDto;
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
        BLLwNewFactoryIndicatorAction blLwNewFactoryIndicatorAction = new BLLwNewFactoryIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwNewFactoryIndicatorAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwNewFactoryIndicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwNewFactoryIndicatorAction blLwNewFactoryIndicatorAction = new BLLwNewFactoryIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwNewFactoryIndicatorAction.findByConditions(dbManager,conditions);
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
        BLLwNewFactoryIndicatorAction blLwNewFactoryIndicatorAction = new BLLwNewFactoryIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwNewFactoryIndicatorAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
