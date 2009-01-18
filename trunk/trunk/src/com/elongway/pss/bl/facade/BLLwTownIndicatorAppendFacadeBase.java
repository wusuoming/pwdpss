package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorAppendDto;
import com.elongway.pss.bl.action.domain.BLLwTownIndicatorAppendAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownIndicatorAppend-ֱ����׷�ӵ��ָ���¼���ҵ���߼�����Facade����<br>
 */
public class BLLwTownIndicatorAppendFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorAppendFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwTownIndicatorAppendFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public void insert(LwTownIndicatorAppendDto lwTownIndicatorAppendDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAppendAction blLwTownIndicatorAppendAction = new BLLwTownIndicatorAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwTownIndicatorAppendAction.insert(dbManager,lwTownIndicatorAppendDto);
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
        BLLwTownIndicatorAppendAction blLwTownIndicatorAppendAction = new BLLwTownIndicatorAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwTownIndicatorAppendAction.delete(dbManager,userNo, statMonth);
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
        BLLwTownIndicatorAppendAction blLwTownIndicatorAppendAction = new BLLwTownIndicatorAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwTownIndicatorAppendAction.deleteByConditions(dbManager,conditions);
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
     * @param lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public void update(LwTownIndicatorAppendDto lwTownIndicatorAppendDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAppendAction blLwTownIndicatorAppendAction = new BLLwTownIndicatorAppendAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwTownIndicatorAppendAction.update(dbManager,lwTownIndicatorAppendDto);
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
     * @return lwTownIndicatorAppendDto lwTownIndicatorAppendDto
     * @throws Exception
     */
    public LwTownIndicatorAppendDto findByPrimaryKey(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAppendAction blLwTownIndicatorAppendAction = new BLLwTownIndicatorAppendAction();
        //����DTO
        LwTownIndicatorAppendDto lwTownIndicatorAppendDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwTownIndicatorAppendDto = blLwTownIndicatorAppendAction.findByPrimaryKey(dbManager,userNo, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwTownIndicatorAppendDto;
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
        BLLwTownIndicatorAppendAction blLwTownIndicatorAppendAction = new BLLwTownIndicatorAppendAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwTownIndicatorAppendAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwTownIndicatorAppendDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownIndicatorAppendAction blLwTownIndicatorAppendAction = new BLLwTownIndicatorAppendAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwTownIndicatorAppendAction.findByConditions(dbManager,conditions);
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
        BLLwTownIndicatorAppendAction blLwTownIndicatorAppendAction = new BLLwTownIndicatorAppendAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwTownIndicatorAppendAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
