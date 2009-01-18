package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAmmeterIndicatorDto;
import com.elongway.pss.bl.action.domain.BLLwAmmeterIndicatorAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWAmmeterIndicator-�����¼���ҵ���߼�����Facade����<br>
 */
public class BLLwAmmeterIndicatorFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwAmmeterIndicatorFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwAmmeterIndicatorFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public void insert(LwAmmeterIndicatorDto lwAmmeterIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterIndicatorAction blLwAmmeterIndicatorAction = new BLLwAmmeterIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwAmmeterIndicatorAction.insert(dbManager,lwAmmeterIndicatorDto);
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
     * @param serialNo ���
     * @throws Exception
     */
    public void delete(String serialNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterIndicatorAction blLwAmmeterIndicatorAction = new BLLwAmmeterIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwAmmeterIndicatorAction.delete(dbManager,serialNo);
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
        BLLwAmmeterIndicatorAction blLwAmmeterIndicatorAction = new BLLwAmmeterIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwAmmeterIndicatorAction.deleteByConditions(dbManager,conditions);
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
     * @param lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public void update(LwAmmeterIndicatorDto lwAmmeterIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterIndicatorAction blLwAmmeterIndicatorAction = new BLLwAmmeterIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwAmmeterIndicatorAction.update(dbManager,lwAmmeterIndicatorDto);
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
     * @param serialNo ���
     * @return lwAmmeterIndicatorDto lwAmmeterIndicatorDto
     * @throws Exception
     */
    public LwAmmeterIndicatorDto findByPrimaryKey(String serialNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAmmeterIndicatorAction blLwAmmeterIndicatorAction = new BLLwAmmeterIndicatorAction();
        //����DTO
        LwAmmeterIndicatorDto lwAmmeterIndicatorDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwAmmeterIndicatorDto = blLwAmmeterIndicatorAction.findByPrimaryKey(dbManager,serialNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwAmmeterIndicatorDto;
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
        BLLwAmmeterIndicatorAction blLwAmmeterIndicatorAction = new BLLwAmmeterIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwAmmeterIndicatorAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwAmmeterIndicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwAmmeterIndicatorAction blLwAmmeterIndicatorAction = new BLLwAmmeterIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwAmmeterIndicatorAction.findByConditions(dbManager,conditions);
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
        BLLwAmmeterIndicatorAction blLwAmmeterIndicatorAction = new BLLwAmmeterIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwAmmeterIndicatorAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
