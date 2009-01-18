package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.SubjoinFeeDto;
import com.elongway.pss.bl.action.domain.BLSubjoinFeeAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����subjoinFee-���ӷ��ñ��ҵ���߼�����Facade����<br>
 */
public class BLSubjoinFeeFacadeBase{
    private static Logger logger = Logger.getLogger(BLSubjoinFeeFacadeBase.class);

    /**
     * ���캯��
     */
    public BLSubjoinFeeFacadeBase(){
    }

    /**
     * ����һ������
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void insert(SubjoinFeeDto subjoinFeeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLSubjoinFeeAction blSubjoinFeeAction = new BLSubjoinFeeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blSubjoinFeeAction.insert(dbManager,subjoinFeeDto);
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
     * @param powerType �õ����
     * @throws Exception
     */
    public void delete(String powerType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLSubjoinFeeAction blSubjoinFeeAction = new BLSubjoinFeeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blSubjoinFeeAction.delete(dbManager,powerType);
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
        BLSubjoinFeeAction blSubjoinFeeAction = new BLSubjoinFeeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blSubjoinFeeAction.deleteByConditions(dbManager,conditions);
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
     * @param subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public void update(SubjoinFeeDto subjoinFeeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLSubjoinFeeAction blSubjoinFeeAction = new BLSubjoinFeeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blSubjoinFeeAction.update(dbManager,subjoinFeeDto);
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
     * @param powerType �õ����
     * @return subjoinFeeDto subjoinFeeDto
     * @throws Exception
     */
    public SubjoinFeeDto findByPrimaryKey(String powerType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLSubjoinFeeAction blSubjoinFeeAction = new BLSubjoinFeeAction();
        //����DTO
        SubjoinFeeDto subjoinFeeDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            subjoinFeeDto = blSubjoinFeeAction.findByPrimaryKey(dbManager,powerType);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return subjoinFeeDto;
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
        BLSubjoinFeeAction blSubjoinFeeAction = new BLSubjoinFeeAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blSubjoinFeeAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����subjoinFeeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLSubjoinFeeAction blSubjoinFeeAction = new BLSubjoinFeeAction();
        try{
            dbManager.open("pssDataSource");
            collection = blSubjoinFeeAction.findByConditions(dbManager,conditions);
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
        BLSubjoinFeeAction blSubjoinFeeAction = new BLSubjoinFeeAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blSubjoinFeeAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
