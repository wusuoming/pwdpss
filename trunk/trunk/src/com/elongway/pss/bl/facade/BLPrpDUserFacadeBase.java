package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.PrpDUserDto;
import com.elongway.pss.bl.action.domain.BLPrpDUserAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWDUser-����Ա������ҵ���߼�����Facade����<br>
 */
public class BLPrpDUserFacadeBase{
    private static Logger logger = Logger.getLogger(BLPrpDUserFacadeBase.class);

    /**
     * ���캯��
     */
    public BLPrpDUserFacadeBase(){
    }

    /**
     * ����һ������
     * @param prpDUserDto prpDUserDto
     * @throws Exception
     */
    public void insert(PrpDUserDto prpDUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLPrpDUserAction blPrpDUserAction = new BLPrpDUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blPrpDUserAction.insert(dbManager,prpDUserDto);
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
     * @param operatorCode ����Ա����
     * @throws Exception
     */
    public void delete(String operatorCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLPrpDUserAction blPrpDUserAction = new BLPrpDUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blPrpDUserAction.delete(dbManager,operatorCode);
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
        BLPrpDUserAction blPrpDUserAction = new BLPrpDUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blPrpDUserAction.deleteByConditions(dbManager,conditions);
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
     * @param prpDUserDto prpDUserDto
     * @throws Exception
     */
    public void update(PrpDUserDto prpDUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLPrpDUserAction blPrpDUserAction = new BLPrpDUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blPrpDUserAction.update(dbManager,prpDUserDto);
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
     * @param operatorCode ����Ա����
     * @return prpDUserDto prpDUserDto
     * @throws Exception
     */
    public PrpDUserDto findByPrimaryKey(String operatorCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLPrpDUserAction blPrpDUserAction = new BLPrpDUserAction();
        //����DTO
        PrpDUserDto prpDUserDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            prpDUserDto = blPrpDUserAction.findByPrimaryKey(dbManager,operatorCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return prpDUserDto;
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
        BLPrpDUserAction blPrpDUserAction = new BLPrpDUserAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blPrpDUserAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����prpDUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLPrpDUserAction blPrpDUserAction = new BLPrpDUserAction();
        try{
            dbManager.open("pssDataSource");
            collection = blPrpDUserAction.findByConditions(dbManager,conditions);
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
        BLPrpDUserAction blPrpDUserAction = new BLPrpDUserAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blPrpDUserAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
