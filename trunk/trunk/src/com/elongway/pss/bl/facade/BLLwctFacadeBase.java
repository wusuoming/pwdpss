package com.elongway.pss.bl.facade;
import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwctAction;
import com.elongway.pss.dto.domain.LwctDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ���ǵ�����������ҵ���߼�����Facade����<br>
 */
public class BLLwctFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwctFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwctFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void insert(LwctDto lwctDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwctAction.insert(dbManager,lwctDto);
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
     * @param modus ��ʽ
     * @throws Exception
     */
    public void delete(String modus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwctAction.delete(dbManager,modus);
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
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwctAction.deleteByConditions(dbManager,conditions);
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
     * @param lwctDto lwctDto
     * @throws Exception
     */
    public void update(LwctDto lwctDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwctAction.update(dbManager,lwctDto);
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
     * @param modus ��ʽ
     * @return lwctDto lwctDto
     * @throws Exception
     */
    public LwctDto findByPrimaryKey(String modus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        //����DTO
        LwctDto lwctDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwctDto = blLwctAction.findByPrimaryKey(dbManager,modus);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwctDto;
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
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwctAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwctDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwctAction.findByConditions(dbManager,conditions);
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
        BLLwctAction blLwctAction = new BLLwctAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwctAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
