package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleIndicatorDto;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleIndicatorAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleIndicator-���۵��ָ���¼���ҵ���߼�����Facade����<br>
 */
public class BLLwWholeSaleIndicatorFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleIndicatorFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleIndicatorFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public void insert(LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleIndicatorAction blLwWholeSaleIndicatorAction = new BLLwWholeSaleIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwWholeSaleIndicatorAction.insert(dbManager,lwWholeSaleIndicatorDto);
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
     * @param statMonth ����
     * @throws Exception
     */
    public void delete(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleIndicatorAction blLwWholeSaleIndicatorAction = new BLLwWholeSaleIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwWholeSaleIndicatorAction.delete(dbManager,userNo, statMonth);
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
        BLLwWholeSaleIndicatorAction blLwWholeSaleIndicatorAction = new BLLwWholeSaleIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwWholeSaleIndicatorAction.deleteByConditions(dbManager,conditions);
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
     * @param lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public void update(LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleIndicatorAction blLwWholeSaleIndicatorAction = new BLLwWholeSaleIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwWholeSaleIndicatorAction.update(dbManager,lwWholeSaleIndicatorDto);
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
     * @param statMonth ����
     * @return lwWholeSaleIndicatorDto lwWholeSaleIndicatorDto
     * @throws Exception
     */
    public LwWholeSaleIndicatorDto findByPrimaryKey(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleIndicatorAction blLwWholeSaleIndicatorAction = new BLLwWholeSaleIndicatorAction();
        //����DTO
        LwWholeSaleIndicatorDto lwWholeSaleIndicatorDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwWholeSaleIndicatorDto = blLwWholeSaleIndicatorAction.findByPrimaryKey(dbManager,userNo, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwWholeSaleIndicatorDto;
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
        BLLwWholeSaleIndicatorAction blLwWholeSaleIndicatorAction = new BLLwWholeSaleIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwWholeSaleIndicatorAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwWholeSaleIndicatorDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwWholeSaleIndicatorAction blLwWholeSaleIndicatorAction = new BLLwWholeSaleIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwWholeSaleIndicatorAction.findByConditions(dbManager,conditions);
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
        BLLwWholeSaleIndicatorAction blLwWholeSaleIndicatorAction = new BLLwWholeSaleIndicatorAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwWholeSaleIndicatorAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
