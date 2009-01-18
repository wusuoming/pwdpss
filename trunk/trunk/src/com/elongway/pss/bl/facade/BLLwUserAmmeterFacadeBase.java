package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserAmmeterDto;
import com.elongway.pss.bl.action.domain.BLLwUserAmmeterAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWUserAmmeter-�û������ձ��ҵ���߼�����Facade����<br>
 */
public class BLLwUserAmmeterFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwUserAmmeterFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwUserAmmeterFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public void insert(LwUserAmmeterDto lwUserAmmeterDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwUserAmmeterAction blLwUserAmmeterAction = new BLLwUserAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwUserAmmeterAction.insert(dbManager,lwUserAmmeterDto);
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
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(String userNo,String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwUserAmmeterAction blLwUserAmmeterAction = new BLLwUserAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwUserAmmeterAction.delete(dbManager,userNo, ammeterNo);
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
        BLLwUserAmmeterAction blLwUserAmmeterAction = new BLLwUserAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwUserAmmeterAction.deleteByConditions(dbManager,conditions);
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
     * @param lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public void update(LwUserAmmeterDto lwUserAmmeterDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwUserAmmeterAction blLwUserAmmeterAction = new BLLwUserAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwUserAmmeterAction.update(dbManager,lwUserAmmeterDto);
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
     * @param ammeterNo ���
     * @return lwUserAmmeterDto lwUserAmmeterDto
     * @throws Exception
     */
    public LwUserAmmeterDto findByPrimaryKey(String userNo,String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwUserAmmeterAction blLwUserAmmeterAction = new BLLwUserAmmeterAction();
        //����DTO
        LwUserAmmeterDto lwUserAmmeterDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwUserAmmeterDto = blLwUserAmmeterAction.findByPrimaryKey(dbManager,userNo, ammeterNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwUserAmmeterDto;
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
        BLLwUserAmmeterAction blLwUserAmmeterAction = new BLLwUserAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwUserAmmeterAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwUserAmmeterDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwUserAmmeterAction blLwUserAmmeterAction = new BLLwUserAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwUserAmmeterAction.findByConditions(dbManager,conditions);
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
        BLLwUserAmmeterAction blLwUserAmmeterAction = new BLLwUserAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwUserAmmeterAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
