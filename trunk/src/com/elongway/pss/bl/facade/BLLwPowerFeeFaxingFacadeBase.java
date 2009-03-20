package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwPowerFeeFaxingDto;
import com.elongway.pss.bl.action.domain.BLLwPowerFeeFaxingAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWPowerFeeFaxing-��ѵ������б��ҵ���߼�����Facade����<br>
 */
public class BLLwPowerFeeFaxingFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwPowerFeeFaxingFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwPowerFeeFaxingFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void insert(LwPowerFeeFaxingDto lwPowerFeeFaxingDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerFeeFaxingAction blLwPowerFeeFaxingAction = new BLLwPowerFeeFaxingAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwPowerFeeFaxingAction.insert(dbManager,lwPowerFeeFaxingDto);
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
     * @param userNo ����
     * @param statMonth ͳ������
     * @param statStyle ͳ�Ʒ�ʽ
     * @throws Exception
     */
    public void delete(String userNo,String statMonth,String statStyle)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerFeeFaxingAction blLwPowerFeeFaxingAction = new BLLwPowerFeeFaxingAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwPowerFeeFaxingAction.delete(dbManager,userNo, statMonth, statStyle);
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
        BLLwPowerFeeFaxingAction blLwPowerFeeFaxingAction = new BLLwPowerFeeFaxingAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwPowerFeeFaxingAction.deleteByConditions(dbManager,conditions);
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
     * @param lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public void update(LwPowerFeeFaxingDto lwPowerFeeFaxingDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerFeeFaxingAction blLwPowerFeeFaxingAction = new BLLwPowerFeeFaxingAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwPowerFeeFaxingAction.update(dbManager,lwPowerFeeFaxingDto);
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
     * @param userNo ����
     * @param statMonth ͳ������
     * @param statStyle ͳ�Ʒ�ʽ
     * @return lwPowerFeeFaxingDto lwPowerFeeFaxingDto
     * @throws Exception
     */
    public LwPowerFeeFaxingDto findByPrimaryKey(String userNo,String statMonth,String statStyle)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwPowerFeeFaxingAction blLwPowerFeeFaxingAction = new BLLwPowerFeeFaxingAction();
        //����DTO
        LwPowerFeeFaxingDto lwPowerFeeFaxingDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwPowerFeeFaxingDto = blLwPowerFeeFaxingAction.findByPrimaryKey(dbManager,userNo, statMonth, statStyle);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwPowerFeeFaxingDto;
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
        BLLwPowerFeeFaxingAction blLwPowerFeeFaxingAction = new BLLwPowerFeeFaxingAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwPowerFeeFaxingAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwPowerFeeFaxingDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwPowerFeeFaxingAction blLwPowerFeeFaxingAction = new BLLwPowerFeeFaxingAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwPowerFeeFaxingAction.findByConditions(dbManager,conditions);
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
        BLLwPowerFeeFaxingAction blLwPowerFeeFaxingAction = new BLLwPowerFeeFaxingAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwPowerFeeFaxingAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
