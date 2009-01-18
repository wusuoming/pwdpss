package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwLineAmmeterDto;
import com.elongway.pss.bl.action.domain.BLLwLineAmmeterAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWLineAmmeter-��·�����ձ��ҵ���߼�����Facade����<br>
 */
public class BLLwLineAmmeterFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwLineAmmeterFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwLineAmmeterFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public void insert(LwLineAmmeterDto lwLineAmmeterDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineAmmeterAction blLwLineAmmeterAction = new BLLwLineAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwLineAmmeterAction.insert(dbManager,lwLineAmmeterDto);
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
     * @param lineCode ��·����
     * @param ammeterNo ���
     * @throws Exception
     */
    public void delete(String lineCode,String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineAmmeterAction blLwLineAmmeterAction = new BLLwLineAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwLineAmmeterAction.delete(dbManager,lineCode, ammeterNo);
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
        BLLwLineAmmeterAction blLwLineAmmeterAction = new BLLwLineAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwLineAmmeterAction.deleteByConditions(dbManager,conditions);
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
     * @param lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public void update(LwLineAmmeterDto lwLineAmmeterDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineAmmeterAction blLwLineAmmeterAction = new BLLwLineAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwLineAmmeterAction.update(dbManager,lwLineAmmeterDto);
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
     * @param lineCode ��·����
     * @param ammeterNo ���
     * @return lwLineAmmeterDto lwLineAmmeterDto
     * @throws Exception
     */
    public LwLineAmmeterDto findByPrimaryKey(String lineCode,String ammeterNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwLineAmmeterAction blLwLineAmmeterAction = new BLLwLineAmmeterAction();
        //����DTO
        LwLineAmmeterDto lwLineAmmeterDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwLineAmmeterDto = blLwLineAmmeterAction.findByPrimaryKey(dbManager,lineCode, ammeterNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwLineAmmeterDto;
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
        BLLwLineAmmeterAction blLwLineAmmeterAction = new BLLwLineAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwLineAmmeterAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwLineAmmeterDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwLineAmmeterAction blLwLineAmmeterAction = new BLLwLineAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwLineAmmeterAction.findByConditions(dbManager,conditions);
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
        BLLwLineAmmeterAction blLwLineAmmeterAction = new BLLwLineAmmeterAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwLineAmmeterAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
