package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwCoporationUserInfoDto;
import com.elongway.pss.bl.action.domain.BLLwCoporationUserInfoAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWCoporationUserInfo-��ҵ�û���Ϣ���ҵ���߼�����Facade����<br>
 */
public class BLLwCoporationUserInfoFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwCoporationUserInfoFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwCoporationUserInfoFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public void insert(LwCoporationUserInfoDto lwCoporationUserInfoDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwCoporationUserInfoAction blLwCoporationUserInfoAction = new BLLwCoporationUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwCoporationUserInfoAction.insert(dbManager,lwCoporationUserInfoDto);
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
        BLLwCoporationUserInfoAction blLwCoporationUserInfoAction = new BLLwCoporationUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwCoporationUserInfoAction.delete(dbManager,userNo);
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
        BLLwCoporationUserInfoAction blLwCoporationUserInfoAction = new BLLwCoporationUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwCoporationUserInfoAction.deleteByConditions(dbManager,conditions);
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
     * @param lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public void update(LwCoporationUserInfoDto lwCoporationUserInfoDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwCoporationUserInfoAction blLwCoporationUserInfoAction = new BLLwCoporationUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwCoporationUserInfoAction.update(dbManager,lwCoporationUserInfoDto);
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
     * @return lwCoporationUserInfoDto lwCoporationUserInfoDto
     * @throws Exception
     */
    public LwCoporationUserInfoDto findByPrimaryKey(String userNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwCoporationUserInfoAction blLwCoporationUserInfoAction = new BLLwCoporationUserInfoAction();
        //����DTO
        LwCoporationUserInfoDto lwCoporationUserInfoDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwCoporationUserInfoDto = blLwCoporationUserInfoAction.findByPrimaryKey(dbManager,userNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwCoporationUserInfoDto;
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
        BLLwCoporationUserInfoAction blLwCoporationUserInfoAction = new BLLwCoporationUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwCoporationUserInfoAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwCoporationUserInfoDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwCoporationUserInfoAction blLwCoporationUserInfoAction = new BLLwCoporationUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwCoporationUserInfoAction.findByConditions(dbManager,conditions);
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
        BLLwCoporationUserInfoAction blLwCoporationUserInfoAction = new BLLwCoporationUserInfoAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwCoporationUserInfoAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
