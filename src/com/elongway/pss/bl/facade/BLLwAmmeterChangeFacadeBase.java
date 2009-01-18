package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterChangeDto;
import com.elongway.pss.bl.action.domain.BLLwAmmeterChangeAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeterChange-�������Ϣ��ҵ���߼�����Facade����<br>
 */
public class BLLwAmmeterChangeFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterChangeFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterChangeFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public void insert(LwAmmeterChangeDto lwAmmeterChangeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwAmmeterChangeAction.insert(dbManager,lwAmmeterChangeDto);
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
     * @param id ���
     * @throws Exception
     */
    public void delete(String id)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwAmmeterChangeAction.delete(dbManager,id);
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
        BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwAmmeterChangeAction.deleteByConditions(dbManager,conditions);
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
     * @param lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public void update(LwAmmeterChangeDto lwAmmeterChangeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwAmmeterChangeAction.update(dbManager,lwAmmeterChangeDto);
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
     * @param id ���
     * @return lwAmmeterChangeDto lwAmmeterChangeDto
     * @throws Exception
     */
    public LwAmmeterChangeDto findByPrimaryKey(String id)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();
        //����DTO
        LwAmmeterChangeDto lwAmmeterChangeDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwAmmeterChangeDto = blLwAmmeterChangeAction.findByPrimaryKey(dbManager,id);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwAmmeterChangeDto;
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
        BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwAmmeterChangeAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwAmmeterChangeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwAmmeterChangeAction.findByConditions(dbManager,conditions);
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
        BLLwAmmeterChangeAction blLwAmmeterChangeAction = new BLLwAmmeterChangeAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwAmmeterChangeAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
