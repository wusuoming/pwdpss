package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDcompanyDto;
import com.elongway.pss.bl.action.domain.BLPrpDcompanyAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWDcompany-����������ҵ���߼�����Facade����<br>
 */
public class BLPrpDcompanyFacadeBase{
    private static Logger logger = Logger.getLogger(BLPrpDcompanyFacadeBase.class);

    /**
     * ���캯��
     */
    public BLPrpDcompanyFacadeBase(){
    }

    /**
     * ����һ������
     * @param prpDcompanyDto prpDcompanyDto
     * @throws Exception
     */
    public void insert(PrpDcompanyDto prpDcompanyDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLPrpDcompanyAction blPrpDcompanyAction = new BLPrpDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blPrpDcompanyAction.insert(dbManager,prpDcompanyDto);
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
     * @param comCode ��������
     * @throws Exception
     */
    public void delete(String comCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLPrpDcompanyAction blPrpDcompanyAction = new BLPrpDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blPrpDcompanyAction.delete(dbManager,comCode);
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
        BLPrpDcompanyAction blPrpDcompanyAction = new BLPrpDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blPrpDcompanyAction.deleteByConditions(dbManager,conditions);
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
     * @param prpDcompanyDto prpDcompanyDto
     * @throws Exception
     */
    public void update(PrpDcompanyDto prpDcompanyDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLPrpDcompanyAction blPrpDcompanyAction = new BLPrpDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blPrpDcompanyAction.update(dbManager,prpDcompanyDto);
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
     * @param comCode ��������
     * @return prpDcompanyDto prpDcompanyDto
     * @throws Exception
     */
    public PrpDcompanyDto findByPrimaryKey(String comCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLPrpDcompanyAction blPrpDcompanyAction = new BLPrpDcompanyAction();
        //����DTO
        PrpDcompanyDto prpDcompanyDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            prpDcompanyDto = blPrpDcompanyAction.findByPrimaryKey(dbManager,comCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return prpDcompanyDto;
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
        BLPrpDcompanyAction blPrpDcompanyAction = new BLPrpDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blPrpDcompanyAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����prpDcompanyDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLPrpDcompanyAction blPrpDcompanyAction = new BLPrpDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            collection = blPrpDcompanyAction.findByConditions(dbManager,conditions);
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
        BLPrpDcompanyAction blPrpDcompanyAction = new BLPrpDcompanyAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blPrpDcompanyAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
