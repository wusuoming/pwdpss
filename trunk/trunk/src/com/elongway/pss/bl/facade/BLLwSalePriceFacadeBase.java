package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSalePriceDto;
import com.elongway.pss.bl.action.domain.BLLwSalePriceAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWSalePrice-���۵�۱��ҵ���߼�����Facade����<br>
 */
public class BLLwSalePriceFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwSalePriceFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwSalePriceFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void insert(LwSalePriceDto lwSalePriceDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwSalePriceAction.insert(dbManager,lwSalePriceDto);
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
     * @param powerClass �õ����
     * @param priceCategory ��۷���
     * @param voltageBegin ��ʼ��ѹ
     * @param voltageEnd ��ֹ��ѹ
     * @param materialsType ԭ������
     * @throws Exception
     */
    public void delete(String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwSalePriceAction.delete(dbManager,powerClass, priceCategory, voltageBegin, voltageEnd, materialsType);
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
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwSalePriceAction.deleteByConditions(dbManager,conditions);
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
     * @param lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public void update(LwSalePriceDto lwSalePriceDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwSalePriceAction.update(dbManager,lwSalePriceDto);
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
     * @param powerClass �õ����
     * @param priceCategory ��۷���
     * @param voltageBegin ��ʼ��ѹ
     * @param voltageEnd ��ֹ��ѹ
     * @param materialsType ԭ������
     * @return lwSalePriceDto lwSalePriceDto
     * @throws Exception
     */
    public LwSalePriceDto findByPrimaryKey(String powerClass,String priceCategory,double voltageBegin,double voltageEnd,String materialsType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        //����DTO
        LwSalePriceDto lwSalePriceDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwSalePriceDto = blLwSalePriceAction.findByPrimaryKey(dbManager,powerClass, priceCategory, voltageBegin, voltageEnd, materialsType);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwSalePriceDto;
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
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwSalePriceAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwSalePriceDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwSalePriceAction.findByConditions(dbManager,conditions);
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
        BLLwSalePriceAction blLwSalePriceAction = new BLLwSalePriceAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwSalePriceAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
