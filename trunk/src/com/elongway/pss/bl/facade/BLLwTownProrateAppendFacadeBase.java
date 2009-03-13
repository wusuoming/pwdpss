package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownProrateAppendDto;
import com.elongway.pss.bl.action.domain.BLLwTownProrateAppendAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownProrateAppend-������̯׷�ӱ��ҵ���߼�����Facade����<br>
 */
public class BLLwTownProrateAppendFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownProrateAppendFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwTownProrateAppendFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void insert(LwTownProrateAppendDto lwTownProrateAppendDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwTownProrateAppendAction.insert(dbManager,lwTownProrateAppendDto);
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
     * @param flag ��־
     * @throws Exception
     */
    public void delete(String userNo,String flag)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwTownProrateAppendAction.delete(dbManager,userNo, flag);
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
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwTownProrateAppendAction.deleteByConditions(dbManager,conditions);
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
     * @param lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public void update(LwTownProrateAppendDto lwTownProrateAppendDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwTownProrateAppendAction.update(dbManager,lwTownProrateAppendDto);
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
     * @param flag ��־
     * @return lwTownProrateAppendDto lwTownProrateAppendDto
     * @throws Exception
     */
    public LwTownProrateAppendDto findByPrimaryKey(String userNo,String flag)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        //����DTO
        LwTownProrateAppendDto lwTownProrateAppendDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwTownProrateAppendDto = blLwTownProrateAppendAction.findByPrimaryKey(dbManager,userNo, flag);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwTownProrateAppendDto;
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
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwTownProrateAppendAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwTownProrateAppendDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwTownProrateAppendAction.findByConditions(dbManager,conditions);
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
        BLLwTownProrateAppendAction blLwTownProrateAppendAction = new BLLwTownProrateAppendAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwTownProrateAppendAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
