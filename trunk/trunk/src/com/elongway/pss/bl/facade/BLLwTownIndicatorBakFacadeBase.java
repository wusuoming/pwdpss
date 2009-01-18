package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwTownIndicatorBakDto;
import com.elongway.pss.bl.action.domain.BLLwTownIndicatorBakAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWTownIndicatorBak-ֱ������ָ���¼���ݱ��ҵ���߼�����Facade����<br>
 */
public class BLLwTownIndicatorBakFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwTownIndicatorBakFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwTownIndicatorBakFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public void insert(LwTownIndicatorBakDto lwTownIndicatorBakDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorBakAction blLwTownIndicatorBakAction = new BLLwTownIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwTownIndicatorBakAction.insert(dbManager,lwTownIndicatorBakDto);
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
        BLLwTownIndicatorBakAction blLwTownIndicatorBakAction = new BLLwTownIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwTownIndicatorBakAction.delete(dbManager,userNo, statMonth);
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
        BLLwTownIndicatorBakAction blLwTownIndicatorBakAction = new BLLwTownIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwTownIndicatorBakAction.deleteByConditions(dbManager,conditions);
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
     * @param lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public void update(LwTownIndicatorBakDto lwTownIndicatorBakDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorBakAction blLwTownIndicatorBakAction = new BLLwTownIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwTownIndicatorBakAction.update(dbManager,lwTownIndicatorBakDto);
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
     * @return lwTownIndicatorBakDto lwTownIndicatorBakDto
     * @throws Exception
     */
    public LwTownIndicatorBakDto findByPrimaryKey(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwTownIndicatorBakAction blLwTownIndicatorBakAction = new BLLwTownIndicatorBakAction();
        //����DTO
        LwTownIndicatorBakDto lwTownIndicatorBakDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwTownIndicatorBakDto = blLwTownIndicatorBakAction.findByPrimaryKey(dbManager,userNo, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwTownIndicatorBakDto;
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
        BLLwTownIndicatorBakAction blLwTownIndicatorBakAction = new BLLwTownIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwTownIndicatorBakAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwTownIndicatorBakDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwTownIndicatorBakAction blLwTownIndicatorBakAction = new BLLwTownIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwTownIndicatorBakAction.findByConditions(dbManager,conditions);
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
        BLLwTownIndicatorBakAction blLwTownIndicatorBakAction = new BLLwTownIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwTownIndicatorBakAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
