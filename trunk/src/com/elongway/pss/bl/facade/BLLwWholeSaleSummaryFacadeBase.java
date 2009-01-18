package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleSummaryDto;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleSummaryAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleSummary-���۵�Ѽ����ܱ��ҵ���߼�����Facade����<br>
 */
public class BLLwWholeSaleSummaryFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleSummaryFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleSummaryFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public void insert(LwWholeSaleSummaryDto lwWholeSaleSummaryDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleSummaryAction blLwWholeSaleSummaryAction = new BLLwWholeSaleSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwWholeSaleSummaryAction.insert(dbManager,lwWholeSaleSummaryDto);
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
        BLLwWholeSaleSummaryAction blLwWholeSaleSummaryAction = new BLLwWholeSaleSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwWholeSaleSummaryAction.delete(dbManager,lineCode, statMonth);
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
        BLLwWholeSaleSummaryAction blLwWholeSaleSummaryAction = new BLLwWholeSaleSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwWholeSaleSummaryAction.deleteByConditions(dbManager,conditions);
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
     * @param lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public void update(LwWholeSaleSummaryDto lwWholeSaleSummaryDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleSummaryAction blLwWholeSaleSummaryAction = new BLLwWholeSaleSummaryAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwWholeSaleSummaryAction.update(dbManager,lwWholeSaleSummaryDto);
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
     * @return lwWholeSaleSummaryDto lwWholeSaleSummaryDto
     * @throws Exception
     */
    public LwWholeSaleSummaryDto findByPrimaryKey(String lineCode,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleSummaryAction blLwWholeSaleSummaryAction = new BLLwWholeSaleSummaryAction();
        //����DTO
        LwWholeSaleSummaryDto lwWholeSaleSummaryDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwWholeSaleSummaryDto = blLwWholeSaleSummaryAction.findByPrimaryKey(dbManager,lineCode, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwWholeSaleSummaryDto;
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
        BLLwWholeSaleSummaryAction blLwWholeSaleSummaryAction = new BLLwWholeSaleSummaryAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwWholeSaleSummaryAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwWholeSaleSummaryDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwWholeSaleSummaryAction blLwWholeSaleSummaryAction = new BLLwWholeSaleSummaryAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwWholeSaleSummaryAction.findByConditions(dbManager,conditions);
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
        BLLwWholeSaleSummaryAction blLwWholeSaleSummaryAction = new BLLwWholeSaleSummaryAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwWholeSaleSummaryAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
