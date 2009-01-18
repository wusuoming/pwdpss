package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwBookUserDto;
import com.elongway.pss.bl.action.domain.BLLwBookUserAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LwBookUser-���û����ձ��ҵ���߼�����Facade����<br>
 */
public class BLLwBookUserFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwBookUserFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwBookUserFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public void insert(LwBookUserDto lwBookUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwBookUserAction blLwBookUserAction = new BLLwBookUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwBookUserAction.insert(dbManager,lwBookUserDto);
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
     * @param bookNo ����
     * @param userNo �û�����
     * @throws Exception
     */
    public void delete(String bookNo,String userNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwBookUserAction blLwBookUserAction = new BLLwBookUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwBookUserAction.delete(dbManager,bookNo, userNo);
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
        BLLwBookUserAction blLwBookUserAction = new BLLwBookUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwBookUserAction.deleteByConditions(dbManager,conditions);
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
     * @param lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public void update(LwBookUserDto lwBookUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwBookUserAction blLwBookUserAction = new BLLwBookUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwBookUserAction.update(dbManager,lwBookUserDto);
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
     * @param bookNo ����
     * @param userNo �û�����
     * @return lwBookUserDto lwBookUserDto
     * @throws Exception
     */
    public LwBookUserDto findByPrimaryKey(String bookNo,String userNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwBookUserAction blLwBookUserAction = new BLLwBookUserAction();
        //����DTO
        LwBookUserDto lwBookUserDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwBookUserDto = blLwBookUserAction.findByPrimaryKey(dbManager,bookNo, userNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwBookUserDto;
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
        BLLwBookUserAction blLwBookUserAction = new BLLwBookUserAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwBookUserAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwBookUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwBookUserAction blLwBookUserAction = new BLLwBookUserAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwBookUserAction.findByConditions(dbManager,conditions);
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
        BLLwBookUserAction blLwBookUserAction = new BLLwBookUserAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwBookUserAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
