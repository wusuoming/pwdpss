package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.TransforDto;
import com.elongway.pss.bl.action.domain.BLTransforAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����Transfor-��ѹ����Ϣ��ҵ���߼�����Facade����<br>
 */
public class BLTransforFacadeBase{
    private static Logger logger = Logger.getLogger(BLTransforFacadeBase.class);

    /**
     * ���캯��
     */
    public BLTransforFacadeBase(){
    }

    /**
     * ����һ������
     * @param transforDto transforDto
     * @throws Exception
     */
    public void insert(TransforDto transforDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLTransforAction blTransforAction = new BLTransforAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blTransforAction.insert(dbManager,transforDto);
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
     * @param transforName ��ѹ������
     * @throws Exception
     */
    public void delete(String transforName)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLTransforAction blTransforAction = new BLTransforAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blTransforAction.delete(dbManager,transforName);
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
        BLTransforAction blTransforAction = new BLTransforAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blTransforAction.deleteByConditions(dbManager,conditions);
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
     * @param transforDto transforDto
     * @throws Exception
     */
    public void update(TransforDto transforDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLTransforAction blTransforAction = new BLTransforAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blTransforAction.update(dbManager,transforDto);
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
     * @param transforName ��ѹ������
     * @return transforDto transforDto
     * @throws Exception
     */
    public TransforDto findByPrimaryKey(String transforName)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLTransforAction blTransforAction = new BLTransforAction();
        //����DTO
        TransforDto transforDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            transforDto = blTransforAction.findByPrimaryKey(dbManager,transforName);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return transforDto;
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
        BLTransforAction blTransforAction = new BLTransforAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blTransforAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����transforDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLTransforAction blTransforAction = new BLTransforAction();
        try{
            dbManager.open("pssDataSource");
            collection = blTransforAction.findByConditions(dbManager,conditions);
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
        BLTransforAction blTransforAction = new BLTransforAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blTransforAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
