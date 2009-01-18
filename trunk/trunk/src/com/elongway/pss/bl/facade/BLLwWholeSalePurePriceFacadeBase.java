package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSalePurePriceDto;
import com.elongway.pss.bl.action.domain.BLLwWholeSalePurePriceAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSalePurePrice-���۴���۱��ҵ���߼�����Facade����<br>
 */
public class BLLwWholeSalePurePriceFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSalePurePriceFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSalePurePriceFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public void insert(LwWholeSalePurePriceDto lwWholeSalePurePriceDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSalePurePriceAction blLwWholeSalePurePriceAction = new BLLwWholeSalePurePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwWholeSalePurePriceAction.insert(dbManager,lwWholeSalePurePriceDto);
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
     * @param voltLevel ��ѹ�ȼ�
     * @param comcode ��˾����
     * @throws Exception
     */
    public void delete(String voltLevel,String comcode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSalePurePriceAction blLwWholeSalePurePriceAction = new BLLwWholeSalePurePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwWholeSalePurePriceAction.delete(dbManager,voltLevel, comcode);
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
        BLLwWholeSalePurePriceAction blLwWholeSalePurePriceAction = new BLLwWholeSalePurePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwWholeSalePurePriceAction.deleteByConditions(dbManager,conditions);
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
     * @param lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public void update(LwWholeSalePurePriceDto lwWholeSalePurePriceDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSalePurePriceAction blLwWholeSalePurePriceAction = new BLLwWholeSalePurePriceAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwWholeSalePurePriceAction.update(dbManager,lwWholeSalePurePriceDto);
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
     * @param voltLevel ��ѹ�ȼ�
     * @param comcode ��˾����
     * @return lwWholeSalePurePriceDto lwWholeSalePurePriceDto
     * @throws Exception
     */
    public LwWholeSalePurePriceDto findByPrimaryKey(String voltLevel,String comcode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSalePurePriceAction blLwWholeSalePurePriceAction = new BLLwWholeSalePurePriceAction();
        //����DTO
        LwWholeSalePurePriceDto lwWholeSalePurePriceDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwWholeSalePurePriceDto = blLwWholeSalePurePriceAction.findByPrimaryKey(dbManager,voltLevel, comcode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwWholeSalePurePriceDto;
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
        BLLwWholeSalePurePriceAction blLwWholeSalePurePriceAction = new BLLwWholeSalePurePriceAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwWholeSalePurePriceAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwWholeSalePurePriceDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwWholeSalePurePriceAction blLwWholeSalePurePriceAction = new BLLwWholeSalePurePriceAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwWholeSalePurePriceAction.findByConditions(dbManager,conditions);
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
        BLLwWholeSalePurePriceAction blLwWholeSalePurePriceAction = new BLLwWholeSalePurePriceAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwWholeSalePurePriceAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
