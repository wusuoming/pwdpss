package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerLineDto;
import com.elongway.pss.bl.action.domain.BLLwPowerLineAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerLine-��·��Ϣ����ҵ���߼�����Facade����<br>
 */
public class BLLwPowerLineFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwPowerLineFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwPowerLineFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public void insert(LwPowerLineDto lwPowerLineDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerLineAction blLwPowerLineAction = new BLLwPowerLineAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwPowerLineAction.insert(dbManager,lwPowerLineDto);
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
     * @throws Exception
     */
    public void delete(String lineCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerLineAction blLwPowerLineAction = new BLLwPowerLineAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwPowerLineAction.delete(dbManager,lineCode);
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
        BLLwPowerLineAction blLwPowerLineAction = new BLLwPowerLineAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwPowerLineAction.deleteByConditions(dbManager,conditions);
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
     * @param lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public void update(LwPowerLineDto lwPowerLineDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerLineAction blLwPowerLineAction = new BLLwPowerLineAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwPowerLineAction.update(dbManager,lwPowerLineDto);
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
     * @return lwPowerLineDto lwPowerLineDto
     * @throws Exception
     */
    public LwPowerLineDto findByPrimaryKey(String lineCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerLineAction blLwPowerLineAction = new BLLwPowerLineAction();
        //����DTO
        LwPowerLineDto lwPowerLineDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwPowerLineDto = blLwPowerLineAction.findByPrimaryKey(dbManager,lineCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwPowerLineDto;
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
        BLLwPowerLineAction blLwPowerLineAction = new BLLwPowerLineAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwPowerLineAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwPowerLineDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwPowerLineAction blLwPowerLineAction = new BLLwPowerLineAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwPowerLineAction.findByConditions(dbManager,conditions);
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
        BLLwPowerLineAction blLwPowerLineAction = new BLLwPowerLineAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwPowerLineAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}