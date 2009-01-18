package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwUserLineDto;
import com.elongway.pss.bl.action.domain.BLLwUserLineAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWUserLine-�û���·���ձ��ҵ���߼�����Facade����<br>
 */
public class BLLwUserLineFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwUserLineFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwUserLineFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public void insert(LwUserLineDto lwUserLineDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwUserLineAction blLwUserLineAction = new BLLwUserLineAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwUserLineAction.insert(dbManager,lwUserLineDto);
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
     * @param lineCode ��·����
     * @throws Exception
     */
    public void delete(String userNo,String lineCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwUserLineAction blLwUserLineAction = new BLLwUserLineAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwUserLineAction.delete(dbManager,userNo, lineCode);
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
        BLLwUserLineAction blLwUserLineAction = new BLLwUserLineAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwUserLineAction.deleteByConditions(dbManager,conditions);
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
     * @param lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public void update(LwUserLineDto lwUserLineDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwUserLineAction blLwUserLineAction = new BLLwUserLineAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwUserLineAction.update(dbManager,lwUserLineDto);
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
     * @param lineCode ��·����
     * @return lwUserLineDto lwUserLineDto
     * @throws Exception
     */
    public LwUserLineDto findByPrimaryKey(String userNo,String lineCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwUserLineAction blLwUserLineAction = new BLLwUserLineAction();
        //����DTO
        LwUserLineDto lwUserLineDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwUserLineDto = blLwUserLineAction.findByPrimaryKey(dbManager,userNo, lineCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwUserLineDto;
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
        BLLwUserLineAction blLwUserLineAction = new BLLwUserLineAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwUserLineAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwUserLineDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwUserLineAction blLwUserLineAction = new BLLwUserLineAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwUserLineAction.findByConditions(dbManager,conditions);
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
        BLLwUserLineAction blLwUserLineAction = new BLLwUserLineAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwUserLineAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
