package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.bl.action.domain.BLLwTownPriceSummaryAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownPriceSummary-ֱ�����Ѽ����ܱ��ҵ���߼�����Facade����<br>
 */
public class BLLwTownPriceSummaryFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwTownPriceSummaryFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public void insert(LwTownPriceSummaryDto lwTownPriceSummaryDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryAction blLwTownPriceSummaryAction = new BLLwTownPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwTownPriceSummaryAction.insert(dbManager,lwTownPriceSummaryDto);
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
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(String userNo,String lineCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryAction blLwTownPriceSummaryAction = new BLLwTownPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwTownPriceSummaryAction.delete(dbManager,userNo, lineCode);
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
        BLLwTownPriceSummaryAction blLwTownPriceSummaryAction = new BLLwTownPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwTownPriceSummaryAction.deleteByConditions(dbManager,conditions);
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
     * @param lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public void update(LwTownPriceSummaryDto lwTownPriceSummaryDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryAction blLwTownPriceSummaryAction = new BLLwTownPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwTownPriceSummaryAction.update(dbManager,lwTownPriceSummaryDto);
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
     * @param lineCode ��·����
     * @return lwTownPriceSummaryDto lwTownPriceSummaryDto
     * @throws Exception
     */
    public LwTownPriceSummaryDto findByPrimaryKey(String userNo,String lineCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryAction blLwTownPriceSummaryAction = new BLLwTownPriceSummaryAction();
        //����DTO
        LwTownPriceSummaryDto lwTownPriceSummaryDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwTownPriceSummaryDto = blLwTownPriceSummaryAction.findByPrimaryKey(dbManager,userNo, lineCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwTownPriceSummaryDto;
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
        BLLwTownPriceSummaryAction blLwTownPriceSummaryAction = new BLLwTownPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwTownPriceSummaryAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwTownPriceSummaryDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryAction blLwTownPriceSummaryAction = new BLLwTownPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwTownPriceSummaryAction.findByConditions(dbManager,conditions);
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
        BLLwTownPriceSummaryAction blLwTownPriceSummaryAction = new BLLwTownPriceSummaryAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwTownPriceSummaryAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
   
}
