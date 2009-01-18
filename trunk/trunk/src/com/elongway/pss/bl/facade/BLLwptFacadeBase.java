package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;

import com.elongway.pss.bl.action.domain.BLLwptAction;
import com.elongway.pss.dto.domain.LwptDto;
import com.sinosoft.sysframework.common.datatype.PageRecord;
import com.sinosoft.sysframework.log.Logger;
import com.sinosoft.sysframework.reference.DBManager;


/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ���ǵ�ѹ��������ҵ���߼�����Facade����<br>
 */
public class BLLwptFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwptFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwptFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwptDto lwptDto
     * @throws Exception
     */
    public void insert(LwptDto lwptDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwptAction blLwptAction = new BLLwptAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwptAction.insert(dbManager,lwptDto);
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
        BLLwptAction blLwptAction = new BLLwptAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwptAction.delete(dbManager,modus);
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
        BLLwptAction blLwptAction = new BLLwptAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwptAction.deleteByConditions(dbManager,conditions);
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
     * @param lwptDto lwptDto
     * @throws Exception
     */
    public void update(LwptDto lwptDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwptAction blLwptAction = new BLLwptAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwptAction.update(dbManager,lwptDto);
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
     * @return lwptDto lwptDto
     * @throws Exception
     */
    public LwptDto findByPrimaryKey(String modus)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwptAction blLwptAction = new BLLwptAction();
        //����DTO
        LwptDto lwptDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwptDto = blLwptAction.findByPrimaryKey(dbManager,modus);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwptDto;
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
        BLLwptAction blLwptAction = new BLLwptAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwptAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwptDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwptAction blLwptAction = new BLLwptAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwptAction.findByConditions(dbManager,conditions);
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
        BLLwptAction blLwptAction = new BLLwptAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwptAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
