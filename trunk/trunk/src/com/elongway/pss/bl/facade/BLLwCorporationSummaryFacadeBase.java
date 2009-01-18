package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCorporationSummaryDto;
import com.elongway.pss.bl.action.domain.BLLwCorporationSummaryAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWCorporationSummary-��ҵ���ۼ����ܱ��ҵ���߼�����Facade����<br>
 */
public class BLLwCorporationSummaryFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwCorporationSummaryFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwCorporationSummaryFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public void insert(LwCorporationSummaryDto lwCorporationSummaryDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwCorporationSummaryAction blLwCorporationSummaryAction = new BLLwCorporationSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwCorporationSummaryAction.insert(dbManager,lwCorporationSummaryDto);
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
     * @param statMonth ͳ������
     * @throws Exception
     */
    public void delete(String lineCode,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwCorporationSummaryAction blLwCorporationSummaryAction = new BLLwCorporationSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwCorporationSummaryAction.delete(dbManager,lineCode, statMonth);
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
        BLLwCorporationSummaryAction blLwCorporationSummaryAction = new BLLwCorporationSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwCorporationSummaryAction.deleteByConditions(dbManager,conditions);
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
     * @param lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public void update(LwCorporationSummaryDto lwCorporationSummaryDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwCorporationSummaryAction blLwCorporationSummaryAction = new BLLwCorporationSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwCorporationSummaryAction.update(dbManager,lwCorporationSummaryDto);
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
     * @param statMonth ͳ������
     * @return lwCorporationSummaryDto lwCorporationSummaryDto
     * @throws Exception
     */
    public LwCorporationSummaryDto findByPrimaryKey(String lineCode,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwCorporationSummaryAction blLwCorporationSummaryAction = new BLLwCorporationSummaryAction();
        //����DTO
        LwCorporationSummaryDto lwCorporationSummaryDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwCorporationSummaryDto = blLwCorporationSummaryAction.findByPrimaryKey(dbManager,lineCode, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwCorporationSummaryDto;
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
        BLLwCorporationSummaryAction blLwCorporationSummaryAction = new BLLwCorporationSummaryAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwCorporationSummaryAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwCorporationSummaryDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwCorporationSummaryAction blLwCorporationSummaryAction = new BLLwCorporationSummaryAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwCorporationSummaryAction.findByConditions(dbManager,conditions);
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
        BLLwCorporationSummaryAction blLwCorporationSummaryAction = new BLLwCorporationSummaryAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwCorporationSummaryAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
