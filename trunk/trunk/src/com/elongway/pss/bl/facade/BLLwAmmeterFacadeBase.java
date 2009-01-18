package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterDto;
import com.elongway.pss.bl.action.domain.BLLwAmmeterAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeter-�����Ϣ���ҵ���߼�����Facade����<br>
 */
public class BLLwAmmeterFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public void insert(LwAmmeterDto lwAmmeterDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterAction blLwAmmeterAction = new BLLwAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwAmmeterAction.insert(dbManager,lwAmmeterDto);
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
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterAction blLwAmmeterAction = new BLLwAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwAmmeterAction.delete(dbManager,ammeterNo);
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
        BLLwAmmeterAction blLwAmmeterAction = new BLLwAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwAmmeterAction.deleteByConditions(dbManager,conditions);
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
     * @param lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public void update(LwAmmeterDto lwAmmeterDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterAction blLwAmmeterAction = new BLLwAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwAmmeterAction.update(dbManager,lwAmmeterDto);
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
     * @param ammeterNo ���
     * @return lwAmmeterDto lwAmmeterDto
     * @throws Exception
     */
    public LwAmmeterDto findByPrimaryKey(String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterAction blLwAmmeterAction = new BLLwAmmeterAction();
        //����DTO
        LwAmmeterDto lwAmmeterDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwAmmeterDto = blLwAmmeterAction.findByPrimaryKey(dbManager,ammeterNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwAmmeterDto;
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
        BLLwAmmeterAction blLwAmmeterAction = new BLLwAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwAmmeterAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwAmmeterDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwAmmeterAction blLwAmmeterAction = new BLLwAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwAmmeterAction.findByConditions(dbManager,conditions);
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
        BLLwAmmeterAction blLwAmmeterAction = new BLLwAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwAmmeterAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
