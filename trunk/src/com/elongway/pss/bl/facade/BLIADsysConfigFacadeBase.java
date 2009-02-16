package com.elongway.pss.bl.facade;

import java.util.*;

import com.elongway.pss.bl.action.domain.BLIADsysConfigAction;
import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.util.*;
/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADsysConfig��ҵ���߼�����Facade����<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADsysConfigFacadeBase{
    private static Logger logger = Logger.getLogger(BLIADsysConfigFacadeBase.class);

    /**
     * ���캯��
     */
    public BLIADsysConfigFacadeBase(){
    }

    /**
     * ����һ������
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void insert(IADsysConfigDto iADsysConfigDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blIADsysConfigAction.insert(dbManager,iADsysConfigDto);
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
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @throws Exception
     */
    public void delete(String parameterCode,String parameterType,String companyCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blIADsysConfigAction.delete(dbManager,parameterCode,parameterType,companyCode);
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
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blIADsysConfigAction.deleteByConditions(dbManager,conditions);
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
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void update(IADsysConfigDto iADsysConfigDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blIADsysConfigAction.update(dbManager,iADsysConfigDto);
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
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @return iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public IADsysConfigDto findByPrimaryKey(String parameterCode,String parameterType,String companyCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        //����DTO
        IADsysConfigDto iADsysConfigDto = null;
        try{
        	dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            iADsysConfigDto = blIADsysConfigAction.findByPrimaryKey(dbManager,parameterCode, parameterType, companyCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return iADsysConfigDto;
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
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            pageRecord = blIADsysConfigAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����iADsysConfigDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            collection = blIADsysConfigAction.findByConditions(dbManager,conditions);
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
        BLIADsysConfigAction blIADsysConfigAction = new BLIADsysConfigAction();
        try{
        	dbManager.open("pssDataSource");
            rowCount = blIADsysConfigAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
