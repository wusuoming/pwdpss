package com.elongway.pss.bl.facade;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCompanyDto;
import com.elongway.pss.bl.action.domain.BLIADCompanyAction;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADCompany��ҵ���߼�����Facade����<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADCompanyFacadeBase{
    private static Logger logger = Logger.getLogger(BLIADCompanyFacadeBase.class);

    /**
     * ���캯��
     */
    public BLIADCompanyFacadeBase(){
    }

    /**
     * ����һ������
     * @param iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public void insert(IADCompanyDto iADCompanyDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADCompanyAction blIADCompanyAction = new BLIADCompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //�����¼
            blIADCompanyAction.insert(dbManager,iADCompanyDto);
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
     * @param companyCode CompanyCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(String companyCode,String areaCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADCompanyAction blIADCompanyAction = new BLIADCompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //ɾ����¼
            blIADCompanyAction.delete(dbManager,companyCode, areaCode);
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
        BLIADCompanyAction blIADCompanyAction = new BLIADCompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //������ɾ����¼
            blIADCompanyAction.deleteByConditions(dbManager,conditions);
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
     * @param iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public void update(IADCompanyDto iADCompanyDto)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADCompanyAction blIADCompanyAction = new BLIADCompanyAction();
        try{
            dbManager.open("pssDataSource");
            dbManager.beginTransaction();
            //���¼�¼
            blIADCompanyAction.update(dbManager,iADCompanyDto);
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
     * @param companyCode CompanyCode
     * @param areaCode AreaCode
     * @return iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public IADCompanyDto findByPrimaryKey(String companyCode,String areaCode)
        throws Exception{
        DBManager dbManager = new DBManager();
        BLIADCompanyAction blIADCompanyAction = new BLIADCompanyAction();
        //����DTO
        IADCompanyDto iADCompanyDto = null;
        try{
            dbManager.open("pssDataSource");
            //��ѯ����,��ֵ��DTO
            iADCompanyDto = blIADCompanyAction.findByPrimaryKey(dbManager,companyCode, areaCode);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return iADCompanyDto;
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
        BLIADCompanyAction blIADCompanyAction = new BLIADCompanyAction();
        try{
            dbManager.open("pssDataSource");
            pageRecord = blIADCompanyAction.findByConditions(dbManager,conditions,pageNo,rowsPerPage);
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
     * @return Collection ����iADCompanyDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(String conditions)
        throws Exception{
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        DBManager dbManager = new DBManager();
        BLIADCompanyAction blIADCompanyAction = new BLIADCompanyAction();
        try{
            dbManager.open("pssDataSource");
            collection = blIADCompanyAction.findByConditions(dbManager,conditions);
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
        BLIADCompanyAction blIADCompanyAction = new BLIADCompanyAction();
        try{
            dbManager.open("pssDataSource");
            rowCount = blIADCompanyAction.getCount(dbManager,conditions);
        }catch(Exception exception){
            throw exception;
        }finally{
            dbManager.close();
        }
        return rowCount;
    }
}
