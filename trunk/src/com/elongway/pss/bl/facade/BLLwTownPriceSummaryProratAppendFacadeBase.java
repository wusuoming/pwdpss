package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;
import com.elongway.pss.bl.action.domain.BLLwTownPriceSummaryProratAppendAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownPriceSummaryProrateAppend-ֱ����׷�ӵ�Ѽ����ܱ��ҵ���߼�����Facade����<br>
 */
public class BLLwTownPriceSummaryProratAppendFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownPriceSummaryProratAppendFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwTownPriceSummaryProratAppendFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public void insert(LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryProratAppendAction blLwTownPriceSummaryProratAppendAction = new BLLwTownPriceSummaryProratAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwTownPriceSummaryProratAppendAction.insert(dbManager,lwTownPriceSummaryProratAppendDto);
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
     * @param statMonth ͳ������
     * @throws Exception
     */
    public void delete(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryProratAppendAction blLwTownPriceSummaryProratAppendAction = new BLLwTownPriceSummaryProratAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwTownPriceSummaryProratAppendAction.delete(dbManager,userNo, statMonth);
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
        BLLwTownPriceSummaryProratAppendAction blLwTownPriceSummaryProratAppendAction = new BLLwTownPriceSummaryProratAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwTownPriceSummaryProratAppendAction.deleteByConditions(dbManager,conditions);
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
     * @param lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public void update(LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryProratAppendAction blLwTownPriceSummaryProratAppendAction = new BLLwTownPriceSummaryProratAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwTownPriceSummaryProratAppendAction.update(dbManager,lwTownPriceSummaryProratAppendDto);
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
     * @param statMonth ͳ������
     * @return lwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto
     * @throws Exception
     */
    public LwTownPriceSummaryProratAppendDto findByPrimaryKey(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryProratAppendAction blLwTownPriceSummaryProratAppendAction = new BLLwTownPriceSummaryProratAppendAction();
        //����DTO
        LwTownPriceSummaryProratAppendDto lwTownPriceSummaryProratAppendDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwTownPriceSummaryProratAppendDto = blLwTownPriceSummaryProratAppendAction.findByPrimaryKey(dbManager,userNo, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwTownPriceSummaryProratAppendDto;
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
        BLLwTownPriceSummaryProratAppendAction blLwTownPriceSummaryProratAppendAction = new BLLwTownPriceSummaryProratAppendAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwTownPriceSummaryProratAppendAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwTownPriceSummaryProratAppendDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownPriceSummaryProratAppendAction blLwTownPriceSummaryProratAppendAction = new BLLwTownPriceSummaryProratAppendAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwTownPriceSummaryProratAppendAction.findByConditions(dbManager,conditions);
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
        BLLwTownPriceSummaryProratAppendAction blLwTownPriceSummaryProratAppendAction = new BLLwTownPriceSummaryProratAppendAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwTownPriceSummaryProratAppendAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
