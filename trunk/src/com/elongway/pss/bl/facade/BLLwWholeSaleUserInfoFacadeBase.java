package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleUserInfoDto;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleUserInfoAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleUserInfo-�����û���Ϣ���ҵ���߼�����Facade����<br>
 */
public class BLLwWholeSaleUserInfoFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleUserInfoFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleUserInfoFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwWholeSaleUserInfoDto lwWholeSaleUserInfoDto
     * @throws Exception
     */
    public void insert(LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleUserInfoAction blLwWholeSaleUserInfoAction = new BLLwWholeSaleUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwWholeSaleUserInfoAction.insert(dbManager,lwWholeSaleUserInfoDto);
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
     * @throws Exception
     */
    public void delete(String userNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleUserInfoAction blLwWholeSaleUserInfoAction = new BLLwWholeSaleUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwWholeSaleUserInfoAction.delete(dbManager,userNo);
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
        BLLwWholeSaleUserInfoAction blLwWholeSaleUserInfoAction = new BLLwWholeSaleUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwWholeSaleUserInfoAction.deleteByConditions(dbManager,conditions);
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
     * @param lwWholeSaleUserInfoDto lwWholeSaleUserInfoDto
     * @throws Exception
     */
    public void update(LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleUserInfoAction blLwWholeSaleUserInfoAction = new BLLwWholeSaleUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwWholeSaleUserInfoAction.update(dbManager,lwWholeSaleUserInfoDto);
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
     * @return lwWholeSaleUserInfoDto lwWholeSaleUserInfoDto
     * @throws Exception
     */
    public LwWholeSaleUserInfoDto findByPrimaryKey(String userNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleUserInfoAction blLwWholeSaleUserInfoAction = new BLLwWholeSaleUserInfoAction();
        //����DTO
        LwWholeSaleUserInfoDto lwWholeSaleUserInfoDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwWholeSaleUserInfoDto = blLwWholeSaleUserInfoAction.findByPrimaryKey(dbManager,userNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwWholeSaleUserInfoDto;
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
        BLLwWholeSaleUserInfoAction blLwWholeSaleUserInfoAction = new BLLwWholeSaleUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwWholeSaleUserInfoAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwWholeSaleUserInfoDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwWholeSaleUserInfoAction blLwWholeSaleUserInfoAction = new BLLwWholeSaleUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwWholeSaleUserInfoAction.findByConditions(dbManager,conditions);
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
        BLLwWholeSaleUserInfoAction blLwWholeSaleUserInfoAction = new BLLwWholeSaleUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwWholeSaleUserInfoAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
