package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.bl.action.domain.BLLwProrateAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWProrate-������̯���ҵ���߼�����Facade����<br>
 */
public class BLLwProrateFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwProrateFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwProrateFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwProrateDto lwProrateDto
     * @throws Exception
     */
    public void insert(LwProrateDto lwProrateDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwProrateAction blLwProrateAction = new BLLwProrateAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwProrateAction.insert(dbManager,lwProrateDto);
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
        BLLwProrateAction blLwProrateAction = new BLLwProrateAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwProrateAction.delete(dbManager,userNo);
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
        BLLwProrateAction blLwProrateAction = new BLLwProrateAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwProrateAction.deleteByConditions(dbManager,conditions);
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
     * @param lwProrateDto lwProrateDto
     * @throws Exception
     */
    public void update(LwProrateDto lwProrateDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwProrateAction blLwProrateAction = new BLLwProrateAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwProrateAction.update(dbManager,lwProrateDto);
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
     * @return lwProrateDto lwProrateDto
     * @throws Exception
     */
    public LwProrateDto findByPrimaryKey(String userNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwProrateAction blLwProrateAction = new BLLwProrateAction();
        //����DTO
        LwProrateDto lwProrateDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwProrateDto = blLwProrateAction.findByPrimaryKey(dbManager,userNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwProrateDto;
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
        BLLwProrateAction blLwProrateAction = new BLLwProrateAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwProrateAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwProrateDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwProrateAction blLwProrateAction = new BLLwProrateAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwProrateAction.findByConditions(dbManager,conditions);
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
        BLLwProrateAction blLwProrateAction = new BLLwProrateAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwProrateAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }

}
