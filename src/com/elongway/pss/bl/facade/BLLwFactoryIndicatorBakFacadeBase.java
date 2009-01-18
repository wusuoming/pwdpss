package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwFactoryIndicatorBakDto;
import com.elongway.pss.bl.action.domain.BLLwFactoryIndicatorBakAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWFactoryIndicatorBak-��ҵ���ָ���¼���ݱ��ҵ���߼�����Facade����<br>
 */
public class BLLwFactoryIndicatorBakFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwFactoryIndicatorBakFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwFactoryIndicatorBakFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public void insert(LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwFactoryIndicatorBakAction blLwFactoryIndicatorBakAction = new BLLwFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwFactoryIndicatorBakAction.insert(dbManager,lwFactoryIndicatorBakDto);
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
        BLLwFactoryIndicatorBakAction blLwFactoryIndicatorBakAction = new BLLwFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwFactoryIndicatorBakAction.delete(dbManager,userNo, statMonth);
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
        BLLwFactoryIndicatorBakAction blLwFactoryIndicatorBakAction = new BLLwFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwFactoryIndicatorBakAction.deleteByConditions(dbManager,conditions);
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
     * @param lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public void update(LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwFactoryIndicatorBakAction blLwFactoryIndicatorBakAction = new BLLwFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwFactoryIndicatorBakAction.update(dbManager,lwFactoryIndicatorBakDto);
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
     * @return lwFactoryIndicatorBakDto lwFactoryIndicatorBakDto
     * @throws Exception
     */
    public LwFactoryIndicatorBakDto findByPrimaryKey(String userNo,String statMonth)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwFactoryIndicatorBakAction blLwFactoryIndicatorBakAction = new BLLwFactoryIndicatorBakAction();
        //����DTO
        LwFactoryIndicatorBakDto lwFactoryIndicatorBakDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwFactoryIndicatorBakDto = blLwFactoryIndicatorBakAction.findByPrimaryKey(dbManager,userNo, statMonth);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwFactoryIndicatorBakDto;
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
        BLLwFactoryIndicatorBakAction blLwFactoryIndicatorBakAction = new BLLwFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwFactoryIndicatorBakAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwFactoryIndicatorBakDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwFactoryIndicatorBakAction blLwFactoryIndicatorBakAction = new BLLwFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwFactoryIndicatorBakAction.findByConditions(dbManager,conditions);
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
        BLLwFactoryIndicatorBakAction blLwFactoryIndicatorBakAction = new BLLwFactoryIndicatorBakAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwFactoryIndicatorBakAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
