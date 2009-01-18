package com.elongway.pss.bl.action.domain;

import java.util.*;
import com.sinosoft.sysframework.log.*;
import com.sinosoft.sysframework.common.util.*;
import com.sinosoft.sysframework.common.datatype.*;
import com.sinosoft.sysframework.reference.DBManager;
import com.elongway.pss.dto.domain.IADCodeDto;
import com.elongway.pss.resource.dtofactory.domain.DBIADCode;

/**
 * �����ﾯ�棺���ļ��������ֹ��޸ģ�������ʹ��JToolpad���ɣ�<br>
 * ����IADCode��ҵ���߼�������<br>
 * ������ JToolpad(1.5.1) Vendor:zhouxianli1978@msn.com
 */
public class BLIADCodeActionBase{
    private static Logger logger = Logger.getLogger(BLIADCodeActionBase.class);

    /**
     * ���캯��
     */
    public BLIADCodeActionBase(){
    }

    /**
     * ����һ������
     * @param dbManager DB������
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void insert(DBManager dbManager,IADCodeDto iADCodeDto)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //�����¼
        dbIADCode.insert(iADCodeDto);
    }

    /**
     * ������ɾ��һ������
     * @param dbManager DB������
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @throws Exception
     */
    public void delete(DBManager dbManager,String codeType,String codeCode)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //ɾ����¼
        dbIADCode.delete(codeType, codeCode);
    }

    /**
     * ������ɾ������
     * @param dbManager DB������
     * @param conditions ɾ������
     * @throws Exception
     */
    public void deleteByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //������ɾ����¼
        dbIADCode.deleteByConditions(conditions);
    }

    /**
     * ����������һ������(���������޷����)
     * @param dbManager DB������
     * @param iADCodeDto iADCodeDto
     * @throws Exception
     */
    public void update(DBManager dbManager,IADCodeDto iADCodeDto)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //���¼�¼
        dbIADCode.update(iADCodeDto);
    }

    /**
     * ����������һ������
     * @param dbManager DB������
     * @param codeType CodeType
     * @param codeCode CodeCode
     * @return iADCodeDto iADCodeDto
     * @throws Exception
     */
    public IADCodeDto findByPrimaryKey(DBManager dbManager,String codeType,String codeCode)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        //����DTO
        IADCodeDto iADCodeDto = null;
        //��ѯ����,��ֵ��DTO
        iADCodeDto = dbIADCode.findByPrimaryKey(codeType, codeCode);
        return iADCodeDto;
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
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADCode.getCount(SqlUtils.getWherePartForGetCount(conditions));
        collection = dbIADCode.findByConditions(conditions,pageNo,rowsPerPage);
        PageRecord pageRecord = new PageRecord(count,pageNo,1,rowsPerPage,collection);
        return pageRecord;
    }

    /**
     * ��������ѯ��������
     * @param dbManager DB������
     * @param conditions ��ѯ����
     * @return Collection ����iADCodeDto�ļ���
     * @throws Exception
     */
    public Collection findByConditions(DBManager dbManager,String conditions)
            throws Exception{
        DBIADCode dbIADCode = new DBIADCode(dbManager);
        Collection collection = new ArrayList();

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        collection = dbIADCode.findByConditions(conditions);
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
        DBIADCode dbIADCode = new DBIADCode(dbManager);

        if(conditions.trim().length()==0){
            conditions = "1=1";
        }

        int count = dbIADCode.getCount(conditions);
        return count;
    }
}
