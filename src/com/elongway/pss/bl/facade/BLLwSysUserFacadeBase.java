package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.LwSysUserDto;
import com.elongway.pss.bl.action.domain.BLLwSysUserAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����LWSysUser-��¼�û����ҵ���߼�����Facade����<br>
 */
public class BLLwSysUserFacadeBase{
    private static Logger logger = Logger.getLogger(BLLwSysUserFacadeBase.class);

    /**
     * ���캯��
     */
    public BLLwSysUserFacadeBase(){
    }

    /**
     * ����һ������
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void insert(LwSysUserDto lwSysUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blLwSysUserAction.insert(dbManager,lwSysUserDto);
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
     * @param userCode �û�����
     * @throws Exception
     */
    public void delete(String userCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blLwSysUserAction.delete(dbManager,userCode);
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
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blLwSysUserAction.deleteByConditions(dbManager,conditions);
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
     * @param lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public void update(LwSysUserDto lwSysUserDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blLwSysUserAction.update(dbManager,lwSysUserDto);
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
     * @param userCode �û�����
     * @return lwSysUserDto lwSysUserDto
     * @throws Exception
     */
    public LwSysUserDto findByPrimaryKey(String userCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        //����DTO
        LwSysUserDto lwSysUserDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            lwSysUserDto = blLwSysUserAction.findByPrimaryKey(dbManager,userCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return lwSysUserDto;
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
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blLwSysUserAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����lwSysUserDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            collection = blLwSysUserAction.findByConditions(dbManager,conditions);
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
        BLLwSysUserAction blLwSysUserAction = new BLLwSysUserAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blLwSysUserAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
