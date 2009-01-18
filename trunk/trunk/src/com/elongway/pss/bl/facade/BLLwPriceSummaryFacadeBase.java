package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPriceSummaryDto;
import com.elongway.pss.bl.action.domain.BLLwPriceSummaryAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPriceSummary-��Ѽ����ܱ��ҵ���߼�����Facade����<br>
 */
public class BLLwPriceSummaryFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwPriceSummaryFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwPriceSummaryFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public void insert(LwPriceSummaryDto lwPriceSummaryDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPriceSummaryAction blLwPriceSummaryAction = new BLLwPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwPriceSummaryAction.insert(dbManager,lwPriceSummaryDto);
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
        BLLwPriceSummaryAction blLwPriceSummaryAction = new BLLwPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwPriceSummaryAction.delete(dbManager,lineCode);
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
        BLLwPriceSummaryAction blLwPriceSummaryAction = new BLLwPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwPriceSummaryAction.deleteByConditions(dbManager,conditions);
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
     * @param lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public void update(LwPriceSummaryDto lwPriceSummaryDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPriceSummaryAction blLwPriceSummaryAction = new BLLwPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwPriceSummaryAction.update(dbManager,lwPriceSummaryDto);
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
     * @return lwPriceSummaryDto lwPriceSummaryDto
     * @throws Exception
     */
    public LwPriceSummaryDto findByPrimaryKey(String lineCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPriceSummaryAction blLwPriceSummaryAction = new BLLwPriceSummaryAction();
        //����DTO
        LwPriceSummaryDto lwPriceSummaryDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwPriceSummaryDto = blLwPriceSummaryAction.findByPrimaryKey(dbManager,lineCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwPriceSummaryDto;
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
        BLLwPriceSummaryAction blLwPriceSummaryAction = new BLLwPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwPriceSummaryAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwPriceSummaryDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwPriceSummaryAction blLwPriceSummaryAction = new BLLwPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwPriceSummaryAction.findByConditions(dbManager,conditions);
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
        BLLwPriceSummaryAction blLwPriceSummaryAction = new BLLwPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwPriceSummaryAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
