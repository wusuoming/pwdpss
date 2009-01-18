package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IAContactDto;
import com.elongway.pss.bl.action.domain.BLIAContactAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IAContact��ҵ���߼�����Facade����<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIAContactFacadeBase{
    private static Logger logger = Logger.getLogger(BLIAContactFacadeBase.class);

    /**
     * ���캯��
     */
    public BLIAContactFacadeBase(){
    }

    /**
     * ����һ������
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void insert(IAContactDto iAContactDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blIAContactAction.insert(dbManager,iAContactDto);
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
     * @param contactNo ContactNo
     * @throws Exception
     */
    public void delete(String contactNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blIAContactAction.delete(dbManager,contactNo);
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
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blIAContactAction.deleteByConditions(dbManager,conditions);
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
     * @param iAContactDto iAContactDto
     * @throws Exception
     */
    public void update(IAContactDto iAContactDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blIAContactAction.update(dbManager,iAContactDto);
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
     * @param contactNo ContactNo
     * @return iAContactDto iAContactDto
     * @throws Exception
     */
    public IAContactDto findByPrimaryKey(String contactNo)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        //����DTO
        IAContactDto iAContactDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            iAContactDto = blIAContactAction.findByPrimaryKey(dbManager,contactNo);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return iAContactDto;
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
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blIAContactAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����iAContactDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            collection = blIAContactAction.findByConditions(dbManager,conditions);
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
        BLIAContactAction blIAContactAction = new BLIAContactAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blIAContactAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
