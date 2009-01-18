package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCompanyDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADCompany;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADCompany��ҵ���߼�������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADCompanyActionBase{
    private static Logger logger = Logger.getLogger(BLIADCompanyActionBase.class);

    /**
     * ���캯��
     */
    public BLIADCompanyActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IADCompanyDto iADCompanyDto)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //�����¼
        dbIADCompany.insert(iADCompanyDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param companyCode CompanyCode
     * @param areaCode AreaCode
     * @throws Exception
     */
    public void delete(DBManager dbManager,String companyCode,String areaCode)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //ɾ����¼
        dbIADCompany.delete(companyCode, areaCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //������ɾ����¼
        dbIADCompany.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IADCompanyDto iADCompanyDto)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //���¼�¼
        dbIADCompany.update(iADCompanyDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param companyCode CompanyCode
     * @param areaCode AreaCode
     * @return iADCompanyDto iADCompanyDto
     * @throws Exception
     */
    public IADCompanyDto findByPrimaryKey(DBManager dbManager,String companyCode,String areaCode)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        //����DTO
        IADCompanyDto iADCompanyDto = null;
        //��ѯ����,��ֵ��DTO
        iADCompanyDto = dbIADCompany.findByPrimaryKey(companyCode, areaCode);
        return iADCompanyDto;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @param pageNo ҳ��
     * @param rowsPerPage ÿҳ������
     * @return PageRecord ��ѯ��һҳ�Ľ��
     * @throws Exception
     */
    public PageRecord findByConditions(DBManager dbManager,String conditions,int pageNo,int rowsPerPage)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADCompany.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIADCompany.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����iADCompanyDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIADCompany.findByConditions(conditions);
        return collection;
    }

    /**
     * ��ѯ����ģ����ѯ�����ļ�¼��
     * @param dbManager DB������
     * @param conditions ģ����ѯ����
     * @return ����ģ����ѯ�����ļ�¼��
     * @throws Exception
     */
    public int getCount(DBManager dbManager,String conditions) 
        throws Exception{
        DBIADCompany dbIADCompany = new DBIADCompany(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADCompany.getCount(conditions);
        return count;
    }
}
