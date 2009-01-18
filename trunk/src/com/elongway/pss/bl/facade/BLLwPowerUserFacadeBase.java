package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.bl.action.domain.BLLwPowerUserAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerUser-�õ��û���Ϣ���ҵ���߼�����Facade����<br>
 */
public class BLLwPowerUserFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwPowerUserFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwPowerUserFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public void insert(LwPowerUserDto lwPowerUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerUserAction blLwPowerUserAction = new BLLwPowerUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwPowerUserAction.insert(dbManager,lwPowerUserDto);
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
        BLLwPowerUserAction blLwPowerUserAction = new BLLwPowerUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwPowerUserAction.delete(dbManager,userNo);
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
        BLLwPowerUserAction blLwPowerUserAction = new BLLwPowerUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwPowerUserAction.deleteByConditions(dbManager,conditions);
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
     * @param lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public void update(LwPowerUserDto lwPowerUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerUserAction blLwPowerUserAction = new BLLwPowerUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwPowerUserAction.update(dbManager,lwPowerUserDto);
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
     * @return lwPowerUserDto lwPowerUserDto
     * @throws Exception
     */
    public LwPowerUserDto findByPrimaryKey(String userNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerUserAction blLwPowerUserAction = new BLLwPowerUserAction();
        //����DTO
        LwPowerUserDto lwPowerUserDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwPowerUserDto = blLwPowerUserAction.findByPrimaryKey(dbManager,userNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwPowerUserDto;
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
        BLLwPowerUserAction blLwPowerUserAction = new BLLwPowerUserAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwPowerUserAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwPowerUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwPowerUserAction blLwPowerUserAction = new BLLwPowerUserAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwPowerUserAction.findByConditions(dbManager,conditions);
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
        BLLwPowerUserAction blLwPowerUserAction = new BLLwPowerUserAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwPowerUserAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
