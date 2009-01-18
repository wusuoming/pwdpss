package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwDcompanyAction;
import com.elongway.pss.dto.domain.LwDcompanyDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWDcompany-����������ҵ���߼�����Facade����<br>
 */
public class BLLwDcompanyFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwDcompanyFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwDcompanyFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void insert(LwDcompanyDto lwDcompanyDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwDcompanyAction.insert(dbManager,lwDcompanyDto);
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
     * @param comCode ��������
     * @throws Exception
     */
    public void delete(String comCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwDcompanyAction.delete(dbManager,comCode);
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
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwDcompanyAction.deleteByConditions(dbManager,conditions);
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
     * @param lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public void update(LwDcompanyDto lwDcompanyDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwDcompanyAction.update(dbManager,lwDcompanyDto);
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
     * @param comCode ��������
     * @return lwDcompanyDto lwDcompanyDto
     * @throws Exception
     */
    public LwDcompanyDto findByPrimaryKey(String comCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        //����DTO
        LwDcompanyDto lwDcompanyDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwDcompanyDto = blLwDcompanyAction.findByPrimaryKey(dbManager,comCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwDcompanyDto;
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
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwDcompanyAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwDcompanyDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwDcompanyAction.findByConditions(dbManager,conditions);
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
        BLLwDcompanyAction blLwDcompanyAction = new BLLwDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwDcompanyAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
