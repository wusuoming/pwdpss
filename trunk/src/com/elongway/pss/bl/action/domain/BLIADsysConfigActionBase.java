package com.elongway.pss.bl.action.domain;

import java.util.*;

import com.elongway.pss.dto.domain.IADsysConfigDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADsysConfig;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADsysConfig��ҵ���߼�������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADsysConfigActionBase{
    private static Logger logger = Logger.getLogger(BLIADsysConfigActionBase.class);

    /**
     * ���캯��
     */
    public BLIADsysConfigActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IADsysConfigDto iADsysConfigDto)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //�����¼
        dbIADsysConfig.insert(iADsysConfigDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @throws Exception
     */
    public void delete(DBManager dbManager,String parameterCode,String parameterType,String companyCode)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //ɾ����¼
        dbIADsysConfig.delete(parameterCode, parameterType, companyCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //������ɾ����¼
        dbIADsysConfig.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IADsysConfigDto iADsysConfigDto)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //���¼�¼
        dbIADsysConfig.update(iADsysConfigDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param parameterCode ParameterCode
     * @param parameterType ParameterType
     * @param companyCode CompanyCode
     * @return iADsysConfigDto iADsysConfigDto
     * @throws Exception
     */
    public IADsysConfigDto findByPrimaryKey(DBManager dbManager,String parameterCode,String parameterType,String companyCode)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        //����DTO
        IADsysConfigDto iADsysConfigDto = null;
        //��ѯ����,��ֵ��DTO
        iADsysConfigDto = dbIADsysConfig.findByPrimaryKey(parameterCode, parameterType, companyCode);
        return iADsysConfigDto;
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
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADsysConfig.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIADsysConfig.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����iADsysConfigDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIADsysConfig.findByConditions(conditions);
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
        DBIADsysConfig dbIADsysConfig = new DBIADsysConfig(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADsysConfig.getCount(conditions);
        return count;
    }
}
