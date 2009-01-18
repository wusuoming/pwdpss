package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePriceDto;
import com.elongway.pss.bl.action.domain.BLLwWholeSalePriceAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSalePrice-���ۼ۸���ҵ���߼�����Facade����<br>
 */
public class BLLwWholeSalePriceFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePriceFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSalePriceFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public void insert(LwWholeSalePriceDto lwWholeSalePriceDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSalePriceAction blLwWholeSalePriceAction = new BLLwWholeSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwWholeSalePriceAction.insert(dbManager,lwWholeSalePriceDto);
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
     * @param saleArea ��������
     * @param voltageBegin ��ʼ��ѹ
     * @throws Exception
     */
    public void delete(String saleArea,double voltageBegin)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSalePriceAction blLwWholeSalePriceAction = new BLLwWholeSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwWholeSalePriceAction.delete(dbManager,saleArea, voltageBegin);
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
        BLLwWholeSalePriceAction blLwWholeSalePriceAction = new BLLwWholeSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwWholeSalePriceAction.deleteByConditions(dbManager,conditions);
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
     * @param lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public void update(LwWholeSalePriceDto lwWholeSalePriceDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSalePriceAction blLwWholeSalePriceAction = new BLLwWholeSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwWholeSalePriceAction.update(dbManager,lwWholeSalePriceDto);
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
     * @param saleArea ��������
     * @param voltageBegin ��ʼ��ѹ
     * @return lwWholeSalePriceDto lwWholeSalePriceDto
     * @throws Exception
     */
    public LwWholeSalePriceDto findByPrimaryKey(String saleArea,double voltageBegin)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSalePriceAction blLwWholeSalePriceAction = new BLLwWholeSalePriceAction();
        //����DTO
        LwWholeSalePriceDto lwWholeSalePriceDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwWholeSalePriceDto = blLwWholeSalePriceAction.findByPrimaryKey(dbManager,saleArea, voltageBegin);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwWholeSalePriceDto;
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
        BLLwWholeSalePriceAction blLwWholeSalePriceAction = new BLLwWholeSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwWholeSalePriceAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwWholeSalePriceDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwWholeSalePriceAction blLwWholeSalePriceAction = new BLLwWholeSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwWholeSalePriceAction.findByConditions(dbManager,conditions);
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
        BLLwWholeSalePriceAction blLwWholeSalePriceAction = new BLLwWholeSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwWholeSalePriceAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
