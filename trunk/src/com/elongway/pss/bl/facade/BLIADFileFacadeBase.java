package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADFileDto;
import com.elongway.pss.bl.action.domain.BLIADFileAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADFile��ҵ���߼�����Facade����<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADFileFacadeBase{
    private static Logger logger = Logger.getLogger(BLIADFileFacadeBase.class);

    /**
     * ���캯��
     */
    public BLIADFileFacadeBase(){
    }

    /**
     * ����һ������
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void insert(IADFileDto iADFileDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADFileAction blIADFileAction = new BLIADFileAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blIADFileAction.insert(dbManager,iADFileDto);
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
     * @param fileUuid FileUuid
     * @throws Exception
     */
    public void delete(String contactNo,String fileUuid)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADFileAction blIADFileAction = new BLIADFileAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blIADFileAction.delete(dbManager,contactNo, fileUuid);
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
        BLIADFileAction blIADFileAction = new BLIADFileAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blIADFileAction.deleteByConditions(dbManager,conditions);
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
     * @param iADFileDto iADFileDto
     * @throws Exception
     */
    public void update(IADFileDto iADFileDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADFileAction blIADFileAction = new BLIADFileAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blIADFileAction.update(dbManager,iADFileDto);
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
     * @param fileUuid FileUuid
     * @return iADFileDto iADFileDto
     * @throws Exception
     */
    public IADFileDto findByPrimaryKey(String contactNo,String fileUuid)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADFileAction blIADFileAction = new BLIADFileAction();
        //����DTO
        IADFileDto iADFileDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            iADFileDto = blIADFileAction.findByPrimaryKey(dbManager,contactNo, fileUuid);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return iADFileDto;
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
        BLIADFileAction blIADFileAction = new BLIADFileAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blIADFileAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����iADFileDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIADFileAction blIADFileAction = new BLIADFileAction();
        try{
            dbManager.open("pssDataSource");
            collection = blIADFileAction.findByConditions(dbManager,conditions);
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
        BLIADFileAction blIADFileAction = new BLIADFileAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blIADFileAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
