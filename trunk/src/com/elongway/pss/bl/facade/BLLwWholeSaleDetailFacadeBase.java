package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleDetailDto;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleDetailAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleDetail-���۷�����ϸ���ҵ���߼�����Facade����<br>
 */
public class BLLwWholeSaleDetailFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleDetailFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleDetailFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public void insert(LwWholeSaleDetailDto lwWholeSaleDetailDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleDetailAction blLwWholeSaleDetailAction = new BLLwWholeSaleDetailAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwWholeSaleDetailAction.insert(dbManager,lwWholeSaleDetailDto);
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
     * @param companyName ��˾����
     * @param inputDate ͳ������
     * @throws Exception
     */
    public void delete(String companyName,String inputDate)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleDetailAction blLwWholeSaleDetailAction = new BLLwWholeSaleDetailAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwWholeSaleDetailAction.delete(dbManager,companyName, inputDate);
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
        BLLwWholeSaleDetailAction blLwWholeSaleDetailAction = new BLLwWholeSaleDetailAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwWholeSaleDetailAction.deleteByConditions(dbManager,conditions);
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
     * @param lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public void update(LwWholeSaleDetailDto lwWholeSaleDetailDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleDetailAction blLwWholeSaleDetailAction = new BLLwWholeSaleDetailAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwWholeSaleDetailAction.update(dbManager,lwWholeSaleDetailDto);
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
     * @param companyName ��˾����
     * @param inputDate ͳ������
     * @return lwWholeSaleDetailDto lwWholeSaleDetailDto
     * @throws Exception
     */
    public LwWholeSaleDetailDto findByPrimaryKey(String companyName,String inputDate)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleDetailAction blLwWholeSaleDetailAction = new BLLwWholeSaleDetailAction();
        //����DTO
        LwWholeSaleDetailDto lwWholeSaleDetailDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwWholeSaleDetailDto = blLwWholeSaleDetailAction.findByPrimaryKey(dbManager,companyName, inputDate);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwWholeSaleDetailDto;
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
        BLLwWholeSaleDetailAction blLwWholeSaleDetailAction = new BLLwWholeSaleDetailAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwWholeSaleDetailAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwWholeSaleDetailDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwWholeSaleDetailAction blLwWholeSaleDetailAction = new BLLwWholeSaleDetailAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwWholeSaleDetailAction.findByConditions(dbManager,conditions);
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
        BLLwWholeSaleDetailAction blLwWholeSaleDetailAction = new BLLwWholeSaleDetailAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwWholeSaleDetailAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
