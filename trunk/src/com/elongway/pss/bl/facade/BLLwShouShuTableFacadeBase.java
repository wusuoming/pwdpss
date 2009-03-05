package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwShouShuTableDto;
import com.elongway.pss.bl.action.domain.BLLwShouShuTableAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwShouShuTable-������ñ��ҵ���߼�����Facade����<br>
 */
public class BLLwShouShuTableFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwShouShuTableFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwShouShuTableFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public void insert(LwShouShuTableDto lwShouShuTableDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwShouShuTableAction blLwShouShuTableAction = new BLLwShouShuTableAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwShouShuTableAction.insert(dbManager,lwShouShuTableDto);
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
     * @param month �·�
     * @param feeType �������
     * @throws Exception
     */
    public void delete(String month,String feeType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwShouShuTableAction blLwShouShuTableAction = new BLLwShouShuTableAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwShouShuTableAction.delete(dbManager,month, feeType);
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
        BLLwShouShuTableAction blLwShouShuTableAction = new BLLwShouShuTableAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwShouShuTableAction.deleteByConditions(dbManager,conditions);
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
     * @param lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public void update(LwShouShuTableDto lwShouShuTableDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwShouShuTableAction blLwShouShuTableAction = new BLLwShouShuTableAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwShouShuTableAction.update(dbManager,lwShouShuTableDto);
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
     * @param month �·�
     * @param feeType �������
     * @return lwShouShuTableDto lwShouShuTableDto
     * @throws Exception
     */
    public LwShouShuTableDto findByPrimaryKey(String month,String feeType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwShouShuTableAction blLwShouShuTableAction = new BLLwShouShuTableAction();
        //����DTO
        LwShouShuTableDto lwShouShuTableDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwShouShuTableDto = blLwShouShuTableAction.findByPrimaryKey(dbManager,month, feeType);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwShouShuTableDto;
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
        BLLwShouShuTableAction blLwShouShuTableAction = new BLLwShouShuTableAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwShouShuTableAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwShouShuTableDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwShouShuTableAction blLwShouShuTableAction = new BLLwShouShuTableAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwShouShuTableAction.findByConditions(dbManager,conditions);
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
        BLLwShouShuTableAction blLwShouShuTableAction = new BLLwShouShuTableAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwShouShuTableAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
