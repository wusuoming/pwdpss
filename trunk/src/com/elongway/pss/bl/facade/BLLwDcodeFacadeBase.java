package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwDcodeDto;
import com.elongway.pss.bl.action.domain.BLLwDcodeAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwDcode-����������ҵ���߼�����Facade����<br>
 */
public class BLLwDcodeFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwDcodeFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwDcodeFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public void insert(LwDcodeDto lwDcodeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcodeAction blLwDcodeAction = new BLLwDcodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwDcodeAction.insert(dbManager,lwDcodeDto);
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
     * @param codeType �ӿڴ�������
     * @param codeCode ����
     * @throws Exception
     */
    public void delete(String codeType,String codeCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcodeAction blLwDcodeAction = new BLLwDcodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwDcodeAction.delete(dbManager,codeType, codeCode);
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
        BLLwDcodeAction blLwDcodeAction = new BLLwDcodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwDcodeAction.deleteByConditions(dbManager,conditions);
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
     * @param lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public void update(LwDcodeDto lwDcodeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcodeAction blLwDcodeAction = new BLLwDcodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwDcodeAction.update(dbManager,lwDcodeDto);
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
     * @param codeType �ӿڴ�������
     * @param codeCode ����
     * @return lwDcodeDto lwDcodeDto
     * @throws Exception
     */
    public LwDcodeDto findByPrimaryKey(String codeType,String codeCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwDcodeAction blLwDcodeAction = new BLLwDcodeAction();
        //����DTO
        LwDcodeDto lwDcodeDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwDcodeDto = blLwDcodeAction.findByPrimaryKey(dbManager,codeType, codeCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwDcodeDto;
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
        BLLwDcodeAction blLwDcodeAction = new BLLwDcodeAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwDcodeAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwDcodeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwDcodeAction blLwDcodeAction = new BLLwDcodeAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwDcodeAction.findByConditions(dbManager,conditions);
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
        BLLwDcodeAction blLwDcodeAction = new BLLwDcodeAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwDcodeAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
