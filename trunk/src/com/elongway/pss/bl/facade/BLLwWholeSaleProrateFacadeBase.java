package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwWholeSaleProrateDto;
import com.elongway.pss.bl.action.domain.BLLwWholeSaleProrateAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWWholeSaleProrate-���۱�����̯���ҵ���߼�����Facade����<br>
 */
public class BLLwWholeSaleProrateFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwWholeSaleProrateFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwWholeSaleProrateFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public void insert(LwWholeSaleProrateDto lwWholeSaleProrateDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleProrateAction blLwWholeSaleProrateAction = new BLLwWholeSaleProrateAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwWholeSaleProrateAction.insert(dbManager,lwWholeSaleProrateDto);
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
     * @param voltLevel ��ѹ�ȼ�
     * @throws Exception
     */
    public void delete(String comCode,String voltLevel)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleProrateAction blLwWholeSaleProrateAction = new BLLwWholeSaleProrateAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwWholeSaleProrateAction.delete(dbManager,comCode, voltLevel);
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
        BLLwWholeSaleProrateAction blLwWholeSaleProrateAction = new BLLwWholeSaleProrateAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwWholeSaleProrateAction.deleteByConditions(dbManager,conditions);
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
     * @param lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public void update(LwWholeSaleProrateDto lwWholeSaleProrateDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleProrateAction blLwWholeSaleProrateAction = new BLLwWholeSaleProrateAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwWholeSaleProrateAction.update(dbManager,lwWholeSaleProrateDto);
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
     * @param voltLevel ��ѹ�ȼ�
     * @return lwWholeSaleProrateDto lwWholeSaleProrateDto
     * @throws Exception
     */
    public LwWholeSaleProrateDto findByPrimaryKey(String comCode,String voltLevel)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwWholeSaleProrateAction blLwWholeSaleProrateAction = new BLLwWholeSaleProrateAction();
        //����DTO
        LwWholeSaleProrateDto lwWholeSaleProrateDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwWholeSaleProrateDto = blLwWholeSaleProrateAction.findByPrimaryKey(dbManager,comCode, voltLevel);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwWholeSaleProrateDto;
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
        BLLwWholeSaleProrateAction blLwWholeSaleProrateAction = new BLLwWholeSaleProrateAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwWholeSaleProrateAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwWholeSaleProrateDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwWholeSaleProrateAction blLwWholeSaleProrateAction = new BLLwWholeSaleProrateAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwWholeSaleProrateAction.findByConditions(dbManager,conditions);
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
        BLLwWholeSaleProrateAction blLwWholeSaleProrateAction = new BLLwWholeSaleProrateAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwWholeSaleProrateAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
