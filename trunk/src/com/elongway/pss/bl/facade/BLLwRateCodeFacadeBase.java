package com.elongway.pss.bl.facade;

import java.util.ArrayList;
import java.util.Collection;

import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwProrateDto;
import com.elongway.pss.dto.domain.LwRateCodeDto;
import com.elongway.pss.bl.action.domain.BLLwRateCodeAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWRateCode-������ά�����ҵ���߼�����Facade����<br>
 */
public class BLLwRateCodeFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwRateCodeFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwRateCodeFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public void insert(LwRateCodeDto lwRateCodeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwRateCodeAction blLwRateCodeAction = new BLLwRateCodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwRateCodeAction.insert(dbManager,lwRateCodeDto);
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
     * @param powerFactor ��������
     * @param suppleType �������ʹ���
     * @throws Exception
     */
    public void delete(String powerFactor,String suppleType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwRateCodeAction blLwRateCodeAction = new BLLwRateCodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwRateCodeAction.delete(dbManager,powerFactor, suppleType);
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
        BLLwRateCodeAction blLwRateCodeAction = new BLLwRateCodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwRateCodeAction.deleteByConditions(dbManager,conditions);
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
     * @param lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public void update(LwRateCodeDto lwRateCodeDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwRateCodeAction blLwRateCodeAction = new BLLwRateCodeAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwRateCodeAction.update(dbManager,lwRateCodeDto);
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
     * @param powerFactor ��������
     * @param suppleType �������ʹ���
     * @return lwRateCodeDto lwRateCodeDto
     * @throws Exception
     */
    public LwRateCodeDto findByPrimaryKey(String powerFactor,String suppleType)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwRateCodeAction blLwRateCodeAction = new BLLwRateCodeAction();
        //����DTO
        LwRateCodeDto lwRateCodeDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwRateCodeDto = blLwRateCodeAction.findByPrimaryKey(dbManager,powerFactor, suppleType);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwRateCodeDto;
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
        BLLwRateCodeAction blLwRateCodeAction = new BLLwRateCodeAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwRateCodeAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwRateCodeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwRateCodeAction blLwRateCodeAction = new BLLwRateCodeAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwRateCodeAction.findByConditions(dbManager,conditions);
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
        BLLwRateCodeAction blLwRateCodeAction = new BLLwRateCodeAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwRateCodeAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
