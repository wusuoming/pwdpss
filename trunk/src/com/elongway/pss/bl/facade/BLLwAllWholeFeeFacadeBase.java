package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwAllWholeFeeDto;
import com.elongway.pss.bl.action.domain.BLLwAllWholeFeeAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwAllWholeFee-�����ܷ��ñ��ҵ���߼�����Facade����<br>
 */
public class BLLwAllWholeFeeFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwAllWholeFeeFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwAllWholeFeeFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public void insert(LwAllWholeFeeDto lwAllWholeFeeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAllWholeFeeAction blLwAllWholeFeeAction = new BLLwAllWholeFeeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwAllWholeFeeAction.insert(dbManager,lwAllWholeFeeDto);
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
     * @param company ���۹�˾
     * @param inputdate ����
     * @throws Exception
     */
    public void delete(String company,String inputdate)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAllWholeFeeAction blLwAllWholeFeeAction = new BLLwAllWholeFeeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwAllWholeFeeAction.delete(dbManager,company, inputdate);
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
        BLLwAllWholeFeeAction blLwAllWholeFeeAction = new BLLwAllWholeFeeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwAllWholeFeeAction.deleteByConditions(dbManager,conditions);
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
     * @param lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public void update(LwAllWholeFeeDto lwAllWholeFeeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAllWholeFeeAction blLwAllWholeFeeAction = new BLLwAllWholeFeeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwAllWholeFeeAction.update(dbManager,lwAllWholeFeeDto);
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
     * @param company ���۹�˾
     * @param inputdate ����
     * @return lwAllWholeFeeDto lwAllWholeFeeDto
     * @throws Exception
     */
    public LwAllWholeFeeDto findByPrimaryKey(String company,String inputdate)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwAllWholeFeeAction blLwAllWholeFeeAction = new BLLwAllWholeFeeAction();
        //����DTO
        LwAllWholeFeeDto lwAllWholeFeeDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwAllWholeFeeDto = blLwAllWholeFeeAction.findByPrimaryKey(dbManager,company, inputdate);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwAllWholeFeeDto;
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
        BLLwAllWholeFeeAction blLwAllWholeFeeAction = new BLLwAllWholeFeeAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwAllWholeFeeAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwAllWholeFeeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwAllWholeFeeAction blLwAllWholeFeeAction = new BLLwAllWholeFeeAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwAllWholeFeeAction.findByConditions(dbManager,conditions);
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
        BLLwAllWholeFeeAction blLwAllWholeFeeAction = new BLLwAllWholeFeeAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwAllWholeFeeAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
