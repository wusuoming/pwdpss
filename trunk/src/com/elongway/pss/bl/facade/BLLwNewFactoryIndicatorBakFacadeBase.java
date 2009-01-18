package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwNewFactoryIndicatorBakDto;
import com.elongway.pss.bl.action.domain.BLLwNewFactoryIndicatorBakAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWNewFactoryIndicatorBak-��ҵ�µ��ָ�뱸�ݱ��ҵ���߼�����Facade����<br>
 */
public class BLLwNewFactoryIndicatorBakFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwNewFactoryIndicatorBakFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwNewFactoryIndicatorBakFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public void insert(LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwNewFactoryIndicatorBakAction blLwNewFactoryIndicatorBakAction = new BLLwNewFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwNewFactoryIndicatorBakAction.insert(dbManager,lwNewFactoryIndicatorBakDto);
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
        BLLwNewFactoryIndicatorBakAction blLwNewFactoryIndicatorBakAction = new BLLwNewFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwNewFactoryIndicatorBakAction.delete(dbManager,userNo, statMonth, ammeterNo);
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
        BLLwNewFactoryIndicatorBakAction blLwNewFactoryIndicatorBakAction = new BLLwNewFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwNewFactoryIndicatorBakAction.deleteByConditions(dbManager,conditions);
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
     * @param lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public void update(LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwNewFactoryIndicatorBakAction blLwNewFactoryIndicatorBakAction = new BLLwNewFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwNewFactoryIndicatorBakAction.update(dbManager,lwNewFactoryIndicatorBakDto);
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
     * @return lwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto
     * @throws Exception
     */
    public LwNewFactoryIndicatorBakDto findByPrimaryKey(String userNo,String statMonth,String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwNewFactoryIndicatorBakAction blLwNewFactoryIndicatorBakAction = new BLLwNewFactoryIndicatorBakAction();
        //����DTO
        LwNewFactoryIndicatorBakDto lwNewFactoryIndicatorBakDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwNewFactoryIndicatorBakDto = blLwNewFactoryIndicatorBakAction.findByPrimaryKey(dbManager,userNo, statMonth, ammeterNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwNewFactoryIndicatorBakDto;
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
        BLLwNewFactoryIndicatorBakAction blLwNewFactoryIndicatorBakAction = new BLLwNewFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwNewFactoryIndicatorBakAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwNewFactoryIndicatorBakDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwNewFactoryIndicatorBakAction blLwNewFactoryIndicatorBakAction = new BLLwNewFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwNewFactoryIndicatorBakAction.findByConditions(dbManager,conditions);
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
        BLLwNewFactoryIndicatorBakAction blLwNewFactoryIndicatorBakAction = new BLLwNewFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwNewFactoryIndicatorBakAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
